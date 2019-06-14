package typings
package ejDotWebDotAllLib.ejNs.ScheduleNs

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
  sealed trait Agenda
    extends ejDotWebDotAllLib.ejNs.ScheduleNs.CurrentView
  
  ///Sets currentView of the Scheduler as CustomView with user-specified date range.
  @js.native
  sealed trait CustomView
    extends ejDotWebDotAllLib.ejNs.ScheduleNs.CurrentView
  
  ///Sets currentView of the Scheduler as Day
  @js.native
  sealed trait Day
    extends ejDotWebDotAllLib.ejNs.ScheduleNs.CurrentView
  
  ///Sets currentView of the Scheduler as Month
  @js.native
  sealed trait Month
    extends ejDotWebDotAllLib.ejNs.ScheduleNs.CurrentView
  
  ///Sets currentView of the Scheduler as Week
  @js.native
  sealed trait Week
    extends ejDotWebDotAllLib.ejNs.ScheduleNs.CurrentView
  
  ///Sets currentView of the Scheduler as WorkWeek
  @js.native
  sealed trait Workweek
    extends ejDotWebDotAllLib.ejNs.ScheduleNs.CurrentView
  
  /* 4 */ val Agenda: Agenda with scala.Double = js.native
  /* 5 */ val CustomView: CustomView with scala.Double = js.native
  /* 0 */ val Day: Day with scala.Double = js.native
  /* 3 */ val Month: Month with scala.Double = js.native
  /* 1 */ val Week: Week with scala.Double = js.native
  /* 2 */ val Workweek: Workweek with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.ScheduleNs.CurrentView with scala.Double] = js.native
}

