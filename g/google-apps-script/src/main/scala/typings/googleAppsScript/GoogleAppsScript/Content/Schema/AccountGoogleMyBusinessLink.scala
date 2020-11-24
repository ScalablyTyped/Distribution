package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountGoogleMyBusinessLink extends js.Object {
  
  var gmbEmail: js.UndefOr[String] = js.native
  
  var status: js.UndefOr[String] = js.native
}
object AccountGoogleMyBusinessLink {
  
  @scala.inline
  def apply(): AccountGoogleMyBusinessLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountGoogleMyBusinessLink]
  }
  
  @scala.inline
  implicit class AccountGoogleMyBusinessLinkOps[Self <: AccountGoogleMyBusinessLink] (val x: Self) extends AnyVal {
    
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
    def setGmbEmail(value: String): Self = this.set("gmbEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGmbEmail: Self = this.set("gmbEmail", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
