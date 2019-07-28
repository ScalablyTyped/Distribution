package typings.ejDotWebDotAll.ejNs.GanttNs

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
  sealed trait FixedDuration extends TaskType
  
  ///Resource unit remains constant while editing the work and duration values.
  @js.native
  sealed trait FixedUnit extends TaskType
  
  ///Work value of a task remains constant while editing duration and resource unit values.
  @js.native
  sealed trait FixedWork extends TaskType
  
  /* 2 */ val FixedDuration: typings.ejDotWebDotAll.ejNs.GanttNs.TaskType.FixedDuration with Double = js.native
  /* 0 */ val FixedUnit: typings.ejDotWebDotAll.ejNs.GanttNs.TaskType.FixedUnit with Double = js.native
  /* 1 */ val FixedWork: typings.ejDotWebDotAll.ejNs.GanttNs.TaskType.FixedWork with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TaskType with Double] = js.native
}

