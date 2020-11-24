package typings.googleAppsScript.GoogleAppsScript.Gmail.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PopSettings extends js.Object {
  
  var accessWindow: js.UndefOr[String] = js.native
  
  var disposition: js.UndefOr[String] = js.native
}
object PopSettings {
  
  @scala.inline
  def apply(): PopSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PopSettings]
  }
  
  @scala.inline
  implicit class PopSettingsOps[Self <: PopSettings] (val x: Self) extends AnyVal {
    
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
    def setAccessWindow(value: String): Self = this.set("accessWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessWindow: Self = this.set("accessWindow", js.undefined)
    
    @scala.inline
    def setDisposition(value: String): Self = this.set("disposition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisposition: Self = this.set("disposition", js.undefined)
  }
}
