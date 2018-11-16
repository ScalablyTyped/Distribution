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
  
  val Agenda: Agenda with java.lang.String = js.native
  val CustomView: CustomView with java.lang.String = js.native
  val Day: Day with java.lang.String = js.native
  val Month: Month with java.lang.String = js.native
  val Week: Week with java.lang.String = js.native
  val Workweek: Workweek with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.ScheduleNs.CurrentView with java.lang.String] = js.native
}

