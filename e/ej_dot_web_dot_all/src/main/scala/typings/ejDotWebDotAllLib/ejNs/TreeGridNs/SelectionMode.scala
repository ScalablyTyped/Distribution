package typings
package ejDotWebDotAllLib.ejNs.TreeGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SelectionMode extends js.Object

@JSGlobal("ej.TreeGrid.SelectionMode")
@js.native
object SelectionMode extends js.Object {
  ///you can select a cell.
  @js.native
  sealed trait Cell
    extends ejDotWebDotAllLib.ejNs.TreeGridNs.SelectionMode
  
  ///you can select a row.
  @js.native
  sealed trait Row
    extends ejDotWebDotAllLib.ejNs.TreeGridNs.SelectionMode
  
  val Cell: Cell with java.lang.String = js.native
  val Row: Row with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.TreeGridNs.SelectionMode with java.lang.String] = js.native
}

