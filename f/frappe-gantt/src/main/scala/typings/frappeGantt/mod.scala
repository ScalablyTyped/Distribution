package typings.frappeGantt

import typings.frappeGantt.frappeGanttStrings.Day_
import typings.frappeGantt.frappeGanttStrings.Month_
import typings.frappeGantt.frappeGanttStrings.Week_
import typings.frappeGantt.frappeGanttStrings.Year_
import typings.std.HTMLElement
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("frappe-gantt", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Gantt {
    def this(wrapper: String, tasks: js.Array[Task]) = this()
    def this(wrapper: HTMLElement, tasks: js.Array[Task]) = this()
    def this(wrapper: SVGElement, tasks: js.Array[Task]) = this()
    def this(wrapper: String, tasks: js.Array[Task], options: Options) = this()
    def this(wrapper: HTMLElement, tasks: js.Array[Task], options: Options) = this()
    def this(wrapper: SVGElement, tasks: js.Array[Task], options: Options) = this()
    
    /* CompleteClass */
    override def change_view_mode(mode: viewMode): Unit = js.native
    
    /* CompleteClass */
    override def refresh(tasks: js.Array[Task]): Unit = js.native
  }
  
  /* Inlined std.Record<frappe-gantt.frappe-gantt.viewModeKey, frappe-gantt.frappe-gantt.viewMode> */
  object VIEW_MODE {
    
    @JSImport("frappe-gantt", "VIEW_MODE")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("frappe-gantt", "VIEW_MODE.DAY")
    @js.native
    def DAY: viewMode = js.native
    inline def DAY_=(x: viewMode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DAY")(x.asInstanceOf[js.Any])
    
    @JSImport("frappe-gantt", "VIEW_MODE.HALF_DAY")
    @js.native
    def HALF_DAY: viewMode = js.native
    inline def HALF_DAY_=(x: viewMode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HALF_DAY")(x.asInstanceOf[js.Any])
    
    @JSImport("frappe-gantt", "VIEW_MODE.MONTH")
    @js.native
    def MONTH: viewMode = js.native
    inline def MONTH_=(x: viewMode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MONTH")(x.asInstanceOf[js.Any])
    
    @JSImport("frappe-gantt", "VIEW_MODE.QUARTER_DAY")
    @js.native
    def QUARTER_DAY: viewMode = js.native
    inline def QUARTER_DAY_=(x: viewMode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("QUARTER_DAY")(x.asInstanceOf[js.Any])
    
    @JSImport("frappe-gantt", "VIEW_MODE.WEEK")
    @js.native
    def WEEK: viewMode = js.native
    inline def WEEK_=(x: viewMode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WEEK")(x.asInstanceOf[js.Any])
    
    @JSImport("frappe-gantt", "VIEW_MODE.YEAR")
    @js.native
    def YEAR: viewMode = js.native
    inline def YEAR_=(x: viewMode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("YEAR")(x.asInstanceOf[js.Any])
  }
  
  trait EnrichedTask
    extends StObject
       with Task {
    
    var _end: js.Date
    
    var _index: Double
    
    var _start: js.Date
    
    var invalid: js.UndefOr[Boolean] = js.undefined
  }
  object EnrichedTask {
    
    inline def apply(
      _end: js.Date,
      _index: Double,
      _start: js.Date,
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
    
    extension [Self <: EnrichedTask](x: Self) {
      
      inline def setInvalid(value: Boolean): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
      
      inline def setInvalidUndefined: Self = StObject.set(x, "invalid", js.undefined)
      
      inline def set_end(value: js.Date): Self = StObject.set(x, "_end", value.asInstanceOf[js.Any])
      
      inline def set_index(value: Double): Self = StObject.set(x, "_index", value.asInstanceOf[js.Any])
      
      inline def set_start(value: js.Date): Self = StObject.set(x, "_start", value.asInstanceOf[js.Any])
    }
  }
  
  trait Gantt extends StObject {
    
    def change_view_mode(mode: viewMode): Unit
    
    def refresh(tasks: js.Array[Task]): Unit
  }
  object Gantt {
    
    inline def apply(change_view_mode: viewMode => Unit, refresh: js.Array[Task] => Unit): Gantt = {
      val __obj = js.Dynamic.literal(change_view_mode = js.Any.fromFunction1(change_view_mode), refresh = js.Any.fromFunction1(refresh))
      __obj.asInstanceOf[Gantt]
    }
    
    extension [Self <: Gantt](x: Self) {
      
      inline def setChange_view_mode(value: viewMode => Unit): Self = StObject.set(x, "change_view_mode", js.Any.fromFunction1(value))
      
      inline def setRefresh(value: js.Array[Task] => Unit): Self = StObject.set(x, "refresh", js.Any.fromFunction1(value))
    }
  }
  
  trait Options extends StObject {
    
    var arrow_curve: js.UndefOr[Double] = js.undefined
    
    var bar_corner_radius: js.UndefOr[Double] = js.undefined
    
    var bar_height: js.UndefOr[Double] = js.undefined
    
    var column_width: js.UndefOr[Double] = js.undefined
    
    var custom_popup_html: js.UndefOr[String | (js.Function1[/* task */ EnrichedTask, String])] = js.undefined
    
    var date_format: js.UndefOr[String] = js.undefined
    
    var header_height: js.UndefOr[Double] = js.undefined
    
    var language: js.UndefOr[String] = js.undefined
    
    var on_click: js.UndefOr[js.Function1[/* task */ EnrichedTask, Unit]] = js.undefined
    
    var on_date_change: js.UndefOr[
        js.Function3[/* task */ EnrichedTask, /* start */ js.Date, /* end */ js.Date, Unit]
      ] = js.undefined
    
    var on_progress_change: js.UndefOr[js.Function2[/* task */ EnrichedTask, /* progress */ Double, Unit]] = js.undefined
    
    var on_view_change: js.UndefOr[js.Function1[/* mode */ viewMode, Unit]] = js.undefined
    
    var padding: js.UndefOr[Double] = js.undefined
    
    var step: js.UndefOr[Double] = js.undefined
    
    var view_mode: js.UndefOr[viewMode] = js.undefined
    
    var view_modes: js.UndefOr[js.Array[viewMode]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setArrow_curve(value: Double): Self = StObject.set(x, "arrow_curve", value.asInstanceOf[js.Any])
      
      inline def setArrow_curveUndefined: Self = StObject.set(x, "arrow_curve", js.undefined)
      
      inline def setBar_corner_radius(value: Double): Self = StObject.set(x, "bar_corner_radius", value.asInstanceOf[js.Any])
      
      inline def setBar_corner_radiusUndefined: Self = StObject.set(x, "bar_corner_radius", js.undefined)
      
      inline def setBar_height(value: Double): Self = StObject.set(x, "bar_height", value.asInstanceOf[js.Any])
      
      inline def setBar_heightUndefined: Self = StObject.set(x, "bar_height", js.undefined)
      
      inline def setColumn_width(value: Double): Self = StObject.set(x, "column_width", value.asInstanceOf[js.Any])
      
      inline def setColumn_widthUndefined: Self = StObject.set(x, "column_width", js.undefined)
      
      inline def setCustom_popup_html(value: String | (js.Function1[/* task */ EnrichedTask, String])): Self = StObject.set(x, "custom_popup_html", value.asInstanceOf[js.Any])
      
      inline def setCustom_popup_htmlFunction1(value: /* task */ EnrichedTask => String): Self = StObject.set(x, "custom_popup_html", js.Any.fromFunction1(value))
      
      inline def setCustom_popup_htmlUndefined: Self = StObject.set(x, "custom_popup_html", js.undefined)
      
      inline def setDate_format(value: String): Self = StObject.set(x, "date_format", value.asInstanceOf[js.Any])
      
      inline def setDate_formatUndefined: Self = StObject.set(x, "date_format", js.undefined)
      
      inline def setHeader_height(value: Double): Self = StObject.set(x, "header_height", value.asInstanceOf[js.Any])
      
      inline def setHeader_heightUndefined: Self = StObject.set(x, "header_height", js.undefined)
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setOn_click(value: /* task */ EnrichedTask => Unit): Self = StObject.set(x, "on_click", js.Any.fromFunction1(value))
      
      inline def setOn_clickUndefined: Self = StObject.set(x, "on_click", js.undefined)
      
      inline def setOn_date_change(value: (/* task */ EnrichedTask, /* start */ js.Date, /* end */ js.Date) => Unit): Self = StObject.set(x, "on_date_change", js.Any.fromFunction3(value))
      
      inline def setOn_date_changeUndefined: Self = StObject.set(x, "on_date_change", js.undefined)
      
      inline def setOn_progress_change(value: (/* task */ EnrichedTask, /* progress */ Double) => Unit): Self = StObject.set(x, "on_progress_change", js.Any.fromFunction2(value))
      
      inline def setOn_progress_changeUndefined: Self = StObject.set(x, "on_progress_change", js.undefined)
      
      inline def setOn_view_change(value: /* mode */ viewMode => Unit): Self = StObject.set(x, "on_view_change", js.Any.fromFunction1(value))
      
      inline def setOn_view_changeUndefined: Self = StObject.set(x, "on_view_change", js.undefined)
      
      inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      inline def setView_mode(value: viewMode): Self = StObject.set(x, "view_mode", value.asInstanceOf[js.Any])
      
      inline def setView_modeUndefined: Self = StObject.set(x, "view_mode", js.undefined)
      
      inline def setView_modes(value: js.Array[viewMode]): Self = StObject.set(x, "view_modes", value.asInstanceOf[js.Any])
      
      inline def setView_modesUndefined: Self = StObject.set(x, "view_modes", js.undefined)
      
      inline def setView_modesVarargs(value: viewMode*): Self = StObject.set(x, "view_modes", js.Array(value*))
    }
  }
  
  trait Task extends StObject {
    
    var custom_class: js.UndefOr[String] = js.undefined
    
    var dependencies: String
    
    var end: String
    
    var id: String
    
    var name: String
    
    var progress: Double
    
    var start: String
  }
  object Task {
    
    inline def apply(dependencies: String, end: String, id: String, name: String, progress: Double, start: String): Task = {
      val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[Task]
    }
    
    extension [Self <: Task](x: Self) {
      
      inline def setCustom_class(value: String): Self = StObject.set(x, "custom_class", value.asInstanceOf[js.Any])
      
      inline def setCustom_classUndefined: Self = StObject.set(x, "custom_class", js.undefined)
      
      inline def setDependencies(value: String): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      inline def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.frappeGantt.frappeGanttStrings.`Quarter Day`
    - typings.frappeGantt.frappeGanttStrings.`Half Day`
    - typings.frappeGantt.frappeGanttStrings.Day_
    - typings.frappeGantt.frappeGanttStrings.Week_
    - typings.frappeGantt.frappeGanttStrings.Month_
    - typings.frappeGantt.frappeGanttStrings.Year_
  */
  trait viewMode extends StObject
  object viewMode {
    
    inline def Day: Day_ = "Day".asInstanceOf[Day_]
    
    inline def `Half Day`: typings.frappeGantt.frappeGanttStrings.`Half Day` = ("Half Day").asInstanceOf[typings.frappeGantt.frappeGanttStrings.`Half Day`]
    
    inline def Month: Month_ = "Month".asInstanceOf[Month_]
    
    inline def `Quarter Day`: typings.frappeGantt.frappeGanttStrings.`Quarter Day` = ("Quarter Day").asInstanceOf[typings.frappeGantt.frappeGanttStrings.`Quarter Day`]
    
    inline def Week: Week_ = "Week".asInstanceOf[Week_]
    
    inline def Year: Year_ = "Year".asInstanceOf[Year_]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.frappeGantt.frappeGanttStrings.QUARTER_DAY
    - typings.frappeGantt.frappeGanttStrings.HALF_DAY
    - typings.frappeGantt.frappeGanttStrings.DAY
    - typings.frappeGantt.frappeGanttStrings.WEEK
    - typings.frappeGantt.frappeGanttStrings.MONTH
    - typings.frappeGantt.frappeGanttStrings.YEAR
  */
  trait viewModeKey extends StObject
  object viewModeKey {
    
    inline def DAY: typings.frappeGantt.frappeGanttStrings.DAY = "DAY".asInstanceOf[typings.frappeGantt.frappeGanttStrings.DAY]
    
    inline def HALF_DAY: typings.frappeGantt.frappeGanttStrings.HALF_DAY = "HALF_DAY".asInstanceOf[typings.frappeGantt.frappeGanttStrings.HALF_DAY]
    
    inline def MONTH: typings.frappeGantt.frappeGanttStrings.MONTH = "MONTH".asInstanceOf[typings.frappeGantt.frappeGanttStrings.MONTH]
    
    inline def QUARTER_DAY: typings.frappeGantt.frappeGanttStrings.QUARTER_DAY = "QUARTER_DAY".asInstanceOf[typings.frappeGantt.frappeGanttStrings.QUARTER_DAY]
    
    inline def WEEK: typings.frappeGantt.frappeGanttStrings.WEEK = "WEEK".asInstanceOf[typings.frappeGantt.frappeGanttStrings.WEEK]
    
    inline def YEAR: typings.frappeGantt.frappeGanttStrings.YEAR = "YEAR".asInstanceOf[typings.frappeGantt.frappeGanttStrings.YEAR]
  }
}
