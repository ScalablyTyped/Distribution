package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoginInformation extends StObject {
  
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
  implicit class LoginInformationMutableBuilder[Self <: LoginInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiPassword(value: String): Self = StObject.set(x, "apiPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiPasswordUndefined: Self = StObject.set(x, "apiPassword", js.undefined)
    
    @scala.inline
    def setLoginAccounts(value: js.Array[LoginAccount]): Self = StObject.set(x, "loginAccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoginAccountsUndefined: Self = StObject.set(x, "loginAccounts", js.undefined)
    
    @scala.inline
    def setLoginAccountsVarargs(value: LoginAccount*): Self = StObject.set(x, "loginAccounts", js.Array(value :_*))
  }
}
