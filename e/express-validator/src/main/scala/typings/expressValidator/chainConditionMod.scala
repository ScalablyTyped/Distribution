package typings.expressValidator

import typings.expressValidator.contextItemMod.ContextItem
import typings.expressValidator.validationChainMod.ValidationChain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-validator/src/context-items/chain-condition", JSImport.Namespace)
@js.native
object chainConditionMod extends js.Object {
  @js.native
  class ChainCondition protected () extends ContextItem {
    def this(chain: ValidationChain) = this()
    val chain: js.Any = js.native
  }
  
}

