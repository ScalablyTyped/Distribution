package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudChannelV1MarketingInfo extends StObject {
  
  /**
    * Default logo.
    */
  var defaultLogo: js.UndefOr[SchemaGoogleCloudChannelV1Media] = js.undefined
  
  /**
    * Human readable description. Description can contain HTML.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Human readable name.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudChannelV1MarketingInfo {
  
  inline def apply(): SchemaGoogleCloudChannelV1MarketingInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudChannelV1MarketingInfo]
  }
  
  extension [Self <: SchemaGoogleCloudChannelV1MarketingInfo](x: Self) {
    
    inline def setDefaultLogo(value: SchemaGoogleCloudChannelV1Media): Self = StObject.set(x, "defaultLogo", value.asInstanceOf[js.Any])
    
    inline def setDefaultLogoUndefined: Self = StObject.set(x, "defaultLogo", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
  }
}
