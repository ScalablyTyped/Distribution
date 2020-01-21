package typings.expressValidator

import typings.expressValidator.contextBuilderMod.ContextBuilder
import typings.expressValidator.selectFieldsMod.SelectFields_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-validator/src/chain", JSImport.Namespace)
@js.native
object chainMod extends js.Object {
  @js.native
  class ContextHandlerImpl[Chain] protected ()
    extends typings.expressValidator.contextHandlerImplMod.ContextHandlerImpl[Chain] {
    def this(builder: ContextBuilder, chain: Chain) = this()
  }
  
  @js.native
  class ContextRunnerImpl protected ()
    extends typings.expressValidator.contextRunnerImplMod.ContextRunnerImpl {
    def this(builder: ContextBuilder) = this()
    def this(builder: ContextBuilder, selectFields: SelectFields_) = this()
  }
  
  @js.native
  class SanitizersImpl[Chain] protected ()
    extends typings.expressValidator.sanitizersImplMod.SanitizersImpl[Chain] {
    def this(builder: ContextBuilder, chain: Chain) = this()
  }
  
  @js.native
  class ValidatorsImpl[Chain] protected ()
    extends typings.expressValidator.validatorsImplMod.ValidatorsImpl[Chain] {
    def this(builder: ContextBuilder, chain: Chain) = this()
  }
  
}

