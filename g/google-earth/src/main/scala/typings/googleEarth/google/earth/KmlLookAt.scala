package typings.googleEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KmlLookAt extends KmlAbstractView {
  /**
    * Distance from the earth's surface, in meters.
    */
  def getAltitude(): Double = js.native
  /**
    * Specifies how altitude components in the coordinates element are interpreted.
    */
  def getAltitudeMode(): KmlAltitudeModeEnum = js.native
  /**
    * Direction (that is, North, South, East, West), in degrees. Default=0 (North). Values range from 0 to 360 degrees.
    */
  def getHeading(): Double = js.native
  /**
    * Latitude of the point the camera is looking at.
    * Degrees north or south of the Equator (0 degrees).
    * Values range from -90 degrees (South Pole) to 90 degrees (North Pole).
    */
  def getLatitude(): Double = js.native
  /**
    * Latitude of the point the camera is looking at.
    * Degrees north or south of the Equator (0 degrees).
    * Values range from -90 degrees (South Pole) to 90 degrees (North Pole).
    */
  def getLongitude(): Double = js.native
  /**
    * The distance in meters from the point specified by longitude, latitude, and altitude for the LookAt position.
    */
  def getRange(): Double = js.native
  /**
    * Angle between the direction of the LookAt position and the normal to the surface of the earth.
    * Values range from 0 to 90 degrees.  Values for tilt cannot be negative.
    * A tilt value of 0 degrees indicates viewing from directly above.
    * A tilt value of 90 degrees indicates viewing along the horizon.
    */
  def getTilt(): Double = js.native
  /**
    * Sets the latitude, longitude, altitude, altitudeMode, heading, tilt, and range for the camera.
    */
  def set(
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
  def setAltitude(altitude: Double): Unit = js.native
  /**
    * Specifies how altitude components in the coordinates element are interpreted.
    */
  def setAltitudeMode(altitudeMode: KmlAltitudeModeEnum): Unit = js.native
  /**
    * Direction (that is, North, South, East, West), in degrees. Default=0 (North). Values range from 0 to 360 degrees.
    */
  def setHeading(heading: Double): Unit = js.native
  /**
    * Latitude of the point the camera is looking at.
    * Degrees north or south of the Equator (0 degrees).
    * Values range from -90 degrees (South Pole) to 90 degrees (North Pole).
    */
  def setLatitude(latitude: Double): Unit = js.native
  /**
    * Latitude of the point the camera is looking at.
    * Degrees north or south of the Equator (0 degrees).
    * Values range from -90 degrees (South Pole) to 90 degrees (North Pole).
    */
  def setLongitude(longitude: Double): Unit = js.native
  /**
    * The distance in meters from the point specified by longitude, latitude, and altitude for the LookAt position.
    */
  def setRange(range: Double): Unit = js.native
  /**
    * Angle between the direction of the LookAt position and the normal to the surface of the earth.
    * Values range from 0 to 90 degrees.  Values for tilt cannot be negative.
    * A tilt value of 0 degrees indicates viewing from directly above.
    * A tilt value of 90 degrees indicates viewing along the horizon.
    */
  def setTilt(tilt: Double): Unit = js.native
}

object KmlLookAt {
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
    getRange: () => Double,
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
    setRange: Double => Unit,
    setTilt: Double => Unit,
    setTimePrimitive: KmlTimePrimitive => Unit,
    setViewerOptions: KmlViewerOptions => Unit
  ): KmlLookAt = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1(click), copyAsCamera = js.Any.fromFunction0(copyAsCamera), copyAsLookAt = js.Any.fromFunction0(copyAsLookAt), dblclick = js.Any.fromFunction1(dblclick), equals = js.Any.fromFunction1(equals), getAltitude = js.Any.fromFunction0(getAltitude), getAltitudeMode = js.Any.fromFunction0(getAltitudeMode), getHeading = js.Any.fromFunction0(getHeading), getId = js.Any.fromFunction0(getId), getLatitude = js.Any.fromFunction0(getLatitude), getLongitude = js.Any.fromFunction0(getLongitude), getOwnerDocument = js.Any.fromFunction0(getOwnerDocument), getParentNode = js.Any.fromFunction0(getParentNode), getRange = js.Any.fromFunction0(getRange), getTilt = js.Any.fromFunction0(getTilt), getTimePrimitive = js.Any.fromFunction0(getTimePrimitive), getType = js.Any.fromFunction0(getType), getUrl = js.Any.fromFunction0(getUrl), getViewerOptions = js.Any.fromFunction0(getViewerOptions), mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove), mouseout = js.Any.fromFunction1(mouseout), mouseover = js.Any.fromFunction1(mouseover), mouseup = js.Any.fromFunction1(mouseup), release = js.Any.fromFunction0(release), set = js.Any.fromFunction7(set), setAltitude = js.Any.fromFunction1(setAltitude), setAltitudeMode = js.Any.fromFunction1(setAltitudeMode), setHeading = js.Any.fromFunction1(setHeading), setLatitude = js.Any.fromFunction1(setLatitude), setLongitude = js.Any.fromFunction1(setLongitude), setRange = js.Any.fromFunction1(setRange), setTilt = js.Any.fromFunction1(setTilt), setTimePrimitive = js.Any.fromFunction1(setTimePrimitive), setViewerOptions = js.Any.fromFunction1(setViewerOptions))
    __obj.asInstanceOf[KmlLookAt]
  }
  @scala.inline
  implicit class KmlLookAtOps[Self <: KmlLookAt] (val x: Self) extends AnyVal {
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
    def setGetRange(value: () => Double): Self = this.set("getRange", js.Any.fromFunction0(value))
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
    def setSetRange(value: Double => Unit): Self = this.set("setRange", js.Any.fromFunction1(value))
    @scala.inline
    def setSetTilt(value: Double => Unit): Self = this.set("setTilt", js.Any.fromFunction1(value))
  }
  
}

