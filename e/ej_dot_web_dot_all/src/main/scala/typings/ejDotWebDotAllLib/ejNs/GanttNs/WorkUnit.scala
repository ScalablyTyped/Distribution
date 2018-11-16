package typings
package ejDotWebDotAllLib.ejNs.GanttNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WorkUnit extends js.Object

@JSGlobal("ej.Gantt.WorkUnit")
@js.native
object WorkUnit extends js.Object {
  ///Displays the work involved in a task in days.
  @js.native
  sealed trait Day
    extends ejDotWebDotAllLib.ejNs.GanttNs.WorkUnit
  
  ///Displays the work involved in a task in hours.
  @js.native
  sealed trait Hour
    extends ejDotWebDotAllLib.ejNs.GanttNs.WorkUnit
  
  ///Displays the work involved in a task in minutes
  @js.native
  sealed trait Minute
    extends ejDotWebDotAllLib.ejNs.GanttNs.WorkUnit
  
  val Day: Day with java.lang.String = js.native
  val Hour: Hour with java.lang.String = js.native
  val Minute: Minute with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.GanttNs.WorkUnit with java.lang.String] = js.native
}

