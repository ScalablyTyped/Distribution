package typings.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Schedule
  extends StObject
     with Widget_ {
  
  /** It is used to add the resources dynamically in the scheduler. It renders the resource based on the index if it is available or else it renders this resource at end of all
    * resources.
    * @param {any} Resource object which can be defined with all the available options of resources.
    * @param {string} Defines the name of the resource collection to which this object needs to be added.
    * @param {number} It is optional. If it is available, this render the resource at the given specified index location. Else render at end of the all resources.
    * @returns {void}
    */
  def addResource(resourceObject: Any, name: String, index: Double): Unit = js.native
  
  var defaults: Model = js.native
  
  /** This method is used to delete the appointment based on the guid value or the appointment data passed to it.
    * @param {string|any} GUID value of an appointment element or an appointment object
    * @returns {void}
    */
  def deleteAppointment(data: String): Unit = js.native
  def deleteAppointment(data: Any): Unit = js.native
  
  /** Exports the appointments from the Schedule control.
    * @param {string} It refers the controller action name to redirect. (For MVC)
    * @param {string} It refers the server event name.(For ASP)
    * @param {string|number} Pass the id of an appointment, in case if a single appointment needs to be exported. Otherwise, it takes the null value.
    * @returns {void}
    */
  def exportSchedule(action: String, serverEvent: String, id: String): Unit = js.native
  def exportSchedule(action: String, serverEvent: String, id: Double): Unit = js.native
  
  /** Exports the appointments from the Schedule control and saves it in a Excel file.
    * @param {string} It refers the controller action name to redirect. (For MVC)
    * @param {string} It refers the server event name.(For ASP)
    * @param {boolean} Indicates whether to export all the appointments including or excluding the individual occurrences of the recurrence appointments.
    * @returns {void}
    */
  def exportToExcel(action: String, serverEvent: String, `type`: Boolean): Unit = js.native
  
  /** Searches and filters the appointments from appointment list of Schedule control.
    * @param {any[]} Holds array of one or more conditional objects for filtering the appointments based on it.
    * @returns {any[]}
    */
  def filterAppointments(filterConditions: js.Array[Any]): js.Array[Any] = js.native
  
  /** Gets the complete appointment list of Schedule control.
    * @returns {any[]}
    */
  def getAppointments(): js.Array[Any] = js.native
  
  /** Generate the recurrence rule as a string, based on the repeat options selected.
    * @returns {string}
    */
  def getRecurrenceRule(): String = js.native
  
  /** Retrieves the time slot information (start/end time and resource details) of the given element. The parameter is optional - as when no element is passed to it, the currently
    * selected cell information will be retrieved. When multiple cells are selected in the Scheduler, it is not necessary to provide the parameter.
    * @param {any} TD element object rendered as Scheduler work cell
    * @returns {any}
    */
  def getSlotByElement(element: Any): Any = js.native
  
  @JSName("model")
  var model_Schedule: Model = js.native
  
  /** Passes the server-side action and data to the client-side for rendering the modified appointment list on the Schedule control.
    * @returns {void}
    */
  def notifyChanges(): Unit = js.native
  
  /** Prints the entire Scheduler or a single appointment based on the appointment data passed as an argument to it. Simply calling the print() method, without passing any argument will
    * print the entire Scheduler.
    * @param {any} Either accepts no arguments at all or else accepts an appointment object.
    * @returns {void}
    */
  def print(data: Any): Unit = js.native
  
  /** Refreshes the entire Schedule control.
    * @returns {void}
    */
  def refresh(): Unit = js.native
  
  /** Refreshes only the appointment elements within the Schedule control.
    * @returns {void}
    */
  def refreshAppointments(): Unit = js.native
  
  /** Refreshes the Scroller of Scheduler while using it within some other controls or application.
    * @returns {void}
    */
  def refreshScroller(): Unit = js.native
  
  /** It is used to remove the resources dynamically from the scheduler. It removed the resource based on the resource id with the given resource collection name.
    * @param {string|number} Defines the Id of the resource.
    * @param {string} Defines the name of the resource collection which this resource id belongs.
    * @returns {void}
    */
  def removeResource(resourceId: String, name: String): Unit = js.native
  def removeResource(resourceId: Double, name: String): Unit = js.native
  
  /** It is used to save the appointment. The appointment object is based on the argument passed to this method.
    * @param {any} appointment object which includes appointment details
    * @returns {void}
    */
  def saveAppointment(appointmentObject: Any): Unit = js.native
  
  def searchAppointments(searchString: String, field: String, operator: String, ignoreCase: Boolean): js.Array[Any] = js.native
  def searchAppointments(searchString: String, field: String, operator: FilterOperators, ignoreCase: Boolean): js.Array[Any] = js.native
  def searchAppointments(searchString: Any, field: String, operator: String, ignoreCase: Boolean): js.Array[Any] = js.native
  /** Searches the appointments from the appointment list of Schedule control based on the provided search string in its argument list.
    * @param {any|string} Defines the search word or the filter condition, based on which the appointments are filtered from the list.
    * @param {string} Defines the field name on which the search is to be made.
    * @param {ej.FilterOperators|string} Defines the filterOperator value for the search operation.
    * @param {boolean} Defines the ignoreCase value for performing the search operation.
    * @returns {any[]}
    */
  def searchAppointments(searchString: Any, field: String, operator: FilterOperators, ignoreCase: Boolean): js.Array[Any] = js.native
}
object Schedule {
  
  @js.native
  sealed trait CurrentView extends StObject
  @JSGlobal("ej.Schedule.CurrentView")
  @js.native
  object CurrentView extends StObject {
    
    ///Sets currentView of the Scheduler as Agenda
    @js.native
    sealed trait Agenda
      extends StObject
         with CurrentView
    
    ///Sets currentView of the Scheduler as CustomView with user-specified date range.
    @js.native
    sealed trait CustomView
      extends StObject
         with CurrentView
    
    ///Sets currentView of the Scheduler as Day
    @js.native
    sealed trait Day
      extends StObject
         with CurrentView
    
    ///Sets currentView of the Scheduler as Month
    @js.native
    sealed trait Month
      extends StObject
         with CurrentView
    
    ///Sets currentView of the Scheduler as Week
    @js.native
    sealed trait Week
      extends StObject
         with CurrentView
    
    ///Sets currentView of the Scheduler as WorkWeek
    @js.native
    sealed trait Workweek
      extends StObject
         with CurrentView
  }
  
  @js.native
  sealed trait Orientation extends StObject
  @JSGlobal("ej.Schedule.Orientation")
  @js.native
  object Orientation extends StObject {
    
    ///Set orientation as horizontal to Scheduler
    @js.native
    sealed trait Horizontal
      extends StObject
         with typings.ejWebAll.ej.Schedule.Orientation
    
    ///Set orientation as vertical to Scheduler
    @js.native
    sealed trait Vertical
      extends StObject
         with typings.ejWebAll.ej.Schedule.Orientation
  }
  
  @js.native
  sealed trait TimeMode extends StObject
  @JSGlobal("ej.Schedule.TimeMode")
  @js.native
  object TimeMode extends StObject {
    
    ///Sets 12 hour time mode to Scheduler
    @js.native
    sealed trait Hour12
      extends StObject
         with TimeMode
    
    ///Sets 24 hour time mode to Scheduler
    @js.native
    sealed trait Hour24
      extends StObject
         with TimeMode
  }
  
  trait ActionBeginEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the name of the CRUD action performed.
      */
    var currentAction: js.UndefOr[String] = js.undefined
    
    /** Returns the data about the view change action.
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Returns the GUid of appointment.
      */
    var id: js.UndefOr[String] = js.undefined
    
