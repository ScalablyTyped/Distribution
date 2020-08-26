package typings.googleEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KmlCamera extends KmlAbstractView {
  /**
    * Distance from the earth's surface.
    */
  def getAltitude(): Double = js.native
  /**
    * Specifies how altitude components in the coordinates are interpreted.
    */
  def getAltitudeMode(): KmlAltitudeModeEnum = js.native
  /**
    * Direction (that is, North, South, East, West), in degrees. Default=0 (North). Values range from 0 to 360 degrees.
    */
  def getHeading(): Double = js.native
  /**
    * Latitude of the camera location. Degrees north or south of the Equator (0 degrees). Values range from -90 degrees to 90 degrees.
    */
  def getLatitude(): Double = js.native
  /**
    * Longitude of the camera location. Angular distance in degrees, relative to the Prime Meridian. Values west of the Meridian range from -180 to 0 degrees.
    * Values east of the Meridian range from 0 to 180 degrees.
    */
  def getLongitude(): Double = js.native
  /**
    * Rotation, in degrees, of the camera around the Z axis. Values range from -180 to +180 degrees.
    */
  def getRoll(): Double = js.native
  /**
    * Angle between the direction of the camera position and the normal to the surface of the earth. Values range from 0 to 360 degrees.
    * A tilt value of 0 degrees indicates viewing from directly above, 90 degrees indicates viewing along the horizon, and 180 degrees indicates viewing straight up at the sky.
    */
  def getTilt(): Double = js.native
  /**
    * Sets the latitude, longitude, altitude, alitudeMode, heading, tilt, and roll values.
    */
  def set(
    latitude: Double,
    longitude: Double,
    altitude: Double,
    altitudeMode: KmlAltitudeModeEnum,
    heading: Double,
    tilt: Double,
    roll: Double
  ): Unit = js.native
  /**
    * Distance from the earth's surface.
    */
  def setAltitude(altitude: Double): Unit = js.native
  /**
    * Specifies how altitude components in the coordinates are interpreted.
    */
  def setAltitudeMode(altitudeMode: KmlAltitudeModeEnum): Unit = js.native
  /**
    * Direction (that is, North, South, East, West), in degrees. Default=0 (North). Values range from 0 to 360 degrees.
    */
  def setHeading(heading: Double): Unit = js.native
  /**
    * Latitude of the camera location. Degrees north or south of the Equator (0 degrees). Values range from -90 degrees to 90 degrees.
    */
  def setLatitude(latitude: Double): Unit = js.native
  /**
    * Longitude of the camera location. Angular distance in degrees, relative to the Prime Meridian. Values west of the Meridian range from -180 to 0 degrees.
    * Values east of the Meridian range from 0 to 180 degrees.
    */
  def setLongitude(longitude: Double): Unit = js.native
  /**
    * Rotation, in degrees, of the camera around the Z axis. Values range from -180 to +180 degrees.
    */
  def setRoll(roll: Double): Unit = js.native
  /**
    * Angle between the direction of the camera position and the normal to the surface of the earth. Values range from 0 to 360 degrees.
    * A tilt value of 0 degrees indicates viewing from directly above, 90 degrees indicates viewing along the horizon, and 180 degrees indicates viewing straight up at the sky.
    */
  def setTilt(tilt: Double): Unit = js.native
}

