package typings.expressDashValidator.srcContextDashItemsCustomDashConditionMod

import typings.expressDashValidator.srcBaseMod.CustomValidator
import typings.expressDashValidator.srcBaseMod.Meta
import typings.expressDashValidator.srcContextDashItemsContextDashItemMod.ContextItem
import typings.expressDashValidator.srcContextMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-validator/src/context-items/custom-condition", "CustomCondition")
@js.native
class CustomCondition protected () extends ContextItem {
  def this(condition: CustomValidator) = this()
  val condition: js.Any = js.native
  /* CompleteClass */
  override def run(context: Context, value: js.Any, meta: Meta): js.Promise[Unit] = js.native
}

