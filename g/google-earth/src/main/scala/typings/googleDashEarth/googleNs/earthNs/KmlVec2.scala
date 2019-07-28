package typings.googleDashEarth.googleNs.earthNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.earth.KmlVec2")
@js.native
class KmlVec2 () extends js.Object {
  /**
    * Indicates the x coordinate.
    */
  def getX(): Double = js.native
  /**
    * Units in which the x value is specified.
    *
    * See also:
    *
    * * GEPlugin.UNITS_FRACTION
    * * GEPlugin.UNITS_PIXELS
    * * GEPlugin.UNITS_INSET_PIXELS
    */
  def getXUnits(): KmlUnitsEnum = js.native
  /**
    * Indicates the y coordinate.
    */
  def getY(): Double = js.native
  /**
    * Units in which the y value is specified.
    *
    * See also:
    *
    * * GEPlugin.UNITS_FRACTION
    * * GEPlugin.UNITS_PIyELS
    * * GEPlugin.UNITS_INSET_PIyELS
    */
  def getYUnits(): KmlUnitsEnum = js.native
  /**
    * Sets the coordinates of the vector.
    */
  def set(x: Double, xUnits: KmlUnitsEnum, y: Double, yUnits: KmlUnitsEnum): Unit = js.native
  /**
    * Indicates the x coordinate.
    */
  def setX(x: Double): Unit = js.native
  /**
    * Units in which the x value is specified.
    *
    * See also:
    *
    * * GEPlugin.UNITS_FRACTION
    * * GEPlugin.UNITS_PIXELS
    * * GEPlugin.UNITS_INSET_PIXELS
    */
  def setXUnits(xUnits: KmlUnitsEnum): Unit = js.native
  /**
    * Indicates the y coordinate.
    */
  def setY(y: Double): Unit = js.native
  /**
    * Units in which the y value is specified.
    *
    * See also:
    *
    * * GEPlugin.UNITS_FRACTION
    * * GEPlugin.UNITS_PIyELS
    * * GEPlugin.UNITS_INSET_PIyELS
    */
  def setYUnits(xUnits: KmlUnitsEnum): Unit = js.native
}

