package typings.googleEarth.global.google.earth

import typings.googleEarth.google.earth.KmlUnitsEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.earth.KmlVec2")
@js.native
class KmlVec2 ()
  extends typings.googleEarth.google.earth.KmlVec2 {
  /**
    * Indicates the x coordinate.
    */
  /* CompleteClass */
  override def getX(): Double = js.native
  /**
    * Units in which the x value is specified.
    *
    * See also:
    *
    * * GEPlugin.UNITS_FRACTION
    * * GEPlugin.UNITS_PIXELS
    * * GEPlugin.UNITS_INSET_PIXELS
    */
  /* CompleteClass */
  override def getXUnits(): KmlUnitsEnum = js.native
  /**
    * Indicates the y coordinate.
    */
  /* CompleteClass */
  override def getY(): Double = js.native
  /**
    * Units in which the y value is specified.
    *
    * See also:
    *
    * * GEPlugin.UNITS_FRACTION
    * * GEPlugin.UNITS_PIyELS
    * * GEPlugin.UNITS_INSET_PIyELS
    */
  /* CompleteClass */
  override def getYUnits(): KmlUnitsEnum = js.native
  /**
    * Sets the coordinates of the vector.
    */
  /* CompleteClass */
  override def set(x: Double, xUnits: KmlUnitsEnum, y: Double, yUnits: KmlUnitsEnum): Unit = js.native
  /**
    * Indicates the x coordinate.
    */
  /* CompleteClass */
  override def setX(x: Double): Unit = js.native
  /**
    * Units in which the x value is specified.
    *
    * See also:
    *
    * * GEPlugin.UNITS_FRACTION
    * * GEPlugin.UNITS_PIXELS
    * * GEPlugin.UNITS_INSET_PIXELS
    */
  /* CompleteClass */
  override def setXUnits(xUnits: KmlUnitsEnum): Unit = js.native
  /**
    * Indicates the y coordinate.
    */
  /* CompleteClass */
  override def setY(y: Double): Unit = js.native
  /**
    * Units in which the y value is specified.
    *
    * See also:
    *
    * * GEPlugin.UNITS_FRACTION
    * * GEPlugin.UNITS_PIyELS
    * * GEPlugin.UNITS_INSET_PIyELS
    */
  /* CompleteClass */
  override def setYUnits(xUnits: KmlUnitsEnum): Unit = js.native
}

