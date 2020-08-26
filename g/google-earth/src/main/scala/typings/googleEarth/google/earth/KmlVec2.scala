package typings.googleEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KmlVec2 extends js.Object {
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
  @scala.inline
  implicit class KmlVec2Ops[Self <: KmlVec2] (val x: Self) extends AnyVal {
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
    def setGetX(value: () => Double): Self = this.set("getX", js.Any.fromFunction0(value))
    @scala.inline
    def setGetXUnits(value: () => KmlUnitsEnum): Self = this.set("getXUnits", js.Any.fromFunction0(value))
    @scala.inline
    def setGetY(value: () => Double): Self = this.set("getY", js.Any.fromFunction0(value))
    @scala.inline
    def setGetYUnits(value: () => KmlUnitsEnum): Self = this.set("getYUnits", js.Any.fromFunction0(value))
    @scala.inline
    def setSet(value: (Double, KmlUnitsEnum, Double, KmlUnitsEnum) => Unit): Self = this.set("set", js.Any.fromFunction4(value))
    @scala.inline
    def setSetX(value: Double => Unit): Self = this.set("setX", js.Any.fromFunction1(value))
    @scala.inline
    def setSetXUnits(value: KmlUnitsEnum => Unit): Self = this.set("setXUnits", js.Any.fromFunction1(value))
    @scala.inline
    def setSetY(value: Double => Unit): Self = this.set("setY", js.Any.fromFunction1(value))
    @scala.inline
    def setSetYUnits(value: KmlUnitsEnum => Unit): Self = this.set("setYUnits", js.Any.fromFunction1(value))
  }
  
}

