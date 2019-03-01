package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OffsetPosition extends js.Object {
  /** Offset distance from left side of an asset or a window. */
  var left: js.UndefOr[scala.Double] = js.undefined
  /** Offset distance from top side of an asset or a window. */
  var top: js.UndefOr[scala.Double] = js.undefined
}

object OffsetPosition {
  @scala.inline
  def apply(left: scala.Int | scala.Double = null, top: scala.Int | scala.Double = null): OffsetPosition = {
    val __obj = js.Dynamic.literal()
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[OffsetPosition]
  }
}

