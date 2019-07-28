package typings.expressDashValidator.srcContextDashItemsCustomDashValidationMod

import typings.expressDashValidator.srcBaseMod.CustomValidator
import typings.expressDashValidator.srcBaseMod.Meta
import typings.expressDashValidator.srcContextDashItemsContextDashItemMod.ContextItem
import typings.expressDashValidator.srcContextMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-validator/src/context-items/custom-validation", "CustomValidation")
@js.native
class CustomValidation protected () extends ContextItem {
  def this(validator: CustomValidator, negated: Boolean) = this()
  var message: js.Any = js.native
  val negated: js.Any = js.native
  val validator: js.Any = js.native
  /* CompleteClass */
  override def run(context: Context, value: js.Any, meta: Meta): js.Promise[Unit] = js.native
}

