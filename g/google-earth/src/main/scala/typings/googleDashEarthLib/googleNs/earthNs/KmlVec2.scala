package typings
package googleDashEarthLib.googleNs.earthNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.earth.KmlVec2")
@js.native
class KmlVec2 () extends js.Object {
  /**
    * Indicates the x coordinate.
    */
  def getX(): scala.Double = js.native
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
  def getY(): scala.Double = js.native
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
  def set(x: scala.Double, xUnits: KmlUnitsEnum, y: scala.Double, yUnits: KmlUnitsEnum): scala.Unit = js.native
  /**
    * Indicates the x coordinate.
    */
  def setX(x: scala.Double): scala.Unit = js.native
  /**
    * Units in which the x value is specified.
    *
    * See also:
    *
    * * GEPlugin.UNITS_FRACTION
    * * GEPlugin.UNITS_PIXELS
    * * GEPlugin.UNITS_INSET_PIXELS
    */
  def setXUnits(xUnits: KmlUnitsEnum): scala.Unit = js.native
  /**
    * Indicates the y coordinate.
    */
  def setY(y: scala.Double): scala.Unit = js.native
  /**
    * Units in which the y value is specified.
    *
    * See also:
    *
    * * GEPlugin.UNITS_FRACTION
    * * GEPlugin.UNITS_PIyELS
    * * GEPlugin.UNITS_INSET_PIyELS
    */
  def setYUnits(xUnits: KmlUnitsEnum): scala.Unit = js.native
}

