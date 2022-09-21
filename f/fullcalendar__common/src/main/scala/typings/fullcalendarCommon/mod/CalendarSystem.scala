package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalendarSystem extends StObject {
  
  def arrayToMarker(arr: js.Array[Double]): js.Date
  
  def getMarkerDay(d: js.Date): Double
  
  def getMarkerMonth(d: js.Date): Double
  
  def getMarkerYear(d: js.Date): Double
  
  def markerToArray(d: js.Date): js.Array[Double]
}
object CalendarSystem {
  
  inline def apply(
    arrayToMarker: js.Array[Double] => js.Date,
    getMarkerDay: js.Date => Double,
    getMarkerMonth: js.Date => Double,
    getMarkerYear: js.Date => Double,
    markerToArray: js.Date => js.Array[Double]
  ): CalendarSystem = {
    val __obj = js.Dynamic.literal(arrayToMarker = js.Any.fromFunction1(arrayToMarker), getMarkerDay = js.Any.fromFunction1(getMarkerDay), getMarkerMonth = js.Any.fromFunction1(getMarkerMonth), getMarkerYear = js.Any.fromFunction1(getMarkerYear), markerToArray = js.Any.fromFunction1(markerToArray))
    __obj.asInstanceOf[CalendarSystem]
  }
  
  extension [Self <: CalendarSystem](x: Self) {
    
    inline def setArrayToMarker(value: js.Array[Double] => js.Date): Self = StObject.set(x, "arrayToMarker", js.Any.fromFunction1(value))
    
    inline def setGetMarkerDay(value: js.Date => Double): Self = StObject.set(x, "getMarkerDay", js.Any.fromFunction1(value))
    
    inline def setGetMarkerMonth(value: js.Date => Double): Self = StObject.set(x, "getMarkerMonth", js.Any.fromFunction1(value))
    
    inline def setGetMarkerYear(value: js.Date => Double): Self = StObject.set(x, "getMarkerYear", js.Any.fromFunction1(value))
    
    inline def setMarkerToArray(value: js.Date => js.Array[Double]): Self = StObject.set(x, "markerToArray", js.Any.fromFunction1(value))
  }
}
