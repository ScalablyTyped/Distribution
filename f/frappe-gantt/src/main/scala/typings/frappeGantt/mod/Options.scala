package typings.frappeGantt.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
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
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArrow_curve(value: Double): Self = this.set("arrow_curve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrow_curve: Self = this.set("arrow_curve", js.undefined)
    
    @scala.inline
    def setBar_corner_radius(value: Double): Self = this.set("bar_corner_radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBar_corner_radius: Self = this.set("bar_corner_radius", js.undefined)
    
    @scala.inline
    def setBar_height(value: Double): Self = this.set("bar_height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBar_height: Self = this.set("bar_height", js.undefined)
    
    @scala.inline
    def setColumn_width(value: Double): Self = this.set("column_width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumn_width: Self = this.set("column_width", js.undefined)
    
    @scala.inline
    def setCustom_popup_htmlFunction1(value: /* task */ EnrichedTask => String): Self = this.set("custom_popup_html", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCustom_popup_html(value: String | (js.Function1[/* task */ EnrichedTask, String])): Self = this.set("custom_popup_html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustom_popup_html: Self = this.set("custom_popup_html", js.undefined)
    
    @scala.inline
    def setDate_format(value: String): Self = this.set("date_format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate_format: Self = this.set("date_format", js.undefined)
    
    @scala.inline
    def setHeader_height(value: Double): Self = this.set("header_height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeader_height: Self = this.set("header_height", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setOn_click(value: /* task */ EnrichedTask => Unit): Self = this.set("on_click", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOn_click: Self = this.set("on_click", js.undefined)
    
    @scala.inline
    def setOn_date_change(value: (/* task */ EnrichedTask, /* start */ Date, /* end */ Date) => Unit): Self = this.set("on_date_change", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOn_date_change: Self = this.set("on_date_change", js.undefined)
    
    @scala.inline
    def setOn_progress_change(value: (/* task */ EnrichedTask, /* progress */ Double) => Unit): Self = this.set("on_progress_change", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOn_progress_change: Self = this.set("on_progress_change", js.undefined)
    
    @scala.inline
    def setOn_view_change(value: /* mode */ viewMode => Unit): Self = this.set("on_view_change", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOn_view_change: Self = this.set("on_view_change", js.undefined)
    
    @scala.inline
    def setPadding(value: Double): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
    
    @scala.inline
    def setView_mode(value: viewMode): Self = this.set("view_mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteView_mode: Self = this.set("view_mode", js.undefined)
    
    @scala.inline
    def setView_modesVarargs(value: viewMode*): Self = this.set("view_modes", js.Array(value :_*))
    
    @scala.inline
    def setView_modes(value: js.Array[viewMode]): Self = this.set("view_modes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteView_modes: Self = this.set("view_modes", js.undefined)
  }
}
