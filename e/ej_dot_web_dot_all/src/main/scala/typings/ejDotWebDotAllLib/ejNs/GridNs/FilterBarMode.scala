package typings
package ejDotWebDotAllLib.ejNs.GridNs

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
  sealed trait Immediate
    extends ejDotWebDotAllLib.ejNs.GridNs.FilterBarMode
  
  ///Initiate filter operation after Enter key is pressed.
  @js.native
  sealed trait OnEnter
    extends ejDotWebDotAllLib.ejNs.GridNs.FilterBarMode
  
  /* 0 */ val Immediate: Immediate with scala.Double = js.native
  /* 1 */ val OnEnter: OnEnter with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.GridNs.FilterBarMode with scala.Double] = js.native
}

