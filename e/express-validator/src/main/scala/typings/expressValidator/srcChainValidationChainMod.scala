package typings.expressValidator

import typings.expressValidator.srcBaseMod.Request
import typings.expressValidator.srcChainContextHandlerMod.ContextHandler
import typings.expressValidator.srcChainContextRunnerMod.ContextRunner
import typings.expressValidator.srcChainSanitizersMod.Sanitizers
import typings.expressValidator.srcChainValidatorsMod.Validators
import typings.expressValidator.srcContextBuilderMod.ContextBuilder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcChainValidationChainMod {
  
  @js.native
  trait ValidationChain
    extends StObject
       with Validators[ValidationChain]
       with Sanitizers[ValidationChain]
       with ContextHandler[ValidationChain]
       with ContextRunner {
    
    def apply(req: Request, res: Any, next: js.Function1[/* error */ js.UndefOr[Any], Unit]): Unit = js.native
    
    var builder: ContextBuilder = js.native
  }
}
