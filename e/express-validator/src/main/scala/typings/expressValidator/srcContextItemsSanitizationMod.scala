package typings.expressValidator

import typings.expressValidator.srcBaseMod.CustomSanitizer
import typings.expressValidator.srcBaseMod.Meta
import typings.expressValidator.srcBaseMod.StandardSanitizer
import typings.expressValidator.srcContextItemsContextItemMod.ContextItem
import typings.expressValidator.srcContextMod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcContextItemsSanitizationMod {
  
  @JSImport("express-validator/src/context-items/sanitization", "Sanitization")
  @js.native
  open class Sanitization protected ()
    extends StObject
       with ContextItem {
    def this(sanitizer: CustomSanitizer, custom: Boolean) = this()
    def this(sanitizer: StandardSanitizer, custom: Boolean) = this()
    def this(sanitizer: CustomSanitizer, custom: Boolean, options: js.Array[Any]) = this()
    def this(sanitizer: StandardSanitizer, custom: Boolean, options: js.Array[Any]) = this()
    
    /* private */ val custom: Any = js.native
    
    /* private */ val options: Any = js.native
    
    /* CompleteClass */
    override def run(context: Context, value: Any, meta: Meta): js.Promise[Unit] = js.native
    
    /* private */ val sanitizer: Any = js.native
  }
}
