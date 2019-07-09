package typings
package expressDashValidatorLib.srcContextDashItemsStandardDashValidationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-validator/src/context-items/standard-validation", "StandardValidation")
@js.native
class StandardValidation protected ()
  extends expressDashValidatorLib.srcContextDashItemsContextDashItemMod.ContextItem {
  def this(validator: expressDashValidatorLib.srcBaseMod.StandardValidator, negated: scala.Boolean) = this()
  def this(validator: expressDashValidatorLib.srcBaseMod.StandardValidator, negated: scala.Boolean, options: js.Array[_]) = this()
  var message: js.Any = js.native
  val negated: js.Any = js.native
  val options: js.Any = js.native
  val validator: js.Any = js.native
  /* CompleteClass */
  override def run(
    context: expressDashValidatorLib.srcContextMod.Context,
    value: js.Any,
    meta: expressDashValidatorLib.srcBaseMod.Meta
  ): js.Promise[scala.Unit] = js.native
}

