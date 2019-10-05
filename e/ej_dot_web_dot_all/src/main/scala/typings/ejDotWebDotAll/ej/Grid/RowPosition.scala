package typings.ejDotWebDotAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RowPosition extends js.Object

@JSGlobal("ej.Grid.RowPosition")
@js.native
object RowPosition extends js.Object {
  ///Specifies position of add new row as bottom.
  @js.native
  sealed trait Bottom extends RowPosition
  
  ///Specifies position of add new row as top.
  @js.native
  sealed trait Top extends RowPosition
  
  /* 1 */ val Bottom: typings.ejDotWebDotAll.ej.Grid.RowPosition.Bottom with Double = js.native
  /* 0 */ val Top: typings.ejDotWebDotAll.ej.Grid.RowPosition.Top with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RowPosition with Double] = js.native
}

