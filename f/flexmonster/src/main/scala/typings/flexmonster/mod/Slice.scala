package typings.flexmonster.mod

import typings.flexmonster.anon.Column
import typings.flexmonster.anon.DrillAll
import typings.flexmonster.anon.ExpandAll
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Slice extends StObject {
  
  var columns: js.UndefOr[js.Array[Hierarchy]] = js.native
  
  var drillThrough: js.UndefOr[js.Array[String]] = js.native
  
  var drills: js.UndefOr[DrillAll] = js.native
  
  var expands: js.UndefOr[ExpandAll] = js.native
  
  var flatOrder: js.UndefOr[js.Array[String]] = js.native
  
  var measures: js.UndefOr[js.Array[Measure]] = js.native
  
  var reportFilters: js.UndefOr[js.Array[Hierarchy]] = js.native
  
  var rows: js.UndefOr[js.Array[Hierarchy]] = js.native
  
  var sorting: js.UndefOr[Column] = js.native
}
object Slice {
  
  @scala.inline
  def apply(): Slice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Slice]
  }
  
  @scala.inline
  implicit class SliceMutableBuilder[Self <: Slice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumns(value: js.Array[Hierarchy]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    @scala.inline
    def setColumnsVarargs(value: Hierarchy*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    @scala.inline
    def setDrillThrough(value: js.Array[String]): Self = StObject.set(x, "drillThrough", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrillThroughUndefined: Self = StObject.set(x, "drillThrough", js.undefined)
    
    @scala.inline
    def setDrillThroughVarargs(value: String*): Self = StObject.set(x, "drillThrough", js.Array(value :_*))
    
    @scala.inline
    def setDrills(value: DrillAll): Self = StObject.set(x, "drills", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrillsUndefined: Self = StObject.set(x, "drills", js.undefined)
    
    @scala.inline
    def setExpands(value: ExpandAll): Self = StObject.set(x, "expands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandsUndefined: Self = StObject.set(x, "expands", js.undefined)
    
    @scala.inline
    def setFlatOrder(value: js.Array[String]): Self = StObject.set(x, "flatOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlatOrderUndefined: Self = StObject.set(x, "flatOrder", js.undefined)
    
    @scala.inline
    def setFlatOrderVarargs(value: String*): Self = StObject.set(x, "flatOrder", js.Array(value :_*))
    
    @scala.inline
    def setMeasures(value: js.Array[Measure]): Self = StObject.set(x, "measures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeasuresUndefined: Self = StObject.set(x, "measures", js.undefined)
    
    @scala.inline
    def setMeasuresVarargs(value: Measure*): Self = StObject.set(x, "measures", js.Array(value :_*))
    
    @scala.inline
    def setReportFilters(value: js.Array[Hierarchy]): Self = StObject.set(x, "reportFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportFiltersUndefined: Self = StObject.set(x, "reportFilters", js.undefined)
    
    @scala.inline
    def setReportFiltersVarargs(value: Hierarchy*): Self = StObject.set(x, "reportFilters", js.Array(value :_*))
    
    @scala.inline
    def setRows(value: js.Array[Hierarchy]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    @scala.inline
    def setRowsVarargs(value: Hierarchy*): Self = StObject.set(x, "rows", js.Array(value :_*))
    
    @scala.inline
    def setSorting(value: Column): Self = StObject.set(x, "sorting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortingUndefined: Self = StObject.set(x, "sorting", js.undefined)
  }
}
