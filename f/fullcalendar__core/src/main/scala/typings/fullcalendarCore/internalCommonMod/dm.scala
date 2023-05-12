package typings.fullcalendarCore.internalCommonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@fullcalendar/core/internal-common", "dm")
@js.native
open class dm protected ()
  extends StObject
     with DaySeriesModel {
  def this(range: DateRange, dateProfileGenerator: DateProfileGenerator) = this()
  
  /* CompleteClass */
  var cnt: Double = js.native
  
  /* CompleteClass */
  var dates: js.Array[js.Date] = js.native
  
  /* private */ /* CompleteClass */
  var getDateDayIndex: Any = js.native
  
  /* CompleteClass */
  var indices: js.Array[Double] = js.native
  
  /* CompleteClass */
  override def sliceRange(range: DateRange): DaySeriesSeg | Null = js.native
}
