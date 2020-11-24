package typings.ejWebAll.ej.TreeGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ColumnResizeMode extends js.Object
@JSGlobal("ej.TreeGrid.ColumnResizeMode")
@js.native
object ColumnResizeMode extends js.Object {
  
  ///At load time column are rendered with given width value, while resizing the column only current column width is changed
  @js.native
  sealed trait FixedColumns extends ColumnResizeMode
  
  ///At load time columns are stretched with control width, while resizing the column, current column width adjusted based on next column
  @js.native
  sealed trait NextColumn extends ColumnResizeMode
  
  ///In this mode columns are stretched with control width in load time and on resizing action current column width was adjusted with all columns.
  @js.native
  sealed trait Normal extends ColumnResizeMode
}
