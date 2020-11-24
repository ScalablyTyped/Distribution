package typings.devexpressWeb

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client-side equivalent of the Appointment class.
  */
@js.native
trait ASPxClientAppointment extends js.Object {
  
  /**
    * Adds a resource to the collection of resources associated with the client appointment.
    * @param resourceId An object, representing the resource id.
    */
  def AddResource(resourceId: String): Unit = js.native
  
  /**
    * Returns a value specifying whether the current appointment lasts the entire day.
    */
  def GetAllDay(): Boolean = js.native
  
  /**
    * Returns the appointment type.
    */
  def GetAppointmentType(): ASPxAppointmentType = js.native
  
  /**
    * Gets the description of the appointment.
    */
  def GetDescription(): String = js.native
  
  /**
    * Returns the duration of the appointment.
    */
  def GetDuration(): Double = js.native
  
  /**
    * Gets the end date and time of the appointment.
    */
  def GetEnd(): Date = js.native
  
  /**
    * Gets the ID of the client appointment.
    */
  def GetId(): String = js.native
  
  /**
    * Gets or sets the integer identifier of the label object associated with the appointment.
    */
  def GetLabelId(): Double = js.native
  
  /**
    * Gets or sets the text that specifies a place where the appointment is scheduled.
    */
  def GetLocation(): String = js.native
  
  /**
    * Gets the property value of the client appointment corresponding to the Appointment.RecurrenceInfo appointment property.
    */
  def GetRecurrenceInfo(): ASPxClientRecurrenceInfo = js.native
  
  /**
    * Gets the appointment that is the Appointment.RecurrencePattern for the current appointment.
    */
  def GetRecurrencePattern(): ASPxClientAppointment = js.native
  
  /**
    * Gets the resource associated with the client-side appointment by its index. An identifier of the specified resource (IPersistentObject.Id)
    * @param index An integer, representing an index of a resource in a resource collection associated with the current appointment.
    */
  def GetResource(index: Double): String = js.native
  
  /**
    * Gets the start date and time of the appointment.
    */
  def GetStart(): Date = js.native
  
  /**
    * Gets or sets the integer identifier of the status object associated with the appointment.
    */
  def GetStatusId(): Double = js.native
  
  /**
    * Gets or sets the appointment's subject text.
    */
  def GetSubject(): String = js.native
  
  /**
    * Specifies the property value of the client appointment corresponding to the Appointment.AllDay appointment property.
    * @param allDay true to indicate the all-day appointment; otherwise, false.
    */
  def SetAllDay(allDay: Boolean): Unit = js.native
  
  /**
    * Specifies the type of the current client appointment.
    * @param type An ASPxAppointmentType enumeration value indicating the appointment type.
    */
  def SetAppointmentType(`type`: ASPxAppointmentType): Unit = js.native
  
  /**
    * Sets the property value of the client appointment, corresponding to the Appointment.Description appointment property.
    * @param description A string representing the appointment description.
    */
  def SetDescription(description: String): Unit = js.native
  
  /**
    * Sets the property value of the client appointment, corresponding to the Appointment.Duration appointment property.
    * @param duration A TimeSpan object representing the appointment duration.
    */
  def SetDuration(duration: js.Any): Unit = js.native
  
  /**
    * Sets the property value of the client appointment, corresponding to the Appointment.End appointment property.
    * @param end A JavaScript Date object representing the end of the appointment.
    */
  def SetEnd(end: Date): Unit = js.native
  
  /**
    * Sets the ID of the client appointment.
    * @param id An string value representing the appointment identifier.
    */
  def SetId(id: String): Unit = js.native
  
  /**
    * Sets the property value of the client appointment, corresponding to the Appointment.LabelId appointment property.
    * @param statusId An integer representing the index of the label in the AppointmentStorage.Labels label collection.
    */
  def SetLabelId(statusId: Double): Unit = js.native
  
