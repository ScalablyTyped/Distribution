package typings
package gestaltLib.gestaltMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PulsarProps extends js.Object {
  var paused: js.UndefOr[scala.Boolean] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
}

object PulsarProps {
  @scala.inline
  def apply(paused: js.UndefOr[scala.Boolean] = js.undefined, size: scala.Int | scala.Double = null): PulsarProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(paused)) __obj.updateDynamic("paused")(paused)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[PulsarProps]
  }
}

