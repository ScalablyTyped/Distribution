package typings.ejWebAll.global.ej

import typings.ejWebAll.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.Schedule")
@js.native
class Schedule protected ()
  extends typings.ejWebAll.ej.Schedule {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejWebAll.ej.Schedule.Model) = this()
  def this(element: Element, options: typings.ejWebAll.ej.Schedule.Model) = this()
}

/* static members */
@JSGlobal("ej.Schedule")
@js.native
object Schedule extends js.Object {
  var Locale: js.Any = js.native
  var fn: typings.ejWebAll.ej.Schedule = js.native
  @js.native
  object CurrentView extends js.Object {
    /* 4 */ val Agenda: typings.ejWebAll.ej.Schedule.CurrentView.Agenda with Double = js.native
    /* 5 */ val CustomView: typings.ejWebAll.ej.Schedule.CurrentView.CustomView with Double = js.native
    /* 0 */ val Day: typings.ejWebAll.ej.Schedule.CurrentView.Day with Double = js.native
    /* 3 */ val Month: typings.ejWebAll.ej.Schedule.CurrentView.Month with Double = js.native
    /* 1 */ val Week: typings.ejWebAll.ej.Schedule.CurrentView.Week with Double = js.native
    /* 2 */ val Workweek: typings.ejWebAll.ej.Schedule.CurrentView.Workweek with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Schedule.CurrentView with Double] = js.native
  }
  
  @js.native
  object Orientation extends js.Object {
    /* 1 */ val Horizontal: typings.ejWebAll.ej.Schedule.Orientation.Horizontal with Double = js.native
    /* 0 */ val Vertical: typings.ejWebAll.ej.Schedule.Orientation.Vertical with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Schedule.Orientation with Double] = js.native
  }
  
  @js.native
  object TimeMode extends js.Object {
    /* 0 */ val Hour12: typings.ejWebAll.ej.Schedule.TimeMode.Hour12 with Double = js.native
    /* 1 */ val Hour24: typings.ejWebAll.ej.Schedule.TimeMode.Hour24 with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Schedule.TimeMode with Double] = js.native
  }
  
}

