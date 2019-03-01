package typings
package expressDashValidatorLib.checkCheckMod.ValidatorOptionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * defaults to
  * {
  *    checkNull: false,
  *    checkFalsy: false
  * }
  */
trait ExistsOptions extends js.Object {
  var checkFalsy: js.UndefOr[scala.Boolean] = js.undefined
  var checkNull: js.UndefOr[scala.Boolean] = js.undefined
}

object ExistsOptions {
  @scala.inline
  def apply(
    checkFalsy: js.UndefOr[scala.Boolean] = js.undefined,
    checkNull: js.UndefOr[scala.Boolean] = js.undefined
  ): ExistsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checkFalsy)) __obj.updateDynamic("checkFalsy")(checkFalsy)
    if (!js.isUndefined(checkNull)) __obj.updateDynamic("checkNull")(checkNull)
    __obj.asInstanceOf[ExistsOptions]
  }
}

