package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the Appointment class.
  */
trait ASPxClientAppointment extends js.Object {
  /**
    * Returns the client appointment ID.
    * Value: A string value representing the client appointment's ID.
    */
  var appointmentId: java.lang.String
  /**
    * Gets the appointment type.
    * Value: A <see cref="ASPxAppointmentType" /> enumeration member.
    */
  var appointmentType: ASPxAppointmentType
  /**
    * Gets or sets the time interval of the time cells covered by the current appointment.
    * Value: A ASPxClientTimeInterval object which represents the time interval.
    */
  var interval: ASPxClientTimeInterval
  /**
    * Returns the label's index.
    * Value: An integer value specifying the index of the label in the labels collection.
    */
  var labelIndex: scala.Double
  /**
    * Gets resources associated with the appointment.
    * Value: An array of string values that are resources.
    */
  var resources: js.Array[java.lang.String]
  /**
    * Gets the status index.
    * Value: An integer value representing the index of the status.
    */
  var statusIndex: scala.Double
  /**
    * Adds a resource to the collection of resources associated with the client appointment.
    * @param resourceId An object, representing the resource id.
    */
  def AddResource(resourceId: java.lang.String): scala.Unit
  /**
    * Returns a value specifying whether the current appointment lasts the entire day.
    */
  def GetAllDay(): scala.Boolean
  /**
    * Returns the appointment type.
    */
  def GetAppointmentType(): ASPxAppointmentType
  /**
    * Gets the description of the appointment.
    */
  def GetDescription(): java.lang.String
  /**
    * Returns the duration of the appointment.
    */
  def GetDuration(): scala.Double
  /**
    * Gets the end date and time of the appointment.
    */
  def GetEnd(): stdLib.Date
  /**
    * Gets the ID of the client appointment.
    */
  def GetId(): java.lang.String
  /**
    * Gets or sets the integer identifier of the label object associated with the appointment.
    */
  def GetLabelId(): scala.Double
  /**
    * Gets or sets the text that specifies a place where the appointment is scheduled.
    */
  def GetLocation(): java.lang.String
  /**
    * Gets the property value of the client appointment corresponding to the RecurrenceInfo appointment property.
    */
  def GetRecurrenceInfo(): ASPxClientRecurrenceInfo
  /**
    * Gets the appointment that is the RecurrencePattern for the current appointment.
    */
  def GetRecurrencePattern(): ASPxClientAppointment
  /**
    * Gets the resource associated with the client-side appointment by its index.
    * @param index An integer, representing an index of a resource in a resource collection associated with the current appointment.
    */
  def GetResource(index: scala.Double): java.lang.String
  /**
    * Gets the start date and time of the appointment.
    */
  def GetStart(): stdLib.Date
  /**
    * Gets or sets the integer identifier of the status object associated with the appointment.
    */
  def GetStatusId(): scala.Double
  /**
    * Gets or sets the appointment's subject text.
    */
  def GetSubject(): java.lang.String
  /**
    * Specifies the property value of the client appointment corresponding to the AllDay appointment property.
    * @param allDay true to indicate the all-day appointment; otherwise, false.
    */
  def SetAllDay(allDay: scala.Boolean): scala.Unit
  /**
    * Specifies the type of the current client appointment.
    * @param type An ASPxAppointmentType enumeration value indicating the appointment type.
    */
  def SetAppointmentType(`type`: ASPxAppointmentType): scala.Unit
  /**
    * Sets the property value of the client appointment, corresponding to the Description appointment property.
    * @param description A string representing the appointment description.
    */
  def SetDescription(description: java.lang.String): scala.Unit
  /**
    * Sets the property value of the client appointment, corresponding to the Duration appointment property.
    * @param duration A TimeSpan object representing the appointment duration.
    */
  def SetDuration(duration: js.Any): scala.Unit
  /**
    * Sets the property value of the client appointment, corresponding to the End appointment property.
    * @param end A JavaScript Date object representing the end of the appointment.
    */
  def SetEnd(end: stdLib.Date): scala.Unit
  /**
    * Sets the ID of the client appointment.
    * @param id An string value representing the appointment identifier.
    */
  def SetId(id: java.lang.String): scala.Unit
  /**
    * Sets the property value of the client appointment, corresponding to the LabelId appointment property.
    * @param statusId An integer representing the index of the label in the Labels label collection.
    */
  def SetLabelId(statusId: scala.Double): scala.Unit
  /**
    * Sets the property value of the client appointment, corresponding to the Location appointment property.
    * @param location A string representing the appointment location.
    */
  def SetLocation(location: java.lang.String): scala.Unit
  /**
    * Sets the property value of the client appointment, corresponding to the RecurrenceInfo appointment property.
    * @param recurrenceInfo An ASPxClientRecurrenceInfo object representing the recurrence information.
    */
  def SetRecurrenceInfo(recurrenceInfo: ASPxClientRecurrenceInfo): scala.Unit
  /**
    * Sets the property value of the client appointment, corresponding to the Start appointment property.
    * @param start A JavaScript Date object representing the appointment start.
    */
  def SetStart(start: stdLib.Date): scala.Unit
  /**
    * Sets the property value of the client appointment, corresponding to the StatusId appointment property.
    * @param statusId An integer representing the index in the AppointmentStatusCollection.
    */
  def SetStatusId(statusId: scala.Double): scala.Unit
  /**
    * Sets the property value of the client appointment, corresponding to the Subject appointment property.
    * @param subject A string containing the appointment subject.
    */
  def SetSubject(subject: java.lang.String): scala.Unit
}