  /**
    * Sets the property value of the client appointment, corresponding to the Appointment.Location appointment property.
    * @param location A string representing the appointment location.
    */
  def SetLocation(location: String): Unit = js.native
  
  /**
    * Sets the property value of the client appointment, corresponding to the Appointment.RecurrenceInfo appointment property.
    * @param recurrenceInfo An ASPxClientRecurrenceInfo object representing the recurrence information.
    */
  def SetRecurrenceInfo(recurrenceInfo: ASPxClientRecurrenceInfo): Unit = js.native
  
  /**
    * Sets the property value of the client appointment, corresponding to the Appointment.Start appointment property.
    * @param start A JavaScript Date object representing the appointment start.
    */
  def SetStart(start: Date): Unit = js.native
  
  /**
    * Sets the property value of the client appointment, corresponding to the Appointment.StatusId appointment property.
    * @param statusId An integer representing the index in the AppointmentStatusCollection.
    */
  def SetStatusId(statusId: Double): Unit = js.native
  
  /**
    * Sets the property value of the client appointment, corresponding to the Appointment.Subject appointment property.
    * @param subject A string containing the appointment subject.
    */
  def SetSubject(subject: String): Unit = js.native
  
  /**
    * Returns the client appointment ID.
    */
  var appointmentId: String = js.native
  
  /**
    * Gets the appointment type.
    */
  var appointmentType: ASPxAppointmentType = js.native
  
  /**
    * Gets or sets the time interval of the time cells covered by the current appointment.
    */
  var interval: ASPxClientTimeInterval = js.native
  
  /**
    * Returns the label's index.
    */
  var labelIndex: Double = js.native
  
  /**
    * Gets resources associated with the appointment.
    */
  var resources: js.Array[String] = js.native
  
  /**
    * Gets the status index.
    */
  var statusIndex: Double = js.native
}
object ASPxClientAppointment {
  
