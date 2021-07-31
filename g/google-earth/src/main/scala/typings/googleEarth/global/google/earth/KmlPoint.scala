package typings.googleEarth.global.google.earth

import typings.googleEarth.google.earth.KmlAltitudeModeEnum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("google.earth.KmlPoint")
@js.native
class KmlPoint ()
  extends StObject
     with typings.googleEarth.google.earth.KmlPoint {
  
  /**
    * Triggers an event when the user clicks a location in Google Earth with the mouse.
    */
  /* CompleteClass */
  override def click(event: typings.googleEarth.google.earth.KmlMouseEvent): Unit = js.native
  
  /**
    * Triggers an event when the user double clicks a location in Google Earth with the mouse.
    */
  /* CompleteClass */
  override def dblclick(event: typings.googleEarth.google.earth.KmlMouseEvent): Unit = js.native
  
  /**
    * Test whether this object is the same as another object.
    * Useful for Chrome and Safari, where the comparison a==b sometimes fails for plugin objects.
    */
  /* CompleteClass */
  override def equals(compareTo: typings.googleEarth.google.earth.KmlObject): Boolean = js.native
  
  /**
    * The point's altitude, in meters.
    */
  /* CompleteClass */
  override def getAltitude(): Double = js.native
  
  /**
    * Specifies how altitude components in the geometry coordinates are interpreted.
    */
  /* CompleteClass */
  override def getAltitudeMode(): KmlAltitudeModeEnum = js.native
  
  /**
    * Specifies whether to connect the geometry to the ground.
    */
  /* CompleteClass */
  override def getExtrude(): Boolean = js.native
  
  /**
    * The unique ID of the KML object.
    */
  /* CompleteClass */
  override def getId(): String = js.native
  
  /**
    * The point's latitude, in degrees.
    */
  /* CompleteClass */
  override def getLatitude(): Double = js.native
  
  /**
    * The point's longitude, in degrees.
    */
  /* CompleteClass */
  override def getLongitude(): Double = js.native
  
  /**
    * The document that owns the KML object.
    */
  /* CompleteClass */
  override def getOwnerDocument(): typings.googleEarth.google.earth.KmlDocument = js.native
  
  /**
    * The parent node of the KML object.
    */
  /* CompleteClass */
  override def getParentNode(): typings.googleEarth.google.earth.KmlObject = js.native
  
  /**
    * Specifies whether to allow the geometry to follow the terrain elevation.
    */
  /* CompleteClass */
  override def getTessellate(): Boolean = js.native
  
  /**
    * The interface name (i.e. 'KmlPlacemark') of the object.
    */
  /* CompleteClass */
  override def getType(): String = js.native
  
  /**
    * The unique URL of the KML object.
    * This is the base address joined with the ID using the # character.
    *
    * For example: http://www.google.com/bar.kml#atlantis
    */
  /* CompleteClass */
  override def getUrl(): String = js.native
  
  /**
    * Triggers an event when the user presses the mouse button over a location in Google Earth.
    */
  /* CompleteClass */
  override def mousedown(event: typings.googleEarth.google.earth.KmlMouseEvent): Unit = js.native
  
  /**
    * Triggers an event when the user moves the mouse inside Google Earth.
    */
  /* CompleteClass */
  override def mousemove(event: typings.googleEarth.google.earth.KmlMouseEvent): Unit = js.native
  
  /**
    * Triggers an event when the user moves the mouse off of the object in Google Earth.
    */
  /* CompleteClass */
  override def mouseout(event: typings.googleEarth.google.earth.KmlMouseEvent): Unit = js.native
  
  /**
    * Triggers an event when the user moves the mouse pointer over a location in Google Earth.
    */
  /* CompleteClass */
  override def mouseover(event: typings.googleEarth.google.earth.KmlMouseEvent): Unit = js.native
  
  /**
    * Triggers an event when the user releases the mouse button over a location in Google Earth.
    */
  /* CompleteClass */
  override def mouseup(event: typings.googleEarth.google.earth.KmlMouseEvent): Unit = js.native
  
  /**
    * Permanently deletes an object, allowing its ID to be reused.
    * Attempting to access the object once it is released will result in an error.
    */
  /* CompleteClass */
  override def release(): Unit = js.native
  
  /**
    * Sets altitudeMode, extrude, tessellate, latitude, longitude, and altitude values.
    */
  /* CompleteClass */
  override def set(
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
  /* CompleteClass */
  override def setAltitude(altitude: Double): Unit = js.native
  
  /**
    * Specifies how altitude components in the geometry coordinates are interpreted.
    */
  /* CompleteClass */
  override def setAltitudeMode(altitudeMode: KmlAltitudeModeEnum): Unit = js.native
  
  /**
    * Specifies whether to connect the geometry to the ground.
    */
  /* CompleteClass */
  override def setExtrude(extrude: Boolean): Unit = js.native
  
  /**
    * Sets the latitude and longitude.
    */
  /* CompleteClass */
  override def setLatLng(latitude: Double, longitude: Double): Unit = js.native
  
  /**
    * Sets the latitude, longitude, and altitide.
    */
  /* CompleteClass */
  override def setLatLngAlt(latitude: Double, longitude: Double, altitude: Double): Unit = js.native
  
  /**
    * The point's latitude, in degrees.
    */
  /* CompleteClass */
  override def setLatitude(latitude: Double): Unit = js.native
  
  /**
    * The point's longitude, in degrees.
    */
  /* CompleteClass */
  override def setLongitude(longitude: Double): Unit = js.native
  
  /**
    * Specifies whether to allow the geometry to follow the terrain elevation.
    */
  /* CompleteClass */
  override def setTessellate(tessellate: Boolean): Unit = js.native
}
