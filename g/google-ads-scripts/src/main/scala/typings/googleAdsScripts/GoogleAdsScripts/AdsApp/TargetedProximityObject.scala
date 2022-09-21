package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Plain JavaScript objects describing a proximity. */
trait TargetedProximityObject extends StObject {
  
  var address: js.UndefOr[AddressObject] = js.undefined
  
  var bidModifier: js.UndefOr[Double] = js.undefined
  
  var latitude: Double
  
  var longitude: Double
  
  var radius: Double
  
  var radiusUnits: String
}
object TargetedProximityObject {
  
  inline def apply(latitude: Double, longitude: Double, radius: Double, radiusUnits: String): TargetedProximityObject = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], radiusUnits = radiusUnits.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetedProximityObject]
  }
  
  extension [Self <: TargetedProximityObject](x: Self) {
    
    inline def setAddress(value: AddressObject): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setBidModifier(value: Double): Self = StObject.set(x, "bidModifier", value.asInstanceOf[js.Any])
    
    inline def setBidModifierUndefined: Self = StObject.set(x, "bidModifier", js.undefined)
    
    inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusUnits(value: String): Self = StObject.set(x, "radiusUnits", value.asInstanceOf[js.Any])
  }
}
