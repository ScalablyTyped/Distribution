package typings.googleapis.admobV1Mod.admobV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAdUnit extends StObject {
  
  /**
    * AdFormat of the ad unit. Possible values are as follows: "BANNER" - Banner ad format. "BANNER_INTERSTITIAL" - Legacy format that can be used as either banner or interstitial. This format can no longer be created but can be targeted by mediation groups. "INTERSTITIAL" - A full screen ad. Supported ad types are "RICH_MEDIA" and "VIDEO". "NATIVE" - Native ad format. "REWARDED" - An ad that, once viewed, gets a callback verifying the view so that a reward can be given to the user. Supported ad types are "RICH_MEDIA" (interactive) and video where video can not be excluded.
    */
  var adFormat: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Ad media type supported by this ad unit. Possible values as follows: "RICH_MEDIA" - Text, image, and other non-video media. "VIDEO" - Video media.
    */
  var adTypes: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The externally visible ID of the ad unit which can be used to integrate with the AdMob SDK. This is a read only property. Example: ca-app-pub-9876543210987654/0123456789
    */
  var adUnitId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The externally visible ID of the app this ad unit is associated with. Example: ca-app-pub-9876543210987654~0123456789
    */
  var appId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The display name of the ad unit as shown in the AdMob UI, which is provided by the user. The maximum length allowed is 80 characters.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Resource name for this ad unit. Format is accounts/{publisher_id\}/adUnits/{ad_unit_id_fragment\} Example: accounts/pub-9876543210987654/adUnits/0123456789
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaAdUnit {
  
  inline def apply(): SchemaAdUnit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdUnit]
  }
  
  extension [Self <: SchemaAdUnit](x: Self) {
    
    inline def setAdFormat(value: String): Self = StObject.set(x, "adFormat", value.asInstanceOf[js.Any])
    
    inline def setAdFormatNull: Self = StObject.set(x, "adFormat", null)
    
    inline def setAdFormatUndefined: Self = StObject.set(x, "adFormat", js.undefined)
    
    inline def setAdTypes(value: js.Array[String]): Self = StObject.set(x, "adTypes", value.asInstanceOf[js.Any])
    
    inline def setAdTypesNull: Self = StObject.set(x, "adTypes", null)
    
    inline def setAdTypesUndefined: Self = StObject.set(x, "adTypes", js.undefined)
    
    inline def setAdTypesVarargs(value: String*): Self = StObject.set(x, "adTypes", js.Array(value*))
    
    inline def setAdUnitId(value: String): Self = StObject.set(x, "adUnitId", value.asInstanceOf[js.Any])
    
    inline def setAdUnitIdNull: Self = StObject.set(x, "adUnitId", null)
    
    inline def setAdUnitIdUndefined: Self = StObject.set(x, "adUnitId", js.undefined)
    
    inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setAppIdNull: Self = StObject.set(x, "appId", null)
    
    inline def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
