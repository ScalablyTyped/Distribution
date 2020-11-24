package typings.expressValidator

import typings.expressValidator.baseMod.Request
import typings.expressValidator.contextBuilderMod.ContextBuilder
import typings.expressValidator.contextHandlerMod.ContextHandler
import typings.expressValidator.contextRunnerMod.ContextRunner
import typings.expressValidator.sanitizersMod.Sanitizers
import typings.expressValidator.validatorsMod.Validators
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("express-validator/src/chain/validation-chain", JSImport.Namespace)
@js.native
object validationChainMod extends js.Object {
  
  @js.native
  trait ValidationChain
    extends Validators[ValidationChain]
       with Sanitizers[ValidationChain]
       with ContextHandler[ValidationChain]
       with ContextRunner {
    
    def apply(req: Request, res: js.Any, next: js.Function1[/* error */ js.UndefOr[js.Any], Unit]): Unit = js.native
    
    var builder: ContextBuilder = js.native
  }
}
