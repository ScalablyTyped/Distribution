package typings.googleEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KmlVec2 extends js.Object {
  /**
    * Indicates the x coordinate.
    */
  def getX(): Double
  /**
    * Units in which the x value is specified.
    *
    * See also:
    *
    * * GEPlugin.UNITS_FRACTION
    * * GEPlugin.UNITS_PIXELS
    * * GEPlugin.UNITS_INSET_PIXELS
    */
  def getXUnits(): KmlUnitsEnum
  /**
    * Indicates the y coordinate.
    */
  def getY(): Double
  /**
    * Units in which the y value is specified.
    *
    * See also:
    *
    * * GEPlugin.UNITS_FRACTION
    * * GEPlugin.UNITS_PIyELS
    * * GEPlugin.UNITS_INSET_PIyELS
    */
  def getYUnits(): KmlUnitsEnum
  /**
    * Sets the coordinates of the vector.
    */
  def set(x: Double, xUnits: KmlUnitsEnum, y: Double, yUnits: KmlUnitsEnum): Unit
  /**
    * Indicates the x coordinate.
    */
  def setX(x: Double): Unit
  /**
    * Units in which the x value is specified.
    *
    * See also:
    *
    * * GEPlugin.UNITS_FRACTION
    * * GEPlugin.UNITS_PIXELS
    * * GEPlugin.UNITS_INSET_PIXELS
    */
  def setXUnits(xUnits: KmlUnitsEnum): Unit
  /**
    * Indicates the y coordinate.
    */
  def setY(y: Double): Unit
  /**
    * Units in which the y value is specified.
    *
    * See also:
    *
    * * GEPlugin.UNITS_FRACTION
    * * GEPlugin.UNITS_PIyELS
    * * GEPlugin.UNITS_INSET_PIyELS
    */
  def setYUnits(xUnits: KmlUnitsEnum): Unit
}

object KmlVec2 {
  @scala.inline
  def apply(
    getX: () => Double,
    getXUnits: () => KmlUnitsEnum,
    getY: () => Double,
    getYUnits: () => KmlUnitsEnum,
    set: (Double, KmlUnitsEnum, Double, KmlUnitsEnum) => Unit,
    setX: Double => Unit,
    setXUnits: KmlUnitsEnum => Unit,
    setY: Double => Unit,
    setYUnits: KmlUnitsEnum => Unit
  ): KmlVec2 = {
    val __obj = js.Dynamic.literal(getX = js.Any.fromFunction0(getX), getXUnits = js.Any.fromFunction0(getXUnits), getY = js.Any.fromFunction0(getY), getYUnits = js.Any.fromFunction0(getYUnits), set = js.Any.fromFunction4(set), setX = js.Any.fromFunction1(setX), setXUnits = js.Any.fromFunction1(setXUnits), setY = js.Any.fromFunction1(setY), setYUnits = js.Any.fromFunction1(setYUnits))
    __obj.asInstanceOf[KmlVec2]
  }
}

