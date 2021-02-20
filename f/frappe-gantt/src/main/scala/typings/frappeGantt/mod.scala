package typings.frappeGantt

import typings.std.Date
import typings.std.HTMLElement
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("frappe-gantt", JSImport.Namespace)
  @js.native
  class ^ protected () extends Gantt {
    def this(wrapper: String, tasks: js.Array[Task]) = this()
    def this(wrapper: HTMLElement, tasks: js.Array[Task]) = this()
    def this(wrapper: SVGElement, tasks: js.Array[Task]) = this()
    def this(wrapper: String, tasks: js.Array[Task], options: Options) = this()
    def this(wrapper: HTMLElement, tasks: js.Array[Task], options: Options) = this()
    def this(wrapper: SVGElement, tasks: js.Array[Task], options: Options) = this()
  }
  
  @js.native
  trait EnrichedTask extends Task {
    
    var _end: Date = js.native
    
    var _index: Double = js.native
    
    var _start: Date = js.native
  }
  object EnrichedTask {
    
    @scala.inline
    def apply(
      _end: Date,
      _index: Double,
      _start: Date,
      dependencies: String,
      end: String,
      id: String,
      name: String,
      progress: Double,
      start: String
    ): EnrichedTask = {
      val __obj = js.Dynamic.literal(_end = _end.asInstanceOf[js.Any], _index = _index.asInstanceOf[js.Any], _start = _start.asInstanceOf[js.Any], dependencies = dependencies.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[EnrichedTask]
    }
    
    @scala.inline
    implicit class EnrichedTaskMutableBuilder[Self <: EnrichedTask] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set_end(value: Date): Self = StObject.set(x, "_end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_index(value: Double): Self = StObject.set(x, "_index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_start(value: Date): Self = StObject.set(x, "_start", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Gantt extends StObject {
    
    def change_view_mode(mode: viewMode): Unit = js.native
    
    def refresh(tasks: js.Array[Task]): Unit = js.native
  }
  object Gantt {
    
    @scala.inline
    def apply(change_view_mode: viewMode => Unit, refresh: js.Array[Task] => Unit): Gantt = {
      val __obj = js.Dynamic.literal(change_view_mode = js.Any.fromFunction1(change_view_mode), refresh = js.Any.fromFunction1(refresh))
      __obj.asInstanceOf[Gantt]
    }
    
    @scala.inline
    implicit class GanttMutableBuilder[Self <: Gantt] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChange_view_mode(value: viewMode => Unit): Self = StObject.set(x, "change_view_mode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRefresh(value: js.Array[Task] => Unit): Self = StObject.set(x, "refresh", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    var arrow_curve: js.UndefOr[Double] = js.native
    
    var bar_corner_radius: js.UndefOr[Double] = js.native
    
    var bar_height: js.UndefOr[Double] = js.native
    
    var column_width: js.UndefOr[Double] = js.native
    
    var custom_popup_html: js.UndefOr[String | (js.Function1[/* task */ EnrichedTask, String])] = js.native
    
    var date_format: js.UndefOr[String] = js.native
    
    var header_height: js.UndefOr[Double] = js.native
    
    var language: js.UndefOr[String] = js.native
    
    var on_click: js.UndefOr[js.Function1[/* task */ EnrichedTask, Unit]] = js.native
    
    var on_date_change: js.UndefOr[js.Function3[/* task */ EnrichedTask, /* start */ Date, /* end */ Date, Unit]] = js.native
    
    var on_progress_change: js.UndefOr[js.Function2[/* task */ EnrichedTask, /* progress */ Double, Unit]] = js.native
    
    var on_view_change: js.UndefOr[js.Function1[/* mode */ viewMode, Unit]] = js.native
    
    var padding: js.UndefOr[Double] = js.native
    
    var step: js.UndefOr[Double] = js.native
    
    var view_mode: js.UndefOr[viewMode] = js.native
    
    var view_modes: js.UndefOr[js.Array[viewMode]] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArrow_curve(value: Double): Self = StObject.set(x, "arrow_curve", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrow_curveUndefined: Self = StObject.set(x, "arrow_curve", js.undefined)
      
      @scala.inline
      def setBar_corner_radius(value: Double): Self = StObject.set(x, "bar_corner_radius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBar_corner_radiusUndefined: Self = StObject.set(x, "bar_corner_radius", js.undefined)
      
      @scala.inline
      def setBar_height(value: Double): Self = StObject.set(x, "bar_height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBar_heightUndefined: Self = StObject.set(x, "bar_height", js.undefined)
      
      @scala.inline
      def setColumn_width(value: Double): Self = StObject.set(x, "column_width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumn_widthUndefined: Self = StObject.set(x, "column_width", js.undefined)
      
      @scala.inline
      def setCustom_popup_html(value: String | (js.Function1[/* task */ EnrichedTask, String])): Self = StObject.set(x, "custom_popup_html", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustom_popup_htmlFunction1(value: /* task */ EnrichedTask => String): Self = StObject.set(x, "custom_popup_html", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCustom_popup_htmlUndefined: Self = StObject.set(x, "custom_popup_html", js.undefined)
      
      @scala.inline
      def setDate_format(value: String): Self = StObject.set(x, "date_format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDate_formatUndefined: Self = StObject.set(x, "date_format", js.undefined)
      
      @scala.inline
      def setHeader_height(value: Double): Self = StObject.set(x, "header_height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeader_heightUndefined: Self = StObject.set(x, "header_height", js.undefined)
      
      @scala.inline
      def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      @scala.inline
      def setOn_click(value: /* task */ EnrichedTask => Unit): Self = StObject.set(x, "on_click", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOn_clickUndefined: Self = StObject.set(x, "on_click", js.undefined)
      
      @scala.inline
      def setOn_date_change(value: (/* task */ EnrichedTask, /* start */ Date, /* end */ Date) => Unit): Self = StObject.set(x, "on_date_change", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOn_date_changeUndefined: Self = StObject.set(x, "on_date_change", js.undefined)
      
      @scala.inline
      def setOn_progress_change(value: (/* task */ EnrichedTask, /* progress */ Double) => Unit): Self = StObject.set(x, "on_progress_change", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOn_progress_changeUndefined: Self = StObject.set(x, "on_progress_change", js.undefined)
      
      @scala.inline
      def setOn_view_change(value: /* mode */ viewMode => Unit): Self = StObject.set(x, "on_view_change", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOn_view_changeUndefined: Self = StObject.set(x, "on_view_change", js.undefined)
      
      @scala.inline
      def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      @scala.inline
      def setView_mode(value: viewMode): Self = StObject.set(x, "view_mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setView_modeUndefined: Self = StObject.set(x, "view_mode", js.undefined)
      
      @scala.inline
      def setView_modes(value: js.Array[viewMode]): Self = StObject.set(x, "view_modes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setView_modesUndefined: Self = StObject.set(x, "view_modes", js.undefined)
      
      @scala.inline
      def setView_modesVarargs(value: viewMode*): Self = StObject.set(x, "view_modes", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Task extends StObject {
    
    var custom_class: js.UndefOr[String] = js.native
    
    var dependencies: String = js.native
    
    var end: String = js.native
    
    var id: String = js.native
    
    var name: String = js.native
    
    var progress: Double = js.native
    
    var start: String = js.native
  }
  object Task {
    
    @scala.inline
    def apply(dependencies: String, end: String, id: String, name: String, progress: Double, start: String): Task = {
      val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[Task]
    }
    
    @scala.inline
    implicit class TaskMutableBuilder[Self <: Task] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustom_class(value: String): Self = StObject.set(x, "custom_class", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustom_classUndefined: Self = StObject.set(x, "custom_class", js.undefined)
      
      @scala.inline
      def setDependencies(value: String): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.frappeGantt.frappeGanttStrings.`Quarter Day`
    - typings.frappeGantt.frappeGanttStrings.`Half Day`
    - typings.frappeGantt.frappeGanttStrings.Day
    - typings.frappeGantt.frappeGanttStrings.Week
    - typings.frappeGantt.frappeGanttStrings.Month
  */
  trait viewMode extends StObject
  object viewMode {
    
    @scala.inline
    def Day: typings.frappeGantt.frappeGanttStrings.Day = "Day".asInstanceOf[typings.frappeGantt.frappeGanttStrings.Day]
    
    @scala.inline
    def `Half Day`: typings.frappeGantt.frappeGanttStrings.`Half Day` = ("Half Day").asInstanceOf[typings.frappeGantt.frappeGanttStrings.`Half Day`]
    
    @scala.inline
    def Month: typings.frappeGantt.frappeGanttStrings.Month = "Month".asInstanceOf[typings.frappeGantt.frappeGanttStrings.Month]
    
    @scala.inline
    def `Quarter Day`: typings.frappeGantt.frappeGanttStrings.`Quarter Day` = ("Quarter Day").asInstanceOf[typings.frappeGantt.frappeGanttStrings.`Quarter Day`]
    
    @scala.inline
    def Week: typings.frappeGantt.frappeGanttStrings.Week = "Week".asInstanceOf[typings.frappeGantt.frappeGanttStrings.Week]
  }
}
