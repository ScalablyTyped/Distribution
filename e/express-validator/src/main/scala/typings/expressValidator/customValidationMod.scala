package typings.expressValidator

import typings.expressValidator.baseMod.CustomValidator
import typings.expressValidator.contextItemMod.ContextItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object customValidationMod {
  
  @JSImport("express-validator/src/context-items/custom-validation", "CustomValidation")
  @js.native
  class CustomValidation protected () extends ContextItem {
    def this(validator: CustomValidator, negated: Boolean) = this()
    
    var message: js.Any = js.native
    
    val negated: js.Any = js.native
    
    val validator: js.Any = js.native
  }
}
