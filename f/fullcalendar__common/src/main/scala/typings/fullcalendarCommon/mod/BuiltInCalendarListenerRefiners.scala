package typings.fullcalendarCommon.mod

import typings.fullcalendarCommon.anon.View
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuiltInCalendarListenerRefiners extends StObject {
  
  def _afterprint(raw: js.Function0[Unit]): js.Function0[Unit]
  @JSName("_afterprint")
  var _afterprint_Original: Identity_[js.Function0[Unit]]
  
  def _beforeprint(raw: js.Function0[Unit]): js.Function0[Unit]
  @JSName("_beforeprint")
  var _beforeprint_Original: Identity_[js.Function0[Unit]]
  
  def _noEventDrop(raw: js.Function0[Unit]): js.Function0[Unit]
  @JSName("_noEventDrop")
  var _noEventDrop_Original: Identity_[js.Function0[Unit]]
  
  def _noEventResize(raw: js.Function0[Unit]): js.Function0[Unit]
  @JSName("_noEventResize")
  var _noEventResize_Original: Identity_[js.Function0[Unit]]
  
  def _resize(raw: js.Function1[/* forced */ Boolean, Unit]): js.Function1[/* forced */ Boolean, Unit]
  @JSName("_resize")
  var _resize_Original: Identity_[js.Function1[/* forced */ Boolean, Unit]]
  
  def _scrollRequest(raw: js.Function1[/* arg */ Any, Unit]): js.Function1[/* arg */ Any, Unit]
  @JSName("_scrollRequest")
  var _scrollRequest_Original: Identity_[js.Function1[/* arg */ Any, Unit]]
  
  def _unmount(raw: js.Function0[Unit]): js.Function0[Unit]
  @JSName("_unmount")
  var _unmount_Original: Identity_[js.Function0[Unit]]
  
  def datesSet(raw: js.Function1[/* arg */ DatesSetArg, Unit]): js.Function1[/* arg */ DatesSetArg, Unit]
  @JSName("datesSet")
  var datesSet_Original: Identity_[js.Function1[/* arg */ DatesSetArg, Unit]]
  
  def eventAdd(raw: js.Function1[/* arg */ EventAddArg, Unit]): js.Function1[/* arg */ EventAddArg, Unit]
  @JSName("eventAdd")
  var eventAdd_Original: Identity_[js.Function1[/* arg */ EventAddArg, Unit]]
  
  def eventChange(raw: js.Function1[/* arg */ EventChangeArg, Unit]): js.Function1[/* arg */ EventChangeArg, Unit]
  @JSName("eventChange")
  var eventChange_Original: Identity_[js.Function1[/* arg */ EventChangeArg, Unit]]
  
  def eventClick(raw: js.Function1[/* arg */ EventClickArg, Unit]): js.Function1[/* arg */ EventClickArg, Unit]
  @JSName("eventClick")
  var eventClick_Original: Identity_[js.Function1[/* arg */ EventClickArg, Unit]]
  
  def eventMouseEnter(raw: js.Function1[/* arg */ EventHoveringArg, Unit]): js.Function1[/* arg */ EventHoveringArg, Unit]
  @JSName("eventMouseEnter")
  var eventMouseEnter_Original: Identity_[js.Function1[/* arg */ EventHoveringArg, Unit]]
  
  def eventMouseLeave(raw: js.Function1[/* arg */ EventHoveringArg, Unit]): js.Function1[/* arg */ EventHoveringArg, Unit]
  @JSName("eventMouseLeave")
  var eventMouseLeave_Original: Identity_[js.Function1[/* arg */ EventHoveringArg, Unit]]
  
  def eventRemove(raw: js.Function1[/* arg */ EventRemoveArg, Unit]): js.Function1[/* arg */ EventRemoveArg, Unit]
  @JSName("eventRemove")
  var eventRemove_Original: Identity_[js.Function1[/* arg */ EventRemoveArg, Unit]]
  
  def eventsSet(raw: js.Function1[/* events */ js.Array[EventApi], Unit]): js.Function1[/* events */ js.Array[EventApi], Unit]
  @JSName("eventsSet")
  var eventsSet_Original: Identity_[js.Function1[/* events */ js.Array[EventApi], Unit]]
  
  def loading(raw: js.Function1[/* isLoading */ Boolean, Unit]): js.Function1[/* isLoading */ Boolean, Unit]
  @JSName("loading")
  var loading_Original: Identity_[js.Function1[/* isLoading */ Boolean, Unit]]
  
  def select(raw: js.Function1[/* arg */ DateSelectArg, Unit]): js.Function1[/* arg */ DateSelectArg, Unit]
  @JSName("select")
  var select_Original: Identity_[js.Function1[/* arg */ DateSelectArg, Unit]]
  
  def unselect(raw: js.Function1[/* arg */ DateUnselectArg, Unit]): js.Function1[/* arg */ DateUnselectArg, Unit]
  @JSName("unselect")
  var unselect_Original: Identity_[js.Function1[/* arg */ DateUnselectArg, Unit]]
  
  def windowResize(raw: js.Function1[/* arg */ View, Unit]): js.Function1[/* arg */ View, Unit]
  @JSName("windowResize")
  var windowResize_Original: Identity_[js.Function1[/* arg */ View, Unit]]
}
object BuiltInCalendarListenerRefiners {
  
