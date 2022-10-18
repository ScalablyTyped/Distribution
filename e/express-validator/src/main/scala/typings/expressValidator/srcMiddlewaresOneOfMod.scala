package typings.expressValidator

import typings.expressValidator.anon.Req
import typings.expressValidator.anon.Run
import typings.expressValidator.srcBaseMod.Middleware
import typings.expressValidator.srcChainValidationChainMod.ValidationChain
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMiddlewaresOneOfMod {
  
  @JSImport("express-validator/src/middlewares/one-of", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def oneOf(chains: js.Array[js.Array[ValidationChain] | ValidationChain]): Middleware & Run = ^.asInstanceOf[js.Dynamic].applyDynamic("oneOf")(chains.asInstanceOf[js.Any]).asInstanceOf[Middleware & Run]
  inline def oneOf(chains: js.Array[ValidationChain | js.Array[ValidationChain]], message: Any): Middleware & Run = (^.asInstanceOf[js.Dynamic].applyDynamic("oneOf")(chains.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Middleware & Run]
  inline def oneOf(chains: js.Array[ValidationChain | js.Array[ValidationChain]], message: OneOfCustomMessageBuilder): Middleware & Run = (^.asInstanceOf[js.Dynamic].applyDynamic("oneOf")(chains.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Middleware & Run]
  
  type OneOfCustomMessageBuilder = js.Function1[/* options */ Req, Any]
}
