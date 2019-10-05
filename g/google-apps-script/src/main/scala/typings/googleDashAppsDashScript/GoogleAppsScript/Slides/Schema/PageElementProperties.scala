package typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageElementProperties extends js.Object {
  var pageObjectId: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[Size] = js.undefined
  var transform: js.UndefOr[typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema.AffineTransform] = js.undefined
}

object PageElementProperties {
  @scala.inline
  def apply(
    pageObjectId: String = null,
    size: Size = null,
    transform: typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema.AffineTransform = null
  ): PageElementProperties = {
    val __obj = js.Dynamic.literal()
    if (pageObjectId != null) __obj.updateDynamic("pageObjectId")(pageObjectId)
    if (size != null) __obj.updateDynamic("size")(size)
    if (transform != null) __obj.updateDynamic("transform")(transform)
    __obj.asInstanceOf[PageElementProperties]
  }
}

