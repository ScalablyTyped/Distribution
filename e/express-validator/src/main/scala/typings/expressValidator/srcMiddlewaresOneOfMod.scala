package typings.expressValidator

import typings.expressValidator.srcBaseMod.Middleware
import typings.expressValidator.srcChainContextRunnerMod.ContextRunner
import typings.expressValidator.srcChainValidationChainMod.ValidationChain
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMiddlewaresOneOfMod {
  
  @JSImport("express-validator/src/middlewares/one-of", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def oneOf(chains: js.Array[ValidationChain | js.Array[ValidationChain]]): Middleware & ContextRunner = ^.asInstanceOf[js.Dynamic].applyDynamic("oneOf")(chains.asInstanceOf[js.Any]).asInstanceOf[Middleware & ContextRunner]
  inline def oneOf(chains: js.Array[ValidationChain | js.Array[ValidationChain]], options: OneOfOptions): Middleware & ContextRunner = (^.asInstanceOf[js.Dynamic].applyDynamic("oneOf")(chains.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Middleware & ContextRunner]
  
  /* Rewritten from type alias, can be one of: 
    - typings.expressValidator.expressValidatorStrings.grouped
    - typings.expressValidator.expressValidatorStrings.least_errored
    - typings.expressValidator.expressValidatorStrings.flat
  */
  trait OneOfErrorType extends StObject
  object OneOfErrorType {
    
    inline def flat: typings.expressValidator.expressValidatorStrings.flat = "flat".asInstanceOf[typings.expressValidator.expressValidatorStrings.flat]
    
    inline def grouped: typings.expressValidator.expressValidatorStrings.grouped = "grouped".asInstanceOf[typings.expressValidator.expressValidatorStrings.grouped]
    
    inline def least_errored: typings.expressValidator.expressValidatorStrings.least_errored = "least_errored".asInstanceOf[typings.expressValidator.expressValidatorStrings.least_errored]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.expressValidator.anon.ErrorType
    - typings.expressValidator.anon.ErrorTypeMessage
  */
  trait OneOfOptions extends StObject
  object OneOfOptions {
    
    inline def ErrorType(): typings.expressValidator.anon.ErrorType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.expressValidator.anon.ErrorType]
    }
    
    inline def ErrorTypeMessage(): typings.expressValidator.anon.ErrorTypeMessage = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.expressValidator.anon.ErrorTypeMessage]
    }
  }
}
