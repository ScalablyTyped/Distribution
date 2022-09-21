package typings.ejWebAll.global.ej

import typings.ejWebAll.JQuery
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.Schedule")
@js.native
open class Schedule protected ()
  extends StObject
     with typings.ejWebAll.ej.Schedule {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejWebAll.ej.Model) = this()
  def this(element: Element, options: typings.ejWebAll.ej.Model) = this()
}
object Schedule {
  
  @JSGlobal("ej.Schedule")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("ej.Schedule.CurrentView")
  @js.native
  object CurrentView extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Schedule.CurrentView & Double] = js.native
    
    /* 4 */ val Agenda: typings.ejWebAll.ej.Schedule.CurrentView.Agenda & Double = js.native
    
    /* 5 */ val CustomView: typings.ejWebAll.ej.Schedule.CurrentView.CustomView & Double = js.native
    
    /* 0 */ val Day: typings.ejWebAll.ej.Schedule.CurrentView.Day & Double = js.native
    
    /* 3 */ val Month: typings.ejWebAll.ej.Schedule.CurrentView.Month & Double = js.native
    
    /* 1 */ val Week: typings.ejWebAll.ej.Schedule.CurrentView.Week & Double = js.native
    
    /* 2 */ val Workweek: typings.ejWebAll.ej.Schedule.CurrentView.Workweek & Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.Schedule.Locale")
  @js.native
  def Locale: Any = js.native
  inline def Locale_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ej.Schedule.Orientation")
  @js.native
  object Orientation extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Schedule.Orientation & Double] = js.native
    
    /* 1 */ val Horizontal: typings.ejWebAll.ej.Schedule.Orientation.Horizontal & Double = js.native
    
    /* 0 */ val Vertical: typings.ejWebAll.ej.Schedule.Orientation.Vertical & Double = js.native
  }
  
  @JSGlobal("ej.Schedule.TimeMode")
  @js.native
  object TimeMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Schedule.TimeMode & Double] = js.native
    
    /* 0 */ val Hour12: typings.ejWebAll.ej.Schedule.TimeMode.Hour12 & Double = js.native
    
    /* 1 */ val Hour24: typings.ejWebAll.ej.Schedule.TimeMode.Hour24 & Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.Schedule.fn")
  @js.native
  def fn: typings.ejWebAll.ej.Schedule = js.native
  inline def fn_=(x: typings.ejWebAll.ej.Schedule): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
