package typings
package expressDashValidatorLib.srcContextDashItemsCustomDashConditionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-validator/src/context-items/custom-condition", "CustomCondition")
@js.native
class CustomCondition protected ()
  extends expressDashValidatorLib.srcContextDashItemsContextDashItemMod.ContextItem {
  def this(condition: expressDashValidatorLib.srcBaseMod.CustomValidator) = this()
  val condition: js.Any = js.native
  /* CompleteClass */
  override def run(
    context: expressDashValidatorLib.srcContextMod.Context,
    value: js.Any,
    meta: expressDashValidatorLib.srcBaseMod.Meta
  ): js.Promise[scala.Unit] = js.native
}

