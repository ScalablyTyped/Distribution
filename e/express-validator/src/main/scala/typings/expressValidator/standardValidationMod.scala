package typings.expressValidator

import typings.expressValidator.baseMod.Meta
import typings.expressValidator.baseMod.StandardValidator
import typings.expressValidator.contextItemMod.ContextItem
import typings.expressValidator.contextMod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object standardValidationMod {
  
  @JSImport("express-validator/src/context-items/standard-validation", "StandardValidation")
  @js.native
  class StandardValidation protected ()
    extends StObject
       with ContextItem {
    def this(validator: StandardValidator, negated: Boolean) = this()
    def this(validator: StandardValidator, negated: Boolean, options: js.Array[js.Any]) = this()
    
    var message: js.Any = js.native
    
    val negated: js.Any = js.native
    
    val options: js.Any = js.native
    
    /* CompleteClass */
    override def run(context: Context, value: js.Any, meta: Meta): js.Promise[Unit] = js.native
    
    val validator: js.Any = js.native
  }
}
