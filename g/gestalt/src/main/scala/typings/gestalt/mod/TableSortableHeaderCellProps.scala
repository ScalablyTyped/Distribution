package typings.gestalt.mod

import typings.gestalt.anon.Event
import typings.gestalt.gestaltStrings.active
import typings.gestalt.gestaltStrings.asc
import typings.gestalt.gestaltStrings.col
import typings.gestalt.gestaltStrings.colgroup
import typings.gestalt.gestaltStrings.desc
import typings.gestalt.gestaltStrings.inactive
import typings.gestalt.gestaltStrings.row
import typings.gestalt.gestaltStrings.rowgroup
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLTableCellElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableSortableHeaderCellProps extends StObject {
  
  var children: Node
  
  var colSpan: js.UndefOr[Double] = js.undefined
  
  var onSortChange: AbstractEventHandler[
    (MouseEvent[HTMLTableCellElement, NativeMouseEvent]) | KeyboardEvent[HTMLTableCellElement], 
    js.Object
  ]
  
  var rowSpan: js.UndefOr[Double] = js.undefined
  
  var scope: js.UndefOr[col | row | colgroup | rowgroup] = js.undefined
  
  var sortOrder: asc | desc
  
  var status: active | inactive
}
object TableSortableHeaderCellProps {
  
  inline def apply(
    onSortChange: /* arg */ js.Object & (Event[
      (MouseEvent[HTMLTableCellElement, NativeMouseEvent]) | KeyboardEvent[HTMLTableCellElement]
    ]) => Unit,
    sortOrder: asc | desc,
    status: active | inactive
  ): TableSortableHeaderCellProps = {
    val __obj = js.Dynamic.literal(onSortChange = js.Any.fromFunction1(onSortChange), sortOrder = sortOrder.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableSortableHeaderCellProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableSortableHeaderCellProps] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: Node): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setColSpan(value: Double): Self = StObject.set(x, "colSpan", value.asInstanceOf[js.Any])
    
    inline def setColSpanUndefined: Self = StObject.set(x, "colSpan", js.undefined)
    
    inline def setOnSortChange(
      value: /* arg */ js.Object & (Event[
          (MouseEvent[HTMLTableCellElement, NativeMouseEvent]) | KeyboardEvent[HTMLTableCellElement]
        ]) => Unit
    ): Self = StObject.set(x, "onSortChange", js.Any.fromFunction1(value))
    
    inline def setRowSpan(value: Double): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
    
    inline def setRowSpanUndefined: Self = StObject.set(x, "rowSpan", js.undefined)
    
    inline def setScope(value: col | row | colgroup | rowgroup): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setSortOrder(value: asc | desc): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: active | inactive): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
