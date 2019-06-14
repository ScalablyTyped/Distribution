package typings
package ejDotWebDotAllLib.ejNs.TreeGridNs

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
  sealed trait AllPages
    extends ejDotWebDotAllLib.ejNs.TreeGridNs.PrintMode
  
  ///To print only the current page content.
  @js.native
  sealed trait CurrentPage
    extends ejDotWebDotAllLib.ejNs.TreeGridNs.PrintMode
  
  /* 0 */ val AllPages: AllPages with scala.Double = js.native
  /* 1 */ val CurrentPage: CurrentPage with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.TreeGridNs.PrintMode with scala.Double] = js.native
}

