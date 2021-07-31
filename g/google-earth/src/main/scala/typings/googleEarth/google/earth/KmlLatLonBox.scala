package typings.googleEarth.google.earth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KmlLatLonBox
  extends StObject
     with KmlObject {
  
  /**
    * Specifies the longitude of the east edge of the bounding box, in decimal degrees from -180 to 180.
    * (For overlays that overlap the meridian of 180 degrees longitude, values can extend beyond that range.)
    */
  def getEast(): Double
  
  /**
    * Specifies the latitude of the north edge of the bounding box, in decimal degrees from -90 to 90.
    */
  def getNorth(): Double
  
  /**
    * Specifies a rotation of the overlay about its center, in degrees.
    * Values can be +/-180. The default is 0 (north).
    * Rotations are specified in a counterclockwise direction.
    */
  def getRotation(): Double
  
  /**
    * Specifies the latitude of the south edge of the bounding box, in decimal degrees from -90 to 90.
    */
  def getSouth(): Double
  
  /**
    * Specifies the longitude of the west edge of the bounding box, in decimal degrees from -180 to 180.
    * (For overlays that overlap the meridian of 180 degrees longitude, values can extend beyond that range.)
    */
  def getWest(): Double
  
  /**
    * Sets the north, south, east, and west edges of the bounding box, as well as the rotation of the overlay.
    */
  def setBox(north: Double, south: Double, east: Double, west: Double, rotation: Double): Unit
  
  /**
    * Specifies the longitude of the east edge of the bounding box, in decimal degrees from -180 to 180.
    * (For overlays that overlap the meridian of 180 degrees longitude, values can extend beyond that range.)
    */
  def setEast(east: Double): Unit
  
  /**
    * Specifies the latitude of the north edge of the bounding box, in decimal degrees from -90 to 90.
    */
  def setNorth(north: Double): Unit
  
  /**
    * Specifies a rotation of the overlay about its center, in degrees.
    * Values can be +/-180. The default is 0 (north).
    * Rotations are specified in a counterclockwise direction.
    */
  def setRotation(rotation: Double): Unit
  
  /**
    * Specifies the latitude of the south edge of the bounding box, in decimal degrees from -90 to 90.
    */
  def setSouth(south: Double): Unit
  
  /**
    * Specifies the longitude of the west edge of the bounding box, in decimal degrees from -180 to 180.
    * (For overlays that overlap the meridian of 180 degrees longitude, values can extend beyond that range.)
    */
  def setWest(west: Double): Unit
}
object KmlLatLonBox {
  
  @scala.inline
  def apply(
    click: KmlMouseEvent => Unit,
    dblclick: KmlMouseEvent => Unit,
    equals_ : KmlObject => Boolean,
    getEast: () => Double,
    getId: () => String,
    getNorth: () => Double,
    getOwnerDocument: () => KmlDocument,
    getParentNode: () => KmlObject,
    getRotation: () => Double,
    getSouth: () => Double,
    getType: () => String,
    getUrl: () => String,
    getWest: () => Double,
    mousedown: KmlMouseEvent => Unit,
    mousemove: KmlMouseEvent => Unit,
    mouseout: KmlMouseEvent => Unit,
    mouseover: KmlMouseEvent => Unit,
    mouseup: KmlMouseEvent => Unit,
    release: () => Unit,
    setBox: (Double, Double, Double, Double, Double) => Unit,
    setEast: Double => Unit,
    setNorth: Double => Unit,
    setRotation: Double => Unit,
    setSouth: Double => Unit,
    setWest: Double => Unit
  ): KmlLatLonBox = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1(click), dblclick = js.Any.fromFunction1(dblclick), getEast = js.Any.fromFunction0(getEast), getId = js.Any.fromFunction0(getId), getNorth = js.Any.fromFunction0(getNorth), getOwnerDocument = js.Any.fromFunction0(getOwnerDocument), getParentNode = js.Any.fromFunction0(getParentNode), getRotation = js.Any.fromFunction0(getRotation), getSouth = js.Any.fromFunction0(getSouth), getType = js.Any.fromFunction0(getType), getUrl = js.Any.fromFunction0(getUrl), getWest = js.Any.fromFunction0(getWest), mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove), mouseout = js.Any.fromFunction1(mouseout), mouseover = js.Any.fromFunction1(mouseover), mouseup = js.Any.fromFunction1(mouseup), release = js.Any.fromFunction0(release), setBox = js.Any.fromFunction5(setBox), setEast = js.Any.fromFunction1(setEast), setNorth = js.Any.fromFunction1(setNorth), setRotation = js.Any.fromFunction1(setRotation), setSouth = js.Any.fromFunction1(setSouth), setWest = js.Any.fromFunction1(setWest))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[KmlLatLonBox]
  }
  
  @scala.inline
  implicit class KmlLatLonBoxMutableBuilder[Self <: KmlLatLonBox] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetEast(value: () => Double): Self = StObject.set(x, "getEast", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNorth(value: () => Double): Self = StObject.set(x, "getNorth", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRotation(value: () => Double): Self = StObject.set(x, "getRotation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSouth(value: () => Double): Self = StObject.set(x, "getSouth", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetWest(value: () => Double): Self = StObject.set(x, "getWest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetBox(value: (Double, Double, Double, Double, Double) => Unit): Self = StObject.set(x, "setBox", js.Any.fromFunction5(value))
    
    @scala.inline
    def setSetEast(value: Double => Unit): Self = StObject.set(x, "setEast", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetNorth(value: Double => Unit): Self = StObject.set(x, "setNorth", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetRotation(value: Double => Unit): Self = StObject.set(x, "setRotation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSouth(value: Double => Unit): Self = StObject.set(x, "setSouth", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetWest(value: Double => Unit): Self = StObject.set(x, "setWest", js.Any.fromFunction1(value))
  }
}
