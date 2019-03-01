package typings
package gapiDotClientDotAdexchangebuyerLib.gapiNs.clientNs.adexchangebuyerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetingValueSize extends js.Object {
  /** The height of the creative. */
  var height: js.UndefOr[scala.Double] = js.undefined
  /** The width of the creative. */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object TargetingValueSize {
  @scala.inline
  def apply(height: scala.Int | scala.Double = null, width: scala.Int | scala.Double = null): TargetingValueSize = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetingValueSize]
  }
}

