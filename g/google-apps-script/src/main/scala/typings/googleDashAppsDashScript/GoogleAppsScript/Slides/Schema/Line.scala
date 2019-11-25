package typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Line extends js.Object {
  var lineCategory: js.UndefOr[String] = js.undefined
  var lineProperties: js.UndefOr[LineProperties] = js.undefined
  var lineType: js.UndefOr[String] = js.undefined
}

object Line {
  @scala.inline
  def apply(lineCategory: String = null, lineProperties: LineProperties = null, lineType: String = null): Line = {
    val __obj = js.Dynamic.literal()
    if (lineCategory != null) __obj.updateDynamic("lineCategory")(lineCategory.asInstanceOf[js.Any])
    if (lineProperties != null) __obj.updateDynamic("lineProperties")(lineProperties.asInstanceOf[js.Any])
    if (lineType != null) __obj.updateDynamic("lineType")(lineType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Line]
  }
}

