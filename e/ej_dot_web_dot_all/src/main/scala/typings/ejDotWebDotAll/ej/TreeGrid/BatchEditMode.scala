package typings.ejDotWebDotAll.ej.TreeGrid

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BatchEditMode extends js.Object

@JSGlobal("ej.TreeGrid.BatchEditMode")
@js.native
object BatchEditMode extends js.Object {
  ///you can edit a cell
  @js.native
  sealed trait Cell extends BatchEditMode
  
  ///you can edit a row in dialog form
  @js.native
  sealed trait Dialog extends BatchEditMode
  
  ///you can edit a row
  @js.native
  sealed trait Row extends BatchEditMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BatchEditMode with Double] = js.native
  /* 0 */ @js.native
  object Cell extends TopLevel[Cell with Double]
  
  /* 2 */ @js.native
  object Dialog extends TopLevel[Dialog with Double]
  
  /* 1 */ @js.native
  object Row extends TopLevel[Row with Double]
  
}

