package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@fullcalendar/common", "DaySeriesModel")
@js.native
open class DaySeriesModel protected () extends StObject {
  def this(range: DateRange, dateProfileGenerator: DateProfileGenerator) = this()
  
  var cnt: Double = js.native
  
  var dates: js.Array[js.Date] = js.native
  
  /* private */ var getDateDayIndex: Any = js.native
  
  var indices: js.Array[Double] = js.native
  
  def sliceRange(range: DateRange): DaySeriesSeg | Null = js.native
}
