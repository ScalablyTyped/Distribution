package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoginInformation extends js.Object {
  
  /**
    * Contains a token that can be used for authentication in API calls instead of using the user name and password.
    */
  var apiPassword: js.UndefOr[String] = js.native
  
  /**
    * The list of accounts that authenticating user is a member of.
    */
  var loginAccounts: js.UndefOr[js.Array[LoginAccount]] = js.native
}
object LoginInformation {
  
  @scala.inline
  def apply(): LoginInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoginInformation]
  }
  
  @scala.inline
  implicit class LoginInformationOps[Self <: LoginInformation] (val x: Self) extends AnyVal {
    
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
    def setApiPassword(value: String): Self = this.set("apiPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiPassword: Self = this.set("apiPassword", js.undefined)
    
    @scala.inline
    def setLoginAccountsVarargs(value: LoginAccount*): Self = this.set("loginAccounts", js.Array(value :_*))
    
    @scala.inline
    def setLoginAccounts(value: js.Array[LoginAccount]): Self = this.set("loginAccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoginAccounts: Self = this.set("loginAccounts", js.undefined)
  }
}
