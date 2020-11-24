package typings.googleEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KmlPoint extends KmlExtrudableGeometry {
  
  /**
    * The point's altitude, in meters.
    */
  def getAltitude(): Double = js.native
  
  /**
    * The point's latitude, in degrees.
    */
  def getLatitude(): Double = js.native
  
  /**
    * The point's longitude, in degrees.
    */
  def getLongitude(): Double = js.native
  
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
  ): Unit = js.native
  
  /**
    * The point's altitude, in meters.
    */
  def setAltitude(altitude: Double): Unit = js.native
  
  /**
    * Sets the latitude and longitude.
    */
  def setLatLng(latitude: Double, longitude: Double): Unit = js.native
  
  /**
    * Sets the latitude, longitude, and altitide.
    */
  def setLatLngAlt(latitude: Double, longitude: Double, altitude: Double): Unit = js.native
  
  /**
    * The point's latitude, in degrees.
    */
  def setLatitude(latitude: Double): Unit = js.native
  
  /**
    * The point's longitude, in degrees.
    */
  def setLongitude(longitude: Double): Unit = js.native
}
object KmlPoint {
  
  @scala.inline
  def apply(
    click: KmlMouseEvent => Unit,
    dblclick: KmlMouseEvent => Unit,
    equals: KmlObject => Boolean,
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
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1(click), dblclick = js.Any.fromFunction1(dblclick), equals = js.Any.fromFunction1(equals), getAltitude = js.Any.fromFunction0(getAltitude), getAltitudeMode = js.Any.fromFunction0(getAltitudeMode), getExtrude = js.Any.fromFunction0(getExtrude), getId = js.Any.fromFunction0(getId), getLatitude = js.Any.fromFunction0(getLatitude), getLongitude = js.Any.fromFunction0(getLongitude), getOwnerDocument = js.Any.fromFunction0(getOwnerDocument), getParentNode = js.Any.fromFunction0(getParentNode), getTessellate = js.Any.fromFunction0(getTessellate), getType = js.Any.fromFunction0(getType), getUrl = js.Any.fromFunction0(getUrl), mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove), mouseout = js.Any.fromFunction1(mouseout), mouseover = js.Any.fromFunction1(mouseover), mouseup = js.Any.fromFunction1(mouseup), release = js.Any.fromFunction0(release), set = js.Any.fromFunction6(set), setAltitude = js.Any.fromFunction1(setAltitude), setAltitudeMode = js.Any.fromFunction1(setAltitudeMode), setExtrude = js.Any.fromFunction1(setExtrude), setLatLng = js.Any.fromFunction2(setLatLng), setLatLngAlt = js.Any.fromFunction3(setLatLngAlt), setLatitude = js.Any.fromFunction1(setLatitude), setLongitude = js.Any.fromFunction1(setLongitude), setTessellate = js.Any.fromFunction1(setTessellate))
    __obj.asInstanceOf[KmlPoint]
  }
  
  @scala.inline
  implicit class KmlPointOps[Self <: KmlPoint] (val x: Self) extends AnyVal {
    
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
    def setGetAltitude(value: () => Double): Self = this.set("getAltitude", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLatitude(value: () => Double): Self = this.set("getLatitude", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLongitude(value: () => Double): Self = this.set("getLongitude", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet(value: (Double, Double, Double, KmlAltitudeModeEnum, Boolean, Boolean) => Unit): Self = this.set("set", js.Any.fromFunction6(value))
    
    @scala.inline
    def setSetAltitude(value: Double => Unit): Self = this.set("setAltitude", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetLatLng(value: (Double, Double) => Unit): Self = this.set("setLatLng", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetLatLngAlt(value: (Double, Double, Double) => Unit): Self = this.set("setLatLngAlt", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSetLatitude(value: Double => Unit): Self = this.set("setLatitude", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetLongitude(value: Double => Unit): Self = this.set("setLongitude", js.Any.fromFunction1(value))
  }
}
