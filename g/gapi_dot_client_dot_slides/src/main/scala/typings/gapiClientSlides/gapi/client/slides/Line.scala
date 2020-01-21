package typings.gapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Line extends js.Object {
  /** The properties of the line. */
  var lineProperties: js.UndefOr[LineProperties] = js.undefined
  /** The type of the line. */
  var lineType: js.UndefOr[String] = js.undefined
}

object Line {
  @scala.inline
  def apply(lineProperties: LineProperties = null, lineType: String = null): Line = {
    val __obj = js.Dynamic.literal()
    if (lineProperties != null) __obj.updateDynamic("lineProperties")(lineProperties.asInstanceOf[js.Any])
    if (lineType != null) __obj.updateDynamic("lineType")(lineType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Line]
  }
}

