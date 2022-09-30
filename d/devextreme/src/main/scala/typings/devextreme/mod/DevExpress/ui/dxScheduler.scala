package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.core.DxElement_
import typings.devextreme.mod.DevExpress.core.UserDefinedElement
import typings.devextreme.mod.DevExpress.data.DataSource
import typings.devextreme.mod.DevExpress.events.Cancelable
import typings.devextreme.mod.DevExpress.events.ChangedOptionInfo
import typings.devextreme.mod.DevExpress.events.DxEvent
import typings.devextreme.mod.DevExpress.events.EventInfo
import typings.devextreme.mod.DevExpress.events.InitializedEventInfo
import typings.devextreme.mod.DevExpress.events.NativeEventInfo
import typings.devextreme.mod.DevExpress.ui.dxScheduler.RecurrenceEditMode
import typings.std.Element
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import typings.std.PointerEvent
import typings.std.PromiseLike
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxScheduler
  extends StObject
     with Widget[dxSchedulerOptions] {
  
  /**
    * Adds an appointment.
    */
  def addAppointment(appointment: dxSchedulerAppointment): Unit = js.native
  
  /**
    * Deletes an appointment from the timetable and its object from the data source.
    */
  def deleteAppointment(appointment: dxSchedulerAppointment): Unit = js.native
  
  def deleteRecurrence(appointmentData: dxSchedulerAppointment, date: String, recurrenceEditMode: RecurrenceEditMode): Unit = js.native
  /**
    * 
    */
  def deleteRecurrence(appointmentData: dxSchedulerAppointment, date: js.Date, recurrenceEditMode: RecurrenceEditMode): Unit = js.native
  
  def getDataSource(): DataSource[Any, Any] = js.native
  
  /**
    * Gets the current view&apos;s end date.
    */
  def getEndViewDate(): js.Date = js.native
  
  /**
    * Gets the current view&apos;s start date.
    */
  def getStartViewDate(): js.Date = js.native
  
  /**
    * Hides an appointment details form.
    */
  def hideAppointmentPopup(): Unit = js.native
  def hideAppointmentPopup(saveChanges: Boolean): Unit = js.native
  
  /**
    * Hides an appointment&apos;s or cell overflow indicator&apos;s tooltip.
    */
  def hideAppointmentTooltip(): Unit = js.native
  
  /**
    * Scrolls the current view to a specified position. Available for all views except &apos;agenda&apos;. You should specify the height property to use this method.
    */
  def scrollTo(date: js.Date): Unit = js.native
  def scrollTo(date: js.Date, group: js.Object): Unit = js.native
  def scrollTo(date: js.Date, group: js.Object, allDay: Boolean): Unit = js.native
  def scrollTo(date: js.Date, group: Unit, allDay: Boolean): Unit = js.native
  
  /**
    * Scrolls the current view to a specific day and time.
    * @deprecated Use scrollTo instead.
    */
  def scrollToTime(hours: Double, minutes: Double): Unit = js.native
  def scrollToTime(hours: Double, minutes: Double, date: js.Date): Unit = js.native
  
  /**
    * Shows the appointment details form.
    */
  def showAppointmentPopup(): Unit = js.native
  def showAppointmentPopup(appointmentData: Unit, createNewAppointment: Boolean): Unit = js.native
  def showAppointmentPopup(
    appointmentData: Unit,
    createNewAppointment: Boolean,
    currentAppointmentData: dxSchedulerAppointment
  ): Unit = js.native
  def showAppointmentPopup(appointmentData: Unit, createNewAppointment: Unit, currentAppointmentData: dxSchedulerAppointment): Unit = js.native
  def showAppointmentPopup(appointmentData: dxSchedulerAppointment): Unit = js.native
  def showAppointmentPopup(appointmentData: dxSchedulerAppointment, createNewAppointment: Boolean): Unit = js.native
  def showAppointmentPopup(
    appointmentData: dxSchedulerAppointment,
    createNewAppointment: Boolean,
    currentAppointmentData: dxSchedulerAppointment
  ): Unit = js.native
  def showAppointmentPopup(
    appointmentData: dxSchedulerAppointment,
    createNewAppointment: Unit,
    currentAppointmentData: dxSchedulerAppointment
  ): Unit = js.native
  
  /**
    * Shows a tooltip for a target element.
    */
  def showAppointmentTooltip(appointmentData: dxSchedulerAppointment, target: String): Unit = js.native
  def showAppointmentTooltip(
    appointmentData: dxSchedulerAppointment,
    target: String,
    currentAppointmentData: dxSchedulerAppointment
  ): Unit = js.native
  def showAppointmentTooltip(appointmentData: dxSchedulerAppointment, target: UserDefinedElement[Element]): Unit = js.native
  def showAppointmentTooltip(
    appointmentData: dxSchedulerAppointment,
    target: UserDefinedElement[Element],
    currentAppointmentData: dxSchedulerAppointment
  ): Unit = js.native
  
  /**
    * Updates an appointment.
    */
  def updateAppointment(target: dxSchedulerAppointment, appointment: dxSchedulerAppointment): Unit = js.native
}
object dxScheduler {
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.all
    - typings.devextreme.devextremeStrings.allDay
    - typings.devextreme.devextremeStrings.hidden
  */
  trait AllDayPanelMode extends StObject
  object AllDayPanelMode {
    
