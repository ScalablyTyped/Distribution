package typings.expoConfigTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleMaps extends StObject {
  
  /**
    * [Branch](https://branch.io/) key to hook up Branch linking services.
    */
  var branch: js.UndefOr[ApiKey] = js.undefined
  
  /**
    * [Google Maps Android SDK](https://developers.google.com/maps/documentation/android-api/signup) configuration for your standalone app.
    */
  var googleMaps: js.UndefOr[ApiKey] = js.undefined
  
  /**
    * [Google Mobile Ads App ID](https://support.google.com/admob/answer/6232340) Google AdMob App ID.
    */
  var googleMobileAdsAppId: js.UndefOr[String] = js.undefined
  
  /**
    * A boolean indicating whether to initialize Google App Measurement and begin sending user-level event data to Google immediately when the app starts. The default in Expo (Client and in standalone apps) is `false`. [Sets the opposite of the given value to the following key in `Info.plist`](https://developers.google.com/admob/ios/eu-consent#delay_app_measurement_optional)
    */
  var googleMobileAdsAutoInit: js.UndefOr[Boolean] = js.undefined
}
object GoogleMaps {
  
  inline def apply(): GoogleMaps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleMaps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleMaps] (val x: Self) extends AnyVal {
    
    inline def setBranch(value: ApiKey): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
    
    inline def setBranchUndefined: Self = StObject.set(x, "branch", js.undefined)
    
    inline def setGoogleMaps(value: ApiKey): Self = StObject.set(x, "googleMaps", value.asInstanceOf[js.Any])
    
    inline def setGoogleMapsUndefined: Self = StObject.set(x, "googleMaps", js.undefined)
    
    inline def setGoogleMobileAdsAppId(value: String): Self = StObject.set(x, "googleMobileAdsAppId", value.asInstanceOf[js.Any])
    
    inline def setGoogleMobileAdsAppIdUndefined: Self = StObject.set(x, "googleMobileAdsAppId", js.undefined)
    
    inline def setGoogleMobileAdsAutoInit(value: Boolean): Self = StObject.set(x, "googleMobileAdsAutoInit", value.asInstanceOf[js.Any])
    
    inline def setGoogleMobileAdsAutoInitUndefined: Self = StObject.set(x, "googleMobileAdsAutoInit", js.undefined)
  }
}
