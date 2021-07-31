package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecipientIdentityPhoneNumber extends StObject {
  
  /**
    * The three-letter code for the user's country.
    */
  var countryCode: js.UndefOr[String] = js.undefined
  
  var `extension`: js.UndefOr[String] = js.undefined
  
  var number: js.UndefOr[String] = js.undefined
}
object RecipientIdentityPhoneNumber {
  
  @scala.inline
  def apply(): RecipientIdentityPhoneNumber = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecipientIdentityPhoneNumber]
  }
  
  @scala.inline
  implicit class RecipientIdentityPhoneNumberMutableBuilder[Self <: RecipientIdentityPhoneNumber] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryCodeUndefined: Self = StObject.set(x, "countryCode", js.undefined)
    
    @scala.inline
    def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
    
    @scala.inline
    def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
  }
}
