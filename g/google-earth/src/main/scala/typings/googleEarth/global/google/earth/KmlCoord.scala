package typings.googleEarth.global.google.earth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("google.earth.KmlCoord")
@js.native
class KmlCoord ()
  extends StObject
     with typings.googleEarth.google.earth.KmlCoord {
  
  /**
    * Distance from the earth's surface.
    */
  /* CompleteClass */
  override def getAltitude(): Double = js.native
  
  /**
    * Degrees north or south of the Equator (0 degrees).
    * Values range from -90 degrees (South Pole) to 90 degrees (North Pole).
    */
  /* CompleteClass */
  override def getLatitude(): Double = js.native
  
  /**
    * Angular distance in degrees, relative to the Prime Meridian. Values west of the Meridian range from -180 to 0 degrees.
    * Values east of the Meridian range from 0 to 180 degrees.
    */
  /* CompleteClass */
  override def getLongitude(): Double = js.native
  
  /**
    * Distance from the earth's surface.
    */
  /* CompleteClass */
  override def setAltitude(altitude: Double): Unit = js.native
  
  /**
    * Sets the latitude, longitude, altitude.
    */
  /* CompleteClass */
  override def setLatLngAlt(latitude: Double, longitude: Double, altitude: Double): Unit = js.native
  
  /**
    * Degrees north or south of the Equator (0 degrees).
    * Values range from -90 degrees (South Pole) to 90 degrees (North Pole).
    */
  /* CompleteClass */
  override def setLatitude(latitude: Double): Unit = js.native
  
  /**
    * Angular distance in degrees, relative to the Prime Meridian. Values west of the Meridian range from -180 to 0 degrees.
    * Values east of the Meridian range from 0 to 180 degrees.
    */
  /* CompleteClass */
  override def setLongitude(longitude: Double): Unit = js.native
}
