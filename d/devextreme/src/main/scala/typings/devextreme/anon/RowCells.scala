package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.pdfExporter.Cell
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowCells extends StObject {
  
  var rowCells: js.UndefOr[js.Array[Cell]] = js.undefined
  
  var rowHeight: js.UndefOr[Double] = js.undefined
}
object RowCells {
  
  inline def apply(): RowCells = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowCells]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RowCells] (val x: Self) extends AnyVal {
    
    inline def setRowCells(value: js.Array[Cell]): Self = StObject.set(x, "rowCells", value.asInstanceOf[js.Any])
    
    inline def setRowCellsUndefined: Self = StObject.set(x, "rowCells", js.undefined)
    
    inline def setRowCellsVarargs(value: Cell*): Self = StObject.set(x, "rowCells", js.Array(value*))
    
    inline def setRowHeight(value: Double): Self = StObject.set(x, "rowHeight", value.asInstanceOf[js.Any])
    
    inline def setRowHeightUndefined: Self = StObject.set(x, "rowHeight", js.undefined)
  }
}
