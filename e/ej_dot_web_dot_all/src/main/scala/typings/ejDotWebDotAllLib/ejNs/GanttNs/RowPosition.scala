package typings
package ejDotWebDotAllLib.ejNs.GanttNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RowPosition extends js.Object

@JSGlobal("ej.Gantt.RowPosition")
@js.native
object RowPosition extends js.Object {
  ///you can add a new row to above selected row.
  @js.native
  sealed trait AboveSelectedRow
    extends ejDotWebDotAllLib.ejNs.GanttNs.RowPosition
  
  ///you can add a new row to below selected row.
  @js.native
  sealed trait BelowSelectedRow
    extends ejDotWebDotAllLib.ejNs.GanttNs.RowPosition
  
  ///you can add a new row at bottom.
  @js.native
  sealed trait Bottom
    extends ejDotWebDotAllLib.ejNs.GanttNs.RowPosition
  
  ///you can add a new row as a child for selected row.
  @js.native
  sealed trait Child
    extends ejDotWebDotAllLib.ejNs.GanttNs.RowPosition
  
  ///you can add a new row at top.
  @js.native
  sealed trait Top
    extends ejDotWebDotAllLib.ejNs.GanttNs.RowPosition
  
  /* 2 */ val AboveSelectedRow: AboveSelectedRow with scala.Double = js.native
  /* 3 */ val BelowSelectedRow: BelowSelectedRow with scala.Double = js.native
  /* 1 */ val Bottom: Bottom with scala.Double = js.native
  /* 4 */ val Child: Child with scala.Double = js.native
  /* 0 */ val Top: Top with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.GanttNs.RowPosition with scala.Double] = js.native
}

