package typings.emartechClsAdapter.mod

import typings.clsHooked.mod.Namespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContextFactory extends js.Object {
  
  var _namespace: Namespace = js.native
}
object ContextFactory {
  
  @scala.inline
  def apply(_namespace: Namespace): ContextFactory = {
    val __obj = js.Dynamic.literal(_namespace = _namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextFactory]
  }
  
  @scala.inline
  implicit class ContextFactoryOps[Self <: ContextFactory] (val x: Self) extends AnyVal {
    
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
    def set_namespace(value: Namespace): Self = this.set("_namespace", value.asInstanceOf[js.Any])
  }
}
