package typings
package gapiDotClientDotVisionLib.gapiNs.clientNs.visionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Position extends js.Object {
  /** X coordinate. */
  var x: js.UndefOr[scala.Double] = js.undefined
  /** Y coordinate. */
  var y: js.UndefOr[scala.Double] = js.undefined
  /** Z coordinate (or depth). */
  var z: js.UndefOr[scala.Double] = js.undefined
}

object Position {
  @scala.inline
  def apply(
    x: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null,
    z: scala.Int | scala.Double = null
  ): Position = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (z != null) __obj.updateDynamic("z")(z.asInstanceOf[js.Any])
    __obj.asInstanceOf[Position]
  }
}

