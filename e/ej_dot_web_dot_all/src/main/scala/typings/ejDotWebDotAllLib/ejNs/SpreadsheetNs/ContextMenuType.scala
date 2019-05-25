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
  
  val Cell: Cell with java.lang.String = js.native
  val ColumnHeader: ColumnHeader with java.lang.String = js.native
  val Footer: Footer with java.lang.String = js.native
  val RowHeader: RowHeader with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.SpreadsheetNs.ContextMenuType with java.lang.String] = js.native
}

