package typings
package ejDotWebDotAllLib.ejNs.TreeGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PageSizeMode extends js.Object

@JSGlobal("ej.TreeGrid.PageSizeMode")
@js.native
object PageSizeMode extends js.Object {
  ///To count all the parent and child records.
  @js.native
  sealed trait All
    extends ejDotWebDotAllLib.ejNs.TreeGridNs.PageSizeMode
  
  ///To count the Zeroth level parent records.
  @js.native
  sealed trait Root
    extends ejDotWebDotAllLib.ejNs.TreeGridNs.PageSizeMode
  
  /* 0 */ val All: All with scala.Double = js.native
  /* 1 */ val Root: Root with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.TreeGridNs.PageSizeMode with scala.Double] = js.native
}

