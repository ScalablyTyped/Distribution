package typings.expressValidator

import typings.expressValidator.srcBaseMod.Request
import typings.expressValidator.srcChainContextRunnerMod.ContextRunner
import typings.expressValidator.srcChainSanitizersMod.Sanitizers
import typings.expressValidator.srcContextBuilderMod.ContextBuilder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcChainSanitizationChainMod {
  
  @js.native
  trait SanitizationChain
    extends StObject
       with Sanitizers[SanitizationChain]
       with ContextRunner {
    
    def apply(req: Request, res: Any, next: js.Function1[/* errors */ js.UndefOr[Any], Unit]): Unit = js.native
    
    var builder: ContextBuilder = js.native
  }
}
