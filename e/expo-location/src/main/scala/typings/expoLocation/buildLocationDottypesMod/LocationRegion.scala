package typings.expoLocation.buildLocationDottypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationRegion extends StObject {
  
  /**
    * The identifier of the region object. Defaults to auto-generated UUID hash.
    */
  var identifier: js.UndefOr[String] = js.undefined
  
  /**
    * The latitude in degrees of region's center point.
    */
  var latitude: Double
  
  /**
    * The longitude in degrees of region's center point.
    */
  var longitude: Double
  
  /**
    * Boolean value whether to call the task if the device enters the region.
    * @default true
    */
  var notifyOnEnter: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Boolean value whether to call the task if the device exits the region.
    * @default true
    */
  var notifyOnExit: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The radius measured in meters that defines the region's outer boundary.
    */
  var radius: Double
  
  /**
    * One of [GeofencingRegionState](#geofencingregionstate) region state. Determines whether the
    * device is inside or outside a region.
    */
  var state: js.UndefOr[LocationGeofencingRegionState] = js.undefined
}
object LocationRegion {
  
  inline def apply(latitude: Double, longitude: Double, radius: Double): LocationRegion = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationRegion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LocationRegion] (val x: Self) extends AnyVal {
    
    inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    inline def setNotifyOnEnter(value: Boolean): Self = StObject.set(x, "notifyOnEnter", value.asInstanceOf[js.Any])
    
    inline def setNotifyOnEnterUndefined: Self = StObject.set(x, "notifyOnEnter", js.undefined)
    
    inline def setNotifyOnExit(value: Boolean): Self = StObject.set(x, "notifyOnExit", value.asInstanceOf[js.Any])
    
    inline def setNotifyOnExitUndefined: Self = StObject.set(x, "notifyOnExit", js.undefined)
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setState(value: LocationGeofencingRegionState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
