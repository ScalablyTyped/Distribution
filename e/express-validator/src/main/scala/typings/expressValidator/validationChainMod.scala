package typings.expressValidator

import typings.expressValidator.baseMod.Request
import typings.expressValidator.contextBuilderMod.ContextBuilder
import typings.expressValidator.contextHandlerMod.ContextHandler
import typings.expressValidator.contextRunnerMod.ContextRunner
import typings.expressValidator.sanitizersMod.Sanitizers
import typings.expressValidator.validatorsMod.Validators
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validationChainMod {
  
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
