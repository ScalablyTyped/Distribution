package typings.flexmonster.anon

import typings.flexmonster.mod.ColumnSize
import typings.flexmonster.mod.RowSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Columns extends StObject {
  
  var columns: js.UndefOr[js.Array[ColumnSize]] = js.native
  
  var rows: js.UndefOr[js.Array[RowSize]] = js.native
}
object Columns {
  
  @scala.inline
  def apply(): Columns = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Columns]
  }
  
  @scala.inline
  implicit class ColumnsMutableBuilder[Self <: Columns] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumns(value: js.Array[ColumnSize]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    @scala.inline
    def setColumnsVarargs(value: ColumnSize*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    @scala.inline
    def setRows(value: js.Array[RowSize]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    @scala.inline
    def setRowsVarargs(value: RowSize*): Self = StObject.set(x, "rows", js.Array(value :_*))
  }
}
