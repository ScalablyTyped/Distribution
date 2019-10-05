package typings.expressDashValidator

import typings.expressDashValidator.srcBaseMod.Middleware
import typings.expressDashValidator.srcChainValidationDashChainMod.ValidationChain
import typings.expressDashValidator.srcMiddlewaresOneDashOfMod.OneOfCustomMessageBuilder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-validator/src/middlewares/one-of", JSImport.Namespace)
@js.native
object srcMiddlewaresOneDashOfMod extends js.Object {
  def oneOf(chains: js.Array[js.Array[ValidationChain] | ValidationChain]): Middleware = js.native
  def oneOf(chains: js.Array[ValidationChain | js.Array[ValidationChain]], message: js.Any): Middleware = js.native
  def oneOf(chains: js.Array[ValidationChain | js.Array[ValidationChain]], message: OneOfCustomMessageBuilder): Middleware = js.native
  type OneOfCustomMessageBuilder = js.Function1[/* options */ Anon_Req, js.Any]
}

