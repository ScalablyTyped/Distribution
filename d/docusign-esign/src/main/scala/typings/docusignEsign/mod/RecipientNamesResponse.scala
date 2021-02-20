package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecipientNamesResponse extends StObject {
  
  /**
    * When set to **true**, the email address is used by more than one user.
    */
  var multipleUsers: js.UndefOr[String] = js.native
  
  /**
    * The names of the recipients associated with the email address.
    */
  var recipientNames: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * When set to **true**, new names cannot be added to the email address.
    */
  var reservedRecipientEmail: js.UndefOr[String] = js.native
}
object RecipientNamesResponse {
  
  @scala.inline
  def apply(): RecipientNamesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecipientNamesResponse]
  }
  
  @scala.inline
  implicit class RecipientNamesResponseMutableBuilder[Self <: RecipientNamesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMultipleUsers(value: String): Self = StObject.set(x, "multipleUsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipleUsersUndefined: Self = StObject.set(x, "multipleUsers", js.undefined)
    
    @scala.inline
    def setRecipientNames(value: js.Array[String]): Self = StObject.set(x, "recipientNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientNamesUndefined: Self = StObject.set(x, "recipientNames", js.undefined)
    
    @scala.inline
    def setRecipientNamesVarargs(value: String*): Self = StObject.set(x, "recipientNames", js.Array(value :_*))
    
    @scala.inline
    def setReservedRecipientEmail(value: String): Self = StObject.set(x, "reservedRecipientEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservedRecipientEmailUndefined: Self = StObject.set(x, "reservedRecipientEmail", js.undefined)
  }
}
