package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountStatus extends js.Object {
  
  var accountId: js.UndefOr[String] = js.native
  
  var accountLevelIssues: js.UndefOr[js.Array[AccountStatusAccountLevelIssue]] = js.native
  
  var dataQualityIssues: js.UndefOr[js.Array[AccountStatusDataQualityIssue]] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var products: js.UndefOr[js.Array[AccountStatusProducts]] = js.native
  
  var websiteClaimed: js.UndefOr[Boolean] = js.native
}
object AccountStatus {
  
  @scala.inline
  def apply(): AccountStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountStatus]
  }
  
  @scala.inline
  implicit class AccountStatusOps[Self <: AccountStatus] (val x: Self) extends AnyVal {
    
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
    def setAccountLevelIssuesVarargs(value: AccountStatusAccountLevelIssue*): Self = this.set("accountLevelIssues", js.Array(value :_*))
    
    @scala.inline
    def setAccountLevelIssues(value: js.Array[AccountStatusAccountLevelIssue]): Self = this.set("accountLevelIssues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountLevelIssues: Self = this.set("accountLevelIssues", js.undefined)
    
    @scala.inline
    def setDataQualityIssuesVarargs(value: AccountStatusDataQualityIssue*): Self = this.set("dataQualityIssues", js.Array(value :_*))
    
    @scala.inline
    def setDataQualityIssues(value: js.Array[AccountStatusDataQualityIssue]): Self = this.set("dataQualityIssues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataQualityIssues: Self = this.set("dataQualityIssues", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setProductsVarargs(value: AccountStatusProducts*): Self = this.set("products", js.Array(value :_*))
    
    @scala.inline
    def setProducts(value: js.Array[AccountStatusProducts]): Self = this.set("products", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProducts: Self = this.set("products", js.undefined)
    
    @scala.inline
    def setWebsiteClaimed(value: Boolean): Self = this.set("websiteClaimed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebsiteClaimed: Self = this.set("websiteClaimed", js.undefined)
  }
}
