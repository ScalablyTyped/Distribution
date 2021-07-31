package typings.expressValidator

import typings.expressValidator.contextBuilderMod.ContextBuilder
import typings.expressValidator.contextMod.Context
import typings.expressValidator.selectFieldsMod.SelectFields_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chainMod {
  
  @JSImport("express-validator/src/chain", "ContextHandlerImpl")
  @js.native
  class ContextHandlerImpl[Chain] protected ()
    extends typings.expressValidator.contextHandlerImplMod.ContextHandlerImpl[Chain] {
    def this(builder: ContextBuilder, chain: Chain) = this()
  }
  
  @JSImport("express-validator/src/chain", "ContextRunnerImpl")
  @js.native
  class ContextRunnerImpl protected ()
    extends typings.expressValidator.contextRunnerImplMod.ContextRunnerImpl {
    def this(builderOrContext: ContextBuilder) = this()
    def this(builderOrContext: Context) = this()
    def this(builderOrContext: ContextBuilder, selectFields: SelectFields_) = this()
    def this(builderOrContext: Context, selectFields: SelectFields_) = this()
  }
  
  @JSImport("express-validator/src/chain", "SanitizersImpl")
  @js.native
  class SanitizersImpl[Chain] protected ()
    extends typings.expressValidator.sanitizersImplMod.SanitizersImpl[Chain] {
    def this(builder: ContextBuilder, chain: Chain) = this()
  }
  
  @JSImport("express-validator/src/chain", "ValidatorsImpl")
  @js.native
  class ValidatorsImpl[Chain] protected ()
    extends typings.expressValidator.validatorsImplMod.ValidatorsImpl[Chain] {
    def this(builder: ContextBuilder, chain: Chain) = this()
  }
}
