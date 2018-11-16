package typings
package ejDotWebDotAllLib.ejNs.GanttNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TaskType extends js.Object

@JSGlobal("ej.Gantt.TaskType")
@js.native
object TaskType extends js.Object {
  ///Duration value remains constant while editing work and resource unit values.
  @js.native
  sealed trait FixedDuration
    extends ejDotWebDotAllLib.ejNs.GanttNs.TaskType
  
  ///Resource unit remains constant while editing the work and duration values.
  @js.native
  sealed trait FixedUnit
    extends ejDotWebDotAllLib.ejNs.GanttNs.TaskType
  
  ///Work value of a task remains constant while editing duration and resource unit values.
  @js.native
  sealed trait FixedWork
    extends ejDotWebDotAllLib.ejNs.GanttNs.TaskType
  
  val FixedDuration: FixedDuration with java.lang.String = js.native
  val FixedUnit: FixedUnit with java.lang.String = js.native
  val FixedWork: FixedWork with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.GanttNs.TaskType with java.lang.String] = js.native
}

