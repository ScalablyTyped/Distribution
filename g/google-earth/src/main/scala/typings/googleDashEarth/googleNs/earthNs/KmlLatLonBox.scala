package typings.googleDashEarth.googleNs.earthNs

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
  def getEast(): Double = js.native
  /**
    * Specifies the latitude of the north edge of the bounding box, in decimal degrees from -90 to 90.
    */
  def getNorth(): Double = js.native
  /**
    * Specifies a rotation of the overlay about its center, in degrees.
    * Values can be +/-180. The default is 0 (north).
    * Rotations are specified in a counterclockwise direction.
    */
  def getRotation(): Double = js.native
  /**
    * Specifies the latitude of the south edge of the bounding box, in decimal degrees from -90 to 90.
    */
  def getSouth(): Double = js.native
  /**
    * Specifies the longitude of the west edge of the bounding box, in decimal degrees from -180 to 180.
    * (For overlays that overlap the meridian of 180 degrees longitude, values can extend beyond that range.)
    */
  def getWest(): Double = js.native
  /**
    * Sets the north, south, east, and west edges of the bounding box, as well as the rotation of the overlay.
    */
  def setBox(north: Double, south: Double, east: Double, west: Double, rotation: Double): Unit = js.native
  /**
    * Specifies the longitude of the east edge of the bounding box, in decimal degrees from -180 to 180.
    * (For overlays that overlap the meridian of 180 degrees longitude, values can extend beyond that range.)
    */
  def setEast(east: Double): Unit = js.native
  /**
    * Specifies the latitude of the north edge of the bounding box, in decimal degrees from -90 to 90.
    */
  def setNorth(north: Double): Unit = js.native
  /**
    * Specifies a rotation of the overlay about its center, in degrees.
    * Values can be +/-180. The default is 0 (north).
    * Rotations are specified in a counterclockwise direction.
    */
  def setRotation(rotation: Double): Unit = js.native
  /**
    * Specifies the latitude of the south edge of the bounding box, in decimal degrees from -90 to 90.
    */
  def setSouth(south: Double): Unit = js.native
  /**
    * Specifies the longitude of the west edge of the bounding box, in decimal degrees from -180 to 180.
    * (For overlays that overlap the meridian of 180 degrees longitude, values can extend beyond that range.)
    */
  def setWest(west: Double): Unit = js.native
}

