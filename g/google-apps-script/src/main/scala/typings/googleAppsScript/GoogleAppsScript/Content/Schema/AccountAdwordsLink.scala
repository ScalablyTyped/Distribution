package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountAdwordsLink extends js.Object {
  
  var adwordsId: js.UndefOr[String] = js.native
  
  var status: js.UndefOr[String] = js.native
}
object AccountAdwordsLink {
  
  @scala.inline
  def apply(): AccountAdwordsLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountAdwordsLink]
  }
  
  @scala.inline
  implicit class AccountAdwordsLinkOps[Self <: AccountAdwordsLink] (val x: Self) extends AnyVal {
    
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
    def setAdwordsId(value: String): Self = this.set("adwordsId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdwordsId: Self = this.set("adwordsId", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
