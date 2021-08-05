package typings.googleEarth.google.earth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KmlVec2 extends StObject {
  
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
  
  inline def apply(
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
  
  extension [Self <: KmlVec2](x: Self) {
    
    inline def setGetX(value: () => Double): Self = StObject.set(x, "getX", js.Any.fromFunction0(value))
    
    inline def setGetXUnits(value: () => KmlUnitsEnum): Self = StObject.set(x, "getXUnits", js.Any.fromFunction0(value))
    
    inline def setGetY(value: () => Double): Self = StObject.set(x, "getY", js.Any.fromFunction0(value))
    
    inline def setGetYUnits(value: () => KmlUnitsEnum): Self = StObject.set(x, "getYUnits", js.Any.fromFunction0(value))
    
    inline def setSet(value: (Double, KmlUnitsEnum, Double, KmlUnitsEnum) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction4(value))
    
    inline def setSetX(value: Double => Unit): Self = StObject.set(x, "setX", js.Any.fromFunction1(value))
    
    inline def setSetXUnits(value: KmlUnitsEnum => Unit): Self = StObject.set(x, "setXUnits", js.Any.fromFunction1(value))
    
    inline def setSetY(value: Double => Unit): Self = StObject.set(x, "setY", js.Any.fromFunction1(value))
    
    inline def setSetYUnits(value: KmlUnitsEnum => Unit): Self = StObject.set(x, "setYUnits", js.Any.fromFunction1(value))
  }
}
