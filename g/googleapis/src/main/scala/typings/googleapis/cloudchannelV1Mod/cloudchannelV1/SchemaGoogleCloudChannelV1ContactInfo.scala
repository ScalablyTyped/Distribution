package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudChannelV1ContactInfo extends StObject {
  
  /**
    * Output only. The customer account contact's display name, formatted as a combination of the customer's first and last name.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The customer account's contact email. Required for entitlements that create admin.google.com accounts, and serves as the customer's username for those accounts. Use this email to invite Team customers.
    */
  var email: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The customer account contact's first name. Optional for Team customers.
    */
  var firstName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The customer account contact's last name. Optional for Team customers.
    */
  var lastName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The customer account's contact phone number.
    */
  var phone: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The customer account contact's job title.
    */
  var title: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudChannelV1ContactInfo {
  
  inline def apply(): SchemaGoogleCloudChannelV1ContactInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudChannelV1ContactInfo]
  }
  
  extension [Self <: SchemaGoogleCloudChannelV1ContactInfo](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setFirstName(value: String): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
    
    inline def setFirstNameNull: Self = StObject.set(x, "firstName", null)
    
    inline def setFirstNameUndefined: Self = StObject.set(x, "firstName", js.undefined)
    
    inline def setLastName(value: String): Self = StObject.set(x, "lastName", value.asInstanceOf[js.Any])
    
    inline def setLastNameNull: Self = StObject.set(x, "lastName", null)
    
    inline def setLastNameUndefined: Self = StObject.set(x, "lastName", js.undefined)
    
    inline def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    inline def setPhoneNull: Self = StObject.set(x, "phone", null)
    
    inline def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