object ASPxClientAppointment {
  @scala.inline
  def apply(
    AddResource: java.lang.String => scala.Unit,
    GetAllDay: () => scala.Boolean,
    GetAppointmentType: () => ASPxAppointmentType,
    GetDescription: () => java.lang.String,
    GetDuration: () => scala.Double,
    GetEnd: () => stdLib.Date,
    GetId: () => java.lang.String,
    GetLabelId: () => scala.Double,
    GetLocation: () => java.lang.String,
    GetRecurrenceInfo: () => ASPxClientRecurrenceInfo,
    GetRecurrencePattern: () => ASPxClientAppointment,
    GetResource: scala.Double => java.lang.String,
    GetStart: () => stdLib.Date,
    GetStatusId: () => scala.Double,
    GetSubject: () => java.lang.String,
    SetAllDay: scala.Boolean => scala.Unit,
    SetAppointmentType: ASPxAppointmentType => scala.Unit,
    SetDescription: java.lang.String => scala.Unit,
    SetDuration: js.Any => scala.Unit,
    SetEnd: stdLib.Date => scala.Unit,
    SetId: java.lang.String => scala.Unit,
    SetLabelId: scala.Double => scala.Unit,
    SetLocation: java.lang.String => scala.Unit,
    SetRecurrenceInfo: ASPxClientRecurrenceInfo => scala.Unit,
    SetStart: stdLib.Date => scala.Unit,
    SetStatusId: scala.Double => scala.Unit,
    SetSubject: java.lang.String => scala.Unit,
    appointmentId: java.lang.String,
    appointmentType: ASPxAppointmentType,
    interval: ASPxClientTimeInterval,
    labelIndex: scala.Double,
    resources: js.Array[java.lang.String],
    statusIndex: scala.Double
  ): ASPxClientAppointment = {
    val __obj = js.Dynamic.literal(AddResource = js.Any.fromFunction1(AddResource), GetAllDay = js.Any.fromFunction0(GetAllDay), GetAppointmentType = js.Any.fromFunction0(GetAppointmentType), GetDescription = js.Any.fromFunction0(GetDescription), GetDuration = js.Any.fromFunction0(GetDuration), GetEnd = js.Any.fromFunction0(GetEnd), GetId = js.Any.fromFunction0(GetId), GetLabelId = js.Any.fromFunction0(GetLabelId), GetLocation = js.Any.fromFunction0(GetLocation), GetRecurrenceInfo = js.Any.fromFunction0(GetRecurrenceInfo), GetRecurrencePattern = js.Any.fromFunction0(GetRecurrencePattern), GetResource = js.Any.fromFunction1(GetResource), GetStart = js.Any.fromFunction0(GetStart), GetStatusId = js.Any.fromFunction0(GetStatusId), GetSubject = js.Any.fromFunction0(GetSubject), SetAllDay = js.Any.fromFunction1(SetAllDay), SetAppointmentType = js.Any.fromFunction1(SetAppointmentType), SetDescription = js.Any.fromFunction1(SetDescription), SetDuration = js.Any.fromFunction1(SetDuration), SetEnd = js.Any.fromFunction1(SetEnd), SetId = js.Any.fromFunction1(SetId), SetLabelId = js.Any.fromFunction1(SetLabelId), SetLocation = js.Any.fromFunction1(SetLocation), SetRecurrenceInfo = js.Any.fromFunction1(SetRecurrenceInfo), SetStart = js.Any.fromFunction1(SetStart), SetStatusId = js.Any.fromFunction1(SetStatusId), SetSubject = js.Any.fromFunction1(SetSubject), appointmentId = appointmentId, appointmentType = appointmentType, interval = interval, labelIndex = labelIndex, resources = resources, statusIndex = statusIndex)
  
    __obj.asInstanceOf[ASPxClientAppointment]
  }
}

