package typings.flexmonster.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DrillAll extends StObject {
  
  var columns: js.UndefOr[js.Array[Measure]] = js.native
  
  var drillAll: js.UndefOr[Boolean] = js.native
  
  var rows: js.UndefOr[js.Array[Measure]] = js.native
}
object DrillAll {
  
  @scala.inline
  def apply(): DrillAll = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrillAll]
  }
  
  @scala.inline
  implicit class DrillAllMutableBuilder[Self <: DrillAll] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumns(value: js.Array[Measure]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    @scala.inline
    def setColumnsVarargs(value: Measure*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    @scala.inline
    def setDrillAll(value: Boolean): Self = StObject.set(x, "drillAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrillAllUndefined: Self = StObject.set(x, "drillAll", js.undefined)
    
    @scala.inline
    def setRows(value: js.Array[Measure]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    @scala.inline
    def setRowsVarargs(value: Measure*): Self = StObject.set(x, "rows", js.Array(value :_*))
  }
}
