package typings.flexmonster.anon

import typings.flexmonster.mod.ColumnSize
import typings.flexmonster.mod.RowSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Columns extends StObject {
  
  var columns: js.UndefOr[js.Array[ColumnSize]] = js.undefined
  
  var rows: js.UndefOr[js.Array[RowSize]] = js.undefined
}
object Columns {
  
  inline def apply(): Columns = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Columns]
  }
  
  extension [Self <: Columns](x: Self) {
    
    inline def setColumns(value: js.Array[ColumnSize]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: ColumnSize*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setRows(value: js.Array[RowSize]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setRowsVarargs(value: RowSize*): Self = StObject.set(x, "rows", js.Array(value*))
  }
}
