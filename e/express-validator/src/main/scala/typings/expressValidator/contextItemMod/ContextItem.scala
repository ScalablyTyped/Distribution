package typings.expressValidator.contextItemMod

import typings.expressValidator.baseMod.Meta
import typings.expressValidator.contextMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContextItem extends js.Object {
  
  def run(context: Context, value: js.Any, meta: Meta): js.Promise[Unit] = js.native
}
object ContextItem {
  
  @scala.inline
  def apply(run: (Context, js.Any, Meta) => js.Promise[Unit]): ContextItem = {
    val __obj = js.Dynamic.literal(run = js.Any.fromFunction3(run))
    __obj.asInstanceOf[ContextItem]
  }
  
  @scala.inline
  implicit class ContextItemOps[Self <: ContextItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRun(value: (Context, js.Any, Meta) => js.Promise[Unit]): Self = this.set("run", js.Any.fromFunction3(value))
  }
}
