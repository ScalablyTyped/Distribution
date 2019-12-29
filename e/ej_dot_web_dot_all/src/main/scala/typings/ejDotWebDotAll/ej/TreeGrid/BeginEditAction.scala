package typings.ejDotWebDotAll.ej.TreeGrid

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BeginEditAction extends js.Object

@JSGlobal("ej.TreeGrid.BeginEditAction")
@js.native
object BeginEditAction extends js.Object {
  ///you can begin the editing at single click
  @js.native
  sealed trait Click extends BeginEditAction
  
  ///you can begin the editing at double click
  @js.native
  sealed trait DblClick extends BeginEditAction
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BeginEditAction with Double] = js.native
  /* 1 */ @js.native
  object Click extends TopLevel[Click with Double]
  
  /* 0 */ @js.native
  object DblClick extends TopLevel[DblClick with Double]
  
}

