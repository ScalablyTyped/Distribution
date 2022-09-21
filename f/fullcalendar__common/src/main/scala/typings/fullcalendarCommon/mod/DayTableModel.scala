package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@fullcalendar/common", "DayTableModel")
@js.native
open class DayTableModel protected () extends StObject {
  def this(daySeries: DaySeriesModel, breakOnWeeks: Boolean) = this()
  
  /* private */ var buildCell: Any = js.native
  
  /* private */ var buildCells: Any = js.native
  
  /* private */ var buildHeaderDates: Any = js.native
  
  var cells: js.Array[js.Array[DayTableCell]] = js.native
  
  var colCnt: Double = js.native
  
  /* private */ var daySeries: Any = js.native
  
  var headerDates: js.Array[js.Date] = js.native
  
  var rowCnt: Double = js.native
  
  def sliceRange(range: DateRange): js.Array[DayTableSeg] = js.native
}
