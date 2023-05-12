package typings.expressValidator

import typings.expressValidator.anon.DryRun
import typings.expressValidator.srcBaseMod.Request
import typings.expressValidator.srcChainContextRunnerMod.ContextRunner
import typings.expressValidator.srcChainContextRunnerMod.ResultWithContext
import typings.expressValidator.srcContextBuilderMod.ContextBuilder
import typings.expressValidator.srcContextMod.Context
import typings.expressValidator.srcContextMod.ReadonlyContext
import typings.expressValidator.srcFieldSelectionMod.SelectFields_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcChainContextRunnerImplMod {
  
  @JSImport("express-validator/src/chain/context-runner-impl", "ContextRunnerImpl")
  @js.native
  open class ContextRunnerImpl protected ()
    extends StObject
       with ContextRunner {
    def this(builderOrContext: ContextBuilder) = this()
    def this(builderOrContext: Context) = this()
    def this(builderOrContext: ContextBuilder, selectFields: SelectFields_) = this()
    def this(builderOrContext: Context, selectFields: SelectFields_) = this()
    
    /* private */ val builderOrContext: Any = js.native
    
    def run(req: Request, options: DryRun): js.Promise[ResultWithContextImpl] = js.native
    
    /* private */ val selectFields: Any = js.native
  }
  
  @JSImport("express-validator/src/chain/context-runner-impl", "ResultWithContextImpl")
  @js.native
  open class ResultWithContextImpl protected () extends ResultWithContext {
    def this(context: ReadonlyContext) = this()
  }
}
