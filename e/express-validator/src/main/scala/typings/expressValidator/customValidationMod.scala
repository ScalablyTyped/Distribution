package typings.expressValidator

import typings.expressValidator.baseMod.CustomValidator
import typings.expressValidator.baseMod.Meta
import typings.expressValidator.contextItemMod.ContextItem
import typings.expressValidator.contextMod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object customValidationMod {
  
  @JSImport("express-validator/src/context-items/custom-validation", "CustomValidation")
  @js.native
  class CustomValidation protected ()
    extends StObject
       with ContextItem {
    def this(validator: CustomValidator, negated: Boolean) = this()
    
    var message: js.Any = js.native
    
    /* private */ val negated: js.Any = js.native
    
    /* CompleteClass */
    override def run(context: Context, value: js.Any, meta: Meta): js.Promise[Unit] = js.native
    
    /* private */ val validator: js.Any = js.native
  }
}
