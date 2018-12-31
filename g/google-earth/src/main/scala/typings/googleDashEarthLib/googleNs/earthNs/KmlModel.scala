package typings
package googleDashEarthLib.googleNs.earthNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.earth.KmlModel")
@js.native
class KmlModel () extends KmlAltitudeGeometry {
  /**
    * Returns the link of the collada model.
    */
  def getLink(): KmlLink = js.native
  /**
    * Specifies the exact coordinates of the Model's origin in latitude, longitude, and altitude.
    * Latitude and longitude measurements are standard lat-lon projection with WGS84 datum.
    * Altitude is distance above the earth's surface, in meters, and is interpreted according to altitudeMode.
    */
  def getLocation(): KmlLocation = js.native
  /**
    * Describes rotation of a 3D model's coordinate system to position the object in Google Earth.
    */
  def getOrientation(): KmlOrientation = js.native
  /**
    * Scales a model along the x, y, and z axes in the model's coordinate space
    */
  def getScale(): KmlScale = js.native
  /**
    * Sets the link of the collada model.
    */
  def setLink(link: KmlLink): scala.Unit = js.native
  /**
    * Specifies the exact coordinates of the Model's origin in latitude, longitude, and altitude.
    * Latitude and longitude measurements are standard lat-lon projection with WGS84 datum.
    * Altitude is distance above the earth's surface, in meters, and is interpreted according to altitudeMode.
    */
  def setLocation(location: KmlLocation): scala.Unit = js.native
  /**
    * Describes rotation of a 3D model's coordinate system to position the object in Google Earth.
    */
  def setOrientation(orientation: KmlOrientation): scala.Unit = js.native
  /**
    * Scales a model along the x, y, and z axes in the model's coordinate space
    */
  def setScale(scale: KmlScale): scala.Unit = js.native
}

