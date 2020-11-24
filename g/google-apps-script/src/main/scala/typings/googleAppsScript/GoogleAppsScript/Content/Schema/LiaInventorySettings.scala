package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LiaInventorySettings extends js.Object {
  
  var inventoryVerificationContactEmail: js.UndefOr[String] = js.native
  
  var inventoryVerificationContactName: js.UndefOr[String] = js.native
  
  var inventoryVerificationContactStatus: js.UndefOr[String] = js.native
  
  var status: js.UndefOr[String] = js.native
}
object LiaInventorySettings {
  
  @scala.inline
  def apply(): LiaInventorySettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiaInventorySettings]
  }
  
  @scala.inline
  implicit class LiaInventorySettingsOps[Self <: LiaInventorySettings] (val x: Self) extends AnyVal {
    
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
    def setInventoryVerificationContactEmail(value: String): Self = this.set("inventoryVerificationContactEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInventoryVerificationContactEmail: Self = this.set("inventoryVerificationContactEmail", js.undefined)
    
    @scala.inline
    def setInventoryVerificationContactName(value: String): Self = this.set("inventoryVerificationContactName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInventoryVerificationContactName: Self = this.set("inventoryVerificationContactName", js.undefined)
    
    @scala.inline
    def setInventoryVerificationContactStatus(value: String): Self = this.set("inventoryVerificationContactStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInventoryVerificationContactStatus: Self = this.set("inventoryVerificationContactStatus", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
