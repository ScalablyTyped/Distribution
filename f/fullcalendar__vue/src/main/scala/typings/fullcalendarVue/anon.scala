package typings.fullcalendarVue

import typings.std.Date
import typings.std.HTMLElement
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AllDay extends StObject {
    
    var allDay: Boolean
    
    var date: Date
    
    var dayEl: HTMLElement
    
    var hiddenSegs: js.Array[js.Any]
    
    var jsEvent: MouseEvent
    
    var moreEl: HTMLElement
    
    var segs: js.Array[js.Any]
    
    var view: js.Any
  }
  object AllDay {
    
    @scala.inline
    def apply(
      allDay: Boolean,
      date: Date,
      dayEl: HTMLElement,
      hiddenSegs: js.Array[js.Any],
      jsEvent: MouseEvent,
      moreEl: HTMLElement,
      segs: js.Array[js.Any],
      view: js.Any
    ): AllDay = {
      val __obj = js.Dynamic.literal(allDay = allDay.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], dayEl = dayEl.asInstanceOf[js.Any], hiddenSegs = hiddenSegs.asInstanceOf[js.Any], jsEvent = jsEvent.asInstanceOf[js.Any], moreEl = moreEl.asInstanceOf[js.Any], segs = segs.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
      __obj.asInstanceOf[AllDay]
    }
    
    @scala.inline
    implicit class AllDayMutableBuilder[Self <: AllDay] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllDay(value: Boolean): Self = StObject.set(x, "allDay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDayEl(value: HTMLElement): Self = StObject.set(x, "dayEl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiddenSegs(value: js.Array[js.Any]): Self = StObject.set(x, "hiddenSegs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiddenSegsVarargs(value: js.Any*): Self = StObject.set(x, "hiddenSegs", js.Array(value :_*))
      
      @scala.inline
      def setJsEvent(value: MouseEvent): Self = StObject.set(x, "jsEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMoreEl(value: HTMLElement): Self = StObject.set(x, "moreEl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSegs(value: js.Array[js.Any]): Self = StObject.set(x, "segs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSegsVarargs(value: js.Any*): Self = StObject.set(x, "segs", js.Array(value :_*))
      
      @scala.inline
      def setView(value: js.Any): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    }
  }
}
