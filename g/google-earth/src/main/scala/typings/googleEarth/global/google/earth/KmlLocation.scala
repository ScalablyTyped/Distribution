package typings.googleEarth.global.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.earth.KmlLocation")
@js.native
class KmlLocation ()
  extends typings.googleEarth.google.earth.KmlLocation {
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
    * Specifies the distance above the earth's surface.
    */
  /* CompleteClass */
  override def getAltitude(): Double = js.native
  /**
    * The unique ID of the KML object.
    */
  /* CompleteClass */
  override def getId(): String = js.native
  /**
    * Latitude of the camera location.
    * Degrees north or south of the Equator (0 degrees).
    * Values range from -90 degrees (South Pole) to 90 degrees (North Pole).
    */
  /* CompleteClass */
  override def getLatitude(): Double = js.native
  /**
    * Longitude of the Model's location.
    * Angular distance in degrees, relative to the Prime Meridian.
    * Values west of the Meridian range from -180 to 0 degrees.
    * Values east of the Meridian range from 0 to 180 degrees.
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
    * Specifies the distance above the earth's surface.
    */
  /* CompleteClass */
  override def setAltitude(altitude: Double): Unit = js.native
  /**
    * Sets the latitude, longitude, and altitude of the Model.
    */
  /* CompleteClass */
  override def setLatLngAlt(lat: Double, lng: Double, alt: Double): Unit = js.native
  /**
    * Latitude of the camera location.
    * Degrees north or south of the Equator (0 degrees).
    * Values range from -90 degrees (South Pole) to 90 degrees (North Pole).
    */
  /* CompleteClass */
  override def setLatitude(latitude: Double): Unit = js.native
  /**
    * Longitude of the Model's location.
    * Angular distance in degrees, relative to the Prime Meridian.
    * Values west of the Meridian range from -180 to 0 degrees.
    * Values east of the Meridian range from 0 to 180 degrees.
    */
  /* CompleteClass */
  override def setLongitude(longitude: Double): Unit = js.native
}

