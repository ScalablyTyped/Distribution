package typings
package ejDotWebDotAllLib.ejNs.TreeGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HeaderTextOverflow extends js.Object

@JSGlobal("ej.TreeGrid.HeaderTextOverflow")
@js.native
object HeaderTextOverflow extends js.Object {
  ///You can disable the word wrap
  @js.native
  sealed trait None
    extends ejDotWebDotAllLib.ejNs.TreeGridNs.HeaderTextOverflow
  
  ///You can wrap the header content
  @js.native
  sealed trait Wrap
    extends ejDotWebDotAllLib.ejNs.TreeGridNs.HeaderTextOverflow
  
  /* 0 */ val None: None with scala.Double = js.native
  /* 1 */ val Wrap: Wrap with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.TreeGridNs.HeaderTextOverflow with scala.Double] = js.native
}