  inline def apply(
    _afterprint: js.Function0[Unit] => js.Function0[Unit],
    _beforeprint: js.Function0[Unit] => js.Function0[Unit],
    _noEventDrop: js.Function0[Unit] => js.Function0[Unit],
    _noEventResize: js.Function0[Unit] => js.Function0[Unit],
    _resize: js.Function1[/* forced */ Boolean, Unit] => js.Function1[/* forced */ Boolean, Unit],
    _scrollRequest: js.Function1[/* arg */ Any, Unit] => js.Function1[/* arg */ Any, Unit],
    _unmount: js.Function0[Unit] => js.Function0[Unit],
    datesSet: js.Function1[/* arg */ DatesSetArg, Unit] => js.Function1[/* arg */ DatesSetArg, Unit],
    eventAdd: js.Function1[/* arg */ EventAddArg, Unit] => js.Function1[/* arg */ EventAddArg, Unit],
    eventChange: js.Function1[/* arg */ EventChangeArg, Unit] => js.Function1[/* arg */ EventChangeArg, Unit],
    eventClick: js.Function1[/* arg */ EventClickArg, Unit] => js.Function1[/* arg */ EventClickArg, Unit],
    eventMouseEnter: js.Function1[/* arg */ EventHoveringArg, Unit] => js.Function1[/* arg */ EventHoveringArg, Unit],
    eventMouseLeave: js.Function1[/* arg */ EventHoveringArg, Unit] => js.Function1[/* arg */ EventHoveringArg, Unit],
    eventRemove: js.Function1[/* arg */ EventRemoveArg, Unit] => js.Function1[/* arg */ EventRemoveArg, Unit],
    eventsSet: js.Function1[/* events */ js.Array[EventApi], Unit] => js.Function1[/* events */ js.Array[EventApi], Unit],
    loading: js.Function1[/* isLoading */ Boolean, Unit] => js.Function1[/* isLoading */ Boolean, Unit],
    select: js.Function1[/* arg */ DateSelectArg, Unit] => js.Function1[/* arg */ DateSelectArg, Unit],
    unselect: js.Function1[/* arg */ DateUnselectArg, Unit] => js.Function1[/* arg */ DateUnselectArg, Unit],
    windowResize: js.Function1[/* arg */ View, Unit] => js.Function1[/* arg */ View, Unit]
  ): BuiltInCalendarListenerRefiners = {
    val __obj = js.Dynamic.literal(_afterprint = js.Any.fromFunction1(_afterprint), _beforeprint = js.Any.fromFunction1(_beforeprint), _noEventDrop = js.Any.fromFunction1(_noEventDrop), _noEventResize = js.Any.fromFunction1(_noEventResize), _resize = js.Any.fromFunction1(_resize), _scrollRequest = js.Any.fromFunction1(_scrollRequest), _unmount = js.Any.fromFunction1(_unmount), datesSet = js.Any.fromFunction1(datesSet), eventAdd = js.Any.fromFunction1(eventAdd), eventChange = js.Any.fromFunction1(eventChange), eventClick = js.Any.fromFunction1(eventClick), eventMouseEnter = js.Any.fromFunction1(eventMouseEnter), eventMouseLeave = js.Any.fromFunction1(eventMouseLeave), eventRemove = js.Any.fromFunction1(eventRemove), eventsSet = js.Any.fromFunction1(eventsSet), loading = js.Any.fromFunction1(loading), select = js.Any.fromFunction1(select), unselect = js.Any.fromFunction1(unselect), windowResize = js.Any.fromFunction1(windowResize))
    __obj.asInstanceOf[BuiltInCalendarListenerRefiners]
  }
  
