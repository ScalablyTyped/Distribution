package typings.emberRouting.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Outlet extends js.Object {
  
  var outlet: js.UndefOr[String] = js.native
  
  var parentView: js.UndefOr[String] = js.native
}
object Outlet {
  
  @scala.inline
  def apply(): Outlet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Outlet]
  }
  
  @scala.inline
  implicit class OutletOps[Self <: Outlet] (val x: Self) extends AnyVal {
    
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
    def setOutlet(value: String): Self = this.set("outlet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutlet: Self = this.set("outlet", js.undefined)
    
    @scala.inline
    def setParentView(value: String): Self = this.set("parentView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentView: Self = this.set("parentView", js.undefined)
  }
}
