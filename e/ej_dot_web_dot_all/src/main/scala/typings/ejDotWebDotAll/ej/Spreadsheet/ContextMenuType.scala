package typings.ejDotWebDotAll.ej.Spreadsheet

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
  
  /* 0 */ val Cell: typings.ejDotWebDotAll.ej.Spreadsheet.ContextMenuType.Cell with Double = js.native
  /* 2 */ val ColumnHeader: typings.ejDotWebDotAll.ej.Spreadsheet.ContextMenuType.ColumnHeader with Double = js.native
  /* 3 */ val Footer: typings.ejDotWebDotAll.ej.Spreadsheet.ContextMenuType.Footer with Double = js.native
  /* 1 */ val RowHeader: typings.ejDotWebDotAll.ej.Spreadsheet.ContextMenuType.RowHeader with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContextMenuType with Double] = js.native
}

