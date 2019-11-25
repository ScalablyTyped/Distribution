package typings.gapiDotClientDotAdexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AspectRatio extends js.Object {
  /** The type of aspect ratio. Leave this field blank to match all aspect ratios. */
  var aspectRatio: js.UndefOr[String] = js.undefined
  /** The minimum player height in pixels. Leave this field blank to match any player height. */
  var minHeight: js.UndefOr[String] = js.undefined
  /** The minimum player width in pixels. Leave this field blank to match any player width. */
  var minWidth: js.UndefOr[String] = js.undefined
}

object Anon_AspectRatio {
  @scala.inline
  def apply(aspectRatio: String = null, minHeight: String = null, minWidth: String = null): Anon_AspectRatio = {
    val __obj = js.Dynamic.literal()
    if (aspectRatio != null) __obj.updateDynamic("aspectRatio")(aspectRatio.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AspectRatio]
  }
}

