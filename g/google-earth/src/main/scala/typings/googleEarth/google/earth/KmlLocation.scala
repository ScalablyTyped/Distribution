package typings.googleEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KmlLocation extends KmlObject {
  /**
    * Specifies the distance above the earth's surface.
    */
  def getAltitude(): Double
  /**
    * Latitude of the camera location.
    * Degrees north or south of the Equator (0 degrees).
    * Values range from -90 degrees (South Pole) to 90 degrees (North Pole).
    */
  def getLatitude(): Double
  /**
    * Longitude of the Model's location.
    * Angular distance in degrees, relative to the Prime Meridian.
    * Values west of the Meridian range from -180 to 0 degrees.
    * Values east of the Meridian range from 0 to 180 degrees.
    */
  def getLongitude(): Double
  /**
    * Specifies the distance above the earth's surface.
    */
  def setAltitude(altitude: Double): Unit
  /**
    * Sets the latitude, longitude, and altitude of the Model.
    */
  def setLatLngAlt(lat: Double, lng: Double, alt: Double): Unit
  /**
    * Latitude of the camera location.
    * Degrees north or south of the Equator (0 degrees).
    * Values range from -90 degrees (South Pole) to 90 degrees (North Pole).
    */
  def setLatitude(latitude: Double): Unit
  /**
    * Longitude of the Model's location.
    * Angular distance in degrees, relative to the Prime Meridian.
    * Values west of the Meridian range from -180 to 0 degrees.
    * Values east of the Meridian range from 0 to 180 degrees.
    */
  def setLongitude(longitude: Double): Unit
}

object KmlLocation {
  @scala.inline
  def apply(
    click: KmlMouseEvent => Unit,
    dblclick: KmlMouseEvent => Unit,
    equals: KmlObject => Boolean,
    getAltitude: () => Double,
    getId: () => String,
    getLatitude: () => Double,
    getLongitude: () => Double,
    getOwnerDocument: () => KmlDocument,
    getParentNode: () => KmlObject,
    getType: () => String,
    getUrl: () => String,
    mousedown: KmlMouseEvent => Unit,
    mousemove: KmlMouseEvent => Unit,
    mouseout: KmlMouseEvent => Unit,
    mouseover: KmlMouseEvent => Unit,
    mouseup: KmlMouseEvent => Unit,
    release: () => Unit,
    setAltitude: Double => Unit,
    setLatLngAlt: (Double, Double, Double) => Unit,
    setLatitude: Double => Unit,
    setLongitude: Double => Unit
  ): KmlLocation = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1(click), dblclick = js.Any.fromFunction1(dblclick), equals = js.Any.fromFunction1(equals), getAltitude = js.Any.fromFunction0(getAltitude), getId = js.Any.fromFunction0(getId), getLatitude = js.Any.fromFunction0(getLatitude), getLongitude = js.Any.fromFunction0(getLongitude), getOwnerDocument = js.Any.fromFunction0(getOwnerDocument), getParentNode = js.Any.fromFunction0(getParentNode), getType = js.Any.fromFunction0(getType), getUrl = js.Any.fromFunction0(getUrl), mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove), mouseout = js.Any.fromFunction1(mouseout), mouseover = js.Any.fromFunction1(mouseover), mouseup = js.Any.fromFunction1(mouseup), release = js.Any.fromFunction0(release), setAltitude = js.Any.fromFunction1(setAltitude), setLatLngAlt = js.Any.fromFunction3(setLatLngAlt), setLatitude = js.Any.fromFunction1(setLatitude), setLongitude = js.Any.fromFunction1(setLongitude))
    __obj.asInstanceOf[KmlLocation]
  }
}

