package typings.flexmonster.mod

import typings.flexmonster.anon.Column
import typings.flexmonster.anon.DrillAll
import typings.flexmonster.anon.ExpandAll
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Slice extends StObject {
  
  var columns: js.UndefOr[js.Array[Hierarchy]] = js.undefined
  
  var drillThrough: js.UndefOr[js.Array[String]] = js.undefined
  
  var drills: js.UndefOr[DrillAll] = js.undefined
  
  var expands: js.UndefOr[ExpandAll] = js.undefined
  
  var flatOrder: js.UndefOr[js.Array[String]] = js.undefined
  
  var measures: js.UndefOr[js.Array[Measure]] = js.undefined
  
  var reportFilters: js.UndefOr[js.Array[Hierarchy]] = js.undefined
  
  var rows: js.UndefOr[js.Array[Hierarchy]] = js.undefined
  
  var sorting: js.UndefOr[Column] = js.undefined
}
object Slice {
  
  inline def apply(): Slice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Slice]
  }
  
  extension [Self <: Slice](x: Self) {
    
    inline def setColumns(value: js.Array[Hierarchy]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: Hierarchy*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    inline def setDrillThrough(value: js.Array[String]): Self = StObject.set(x, "drillThrough", value.asInstanceOf[js.Any])
    
    inline def setDrillThroughUndefined: Self = StObject.set(x, "drillThrough", js.undefined)
    
    inline def setDrillThroughVarargs(value: String*): Self = StObject.set(x, "drillThrough", js.Array(value :_*))
    
    inline def setDrills(value: DrillAll): Self = StObject.set(x, "drills", value.asInstanceOf[js.Any])
    
    inline def setDrillsUndefined: Self = StObject.set(x, "drills", js.undefined)
    
    inline def setExpands(value: ExpandAll): Self = StObject.set(x, "expands", value.asInstanceOf[js.Any])
    
    inline def setExpandsUndefined: Self = StObject.set(x, "expands", js.undefined)
    
    inline def setFlatOrder(value: js.Array[String]): Self = StObject.set(x, "flatOrder", value.asInstanceOf[js.Any])
    
    inline def setFlatOrderUndefined: Self = StObject.set(x, "flatOrder", js.undefined)
    
    inline def setFlatOrderVarargs(value: String*): Self = StObject.set(x, "flatOrder", js.Array(value :_*))
    
    inline def setMeasures(value: js.Array[Measure]): Self = StObject.set(x, "measures", value.asInstanceOf[js.Any])
    
    inline def setMeasuresUndefined: Self = StObject.set(x, "measures", js.undefined)
    
    inline def setMeasuresVarargs(value: Measure*): Self = StObject.set(x, "measures", js.Array(value :_*))
    
    inline def setReportFilters(value: js.Array[Hierarchy]): Self = StObject.set(x, "reportFilters", value.asInstanceOf[js.Any])
    
    inline def setReportFiltersUndefined: Self = StObject.set(x, "reportFilters", js.undefined)
    
    inline def setReportFiltersVarargs(value: Hierarchy*): Self = StObject.set(x, "reportFilters", js.Array(value :_*))
    
    inline def setRows(value: js.Array[Hierarchy]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setRowsVarargs(value: Hierarchy*): Self = StObject.set(x, "rows", js.Array(value :_*))
    
    inline def setSorting(value: Column): Self = StObject.set(x, "sorting", value.asInstanceOf[js.Any])
    
    inline def setSortingUndefined: Self = StObject.set(x, "sorting", js.undefined)
  }
}
