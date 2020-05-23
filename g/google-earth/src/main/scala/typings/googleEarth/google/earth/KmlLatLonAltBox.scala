package typings.googleEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KmlLatLonAltBox extends KmlLatLonBox {
  /**
    * Specifies how the altitude property is interpreted.
    *
    * See also:
    *
    * * GEPlugin.ALTITUDE_CLAMP_TO_GROUND
    * * GEPlugin.ALTITUDE_RELATIVE_TO_GROUND
    * * GEPlugin.ALTITUDE_ABSOLUTE
    * * GEPlugin.ALTITUDE_CLAMP_TO_SEA_FLOOR
    * * GEPlugin.ALTITUDE_RELATIVE_TO_SEA_FLOOR
    */
  def getAltitudeMode(): KmlAltitudeModeEnum
  /**
    * Maximim altitude, specified in meters above sea level.
    */
  def getMaxAltitude(): Double
  /**
    * Minimum altitude, specified in meters above sea level.
    */
  def getMinAltitude(): Double
  /**
    * Sets the north, south, east, west, rotation, minAltitude, maxAltitude, and altitudeMode of bounding box.
    */
  def setAltBox(
    north: Double,
    south: Double,
    east: Double,
    west: Double,
    rotation: Double,
    minAltitude: Double,
    maxAltitude: Double,
    altitudeMode: KmlAltitudeModeEnum
  ): Unit
  /**
    * Specifies how the altitude property is interpreted.
    *
    * See also:
    *
    * * GEPlugin.ALTITUDE_CLAMP_TO_GROUND
    * * GEPlugin.ALTITUDE_RELATIVE_TO_GROUND
    * * GEPlugin.ALTITUDE_ABSOLUTE
    * * GEPlugin.ALTITUDE_CLAMP_TO_SEA_FLOOR
    * * GEPlugin.ALTITUDE_RELATIVE_TO_SEA_FLOOR
    */
  def setAltitudeMode(altitudeMode: KmlAltitudeModeEnum): Double
  /**
    * Maximim altitude, specified in meters above sea level.
    */
  def setMaxAltitude(maxAltitude: Double): Unit
  /**
    * Minimum altitude, specified in meters above sea level.
    */
  def setMinAltitude(minAltitude: Double): Unit
}

object KmlLatLonAltBox {
  @scala.inline
  def apply(
    click: KmlMouseEvent => Unit,
    dblclick: KmlMouseEvent => Unit,
    equals: KmlObject => Boolean,
    getAltitudeMode: () => KmlAltitudeModeEnum,
    getEast: () => Double,
    getId: () => String,
    getMaxAltitude: () => Double,
    getMinAltitude: () => Double,
    getNorth: () => Double,
    getOwnerDocument: () => KmlDocument,
    getParentNode: () => KmlObject,
    getRotation: () => Double,
    getSouth: () => Double,
    getType: () => String,
    getUrl: () => String,
    getWest: () => Double,
    mousedown: KmlMouseEvent => Unit,
    mousemove: KmlMouseEvent => Unit,
    mouseout: KmlMouseEvent => Unit,
    mouseover: KmlMouseEvent => Unit,
    mouseup: KmlMouseEvent => Unit,
    release: () => Unit,
    setAltBox: (Double, Double, Double, Double, Double, Double, Double, KmlAltitudeModeEnum) => Unit,
    setAltitudeMode: KmlAltitudeModeEnum => Double,
    setBox: (Double, Double, Double, Double, Double) => Unit,
    setEast: Double => Unit,
    setMaxAltitude: Double => Unit,
    setMinAltitude: Double => Unit,
    setNorth: Double => Unit,
    setRotation: Double => Unit,
    setSouth: Double => Unit,
    setWest: Double => Unit
  ): KmlLatLonAltBox = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1(click), dblclick = js.Any.fromFunction1(dblclick), equals = js.Any.fromFunction1(equals), getAltitudeMode = js.Any.fromFunction0(getAltitudeMode), getEast = js.Any.fromFunction0(getEast), getId = js.Any.fromFunction0(getId), getMaxAltitude = js.Any.fromFunction0(getMaxAltitude), getMinAltitude = js.Any.fromFunction0(getMinAltitude), getNorth = js.Any.fromFunction0(getNorth), getOwnerDocument = js.Any.fromFunction0(getOwnerDocument), getParentNode = js.Any.fromFunction0(getParentNode), getRotation = js.Any.fromFunction0(getRotation), getSouth = js.Any.fromFunction0(getSouth), getType = js.Any.fromFunction0(getType), getUrl = js.Any.fromFunction0(getUrl), getWest = js.Any.fromFunction0(getWest), mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove), mouseout = js.Any.fromFunction1(mouseout), mouseover = js.Any.fromFunction1(mouseover), mouseup = js.Any.fromFunction1(mouseup), release = js.Any.fromFunction0(release), setAltBox = js.Any.fromFunction8(setAltBox), setAltitudeMode = js.Any.fromFunction1(setAltitudeMode), setBox = js.Any.fromFunction5(setBox), setEast = js.Any.fromFunction1(setEast), setMaxAltitude = js.Any.fromFunction1(setMaxAltitude), setMinAltitude = js.Any.fromFunction1(setMinAltitude), setNorth = js.Any.fromFunction1(setNorth), setRotation = js.Any.fromFunction1(setRotation), setSouth = js.Any.fromFunction1(setSouth), setWest = js.Any.fromFunction1(setWest))
    __obj.asInstanceOf[KmlLatLonAltBox]
  }
}

