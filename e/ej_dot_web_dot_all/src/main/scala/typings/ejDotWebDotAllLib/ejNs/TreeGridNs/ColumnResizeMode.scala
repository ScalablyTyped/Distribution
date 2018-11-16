package typings
package ejDotWebDotAllLib.ejNs.TreeGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ColumnResizeMode extends js.Object

@JSGlobal("ej.TreeGrid.ColumnResizeMode")
@js.native
object ColumnResizeMode extends js.Object {
  ///At load time column are rendered with given width value, while resizing the column only current column width is changed
  @js.native
  sealed trait FixedColumns
    extends ejDotWebDotAllLib.ejNs.TreeGridNs.ColumnResizeMode
  
  ///At load time columns are stretched with control width, while resizing the column, current column width adjusted based on next column
  @js.native
  sealed trait NextColumn
    extends ejDotWebDotAllLib.ejNs.TreeGridNs.ColumnResizeMode
  
  ///In this mode columns are stretched with control width in load time and on resizing action current column width was adjusted with all columns.
  @js.native
  sealed trait Normal
    extends ejDotWebDotAllLib.ejNs.TreeGridNs.ColumnResizeMode
  
  val FixedColumns: FixedColumns with java.lang.String = js.native
  val NextColumn: NextColumn with java.lang.String = js.native
  val Normal: Normal with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.TreeGridNs.ColumnResizeMode with java.lang.String] = js.native
}

