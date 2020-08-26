package typings.expressValidator

import typings.expressValidator.baseMod.CustomValidator
import typings.expressValidator.contextItemMod.ContextItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-validator/src/context-items/custom-condition", JSImport.Namespace)
@js.native
object customConditionMod extends js.Object {
  @js.native
  class CustomCondition protected () extends ContextItem {
    def this(condition: CustomValidator) = this()
    val condition: js.Any = js.native
  }
  
}

