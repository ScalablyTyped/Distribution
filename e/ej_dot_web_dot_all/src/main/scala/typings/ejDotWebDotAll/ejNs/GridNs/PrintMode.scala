package typings.ejDotWebDotAll.ejNs.GridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PrintMode extends js.Object

@JSGlobal("ej.Grid.PrintMode")
@js.native
object PrintMode extends js.Object {
  ///Prints all pages.
  @js.native
  sealed trait AllPages extends PrintMode
  
  ///Prints current page.
  @js.native
  sealed trait CurrentPage extends PrintMode
  
  /* 0 */ val AllPages: typings.ejDotWebDotAll.ejNs.GridNs.PrintMode.AllPages with Double = js.native
  /* 1 */ val CurrentPage: typings.ejDotWebDotAll.ejNs.GridNs.PrintMode.CurrentPage with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PrintMode with Double] = js.native
}

