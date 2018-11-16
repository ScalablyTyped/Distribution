package typings
package ejDotWebDotAllLib.ejNs.GanttNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SelectionType extends js.Object

@JSGlobal("ej.Gantt.SelectionType")
@js.native
object SelectionType extends js.Object {
  ///you can select a multiple row.
  @js.native
  sealed trait Multiple
    extends ejDotWebDotAllLib.ejNs.GanttNs.SelectionType
  
  ///you can select a single row.
  @js.native
  sealed trait Single
    extends ejDotWebDotAllLib.ejNs.GanttNs.SelectionType
  
  val Multiple: Multiple with java.lang.String = js.native
  val Single: Single with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.GanttNs.SelectionType with java.lang.String] = js.native
}

