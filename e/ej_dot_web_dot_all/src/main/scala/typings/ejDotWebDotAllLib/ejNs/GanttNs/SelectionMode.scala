package typings
package ejDotWebDotAllLib.ejNs.GanttNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SelectionMode extends js.Object

@JSGlobal("ej.Gantt.SelectionMode")
@js.native
object SelectionMode extends js.Object {
  ///you can select a cell.
  @js.native
  sealed trait Cell
    extends ejDotWebDotAllLib.ejNs.GanttNs.SelectionMode
  
  ///you can select a row.
  @js.native
  sealed trait Row
    extends ejDotWebDotAllLib.ejNs.GanttNs.SelectionMode
  
  val Cell: Cell with java.lang.String = js.native
  val Row: Row with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.GanttNs.SelectionMode with java.lang.String] = js.native
}

