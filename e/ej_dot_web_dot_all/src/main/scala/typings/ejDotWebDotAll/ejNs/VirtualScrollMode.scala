package typings.ejDotWebDotAll.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VirtualScrollMode extends js.Object

@JSGlobal("ej.VirtualScrollMode")
@js.native
object VirtualScrollMode extends js.Object {
  //The data items are loaded from the remote when scroll handle reaches the end of the scrollbar like infinity scrolling.
  @js.native
  sealed trait Continuous extends VirtualScrollMode
  
  //The data is loaded only to the corresponding page (display items). When scrolling some other position, it enables the load on demand with the DropDownList.
  @js.native
  sealed trait Normal extends VirtualScrollMode
  
  /* 1 */ val Continuous: typings.ejDotWebDotAll.ejNs.VirtualScrollMode.Continuous with Double = js.native
  /* 0 */ val Normal: typings.ejDotWebDotAll.ejNs.VirtualScrollMode.Normal with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VirtualScrollMode with Double] = js.native
}

