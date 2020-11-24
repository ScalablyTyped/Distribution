package typings.durandal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DurandalRelativeRouteSettings extends js.Object {
  
  var dynamicHash: js.UndefOr[String] = js.native
  
  var fromParent: js.UndefOr[Boolean] = js.native
  
  var moduleId: js.UndefOr[String] = js.native
  
  var route: js.UndefOr[String] = js.native
}
object DurandalRelativeRouteSettings {
  
  @scala.inline
  def apply(): DurandalRelativeRouteSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DurandalRelativeRouteSettings]
  }
  
  @scala.inline
  implicit class DurandalRelativeRouteSettingsOps[Self <: DurandalRelativeRouteSettings] (val x: Self) extends AnyVal {
    
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
    def setDynamicHash(value: String): Self = this.set("dynamicHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDynamicHash: Self = this.set("dynamicHash", js.undefined)
    
    @scala.inline
    def setFromParent(value: Boolean): Self = this.set("fromParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFromParent: Self = this.set("fromParent", js.undefined)
    
    @scala.inline
    def setModuleId(value: String): Self = this.set("moduleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModuleId: Self = this.set("moduleId", js.undefined)
    
    @scala.inline
    def setRoute(value: String): Self = this.set("route", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoute: Self = this.set("route", js.undefined)
  }
}
