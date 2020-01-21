package typings.expressValidator

import typings.expressValidator.baseMod.CustomValidator
import typings.expressValidator.baseMod.Meta
import typings.expressValidator.contextItemMod.ContextItem
import typings.expressValidator.contextMod.Context
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
    /* CompleteClass */
    override def run(context: Context, value: js.Any, meta: Meta): js.Promise[Unit] = js.native
  }
  
}

