package typings.ejDotWebDotAll.ejNs.SpreadsheetNs

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
  sealed trait Cell extends ContextMenuType
  
  ///To specify column header Context Menu.
  @js.native
  sealed trait ColumnHeader extends ContextMenuType
  
  ///To specify footer Context Menu.
  @js.native
  sealed trait Footer extends ContextMenuType
  
  ///To specify row header Context Menu.
  @js.native
  sealed trait RowHeader extends ContextMenuType
  
  /* 0 */ val Cell: typings.ejDotWebDotAll.ejNs.SpreadsheetNs.ContextMenuType.Cell with Double = js.native
  /* 2 */ val ColumnHeader: typings.ejDotWebDotAll.ejNs.SpreadsheetNs.ContextMenuType.ColumnHeader with Double = js.native
  /* 3 */ val Footer: typings.ejDotWebDotAll.ejNs.SpreadsheetNs.ContextMenuType.Footer with Double = js.native
  /* 1 */ val RowHeader: typings.ejDotWebDotAll.ejNs.SpreadsheetNs.ContextMenuType.RowHeader with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContextMenuType with Double] = js.native
}

