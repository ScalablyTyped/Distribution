package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProximityObject extends StObject {
  
  var address: js.UndefOr[AddressObject] = js.native
  
  var bidModifier: js.UndefOr[Double] = js.native
  
  var latitude: Double = js.native
  
  var longitude: Double = js.native
  
  var radius: Double = js.native
  
  var radiusUnits: RadiusUnits = js.native
}
object ProximityObject {
  
  @scala.inline
  def apply(latitude: Double, longitude: Double, radius: Double, radiusUnits: RadiusUnits): ProximityObject = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], radiusUnits = radiusUnits.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProximityObject]
  }
  
  @scala.inline
  implicit class ProximityObjectMutableBuilder[Self <: ProximityObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: AddressObject): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    @scala.inline
    def setBidModifier(value: Double): Self = StObject.set(x, "bidModifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBidModifierUndefined: Self = StObject.set(x, "bidModifier", js.undefined)
    
    @scala.inline
    def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusUnits(value: RadiusUnits): Self = StObject.set(x, "radiusUnits", value.asInstanceOf[js.Any])
  }
}
