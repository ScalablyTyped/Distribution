package typings.googleEarth.google.earth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KmlPoint
  extends StObject
     with KmlExtrudableGeometry {
  
  /**
    * The point's altitude, in meters.
    */
  def getAltitude(): Double
  
  /**
    * The point's latitude, in degrees.
    */
  def getLatitude(): Double
  
  /**
    * The point's longitude, in degrees.
    */
  def getLongitude(): Double
  
  /**
    * Sets altitudeMode, extrude, tessellate, latitude, longitude, and altitude values.
    */
  def set(
    latitude: Double,
    longitude: Double,
    altitude: Double,
    altitudeMode: KmlAltitudeModeEnum,
    extrude: Boolean,
    tessellate: Boolean
  ): Unit
  
  /**
    * The point's altitude, in meters.
    */
  def setAltitude(altitude: Double): Unit
  
  /**
    * Sets the latitude and longitude.
    */
  def setLatLng(latitude: Double, longitude: Double): Unit
  
  /**
    * Sets the latitude, longitude, and altitide.
    */
  def setLatLngAlt(latitude: Double, longitude: Double, altitude: Double): Unit
  
  /**
    * The point's latitude, in degrees.
    */
  def setLatitude(latitude: Double): Unit
  
  /**
    * The point's longitude, in degrees.
    */
  def setLongitude(longitude: Double): Unit
}
object KmlPoint {
  
  inline def apply(
    click: KmlMouseEvent => Unit,
    dblclick: KmlMouseEvent => Unit,
    equals_ : KmlObject => Boolean,
    getAltitude: () => Double,
    getAltitudeMode: () => KmlAltitudeModeEnum,
    getExtrude: () => Boolean,
    getId: () => String,
    getLatitude: () => Double,
    getLongitude: () => Double,
    getOwnerDocument: () => KmlDocument,
    getParentNode: () => KmlObject,
    getTessellate: () => Boolean,
    getType: () => String,
    getUrl: () => String,
    mousedown: KmlMouseEvent => Unit,
    mousemove: KmlMouseEvent => Unit,
    mouseout: KmlMouseEvent => Unit,
    mouseover: KmlMouseEvent => Unit,
    mouseup: KmlMouseEvent => Unit,
    release: () => Unit,
    set: (Double, Double, Double, KmlAltitudeModeEnum, Boolean, Boolean) => Unit,
    setAltitude: Double => Unit,
    setAltitudeMode: KmlAltitudeModeEnum => Unit,
    setExtrude: Boolean => Unit,
    setLatLng: (Double, Double) => Unit,
    setLatLngAlt: (Double, Double, Double) => Unit,
    setLatitude: Double => Unit,
    setLongitude: Double => Unit,
    setTessellate: Boolean => Unit
  ): KmlPoint = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1(click), dblclick = js.Any.fromFunction1(dblclick), getAltitude = js.Any.fromFunction0(getAltitude), getAltitudeMode = js.Any.fromFunction0(getAltitudeMode), getExtrude = js.Any.fromFunction0(getExtrude), getId = js.Any.fromFunction0(getId), getLatitude = js.Any.fromFunction0(getLatitude), getLongitude = js.Any.fromFunction0(getLongitude), getOwnerDocument = js.Any.fromFunction0(getOwnerDocument), getParentNode = js.Any.fromFunction0(getParentNode), getTessellate = js.Any.fromFunction0(getTessellate), getType = js.Any.fromFunction0(getType), getUrl = js.Any.fromFunction0(getUrl), mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove), mouseout = js.Any.fromFunction1(mouseout), mouseover = js.Any.fromFunction1(mouseover), mouseup = js.Any.fromFunction1(mouseup), release = js.Any.fromFunction0(release), set = js.Any.fromFunction6(set), setAltitude = js.Any.fromFunction1(setAltitude), setAltitudeMode = js.Any.fromFunction1(setAltitudeMode), setExtrude = js.Any.fromFunction1(setExtrude), setLatLng = js.Any.fromFunction2(setLatLng), setLatLngAlt = js.Any.fromFunction3(setLatLngAlt), setLatitude = js.Any.fromFunction1(setLatitude), setLongitude = js.Any.fromFunction1(setLongitude), setTessellate = js.Any.fromFunction1(setTessellate))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[KmlPoint]
  }
  
  extension [Self <: KmlPoint](x: Self) {
    
    inline def setGetAltitude(value: () => Double): Self = StObject.set(x, "getAltitude", js.Any.fromFunction0(value))
    
    inline def setGetLatitude(value: () => Double): Self = StObject.set(x, "getLatitude", js.Any.fromFunction0(value))
    
    inline def setGetLongitude(value: () => Double): Self = StObject.set(x, "getLongitude", js.Any.fromFunction0(value))
    
    inline def setSet(value: (Double, Double, Double, KmlAltitudeModeEnum, Boolean, Boolean) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction6(value))
    
    inline def setSetAltitude(value: Double => Unit): Self = StObject.set(x, "setAltitude", js.Any.fromFunction1(value))
    
    inline def setSetLatLng(value: (Double, Double) => Unit): Self = StObject.set(x, "setLatLng", js.Any.fromFunction2(value))
    
    inline def setSetLatLngAlt(value: (Double, Double, Double) => Unit): Self = StObject.set(x, "setLatLngAlt", js.Any.fromFunction3(value))
    
    inline def setSetLatitude(value: Double => Unit): Self = StObject.set(x, "setLatitude", js.Any.fromFunction1(value))
    
    inline def setSetLongitude(value: Double => Unit): Self = StObject.set(x, "setLongitude", js.Any.fromFunction1(value))
  }
}
