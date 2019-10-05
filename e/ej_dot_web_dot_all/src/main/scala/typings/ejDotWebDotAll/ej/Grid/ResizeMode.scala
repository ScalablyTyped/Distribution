package typings.ejDotWebDotAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ResizeMode extends js.Object

@JSGlobal("ej.Grid.ResizeMode")
@js.native
object ResizeMode extends js.Object {
  ///New column Size will be adjusted using entire control
  @js.native
  sealed trait Control extends ResizeMode
  
  ///New column Size will be adjusted using next column.
  @js.native
  sealed trait NextColumn extends ResizeMode
  
  ///New column size will be adjusted by all other Columns
  @js.native
  sealed trait Normal extends ResizeMode
  
  /* 2 */ val Control: typings.ejDotWebDotAll.ej.Grid.ResizeMode.Control with Double = js.native
  /* 1 */ val NextColumn: typings.ejDotWebDotAll.ej.Grid.ResizeMode.NextColumn with Double = js.native
  /* 0 */ val Normal: typings.ejDotWebDotAll.ej.Grid.ResizeMode.Normal with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ResizeMode with Double] = js.native
}

