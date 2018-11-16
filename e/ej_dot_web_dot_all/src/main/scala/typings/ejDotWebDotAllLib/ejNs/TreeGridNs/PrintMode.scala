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
  
  val AllPages: AllPages with java.lang.String = js.native
  val CurrentPage: CurrentPage with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.TreeGridNs.PrintMode with java.lang.String] = js.native
}