    inline def all: typings.devextreme.devextremeStrings.all = "all".asInstanceOf[typings.devextreme.devextremeStrings.all]
    
    inline def allDay: typings.devextreme.devextremeStrings.allDay = "allDay".asInstanceOf[typings.devextreme.devextremeStrings.allDay]
    
    inline def hidden: typings.devextreme.devextremeStrings.hidden = "hidden".asInstanceOf[typings.devextreme.devextremeStrings.hidden]
  }
  
  type Appointment = dxSchedulerAppointment
  
  trait AppointmentAddedEvent
    extends StObject
       with EventInfo[dxScheduler] {
    
    val appointmentData: dxSchedulerAppointment
    
    val error: js.UndefOr[js.Error] = js.undefined
  }
  object AppointmentAddedEvent {
    
    inline def apply(appointmentData: dxSchedulerAppointment, component: dxScheduler, element: DxElement_[HTMLElement]): AppointmentAddedEvent = {
      val __obj = js.Dynamic.literal(appointmentData = appointmentData.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppointmentAddedEvent]
    }
    
    extension [Self <: AppointmentAddedEvent](x: Self) {
      
      inline def setAppointmentData(value: dxSchedulerAppointment): Self = StObject.set(x, "appointmentData", value.asInstanceOf[js.Any])
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    }
  }
  
  trait AppointmentAddingEvent
    extends StObject
       with EventInfo[dxScheduler] {
    
    val appointmentData: dxSchedulerAppointment
    
    var cancel: Boolean | PromiseLike[Boolean]
  }
  object AppointmentAddingEvent {
    
    inline def apply(
      appointmentData: dxSchedulerAppointment,
      cancel: Boolean | PromiseLike[Boolean],
      component: dxScheduler,
      element: DxElement_[HTMLElement]
    ): AppointmentAddingEvent = {
      val __obj = js.Dynamic.literal(appointmentData = appointmentData.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppointmentAddingEvent]
    }
    
    extension [Self <: AppointmentAddingEvent](x: Self) {
      
      inline def setAppointmentData(value: dxSchedulerAppointment): Self = StObject.set(x, "appointmentData", value.asInstanceOf[js.Any])
      
      inline def setCancel(value: Boolean | PromiseLike[Boolean]): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    }
  }
  
  trait AppointmentClickEvent
    extends StObject
       with Cancelable
       with NativeEventInfo[dxScheduler, KeyboardEvent | MouseEvent | PointerEvent]
       with TargetedAppointmentInfo {
    
    val appointmentElement: DxElement_[HTMLElement]
  }
  object AppointmentClickEvent {
    
    inline def apply(
      appointmentData: dxSchedulerAppointment,
      appointmentElement: DxElement_[HTMLElement],
      component: dxScheduler,
      element: DxElement_[HTMLElement]
    ): AppointmentClickEvent = {
      val __obj = js.Dynamic.literal(appointmentData = appointmentData.asInstanceOf[js.Any], appointmentElement = appointmentElement.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppointmentClickEvent]
    }
    
    extension [Self <: AppointmentClickEvent](x: Self) {
      
