package typings
package expressDashValidatorLib.srcContextDashItemsChainDashConditionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-validator/src/context-items/chain-condition", "ChainCondition")
@js.native
class ChainCondition protected ()
  extends expressDashValidatorLib.srcContextDashItemsContextDashItemMod.ContextItem {
  def this(chain: expressDashValidatorLib.srcChainValidationDashChainMod.ValidationChain) = this()
  val chain: js.Any = js.native
  /* CompleteClass */
  override def run(
    context: expressDashValidatorLib.srcContextMod.Context,
    value: js.Any,
    meta: expressDashValidatorLib.srcBaseMod.Meta
  ): js.Promise[scala.Unit] = js.native
}

