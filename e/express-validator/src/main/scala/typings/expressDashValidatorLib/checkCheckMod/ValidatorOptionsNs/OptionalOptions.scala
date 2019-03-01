package typings
package expressDashValidatorLib.checkCheckMod.ValidatorOptionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionalOptions extends js.Object {
  var checkFalsy: js.UndefOr[scala.Boolean] = js.undefined
  var nullable: js.UndefOr[scala.Boolean] = js.undefined
}

object OptionalOptions {
  @scala.inline
  def apply(
    checkFalsy: js.UndefOr[scala.Boolean] = js.undefined,
    nullable: js.UndefOr[scala.Boolean] = js.undefined
  ): OptionalOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checkFalsy)) __obj.updateDynamic("checkFalsy")(checkFalsy)
    if (!js.isUndefined(nullable)) __obj.updateDynamic("nullable")(nullable)
    __obj.asInstanceOf[OptionalOptions]
  }
}

