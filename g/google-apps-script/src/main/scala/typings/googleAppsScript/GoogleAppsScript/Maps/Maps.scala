package typings.googleAppsScript.GoogleAppsScript.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Allows for direction finding, geocoding, elevation sampling and the creation of static map
  * images.
  */
trait Maps extends StObject {
  
  var DirectionFinder: DirectionFinderEnums
  
  var StaticMap: StaticMapEnums
  
  def decodePolyline(polyline: String): js.Array[Double]
  
  def encodePolyline(points: js.Array[Double]): String
  
  def newDirectionFinder(): DirectionFinder
  
  def newElevationSampler(): ElevationSampler
  
  def newGeocoder(): Geocoder
  
  def newStaticMap(): StaticMap
  
  def setAuthentication(clientId: String, signingKey: String): Unit
}
object Maps {
  
  inline def apply(
    DirectionFinder: DirectionFinderEnums,
    StaticMap: StaticMapEnums,
    decodePolyline: String => js.Array[Double],
    encodePolyline: js.Array[Double] => String,
    newDirectionFinder: () => DirectionFinder,
    newElevationSampler: () => ElevationSampler,
    newGeocoder: () => Geocoder,
    newStaticMap: () => StaticMap,
    setAuthentication: (String, String) => Unit
  ): typings.googleAppsScript.GoogleAppsScript.Maps.Maps = {
    val __obj = js.Dynamic.literal(DirectionFinder = DirectionFinder.asInstanceOf[js.Any], StaticMap = StaticMap.asInstanceOf[js.Any], decodePolyline = js.Any.fromFunction1(decodePolyline), encodePolyline = js.Any.fromFunction1(encodePolyline), newDirectionFinder = js.Any.fromFunction0(newDirectionFinder), newElevationSampler = js.Any.fromFunction0(newElevationSampler), newGeocoder = js.Any.fromFunction0(newGeocoder), newStaticMap = js.Any.fromFunction0(newStaticMap), setAuthentication = js.Any.fromFunction2(setAuthentication))
    __obj.asInstanceOf[typings.googleAppsScript.GoogleAppsScript.Maps.Maps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: typings.googleAppsScript.GoogleAppsScript.Maps.Maps] (val x: Self) extends AnyVal {
    
    inline def setDecodePolyline(value: String => js.Array[Double]): Self = StObject.set(x, "decodePolyline", js.Any.fromFunction1(value))
    
    inline def setDirectionFinder(value: DirectionFinderEnums): Self = StObject.set(x, "DirectionFinder", value.asInstanceOf[js.Any])
    
    inline def setEncodePolyline(value: js.Array[Double] => String): Self = StObject.set(x, "encodePolyline", js.Any.fromFunction1(value))
    
    inline def setNewDirectionFinder(value: () => DirectionFinder): Self = StObject.set(x, "newDirectionFinder", js.Any.fromFunction0(value))
    
    inline def setNewElevationSampler(value: () => ElevationSampler): Self = StObject.set(x, "newElevationSampler", js.Any.fromFunction0(value))
    
    inline def setNewGeocoder(value: () => Geocoder): Self = StObject.set(x, "newGeocoder", js.Any.fromFunction0(value))
    
    inline def setNewStaticMap(value: () => StaticMap): Self = StObject.set(x, "newStaticMap", js.Any.fromFunction0(value))
    
    inline def setSetAuthentication(value: (String, String) => Unit): Self = StObject.set(x, "setAuthentication", js.Any.fromFunction2(value))
    
    inline def setStaticMap(value: StaticMapEnums): Self = StObject.set(x, "StaticMap", value.asInstanceOf[js.Any])
  }
}
