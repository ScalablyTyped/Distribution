package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PayPalLegacySettings extends StObject {
  
  /**
    * The three-letter
    * [ISO 4217][ISO4217] currency code for the payment.
    *
    * For example:
    *
    * * AUD Australian dollar
    * * CAD Canadian dollar
    * * EUR Euro
    * * GBP Great Britain pound
    * * USD United States dollar
    *
    * This is a read-only property.
    *
    * [ISO4217]:          https://en.wikipedia.org/wiki/ISO_4217
    *
    */
  var currency: js.UndefOr[String] = js.native
  
  var partner: js.UndefOr[String] = js.native
  
  /**
    * The user's encrypted password hash.
    */
  var password: js.UndefOr[String] = js.native
  
  /**
    * The name of the user.
    */
  var userName: js.UndefOr[String] = js.native
  
  var vendor: js.UndefOr[String] = js.native
}
object PayPalLegacySettings {
  
  @scala.inline
  def apply(): PayPalLegacySettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PayPalLegacySettings]
  }
  
  @scala.inline
  implicit class PayPalLegacySettingsMutableBuilder[Self <: PayPalLegacySettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    @scala.inline
    def setPartner(value: String): Self = StObject.set(x, "partner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartnerUndefined: Self = StObject.set(x, "partner", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    @scala.inline
    def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserNameUndefined: Self = StObject.set(x, "userName", js.undefined)
    
    @scala.inline
    def setVendor(value: String): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVendorUndefined: Self = StObject.set(x, "vendor", js.undefined)
  }
}
