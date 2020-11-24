package typings.expressValidator

import typings.expressValidator.baseMod.Request
import typings.expressValidator.contextBuilderMod.ContextBuilder
import typings.expressValidator.contextRunnerMod.ContextRunner
import typings.expressValidator.sanitizersMod.Sanitizers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("express-validator/src/chain/sanitization-chain", JSImport.Namespace)
@js.native
object sanitizationChainMod extends js.Object {
  
  @js.native
  trait SanitizationChain
    extends Sanitizers[SanitizationChain]
       with ContextRunner {
    
    def apply(req: Request, res: js.Any, next: js.Function1[/* errors */ js.UndefOr[js.Any], Unit]): Unit = js.native
    
    var builder: ContextBuilder = js.native
  }
}
