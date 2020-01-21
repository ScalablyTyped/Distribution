package typings.expressValidator

import typings.expressValidator.baseMod.Middleware
import typings.expressValidator.validationChainMod.ValidationChain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-validator/src/middlewares/one-of", JSImport.Namespace)
@js.native
object oneOfMod extends js.Object {
  def oneOf(chains: js.Array[js.Array[ValidationChain] | ValidationChain]): Middleware = js.native
  def oneOf(chains: js.Array[ValidationChain | js.Array[ValidationChain]], message: js.Any): Middleware = js.native
  def oneOf(chains: js.Array[ValidationChain | js.Array[ValidationChain]], message: OneOfCustomMessageBuilder): Middleware = js.native
  type OneOfCustomMessageBuilder = js.Function1[/* options */ AnonReq, js.Any]
}

