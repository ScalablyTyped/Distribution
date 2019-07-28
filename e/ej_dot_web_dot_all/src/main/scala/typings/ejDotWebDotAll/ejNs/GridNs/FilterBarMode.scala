package typings.ejDotWebDotAll.ejNs.GridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FilterBarMode extends js.Object

@JSGlobal("ej.Grid.FilterBarMode")
@js.native
object FilterBarMode extends js.Object {
  ///Initiate filter operation on typing the filter query.
  @js.native
  sealed trait Immediate extends FilterBarMode
  
  ///Initiate filter operation after Enter key is pressed.
  @js.native
  sealed trait OnEnter extends FilterBarMode
  
  /* 0 */ val Immediate: typings.ejDotWebDotAll.ejNs.GridNs.FilterBarMode.Immediate with Double = js.native
  /* 1 */ val OnEnter: typings.ejDotWebDotAll.ejNs.GridNs.FilterBarMode.OnEnter with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FilterBarMode with Double] = js.native
}

