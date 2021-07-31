package typings.expressValidator

import typings.expressValidator.baseMod.Request
import typings.expressValidator.contextBuilderMod.ContextBuilder
import typings.expressValidator.contextRunnerMod.ContextRunner
import typings.expressValidator.sanitizersMod.Sanitizers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sanitizationChainMod {
  
  @js.native
  trait SanitizationChain
    extends StObject
       with Sanitizers[SanitizationChain]
       with ContextRunner {
    
    def apply(req: Request, res: js.Any, next: js.Function1[/* errors */ js.UndefOr[js.Any], Unit]): Unit = js.native
    
    var builder: ContextBuilder = js.native
  }
}
