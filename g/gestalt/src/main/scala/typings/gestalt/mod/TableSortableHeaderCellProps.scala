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
  implicit class TableSortableHeaderCellPropsOps[Self <: TableSortableHeaderCellProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOnSortChange(
      value: /* arg */ js.Object with (Event[
          (MouseEvent[HTMLTableCellElement, NativeMouseEvent]) | KeyboardEvent[HTMLTableCellElement]
        ]) => Unit
    ): Self = this.set("onSortChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSortOrder(value: asc | desc): Self = this.set("sortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: active | inactive): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
