package typings.googleEarth.global.google.earth

import typings.googleEarth.google.earth.KmlAltitudeModeEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.earth.KmlModel")
@js.native
class KmlModel ()
  extends typings.googleEarth.google.earth.KmlModel {
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
    * Specifies how altitude components in the geometry coordinates are interpreted.
    */
  /* CompleteClass */
  override def getAltitudeMode(): KmlAltitudeModeEnum = js.native
  /**
    * The unique ID of the KML object.
    */
  /* CompleteClass */
  override def getId(): String = js.native
  /**
    * Returns the link of the collada model.
    */
  /* CompleteClass */
  override def getLink(): typings.googleEarth.google.earth.KmlLink = js.native
  /**
    * Specifies the exact coordinates of the Model's origin in latitude, longitude, and altitude.
    * Latitude and longitude measurements are standard lat-lon projection with WGS84 datum.
    * Altitude is distance above the earth's surface, in meters, and is interpreted according to altitudeMode.
    */
  /* CompleteClass */
  override def getLocation(): typings.googleEarth.google.earth.KmlLocation = js.native
  /**
    * Describes rotation of a 3D model's coordinate system to position the object in Google Earth.
    */
  /* CompleteClass */
  override def getOrientation(): typings.googleEarth.google.earth.KmlOrientation = js.native
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
    * Scales a model along the x, y, and z axes in the model's coordinate space
    */
  /* CompleteClass */
  override def getScale(): typings.googleEarth.google.earth.KmlScale = js.native
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
    * Specifies how altitude components in the geometry coordinates are interpreted.
    */
  /* CompleteClass */
  override def setAltitudeMode(altitudeMode: KmlAltitudeModeEnum): Unit = js.native
  /**
    * Sets the link of the collada model.
    */
  /* CompleteClass */
  override def setLink(link: typings.googleEarth.google.earth.KmlLink): Unit = js.native
  /**
    * Specifies the exact coordinates of the Model's origin in latitude, longitude, and altitude.
    * Latitude and longitude measurements are standard lat-lon projection with WGS84 datum.
    * Altitude is distance above the earth's surface, in meters, and is interpreted according to altitudeMode.
    */
  /* CompleteClass */
  override def setLocation(location: typings.googleEarth.google.earth.KmlLocation): Unit = js.native
  /**
    * Describes rotation of a 3D model's coordinate system to position the object in Google Earth.
    */
  /* CompleteClass */
  override def setOrientation(orientation: typings.googleEarth.google.earth.KmlOrientation): Unit = js.native
  /**
    * Scales a model along the x, y, and z axes in the model's coordinate space
    */
  /* CompleteClass */
  override def setScale(scale: typings.googleEarth.google.earth.KmlScale): Unit = js.native
}

