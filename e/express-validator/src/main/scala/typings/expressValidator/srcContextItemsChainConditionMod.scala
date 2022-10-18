package typings.expressValidator

import typings.expressValidator.srcBaseMod.Meta
import typings.expressValidator.srcChainValidationChainMod.ValidationChain
import typings.expressValidator.srcContextItemsContextItemMod.ContextItem
import typings.expressValidator.srcContextMod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcContextItemsChainConditionMod {
  
  @JSImport("express-validator/src/context-items/chain-condition", "ChainCondition")
  @js.native
  open class ChainCondition protected ()
    extends StObject
       with ContextItem {
    def this(chain: ValidationChain) = this()
    
    /* private */ val chain: Any = js.native
    
    /* CompleteClass */
    override def run(context: Context, value: Any, meta: Meta): js.Promise[Unit] = js.native
  }
}
