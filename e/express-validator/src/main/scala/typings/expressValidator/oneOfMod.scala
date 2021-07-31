package typings.expressValidator

import typings.expressValidator.anon.Req
import typings.expressValidator.baseMod.Middleware
import typings.expressValidator.validationChainMod.ValidationChain
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object oneOfMod {
  
  @JSImport("express-validator/src/middlewares/one-of", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def oneOf(chains: js.Array[js.Array[ValidationChain] | ValidationChain]): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("oneOf")(chains.asInstanceOf[js.Any]).asInstanceOf[Middleware]
  @scala.inline
  def oneOf(chains: js.Array[ValidationChain | js.Array[ValidationChain]], message: js.Any): Middleware = (^.asInstanceOf[js.Dynamic].applyDynamic("oneOf")(chains.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Middleware]
  @scala.inline
  def oneOf(chains: js.Array[ValidationChain | js.Array[ValidationChain]], message: OneOfCustomMessageBuilder): Middleware = (^.asInstanceOf[js.Dynamic].applyDynamic("oneOf")(chains.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Middleware]
  
  type OneOfCustomMessageBuilder = js.Function1[/* options */ Req, js.Any]
}
