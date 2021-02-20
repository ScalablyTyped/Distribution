package typings.ejWebAll.global.ej

import typings.ejWebAll.JQuery
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.Gantt")
@js.native
class Gantt protected ()
  extends typings.ejWebAll.ej.Gantt {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejWebAll.ej.Model) = this()
  def this(element: Element, options: typings.ejWebAll.ej.Model) = this()
}
object Gantt {
  
  @JSGlobal("ej.Gantt")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("ej.Gantt.BeginEditAction")
  @js.native
  object BeginEditAction extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Gantt.BeginEditAction with Double] = js.native
    
    /* 1 */ val Click: typings.ejWebAll.ej.Gantt.BeginEditAction.Click with Double = js.native
    
    /* 0 */ val DblClick: typings.ejWebAll.ej.Gantt.BeginEditAction.DblClick with Double = js.native
  }
  
  @JSGlobal("ej.Gantt.DurationUnit")
  @js.native
  object DurationUnit extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Gantt.DurationUnit with Double] = js.native
    
    /* 0 */ val Day: typings.ejWebAll.ej.Gantt.DurationUnit.Day with Double = js.native
    
    /* 1 */ val Hour: typings.ejWebAll.ej.Gantt.DurationUnit.Hour with Double = js.native
    
    /* 2 */ val Minute: typings.ejWebAll.ej.Gantt.DurationUnit.Minute with Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.Gantt.Locale")
  @js.native
  def Locale: js.Any = js.native
  @scala.inline
  def Locale_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ej.Gantt.RowPosition")
  @js.native
  object RowPosition extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Gantt.RowPosition with Double] = js.native
    
    /* 2 */ val AboveSelectedRow: typings.ejWebAll.ej.Gantt.RowPosition.AboveSelectedRow with Double = js.native
    
    /* 3 */ val BelowSelectedRow: typings.ejWebAll.ej.Gantt.RowPosition.BelowSelectedRow with Double = js.native
    
    /* 1 */ val Bottom: typings.ejWebAll.ej.Gantt.RowPosition.Bottom with Double = js.native
    
    /* 4 */ val Child: typings.ejWebAll.ej.Gantt.RowPosition.Child with Double = js.native
    
    /* 0 */ val Top: typings.ejWebAll.ej.Gantt.RowPosition.Top with Double = js.native
  }
  
  @JSGlobal("ej.Gantt.ScheduleHeaderType")
  @js.native
  object ScheduleHeaderType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Gantt.ScheduleHeaderType with Double] = js.native
    
    /* 3 */ val Day: typings.ejWebAll.ej.Gantt.ScheduleHeaderType.Day with Double = js.native
    
    /* 4 */ val Hour: typings.ejWebAll.ej.Gantt.ScheduleHeaderType.Hour with Double = js.native
    
    /* 1 */ val Month: typings.ejWebAll.ej.Gantt.ScheduleHeaderType.Month with Double = js.native
    
    /* 2 */ val Week: typings.ejWebAll.ej.Gantt.ScheduleHeaderType.Week with Double = js.native
    
    /* 0 */ val Year: typings.ejWebAll.ej.Gantt.ScheduleHeaderType.Year with Double = js.native
  }
  
  @JSGlobal("ej.Gantt.SelectionMode")
  @js.native
  object SelectionMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Gantt.SelectionMode with Double] = js.native
    
    /* 1 */ val Cell: typings.ejWebAll.ej.Gantt.SelectionMode.Cell with Double = js.native
    
    /* 0 */ val Row: typings.ejWebAll.ej.Gantt.SelectionMode.Row with Double = js.native
  }
  
  @JSGlobal("ej.Gantt.SelectionType")
  @js.native
  object SelectionType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Gantt.SelectionType with Double] = js.native
    
    /* 1 */ val Multiple: typings.ejWebAll.ej.Gantt.SelectionType.Multiple with Double = js.native
    
    /* 0 */ val Single: typings.ejWebAll.ej.Gantt.SelectionType.Single with Double = js.native
  }
  
  @JSGlobal("ej.Gantt.TaskSchedulingMode")
  @js.native
  object TaskSchedulingMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Gantt.TaskSchedulingMode with Double] = js.native
    
    /* 0 */ val Auto: typings.ejWebAll.ej.Gantt.TaskSchedulingMode.Auto with Double = js.native
    
    /* 2 */ val Custom: typings.ejWebAll.ej.Gantt.TaskSchedulingMode.Custom with Double = js.native
    
    /* 1 */ val Manual: typings.ejWebAll.ej.Gantt.TaskSchedulingMode.Manual with Double = js.native
  }
  
  @JSGlobal("ej.Gantt.TaskType")
  @js.native
  object TaskType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Gantt.TaskType with Double] = js.native
    
    /* 2 */ val FixedDuration: typings.ejWebAll.ej.Gantt.TaskType.FixedDuration with Double = js.native
    
    /* 0 */ val FixedUnit: typings.ejWebAll.ej.Gantt.TaskType.FixedUnit with Double = js.native
    
    /* 1 */ val FixedWork: typings.ejWebAll.ej.Gantt.TaskType.FixedWork with Double = js.native
  }
  
  @JSGlobal("ej.Gantt.TimescaleRoundMode")
  @js.native
  object TimescaleRoundMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Gantt.TimescaleRoundMode with Double] = js.native
    
    /* 0 */ val Auto: typings.ejWebAll.ej.Gantt.TimescaleRoundMode.Auto with Double = js.native
    
    /* 2 */ val Month: typings.ejWebAll.ej.Gantt.TimescaleRoundMode.Month with Double = js.native
    
    /* 1 */ val Week: typings.ejWebAll.ej.Gantt.TimescaleRoundMode.Week with Double = js.native
    
    /* 3 */ val Year: typings.ejWebAll.ej.Gantt.TimescaleRoundMode.Year with Double = js.native
  }
  
  @JSGlobal("ej.Gantt.ToolbarItems")
  @js.native
  object ToolbarItems extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Gantt.ToolbarItems with Double] = js.native
    
    /* 0 */ val Add: typings.ejWebAll.ej.Gantt.ToolbarItems.Add with Double = js.native
    
    /* 4 */ val Cancel: typings.ejWebAll.ej.Gantt.ToolbarItems.Cancel with Double = js.native
    
    /* 9 */ val CollapseAll: typings.ejWebAll.ej.Gantt.ToolbarItems.CollapseAll with Double = js.native
    
    /* 12 */ val CriticalPath: typings.ejWebAll.ej.Gantt.ToolbarItems.CriticalPath with Double = js.native
    
    /* 2 */ val Delete: typings.ejWebAll.ej.Gantt.ToolbarItems.Delete with Double = js.native
    
    /* 1 */ val Edit: typings.ejWebAll.ej.Gantt.ToolbarItems.Edit with Double = js.native
    
    /* 13 */ val ExcelExport: typings.ejWebAll.ej.Gantt.ToolbarItems.ExcelExport with Double = js.native
    
    /* 8 */ val ExpandAll: typings.ejWebAll.ej.Gantt.ToolbarItems.ExpandAll with Double = js.native
    
    /* 6 */ val Indent: typings.ejWebAll.ej.Gantt.ToolbarItems.Indent with Double = js.native
    
    /* 11 */ val NextTimeSpan: typings.ejWebAll.ej.Gantt.ToolbarItems.NextTimeSpan with Double = js.native
    
    /* 7 */ val Outdent: typings.ejWebAll.ej.Gantt.ToolbarItems.Outdent with Double = js.native
    
    /* 14 */ val PdfExport: typings.ejWebAll.ej.Gantt.ToolbarItems.PdfExport with Double = js.native
    
    /* 10 */ val PrevTimeSpan: typings.ejWebAll.ej.Gantt.ToolbarItems.PrevTimeSpan with Double = js.native
    
    /* 5 */ val Search: typings.ejWebAll.ej.Gantt.ToolbarItems.Search with Double = js.native
    
    /* 3 */ val Update: typings.ejWebAll.ej.Gantt.ToolbarItems.Update with Double = js.native
  }
  
  @JSGlobal("ej.Gantt.ViewType")
  @js.native
  object ViewType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Gantt.ViewType with Double] = js.native
    
    /* 2 */ val HistogramView: typings.ejWebAll.ej.Gantt.ViewType.HistogramView with Double = js.native
    
    /* 0 */ val ProjectView: typings.ejWebAll.ej.Gantt.ViewType.ProjectView with Double = js.native
    
    /* 1 */ val ResourceView: typings.ejWebAll.ej.Gantt.ViewType.ResourceView with Double = js.native
  }
  
  @JSGlobal("ej.Gantt.WorkUnit")
  @js.native
  object WorkUnit extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Gantt.WorkUnit with Double] = js.native
    
    /* 0 */ val Day: typings.ejWebAll.ej.Gantt.WorkUnit.Day with Double = js.native
    
    /* 1 */ val Hour: typings.ejWebAll.ej.Gantt.WorkUnit.Hour with Double = js.native
    
    /* 2 */ val Minute: typings.ejWebAll.ej.Gantt.WorkUnit.Minute with Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.Gantt.fn")
  @js.native
  def fn: typings.ejWebAll.ej.Gantt = js.native
  @scala.inline
  def fn_=(x: typings.ejWebAll.ej.Gantt): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ej.Gantt.minutesPerInterval")
  @js.native
  object minutesPerInterval extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Gantt.minutesPerInterval with Double] = js.native
    
    /* 0 */ val Auto: typings.ejWebAll.ej.Gantt.minutesPerInterval.Auto with Double = js.native
    
    /* 3 */ val FifteenMinutes: typings.ejWebAll.ej.Gantt.minutesPerInterval.FifteenMinutes with Double = js.native
    
    /* 2 */ val FiveMinutes: typings.ejWebAll.ej.Gantt.minutesPerInterval.FiveMinutes with Double = js.native
    
    /* 1 */ val OneMinute: typings.ejWebAll.ej.Gantt.minutesPerInterval.OneMinute with Double = js.native
    
    /* 4 */ val ThirtyMinutes: typings.ejWebAll.ej.Gantt.minutesPerInterval.ThirtyMinutes with Double = js.native
  }
  
  @JSGlobal("ej.Gantt.workingTimeScale")
  @js.native
  object workingTimeScale extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Gantt.workingTimeScale with Double] = js.native
    
    /* 1 */ val TimeScale24Hours: typings.ejWebAll.ej.Gantt.workingTimeScale.TimeScale24Hours with Double = js.native
    
    /* 0 */ val TimeScale8Hours: typings.ejWebAll.ej.Gantt.workingTimeScale.TimeScale8Hours with Double = js.native
  }
}
