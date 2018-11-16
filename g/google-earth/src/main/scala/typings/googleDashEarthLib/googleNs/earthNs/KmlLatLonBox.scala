package typings
package googleDashEarthLib.googleNs.earthNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.earth.KmlLatLonBox")
@js.native
class KmlLatLonBox () extends KmlObject {
  /**
       * Specifies the longitude of the east edge of the bounding box, in decimal degrees from -180 to 180.
       * (For overlays that overlap the meridian of 180 degrees longitude, values can extend beyond that range.)
       */
  def getEast(): scala.Double = js.native
  /**
       * Specifies the latitude of the north edge of the bounding box, in decimal degrees from -90 to 90.
       */
  def getNorth(): scala.Double = js.native
  /**
       * Specifies a rotation of the overlay about its center, in degrees.
       * Values can be +/-180. The default is 0 (north).
       * Rotations are specified in a counterclockwise direction.
       */
  def getRotation(): scala.Double = js.native
  /**
       * Specifies the latitude of the south edge of the bounding box, in decimal degrees from -90 to 90.
       */
  def getSouth(): scala.Double = js.native
  /**
       * Specifies the longitude of the west edge of the bounding box, in decimal degrees from -180 to 180.
       * (For overlays that overlap the meridian of 180 degrees longitude, values can extend beyond that range.)
       */
  def getWest(): scala.Double = js.native
  /**
       * Sets the north, south, east, and west edges of the bounding box, as well as the rotation of the overlay.
       */
  def setBox(
    north: scala.Double,
    south: scala.Double,
    east: scala.Double,
    west: scala.Double,
    rotation: scala.Double
  ): scala.Unit = js.native
  /**
       * Specifies the longitude of the east edge of the bounding box, in decimal degrees from -180 to 180.
       * (For overlays that overlap the meridian of 180 degrees longitude, values can extend beyond that range.)
       */
  def setEast(east: scala.Double): scala.Unit = js.native
  /**
       * Specifies the latitude of the north edge of the bounding box, in decimal degrees from -90 to 90.
       */
  def setNorth(north: scala.Double): scala.Unit = js.native
  /**
       * Specifies a rotation of the overlay about its center, in degrees.
       * Values can be +/-180. The default is 0 (north).
       * Rotations are specified in a counterclockwise direction.
       */
  def setRotation(rotation: scala.Double): scala.Unit = js.native
  /**
       * Specifies the latitude of the south edge of the bounding box, in decimal degrees from -90 to 90.
       */
  def setSouth(south: scala.Double): scala.Unit = js.native
  /**
       * Specifies the longitude of the west edge of the bounding box, in decimal degrees from -180 to 180.
       * (For overlays that overlap the meridian of 180 degrees longitude, values can extend beyond that range.)
       */
  def setWest(west: scala.Double): scala.Unit = js.native
}

