package typings.expressValidator

import typings.expressValidator.srcContextBuilderMod.ContextBuilder
import typings.expressValidator.srcContextMod.Context
import typings.expressValidator.srcContextMod.ReadonlyContext
import typings.expressValidator.srcSelectFieldsMod.SelectFields_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcChainMod {
  
  @JSImport("express-validator/src/chain", "ContextHandlerImpl")
  @js.native
  open class ContextHandlerImpl[Chain] protected ()
    extends typings.expressValidator.srcChainContextHandlerImplMod.ContextHandlerImpl[Chain] {
    def this(builder: ContextBuilder, chain: Chain) = this()
  }
  
  @JSImport("express-validator/src/chain", "ContextRunnerImpl")
  @js.native
  open class ContextRunnerImpl protected ()
    extends typings.expressValidator.srcChainContextRunnerImplMod.ContextRunnerImpl {
    def this(builderOrContext: ContextBuilder) = this()
    def this(builderOrContext: Context) = this()
    def this(builderOrContext: ContextBuilder, selectFields: SelectFields_) = this()
    def this(builderOrContext: Context, selectFields: SelectFields_) = this()
  }
  
  @JSImport("express-validator/src/chain", "ResultWithContext")
  @js.native
  open class ResultWithContext protected ()
    extends typings.expressValidator.srcChainContextRunnerImplMod.ResultWithContext {
    def this(context: ReadonlyContext) = this()
  }
  
  @JSImport("express-validator/src/chain", "SanitizersImpl")
  @js.native
  open class SanitizersImpl[Chain] protected ()
    extends typings.expressValidator.srcChainSanitizersImplMod.SanitizersImpl[Chain] {
    def this(builder: ContextBuilder, chain: Chain) = this()
  }
  
  @JSImport("express-validator/src/chain", "ValidatorsImpl")
  @js.native
  open class ValidatorsImpl[Chain] protected ()
    extends typings.expressValidator.srcChainValidatorsImplMod.ValidatorsImpl[Chain] {
    def this(builder: ContextBuilder, chain: Chain) = this()
  }
}
