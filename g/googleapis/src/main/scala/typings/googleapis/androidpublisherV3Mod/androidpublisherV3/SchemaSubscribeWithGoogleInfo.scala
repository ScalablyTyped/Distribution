package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSubscribeWithGoogleInfo extends StObject {
  
  /**
    * The email address of the user when the subscription was purchased.
    */
  var emailAddress: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The family name of the user when the subscription was purchased.
    */
  var familyName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The given name of the user when the subscription was purchased.
    */
  var givenName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The Google profile id of the user when the subscription was purchased.
    */
  var profileId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The profile name of the user when the subscription was purchased.
    */
  var profileName: js.UndefOr[String | Null] = js.undefined
}
object SchemaSubscribeWithGoogleInfo {
  
  inline def apply(): SchemaSubscribeWithGoogleInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSubscribeWithGoogleInfo]
  }
  
  extension [Self <: SchemaSubscribeWithGoogleInfo](x: Self) {
    
    inline def setEmailAddress(value: String): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
    
    inline def setEmailAddressNull: Self = StObject.set(x, "emailAddress", null)
    
    inline def setEmailAddressUndefined: Self = StObject.set(x, "emailAddress", js.undefined)
    
    inline def setFamilyName(value: String): Self = StObject.set(x, "familyName", value.asInstanceOf[js.Any])
    
    inline def setFamilyNameNull: Self = StObject.set(x, "familyName", null)
    
    inline def setFamilyNameUndefined: Self = StObject.set(x, "familyName", js.undefined)
    
    inline def setGivenName(value: String): Self = StObject.set(x, "givenName", value.asInstanceOf[js.Any])
    
    inline def setGivenNameNull: Self = StObject.set(x, "givenName", null)
    
    inline def setGivenNameUndefined: Self = StObject.set(x, "givenName", js.undefined)
    
    inline def setProfileId(value: String): Self = StObject.set(x, "profileId", value.asInstanceOf[js.Any])
    
    inline def setProfileIdNull: Self = StObject.set(x, "profileId", null)
    
    inline def setProfileIdUndefined: Self = StObject.set(x, "profileId", js.undefined)
    
    inline def setProfileName(value: String): Self = StObject.set(x, "profileName", value.asInstanceOf[js.Any])
    
    inline def setProfileNameNull: Self = StObject.set(x, "profileName", null)
    
    inline def setProfileNameUndefined: Self = StObject.set(x, "profileName", js.undefined)
  }
}
