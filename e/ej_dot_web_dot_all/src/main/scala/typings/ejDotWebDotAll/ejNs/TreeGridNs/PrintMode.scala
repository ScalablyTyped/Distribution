package typings.ejDotWebDotAll.ejNs.TreeGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PrintMode extends js.Object

@JSGlobal("ej.TreeGrid.PrintMode")
@js.native
object PrintMode extends js.Object {
  ///To print all the pages
  @js.native
  sealed trait AllPages extends PrintMode
  
  ///To print only the current page content.
  @js.native
  sealed trait CurrentPage extends PrintMode
  
  /* 0 */ val AllPages: typings.ejDotWebDotAll.ejNs.TreeGridNs.PrintMode.AllPages with Double = js.native
  /* 1 */ val CurrentPage: typings.ejDotWebDotAll.ejNs.TreeGridNs.PrintMode.CurrentPage with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PrintMode with Double] = js.native
}

