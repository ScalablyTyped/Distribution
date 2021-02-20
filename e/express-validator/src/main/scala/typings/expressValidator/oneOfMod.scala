package typings.expressValidator

import typings.expressValidator.anon.Req
import typings.expressValidator.baseMod.Middleware
import typings.expressValidator.validationChainMod.ValidationChain
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object oneOfMod {
  
  @JSImport("express-validator/src/middlewares/one-of", "oneOf")
  @js.native
  def oneOf(chains: js.Array[js.Array[ValidationChain] | ValidationChain]): Middleware = js.native
  @JSImport("express-validator/src/middlewares/one-of", "oneOf")
  @js.native
  def oneOf(chains: js.Array[ValidationChain | js.Array[ValidationChain]], message: js.Any): Middleware = js.native
  @JSImport("express-validator/src/middlewares/one-of", "oneOf")
  @js.native
  def oneOf(chains: js.Array[ValidationChain | js.Array[ValidationChain]], message: OneOfCustomMessageBuilder): Middleware = js.native
  
  type OneOfCustomMessageBuilder = js.Function1[/* options */ Req, js.Any]
}
