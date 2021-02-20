package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContactPhoneNumber extends StObject {
  
  /**
    * The contact's phone number.
    *
    * Example: `+12223334444`
    */
  var phoneNumber: js.UndefOr[String] = js.native
  
  /**
    * The type of phone number. Valid values are:
    *
    * - `home`
    * - `mobile`
    * - `work`
    * - `other`
    * - `fax`
    */
  var phoneType: js.UndefOr[String] = js.native
}
object ContactPhoneNumber {
  
  @scala.inline
  def apply(): ContactPhoneNumber = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContactPhoneNumber]
  }
  
  @scala.inline
  implicit class ContactPhoneNumberMutableBuilder[Self <: ContactPhoneNumber] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
    
    @scala.inline
    def setPhoneType(value: String): Self = StObject.set(x, "phoneType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneTypeUndefined: Self = StObject.set(x, "phoneType", js.undefined)
  }
}
