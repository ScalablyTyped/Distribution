package typings
package expressDashValidatorLib.srcContextDashItemsContextDashItemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextItem extends js.Object {
  def run(
    context: expressDashValidatorLib.srcContextMod.Context,
    value: js.Any,
    meta: expressDashValidatorLib.srcBaseMod.Meta
  ): js.Promise[scala.Unit]
}

object ContextItem {
  @scala.inline
  def apply(
    run: (expressDashValidatorLib.srcContextMod.Context, js.Any, expressDashValidatorLib.srcBaseMod.Meta) => js.Promise[scala.Unit]
  ): ContextItem = {
    val __obj = js.Dynamic.literal(run = js.Any.fromFunction3(run))
  
    __obj.asInstanceOf[ContextItem]
  }
}

