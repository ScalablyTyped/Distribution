package typings.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
