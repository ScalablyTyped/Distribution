package typings.googleAppsScript.GoogleAppsScript.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Allows for direction finding, geocoding, elevation sampling and the creation of static map
  * images.
  */
@js.native
trait Maps extends js.Object {
  
  var DirectionFinder: DirectionFinderEnums = js.native
  
  var StaticMap: StaticMapEnums = js.native
  
  def decodePolyline(polyline: String): js.Array[Double] = js.native
  
  def encodePolyline(points: js.Array[Double]): String = js.native
  
  def newDirectionFinder(): DirectionFinder = js.native
  
  def newElevationSampler(): ElevationSampler = js.native
  
  def newGeocoder(): Geocoder = js.native
  
  def newStaticMap(): StaticMap = js.native
  
  def setAuthentication(clientId: String, signingKey: String): Unit = js.native
}
object Maps {
  
  @scala.inline
  def apply(
    DirectionFinder: DirectionFinderEnums,
    StaticMap: StaticMapEnums,
    decodePolyline: String => js.Array[Double],
    encodePolyline: js.Array[Double] => String,
    newDirectionFinder: () => DirectionFinder,
    newElevationSampler: () => ElevationSampler,
    newGeocoder: () => Geocoder,
    newStaticMap: () => StaticMap,
    setAuthentication: (String, String) => Unit
  ): Maps = {
    val __obj = js.Dynamic.literal(DirectionFinder = DirectionFinder.asInstanceOf[js.Any], StaticMap = StaticMap.asInstanceOf[js.Any], decodePolyline = js.Any.fromFunction1(decodePolyline), encodePolyline = js.Any.fromFunction1(encodePolyline), newDirectionFinder = js.Any.fromFunction0(newDirectionFinder), newElevationSampler = js.Any.fromFunction0(newElevationSampler), newGeocoder = js.Any.fromFunction0(newGeocoder), newStaticMap = js.Any.fromFunction0(newStaticMap), setAuthentication = js.Any.fromFunction2(setAuthentication))
    __obj.asInstanceOf[Maps]
  }
  
  @scala.inline
  implicit class MapsOps[Self <: typings.googleAppsScript.GoogleAppsScript.Maps.Maps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDirectionFinder(value: DirectionFinderEnums): Self = this.set("DirectionFinder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaticMap(value: StaticMapEnums): Self = this.set("StaticMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecodePolyline(value: String => js.Array[Double]): Self = this.set("decodePolyline", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEncodePolyline(value: js.Array[Double] => String): Self = this.set("encodePolyline", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNewDirectionFinder(value: () => DirectionFinder): Self = this.set("newDirectionFinder", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewElevationSampler(value: () => ElevationSampler): Self = this.set("newElevationSampler", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewGeocoder(value: () => Geocoder): Self = this.set("newGeocoder", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewStaticMap(value: () => StaticMap): Self = this.set("newStaticMap", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetAuthentication(value: (String, String) => Unit): Self = this.set("setAuthentication", js.Any.fromFunction2(value))
  }
}
