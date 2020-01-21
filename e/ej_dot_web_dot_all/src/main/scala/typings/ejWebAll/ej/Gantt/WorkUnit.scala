package typings.ejWebAll.ej.Gantt

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WorkUnit with Double] = js.native
  /* 0 */ @js.native
  object Day extends TopLevel[Day with Double]
  
  /* 1 */ @js.native
  object Hour extends TopLevel[Hour with Double]
  
  /* 2 */ @js.native
  object Minute extends TopLevel[Minute with Double]
  
}

