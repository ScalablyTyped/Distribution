package typings.ejDotWebDotAll.ej.Schedule

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
  
  /* 4 */ val Agenda: typings.ejDotWebDotAll.ej.Schedule.CurrentView.Agenda with Double = js.native
  /* 5 */ val CustomView: typings.ejDotWebDotAll.ej.Schedule.CurrentView.CustomView with Double = js.native
  /* 0 */ val Day: typings.ejDotWebDotAll.ej.Schedule.CurrentView.Day with Double = js.native
  /* 3 */ val Month: typings.ejDotWebDotAll.ej.Schedule.CurrentView.Month with Double = js.native
  /* 1 */ val Week: typings.ejDotWebDotAll.ej.Schedule.CurrentView.Week with Double = js.native
  /* 2 */ val Workweek: typings.ejDotWebDotAll.ej.Schedule.CurrentView.Workweek with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CurrentView with Double] = js.native
}

