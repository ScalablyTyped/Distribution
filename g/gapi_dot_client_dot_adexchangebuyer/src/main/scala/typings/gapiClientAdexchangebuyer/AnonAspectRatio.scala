package typings.gapiClientAdexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAspectRatio extends js.Object {
  /** The type of aspect ratio. Leave this field blank to match all aspect ratios. */
  var aspectRatio: js.UndefOr[String] = js.undefined
  /** The minimum player height in pixels. Leave this field blank to match any player height. */
  var minHeight: js.UndefOr[String] = js.undefined
  /** The minimum player width in pixels. Leave this field blank to match any player width. */
  var minWidth: js.UndefOr[String] = js.undefined
}

object AnonAspectRatio {
  @scala.inline
  def apply(aspectRatio: String = null, minHeight: String = null, minWidth: String = null): AnonAspectRatio = {
    val __obj = js.Dynamic.literal()
    if (aspectRatio != null) __obj.updateDynamic("aspectRatio")(aspectRatio.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAspectRatio]
  }
}

