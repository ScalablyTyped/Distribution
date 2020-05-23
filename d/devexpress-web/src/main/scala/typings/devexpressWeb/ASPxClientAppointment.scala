package typings.devexpressWeb

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the Appointment class.
  */
trait ASPxClientAppointment extends js.Object {
  /**
    * Returns the client appointment ID.
    */
  var appointmentId: String
  /**
    * Gets the appointment type.
    */
  var appointmentType: ASPxAppointmentType
  /**
    * Gets or sets the time interval of the time cells covered by the current appointment.
    */
  var interval: ASPxClientTimeInterval
  /**
    * Returns the label's index.
    */
  var labelIndex: Double
  /**
    * Gets resources associated with the appointment.
    */
  var resources: js.Array[String]
  /**
    * Gets the status index.
    */
  var statusIndex: Double
  /**
    * Adds a resource to the collection of resources associated with the client appointment.
    * @param resourceId An object, representing the resource id.
    */
  def AddResource(resourceId: String): Unit
  /**
    * Returns a value specifying whether the current appointment lasts the entire day.
    */
  def GetAllDay(): Boolean
  /**
    * Returns the appointment type.
    */
  def GetAppointmentType(): ASPxAppointmentType
  /**
    * Gets the description of the appointment.
    */
  def GetDescription(): String
  /**
    * Returns the duration of the appointment.
    */
  def GetDuration(): Double
  /**
    * Gets the end date and time of the appointment.
    */
  def GetEnd(): Date
  /**
    * Gets the ID of the client appointment.
    */
  def GetId(): String
  /**
    * Gets or sets the integer identifier of the label object associated with the appointment.
    */
  def GetLabelId(): Double
  /**
    * Gets or sets the text that specifies a place where the appointment is scheduled.
    */
  def GetLocation(): String
  /**
    * Gets the property value of the client appointment corresponding to the Appointment.RecurrenceInfo appointment property.
    */
  def GetRecurrenceInfo(): ASPxClientRecurrenceInfo
  /**
    * Gets the appointment that is the Appointment.RecurrencePattern for the current appointment.
    */
  def GetRecurrencePattern(): ASPxClientAppointment
  /**
    * Gets the resource associated with the client-side appointment by its index. An identifier of the specified resource (IPersistentObject.Id)
    * @param index An integer, representing an index of a resource in a resource collection associated with the current appointment.
    */
  def GetResource(index: Double): String
  /**
    * Gets the start date and time of the appointment.
    */
  def GetStart(): Date
  /**
    * Gets or sets the integer identifier of the status object associated with the appointment.
    */
  def GetStatusId(): Double
  /**
    * Gets or sets the appointment's subject text.
    */
  def GetSubject(): String
  /**
    * Specifies the property value of the client appointment corresponding to the Appointment.AllDay appointment property.
    * @param allDay true to indicate the all-day appointment; otherwise, false.
    */
  def SetAllDay(allDay: Boolean): Unit
  /**
    * Specifies the type of the current client appointment.
    * @param type An ASPxAppointmentType enumeration value indicating the appointment type.
    */
  def SetAppointmentType(`type`: ASPxAppointmentType): Unit
  /**
    * Sets the property value of the client appointment, corresponding to the Appointment.Description appointment property.
    * @param description A string representing the appointment description.
    */
  def SetDescription(description: String): Unit
  /**
    * Sets the property value of the client appointment, corresponding to the Appointment.Duration appointment property.
    * @param duration A TimeSpan object representing the appointment duration.
    */
  def SetDuration(duration: js.Any): Unit
  /**
    * Sets the property value of the client appointment, corresponding to the Appointment.End appointment property.
    * @param end A JavaScript Date object representing the end of the appointment.
    */
  def SetEnd(end: Date): Unit
  /**
    * Sets the ID of the client appointment.
    * @param id An string value representing the appointment identifier.
    */
  def SetId(id: String): Unit
  /**
    * Sets the property value of the client appointment, corresponding to the Appointment.LabelId appointment property.
    * @param statusId An integer representing the index of the label in the AppointmentStorage.Labels label collection.
    */
  def SetLabelId(statusId: Double): Unit
  /**
    * Sets the property value of the client appointment, corresponding to the Appointment.Location appointment property.
    * @param location A string representing the appointment location.
    */
  def SetLocation(location: String): Unit
  /**
    * Sets the property value of the client appointment, corresponding to the Appointment.RecurrenceInfo appointment property.
    * @param recurrenceInfo An ASPxClientRecurrenceInfo object representing the recurrence information.
    */
  def SetRecurrenceInfo(recurrenceInfo: ASPxClientRecurrenceInfo): Unit
  /**
    * Sets the property value of the client appointment, corresponding to the Appointment.Start appointment property.
    * @param start A JavaScript Date object representing the appointment start.
    */
  def SetStart(start: Date): Unit
  /**
    * Sets the property value of the client appointment, corresponding to the Appointment.StatusId appointment property.
    * @param statusId An integer representing the index in the AppointmentStatusCollection.
    */
  def SetStatusId(statusId: Double): Unit
  /**
    * Sets the property value of the client appointment, corresponding to the Appointment.Subject appointment property.
    * @param subject A string containing the appointment subject.
    */
  def SetSubject(subject: String): Unit
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
}

