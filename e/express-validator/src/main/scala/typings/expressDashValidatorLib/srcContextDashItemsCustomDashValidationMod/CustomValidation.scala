package typings
package expressDashValidatorLib.srcContextDashItemsCustomDashValidationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-validator/src/context-items/custom-validation", "CustomValidation")
@js.native
class CustomValidation protected ()
  extends expressDashValidatorLib.srcContextDashItemsContextDashItemMod.ContextItem {
  def this(validator: expressDashValidatorLib.srcBaseMod.CustomValidator, negated: scala.Boolean) = this()
  var message: js.Any = js.native
  val negated: js.Any = js.native
  val validator: js.Any = js.native
  /* CompleteClass */
  override def run(
    context: expressDashValidatorLib.srcContextMod.Context,
    value: js.Any,
    meta: expressDashValidatorLib.srcBaseMod.Meta
  ): js.Promise[scala.Unit] = js.native
}

