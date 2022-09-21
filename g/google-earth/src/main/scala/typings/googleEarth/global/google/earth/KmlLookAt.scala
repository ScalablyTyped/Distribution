package typings.googleEarth.global.google.earth

import typings.googleEarth.google.earth.KmlAltitudeModeEnum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("google.earth.KmlLookAt")
@js.native
open class KmlLookAt ()
  extends StObject
     with typings.googleEarth.google.earth.KmlLookAt {
  
  /**
    * Triggers an event when the user clicks a location in Google Earth with the mouse.
    */
  /* CompleteClass */
  override def click(event: typings.googleEarth.google.earth.KmlMouseEvent): Unit = js.native
  
  /**
    * Creates a new KmlCamera object that matches this KmlAbstractView.
    *
    * If this view is already a KmlCamera, this function returns a new KmlCamera representing the same view.
    */
  /* CompleteClass */
  override def copyAsCamera(): typings.googleEarth.google.earth.KmlCamera = js.native
  
  /**
    * Creates a new KmlLookAt object that matches as closely as possible this KmlAbstractView. 
    * KmlLookAt is unable to represent roll, so roll values in the current view will not be passed to the new KmlLookAt object.
    *
    * If this view is already a KmlLookAt, this function returns a new KmlLookAt representing the same view.
    */
  /* CompleteClass */
  override def copyAsLookAt(): typings.googleEarth.google.earth.KmlLookAt = js.native
  
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
    * Distance from the earth's surface, in meters.
    */
  /* CompleteClass */
  override def getAltitude(): Double = js.native
  
  /**
    * Specifies how altitude components in the coordinates element are interpreted.
    */
  /* CompleteClass */
  override def getAltitudeMode(): KmlAltitudeModeEnum = js.native
  
  /**
    * Direction (that is, North, South, East, West), in degrees. Default=0 (North). Values range from 0 to 360 degrees.
    */
  /* CompleteClass */
  override def getHeading(): Double = js.native
  
  /**
    * The unique ID of the KML object.
    */
  /* CompleteClass */
  override def getId(): String = js.native
  
  /**
    * Latitude of the point the camera is looking at.
    * Degrees north or south of the Equator (0 degrees).
    * Values range from -90 degrees (South Pole) to 90 degrees (North Pole).
    */
  /* CompleteClass */
  override def getLatitude(): Double = js.native
  
  /**
    * Latitude of the point the camera is looking at.
    * Degrees north or south of the Equator (0 degrees).
    * Values range from -90 degrees (South Pole) to 90 degrees (North Pole).
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
    * The distance in meters from the point specified by longitude, latitude, and altitude for the LookAt position.
    */
  /* CompleteClass */
  override def getRange(): Double = js.native
  
  /**
    * Angle between the direction of the LookAt position and the normal to the surface of the earth.
    * Values range from 0 to 90 degrees.  Values for tilt cannot be negative.
    * A tilt value of 0 degrees indicates viewing from directly above.
    * A tilt value of 90 degrees indicates viewing along the horizon.
    */
  /* CompleteClass */
  override def getTilt(): Double = js.native
  
  /**
    * Returns the KmlTimeStamp or KmlTimeSpan object associated with this view.
    */
  /* CompleteClass */
  override def getTimePrimitive(): typings.googleEarth.google.earth.KmlTimePrimitive = js.native
  
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
    * Returns the viewer options on the current view.
    *
    * See also:
    *
    * * GEPlugin.OPTION_STREET_VIEW
    * * GEPlugin.OPTION_SUNLIGHT
    * * GEPlugin.OPTION_HISTORICAL_IMAGERY
    */
  /* CompleteClass */
  override def getViewerOptions(): typings.googleEarth.google.earth.KmlViewerOptions = js.native
  
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
    * Sets the latitude, longitude, altitude, altitudeMode, heading, tilt, and range for the camera.
    */
  /* CompleteClass */
  override def set(
    latitude: Double,
    longitude: Double,
    altitude: Double,
    altitudeMode: KmlAltitudeModeEnum,
    heading: Double,
    tilt: Double,
    range: Double
  ): Unit = js.native
  
  /**
    * Distance from the earth's surface, in meters.
    */
  /* CompleteClass */
  override def setAltitude(altitude: Double): Unit = js.native
  
  /**
    * Specifies how altitude components in the coordinates element are interpreted.
    */
  /* CompleteClass */
  override def setAltitudeMode(altitudeMode: KmlAltitudeModeEnum): Unit = js.native
  
  /**
    * Direction (that is, North, South, East, West), in degrees. Default=0 (North). Values range from 0 to 360 degrees.
    */
  /* CompleteClass */
  override def setHeading(heading: Double): Unit = js.native
  
  /**
    * Latitude of the point the camera is looking at.
    * Degrees north or south of the Equator (0 degrees).
    * Values range from -90 degrees (South Pole) to 90 degrees (North Pole).
    */
  /* CompleteClass */
  override def setLatitude(latitude: Double): Unit = js.native
  
  /**
    * Latitude of the point the camera is looking at.
    * Degrees north or south of the Equator (0 degrees).
    * Values range from -90 degrees (South Pole) to 90 degrees (North Pole).
    */
  /* CompleteClass */
  override def setLongitude(longitude: Double): Unit = js.native
  
  /**
    * The distance in meters from the point specified by longitude, latitude, and altitude for the LookAt position.
    */
  /* CompleteClass */
  override def setRange(range: Double): Unit = js.native
  
  /**
    * Angle between the direction of the LookAt position and the normal to the surface of the earth.
    * Values range from 0 to 90 degrees.  Values for tilt cannot be negative.
    * A tilt value of 0 degrees indicates viewing from directly above.
    * A tilt value of 90 degrees indicates viewing along the horizon.
    */
  /* CompleteClass */
  override def setTilt(tilt: Double): Unit = js.native
  
  /**
    * Associate a KmlTimeStamp or KmlTimeSpan object with this view.
    */
  /* CompleteClass */
  override def setTimePrimitive(timePrimitive: typings.googleEarth.google.earth.KmlTimePrimitive): Unit = js.native
  
  /**
    * Sets the viewer options on the current view.
    *
    * See also:
    *
    * * GEPlugin.OPTION_STREET_VIEW
    * * GEPlugin.OPTION_SUNLIGHT
    * * GEPlugin.OPTION_HISTORICAL_IMAGERY
    */
  /* CompleteClass */
  override def setViewerOptions(viewerOptions: typings.googleEarth.google.earth.KmlViewerOptions): Unit = js.native
}
