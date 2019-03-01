package typings
package fluxLib.libFluxMixinLegacyMod.FluxMixinLegacyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var withProps: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(withProps: js.UndefOr[scala.Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(withProps)) __obj.updateDynamic("withProps")(withProps)
    __obj.asInstanceOf[Options]
  }
}