      inline def setAppointmentElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "appointmentElement", value.asInstanceOf[js.Any])
    }
  }
  
  trait AppointmentCollectorTemplateData extends StObject {
    
    val appointmentCount: Double
    
    val isCompact: Boolean
  }
  object AppointmentCollectorTemplateData {
    
    inline def apply(appointmentCount: Double, isCompact: Boolean): AppointmentCollectorTemplateData = {
      val __obj = js.Dynamic.literal(appointmentCount = appointmentCount.asInstanceOf[js.Any], isCompact = isCompact.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppointmentCollectorTemplateData]
    }
    
    extension [Self <: AppointmentCollectorTemplateData](x: Self) {
      
      inline def setAppointmentCount(value: Double): Self = StObject.set(x, "appointmentCount", value.asInstanceOf[js.Any])
      
      inline def setIsCompact(value: Boolean): Self = StObject.set(x, "isCompact", value.asInstanceOf[js.Any])
    }
  }
  
  trait AppointmentContextMenuEvent
    extends StObject
       with NativeEventInfo[dxScheduler, MouseEvent | PointerEvent | TouchEvent]
       with TargetedAppointmentInfo {
    
    val appointmentElement: DxElement_[HTMLElement]
  }
  object AppointmentContextMenuEvent {
    
    inline def apply(
      appointmentData: dxSchedulerAppointment,
      appointmentElement: DxElement_[HTMLElement],
      component: dxScheduler,
      element: DxElement_[HTMLElement]
    ): AppointmentContextMenuEvent = {
      val __obj = js.Dynamic.literal(appointmentData = appointmentData.asInstanceOf[js.Any], appointmentElement = appointmentElement.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppointmentContextMenuEvent]
    }
    
    extension [Self <: AppointmentContextMenuEvent](x: Self) {
      
      inline def setAppointmentElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "appointmentElement", value.asInstanceOf[js.Any])
    }
  }
  
  trait AppointmentDblClickEvent
    extends StObject
       with Cancelable
       with NativeEventInfo[dxScheduler, MouseEvent | PointerEvent]
       with TargetedAppointmentInfo {
    
    val appointmentElement: DxElement_[HTMLElement]
  }
  object AppointmentDblClickEvent {
    
    inline def apply(
      appointmentData: dxSchedulerAppointment,
      appointmentElement: DxElement_[HTMLElement],
      component: dxScheduler,
      element: DxElement_[HTMLElement]
    ): AppointmentDblClickEvent = {
      val __obj = js.Dynamic.literal(appointmentData = appointmentData.asInstanceOf[js.Any], appointmentElement = appointmentElement.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppointmentDblClickEvent]
    }
    
    extension [Self <: AppointmentDblClickEvent](x: Self) {
      
      inline def setAppointmentElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "appointmentElement", value.asInstanceOf[js.Any])
    }
  }
  
  trait AppointmentDeletedEvent
    extends StObject
       with EventInfo[dxScheduler] {
    
    val appointmentData: dxSchedulerAppointment
    
    val error: js.UndefOr[js.Error] = js.undefined
  }
  object AppointmentDeletedEvent {
    
    inline def apply(appointmentData: dxSchedulerAppointment, component: dxScheduler, element: DxElement_[HTMLElement]): AppointmentDeletedEvent = {
      val __obj = js.Dynamic.literal(appointmentData = appointmentData.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppointmentDeletedEvent]
    }
    
    extension [Self <: AppointmentDeletedEvent](x: Self) {
      
      inline def setAppointmentData(value: dxSchedulerAppointment): Self = StObject.set(x, "appointmentData", value.asInstanceOf[js.Any])
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    }
  }
  
  trait AppointmentDeletingEvent
    extends StObject
       with EventInfo[dxScheduler] {
    
    val appointmentData: dxSchedulerAppointment
    
    var cancel: Boolean | PromiseLike[Boolean]
  }
  object AppointmentDeletingEvent {
    
    inline def apply(
      appointmentData: dxSchedulerAppointment,
      cancel: Boolean | PromiseLike[Boolean],
      component: dxScheduler,
      element: DxElement_[HTMLElement]
    ): AppointmentDeletingEvent = {
      val __obj = js.Dynamic.literal(appointmentData = appointmentData.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppointmentDeletingEvent]
    }
    
    extension [Self <: AppointmentDeletingEvent](x: Self) {
      
      inline def setAppointmentData(value: dxSchedulerAppointment): Self = StObject.set(x, "appointmentData", value.asInstanceOf[js.Any])
      
      inline def setCancel(value: Boolean | PromiseLike[Boolean]): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    }
  }
  
  trait AppointmentDraggingAddEvent
    extends StObject
       with AppointmentDraggingEvent {
    
    val fromComponent: js.UndefOr[dxSortable | dxDraggable] = js.undefined
    
    val toComponent: js.UndefOr[dxSortable | dxDraggable] = js.undefined
    
    val toData: js.UndefOr[Any] = js.undefined
  }
  object AppointmentDraggingAddEvent {
    
    inline def apply(component: dxScheduler): AppointmentDraggingAddEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppointmentDraggingAddEvent]
    }
    
    extension [Self <: AppointmentDraggingAddEvent](x: Self) {
      
      inline def setFromComponent(value: dxSortable | dxDraggable): Self = StObject.set(x, "fromComponent", value.asInstanceOf[js.Any])
      
      inline def setFromComponentUndefined: Self = StObject.set(x, "fromComponent", js.undefined)
      
      inline def setToComponent(value: dxSortable | dxDraggable): Self = StObject.set(x, "toComponent", value.asInstanceOf[js.Any])
      
      inline def setToComponentUndefined: Self = StObject.set(x, "toComponent", js.undefined)
      
      inline def setToData(value: Any): Self = StObject.set(x, "toData", value.asInstanceOf[js.Any])
      
      inline def setToDataUndefined: Self = StObject.set(x, "toData", js.undefined)
    }
  }
  
  trait AppointmentDraggingEndEvent
    extends StObject
       with Cancelable
       with AppointmentDraggingEvent {
    
    val fromComponent: js.UndefOr[dxSortable | dxDraggable] = js.undefined
    
    val toComponent: js.UndefOr[dxSortable | dxDraggable] = js.undefined
    
    val toData: js.UndefOr[Any] = js.undefined
  }
  object AppointmentDraggingEndEvent {
    
    inline def apply(component: dxScheduler): AppointmentDraggingEndEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppointmentDraggingEndEvent]
    }
    
    extension [Self <: AppointmentDraggingEndEvent](x: Self) {
      
      inline def setFromComponent(value: dxSortable | dxDraggable): Self = StObject.set(x, "fromComponent", value.asInstanceOf[js.Any])
      
      inline def setFromComponentUndefined: Self = StObject.set(x, "fromComponent", js.undefined)
      
      inline def setToComponent(value: dxSortable | dxDraggable): Self = StObject.set(x, "toComponent", value.asInstanceOf[js.Any])
      
      inline def setToComponentUndefined: Self = StObject.set(x, "toComponent", js.undefined)
      
      inline def setToData(value: Any): Self = StObject.set(x, "toData", value.asInstanceOf[js.Any])
      
      inline def setToDataUndefined: Self = StObject.set(x, "toData", js.undefined)
    }
  }
  
  /**
    * @deprecated Attention! This type is for internal purposes only. If you used it previously, please submit a ticket to our {@link https://supportcenter.devexpress.com/ticket/create Support Center}. We will check if there is an alternative solution.
    */
  trait AppointmentDraggingEvent extends StObject {
    
    val component: dxScheduler
    
    val event: js.UndefOr[DxEvent[MouseEvent | TouchEvent]] = js.undefined
    
    val fromData: js.UndefOr[Any] = js.undefined
    
    val itemData: js.UndefOr[Any] = js.undefined
    
    val itemElement: js.UndefOr[DxElement_[HTMLElement]] = js.undefined
  }
  object AppointmentDraggingEvent {
    
    inline def apply(component: dxScheduler): AppointmentDraggingEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppointmentDraggingEvent]
    }
    
    extension [Self <: AppointmentDraggingEvent](x: Self) {
      
      inline def setComponent(value: dxScheduler): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setEvent(value: DxEvent[MouseEvent | TouchEvent]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      inline def setFromData(value: Any): Self = StObject.set(x, "fromData", value.asInstanceOf[js.Any])
      
      inline def setFromDataUndefined: Self = StObject.set(x, "fromData", js.undefined)
      
      inline def setItemData(value: Any): Self = StObject.set(x, "itemData", value.asInstanceOf[js.Any])
      
      inline def setItemDataUndefined: Self = StObject.set(x, "itemData", js.undefined)
      
      inline def setItemElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "itemElement", value.asInstanceOf[js.Any])
      
      inline def setItemElementUndefined: Self = StObject.set(x, "itemElement", js.undefined)
    }
  }
  
  trait AppointmentDraggingMoveEvent
    extends StObject
       with Cancelable
       with AppointmentDraggingEvent {
    
    val fromComponent: js.UndefOr[dxSortable | dxDraggable] = js.undefined
    
    val toComponent: js.UndefOr[dxSortable | dxDraggable] = js.undefined
    
    val toData: js.UndefOr[Any] = js.undefined
  }
  object AppointmentDraggingMoveEvent {
    
    inline def apply(component: dxScheduler): AppointmentDraggingMoveEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppointmentDraggingMoveEvent]
    }
    
    extension [Self <: AppointmentDraggingMoveEvent](x: Self) {
      
      inline def setFromComponent(value: dxSortable | dxDraggable): Self = StObject.set(x, "fromComponent", value.asInstanceOf[js.Any])
      
      inline def setFromComponentUndefined: Self = StObject.set(x, "fromComponent", js.undefined)
      
      inline def setToComponent(value: dxSortable | dxDraggable): Self = StObject.set(x, "toComponent", value.asInstanceOf[js.Any])
      
      inline def setToComponentUndefined: Self = StObject.set(x, "toComponent", js.undefined)
      
      inline def setToData(value: Any): Self = StObject.set(x, "toData", value.asInstanceOf[js.Any])
      
      inline def setToDataUndefined: Self = StObject.set(x, "toData", js.undefined)
    }
  }
  
  trait AppointmentDraggingRemoveEvent
    extends StObject
       with AppointmentDraggingEvent {
    
    val fromComponent: js.UndefOr[dxSortable | dxDraggable] = js.undefined
    
    val toComponent: js.UndefOr[dxSortable | dxDraggable] = js.undefined
  }
  object AppointmentDraggingRemoveEvent {
    
    inline def apply(component: dxScheduler): AppointmentDraggingRemoveEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppointmentDraggingRemoveEvent]
    }
    
    extension [Self <: AppointmentDraggingRemoveEvent](x: Self) {
      
      inline def setFromComponent(value: dxSortable | dxDraggable): Self = StObject.set(x, "fromComponent", value.asInstanceOf[js.Any])
      
      inline def setFromComponentUndefined: Self = StObject.set(x, "fromComponent", js.undefined)
      
      inline def setToComponent(value: dxSortable | dxDraggable): Self = StObject.set(x, "toComponent", value.asInstanceOf[js.Any])
      
      inline def setToComponentUndefined: Self = StObject.set(x, "toComponent", js.undefined)
    }
  }
  
  trait AppointmentDraggingStartEvent
    extends StObject
       with Cancelable
       with AppointmentDraggingEvent
  object AppointmentDraggingStartEvent {
    
    inline def apply(component: dxScheduler): AppointmentDraggingStartEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppointmentDraggingStartEvent]
    }
  }
  
  trait AppointmentFormOpeningEvent
    extends StObject
       with Cancelable
       with EventInfo[dxScheduler] {
    
    val appointmentData: js.UndefOr[dxSchedulerAppointment] = js.undefined
    
    val form: dxForm
    
    val popup: dxPopup[typings.devextreme.mod.DevExpress.ui.dxPopup.Properties]
  }
  object AppointmentFormOpeningEvent {
    
    inline def apply(
      component: dxScheduler,
      element: DxElement_[HTMLElement],
      form: dxForm,
      popup: dxPopup[typings.devextreme.mod.DevExpress.ui.dxPopup.Properties]
    ): AppointmentFormOpeningEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], form = form.asInstanceOf[js.Any], popup = popup.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppointmentFormOpeningEvent]
    }
    
    extension [Self <: AppointmentFormOpeningEvent](x: Self) {
      
      inline def setAppointmentData(value: dxSchedulerAppointment): Self = StObject.set(x, "appointmentData", value.asInstanceOf[js.Any])
      
      inline def setAppointmentDataUndefined: Self = StObject.set(x, "appointmentData", js.undefined)
      
      inline def setForm(value: dxForm): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      inline def setPopup(value: dxPopup[typings.devextreme.mod.DevExpress.ui.dxPopup.Properties]): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
    }
  }
  
  trait AppointmentRenderedEvent
    extends StObject
       with EventInfo[dxScheduler]
       with TargetedAppointmentInfo {
    
    val appointmentElement: DxElement_[HTMLElement]
  }
  object AppointmentRenderedEvent {
    
    inline def apply(
      appointmentData: dxSchedulerAppointment,
      appointmentElement: DxElement_[HTMLElement],
      component: dxScheduler,
      element: DxElement_[HTMLElement]
    ): AppointmentRenderedEvent = {
      val __obj = js.Dynamic.literal(appointmentData = appointmentData.asInstanceOf[js.Any], appointmentElement = appointmentElement.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppointmentRenderedEvent]
    }
    
    extension [Self <: AppointmentRenderedEvent](x: Self) {
      
      inline def setAppointmentElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "appointmentElement", value.asInstanceOf[js.Any])
    }
  }
  
  type AppointmentTemplateData = TargetedAppointmentInfo
  
  trait AppointmentTooltipShowingAppointmentInfo extends StObject {
    
    val appointmentData: Appointment
    
    val color: PromiseLike[String]
    
    val currentAppointmentData: Appointment
  }
  object AppointmentTooltipShowingAppointmentInfo {
    
    inline def apply(appointmentData: Appointment, color: PromiseLike[String], currentAppointmentData: Appointment): AppointmentTooltipShowingAppointmentInfo = {
      val __obj = js.Dynamic.literal(appointmentData = appointmentData.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], currentAppointmentData = currentAppointmentData.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppointmentTooltipShowingAppointmentInfo]
    }
    
    extension [Self <: AppointmentTooltipShowingAppointmentInfo](x: Self) {
      
      inline def setAppointmentData(value: Appointment): Self = StObject.set(x, "appointmentData", value.asInstanceOf[js.Any])
      
      inline def setColor(value: PromiseLike[String]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setCurrentAppointmentData(value: Appointment): Self = StObject.set(x, "currentAppointmentData", value.asInstanceOf[js.Any])
    }
  }
  
  trait AppointmentTooltipShowingEvent
    extends StObject
       with Cancelable
       with EventInfo[dxScheduler] {
    
    val appointments: js.Array[AppointmentTooltipShowingAppointmentInfo]
    
    val targetElement: DxElement_[HTMLElement]
  }
  object AppointmentTooltipShowingEvent {
    
    inline def apply(
      appointments: js.Array[AppointmentTooltipShowingAppointmentInfo],
      component: dxScheduler,
      element: DxElement_[HTMLElement],
      targetElement: DxElement_[HTMLElement]
    ): AppointmentTooltipShowingEvent = {
      val __obj = js.Dynamic.literal(appointments = appointments.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], targetElement = targetElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppointmentTooltipShowingEvent]
    }
    
    extension [Self <: AppointmentTooltipShowingEvent](x: Self) {
      
      inline def setAppointments(value: js.Array[AppointmentTooltipShowingAppointmentInfo]): Self = StObject.set(x, "appointments", value.asInstanceOf[js.Any])
      
      inline def setAppointmentsVarargs(value: AppointmentTooltipShowingAppointmentInfo*): Self = StObject.set(x, "appointments", js.Array(value*))
      
      inline def setTargetElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "targetElement", value.asInstanceOf[js.Any])
    }
  }
  
  trait AppointmentTooltipTemplateData
    extends StObject
       with TargetedAppointmentInfo {
    
    val isButtonClicked: Boolean
  }
  object AppointmentTooltipTemplateData {
    
    inline def apply(appointmentData: dxSchedulerAppointment, isButtonClicked: Boolean): AppointmentTooltipTemplateData = {
      val __obj = js.Dynamic.literal(appointmentData = appointmentData.asInstanceOf[js.Any], isButtonClicked = isButtonClicked.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppointmentTooltipTemplateData]
    }
    
    extension [Self <: AppointmentTooltipTemplateData](x: Self) {
      
      inline def setIsButtonClicked(value: Boolean): Self = StObject.set(x, "isButtonClicked", value.asInstanceOf[js.Any])
    }
  }
  
  trait AppointmentUpdatedEvent
    extends StObject
       with EventInfo[dxScheduler] {
    
    val appointmentData: dxSchedulerAppointment
    
    val error: js.UndefOr[js.Error] = js.undefined
  }
  object AppointmentUpdatedEvent {
    
    inline def apply(appointmentData: dxSchedulerAppointment, component: dxScheduler, element: DxElement_[HTMLElement]): AppointmentUpdatedEvent = {
      val __obj = js.Dynamic.literal(appointmentData = appointmentData.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppointmentUpdatedEvent]
    }
    
    extension [Self <: AppointmentUpdatedEvent](x: Self) {
      
      inline def setAppointmentData(value: dxSchedulerAppointment): Self = StObject.set(x, "appointmentData", value.asInstanceOf[js.Any])
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    }
  }
  
  trait AppointmentUpdatingEvent
    extends StObject
       with EventInfo[dxScheduler] {
    
    var cancel: js.UndefOr[Boolean | PromiseLike[Boolean]] = js.undefined
    
    val newData: Any
    
    val oldData: Any
  }
  object AppointmentUpdatingEvent {
    
    inline def apply(component: dxScheduler, element: DxElement_[HTMLElement], newData: Any, oldData: Any): AppointmentUpdatingEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], newData = newData.asInstanceOf[js.Any], oldData = oldData.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppointmentUpdatingEvent]
    }
    
    extension [Self <: AppointmentUpdatingEvent](x: Self) {
      
      inline def setCancel(value: Boolean | PromiseLike[Boolean]): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setNewData(value: Any): Self = StObject.set(x, "newData", value.asInstanceOf[js.Any])
      
      inline def setOldData(value: Any): Self = StObject.set(x, "oldData", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.auto
    - typings.devextreme.devextremeStrings.unlimited
  */
  trait CellAppointmentsLimit extends StObject
  object CellAppointmentsLimit {
    
    inline def auto: typings.devextreme.devextremeStrings.auto = "auto".asInstanceOf[typings.devextreme.devextremeStrings.auto]
    
    inline def unlimited: typings.devextreme.devextremeStrings.unlimited = "unlimited".asInstanceOf[typings.devextreme.devextremeStrings.unlimited]
  }
  
  trait CellClickEvent
    extends StObject
       with Cancelable
       with NativeEventInfo[dxScheduler, KeyboardEvent | MouseEvent | PointerEvent] {
    
    val cellData: Any
    
    val cellElement: DxElement_[HTMLElement]
  }
  object CellClickEvent {
    
    inline def apply(
      cellData: Any,
      cellElement: DxElement_[HTMLElement],
      component: dxScheduler,
      element: DxElement_[HTMLElement]
    ): CellClickEvent = {
      val __obj = js.Dynamic.literal(cellData = cellData.asInstanceOf[js.Any], cellElement = cellElement.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[CellClickEvent]
    }
    
    extension [Self <: CellClickEvent](x: Self) {
      
      inline def setCellData(value: Any): Self = StObject.set(x, "cellData", value.asInstanceOf[js.Any])
      
      inline def setCellElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "cellElement", value.asInstanceOf[js.Any])
    }
  }
  
  trait CellContextMenuEvent
    extends StObject
       with NativeEventInfo[dxScheduler, MouseEvent | PointerEvent | TouchEvent] {
    
    val cellData: Any
    
    val cellElement: DxElement_[HTMLElement]
  }
  object CellContextMenuEvent {
    
    inline def apply(
      cellData: Any,
      cellElement: DxElement_[HTMLElement],
      component: dxScheduler,
      element: DxElement_[HTMLElement]
    ): CellContextMenuEvent = {
      val __obj = js.Dynamic.literal(cellData = cellData.asInstanceOf[js.Any], cellElement = cellElement.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[CellContextMenuEvent]
    }
    
    extension [Self <: CellContextMenuEvent](x: Self) {
      
      inline def setCellData(value: Any): Self = StObject.set(x, "cellData", value.asInstanceOf[js.Any])
      
      inline def setCellElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "cellElement", value.asInstanceOf[js.Any])
    }
  }
  
  type ContentReadyEvent = EventInfo[dxScheduler]
  
  trait DateNavigatorTextInfo extends StObject {
    
    val endDate: js.Date
    
    val startDate: js.Date
    
    val text: String
  }
  object DateNavigatorTextInfo {
    
    inline def apply(endDate: js.Date, startDate: js.Date, text: String): DateNavigatorTextInfo = {
      val __obj = js.Dynamic.literal(endDate = endDate.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[DateNavigatorTextInfo]
    }
    
    extension [Self <: DateNavigatorTextInfo](x: Self) {
      
      inline def setEndDate(value: js.Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      inline def setStartDate(value: js.Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  type DisposingEvent = EventInfo[dxScheduler]
  
  type InitializedEvent = InitializedEventInfo[dxScheduler]
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxScheduler]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxScheduler, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  type Properties = dxSchedulerOptions
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.dialog
    - typings.devextreme.devextremeStrings.occurrence
    - typings.devextreme.devextremeStrings.series
  */
  trait RecurrenceEditMode extends StObject
  object RecurrenceEditMode {
    
    inline def dialog: typings.devextreme.devextremeStrings.dialog = "dialog".asInstanceOf[typings.devextreme.devextremeStrings.dialog]
    
    inline def occurrence: typings.devextreme.devextremeStrings.occurrence = "occurrence".asInstanceOf[typings.devextreme.devextremeStrings.occurrence]
    
    inline def series: typings.devextreme.devextremeStrings.series = "series".asInstanceOf[typings.devextreme.devextremeStrings.series]
  }
  
  /**
    * @deprecated Attention! This type is for internal purposes only. If you used it previously, please submit a ticket to our {@link https://supportcenter.devexpress.com/ticket/create Support Center}. We will check if there is an alternative solution.
    */
  trait TargetedAppointmentInfo extends StObject {
    
    val appointmentData: dxSchedulerAppointment
    
    val targetedAppointmentData: js.UndefOr[dxSchedulerAppointment] = js.undefined
  }
  object TargetedAppointmentInfo {
    
    inline def apply(appointmentData: dxSchedulerAppointment): TargetedAppointmentInfo = {
      val __obj = js.Dynamic.literal(appointmentData = appointmentData.asInstanceOf[js.Any])
      __obj.asInstanceOf[TargetedAppointmentInfo]
    }
    
    extension [Self <: TargetedAppointmentInfo](x: Self) {
      
      inline def setAppointmentData(value: dxSchedulerAppointment): Self = StObject.set(x, "appointmentData", value.asInstanceOf[js.Any])
      
      inline def setTargetedAppointmentData(value: dxSchedulerAppointment): Self = StObject.set(x, "targetedAppointmentData", value.asInstanceOf[js.Any])
      
      inline def setTargetedAppointmentDataUndefined: Self = StObject.set(x, "targetedAppointmentData", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.agenda
    - typings.devextreme.devextremeStrings.day
    - typings.devextreme.devextremeStrings.month
    - typings.devextreme.devextremeStrings.timelineDay
    - typings.devextreme.devextremeStrings.timelineMonth
    - typings.devextreme.devextremeStrings.timelineWeek
    - typings.devextreme.devextremeStrings.timelineWorkWeek
    - typings.devextreme.devextremeStrings.week
    - typings.devextreme.devextremeStrings.workWeek
  */
  trait ViewType extends StObject
  object ViewType {
    
    inline def agenda: typings.devextreme.devextremeStrings.agenda = "agenda".asInstanceOf[typings.devextreme.devextremeStrings.agenda]
    
    inline def day: typings.devextreme.devextremeStrings.day = "day".asInstanceOf[typings.devextreme.devextremeStrings.day]
    
    inline def month: typings.devextreme.devextremeStrings.month = "month".asInstanceOf[typings.devextreme.devextremeStrings.month]
    
    inline def timelineDay: typings.devextreme.devextremeStrings.timelineDay = "timelineDay".asInstanceOf[typings.devextreme.devextremeStrings.timelineDay]
    
    inline def timelineMonth: typings.devextreme.devextremeStrings.timelineMonth = "timelineMonth".asInstanceOf[typings.devextreme.devextremeStrings.timelineMonth]
    
    inline def timelineWeek: typings.devextreme.devextremeStrings.timelineWeek = "timelineWeek".asInstanceOf[typings.devextreme.devextremeStrings.timelineWeek]
    
    inline def timelineWorkWeek: typings.devextreme.devextremeStrings.timelineWorkWeek = "timelineWorkWeek".asInstanceOf[typings.devextreme.devextremeStrings.timelineWorkWeek]
    
    inline def week: typings.devextreme.devextremeStrings.week = "week".asInstanceOf[typings.devextreme.devextremeStrings.week]
    
    inline def workWeek: typings.devextreme.devextremeStrings.workWeek = "workWeek".asInstanceOf[typings.devextreme.devextremeStrings.workWeek]
  }
}
