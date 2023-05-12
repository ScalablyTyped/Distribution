package typings.fullcalendarCore.internalCommonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DaySeriesModel extends StObject {
  
  var cnt: Double
  
  var dates: js.Array[js.Date]
  
  /* private */ var getDateDayIndex: Any
  
  var indices: js.Array[Double]
  
  def sliceRange(range: DateRange): DaySeriesSeg | Null
}
object DaySeriesModel {
  
  inline def apply(
    cnt: Double,
    dates: js.Array[js.Date],
    getDateDayIndex: Any,
    indices: js.Array[Double],
    sliceRange: DateRange => DaySeriesSeg | Null
  ): DaySeriesModel = {
    val __obj = js.Dynamic.literal(cnt = cnt.asInstanceOf[js.Any], dates = dates.asInstanceOf[js.Any], getDateDayIndex = getDateDayIndex.asInstanceOf[js.Any], indices = indices.asInstanceOf[js.Any], sliceRange = js.Any.fromFunction1(sliceRange))
    __obj.asInstanceOf[DaySeriesModel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DaySeriesModel] (val x: Self) extends AnyVal {
    
    inline def setCnt(value: Double): Self = StObject.set(x, "cnt", value.asInstanceOf[js.Any])
    
    inline def setDates(value: js.Array[js.Date]): Self = StObject.set(x, "dates", value.asInstanceOf[js.Any])
    
    inline def setDatesVarargs(value: js.Date*): Self = StObject.set(x, "dates", js.Array(value*))
    
    inline def setGetDateDayIndex(value: Any): Self = StObject.set(x, "getDateDayIndex", value.asInstanceOf[js.Any])
    
    inline def setIndices(value: js.Array[Double]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    inline def setIndicesVarargs(value: Double*): Self = StObject.set(x, "indices", js.Array(value*))
    
    inline def setSliceRange(value: DateRange => DaySeriesSeg | Null): Self = StObject.set(x, "sliceRange", js.Any.fromFunction1(value))
  }
}
