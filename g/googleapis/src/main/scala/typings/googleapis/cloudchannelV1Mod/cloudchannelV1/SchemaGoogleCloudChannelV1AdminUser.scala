package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudChannelV1AdminUser extends StObject {
  
  /**
    * Primary email of the admin user.
    */
  var email: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Family name of the admin user.
    */
  var familyName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Given name of the admin user.
    */
  var givenName: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudChannelV1AdminUser {
  
  inline def apply(): SchemaGoogleCloudChannelV1AdminUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudChannelV1AdminUser]
  }
  
  extension [Self <: SchemaGoogleCloudChannelV1AdminUser](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setFamilyName(value: String): Self = StObject.set(x, "familyName", value.asInstanceOf[js.Any])
    
    inline def setFamilyNameNull: Self = StObject.set(x, "familyName", null)
    
    inline def setFamilyNameUndefined: Self = StObject.set(x, "familyName", js.undefined)
    
    inline def setGivenName(value: String): Self = StObject.set(x, "givenName", value.asInstanceOf[js.Any])
    
    inline def setGivenNameNull: Self = StObject.set(x, "givenName", null)
    
    inline def setGivenNameUndefined: Self = StObject.set(x, "givenName", js.undefined)
  }
}
