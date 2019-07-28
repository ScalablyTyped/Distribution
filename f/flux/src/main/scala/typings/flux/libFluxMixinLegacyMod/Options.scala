package typings.flux.libFluxMixinLegacyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var withProps: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(withProps: js.UndefOr[Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(withProps)) __obj.updateDynamic("withProps")(withProps)
    __obj.asInstanceOf[Options]
  }
}

