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
  
  val Immediate: Immediate with java.lang.String = js.native
  val OnEnter: OnEnter with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.GridNs.FilterBarMode with java.lang.String] = js.native
}

