package typings.flexmonster.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpandAll extends StObject {
  
  var columns: js.UndefOr[js.Array[Measure]] = js.undefined
  
  var expandAll: js.UndefOr[Boolean] = js.undefined
  
  var rows: js.UndefOr[js.Array[Measure]] = js.undefined
}
object ExpandAll {
  
  inline def apply(): ExpandAll = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpandAll]
  }
  
  extension [Self <: ExpandAll](x: Self) {
    
    inline def setColumns(value: js.Array[Measure]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: Measure*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    inline def setExpandAll(value: Boolean): Self = StObject.set(x, "expandAll", value.asInstanceOf[js.Any])
    
    inline def setExpandAllUndefined: Self = StObject.set(x, "expandAll", js.undefined)
    
    inline def setRows(value: js.Array[Measure]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setRowsVarargs(value: Measure*): Self = StObject.set(x, "rows", js.Array(value :_*))
  }
}
