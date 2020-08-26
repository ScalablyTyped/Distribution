package typings.expressValidator

import typings.expressValidator.baseMod.CustomValidator
import typings.expressValidator.contextItemMod.ContextItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-validator/src/context-items/custom-validation", JSImport.Namespace)
@js.native
object customValidationMod extends js.Object {
  @js.native
  class CustomValidation protected () extends ContextItem {
    def this(validator: CustomValidator, negated: Boolean) = this()
    var message: js.Any = js.native
    val negated: js.Any = js.native
    val validator: js.Any = js.native
  }
  
}

