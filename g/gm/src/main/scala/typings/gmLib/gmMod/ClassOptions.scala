package typings
package gmLib.gmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassOptions extends js.Object {
  var imageMagick: js.UndefOr[scala.Boolean] = js.undefined
  var nativeAutoOrient: js.UndefOr[scala.Boolean] = js.undefined
}

object ClassOptions {
  @scala.inline
  def apply(
    imageMagick: js.UndefOr[scala.Boolean] = js.undefined,
    nativeAutoOrient: js.UndefOr[scala.Boolean] = js.undefined
  ): ClassOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(imageMagick)) __obj.updateDynamic("imageMagick")(imageMagick)
    if (!js.isUndefined(nativeAutoOrient)) __obj.updateDynamic("nativeAutoOrient")(nativeAutoOrient)
    __obj.asInstanceOf[ClassOptions]
  }
}

