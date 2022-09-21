package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEmailAddress extends StObject {
  
  /**
    * If the value of type is custom, this property contains the custom type string.
    */
  var customType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The email address.
    */
  var emailAddress: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The URL to send email.
    */
  var emailUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Indicates if this is the user's primary email. Only one entry can be marked as primary.
    */
  var primary: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The type of the email account. Acceptable values are: "custom", "home", "other", "work".
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaEmailAddress {
  
  inline def apply(): SchemaEmailAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEmailAddress]
  }
  
  extension [Self <: SchemaEmailAddress](x: Self) {
    
    inline def setCustomType(value: String): Self = StObject.set(x, "customType", value.asInstanceOf[js.Any])
    
    inline def setCustomTypeNull: Self = StObject.set(x, "customType", null)
    
    inline def setCustomTypeUndefined: Self = StObject.set(x, "customType", js.undefined)
    
    inline def setEmailAddress(value: String): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
    
    inline def setEmailAddressNull: Self = StObject.set(x, "emailAddress", null)
    
    inline def setEmailAddressUndefined: Self = StObject.set(x, "emailAddress", js.undefined)
    
    inline def setEmailUrl(value: String): Self = StObject.set(x, "emailUrl", value.asInstanceOf[js.Any])
    
    inline def setEmailUrlNull: Self = StObject.set(x, "emailUrl", null)
    
    inline def setEmailUrlUndefined: Self = StObject.set(x, "emailUrl", js.undefined)
    
    inline def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    inline def setPrimaryNull: Self = StObject.set(x, "primary", null)
    
    inline def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
