package typings.ejDotWebDotAll.ej.Gantt

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
  sealed trait Day extends WorkUnit
  
  ///Displays the work involved in a task in hours.
  @js.native
  sealed trait Hour extends WorkUnit
  
  ///Displays the work involved in a task in minutes
  @js.native
  sealed trait Minute extends WorkUnit
  
  /* 0 */ val Day: typings.ejDotWebDotAll.ej.Gantt.WorkUnit.Day with Double = js.native
  /* 1 */ val Hour: typings.ejDotWebDotAll.ej.Gantt.WorkUnit.Hour with Double = js.native
  /* 2 */ val Minute: typings.ejDotWebDotAll.ej.Gantt.WorkUnit.Minute with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WorkUnit with Double] = js.native
}

