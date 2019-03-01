package typings
package gapiDotClientDotAdexchangebuyerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AspectRatio extends js.Object {
  /** The type of aspect ratio. Leave this field blank to match all aspect ratios. */
  var aspectRatio: js.UndefOr[java.lang.String] = js.undefined
  /** The minimum player height in pixels. Leave this field blank to match any player height. */
  var minHeight: js.UndefOr[java.lang.String] = js.undefined
  /** The minimum player width in pixels. Leave this field blank to match any player width. */
  var minWidth: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AspectRatio {
  @scala.inline
  def apply(
    aspectRatio: java.lang.String = null,
    minHeight: java.lang.String = null,
    minWidth: java.lang.String = null
  ): Anon_AspectRatio = {
    val __obj = js.Dynamic.literal()
    if (aspectRatio != null) __obj.updateDynamic("aspectRatio")(aspectRatio)
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight)
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth)
    __obj.asInstanceOf[Anon_AspectRatio]
  }
}