  extension [Self <: BuiltInCalendarListenerRefiners](x: Self) {
    
    inline def setDatesSet(value: js.Function1[/* arg */ DatesSetArg, Unit] => js.Function1[/* arg */ DatesSetArg, Unit]): Self = StObject.set(x, "datesSet", js.Any.fromFunction1(value))
    
    inline def setEventAdd(value: js.Function1[/* arg */ EventAddArg, Unit] => js.Function1[/* arg */ EventAddArg, Unit]): Self = StObject.set(x, "eventAdd", js.Any.fromFunction1(value))
    
    inline def setEventChange(
      value: js.Function1[/* arg */ EventChangeArg, Unit] => js.Function1[/* arg */ EventChangeArg, Unit]
    ): Self = StObject.set(x, "eventChange", js.Any.fromFunction1(value))
    
    inline def setEventClick(value: js.Function1[/* arg */ EventClickArg, Unit] => js.Function1[/* arg */ EventClickArg, Unit]): Self = StObject.set(x, "eventClick", js.Any.fromFunction1(value))
    
    inline def setEventMouseEnter(
      value: js.Function1[/* arg */ EventHoveringArg, Unit] => js.Function1[/* arg */ EventHoveringArg, Unit]
    ): Self = StObject.set(x, "eventMouseEnter", js.Any.fromFunction1(value))
    
    inline def setEventMouseLeave(
      value: js.Function1[/* arg */ EventHoveringArg, Unit] => js.Function1[/* arg */ EventHoveringArg, Unit]
    ): Self = StObject.set(x, "eventMouseLeave", js.Any.fromFunction1(value))
    
    inline def setEventRemove(
      value: js.Function1[/* arg */ EventRemoveArg, Unit] => js.Function1[/* arg */ EventRemoveArg, Unit]
    ): Self = StObject.set(x, "eventRemove", js.Any.fromFunction1(value))
    
    inline def setEventsSet(
      value: js.Function1[/* events */ js.Array[EventApi], Unit] => js.Function1[/* events */ js.Array[EventApi], Unit]
    ): Self = StObject.set(x, "eventsSet", js.Any.fromFunction1(value))
    
    inline def setLoading(value: js.Function1[/* isLoading */ Boolean, Unit] => js.Function1[/* isLoading */ Boolean, Unit]): Self = StObject.set(x, "loading", js.Any.fromFunction1(value))
    
    inline def setSelect(value: js.Function1[/* arg */ DateSelectArg, Unit] => js.Function1[/* arg */ DateSelectArg, Unit]): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
    
    inline def setUnselect(
      value: js.Function1[/* arg */ DateUnselectArg, Unit] => js.Function1[/* arg */ DateUnselectArg, Unit]
    ): Self = StObject.set(x, "unselect", js.Any.fromFunction1(value))
    
    inline def setWindowResize(value: js.Function1[/* arg */ View, Unit] => js.Function1[/* arg */ View, Unit]): Self = StObject.set(x, "windowResize", js.Any.fromFunction1(value))
    
    inline def set_afterprint(value: js.Function0[Unit] => js.Function0[Unit]): Self = StObject.set(x, "_afterprint", js.Any.fromFunction1(value))
    
    inline def set_beforeprint(value: js.Function0[Unit] => js.Function0[Unit]): Self = StObject.set(x, "_beforeprint", js.Any.fromFunction1(value))
    
    inline def set_noEventDrop(value: js.Function0[Unit] => js.Function0[Unit]): Self = StObject.set(x, "_noEventDrop", js.Any.fromFunction1(value))
    
    inline def set_noEventResize(value: js.Function0[Unit] => js.Function0[Unit]): Self = StObject.set(x, "_noEventResize", js.Any.fromFunction1(value))
    
    inline def set_resize(value: js.Function1[/* forced */ Boolean, Unit] => js.Function1[/* forced */ Boolean, Unit]): Self = StObject.set(x, "_resize", js.Any.fromFunction1(value))
    
    inline def set_scrollRequest(value: js.Function1[/* arg */ Any, Unit] => js.Function1[/* arg */ Any, Unit]): Self = StObject.set(x, "_scrollRequest", js.Any.fromFunction1(value))
    
    inline def set_unmount(value: js.Function0[Unit] => js.Function0[Unit]): Self = StObject.set(x, "_unmount", js.Any.fromFunction1(value))
  }
}
