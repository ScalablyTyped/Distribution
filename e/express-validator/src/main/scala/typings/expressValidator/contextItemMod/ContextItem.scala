package typings.expressValidator.contextItemMod

import typings.expressValidator.baseMod.Meta
import typings.expressValidator.contextMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextItem extends js.Object {
  def run(context: Context, value: js.Any, meta: Meta): js.Promise[Unit]
}

object ContextItem {
  @scala.inline
  def apply(run: (Context, js.Any, Meta) => js.Promise[Unit]): ContextItem = {
    val __obj = js.Dynamic.literal(run = js.Any.fromFunction3(run))
  
    __obj.asInstanceOf[ContextItem]
  }
}

