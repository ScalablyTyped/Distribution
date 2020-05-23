package typings.googleEarth.global.google.earth

import typings.googleEarth.google.earth.KmlAltitudeModeEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.earth.KmlLineString")
@js.native
class KmlLineString ()
  extends typings.googleEarth.google.earth.KmlLineString {
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
    * Returns the altitudeOffset, or 0 if not set.
    */
  /* CompleteClass */
  override def getAltitudeOffset(): Double = js.native
  /**
    * Two or more coordinate tuples, each consisting of floating point values for longitude, latitude, and altitude.
    * The altitude component is optional.
    */
  /* CompleteClass */
  override def getCoordinates(): typings.googleEarth.google.earth.KmlCoordArray = js.native
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
    * Specifies how altitude components in the geometry coordinates are interpreted.
    */
  /* CompleteClass */
  override def setAltitudeMode(altitudeMode: KmlAltitudeModeEnum): Unit = js.native
  /**
    * Added to the altitude values for all points on the line string.
    * Adjusts the altitude of the feature as a whole, without the need to update each coordinate set.
    */
  /* CompleteClass */
  override def setAltitudeOffset(altitudeOffset: Double): Unit = js.native
  /**
    * Specifies whether to connect the geometry to the ground.
    */
  /* CompleteClass */
  override def setExtrude(extrude: Boolean): Unit = js.native
  /**
    * Specifies whether to allow the geometry to follow the terrain elevation.
    */
  /* CompleteClass */
  override def setTessellate(tessellate: Boolean): Unit = js.native
}

