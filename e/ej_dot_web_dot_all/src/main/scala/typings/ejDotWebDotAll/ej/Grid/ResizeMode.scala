package typings.ejDotWebDotAll.ej.Grid

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.Grid.ResizeMode.Control
import typings.ejDotWebDotAll.ej.Grid.ResizeMode.NextColumn
import typings.ejDotWebDotAll.ej.Grid.ResizeMode.Normal
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ResizeMode with Double] = js.native
  /* 2 */ @js.native
  object Control extends TopLevel[Control with Double]
  
  /* 1 */ @js.native
  object NextColumn extends TopLevel[NextColumn with Double]
  
  /* 0 */ @js.native
  object Normal extends TopLevel[Normal with Double]
  
}

