package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContextMenuType extends js.Object

@JSGlobal("ej.Spreadsheet.ContextMenuType")
@js.native
object ContextMenuType extends js.Object {
  ///To specify cell Context Menu.
  @js.native
  sealed trait Cell
    extends ejDotWebDotAllLib.ejNs.SpreadsheetNs.ContextMenuType
  
  ///To specify column header Context Menu.
  @js.native
  sealed trait ColumnHeader
    extends ejDotWebDotAllLib.ejNs.SpreadsheetNs.ContextMenuType
  
  ///To specify footer Context Menu.
  @js.native
  sealed trait Footer
    extends ejDotWebDotAllLib.ejNs.SpreadsheetNs.ContextMenuType
  
  ///To specify row header Context Menu.
  @js.native
  sealed trait RowHeader
    extends ejDotWebDotAllLib.ejNs.SpreadsheetNs.ContextMenuType
  
  /* 0 */ val Cell: Cell with scala.Double = js.native
  /* 2 */ val ColumnHeader: ColumnHeader with scala.Double = js.native
  /* 3 */ val Footer: Footer with scala.Double = js.native
  /* 1 */ val RowHeader: RowHeader with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.SpreadsheetNs.ContextMenuType with scala.Double] = js.native
}

