package typings.expressDashValidator.srcContextDashItemsChainDashConditionMod

import typings.expressDashValidator.srcBaseMod.Meta
import typings.expressDashValidator.srcChainValidationDashChainMod.ValidationChain
import typings.expressDashValidator.srcContextDashItemsContextDashItemMod.ContextItem
import typings.expressDashValidator.srcContextMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-validator/src/context-items/chain-condition", "ChainCondition")
@js.native
class ChainCondition protected () extends ContextItem {
  def this(chain: ValidationChain) = this()
  val chain: js.Any = js.native
  /* CompleteClass */
  override def run(context: Context, value: js.Any, meta: Meta): js.Promise[Unit] = js.native
}

