package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoginInformation extends StObject {
  
  /**
    * Contains a token that can be used for authentication in API calls instead of using the user name and password.
    */
  var apiPassword: js.UndefOr[String] = js.undefined
  
  /**
    * The list of accounts that authenticating user is a member of.
    */
  var loginAccounts: js.UndefOr[js.Array[LoginAccount]] = js.undefined
}
object LoginInformation {
  
  inline def apply(): LoginInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoginInformation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LoginInformation] (val x: Self) extends AnyVal {
    
    inline def setApiPassword(value: String): Self = StObject.set(x, "apiPassword", value.asInstanceOf[js.Any])
    
    inline def setApiPasswordUndefined: Self = StObject.set(x, "apiPassword", js.undefined)
    
    inline def setLoginAccounts(value: js.Array[LoginAccount]): Self = StObject.set(x, "loginAccounts", value.asInstanceOf[js.Any])
    
    inline def setLoginAccountsUndefined: Self = StObject.set(x, "loginAccounts", js.undefined)
    
    inline def setLoginAccountsVarargs(value: LoginAccount*): Self = StObject.set(x, "loginAccounts", js.Array(value*))
  }
}
