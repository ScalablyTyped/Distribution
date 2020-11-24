package typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserIm extends js.Object {
  
  var customProtocol: js.UndefOr[String] = js.native
  
  var customType: js.UndefOr[String] = js.native
  
  var im: js.UndefOr[String] = js.native
  
  var primary: js.UndefOr[Boolean] = js.native
  
  var protocol: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object UserIm {
  
  @scala.inline
  def apply(): UserIm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserIm]
  }
  
  @scala.inline
  implicit class UserImOps[Self <: UserIm] (val x: Self) extends AnyVal {
    
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
    def setCustomProtocol(value: String): Self = this.set("customProtocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomProtocol: Self = this.set("customProtocol", js.undefined)
    
    @scala.inline
    def setCustomType(value: String): Self = this.set("customType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomType: Self = this.set("customType", js.undefined)
    
    @scala.inline
    def setIm(value: String): Self = this.set("im", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIm: Self = this.set("im", js.undefined)
    
    @scala.inline
    def setPrimary(value: Boolean): Self = this.set("primary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimary: Self = this.set("primary", js.undefined)
    
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
