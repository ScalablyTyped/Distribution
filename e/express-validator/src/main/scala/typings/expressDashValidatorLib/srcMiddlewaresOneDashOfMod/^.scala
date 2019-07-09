package typings
package expressDashValidatorLib.srcMiddlewaresOneDashOfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-validator/src/middlewares/one-of", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def oneOf(
    chains: js.Array[
      js.Array[expressDashValidatorLib.srcChainValidationDashChainMod.ValidationChain] | expressDashValidatorLib.srcChainValidationDashChainMod.ValidationChain
    ]
  ): expressDashValidatorLib.srcBaseMod.Middleware = js.native
  def oneOf(
    chains: js.Array[
      expressDashValidatorLib.srcChainValidationDashChainMod.ValidationChain | js.Array[expressDashValidatorLib.srcChainValidationDashChainMod.ValidationChain]
    ],
    message: OneOfCustomMessageBuilder
  ): expressDashValidatorLib.srcBaseMod.Middleware = js.native
  def oneOf(
    chains: js.Array[
      expressDashValidatorLib.srcChainValidationDashChainMod.ValidationChain | js.Array[expressDashValidatorLib.srcChainValidationDashChainMod.ValidationChain]
    ],
    message: js.Any
  ): expressDashValidatorLib.srcBaseMod.Middleware = js.native
}

