package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LiasettingsGetAccessibleGmbAccountsResponse extends js.Object {
  
  var accountId: js.UndefOr[String] = js.native
  
  var gmbAccounts: js.UndefOr[js.Array[GmbAccountsGmbAccount]] = js.native
  
  var kind: js.UndefOr[String] = js.native
}
object LiasettingsGetAccessibleGmbAccountsResponse {
  
  @scala.inline
  def apply(): LiasettingsGetAccessibleGmbAccountsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiasettingsGetAccessibleGmbAccountsResponse]
  }
  
  @scala.inline
  implicit class LiasettingsGetAccessibleGmbAccountsResponseOps[Self <: LiasettingsGetAccessibleGmbAccountsResponse] (val x: Self) extends AnyVal {
    
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
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    
    @scala.inline
    def setGmbAccountsVarargs(value: GmbAccountsGmbAccount*): Self = this.set("gmbAccounts", js.Array(value :_*))
    
    @scala.inline
    def setGmbAccounts(value: js.Array[GmbAccountsGmbAccount]): Self = this.set("gmbAccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGmbAccounts: Self = this.set("gmbAccounts", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
}
