package typings.expressDashValidator.srcContextDashItemsStandardDashValidationMod

import typings.expressDashValidator.srcBaseMod.Meta
import typings.expressDashValidator.srcBaseMod.StandardValidator
import typings.expressDashValidator.srcContextDashItemsContextDashItemMod.ContextItem
import typings.expressDashValidator.srcContextMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-validator/src/context-items/standard-validation", "StandardValidation")
@js.native
class StandardValidation protected () extends ContextItem {
  def this(validator: StandardValidator, negated: Boolean) = this()
  def this(validator: StandardValidator, negated: Boolean, options: js.Array[_]) = this()
  var message: js.Any = js.native
  val negated: js.Any = js.native
  val options: js.Any = js.native
  val validator: js.Any = js.native
  /* CompleteClass */
  override def run(context: Context, value: js.Any, meta: Meta): js.Promise[Unit] = js.native
}

