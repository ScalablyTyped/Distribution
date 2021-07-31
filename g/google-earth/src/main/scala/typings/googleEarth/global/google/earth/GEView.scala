package typings.googleEarth.global.google.earth

import typings.googleEarth.google.earth.GEHitTestModeEnum
import typings.googleEarth.google.earth.KmlAltitudeModeEnum
import typings.googleEarth.google.earth.KmlUnitsEnum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("google.earth.GEView")
@js.native
class GEView ()
  extends StObject
     with typings.googleEarth.google.earth.GEView {
  
  /**
    * Creates and returns a new KmlCamera object, initialized to the current camera position and orientation.
    * Use 'altitudeMode' to specify the altitude mode of the new camera.
    *
    * See also:
    *
    * * GEPlugin.ALTITUDE_RELATIVE_TO_GROUND
    * * GEPlugin.ALTITUDE_ABSOLUTE
    * * GEPlugin.ALTITUDE_RELATIVE_TO_SEA_FLOOR
    */
  /* CompleteClass */
  override def copyAsCamera(altitudeMode: KmlAltitudeModeEnum): typings.googleEarth.google.earth.KmlCamera = js.native
  
  /**
    * Creates and returns a new KmlLookAt object, initialized to the current camera position and orientation.
    * Use 'altitudeMode' to specify the altitude mode of the looked-at point.
    *
    * See also:
    *
    * * GEPlugin.ALTITUDE_RELATIVE_TO_GROUND
    * * GEPlugin.ALTITUDE_ABSOLUTE
    * * GEPlugin.ALTITUDE_RELATIVE_TO_SEA_FLOOR
    */
  /* CompleteClass */
  override def copyAsLookAt(altitudeMode: KmlAltitudeModeEnum): typings.googleEarth.google.earth.KmlLookAt = js.native
  
  /**
    * Returns a bounding box that completely contains the region of the globe that is currently visible.
    * The returned box will be larger than what is strictly visible, if that is necessary to include everything that is visible.
    */
  /* CompleteClass */
  override def getViewportGlobeBounds(): typings.googleEarth.google.earth.KmlLatLonBox = js.native
  
  /**
    * Given a point on the screen in pixel coordinates, returns a GEHitTestResult with information about the geographic location corresponding to the point on the screen. 
    * Tip: hitTest() is the inverse of project().
    *
    * See also:
    *
    * * GEPlugin.UNITS_PIXELS
    * * GEPlugin.UNITS_INSET_PIXELS
    * * GEPlugin.UNITS_FRACTION
    * * GEPlugin.HIT_TEST_GLOBE
    * * GEPlugin.HIT_TEST_TERRAIN
    * * GEPlugin.HIT_TEST_BUILDINGS
    */
  /* CompleteClass */
  override def hitTest(x: Double, xUnits: KmlUnitsEnum, y: Double, yUnits: KmlUnitsEnum, mode: GEHitTestModeEnum): typings.googleEarth.google.earth.GEHitTestResult = js.native
  
  /**
    * Returns the screen x,y coordinates of a given point on the globe.
    *
    * Tip: project() is the inverse of hitTest().
    *
    * See also:
    *
    * * GEPlugin.ALTITUDE_RELATIVE_TO_GROUND
    * * GEPlugin.ALTITUDE_ABSOLUTE
    * * GEPlugin.ALTITUDE_RELATIVE_TO_SEA_FLOOR
    */
  /* CompleteClass */
  override def project(lat: Double, lng: Double, alt: Double, altitudeMode: KmlAltitudeModeEnum): typings.googleEarth.google.earth.KmlVec2 = js.native
  
  /**
    * Sets the camera that views the scene in Google Earth.
    */
  /* CompleteClass */
  override def setAbstractView(view: typings.googleEarth.google.earth.KmlAbstractView): Unit = js.native
}
