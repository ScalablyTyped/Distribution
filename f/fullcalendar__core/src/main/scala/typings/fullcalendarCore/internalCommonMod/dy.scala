package typings.fullcalendarCore.internalCommonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@fullcalendar/core/internal-common", "dy")
@js.native
open class dy protected ()
  extends StObject
     with DayTableModel {
  def this(daySeries: DaySeriesModel, breakOnWeeks: Boolean) = this()
  
  /* private */ /* CompleteClass */
  var buildCell: Any = js.native
  
  /* private */ /* CompleteClass */
  var buildCells: Any = js.native
  
  /* private */ /* CompleteClass */
  var buildHeaderDates: Any = js.native
  
  /* CompleteClass */
  var cells: js.Array[js.Array[DayTableCell]] = js.native
  
  /* CompleteClass */
  var colCnt: Double = js.native
  
  /* private */ /* CompleteClass */
  var daySeries: Any = js.native
  
  /* CompleteClass */
  var headerDates: js.Array[js.Date] = js.native
  
  /* CompleteClass */
  var rowCnt: Double = js.native
  
  /* CompleteClass */
  override def sliceRange(range: DateRange): js.Array[DayTableSeg] = js.native
}
