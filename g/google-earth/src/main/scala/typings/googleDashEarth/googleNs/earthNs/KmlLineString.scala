package typings.googleDashEarth.googleNs.earthNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.earth.KmlLineString")
@js.native
class KmlLineString () extends KmlExtrudableGeometry {
  /**
    * Returns the altitudeOffset, or 0 if not set.
    */
  def getAltitudeOffset(): Double = js.native
  /**
    * Two or more coordinate tuples, each consisting of floating point values for longitude, latitude, and altitude.
    * The altitude component is optional.
    */
  def getCoordinates(): KmlCoordArray = js.native
  /**
    * Added to the altitude values for all points on the line string.
    * Adjusts the altitude of the feature as a whole, without the need to update each coordinate set.
    */
  def setAltitudeOffset(altitudeOffset: Double): Unit = js.native
}

