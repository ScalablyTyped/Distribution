package typings.gestalt.mod

import typings.gestalt.gestaltStrings.col
import typings.gestalt.gestaltStrings.colgroup
import typings.gestalt.gestaltStrings.row
import typings.gestalt.gestaltStrings.rowgroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableHeaderCellProps extends TableCellProps {
  
  var scope: js.UndefOr[col | row | colgroup | rowgroup] = js.native
}
object TableHeaderCellProps {
  
  @scala.inline
  def apply(): TableHeaderCellProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableHeaderCellProps]
  }
  
  @scala.inline
  implicit class TableHeaderCellPropsOps[Self <: TableHeaderCellProps] (val x: Self) extends AnyVal {
    
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
    def setScope(value: col | row | colgroup | rowgroup): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
  }
}
