package typings.expressValidator

import typings.expressValidator.baseMod.Meta
import typings.expressValidator.contextItemMod.ContextItem
import typings.expressValidator.contextMod.Context
import typings.expressValidator.validationChainMod.ValidationChain
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chainConditionMod {
  
  @JSImport("express-validator/src/context-items/chain-condition", "ChainCondition")
  @js.native
  class ChainCondition protected ()
    extends StObject
       with ContextItem {
    def this(chain: ValidationChain) = this()
    
    val chain: js.Any = js.native
    
    /* CompleteClass */
    override def run(context: Context, value: js.Any, meta: Meta): js.Promise[Unit] = js.native
  }
}
