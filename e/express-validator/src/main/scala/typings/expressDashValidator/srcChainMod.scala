package typings.expressDashValidator

import typings.expressDashValidator.srcContextDashBuilderMod.ContextBuilder
import typings.expressDashValidator.srcSelectDashFieldsMod.SelectFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-validator/src/chain", JSImport.Namespace)
@js.native
object srcChainMod extends js.Object {
  @js.native
  class ContextHandlerImpl[Chain] protected ()
    extends typings.expressDashValidator.srcChainContextDashHandlerDashImplMod.ContextHandlerImpl[Chain] {
    def this(builder: ContextBuilder, chain: Chain) = this()
  }
  
  @js.native
  class ContextRunnerImpl protected ()
    extends typings.expressDashValidator.srcChainContextDashRunnerDashImplMod.ContextRunnerImpl {
    def this(builder: ContextBuilder) = this()
    def this(builder: ContextBuilder, selectFields: SelectFields) = this()
  }
  
  @js.native
  class SanitizersImpl[Chain] protected ()
    extends typings.expressDashValidator.srcChainSanitizersDashImplMod.SanitizersImpl[Chain] {
    def this(builder: ContextBuilder, chain: Chain) = this()
  }
  
  @js.native
  class ValidatorsImpl[Chain] protected ()
    extends typings.expressDashValidator.srcChainValidatorsDashImplMod.ValidatorsImpl[Chain] {
    def this(builder: ContextBuilder, chain: Chain) = this()
  }
  
}

