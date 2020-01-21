package typings.ejWebAll.ej.Gantt

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TaskType with Double] = js.native
  /* 2 */ @js.native
  object FixedDuration extends TopLevel[FixedDuration with Double]
  
  /* 0 */ @js.native
  object FixedUnit extends TopLevel[FixedUnit with Double]
  
  /* 1 */ @js.native
  object FixedWork extends TopLevel[FixedWork with Double]
  
}

