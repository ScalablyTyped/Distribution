package typings.expressDashValidator

import typings.expressDashValidator.srcChainContextDashHandlerMod.ContextHandler
import typings.expressDashValidator.srcContextDashBuilderMod.ContextBuilder
import typings.expressDashValidator.srcContextMod.Optional
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-validator/src/chain/context-handler-impl", JSImport.Namespace)
@js.native
object srcChainContextDashHandlerDashImplMod extends js.Object {
  @js.native
  class ContextHandlerImpl[Chain] protected () extends ContextHandler[Chain] {
    def this(builder: ContextBuilder, chain: Chain) = this()
    val builder: js.Any = js.native
    val chain: js.Any = js.native
    def optional(options: Optional): Chain = js.native
  }
  
}

