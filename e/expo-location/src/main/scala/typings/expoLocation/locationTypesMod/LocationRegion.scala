package typings.expoLocation.locationTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationRegion extends StObject {
  
  var identifier: js.UndefOr[String] = js.native
  
  var latitude: Double = js.native
  
  var longitude: Double = js.native
  
  var notifyOnEnter: js.UndefOr[Boolean] = js.native
  
  var notifyOnExit: js.UndefOr[Boolean] = js.native
  
  var radius: Double = js.native
}
object LocationRegion {
  
  @scala.inline
  def apply(latitude: Double, longitude: Double, radius: Double): LocationRegion = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationRegion]
  }
  
  @scala.inline
  implicit class LocationRegionMutableBuilder[Self <: LocationRegion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    @scala.inline
    def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotifyOnEnter(value: Boolean): Self = StObject.set(x, "notifyOnEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotifyOnEnterUndefined: Self = StObject.set(x, "notifyOnEnter", js.undefined)
    
    @scala.inline
    def setNotifyOnExit(value: Boolean): Self = StObject.set(x, "notifyOnExit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotifyOnExitUndefined: Self = StObject.set(x, "notifyOnExit", js.undefined)
    
    @scala.inline
    def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
  }
}
