package typings.ejWebAll.ej.Spreadsheet

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContextMenuType with Double] = js.native
  /* 0 */ @js.native
  object Cell extends TopLevel[Cell with Double]
  
  /* 2 */ @js.native
  object ColumnHeader extends TopLevel[ColumnHeader with Double]
  
  /* 3 */ @js.native
  object Footer extends TopLevel[Footer with Double]
  
  /* 1 */ @js.native
  object RowHeader extends TopLevel[RowHeader with Double]
  
}

