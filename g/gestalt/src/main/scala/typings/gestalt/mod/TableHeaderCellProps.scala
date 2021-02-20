package typings.gestalt.mod

import typings.gestalt.gestaltStrings.col
import typings.gestalt.gestaltStrings.colgroup
import typings.gestalt.gestaltStrings.row
import typings.gestalt.gestaltStrings.rowgroup
import org.scalablytyped.runtime.StObject
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
  implicit class TableHeaderCellPropsMutableBuilder[Self <: TableHeaderCellProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScope(value: col | row | colgroup | rowgroup): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}
