package typings.expressValidator

import typings.expressValidator.contextBuilderMod.ContextBuilder
import typings.expressValidator.contextMod.Context
import typings.expressValidator.contextMod.ReadonlyContext
import typings.expressValidator.contextRunnerMod.ContextRunner
import typings.expressValidator.selectFieldsMod.SelectFields_
import typings.expressValidator.validationResultMod.Result
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextRunnerImplMod {
  
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
    
    /* private */ val selectFields: Any = js.native
  }
  
  @JSImport("express-validator/src/chain/context-runner-impl", "ResultWithContext")
  @js.native
  open class ResultWithContext protected () extends Result[Any] {
    def this(context: ReadonlyContext) = this()
    
    val context: ReadonlyContext = js.native
  }
}
