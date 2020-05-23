package typings.googleEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KmlModel extends KmlAltitudeGeometry {
  /**
    * Returns the link of the collada model.
    */
  def getLink(): KmlLink
  /**
    * Specifies the exact coordinates of the Model's origin in latitude, longitude, and altitude.
    * Latitude and longitude measurements are standard lat-lon projection with WGS84 datum.
    * Altitude is distance above the earth's surface, in meters, and is interpreted according to altitudeMode.
    */
  def getLocation(): KmlLocation
  /**
    * Describes rotation of a 3D model's coordinate system to position the object in Google Earth.
    */
  def getOrientation(): KmlOrientation
  /**
    * Scales a model along the x, y, and z axes in the model's coordinate space
    */
  def getScale(): KmlScale
  /**
    * Sets the link of the collada model.
    */
  def setLink(link: KmlLink): Unit
  /**
    * Specifies the exact coordinates of the Model's origin in latitude, longitude, and altitude.
    * Latitude and longitude measurements are standard lat-lon projection with WGS84 datum.
    * Altitude is distance above the earth's surface, in meters, and is interpreted according to altitudeMode.
    */
  def setLocation(location: KmlLocation): Unit
  /**
    * Describes rotation of a 3D model's coordinate system to position the object in Google Earth.
    */
  def setOrientation(orientation: KmlOrientation): Unit
  /**
    * Scales a model along the x, y, and z axes in the model's coordinate space
    */
  def setScale(scale: KmlScale): Unit
}

object KmlModel {
  @scala.inline
  def apply(
    click: KmlMouseEvent => Unit,
    dblclick: KmlMouseEvent => Unit,
    equals: KmlObject => Boolean,
    getAltitudeMode: () => KmlAltitudeModeEnum,
    getId: () => String,
    getLink: () => KmlLink,
    getLocation: () => KmlLocation,
    getOrientation: () => KmlOrientation,
    getOwnerDocument: () => KmlDocument,
    getParentNode: () => KmlObject,
    getScale: () => KmlScale,
    getType: () => String,
    getUrl: () => String,
    mousedown: KmlMouseEvent => Unit,
    mousemove: KmlMouseEvent => Unit,
    mouseout: KmlMouseEvent => Unit,
    mouseover: KmlMouseEvent => Unit,
    mouseup: KmlMouseEvent => Unit,
    release: () => Unit,
    setAltitudeMode: KmlAltitudeModeEnum => Unit,
    setLink: KmlLink => Unit,
    setLocation: KmlLocation => Unit,
    setOrientation: KmlOrientation => Unit,
    setScale: KmlScale => Unit
  ): KmlModel = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1(click), dblclick = js.Any.fromFunction1(dblclick), equals = js.Any.fromFunction1(equals), getAltitudeMode = js.Any.fromFunction0(getAltitudeMode), getId = js.Any.fromFunction0(getId), getLink = js.Any.fromFunction0(getLink), getLocation = js.Any.fromFunction0(getLocation), getOrientation = js.Any.fromFunction0(getOrientation), getOwnerDocument = js.Any.fromFunction0(getOwnerDocument), getParentNode = js.Any.fromFunction0(getParentNode), getScale = js.Any.fromFunction0(getScale), getType = js.Any.fromFunction0(getType), getUrl = js.Any.fromFunction0(getUrl), mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove), mouseout = js.Any.fromFunction1(mouseout), mouseover = js.Any.fromFunction1(mouseover), mouseup = js.Any.fromFunction1(mouseup), release = js.Any.fromFunction0(release), setAltitudeMode = js.Any.fromFunction1(setAltitudeMode), setLink = js.Any.fromFunction1(setLink), setLocation = js.Any.fromFunction1(setLocation), setOrientation = js.Any.fromFunction1(setOrientation), setScale = js.Any.fromFunction1(setScale))
    __obj.asInstanceOf[KmlModel]
  }
}

