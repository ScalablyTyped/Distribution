package typings.gestalt.mod

import typings.gestalt.anon.Event
import typings.gestalt.gestaltStrings.active
import typings.gestalt.gestaltStrings.asc
import typings.gestalt.gestaltStrings.desc
import typings.gestalt.gestaltStrings.inactive
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLTableCellElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableSortableHeaderCellProps extends TableHeaderCellProps {
  
  var onSortChange: AbstractEventHandler[
    (MouseEvent[HTMLTableCellElement, NativeMouseEvent]) | KeyboardEvent[HTMLTableCellElement], 
    js.Object
  ] = js.native
  
  var sortOrder: asc | desc = js.native
  
  var status: active | inactive = js.native
}
object TableSortableHeaderCellProps {
  
  @scala.inline
  def apply(
    onSortChange: /* arg */ js.Object with (Event[
      (MouseEvent[HTMLTableCellElement, NativeMouseEvent]) | KeyboardEvent[HTMLTableCellElement]
    ]) => Unit,
    sortOrder: asc | desc,
    status: active | inactive
  ): TableSortableHeaderCellProps = {
    val __obj = js.Dynamic.literal(onSortChange = js.Any.fromFunction1(onSortChange), sortOrder = sortOrder.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableSortableHeaderCellProps]
  }
  
  @scala.inline
  implicit class TableSortableHeaderCellPropsMutableBuilder[Self <: TableSortableHeaderCellProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnSortChange(
      value: /* arg */ js.Object with (Event[
          (MouseEvent[HTMLTableCellElement, NativeMouseEvent]) | KeyboardEvent[HTMLTableCellElement]
        ]) => Unit
    ): Self = StObject.set(x, "onSortChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSortOrder(value: asc | desc): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: active | inactive): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