object KmlCamera {
  @scala.inline
  def apply(
    click: KmlMouseEvent => Unit,
    copyAsCamera: () => KmlCamera,
    copyAsLookAt: () => KmlLookAt,
    dblclick: KmlMouseEvent => Unit,
    equals: KmlObject => Boolean,
    getAltitude: () => Double,
    getAltitudeMode: () => KmlAltitudeModeEnum,
    getHeading: () => Double,
    getId: () => String,
    getLatitude: () => Double,
    getLongitude: () => Double,
    getOwnerDocument: () => KmlDocument,
    getParentNode: () => KmlObject,
    getRoll: () => Double,
    getTilt: () => Double,
    getTimePrimitive: () => KmlTimePrimitive,
    getType: () => String,
    getUrl: () => String,
    getViewerOptions: () => KmlViewerOptions,
    mousedown: KmlMouseEvent => Unit,
    mousemove: KmlMouseEvent => Unit,
    mouseout: KmlMouseEvent => Unit,
    mouseover: KmlMouseEvent => Unit,
    mouseup: KmlMouseEvent => Unit,
    release: () => Unit,
    set: (Double, Double, Double, KmlAltitudeModeEnum, Double, Double, Double) => Unit,
    setAltitude: Double => Unit,
    setAltitudeMode: KmlAltitudeModeEnum => Unit,
    setHeading: Double => Unit,
    setLatitude: Double => Unit,
    setLongitude: Double => Unit,
    setRoll: Double => Unit,
    setTilt: Double => Unit,
    setTimePrimitive: KmlTimePrimitive => Unit,
    setViewerOptions: KmlViewerOptions => Unit
  ): KmlCamera = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1(click), copyAsCamera = js.Any.fromFunction0(copyAsCamera), copyAsLookAt = js.Any.fromFunction0(copyAsLookAt), dblclick = js.Any.fromFunction1(dblclick), equals = js.Any.fromFunction1(equals), getAltitude = js.Any.fromFunction0(getAltitude), getAltitudeMode = js.Any.fromFunction0(getAltitudeMode), getHeading = js.Any.fromFunction0(getHeading), getId = js.Any.fromFunction0(getId), getLatitude = js.Any.fromFunction0(getLatitude), getLongitude = js.Any.fromFunction0(getLongitude), getOwnerDocument = js.Any.fromFunction0(getOwnerDocument), getParentNode = js.Any.fromFunction0(getParentNode), getRoll = js.Any.fromFunction0(getRoll), getTilt = js.Any.fromFunction0(getTilt), getTimePrimitive = js.Any.fromFunction0(getTimePrimitive), getType = js.Any.fromFunction0(getType), getUrl = js.Any.fromFunction0(getUrl), getViewerOptions = js.Any.fromFunction0(getViewerOptions), mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove), mouseout = js.Any.fromFunction1(mouseout), mouseover = js.Any.fromFunction1(mouseover), mouseup = js.Any.fromFunction1(mouseup), release = js.Any.fromFunction0(release), set = js.Any.fromFunction7(set), setAltitude = js.Any.fromFunction1(setAltitude), setAltitudeMode = js.Any.fromFunction1(setAltitudeMode), setHeading = js.Any.fromFunction1(setHeading), setLatitude = js.Any.fromFunction1(setLatitude), setLongitude = js.Any.fromFunction1(setLongitude), setRoll = js.Any.fromFunction1(setRoll), setTilt = js.Any.fromFunction1(setTilt), setTimePrimitive = js.Any.fromFunction1(setTimePrimitive), setViewerOptions = js.Any.fromFunction1(setViewerOptions))
    __obj.asInstanceOf[KmlCamera]
  }
  @scala.inline
  implicit class KmlCameraOps[Self <: KmlCamera] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetAltitude(value: () => Double): Self = this.set("getAltitude", js.Any.fromFunction0(value))
    @scala.inline
    def setGetAltitudeMode(value: () => KmlAltitudeModeEnum): Self = this.set("getAltitudeMode", js.Any.fromFunction0(value))
    @scala.inline
    def setGetHeading(value: () => Double): Self = this.set("getHeading", js.Any.fromFunction0(value))
    @scala.inline
    def setGetLatitude(value: () => Double): Self = this.set("getLatitude", js.Any.fromFunction0(value))
    @scala.inline
    def setGetLongitude(value: () => Double): Self = this.set("getLongitude", js.Any.fromFunction0(value))
    @scala.inline
    def setGetRoll(value: () => Double): Self = this.set("getRoll", js.Any.fromFunction0(value))
    @scala.inline
    def setGetTilt(value: () => Double): Self = this.set("getTilt", js.Any.fromFunction0(value))
    @scala.inline
    def setSet(value: (Double, Double, Double, KmlAltitudeModeEnum, Double, Double, Double) => Unit): Self = this.set("set", js.Any.fromFunction7(value))
    @scala.inline
    def setSetAltitude(value: Double => Unit): Self = this.set("setAltitude", js.Any.fromFunction1(value))
    @scala.inline
    def setSetAltitudeMode(value: KmlAltitudeModeEnum => Unit): Self = this.set("setAltitudeMode", js.Any.fromFunction1(value))
    @scala.inline
    def setSetHeading(value: Double => Unit): Self = this.set("setHeading", js.Any.fromFunction1(value))
    @scala.inline
    def setSetLatitude(value: Double => Unit): Self = this.set("setLatitude", js.Any.fromFunction1(value))
    @scala.inline
    def setSetLongitude(value: Double => Unit): Self = this.set("setLongitude", js.Any.fromFunction1(value))
    @scala.inline
    def setSetRoll(value: Double => Unit): Self = this.set("setRoll", js.Any.fromFunction1(value))
    @scala.inline
    def setSetTilt(value: Double => Unit): Self = this.set("setTilt", js.Any.fromFunction1(value))
  }
  
}

