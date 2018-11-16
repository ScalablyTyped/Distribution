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
  
  val All: All with java.lang.String = js.native
  val Root: Root with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.TreeGridNs.PageSizeMode with java.lang.String] = js.native
}