  @scala.inline
  def apply(
    AddResource: String => Unit,
    GetAllDay: () => Boolean,
    GetAppointmentType: () => ASPxAppointmentType,
    GetDescription: () => String,
    GetDuration: () => Double,
    GetEnd: () => Date,
    GetId: () => String,
    GetLabelId: () => Double,
    GetLocation: () => String,
    GetRecurrenceInfo: () => ASPxClientRecurrenceInfo,
    GetRecurrencePattern: () => ASPxClientAppointment,
    GetResource: Double => String,
    GetStart: () => Date,
    GetStatusId: () => Double,
    GetSubject: () => String,
    SetAllDay: Boolean => Unit,
    SetAppointmentType: ASPxAppointmentType => Unit,
    SetDescription: String => Unit,
    SetDuration: js.Any => Unit,
    SetEnd: Date => Unit,
    SetId: String => Unit,
    SetLabelId: Double => Unit,
    SetLocation: String => Unit,
    SetRecurrenceInfo: ASPxClientRecurrenceInfo => Unit,
    SetStart: Date => Unit,
    SetStatusId: Double => Unit,
    SetSubject: String => Unit,
    appointmentId: String,
    appointmentType: ASPxAppointmentType,
    interval: ASPxClientTimeInterval,
    labelIndex: Double,
    resources: js.Array[String],
    statusIndex: Double
  ): ASPxClientAppointment = {
    val __obj = js.Dynamic.literal(AddResource = js.Any.fromFunction1(AddResource), GetAllDay = js.Any.fromFunction0(GetAllDay), GetAppointmentType = js.Any.fromFunction0(GetAppointmentType), GetDescription = js.Any.fromFunction0(GetDescription), GetDuration = js.Any.fromFunction0(GetDuration), GetEnd = js.Any.fromFunction0(GetEnd), GetId = js.Any.fromFunction0(GetId), GetLabelId = js.Any.fromFunction0(GetLabelId), GetLocation = js.Any.fromFunction0(GetLocation), GetRecurrenceInfo = js.Any.fromFunction0(GetRecurrenceInfo), GetRecurrencePattern = js.Any.fromFunction0(GetRecurrencePattern), GetResource = js.Any.fromFunction1(GetResource), GetStart = js.Any.fromFunction0(GetStart), GetStatusId = js.Any.fromFunction0(GetStatusId), GetSubject = js.Any.fromFunction0(GetSubject), SetAllDay = js.Any.fromFunction1(SetAllDay), SetAppointmentType = js.Any.fromFunction1(SetAppointmentType), SetDescription = js.Any.fromFunction1(SetDescription), SetDuration = js.Any.fromFunction1(SetDuration), SetEnd = js.Any.fromFunction1(SetEnd), SetId = js.Any.fromFunction1(SetId), SetLabelId = js.Any.fromFunction1(SetLabelId), SetLocation = js.Any.fromFunction1(SetLocation), SetRecurrenceInfo = js.Any.fromFunction1(SetRecurrenceInfo), SetStart = js.Any.fromFunction1(SetStart), SetStatusId = js.Any.fromFunction1(SetStatusId), SetSubject = js.Any.fromFunction1(SetSubject), appointmentId = appointmentId.asInstanceOf[js.Any], appointmentType = appointmentType.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], labelIndex = labelIndex.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], statusIndex = statusIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientAppointment]
  }
  
  @scala.inline
  implicit class ASPxClientAppointmentOps[Self <: ASPxClientAppointment] (val x: Self) extends AnyVal {
    
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
    def setAddResource(value: String => Unit): Self = this.set("AddResource", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetAllDay(value: () => Boolean): Self = this.set("GetAllDay", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAppointmentType(value: () => ASPxAppointmentType): Self = this.set("GetAppointmentType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDescription(value: () => String): Self = this.set("GetDescription", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDuration(value: () => Double): Self = this.set("GetDuration", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetEnd(value: () => Date): Self = this.set("GetEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetId(value: () => String): Self = this.set("GetId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLabelId(value: () => Double): Self = this.set("GetLabelId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLocation(value: () => String): Self = this.set("GetLocation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRecurrenceInfo(value: () => ASPxClientRecurrenceInfo): Self = this.set("GetRecurrenceInfo", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRecurrencePattern(value: () => ASPxClientAppointment): Self = this.set("GetRecurrencePattern", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetResource(value: Double => String): Self = this.set("GetResource", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetStart(value: () => Date): Self = this.set("GetStart", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetStatusId(value: () => Double): Self = this.set("GetStatusId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSubject(value: () => String): Self = this.set("GetSubject", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetAllDay(value: Boolean => Unit): Self = this.set("SetAllDay", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetAppointmentType(value: ASPxAppointmentType => Unit): Self = this.set("SetAppointmentType", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDescription(value: String => Unit): Self = this.set("SetDescription", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDuration(value: js.Any => Unit): Self = this.set("SetDuration", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetEnd(value: Date => Unit): Self = this.set("SetEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetId(value: String => Unit): Self = this.set("SetId", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetLabelId(value: Double => Unit): Self = this.set("SetLabelId", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetLocation(value: String => Unit): Self = this.set("SetLocation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetRecurrenceInfo(value: ASPxClientRecurrenceInfo => Unit): Self = this.set("SetRecurrenceInfo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetStart(value: Date => Unit): Self = this.set("SetStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetStatusId(value: Double => Unit): Self = this.set("SetStatusId", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSubject(value: String => Unit): Self = this.set("SetSubject", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAppointmentId(value: String): Self = this.set("appointmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppointmentType(value: ASPxAppointmentType): Self = this.set("appointmentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterval(value: ASPxClientTimeInterval): Self = this.set("interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelIndex(value: Double): Self = this.set("labelIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesVarargs(value: String*): Self = this.set("resources", js.Array(value :_*))
    
    @scala.inline
    def setResources(value: js.Array[String]): Self = this.set("resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusIndex(value: Double): Self = this.set("statusIndex", value.asInstanceOf[js.Any])
  }
}
