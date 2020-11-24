package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecipientNamesResponse extends js.Object {
  
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
  implicit class RecipientNamesResponseOps[Self <: RecipientNamesResponse] (val x: Self) extends AnyVal {
    
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
    def setMultipleUsers(value: String): Self = this.set("multipleUsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultipleUsers: Self = this.set("multipleUsers", js.undefined)
    
    @scala.inline
    def setRecipientNamesVarargs(value: String*): Self = this.set("recipientNames", js.Array(value :_*))
    
    @scala.inline
    def setRecipientNames(value: js.Array[String]): Self = this.set("recipientNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipientNames: Self = this.set("recipientNames", js.undefined)
    
    @scala.inline
    def setReservedRecipientEmail(value: String): Self = this.set("reservedRecipientEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReservedRecipientEmail: Self = this.set("reservedRecipientEmail", js.undefined)
  }
}
