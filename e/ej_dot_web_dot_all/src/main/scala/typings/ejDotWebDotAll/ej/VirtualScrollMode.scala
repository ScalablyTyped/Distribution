package typings.ejDotWebDotAll.ej

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.VirtualScrollMode.Continuous
import typings.ejDotWebDotAll.ej.VirtualScrollMode.Normal
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VirtualScrollMode with Double] = js.native
  /* 1 */ @js.native
  object Continuous extends TopLevel[Continuous with Double]
  
  /* 0 */ @js.native
  object Normal extends TopLevel[Normal with Double]
  
}

