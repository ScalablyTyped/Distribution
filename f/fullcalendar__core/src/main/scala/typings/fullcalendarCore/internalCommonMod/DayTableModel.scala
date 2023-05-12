package typings.fullcalendarCore.internalCommonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DayTableModel extends StObject {
  
  /* private */ var buildCell: Any
  
  /* private */ var buildCells: Any
  
  /* private */ var buildHeaderDates: Any
  
  var cells: js.Array[js.Array[DayTableCell]]
  
  var colCnt: Double
  
  /* private */ var daySeries: Any
  
  var headerDates: js.Array[js.Date]
  
  var rowCnt: Double
  
  def sliceRange(range: DateRange): js.Array[DayTableSeg]
}
object DayTableModel {
  
  inline def apply(
    buildCell: Any,
    buildCells: Any,
    buildHeaderDates: Any,
    cells: js.Array[js.Array[DayTableCell]],
    colCnt: Double,
    daySeries: Any,
    headerDates: js.Array[js.Date],
    rowCnt: Double,
    sliceRange: DateRange => js.Array[DayTableSeg]
  ): DayTableModel = {
    val __obj = js.Dynamic.literal(buildCell = buildCell.asInstanceOf[js.Any], buildCells = buildCells.asInstanceOf[js.Any], buildHeaderDates = buildHeaderDates.asInstanceOf[js.Any], cells = cells.asInstanceOf[js.Any], colCnt = colCnt.asInstanceOf[js.Any], daySeries = daySeries.asInstanceOf[js.Any], headerDates = headerDates.asInstanceOf[js.Any], rowCnt = rowCnt.asInstanceOf[js.Any], sliceRange = js.Any.fromFunction1(sliceRange))
    __obj.asInstanceOf[DayTableModel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DayTableModel] (val x: Self) extends AnyVal {
    
    inline def setBuildCell(value: Any): Self = StObject.set(x, "buildCell", value.asInstanceOf[js.Any])
    
    inline def setBuildCells(value: Any): Self = StObject.set(x, "buildCells", value.asInstanceOf[js.Any])
    
    inline def setBuildHeaderDates(value: Any): Self = StObject.set(x, "buildHeaderDates", value.asInstanceOf[js.Any])
    
    inline def setCells(value: js.Array[js.Array[DayTableCell]]): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
    
    inline def setCellsVarargs(value: js.Array[DayTableCell]*): Self = StObject.set(x, "cells", js.Array(value*))
    
    inline def setColCnt(value: Double): Self = StObject.set(x, "colCnt", value.asInstanceOf[js.Any])
    
    inline def setDaySeries(value: Any): Self = StObject.set(x, "daySeries", value.asInstanceOf[js.Any])
    
    inline def setHeaderDates(value: js.Array[js.Date]): Self = StObject.set(x, "headerDates", value.asInstanceOf[js.Any])
    
    inline def setHeaderDatesVarargs(value: js.Date*): Self = StObject.set(x, "headerDates", js.Array(value*))
    
    inline def setRowCnt(value: Double): Self = StObject.set(x, "rowCnt", value.asInstanceOf[js.Any])
    
    inline def setSliceRange(value: DateRange => js.Array[DayTableSeg]): Self = StObject.set(x, "sliceRange", js.Any.fromFunction1(value))
  }
}
