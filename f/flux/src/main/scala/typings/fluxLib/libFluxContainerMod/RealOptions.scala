package typings
package fluxLib.libFluxContainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RealOptions extends js.Object {
  /** @default true */
  var pure: js.UndefOr[scala.Boolean] = js.undefined
  /** @default false */
  var withContext: js.UndefOr[scala.Boolean] = js.undefined
  /** @default false */
  var withProps: js.UndefOr[scala.Boolean] = js.undefined
}

object RealOptions {
  @scala.inline
  def apply(
    pure: js.UndefOr[scala.Boolean] = js.undefined,
    withContext: js.UndefOr[scala.Boolean] = js.undefined,
    withProps: js.UndefOr[scala.Boolean] = js.undefined
  ): RealOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(pure)) __obj.updateDynamic("pure")(pure)
    if (!js.isUndefined(withContext)) __obj.updateDynamic("withContext")(withContext)
    if (!js.isUndefined(withProps)) __obj.updateDynamic("withProps")(withProps)
    __obj.asInstanceOf[RealOptions]
  }
}

