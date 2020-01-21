package typings.ejWebAll.ej.Schedule

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CurrentView extends js.Object

@JSGlobal("ej.Schedule.CurrentView")
@js.native
object CurrentView extends js.Object {
  ///Sets currentView of the Scheduler as Agenda
  @js.native
  sealed trait Agenda extends CurrentView
  
  ///Sets currentView of the Scheduler as CustomView with user-specified date range.
  @js.native
  sealed trait CustomView extends CurrentView
  
  ///Sets currentView of the Scheduler as Day
  @js.native
  sealed trait Day extends CurrentView
  
  ///Sets currentView of the Scheduler as Month
  @js.native
  sealed trait Month extends CurrentView
  
  ///Sets currentView of the Scheduler as Week
  @js.native
  sealed trait Week extends CurrentView
  
  ///Sets currentView of the Scheduler as WorkWeek
  @js.native
  sealed trait Workweek extends CurrentView
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CurrentView with Double] = js.native
  /* 4 */ @js.native
  object Agenda extends TopLevel[Agenda with Double]
  
  /* 5 */ @js.native
  object CustomView extends TopLevel[CustomView with Double]
  
  /* 0 */ @js.native
  object Day extends TopLevel[Day with Double]
  
  /* 3 */ @js.native
  object Month extends TopLevel[Month with Double]
  
  /* 1 */ @js.native
  object Week extends TopLevel[Week with Double]
  
  /* 2 */ @js.native
  object Workweek extends TopLevel[Workweek with Double]
  
}

