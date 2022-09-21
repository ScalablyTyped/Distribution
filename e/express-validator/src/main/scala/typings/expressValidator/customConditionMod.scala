package typings.expressValidator

import typings.expressValidator.baseMod.CustomValidator
import typings.expressValidator.baseMod.Meta
import typings.expressValidator.contextItemMod.ContextItem
import typings.expressValidator.contextMod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object customConditionMod {
  
  @JSImport("express-validator/src/context-items/custom-condition", "CustomCondition")
  @js.native
  open class CustomCondition protected ()
    extends StObject
       with ContextItem {
    def this(condition: CustomValidator) = this()
    
    /* private */ val condition: Any = js.native
    
    /* CompleteClass */
    override def run(context: Context, value: Any, meta: Meta): js.Promise[Unit] = js.native
  }
}