    /** Returns the Schedule model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Returns the action begin request type.
      */
    var requestType: js.UndefOr[String] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ActionBeginEventArgs {
    
    inline def apply(): ActionBeginEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActionBeginEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ActionBeginEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setCurrentAction(value: String): Self = StObject.set(x, "currentAction", value.asInstanceOf[js.Any])
      
      inline def setCurrentActionUndefined: Self = StObject.set(x, "currentAction", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setRequestType(value: String): Self = StObject.set(x, "requestType", value.asInstanceOf[js.Any])
      
      inline def setRequestTypeUndefined: Self = StObject.set(x, "requestType", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ActionCompleteEventArgs extends StObject {
    
    /** Returns the appointment data dropped.
      */
    var appointment: js.UndefOr[Any] = js.undefined
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the name of the CRUD action performed.
      */
    var currentAction: js.UndefOr[String] = js.undefined
    
    /** Returns the data about view change action.
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Returns the Schedule model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Returns the action complete request type.
      */
    var requestType: js.UndefOr[String] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ActionCompleteEventArgs {
    
    inline def apply(): ActionCompleteEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActionCompleteEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ActionCompleteEventArgs] (val x: Self) extends AnyVal {
      
      inline def setAppointment(value: Any): Self = StObject.set(x, "appointment", value.asInstanceOf[js.Any])
      
      inline def setAppointmentUndefined: Self = StObject.set(x, "appointment", js.undefined)
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setCurrentAction(value: String): Self = StObject.set(x, "currentAction", value.asInstanceOf[js.Any])
      
      inline def setCurrentActionUndefined: Self = StObject.set(x, "currentAction", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setRequestType(value: String): Self = StObject.set(x, "requestType", value.asInstanceOf[js.Any])
      
      inline def setRequestTypeUndefined: Self = StObject.set(x, "requestType", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait AgendaViewSettings extends StObject {
    
    /** You can customize the Date column display based on the requirement.
      * @Default {null}
      */
    var dateColumnTemplateId: js.UndefOr[String] = js.undefined
    
    /** You can display the summary of multiple week's appointment by setting this value.
      * @Default {7}
      */
    var daysInAgenda: js.UndefOr[Double] = js.undefined
    
    /** You can customize the time column display based on the requirement.
      * @Default {null}
      */
    var timeColumnTemplateId: js.UndefOr[String] = js.undefined
  }
  object AgendaViewSettings {
    
    inline def apply(): AgendaViewSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AgendaViewSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AgendaViewSettings] (val x: Self) extends AnyVal {
      
      inline def setDateColumnTemplateId(value: String): Self = StObject.set(x, "dateColumnTemplateId", value.asInstanceOf[js.Any])
      
      inline def setDateColumnTemplateIdUndefined: Self = StObject.set(x, "dateColumnTemplateId", js.undefined)
      
      inline def setDaysInAgenda(value: Double): Self = StObject.set(x, "daysInAgenda", value.asInstanceOf[js.Any])
      
      inline def setDaysInAgendaUndefined: Self = StObject.set(x, "daysInAgenda", js.undefined)
      
      inline def setTimeColumnTemplateId(value: String): Self = StObject.set(x, "timeColumnTemplateId", value.asInstanceOf[js.Any])
      
      inline def setTimeColumnTemplateIdUndefined: Self = StObject.set(x, "timeColumnTemplateId", js.undefined)
    }
  }
  
  trait AppointmentChangedEventArgs extends StObject {
    
    /** Returns the edited appointment object.
      */
    var appointment: js.UndefOr[Any] = js.undefined
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the name of the CRUD action performed.
      */
    var currentAction: js.UndefOr[String] = js.undefined
    
    /** Returns the Schedule model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Returns the name of the Scheduler event.
      */
    var requestType: js.UndefOr[String] = js.undefined
    
    /** Returns the name of the Scheduler event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object AppointmentChangedEventArgs {
    
    inline def apply(): AppointmentChangedEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AppointmentChangedEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AppointmentChangedEventArgs] (val x: Self) extends AnyVal {
      
      inline def setAppointment(value: Any): Self = StObject.set(x, "appointment", value.asInstanceOf[js.Any])
      
      inline def setAppointmentUndefined: Self = StObject.set(x, "appointment", js.undefined)
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setCurrentAction(value: String): Self = StObject.set(x, "currentAction", value.asInstanceOf[js.Any])
      
      inline def setCurrentActionUndefined: Self = StObject.set(x, "currentAction", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setRequestType(value: String): Self = StObject.set(x, "requestType", value.asInstanceOf[js.Any])
      
      inline def setRequestTypeUndefined: Self = StObject.set(x, "requestType", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait AppointmentClickEventArgs extends StObject {
    
    /** Returns the clicked appointment object.
      */
    var appointment: js.UndefOr[Any] = js.undefined
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the Schedule model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Returns the object of appointmentClick event.
      */
    var `object`: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object AppointmentClickEventArgs {
    
    inline def apply(): AppointmentClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AppointmentClickEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AppointmentClickEventArgs] (val x: Self) extends AnyVal {
      
      inline def setAppointment(value: Any): Self = StObject.set(x, "appointment", value.asInstanceOf[js.Any])
      
      inline def setAppointmentUndefined: Self = StObject.set(x, "appointment", js.undefined)
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setObject(value: Any): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait AppointmentCreatedEventArgs extends StObject {
    
    /** Returns the appointment object.
      */
    var appointment: js.UndefOr[Any] = js.undefined
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the Schedule model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Returns the name of the Scheduler event.
      */
    var requestType: js.UndefOr[String] = js.undefined
    
    /** Returns the name of the Scheduler event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object AppointmentCreatedEventArgs {
    
    inline def apply(): AppointmentCreatedEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AppointmentCreatedEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AppointmentCreatedEventArgs] (val x: Self) extends AnyVal {
      
      inline def setAppointment(value: Any): Self = StObject.set(x, "appointment", value.asInstanceOf[js.Any])
      
      inline def setAppointmentUndefined: Self = StObject.set(x, "appointment", js.undefined)
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setRequestType(value: String): Self = StObject.set(x, "requestType", value.asInstanceOf[js.Any])
      
      inline def setRequestTypeUndefined: Self = StObject.set(x, "requestType", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait AppointmentHoverEventArgs extends StObject {
    
    /** Returns the hovered appointment object.
      */
    var appointment: js.UndefOr[Any] = js.undefined
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the Schedule model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Returns the object of appointmentHover event.
      */
    var `object`: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object AppointmentHoverEventArgs {
    
    inline def apply(): AppointmentHoverEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AppointmentHoverEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AppointmentHoverEventArgs] (val x: Self) extends AnyVal {
      
      inline def setAppointment(value: Any): Self = StObject.set(x, "appointment", value.asInstanceOf[js.Any])
      
      inline def setAppointmentUndefined: Self = StObject.set(x, "appointment", js.undefined)
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setObject(value: Any): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait AppointmentRemovedEventArgs extends StObject {
    
    /** Returns the deleted appointment object.
      */
    var appointment: js.UndefOr[Any] = js.undefined
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the name of the CRDU action performed.
      */
    var currentAction: js.UndefOr[String] = js.undefined
    
    /** Returns the Schedule model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Returns the name of the Scheduler event.
      */
    var requestType: js.UndefOr[String] = js.undefined
    
    /** Returns the name of the Scheduler event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object AppointmentRemovedEventArgs {
    
    inline def apply(): AppointmentRemovedEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AppointmentRemovedEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AppointmentRemovedEventArgs] (val x: Self) extends AnyVal {
      
      inline def setAppointment(value: Any): Self = StObject.set(x, "appointment", value.asInstanceOf[js.Any])
      
      inline def setAppointmentUndefined: Self = StObject.set(x, "appointment", js.undefined)
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setCurrentAction(value: String): Self = StObject.set(x, "currentAction", value.asInstanceOf[js.Any])
      
      inline def setCurrentActionUndefined: Self = StObject.set(x, "currentAction", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setRequestType(value: String): Self = StObject.set(x, "requestType", value.asInstanceOf[js.Any])
      
      inline def setRequestTypeUndefined: Self = StObject.set(x, "requestType", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait AppointmentSettings extends StObject {
    
    /** Binds the name of allDay field in dataSource. It indicates whether the appointment is an all-day appointment or not.
      * @Default {null}
      */
    var allDay: js.UndefOr[String] = js.undefined
    
    /** When set to false, doesn't consider the time difference offset calculation on appointment time.
      * @Default {true}
      */
    var applyTimeOffset: js.UndefOr[Boolean] = js.undefined
    
    /** Binds the name of categorize field in dataSource. It indicates the categorize value, red categorize, green, yellow and so on applied to the appointments.
      * @Default {null}
      */
    var categorize: js.UndefOr[String] = js.undefined
    
    /** The dataSource option accepts either JSON object collection or DataManager (ej.DataManager) instance that contains Schedule appointments.
      * @Default {[]}
      */
    var dataSource: js.UndefOr[Any | js.Array[Any]] = js.undefined
    
    /** Binds the description field name in dataSource. It indicates the appointment description.
      * @Default {null}
      */
    var description: js.UndefOr[String] = js.undefined
    
    /** When set to true, introduces a new option to edit only the future occurrences of the appointments in a recurrence series from the currently selected appointment's date.
      * @Default {false}
      */
    var editFutureEventsOnly: js.UndefOr[Boolean] = js.undefined
    
    /** Binds the name of endTime field in dataSource with the end time of Schedule appointments. It indicates the date and time when Schedule appointment actually ends.
      * @Default {null}
      */
    var endTime: js.UndefOr[String] = js.undefined
    
    /** Binds the name of end timezone field in dataSource. It indicates the timezone of appointment end date. When the endTimeZone field is not mentioned, the appointment uses the
      * Schedule timeZone or System timeZone.
      * @Default {null}
      */
    var endTimeZone: js.UndefOr[String] = js.undefined
    
    /** Binds the id field name in dataSource to the id of Schedule appointments. It denotes the unique id assigned to appointments.
      * @Default {null}
      */
    var id: js.UndefOr[String] = js.undefined
    
    /** Binds the name of location field in dataSource. It indicates the appointment location.
      * @Default {null}
      */
    var location: js.UndefOr[String] = js.undefined
    
    /** Binds the name of the priority field in dataSource. It indicates the priority, high, low, medium and none of the appointments.
      * @Default {null}
      */
    var priority: js.UndefOr[String] = js.undefined
    
    /** It holds either the ej.Query() object or simply the query string that retrieves the specified records from the table.
      * @Default {null}
      */
    var query: js.UndefOr[String] = js.undefined
    
    /** Binds the name of recurrence field in dataSource. It indicates whether the appointment is a recurrence appointment or not.
      * @Default {null}
      */
    var recurrence: js.UndefOr[String] = js.undefined
    
    /** Binds the name of recurrenceRule field in dataSource. It indicates the recurrence pattern associated with appointments.
      * @Default {null}
      */
    var recurrenceRule: js.UndefOr[String] = js.undefined
    
    /** Binds one or more fields in resource collection dataSource. It maps the resource field names with appointments denoting the resource of appointments actually belongs.
      * @Default {null}
      */
    var resourceFields: js.UndefOr[String] = js.undefined
    
    /** Binds the name of startTime field in the dataSource with start time of the Schedule appointments. It indicates the date and Time when Schedule appointment actually starts.
      * @Default {null}
      */
    var startTime: js.UndefOr[String] = js.undefined
    
    /** Binds the name of start timezone field in dataSource. It indicates the timezone of appointment start date. When startTimeZone field is not mentioned, the appointment uses the
      * Schedule timeZone or System timeZone.
      * @Default {null}
      */
    var startTimeZone: js.UndefOr[String] = js.undefined
    
    /** Binds the name of subject field in the dataSource to appointment Subject. Indicates the Subject or title that gets displayed on Schedule appointments.
      * @Default {null}
      */
    var subject: js.UndefOr[String] = js.undefined
    
    /** Assign the table name from where the records are to be fetched for the Schedule.
      * @Default {null}
      */
    var tableName: js.UndefOr[String] = js.undefined
  }
  object AppointmentSettings {
    
    inline def apply(): AppointmentSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AppointmentSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AppointmentSettings] (val x: Self) extends AnyVal {
      
      inline def setAllDay(value: String): Self = StObject.set(x, "allDay", value.asInstanceOf[js.Any])
      
      inline def setAllDayUndefined: Self = StObject.set(x, "allDay", js.undefined)
      
      inline def setApplyTimeOffset(value: Boolean): Self = StObject.set(x, "applyTimeOffset", value.asInstanceOf[js.Any])
      
      inline def setApplyTimeOffsetUndefined: Self = StObject.set(x, "applyTimeOffset", js.undefined)
      
      inline def setCategorize(value: String): Self = StObject.set(x, "categorize", value.asInstanceOf[js.Any])
      
      inline def setCategorizeUndefined: Self = StObject.set(x, "categorize", js.undefined)
      
      inline def setDataSource(value: Any | js.Array[Any]): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
      
      inline def setDataSourceVarargs(value: Any*): Self = StObject.set(x, "dataSource", js.Array(value*))
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setEditFutureEventsOnly(value: Boolean): Self = StObject.set(x, "editFutureEventsOnly", value.asInstanceOf[js.Any])
      
      inline def setEditFutureEventsOnlyUndefined: Self = StObject.set(x, "editFutureEventsOnly", js.undefined)
      
      inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
      
      inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
      
      inline def setEndTimeZone(value: String): Self = StObject.set(x, "endTimeZone", value.asInstanceOf[js.Any])
      
      inline def setEndTimeZoneUndefined: Self = StObject.set(x, "endTimeZone", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      inline def setPriority(value: String): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setRecurrence(value: String): Self = StObject.set(x, "recurrence", value.asInstanceOf[js.Any])
      
      inline def setRecurrenceRule(value: String): Self = StObject.set(x, "recurrenceRule", value.asInstanceOf[js.Any])
      
      inline def setRecurrenceRuleUndefined: Self = StObject.set(x, "recurrenceRule", js.undefined)
      
      inline def setRecurrenceUndefined: Self = StObject.set(x, "recurrence", js.undefined)
      
      inline def setResourceFields(value: String): Self = StObject.set(x, "resourceFields", value.asInstanceOf[js.Any])
      
      inline def setResourceFieldsUndefined: Self = StObject.set(x, "resourceFields", js.undefined)
      
      inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
      
      inline def setStartTimeZone(value: String): Self = StObject.set(x, "startTimeZone", value.asInstanceOf[js.Any])
      
      inline def setStartTimeZoneUndefined: Self = StObject.set(x, "startTimeZone", js.undefined)
      
      inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
      
      inline def setTableName(value: String): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
      
      inline def setTableNameUndefined: Self = StObject.set(x, "tableName", js.undefined)
    }
  }
  
  trait AppointmentWindowOpenEventArgs extends StObject {
    
    /** Returns the edit appointment object.
      */
    var appointment: js.UndefOr[Any] = js.undefined
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the edit occurrence option value.
      */
    var edit: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the end time of the double clicked cell.
      */
    var endTime: js.UndefOr[Any] = js.undefined
    
    /** Returns the Schedule model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the object of appointmentWindowOpen event while selecting the detail option from quick window or edit appointment or edit series option.
      */
    var `object`: js.UndefOr[Any] = js.undefined
    
    /** Returns the action name that triggers window open.
      */
    var originalEventType: js.UndefOr[String] = js.undefined
    
    /** Returns the start time of the double clicked cell.
      */
    var startTime: js.UndefOr[Any] = js.undefined
    
    /** Returns the target of the double clicked cell.
      */
    var target: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object AppointmentWindowOpenEventArgs {
    
    inline def apply(): AppointmentWindowOpenEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AppointmentWindowOpenEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AppointmentWindowOpenEventArgs] (val x: Self) extends AnyVal {
      
      inline def setAppointment(value: Any): Self = StObject.set(x, "appointment", value.asInstanceOf[js.Any])
      
      inline def setAppointmentUndefined: Self = StObject.set(x, "appointment", js.undefined)
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setEdit(value: Boolean): Self = StObject.set(x, "edit", value.asInstanceOf[js.Any])
      
      inline def setEditUndefined: Self = StObject.set(x, "edit", js.undefined)
      
      inline def setEndTime(value: Any): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
      
      inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setObject(value: Any): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
      
      inline def setOriginalEventType(value: String): Self = StObject.set(x, "originalEventType", value.asInstanceOf[js.Any])
      
      inline def setOriginalEventTypeUndefined: Self = StObject.set(x, "originalEventType", js.undefined)
      
      inline def setStartTime(value: Any): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
      
      inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait BeforeAppointmentChangeEventArgs extends StObject {
    
    /** Returns the edited appointment object.
      */
    var appointment: js.UndefOr[Any] = js.undefined
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the name of the CRUD action performed.
      */
    var currentAction: js.UndefOr[String] = js.undefined
    
    /** Returns the Schedule model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Returns the name of the Scheduler event.
      */
    var requestType: js.UndefOr[String] = js.undefined
    
    /** Returns the name of the Scheduler event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object BeforeAppointmentChangeEventArgs {
    
    inline def apply(): BeforeAppointmentChangeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeAppointmentChangeEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BeforeAppointmentChangeEventArgs] (val x: Self) extends AnyVal {
      
      inline def setAppointment(value: Any): Self = StObject.set(x, "appointment", value.asInstanceOf[js.Any])
      
      inline def setAppointmentUndefined: Self = StObject.set(x, "appointment", js.undefined)
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setCurrentAction(value: String): Self = StObject.set(x, "currentAction", value.asInstanceOf[js.Any])
      
      inline def setCurrentActionUndefined: Self = StObject.set(x, "currentAction", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setRequestType(value: String): Self = StObject.set(x, "requestType", value.asInstanceOf[js.Any])
      
      inline def setRequestTypeUndefined: Self = StObject.set(x, "requestType", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait BeforeAppointmentCreateEventArgs extends StObject {
    
    /** Returns the appointment object.
      */
    var appointment: js.UndefOr[Any] = js.undefined
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the Schedule model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Returns the name of the Scheduler event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object BeforeAppointmentCreateEventArgs {
    
    inline def apply(): BeforeAppointmentCreateEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeAppointmentCreateEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BeforeAppointmentCreateEventArgs] (val x: Self) extends AnyVal {
      
      inline def setAppointment(value: Any): Self = StObject.set(x, "appointment", value.asInstanceOf[js.Any])
      
      inline def setAppointmentUndefined: Self = StObject.set(x, "appointment", js.undefined)
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait BeforeAppointmentRemoveEventArgs extends StObject {
    
    /** Returns the deleted appointment object.
      */
    var appointment: js.UndefOr[Any] = js.undefined
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the name of the CRUD action performed.
      */
    var currentAction: js.UndefOr[String] = js.undefined
    
    /** Returns the Schedule model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Returns the name of the Scheduler event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object BeforeAppointmentRemoveEventArgs {
    
    inline def apply(): BeforeAppointmentRemoveEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeAppointmentRemoveEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BeforeAppointmentRemoveEventArgs] (val x: Self) extends AnyVal {
      
      inline def setAppointment(value: Any): Self = StObject.set(x, "appointment", value.asInstanceOf[js.Any])
      
      inline def setAppointmentUndefined: Self = StObject.set(x, "appointment", js.undefined)
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setCurrentAction(value: String): Self = StObject.set(x, "currentAction", value.asInstanceOf[js.Any])
      
      inline def setCurrentActionUndefined: Self = StObject.set(x, "currentAction", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait BeforeContextMenuOpenEventArgs extends StObject {
    
    /** Returns the current appointment details while opening the menu from appointment.
      */
    var appointment: js.UndefOr[Any] = js.undefined
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the current cell index value.
      */
    var cellIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns the current date value.
      */
    var currentDate: js.UndefOr[Any] = js.undefined
    
    /** Returns the object of before opening menu target.
      */
    var events: js.UndefOr[Any] = js.undefined
    
    /** Returns the Schedule model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Returns the object of beforeContextMenuOpen event.
      */
    var `object`: js.UndefOr[Any] = js.undefined
    
    /** Returns the current resource details, when multiple resources are present, otherwise returns null.
      */
    var resources: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object BeforeContextMenuOpenEventArgs {
    
    inline def apply(): BeforeContextMenuOpenEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeContextMenuOpenEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BeforeContextMenuOpenEventArgs] (val x: Self) extends AnyVal {
      
      inline def setAppointment(value: Any): Self = StObject.set(x, "appointment", value.asInstanceOf[js.Any])
      
      inline def setAppointmentUndefined: Self = StObject.set(x, "appointment", js.undefined)
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setCellIndex(value: Double): Self = StObject.set(x, "cellIndex", value.asInstanceOf[js.Any])
      
      inline def setCellIndexUndefined: Self = StObject.set(x, "cellIndex", js.undefined)
      
      inline def setCurrentDate(value: Any): Self = StObject.set(x, "currentDate", value.asInstanceOf[js.Any])
      
      inline def setCurrentDateUndefined: Self = StObject.set(x, "currentDate", js.undefined)
      
      inline def setEvents(value: Any): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setObject(value: Any): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
      
      inline def setResources(value: Any): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
      
      inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait BlockoutSettings extends StObject {
    
    /** Binds the name of customStyle field in dataSource. It applies the custom CSS to the block intervals.
      * @Default {null}
      */
    var customStyle: js.UndefOr[String] = js.undefined
    
    /** The dataSource option accepts either JSON object collection or DataManager (ej.DataManager) instance that contains Schedule block intervals.
      * @Default {[]}
      */
    var dataSource: js.UndefOr[Any | js.Array[Any]] = js.undefined
    
    /** When set to true, enables the blockout option to be applied on the Scheduler cells.
      * @Default {false}
      */
    var enable: js.UndefOr[Boolean] = js.undefined
    
    /** Binds the name of endTime field in dataSource with the end time of block time interval. It indicates the date and time, when the block interval actually ends in the Scheduler.
      * @Default {null}
      */
    var endTime: js.UndefOr[String] = js.undefined
    
    /** Binds the name of groupId field in dataSource. Specifies the id of the resource group, to which the time intervals are needed to be blocked.
      * @Default {null}
      */
    var groupId: js.UndefOr[String] = js.undefined
    
    /** Binds the id field name in dataSource to the id of block time interval. It denotes the unique id assigned to each of the block records.
      * @Default {null}
      */
    var id: js.UndefOr[String] = js.undefined
    
    /** Binds the name of isAllDay field in dataSource. It indicates whether an entire day is blocked or not.
      * @Default {null}
      */
    var isAllDay: js.UndefOr[String] = js.undefined
    
    /** Binds the name of isBlockAppointment field in dataSource. When set to true, disables the appointments that lies on the blocked area and restrict to perform CRUD operations in it.
      * @Default {null}
      */
    var isBlockAppointment: js.UndefOr[String] = js.undefined
    
    /** It holds either the ej.Query() object or simply the query string that retrieves the specified records from the table.
      * @Default {null}
      */
    var query: js.UndefOr[String] = js.undefined
    
    /** Binds the name of resourceId field in dataSource. Specifies the id of the resources, to which the time intervals are needed to be blocked.
      * @Default {null}
      */
    var resourceId: js.UndefOr[String] = js.undefined
    
    /** Binds the name of startTime field in the dataSource with start time of block time interval. It indicates the date and time, when the block interval actually starts in the
      * Scheduler.
      * @Default {null}
      */
    var startTime: js.UndefOr[String] = js.undefined
    
    /** Binds the name of subject field in the dataSource to block time Subject. Indicates the Subject or title that gets displayed on the Schedule block intervals.
      * @Default {null}
      */
    var subject: js.UndefOr[String] = js.undefined
    
    /** Assign the table name from where the records are to be fetched for the Schedule.
      * @Default {null}
      */
    var tableName: js.UndefOr[String] = js.undefined
    
    /** Template design that applies on the Schedule block intervals. All the field names that are mapped from dataSource to the appropriate field properties within the blockoutSettings
      * can be used within the template.
      * @Default {null}
      */
    var templateId: js.UndefOr[String] = js.undefined
  }
  object BlockoutSettings {
    
    inline def apply(): BlockoutSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BlockoutSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BlockoutSettings] (val x: Self) extends AnyVal {
      
      inline def setCustomStyle(value: String): Self = StObject.set(x, "customStyle", value.asInstanceOf[js.Any])
      
      inline def setCustomStyleUndefined: Self = StObject.set(x, "customStyle", js.undefined)
      
      inline def setDataSource(value: Any | js.Array[Any]): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
      
      inline def setDataSourceVarargs(value: Any*): Self = StObject.set(x, "dataSource", js.Array(value*))
      
      inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
      
      inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
      
      inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
      
      inline def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
      
      inline def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIsAllDay(value: String): Self = StObject.set(x, "isAllDay", value.asInstanceOf[js.Any])
      
      inline def setIsAllDayUndefined: Self = StObject.set(x, "isAllDay", js.undefined)
      
      inline def setIsBlockAppointment(value: String): Self = StObject.set(x, "isBlockAppointment", value.asInstanceOf[js.Any])
      
      inline def setIsBlockAppointmentUndefined: Self = StObject.set(x, "isBlockAppointment", js.undefined)
      
      inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setResourceId(value: String): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
      
      inline def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
      
      inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
      
      inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
      
      inline def setTableName(value: String): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
      
      inline def setTableNameUndefined: Self = StObject.set(x, "tableName", js.undefined)
      
      inline def setTemplateId(value: String): Self = StObject.set(x, "templateId", value.asInstanceOf[js.Any])
      
      inline def setTemplateIdUndefined: Self = StObject.set(x, "templateId", js.undefined)
    }
  }
  
  trait CategorizeSettings extends StObject {
    
    /** When set to true, enables the multiple selection of categories to be applied for the appointments.
      * @Default {false}
      */
    var allowMultiple: js.UndefOr[Boolean] = js.undefined
    
    /** Binds color field name in the dataSource to category color.
      * @Default {color}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** The dataSource option accepts either the JSON object collection or DataManager [ej.DataManager] instance that contains the categorize data.
      */
    var dataSource: js.UndefOr[js.Array[Any] | Any] = js.undefined
    
    /** When set to true, enables the categories option to be applied for the appointments.
      * @Default {false}
      */
    var enable: js.UndefOr[Boolean] = js.undefined
    
    /** Binds fontColor field name in the dataSource to category font.
      * @Default {fontColor}
      */
    var fontColor: js.UndefOr[String] = js.undefined
    
    /** Binds id field name in the dataSource to id of category data.
      * @Default {id}
      */
    var id: js.UndefOr[String] = js.undefined
    
    /** Binds text field name in the dataSource to category text.
      * @Default {text}
      */
    var text: js.UndefOr[String] = js.undefined
  }
  object CategorizeSettings {
    
    inline def apply(): CategorizeSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CategorizeSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CategorizeSettings] (val x: Self) extends AnyVal {
      
      inline def setAllowMultiple(value: Boolean): Self = StObject.set(x, "allowMultiple", value.asInstanceOf[js.Any])
      
      inline def setAllowMultipleUndefined: Self = StObject.set(x, "allowMultiple", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDataSource(value: js.Array[Any] | Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
      
      inline def setDataSourceVarargs(value: Any*): Self = StObject.set(x, "dataSource", js.Array(value*))
      
      inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
      
      inline def setFontColor(value: String): Self = StObject.set(x, "fontColor", value.asInstanceOf[js.Any])
      
      inline def setFontColorUndefined: Self = StObject.set(x, "fontColor", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  trait CellClickEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the index of the cell.
      */
    var cellIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns the end time of the clicked cell.
      */
    var endTime: js.UndefOr[Any] = js.undefined
    
    /** Returns the Schedule model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Returns day, date and time information.
      */
    var quickString: js.UndefOr[String] = js.undefined
    
    /** Returns the object of the resource.
      */
    var resources: js.UndefOr[Any] = js.undefined
    
    /** Returns the start time of the clicked cell.
      */
    var startTime: js.UndefOr[Any] = js.undefined
    
    /** Returns the target of the clicked cell.
      */
    var target: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object CellClickEventArgs {
    
    inline def apply(): CellClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CellClickEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CellClickEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setCellIndex(value: Double): Self = StObject.set(x, "cellIndex", value.asInstanceOf[js.Any])
      
      inline def setCellIndexUndefined: Self = StObject.set(x, "cellIndex", js.undefined)
      
      inline def setEndTime(value: Any): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
      
      inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setQuickString(value: String): Self = StObject.set(x, "quickString", value.asInstanceOf[js.Any])
      
      inline def setQuickStringUndefined: Self = StObject.set(x, "quickString", js.undefined)
      
      inline def setResources(value: Any): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
      
      inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
      
      inline def setStartTime(value: Any): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
      
      inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait CellDoubleClickEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the end time of the double clicked cell.
      */
    var endTime: js.UndefOr[Any] = js.undefined
    
    /** Returns the Schedule model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Returns the object of the resource.
      */
    var resources: js.UndefOr[Any] = js.undefined
    
    /** Returns the start time of the double clicked cell.
      */
    var startTime: js.UndefOr[Any] = js.undefined
    
    /** Returns the target of the double clicked cell.
      */
    var target: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object CellDoubleClickEventArgs {
    
    inline def apply(): CellDoubleClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CellDoubleClickEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CellDoubleClickEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setEndTime(value: Any): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
      
      inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setResources(value: Any): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
      
      inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
      
      inline def setStartTime(value: Any): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
      
      inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait CellHoverEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the index of the hovered cell.
      */
    var cellIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns the end time of the clicked cell.
      */
    var endTime: js.UndefOr[Any] = js.undefined
    
    /** Returns the Schedule model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Returns the object of the resource.
      */
    var resources: js.UndefOr[Any] = js.undefined
    
    /** Returns the start time of the clicked cell.
      */
    var startTime: js.UndefOr[Any] = js.undefined
    
    /** Returns the target of the clicked cell.
      */
    var target: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object CellHoverEventArgs {
    
    inline def apply(): CellHoverEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CellHoverEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CellHoverEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setCellIndex(value: Double): Self = StObject.set(x, "cellIndex", value.asInstanceOf[js.Any])
      
      inline def setCellIndexUndefined: Self = StObject.set(x, "cellIndex", js.undefined)
      
      inline def setEndTime(value: Any): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
      
      inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setResources(value: Any): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
      
      inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
      
      inline def setStartTime(value: Any): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
      
      inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ContextMenuSettings extends StObject {
    
    /** When set to true, enables the context menu options available for the Schedule cells and appointments.
      * @Default {false}
      */
    var enable: js.UndefOr[Boolean] = js.undefined
    
    /** Contains all the default context menu options that are applicable for both Schedule cells and appointments. It also supports adding custom menu items to cells or appointment
      * collection.
      */
    var menuItems: js.UndefOr[ContextMenuSettingsMenuItems] = js.undefined
  }
  object ContextMenuSettings {
    
    inline def apply(): ContextMenuSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContextMenuSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContextMenuSettings] (val x: Self) extends AnyVal {
      
      inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
      
      inline def setMenuItems(value: ContextMenuSettingsMenuItems): Self = StObject.set(x, "menuItems", value.asInstanceOf[js.Any])
      
      inline def setMenuItemsUndefined: Self = StObject.set(x, "menuItems", js.undefined)
    }
  }
  
  trait ContextMenuSettingsMenuItems extends StObject {
    
    /** All the appointment related context menu items are grouped under this appointment menu collection.
      */
    var appointment: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** All the Scheduler cell related context menu items are grouped under this cells menu item collection.
      */
    var cells: js.UndefOr[js.Array[Any]] = js.undefined
  }
  object ContextMenuSettingsMenuItems {
    
    inline def apply(): ContextMenuSettingsMenuItems = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContextMenuSettingsMenuItems]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContextMenuSettingsMenuItems] (val x: Self) extends AnyVal {
      
      inline def setAppointment(value: js.Array[Any]): Self = StObject.set(x, "appointment", value.asInstanceOf[js.Any])
      
      inline def setAppointmentUndefined: Self = StObject.set(x, "appointment", js.undefined)
      
      inline def setAppointmentVarargs(value: Any*): Self = StObject.set(x, "appointment", js.Array(value*))
      
      inline def setCells(value: js.Array[Any]): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
      
      inline def setCellsUndefined: Self = StObject.set(x, "cells", js.undefined)
      
      inline def setCellsVarargs(value: Any*): Self = StObject.set(x, "cells", js.Array(value*))
    }
  }
  
  trait CreateEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the Schedule model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Returns the name of the Scheduler event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object CreateEventArgs {
    
    inline def apply(): CreateEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CreateEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait DestroyEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the Schedule model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Returns the name of the Scheduler event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object DestroyEventArgs {
    
    inline def apply(): DestroyEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DestroyEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DestroyEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait DragEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the default dragging interval range in minutes
      */
    var interval: js.UndefOr[Double] = js.undefined
    
    /** Returns the Schedule model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Returns the target of the drag over appointment.
      */
    var target: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object DragEventArgs {
    
    inline def apply(): DragEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DragEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DragEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait DragStartEventArgs extends StObject {
    
    /** Returns the dragged appointment.
      */
    var appointment: js.UndefOr[Any] = js.undefined
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the Schedule model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Returns the target of the dragging appointment.
      */
    var target: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object DragStartEventArgs {
    
    inline def apply(): DragStartEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DragStartEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DragStartEventArgs] (val x: Self) extends AnyVal {
      
      inline def setAppointment(value: Any): Self = StObject.set(x, "appointment", value.asInstanceOf[js.Any])
      
      inline def setAppointmentUndefined: Self = StObject.set(x, "appointment", js.undefined)
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait DragStopEventArgs extends StObject {
    
    /** Returns the dropped appointment object.
      */
    var appointment: js.UndefOr[Any] = js.undefined
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the Schedule model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object DragStopEventArgs {
    
    inline def apply(): DragStopEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DragStopEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DragStopEventArgs] (val x: Self) extends AnyVal {
      
      inline def setAppointment(value: Any): Self = StObject.set(x, "appointment", value.asInstanceOf[js.Any])
      
      inline def setAppointmentUndefined: Self = StObject.set(x, "appointment", js.undefined)
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Group extends StObject {
    
    /** When set to true, allows performing CRUD actions simultaneously on all the grouped appointments of multiple resources.
      * @Default {false}
      */
    var allowGroupEditing: js.UndefOr[Boolean] = js.undefined
    
    /** Holds the array of resource names to be grouped on the Schedule.
      */
    var resources: js.UndefOr[js.Array[Any]] = js.undefined
  }
  object Group {
    
    inline def apply(): Group = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Group]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Group] (val x: Self) extends AnyVal {
      
      inline def setAllowGroupEditing(value: Boolean): Self = StObject.set(x, "allowGroupEditing", value.asInstanceOf[js.Any])
      
      inline def setAllowGroupEditingUndefined: Self = StObject.set(x, "allowGroupEditing", js.undefined)
      
      inline def setResources(value: js.Array[Any]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
      
      inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
      
      inline def setResourcesVarargs(value: Any*): Self = StObject.set(x, "resources", js.Array(value*))
    }
  }
  
  trait KeyDownEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the object of menu item event.
      */
    var events: js.UndefOr[Any] = js.undefined
    
    /** Returns the Schedule model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object KeyDownEventArgs {
    
    inline def apply(): KeyDownEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeyDownEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KeyDownEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setEvents(value: Any): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait MenuItemClickEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the object of menu item event.
      */
    var events: js.UndefOr[Any] = js.undefined
    
    /** Returns the Schedule model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Returns the right clicked cell details.
      */
    var targetInfo: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object MenuItemClickEventArgs {
    
    inline def apply(): MenuItemClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuItemClickEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MenuItemClickEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setEvents(value: Any): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setTargetInfo(value: Any): Self = StObject.set(x, "targetInfo", value.asInstanceOf[js.Any])
      
      inline def setTargetInfoUndefined: Self = StObject.set(x, "targetInfo", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Model extends StObject {
    
    /** Triggers on the beginning of every action that starts within the Schedule.
      */
    var actionBegin: js.UndefOr[js.Function1[/* e */ ActionBeginEventArgs, Unit]] = js.undefined
    
    /** Triggers after the completion of every action within the Schedule.
      */
    var actionComplete: js.UndefOr[js.Function1[/* e */ ActionCompleteEventArgs, Unit]] = js.undefined
    
    /** Sets the week to display more than one week appointment summary.
      */
    var agendaViewSettings: js.UndefOr[AgendaViewSettings] = js.undefined
    
    /** Accepts the id value of the template layout defined for the all-day cells and customizes it.
      * @Default {null}
      */
    var allDayCellsTemplateId: js.UndefOr[String] = js.undefined
    
    /** When set to false, disables the appointment delete option on the Scheduler.
      * @Default {true}
      */
    var allowDelete: js.UndefOr[Boolean] = js.undefined
    
    /** When set to true, Schedule allows the appointments to be dragged and dropped at required time.
      * @Default {true}
      */
    var allowDragAndDrop: js.UndefOr[Boolean] = js.undefined
    
    /** When set to true, allows the user to create/edit appointments inline - simply through a single click made either on the Scheduler cells or on the existing appointmentâ€™s Subject
      * text respectively. Pressing enter key after the new Subject text   typed onto the inline created text box, will save/update the appointments appropriately.
      * @Default {false}
      */
    var allowInline: js.UndefOr[Boolean] = js.undefined
    
    /** When set to true, Scheduler allows interaction through keyboard shortcut keys.
      * @Default {true}
      */
    var allowKeyboardNavigation: js.UndefOr[Boolean] = js.undefined
    
    /** Triggers after an existing appointment is edited.
      */
    var appointmentChanged: js.UndefOr[js.Function1[/* e */ AppointmentChangedEventArgs, Unit]] = js.undefined
    
    /** Triggers after an appointment is clicked.
      */
    var appointmentClick: js.UndefOr[js.Function1[/* e */ AppointmentClickEventArgs, Unit]] = js.undefined
    
    /** Triggers after the new appointment is saved.
      */
    var appointmentCreated: js.UndefOr[js.Function1[/* e */ AppointmentCreatedEventArgs, Unit]] = js.undefined
    
    /** Allows setting draggable area for the Scheduler appointments. Also, turns on the external drag and drop, when set with some specific external drag area name.
      */
    var appointmentDragArea: js.UndefOr[String] = js.undefined
    
    /** Triggers on hovering the mouse over the appointments.
      */
    var appointmentHover: js.UndefOr[js.Function1[/* e */ AppointmentHoverEventArgs, Unit]] = js.undefined
    
    /** Triggers after the appointment is deleted.
      */
    var appointmentRemoved: js.UndefOr[js.Function1[/* e */ AppointmentRemovedEventArgs, Unit]] = js.undefined
    
    /** It includes the dataSource option and the fields related to Schedule appointments. The appointment fields within the appointmentSettings can accept both string and object type
      * values. To apply validation rules on the appointment window fields, then the appointment fields needs to be defined with object type values.
      */
    var appointmentSettings: js.UndefOr[AppointmentSettings] = js.undefined
    
    /** Template design that applies on the Schedule appointments. All the field names that are mapped from dataSource to the appropriate field properties within the appointmentSettings
      * can be used within the template.
      * @Default {null}
      */
    var appointmentTemplateId: js.UndefOr[String] = js.undefined
    
    /** Triggers before the appointment window opens.
      */
    var appointmentWindowOpen: js.UndefOr[js.Function1[/* e */ AppointmentWindowOpenEventArgs, Unit]] = js.undefined
    
    /** Triggers before the edited appointment is being saved.
      */
    var beforeAppointmentChange: js.UndefOr[js.Function1[/* e */ BeforeAppointmentChangeEventArgs, Unit]] = js.undefined
    
    /** Triggers before the new appointment gets saved.
      */
    var beforeAppointmentCreate: js.UndefOr[js.Function1[/* e */ BeforeAppointmentCreateEventArgs, Unit]] = js.undefined
    
    /** Triggers before the appointment is being removed from the Scheduler.
      */
    var beforeAppointmentRemove: js.UndefOr[js.Function1[/* e */ BeforeAppointmentRemoveEventArgs, Unit]] = js.undefined
    
    /** Triggers before the context menu opens.
      */
    var beforeContextMenuOpen: js.UndefOr[js.Function1[/* e */ BeforeContextMenuOpenEventArgs, Unit]] = js.undefined
    
    /** Blocks the user-specific time interval on the Scheduler, so that no appointments can be created on that particular time slots. It includes the dataSource option and also the
      * fields related to block intervals.
      */
    var blockoutSettings: js.UndefOr[BlockoutSettings] = js.undefined
    
    /** Sets various categorize colors to the Schedule appointments to differentiate it.
      */
    var categorizeSettings: js.UndefOr[CategorizeSettings] = js.undefined
    
    /** Triggers after the cell is clicked.
      */
    var cellClick: js.UndefOr[js.Function1[/* e */ CellClickEventArgs, Unit]] = js.undefined
    
    /** Triggers after the cell is clicked twice.
      */
    var cellDoubleClick: js.UndefOr[js.Function1[/* e */ CellDoubleClickEventArgs, Unit]] = js.undefined
    
    /** Sets the height for Schedule cells.
      * @Default {20px}
      */
    var cellHeight: js.UndefOr[String] = js.undefined
    
    /** Triggers on hovering the mouse overs the cells.
      */
    var cellHover: js.UndefOr[js.Function1[/* e */ CellHoverEventArgs, Unit]] = js.undefined
    
    /** Sets the width for Schedule cells.
      */
    var cellWidth: js.UndefOr[String] = js.undefined
    
    /** Holds all options related to the context menu settings of Scheduler.
      */
    var contextMenuSettings: js.UndefOr[ContextMenuSettings] = js.undefined
    
    /** Triggers when the Scheduler completely renders on the page.
      */
    var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.undefined
    
    /** Accepts the custom CSS class name that defines specific user-defined styles and themes to be applied for partial or complete elements of the Schedule.
      */
    var cssClass: js.UndefOr[String] = js.undefined
    
    /** Sets current date of the Schedule. The Schedule displays initially with the date that is provided here.
      * @Default {new Date()}
      */
    var currentDate: js.UndefOr[Any] = js.undefined
    
    /** Sets current view of the Schedule. Schedule renders initially with the view that is specified here. The available views are day, week, workweek, month, agenda and custom view -
      * from which any one of the required view can be set to the Schedule. It accepts both string or enum values. The enum values that are accepted by
      * currentView(ej.Schedule.CurrentView) are as follows,
      * @Default {ej.Schedule.CurrentView.Week}
      */
    var currentView: js.UndefOr[String | CurrentView] = js.undefined
    
    /** Sets the date format for Schedule.
      */
    var dateFormat: js.UndefOr[String] = js.undefined
    
    /** Accepts the id value of the template layout defined for the date header cells and customizes it.
      * @Default {null}
      */
    var dateHeaderTemplateId: js.UndefOr[String] = js.undefined
    
    /** Triggers when the Scheduler and all its sub-components gets destroyed.
      */
    var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.undefined
    
    /** Triggers while the appointment is being dragged over the work cells.
      */
    var drag: js.UndefOr[js.Function1[/* e */ DragEventArgs, Unit]] = js.undefined
    
    /** Triggers when the appointment dragging begins.
      */
    var dragStart: js.UndefOr[js.Function1[/* e */ DragStartEventArgs, Unit]] = js.undefined
    
    /** Triggers when the appointment is dropped.
      */
    var dragStop: js.UndefOr[js.Function1[/* e */ DragStopEventArgs, Unit]] = js.undefined
    
    /** When set to true, enables the resize behavior of appointments within the Schedule.
      * @Default {true}
      */
    var enableAppointmentResize: js.UndefOr[Boolean] = js.undefined
    
    /** When set to true, enables the loading of Schedule appointments based on your demand. With this load on demand concept, the data consumption of the Schedule can be limited.
      * @Default {false}
      */
    var enableLoadOnDemand: js.UndefOr[Boolean] = js.undefined
    
    /** Saves the current model value to browser cookies for state maintenance. When the page gets refreshed, Schedule control values are retained.
      * @Default {false}
      */
    var enablePersistence: js.UndefOr[Boolean] = js.undefined
    
    /** When set to true, the Schedule layout and behavior changes as per the common RTL conventions.
      * @Default {false}
      */
    var enableRTL: js.UndefOr[Boolean] = js.undefined
    
    /** When set to true, Schedule allows the validation of recurrence pattern to take place before it is being assigned to the appointments. For example, when one of the instance of
      * recurrence appointment is dragged beyond the next or previous instance of the same recurrence appointment, a pop-up is displayed with the validation message disallowing the drag
      * functionality.
      * @Default {true}
      */
    var enableRecurrenceValidation: js.UndefOr[Boolean] = js.undefined
    
    /** Sets the end hour time limit to be displayed on the Schedule.
      * @Default {24}
      */
    var endHour: js.UndefOr[Double] = js.undefined
    
    /** Sets specific day as the starting day of the week.
      * @Default {null}
      */
    var firstDayOfWeek: js.UndefOr[String] = js.undefined
    
    /** To configure resource grouping on the Schedule.
      */
    var group: js.UndefOr[Group] = js.undefined
    
    /** Sets the height of the Schedule. Accepts both pixel and percentage values.
      * @Default {1120px}
      */
    var height: js.UndefOr[String] = js.undefined
    
    /** When set to true, enables the Schedule to observe Daylight Saving Time for supported timezones.
      * @Default {false}
      */
    var isDST: js.UndefOr[Boolean] = js.undefined
    
    /** When set to true, adapts the Schedule layout to fit the screen size of devices on which it renders.
      * @Default {true}
      */
    var isResponsive: js.UndefOr[Boolean] = js.undefined
    
    /** Triggers when any of the keyboard keys are pressed.
      */
    var keyDown: js.UndefOr[js.Function1[/* e */ KeyDownEventArgs, Unit]] = js.undefined
    
    /** Sets the specific culture to the Schedule.
      * @Default {en-US}
      */
    var locale: js.UndefOr[String] = js.undefined
    
    /** Sets the maximum date limit to display on the Schedule. Setting maxDate with specific date value disallows the Schedule to navigate beyond that date.
      * @Default {new Date(2099, 12, 31)}
      */
    var maxDate: js.UndefOr[Any] = js.undefined
    
    /** Triggers after the menu/sub-menu items within the context menu is clicked.
      */
    var menuItemClick: js.UndefOr[js.Function1[/* e */ MenuItemClickEventArgs, Unit]] = js.undefined
    
    /** Sets the minimum date limit to display on the Schedule. Setting minDate with specific date value disallows the Schedule to navigate beyond that date.
      * @Default {new Date(1900, 01, 01)}
      */
    var minDate: js.UndefOr[Any] = js.undefined
    
    /** Triggers after the Schedule view or date is navigated.
      */
    var navigation: js.UndefOr[js.Function1[/* e */ NavigationEventArgs, Unit]] = js.undefined
    
    /** Sets the mode of Schedule rendering either in a vertical or horizontal direction. It accepts either string(&quot;vertical&quot; or &quot;horizontal&quot;) or enum values. The enum
      * values that are accepted by orientation(ej.Schedule.Orientation) are as follows,
      * @Default {ej.Schedule.Orientation.Vertical}
      */
    var orientation: js.UndefOr[String | typings.ejWebAll.ej.Orientation] = js.undefined
    
    /** Triggers when the overflow button is clicked.
      */
    var overflowButtonClick: js.UndefOr[js.Function1[/* e */ OverflowButtonClickEventArgs, Unit]] = js.undefined
    
    /** Triggers while mouse hovering on the overflow button.
      */
    var overflowButtonHover: js.UndefOr[js.Function1[/* e */ OverflowButtonHoverEventArgs, Unit]] = js.undefined
    
    /** Holds all the options related to priority settings of the Schedule.
      */
    var prioritySettings: js.UndefOr[PrioritySettings] = js.undefined
    
    /** Triggers every time before the elements of the scheduler such as work cells, time cells or header cells and so on renders or re-renders on a page.
      */
    var queryCellInfo: js.UndefOr[js.Function1[/* e */ QueryCellInfoEventArgs, Unit]] = js.undefined
    
    /** When set to true, disables the interaction with the Schedule appointments, simply allowing the date and view navigation to occur.
      * @Default {false}
      */
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    /** Triggers when the reminder is raised for an appointment based on the alertBefore value.
      */
    var reminder: js.UndefOr[js.Function1[/* e */ ReminderEventArgs, Unit]] = js.undefined
    
    /** Holds all the options related to reminder settings of the Schedule.
      */
    var reminderSettings: js.UndefOr[ReminderSettings] = js.undefined
    
    /** Defines the specific start and end dates to be rendered in the Schedule control. To render such user-specified custom date ranges in the Schedule control, set the currentView
      * property to ej.Schedule.CurrentView.CustomView.
      * @Default {null}
      */
    var renderDates: js.UndefOr[RenderDates] = js.undefined
    
    /** Triggers while resizing the appointment.
      */
    var resize: js.UndefOr[js.Function1[/* e */ ResizeEventArgs, Unit]] = js.undefined
    
    /** Triggers when the appointment resizing begins.
      */
    var resizeStart: js.UndefOr[js.Function1[/* e */ ResizeStartEventArgs, Unit]] = js.undefined
    
    /** Triggers when an appointment resizing stops.
      */
    var resizeStop: js.UndefOr[js.Function1[/* e */ ResizeStopEventArgs, Unit]] = js.undefined
    
    /** Template design that applies on the Schedule resource header.
      * @Default {null}
      */
    var resourceHeaderTemplateId: js.UndefOr[String] = js.undefined
    
    /** Holds all the options related to the resources settings of the Schedule. It is a collection of one or more resource objects, where the levels of resources are rendered on the
      * Schedule based on the order of the resource data provided within this collection.
      * @Default {null}
      */
    var resources: js.UndefOr[js.Array[Resource]] = js.undefined
    
    /** When set to true, displays the all-day row cells on the Schedule.
      * @Default {true}
      */
    var showAllDayRow: js.UndefOr[Boolean] = js.undefined
    
    /** When set to true, shows the previous/next appointment navigator button on the Scheduler.
      * @Default {true}
      */
    var showAppointmentNavigator: js.UndefOr[Boolean] = js.undefined
    
    /** When set to true, displays the current time indicator on the Schedule.
      * @Default {true}
      */
    var showCurrentTimeIndicator: js.UndefOr[Boolean] = js.undefined
    
    /** When set to true, shows the delete confirmation dialog before deleting an appointment.
      * @Default {true}
      */
    var showDeleteConfirmationDialog: js.UndefOr[Boolean] = js.undefined
    
    /** When set to true, displays the header bar on the Schedule.
      * @Default {true}
      */
    var showHeaderBar: js.UndefOr[Boolean] = js.undefined
    
    /** When set to true, displays the location field additionally on Schedule appointment window.
      * @Default {false}
      */
    var showLocationField: js.UndefOr[Boolean] = js.undefined
    
    /** When set to true, displays the other months days from the current month on the Schedule.
      * @Default {true}
      */
    var showNextPrevMonth: js.UndefOr[Boolean] = js.undefined
    
    /** when set to false, allows the height of the work-cells to adjust automatically (either expand or collapse) based on the number of appointment count it has.
      * @Default {true}
      */
    var showOverflowButton: js.UndefOr[Boolean] = js.undefined
    
    /** When set to true, displays the quick window for every single click made on the Schedule cells or appointments.
      * @Default {true}
      */
    var showQuickWindow: js.UndefOr[Boolean] = js.undefined
    
    /** When set to false, doesn't render the start and end timezone fields on the Schedule appointment window.
      * @Default {true}
      */
    var showTimeZoneFields: js.UndefOr[Boolean] = js.undefined
    
    /** When set to false, hides the weekend days on all the Scheduler views.
      * @Default {true}
      */
    var showWeekend: js.UndefOr[Boolean] = js.undefined
    
    /** Sets the start hour time range to be displayed on the Schedule.
      * @Default {0}
      */
    var startHour: js.UndefOr[Double] = js.undefined
    
    /** Sets either 12 or 24 hour time mode on the Schedule. It accepts either the string value(&quot;12&quot; or &quot;24&quot;) or the below mentioned enum values. The enum values that
      * are accepted by timeMode(ej.Schedule.TimeMode) are as follows,
      * @Default {null}
      */
    var timeMode: js.UndefOr[String | TimeMode] = js.undefined
    
    /** Holds all the options related to the time scale of Scheduler. The timeslots either major or minor slots can be customized with this property.
      */
    var timeScale: js.UndefOr[TimeScale] = js.undefined
    
    /** Sets the timezone for the Schedule.
      * @Default {null}
      */
    var timeZone: js.UndefOr[String] = js.undefined
    
    /** Sets the collection of timezone items to be bound to the Schedule. Only the items bound to this property gets listed out in the timezone field of the appointment window.
      */
    var timeZoneCollection: js.UndefOr[TimeZoneCollection] = js.undefined
    
    /** Allows to pop-up appointment details in a tooltip while hovering over the appointments.
      */
    var tooltipSettings: js.UndefOr[TooltipSettings] = js.undefined
    
    /** Defines the view collection to be displayed on the Schedule. By default, it displays all the views namely, Day, Week, WorkWeek and Month.
      * @Default {[Day, Week, WorkWeek, Month, Agenda]}
      */
    var views: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** Sets the width of the Schedule. Accepts both pixel and percentage values.
      * @Default {100%}
      */
    var width: js.UndefOr[String] = js.undefined
    
    /** Accepts the id value of the template layout defined for the work cells and month cells.
      * @Default {null}
      */
    var workCellsTemplateId: js.UndefOr[String] = js.undefined
    
    /** To define the work hours within the Schedule control.
      */
    var workHours: js.UndefOr[WorkHours] = js.undefined
    
    /** Sets different day collection within workWeek view.
      * @Default {[Monday, Tuesday, Wednesday, Thursday, Friday]}
      */
    var workWeek: js.UndefOr[js.Array[Any]] = js.undefined
  }
  object Model {
    
    inline def apply(): typings.ejWebAll.ej.Schedule.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.Schedule.Model]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.ejWebAll.ej.Schedule.Model] (val x: Self) extends AnyVal {
      
      inline def setActionBegin(value: /* e */ ActionBeginEventArgs => Unit): Self = StObject.set(x, "actionBegin", js.Any.fromFunction1(value))
      
      inline def setActionBeginUndefined: Self = StObject.set(x, "actionBegin", js.undefined)
      
      inline def setActionComplete(value: /* e */ ActionCompleteEventArgs => Unit): Self = StObject.set(x, "actionComplete", js.Any.fromFunction1(value))
      
      inline def setActionCompleteUndefined: Self = StObject.set(x, "actionComplete", js.undefined)
      
      inline def setAgendaViewSettings(value: AgendaViewSettings): Self = StObject.set(x, "agendaViewSettings", value.asInstanceOf[js.Any])
      
      inline def setAgendaViewSettingsUndefined: Self = StObject.set(x, "agendaViewSettings", js.undefined)
      
      inline def setAllDayCellsTemplateId(value: String): Self = StObject.set(x, "allDayCellsTemplateId", value.asInstanceOf[js.Any])
      
      inline def setAllDayCellsTemplateIdUndefined: Self = StObject.set(x, "allDayCellsTemplateId", js.undefined)
      
      inline def setAllowDelete(value: Boolean): Self = StObject.set(x, "allowDelete", value.asInstanceOf[js.Any])
      
      inline def setAllowDeleteUndefined: Self = StObject.set(x, "allowDelete", js.undefined)
      
      inline def setAllowDragAndDrop(value: Boolean): Self = StObject.set(x, "allowDragAndDrop", value.asInstanceOf[js.Any])
      
      inline def setAllowDragAndDropUndefined: Self = StObject.set(x, "allowDragAndDrop", js.undefined)
      
      inline def setAllowInline(value: Boolean): Self = StObject.set(x, "allowInline", value.asInstanceOf[js.Any])
      
      inline def setAllowInlineUndefined: Self = StObject.set(x, "allowInline", js.undefined)
      
      inline def setAllowKeyboardNavigation(value: Boolean): Self = StObject.set(x, "allowKeyboardNavigation", value.asInstanceOf[js.Any])
      
      inline def setAllowKeyboardNavigationUndefined: Self = StObject.set(x, "allowKeyboardNavigation", js.undefined)
      
      inline def setAppointmentChanged(value: /* e */ AppointmentChangedEventArgs => Unit): Self = StObject.set(x, "appointmentChanged", js.Any.fromFunction1(value))
      
      inline def setAppointmentChangedUndefined: Self = StObject.set(x, "appointmentChanged", js.undefined)
      
      inline def setAppointmentClick(value: /* e */ AppointmentClickEventArgs => Unit): Self = StObject.set(x, "appointmentClick", js.Any.fromFunction1(value))
      
      inline def setAppointmentClickUndefined: Self = StObject.set(x, "appointmentClick", js.undefined)
      
      inline def setAppointmentCreated(value: /* e */ AppointmentCreatedEventArgs => Unit): Self = StObject.set(x, "appointmentCreated", js.Any.fromFunction1(value))
      
      inline def setAppointmentCreatedUndefined: Self = StObject.set(x, "appointmentCreated", js.undefined)
      
      inline def setAppointmentDragArea(value: String): Self = StObject.set(x, "appointmentDragArea", value.asInstanceOf[js.Any])
      
      inline def setAppointmentDragAreaUndefined: Self = StObject.set(x, "appointmentDragArea", js.undefined)
      
      inline def setAppointmentHover(value: /* e */ AppointmentHoverEventArgs => Unit): Self = StObject.set(x, "appointmentHover", js.Any.fromFunction1(value))
      
      inline def setAppointmentHoverUndefined: Self = StObject.set(x, "appointmentHover", js.undefined)
      
      inline def setAppointmentRemoved(value: /* e */ AppointmentRemovedEventArgs => Unit): Self = StObject.set(x, "appointmentRemoved", js.Any.fromFunction1(value))
      
      inline def setAppointmentRemovedUndefined: Self = StObject.set(x, "appointmentRemoved", js.undefined)
      
      inline def setAppointmentSettings(value: AppointmentSettings): Self = StObject.set(x, "appointmentSettings", value.asInstanceOf[js.Any])
      
      inline def setAppointmentSettingsUndefined: Self = StObject.set(x, "appointmentSettings", js.undefined)
      
      inline def setAppointmentTemplateId(value: String): Self = StObject.set(x, "appointmentTemplateId", value.asInstanceOf[js.Any])
      
      inline def setAppointmentTemplateIdUndefined: Self = StObject.set(x, "appointmentTemplateId", js.undefined)
      
      inline def setAppointmentWindowOpen(value: /* e */ AppointmentWindowOpenEventArgs => Unit): Self = StObject.set(x, "appointmentWindowOpen", js.Any.fromFunction1(value))
      
      inline def setAppointmentWindowOpenUndefined: Self = StObject.set(x, "appointmentWindowOpen", js.undefined)
      
      inline def setBeforeAppointmentChange(value: /* e */ BeforeAppointmentChangeEventArgs => Unit): Self = StObject.set(x, "beforeAppointmentChange", js.Any.fromFunction1(value))
      
      inline def setBeforeAppointmentChangeUndefined: Self = StObject.set(x, "beforeAppointmentChange", js.undefined)
      
      inline def setBeforeAppointmentCreate(value: /* e */ BeforeAppointmentCreateEventArgs => Unit): Self = StObject.set(x, "beforeAppointmentCreate", js.Any.fromFunction1(value))
      
      inline def setBeforeAppointmentCreateUndefined: Self = StObject.set(x, "beforeAppointmentCreate", js.undefined)
      
      inline def setBeforeAppointmentRemove(value: /* e */ BeforeAppointmentRemoveEventArgs => Unit): Self = StObject.set(x, "beforeAppointmentRemove", js.Any.fromFunction1(value))
      
      inline def setBeforeAppointmentRemoveUndefined: Self = StObject.set(x, "beforeAppointmentRemove", js.undefined)
      
      inline def setBeforeContextMenuOpen(value: /* e */ BeforeContextMenuOpenEventArgs => Unit): Self = StObject.set(x, "beforeContextMenuOpen", js.Any.fromFunction1(value))
      
      inline def setBeforeContextMenuOpenUndefined: Self = StObject.set(x, "beforeContextMenuOpen", js.undefined)
      
      inline def setBlockoutSettings(value: BlockoutSettings): Self = StObject.set(x, "blockoutSettings", value.asInstanceOf[js.Any])
      
      inline def setBlockoutSettingsUndefined: Self = StObject.set(x, "blockoutSettings", js.undefined)
      
      inline def setCategorizeSettings(value: CategorizeSettings): Self = StObject.set(x, "categorizeSettings", value.asInstanceOf[js.Any])
      
      inline def setCategorizeSettingsUndefined: Self = StObject.set(x, "categorizeSettings", js.undefined)
      
      inline def setCellClick(value: /* e */ CellClickEventArgs => Unit): Self = StObject.set(x, "cellClick", js.Any.fromFunction1(value))
      
      inline def setCellClickUndefined: Self = StObject.set(x, "cellClick", js.undefined)
      
      inline def setCellDoubleClick(value: /* e */ CellDoubleClickEventArgs => Unit): Self = StObject.set(x, "cellDoubleClick", js.Any.fromFunction1(value))
      
      inline def setCellDoubleClickUndefined: Self = StObject.set(x, "cellDoubleClick", js.undefined)
      
      inline def setCellHeight(value: String): Self = StObject.set(x, "cellHeight", value.asInstanceOf[js.Any])
      
      inline def setCellHeightUndefined: Self = StObject.set(x, "cellHeight", js.undefined)
      
      inline def setCellHover(value: /* e */ CellHoverEventArgs => Unit): Self = StObject.set(x, "cellHover", js.Any.fromFunction1(value))
      
      inline def setCellHoverUndefined: Self = StObject.set(x, "cellHover", js.undefined)
      
      inline def setCellWidth(value: String): Self = StObject.set(x, "cellWidth", value.asInstanceOf[js.Any])
      
      inline def setCellWidthUndefined: Self = StObject.set(x, "cellWidth", js.undefined)
      
      inline def setContextMenuSettings(value: ContextMenuSettings): Self = StObject.set(x, "contextMenuSettings", value.asInstanceOf[js.Any])
      
      inline def setContextMenuSettingsUndefined: Self = StObject.set(x, "contextMenuSettings", js.undefined)
      
      inline def setCreate(value: /* e */ CreateEventArgs => Unit): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      inline def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      inline def setCurrentDate(value: Any): Self = StObject.set(x, "currentDate", value.asInstanceOf[js.Any])
      
      inline def setCurrentDateUndefined: Self = StObject.set(x, "currentDate", js.undefined)
      
      inline def setCurrentView(value: String | CurrentView): Self = StObject.set(x, "currentView", value.asInstanceOf[js.Any])
      
      inline def setCurrentViewUndefined: Self = StObject.set(x, "currentView", js.undefined)
      
      inline def setDateFormat(value: String): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
      
      inline def setDateFormatUndefined: Self = StObject.set(x, "dateFormat", js.undefined)
      
      inline def setDateHeaderTemplateId(value: String): Self = StObject.set(x, "dateHeaderTemplateId", value.asInstanceOf[js.Any])
      
      inline def setDateHeaderTemplateIdUndefined: Self = StObject.set(x, "dateHeaderTemplateId", js.undefined)
      
      inline def setDestroy(value: /* e */ DestroyEventArgs => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
      
      inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      inline def setDrag(value: /* e */ DragEventArgs => Unit): Self = StObject.set(x, "drag", js.Any.fromFunction1(value))
      
      inline def setDragStart(value: /* e */ DragStartEventArgs => Unit): Self = StObject.set(x, "dragStart", js.Any.fromFunction1(value))
      
      inline def setDragStartUndefined: Self = StObject.set(x, "dragStart", js.undefined)
      
      inline def setDragStop(value: /* e */ DragStopEventArgs => Unit): Self = StObject.set(x, "dragStop", js.Any.fromFunction1(value))
      
      inline def setDragStopUndefined: Self = StObject.set(x, "dragStop", js.undefined)
      
      inline def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
      
      inline def setEnableAppointmentResize(value: Boolean): Self = StObject.set(x, "enableAppointmentResize", value.asInstanceOf[js.Any])
      
      inline def setEnableAppointmentResizeUndefined: Self = StObject.set(x, "enableAppointmentResize", js.undefined)
      
      inline def setEnableLoadOnDemand(value: Boolean): Self = StObject.set(x, "enableLoadOnDemand", value.asInstanceOf[js.Any])
      
      inline def setEnableLoadOnDemandUndefined: Self = StObject.set(x, "enableLoadOnDemand", js.undefined)
      
      inline def setEnablePersistence(value: Boolean): Self = StObject.set(x, "enablePersistence", value.asInstanceOf[js.Any])
      
      inline def setEnablePersistenceUndefined: Self = StObject.set(x, "enablePersistence", js.undefined)
      
      inline def setEnableRTL(value: Boolean): Self = StObject.set(x, "enableRTL", value.asInstanceOf[js.Any])
      
      inline def setEnableRTLUndefined: Self = StObject.set(x, "enableRTL", js.undefined)
      
      inline def setEnableRecurrenceValidation(value: Boolean): Self = StObject.set(x, "enableRecurrenceValidation", value.asInstanceOf[js.Any])
      
      inline def setEnableRecurrenceValidationUndefined: Self = StObject.set(x, "enableRecurrenceValidation", js.undefined)
      
      inline def setEndHour(value: Double): Self = StObject.set(x, "endHour", value.asInstanceOf[js.Any])
      
      inline def setEndHourUndefined: Self = StObject.set(x, "endHour", js.undefined)
      
      inline def setFirstDayOfWeek(value: String): Self = StObject.set(x, "firstDayOfWeek", value.asInstanceOf[js.Any])
      
      inline def setFirstDayOfWeekUndefined: Self = StObject.set(x, "firstDayOfWeek", js.undefined)
      
      inline def setGroup(value: Group): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setIsDST(value: Boolean): Self = StObject.set(x, "isDST", value.asInstanceOf[js.Any])
      
      inline def setIsDSTUndefined: Self = StObject.set(x, "isDST", js.undefined)
      
      inline def setIsResponsive(value: Boolean): Self = StObject.set(x, "isResponsive", value.asInstanceOf[js.Any])
      
      inline def setIsResponsiveUndefined: Self = StObject.set(x, "isResponsive", js.undefined)
      
      inline def setKeyDown(value: /* e */ KeyDownEventArgs => Unit): Self = StObject.set(x, "keyDown", js.Any.fromFunction1(value))
      
      inline def setKeyDownUndefined: Self = StObject.set(x, "keyDown", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setMaxDate(value: Any): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      inline def setMenuItemClick(value: /* e */ MenuItemClickEventArgs => Unit): Self = StObject.set(x, "menuItemClick", js.Any.fromFunction1(value))
      
      inline def setMenuItemClickUndefined: Self = StObject.set(x, "menuItemClick", js.undefined)
      
      inline def setMinDate(value: Any): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      inline def setNavigation(value: /* e */ NavigationEventArgs => Unit): Self = StObject.set(x, "navigation", js.Any.fromFunction1(value))
      
      inline def setNavigationUndefined: Self = StObject.set(x, "navigation", js.undefined)
      
      inline def setOrientation(value: String | typings.ejWebAll.ej.Orientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setOverflowButtonClick(value: /* e */ OverflowButtonClickEventArgs => Unit): Self = StObject.set(x, "overflowButtonClick", js.Any.fromFunction1(value))
      
      inline def setOverflowButtonClickUndefined: Self = StObject.set(x, "overflowButtonClick", js.undefined)
      
      inline def setOverflowButtonHover(value: /* e */ OverflowButtonHoverEventArgs => Unit): Self = StObject.set(x, "overflowButtonHover", js.Any.fromFunction1(value))
      
      inline def setOverflowButtonHoverUndefined: Self = StObject.set(x, "overflowButtonHover", js.undefined)
      
      inline def setPrioritySettings(value: PrioritySettings): Self = StObject.set(x, "prioritySettings", value.asInstanceOf[js.Any])
      
      inline def setPrioritySettingsUndefined: Self = StObject.set(x, "prioritySettings", js.undefined)
      
      inline def setQueryCellInfo(value: /* e */ QueryCellInfoEventArgs => Unit): Self = StObject.set(x, "queryCellInfo", js.Any.fromFunction1(value))
      
      inline def setQueryCellInfoUndefined: Self = StObject.set(x, "queryCellInfo", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setReminder(value: /* e */ ReminderEventArgs => Unit): Self = StObject.set(x, "reminder", js.Any.fromFunction1(value))
      
      inline def setReminderSettings(value: ReminderSettings): Self = StObject.set(x, "reminderSettings", value.asInstanceOf[js.Any])
      
      inline def setReminderSettingsUndefined: Self = StObject.set(x, "reminderSettings", js.undefined)
      
      inline def setReminderUndefined: Self = StObject.set(x, "reminder", js.undefined)
      
      inline def setRenderDates(value: RenderDates): Self = StObject.set(x, "renderDates", value.asInstanceOf[js.Any])
      
      inline def setRenderDatesUndefined: Self = StObject.set(x, "renderDates", js.undefined)
      
      inline def setResize(value: /* e */ ResizeEventArgs => Unit): Self = StObject.set(x, "resize", js.Any.fromFunction1(value))
      
      inline def setResizeStart(value: /* e */ ResizeStartEventArgs => Unit): Self = StObject.set(x, "resizeStart", js.Any.fromFunction1(value))
      
      inline def setResizeStartUndefined: Self = StObject.set(x, "resizeStart", js.undefined)
      
      inline def setResizeStop(value: /* e */ ResizeStopEventArgs => Unit): Self = StObject.set(x, "resizeStop", js.Any.fromFunction1(value))
      
      inline def setResizeStopUndefined: Self = StObject.set(x, "resizeStop", js.undefined)
      
      inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
      
      inline def setResourceHeaderTemplateId(value: String): Self = StObject.set(x, "resourceHeaderTemplateId", value.asInstanceOf[js.Any])
      
      inline def setResourceHeaderTemplateIdUndefined: Self = StObject.set(x, "resourceHeaderTemplateId", js.undefined)
      
      inline def setResources(value: js.Array[Resource]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
      
      inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
      
      inline def setResourcesVarargs(value: Resource*): Self = StObject.set(x, "resources", js.Array(value*))
      
      inline def setShowAllDayRow(value: Boolean): Self = StObject.set(x, "showAllDayRow", value.asInstanceOf[js.Any])
      
      inline def setShowAllDayRowUndefined: Self = StObject.set(x, "showAllDayRow", js.undefined)
      
      inline def setShowAppointmentNavigator(value: Boolean): Self = StObject.set(x, "showAppointmentNavigator", value.asInstanceOf[js.Any])
      
      inline def setShowAppointmentNavigatorUndefined: Self = StObject.set(x, "showAppointmentNavigator", js.undefined)
      
      inline def setShowCurrentTimeIndicator(value: Boolean): Self = StObject.set(x, "showCurrentTimeIndicator", value.asInstanceOf[js.Any])
      
      inline def setShowCurrentTimeIndicatorUndefined: Self = StObject.set(x, "showCurrentTimeIndicator", js.undefined)
      
      inline def setShowDeleteConfirmationDialog(value: Boolean): Self = StObject.set(x, "showDeleteConfirmationDialog", value.asInstanceOf[js.Any])
      
      inline def setShowDeleteConfirmationDialogUndefined: Self = StObject.set(x, "showDeleteConfirmationDialog", js.undefined)
      
      inline def setShowHeaderBar(value: Boolean): Self = StObject.set(x, "showHeaderBar", value.asInstanceOf[js.Any])
      
      inline def setShowHeaderBarUndefined: Self = StObject.set(x, "showHeaderBar", js.undefined)
      
      inline def setShowLocationField(value: Boolean): Self = StObject.set(x, "showLocationField", value.asInstanceOf[js.Any])
      
      inline def setShowLocationFieldUndefined: Self = StObject.set(x, "showLocationField", js.undefined)
      
      inline def setShowNextPrevMonth(value: Boolean): Self = StObject.set(x, "showNextPrevMonth", value.asInstanceOf[js.Any])
      
      inline def setShowNextPrevMonthUndefined: Self = StObject.set(x, "showNextPrevMonth", js.undefined)
      
      inline def setShowOverflowButton(value: Boolean): Self = StObject.set(x, "showOverflowButton", value.asInstanceOf[js.Any])
      
      inline def setShowOverflowButtonUndefined: Self = StObject.set(x, "showOverflowButton", js.undefined)
      
      inline def setShowQuickWindow(value: Boolean): Self = StObject.set(x, "showQuickWindow", value.asInstanceOf[js.Any])
      
      inline def setShowQuickWindowUndefined: Self = StObject.set(x, "showQuickWindow", js.undefined)
      
      inline def setShowTimeZoneFields(value: Boolean): Self = StObject.set(x, "showTimeZoneFields", value.asInstanceOf[js.Any])
      
      inline def setShowTimeZoneFieldsUndefined: Self = StObject.set(x, "showTimeZoneFields", js.undefined)
      
      inline def setShowWeekend(value: Boolean): Self = StObject.set(x, "showWeekend", value.asInstanceOf[js.Any])
      
      inline def setShowWeekendUndefined: Self = StObject.set(x, "showWeekend", js.undefined)
      
      inline def setStartHour(value: Double): Self = StObject.set(x, "startHour", value.asInstanceOf[js.Any])
      
      inline def setStartHourUndefined: Self = StObject.set(x, "startHour", js.undefined)
      
      inline def setTimeMode(value: String | TimeMode): Self = StObject.set(x, "timeMode", value.asInstanceOf[js.Any])
      
      inline def setTimeModeUndefined: Self = StObject.set(x, "timeMode", js.undefined)
      
      inline def setTimeScale(value: TimeScale): Self = StObject.set(x, "timeScale", value.asInstanceOf[js.Any])
      
      inline def setTimeScaleUndefined: Self = StObject.set(x, "timeScale", js.undefined)
      
      inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
      
      inline def setTimeZoneCollection(value: TimeZoneCollection): Self = StObject.set(x, "timeZoneCollection", value.asInstanceOf[js.Any])
      
      inline def setTimeZoneCollectionUndefined: Self = StObject.set(x, "timeZoneCollection", js.undefined)
      
      inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
      
      inline def setTooltipSettings(value: TooltipSettings): Self = StObject.set(x, "tooltipSettings", value.asInstanceOf[js.Any])
      
      inline def setTooltipSettingsUndefined: Self = StObject.set(x, "tooltipSettings", js.undefined)
      
      inline def setViews(value: js.Array[Any]): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
      
      inline def setViewsUndefined: Self = StObject.set(x, "views", js.undefined)
      
      inline def setViewsVarargs(value: Any*): Self = StObject.set(x, "views", js.Array(value*))
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setWorkCellsTemplateId(value: String): Self = StObject.set(x, "workCellsTemplateId", value.asInstanceOf[js.Any])
      
      inline def setWorkCellsTemplateIdUndefined: Self = StObject.set(x, "workCellsTemplateId", js.undefined)
      
      inline def setWorkHours(value: WorkHours): Self = StObject.set(x, "workHours", value.asInstanceOf[js.Any])
      
      inline def setWorkHoursUndefined: Self = StObject.set(x, "workHours", js.undefined)
      
      inline def setWorkWeek(value: js.Array[Any]): Self = StObject.set(x, "workWeek", value.asInstanceOf[js.Any])
      
      inline def setWorkWeekUndefined: Self = StObject.set(x, "workWeek", js.undefined)
      
      inline def setWorkWeekVarargs(value: Any*): Self = StObject.set(x, "workWeek", js.Array(value*))
    }
  }
  
  trait NavigationEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the current date object.
      */
    var currentDate: js.UndefOr[Any] = js.undefined
    
    /** Returns the current view value.
      */
    var currentView: js.UndefOr[String] = js.undefined
    
    /** Returns the Schedule model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Returns the previous date of the Schedule.
      */
    var previousDate: js.UndefOr[Any] = js.undefined
    
    /** Returns the previous view value.
      */
    var previousView: js.UndefOr[String] = js.undefined
    
    /** Returns the name of the Scheduler event.
      */
    var requestType: js.UndefOr[String] = js.undefined
    
    /** Returns the target of the action.
      */
    var target: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object NavigationEventArgs {
    
    inline def apply(): NavigationEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavigationEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NavigationEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setCurrentDate(value: Any): Self = StObject.set(x, "currentDate", value.asInstanceOf[js.Any])
      
      inline def setCurrentDateUndefined: Self = StObject.set(x, "currentDate", js.undefined)
      
      inline def setCurrentView(value: String): Self = StObject.set(x, "currentView", value.asInstanceOf[js.Any])
      
      inline def setCurrentViewUndefined: Self = StObject.set(x, "currentView", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setPreviousDate(value: Any): Self = StObject.set(x, "previousDate", value.asInstanceOf[js.Any])
      
      inline def setPreviousDateUndefined: Self = StObject.set(x, "previousDate", js.undefined)
      
      inline def setPreviousView(value: String): Self = StObject.set(x, "previousView", value.asInstanceOf[js.Any])
      
      inline def setPreviousViewUndefined: Self = StObject.set(x, "previousView", js.undefined)
      
      inline def setRequestType(value: String): Self = StObject.set(x, "requestType", value.asInstanceOf[js.Any])
      
      inline def setRequestTypeUndefined: Self = StObject.set(x, "requestType", js.undefined)
      
      inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait OverflowButtonClickEventArgs extends StObject {
    
    /** Returns the icon rendered cell information.
      */
    var Datas: js.UndefOr[Any] = js.undefined
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the object of menu item event.
      */
    var events: js.UndefOr[Any] = js.undefined
    
    /** Returns the Schedule model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object OverflowButtonClickEventArgs {
    
    inline def apply(): OverflowButtonClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OverflowButtonClickEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OverflowButtonClickEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setDatas(value: Any): Self = StObject.set(x, "Datas", value.asInstanceOf[js.Any])
      
      inline def setDatasUndefined: Self = StObject.set(x, "Datas", js.undefined)
      
      inline def setEvents(value: Any): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait OverflowButtonHoverEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the icon rendered cell information.
      */
    var datas: js.UndefOr[Any] = js.undefined
    
    /** Returns the object of menu item event.
      */
    var event: js.UndefOr[Any] = js.undefined
    
    /** Returns the Schedule model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object OverflowButtonHoverEventArgs {
    
    inline def apply(): OverflowButtonHoverEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OverflowButtonHoverEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OverflowButtonHoverEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setDatas(value: Any): Self = StObject.set(x, "datas", value.asInstanceOf[js.Any])
      
      inline def setDatasUndefined: Self = StObject.set(x, "datas", js.undefined)
      
      inline def setEvent(value: Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait PrioritySettings extends StObject {
    
    /** The dataSource option can accept the JSON object collection that contains the priority related data.
      * @Default {{% highlight js%}[{ text: None, value: none },{ text: High, value: high },{ text: Medium, value: medium },{ text: Low, value: low }]{% endhighlight %}}
      */
    var dataSource: js.UndefOr[Any | js.Array[Any]] = js.undefined
    
    /** When set to true, enables the priority options available for the Schedule appointments.
      * @Default {false}
      */
    var enable: js.UndefOr[Boolean] = js.undefined
    
    /** Allows priority field customization in the appointment window to add custom icons denoting the priority level for the appointments.
      * @Default {null}
      */
    var template: js.UndefOr[String] = js.undefined
    
    /** Binds text field name in the dataSource to prioritySettings text. These text gets listed out in priority field of the appointment window.
      * @Default {text}
      */
    var text: js.UndefOr[String] = js.undefined
    
    /** Binds value field name in the dataSource to prioritySettings value. These field names usually accepts four priority values by default, high, low, medium and none.
      * @Default {value}
      */
    var value: js.UndefOr[String] = js.undefined
  }
  object PrioritySettings {
    
    inline def apply(): PrioritySettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrioritySettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PrioritySettings] (val x: Self) extends AnyVal {
      
      inline def setDataSource(value: Any | js.Array[Any]): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
      
      inline def setDataSourceVarargs(value: Any*): Self = StObject.set(x, "dataSource", js.Array(value*))
      
      inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
      
      inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait QueryCellInfoEventArgs extends StObject {
    
    /** Returns the current appointment data.
      */
    var appointment: js.UndefOr[Any] = js.undefined
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the currently rendering cell information.
      */
    var cell: js.UndefOr[Any] = js.undefined
    
    /** Returns the cell type which is currently rendering on the Scheduler.
      */
    var cellType: js.UndefOr[String] = js.undefined
    
    /** Returns the start date of the currently rendering appointment.
      */
    var currentAppointmentDate: js.UndefOr[Any] = js.undefined
    
    /** Returns the currently rendering date information.
      */
    var currentDay: js.UndefOr[Any] = js.undefined
    
    /** Returns the currently rendering DOM element.
      */
    var element: js.UndefOr[Any] = js.undefined
    
    /** Returns the Schedule model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Returns the name of the currently rendering element on the scheduler.
      */
    var requestType: js.UndefOr[String] = js.undefined
    
    /** Returns the currently rendering resource details.
      */
    var resource: js.UndefOr[Any] = js.undefined
  }
  object QueryCellInfoEventArgs {
    
    inline def apply(): QueryCellInfoEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueryCellInfoEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QueryCellInfoEventArgs] (val x: Self) extends AnyVal {
      
      inline def setAppointment(value: Any): Self = StObject.set(x, "appointment", value.asInstanceOf[js.Any])
      
      inline def setAppointmentUndefined: Self = StObject.set(x, "appointment", js.undefined)
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setCell(value: Any): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
      
      inline def setCellType(value: String): Self = StObject.set(x, "cellType", value.asInstanceOf[js.Any])
      
      inline def setCellTypeUndefined: Self = StObject.set(x, "cellType", js.undefined)
      
      inline def setCellUndefined: Self = StObject.set(x, "cell", js.undefined)
      
      inline def setCurrentAppointmentDate(value: Any): Self = StObject.set(x, "currentAppointmentDate", value.asInstanceOf[js.Any])
      
      inline def setCurrentAppointmentDateUndefined: Self = StObject.set(x, "currentAppointmentDate", js.undefined)
      
      inline def setCurrentDay(value: Any): Self = StObject.set(x, "currentDay", value.asInstanceOf[js.Any])
      
      inline def setCurrentDayUndefined: Self = StObject.set(x, "currentDay", js.undefined)
      
      inline def setElement(value: Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setRequestType(value: String): Self = StObject.set(x, "requestType", value.asInstanceOf[js.Any])
      
      inline def setRequestTypeUndefined: Self = StObject.set(x, "requestType", js.undefined)
      
      inline def setResource(value: Any): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    }
  }
  
  trait ReminderEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the Schedule model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Returns the appointment object for which the reminder is raised.
      */
    var reminderAppointment: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ReminderEventArgs {
    
    inline def apply(): ReminderEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReminderEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReminderEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setReminderAppointment(value: Any): Self = StObject.set(x, "reminderAppointment", value.asInstanceOf[js.Any])
      
      inline def setReminderAppointmentUndefined: Self = StObject.set(x, "reminderAppointment", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ReminderSettings extends StObject {
    
    /** Sets the timing, when the reminders are to be alerted for the Schedule appointments.
      * @Default {5}
      */
    var alertBefore: js.UndefOr[Double] = js.undefined
    
    /** When set to true, enables the reminder option available for the Schedule appointments.
      * @Default {false}
      */
    var enable: js.UndefOr[Boolean] = js.undefined
  }
  object ReminderSettings {
    
    inline def apply(): ReminderSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReminderSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReminderSettings] (val x: Self) extends AnyVal {
      
      inline def setAlertBefore(value: Double): Self = StObject.set(x, "alertBefore", value.asInstanceOf[js.Any])
      
      inline def setAlertBeforeUndefined: Self = StObject.set(x, "alertBefore", js.undefined)
      
      inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
    }
  }
  
  trait RenderDates extends StObject {
    
    /** Sets the end limit of the custom date range.
      * @Default {null}
      */
    var end: js.UndefOr[Any] = js.undefined
    
    /** Sets the start of custom date range to be rendered in the Schedule.
      * @Default {null}
      */
    var start: js.UndefOr[Any] = js.undefined
  }
  object RenderDates {
    
    inline def apply(): RenderDates = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenderDates]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RenderDates] (val x: Self) extends AnyVal {
      
      inline def setEnd(value: Any): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setStart(value: Any): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
  
  trait ResizeEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the resize element value.
      */
    var element: js.UndefOr[Any] = js.undefined
    
    /** Returns the default appointment resizing range .
      */
    var interval: js.UndefOr[Double] = js.undefined
    
    /** Returns the Schedule model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ResizeEventArgs {
    
    inline def apply(): ResizeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResizeEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResizeEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setElement(value: Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ResizeStartEventArgs extends StObject {
    
    /** Returns the object of the resized appointment.
      */
    var appointment: js.UndefOr[Any] = js.undefined
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the resize element value.
      */
    var element: js.UndefOr[Any] = js.undefined
    
    /** Returns the Schedule model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ResizeStartEventArgs {
    
    inline def apply(): ResizeStartEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResizeStartEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResizeStartEventArgs] (val x: Self) extends AnyVal {
      
      inline def setAppointment(value: Any): Self = StObject.set(x, "appointment", value.asInstanceOf[js.Any])
      
      inline def setAppointmentUndefined: Self = StObject.set(x, "appointment", js.undefined)
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setElement(value: Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ResizeStopEventArgs extends StObject {
    
    /** Returns the resized appointment value.
      */
    var appointment: js.UndefOr[Any] = js.undefined
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the Schedule model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Returns the target of the resized appointment.
      */
    var target: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ResizeStopEventArgs {
    
    inline def apply(): ResizeStopEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResizeStopEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResizeStopEventArgs] (val x: Self) extends AnyVal {
      
      inline def setAppointment(value: Any): Self = StObject.set(x, "appointment", value.asInstanceOf[js.Any])
      
      inline def setAppointmentUndefined: Self = StObject.set(x, "appointment", js.undefined)
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Resource extends StObject {
    
    /** When set to true, allows multiple selection of resource names, thus creating multiple instances of same appointment for the selected resources.
      * @Default {false}
      */
    var allowMultiple: js.UndefOr[Boolean] = js.undefined
    
    /** It holds the name of the resource field to be bound to the Schedule appointments that contains the resource Id.
      * @Default {null}
      */
    var field: js.UndefOr[String] = js.undefined
    
    /** A unique resource name that is used for differentiating various resource objects while grouping it in various levels.
      * @Default {null}
      */
    var name: js.UndefOr[String] = js.undefined
    
    /** It holds the field names of the resources to be bound to the Schedule and also the dataSource.
      */
    var resourceSettings: js.UndefOr[ResourcesResourceSettings] = js.undefined
    
    /** It holds the title name of the resource field to be displayed on the Schedule appointment window.
      * @Default {null}
      */
    var title: js.UndefOr[String] = js.undefined
  }
  object Resource {
    
    inline def apply(): Resource = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Resource]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Resource] (val x: Self) extends AnyVal {
      
      inline def setAllowMultiple(value: Boolean): Self = StObject.set(x, "allowMultiple", value.asInstanceOf[js.Any])
      
      inline def setAllowMultipleUndefined: Self = StObject.set(x, "allowMultiple", js.undefined)
      
      inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setResourceSettings(value: ResourcesResourceSettings): Self = StObject.set(x, "resourceSettings", value.asInstanceOf[js.Any])
      
      inline def setResourceSettingsUndefined: Self = StObject.set(x, "resourceSettings", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait ResourcesResourceSettings extends StObject {
    
    /** Binds appointmentClass field name in the dataSource. It applies custom CSS class name to appointments depicting to the resource it belongs.
      * @Default {null}
      */
    var appointmentClass: js.UndefOr[String] = js.undefined
    
    /** Binds color field name in the dataSource to resourceSettings color. The color specified here gets applied to the Schedule appointments denoting to the resource it belongs.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** The dataSource option accepts either JSON object collection or DataManager (ejDataManager) instance that contains the resources related data.
      * @Default {[]}
      */
    var dataSource: js.UndefOr[Any | js.Array[Any]] = js.undefined
    
    /** Binds the end work hour field name in the dataSource. It's optional, but providing it with some numeric value will set the end work hour for specific resources.
      * @Default {null}
      */
    var end: js.UndefOr[String] = js.undefined
    
    /** Binds groupId field name in the dataSource to resourceSettings groupId.
      * @Default {null}
      */
    var groupId: js.UndefOr[String] = js.undefined
    
    /** Binds id field name in the dataSource to resourceSettings id.
      * @Default {null}
      */
    var id: js.UndefOr[String] = js.undefined
    
    /** Binds the starting work hour field name in the dataSource. It's optional, but providing it with some numeric value will set the starting work hour for specific resources.
      * @Default {null}
      */
    var start: js.UndefOr[String] = js.undefined
    
    /** Binds text field name in the dataSource to resourceSettings text. These text gets listed out in resources field of the appointment window.
      * @Default {null}
      */
    var text: js.UndefOr[String] = js.undefined
    
    /** Binds the resources working days field name in the dataSource. It's optional, and accepts the array of strings (week day names). When provided with specific collection of days
      * (array of day names), only those days will render for the specific resources.
      * @Default {null}
      */
    var workWeek: js.UndefOr[String] = js.undefined
  }
  object ResourcesResourceSettings {
    
    inline def apply(): ResourcesResourceSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResourcesResourceSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResourcesResourceSettings] (val x: Self) extends AnyVal {
      
      inline def setAppointmentClass(value: String): Self = StObject.set(x, "appointmentClass", value.asInstanceOf[js.Any])
      
      inline def setAppointmentClassUndefined: Self = StObject.set(x, "appointmentClass", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDataSource(value: Any | js.Array[Any]): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
      
      inline def setDataSourceVarargs(value: Any*): Self = StObject.set(x, "dataSource", js.Array(value*))
      
      inline def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
      
      inline def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setWorkWeek(value: String): Self = StObject.set(x, "workWeek", value.asInstanceOf[js.Any])
      
      inline def setWorkWeekUndefined: Self = StObject.set(x, "workWeek", js.undefined)
    }
  }
  
  trait TimeScale extends StObject {
    
    /** When set to true, displays the time slots on the Scheduler.
      * @Default {true}
      */
    var enable: js.UndefOr[Boolean] = js.undefined
    
    /** Accepts the value in minutes. When provided with specific value, displays the appropriate time interval on the Scheduler
      * @Default {60}
      */
    var majorSlot: js.UndefOr[Double] = js.undefined
    
    /** Template design that customizes the timecells (major slots). Accepts id value of the template defined for major time slots.
      * @Default {null}
      */
    var majorSlotTemplateId: js.UndefOr[String] = js.undefined
    
    /** When set with some specific value, defines the number of time divisions split per hour(as per value given for the majorTimeSlot). Those time divisions are meant to be the minor
      * slots.
      * @Default {2}
      */
    var minorSlotCount: js.UndefOr[Double] = js.undefined
    
    /** Template design that customizes the timecells (minor slots) that are partitioned based on minorSlotCount. Accepts id value of the template defined for minor time slots.
      * @Default {null}
      */
    var minorSlotTemplateId: js.UndefOr[String] = js.undefined
  }
  object TimeScale {
    
    inline def apply(): TimeScale = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimeScale]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TimeScale] (val x: Self) extends AnyVal {
      
      inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
      
      inline def setMajorSlot(value: Double): Self = StObject.set(x, "majorSlot", value.asInstanceOf[js.Any])
      
      inline def setMajorSlotTemplateId(value: String): Self = StObject.set(x, "majorSlotTemplateId", value.asInstanceOf[js.Any])
      
      inline def setMajorSlotTemplateIdUndefined: Self = StObject.set(x, "majorSlotTemplateId", js.undefined)
      
      inline def setMajorSlotUndefined: Self = StObject.set(x, "majorSlot", js.undefined)
      
      inline def setMinorSlotCount(value: Double): Self = StObject.set(x, "minorSlotCount", value.asInstanceOf[js.Any])
      
      inline def setMinorSlotCountUndefined: Self = StObject.set(x, "minorSlotCount", js.undefined)
      
      inline def setMinorSlotTemplateId(value: String): Self = StObject.set(x, "minorSlotTemplateId", value.asInstanceOf[js.Any])
      
      inline def setMinorSlotTemplateIdUndefined: Self = StObject.set(x, "minorSlotTemplateId", js.undefined)
    }
  }
  
  trait TimeZoneCollection extends StObject {
    
    /** Sets the collection of timezone items to the dataSource that accepts either JSON object collection or DataManager (ej.DataManager) instance that contains Schedule timezones.
      */
    var dataSource: js.UndefOr[Any] = js.undefined
    
    /** Binds id field name in the dataSource to timeZoneCollection id.
      * @Default {id}
      */
    var id: js.UndefOr[String] = js.undefined
    
    /** Binds text field name in the dataSource to timeZoneCollection text. These text gets listed out in the timezone fields of the appointment window.
      * @Default {text}
      */
    var text: js.UndefOr[String] = js.undefined
    
    /** Binds value field name in the dataSource to timeZoneCollection value.
      * @Default {value}
      */
    var value: js.UndefOr[String] = js.undefined
  }
  object TimeZoneCollection {
    
    inline def apply(): TimeZoneCollection = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimeZoneCollection]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TimeZoneCollection] (val x: Self) extends AnyVal {
      
      inline def setDataSource(value: Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait TooltipSettings extends StObject {
    
    /** Enables or disables the tooltip display.
      * @Default {false}
      */
    var enable: js.UndefOr[Boolean] = js.undefined
    
    /** Template design that customizes the tooltip. All the field names that are mapped from dataSource to the appropriate field properties within the appointmentSettings can be accessed
      * within the template.
      * @Default {null}
      */
    var templateId: js.UndefOr[String] = js.undefined
  }
  object TooltipSettings {
    
    inline def apply(): TooltipSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooltipSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TooltipSettings] (val x: Self) extends AnyVal {
      
      inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
      
      inline def setTemplateId(value: String): Self = StObject.set(x, "templateId", value.asInstanceOf[js.Any])
      
      inline def setTemplateIdUndefined: Self = StObject.set(x, "templateId", js.undefined)
    }
  }
  
  trait WorkHours extends StObject {
    
    /** Sets the end time to depict the end of working or business hour in a day.
      * @Default {18}
      */
    var end: js.UndefOr[Double] = js.undefined
    
    /** When set to true, highlights the work hours of the Schedule.
      * @Default {true}
      */
    var highlight: js.UndefOr[Boolean] = js.undefined
    
    /** Sets the start time to depict the start of working or business hour in a day.
      * @Default {9}
      */
    var start: js.UndefOr[Double] = js.undefined
  }
  object WorkHours {
    
    inline def apply(): WorkHours = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorkHours]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WorkHours] (val x: Self) extends AnyVal {
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setHighlight(value: Boolean): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
      
      inline def setHighlightUndefined: Self = StObject.set(x, "highlight", js.undefined)
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
}
