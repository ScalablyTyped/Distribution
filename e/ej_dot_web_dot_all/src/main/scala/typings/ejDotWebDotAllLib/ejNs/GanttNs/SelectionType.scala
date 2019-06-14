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
  
  /* 1 */ val Multiple: Multiple with scala.Double = js.native
  /* 0 */ val Single: Single with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.GanttNs.SelectionType with scala.Double] = js.native
}

