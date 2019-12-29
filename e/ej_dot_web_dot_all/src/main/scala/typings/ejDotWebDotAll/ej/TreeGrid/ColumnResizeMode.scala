package typings.ejDotWebDotAll.ej.TreeGrid

import org.scalablytyped.runtime.TopLevel
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
  sealed trait FixedColumns extends ColumnResizeMode
  
  ///At load time columns are stretched with control width, while resizing the column, current column width adjusted based on next column
  @js.native
  sealed trait NextColumn extends ColumnResizeMode
  
  ///In this mode columns are stretched with control width in load time and on resizing action current column width was adjusted with all columns.
  @js.native
  sealed trait Normal extends ColumnResizeMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ColumnResizeMode with Double] = js.native
  /* 0 */ @js.native
  object FixedColumns extends TopLevel[FixedColumns with Double]
  
  /* 1 */ @js.native
  object NextColumn extends TopLevel[NextColumn with Double]
  
  /* 2 */ @js.native
  object Normal extends TopLevel[Normal with Double]
  
}

