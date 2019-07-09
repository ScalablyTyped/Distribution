package typings
package expressDashValidatorLib.srcChainContextDashHandlerDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-validator/src/chain/context-handler-impl", "ContextHandlerImpl")
@js.native
class ContextHandlerImpl[Chain] protected ()
  extends expressDashValidatorLib.srcChainContextDashHandlerMod.ContextHandler[Chain] {
  def this(builder: expressDashValidatorLib.srcContextDashBuilderMod.ContextBuilder, chain: Chain) = this()
  val builder: js.Any = js.native
  val chain: js.Any = js.native
  def optional(options: expressDashValidatorLib.srcContextMod.Optional): Chain = js.native
}

