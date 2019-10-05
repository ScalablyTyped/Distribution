package typings.ejDotWebDotAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SelectionType extends js.Object

@JSGlobal("ej.Grid.SelectionType")
@js.native
object SelectionType extends js.Object {
  ///Specifies the selection type as multiple.
  @js.native
  sealed trait Multiple extends SelectionType
  
  ///Specifies the selection type as single.
  @js.native
  sealed trait Single extends SelectionType
  
  /* 1 */ val Multiple: typings.ejDotWebDotAll.ej.Grid.SelectionType.Multiple with Double = js.native
  /* 0 */ val Single: typings.ejDotWebDotAll.ej.Grid.SelectionType.Single with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SelectionType with Double] = js.native
}

