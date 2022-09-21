package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecipientNamesResponse extends StObject {
  
  /**
    * When set to **true**, the email address is used by more than one user.
    */
  var multipleUsers: js.UndefOr[String] = js.undefined
  
  /**
    * The names of the recipients associated with the email address.
    */
  var recipientNames: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * When set to **true**, new names cannot be added to the email address.
    */
  var reservedRecipientEmail: js.UndefOr[String] = js.undefined
}
object RecipientNamesResponse {
  
  inline def apply(): RecipientNamesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecipientNamesResponse]
  }
  
  extension [Self <: RecipientNamesResponse](x: Self) {
    
    inline def setMultipleUsers(value: String): Self = StObject.set(x, "multipleUsers", value.asInstanceOf[js.Any])
    
    inline def setMultipleUsersUndefined: Self = StObject.set(x, "multipleUsers", js.undefined)
    
    inline def setRecipientNames(value: js.Array[String]): Self = StObject.set(x, "recipientNames", value.asInstanceOf[js.Any])
    
    inline def setRecipientNamesUndefined: Self = StObject.set(x, "recipientNames", js.undefined)
    
    inline def setRecipientNamesVarargs(value: String*): Self = StObject.set(x, "recipientNames", js.Array(value*))
    
    inline def setReservedRecipientEmail(value: String): Self = StObject.set(x, "reservedRecipientEmail", value.asInstanceOf[js.Any])
    
    inline def setReservedRecipientEmailUndefined: Self = StObject.set(x, "reservedRecipientEmail", js.undefined)
  }
}
