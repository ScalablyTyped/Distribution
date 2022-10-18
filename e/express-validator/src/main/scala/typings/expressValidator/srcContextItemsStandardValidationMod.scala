package typings.expressValidator

import typings.expressValidator.srcBaseMod.Meta
import typings.expressValidator.srcBaseMod.StandardValidator
import typings.expressValidator.srcContextItemsContextItemMod.ContextItem
import typings.expressValidator.srcContextMod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcContextItemsStandardValidationMod {
  
  @JSImport("express-validator/src/context-items/standard-validation", "StandardValidation")
  @js.native
  open class StandardValidation protected ()
    extends StObject
       with ContextItem {
    def this(validator: StandardValidator, negated: Boolean) = this()
    def this(validator: StandardValidator, negated: Boolean, options: js.Array[Any]) = this()
    
    var message: Any = js.native
    
    /* private */ val negated: Any = js.native
    
    /* private */ val options: Any = js.native
    
    /* CompleteClass */
    override def run(context: Context, value: Any, meta: Meta): js.Promise[Unit] = js.native
    
    /* private */ val validator: Any = js.native
  }
}
