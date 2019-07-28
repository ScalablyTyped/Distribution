package typings.ejDotWebDotAll.ejNs.GanttNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait workingTimeScale extends js.Object

@JSGlobal("ej.Gantt.workingTimeScale")
@js.native
object workingTimeScale extends js.Object {
  ///Sets twenty four hour timescale.
  @js.native
  sealed trait TimeScale24Hours extends workingTimeScale
  
  ///Sets eight hour timescale.
  @js.native
  sealed trait TimeScale8Hours extends workingTimeScale
  
  /* 1 */ val TimeScale24Hours: typings.ejDotWebDotAll.ejNs.GanttNs.workingTimeScale.TimeScale24Hours with Double = js.native
  /* 0 */ val TimeScale8Hours: typings.ejDotWebDotAll.ejNs.GanttNs.workingTimeScale.TimeScale8Hours with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[workingTimeScale with Double] = js.native
}

