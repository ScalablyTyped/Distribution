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
    AddResource: js.Function1[java.lang.String, scala.Unit],
    GetAllDay: js.Function0[scala.Boolean],
    GetAppointmentType: js.Function0[ASPxAppointmentType],
    GetDescription: js.Function0[java.lang.String],
    GetDuration: js.Function0[scala.Double],
    GetEnd: js.Function0[stdLib.Date],
    GetId: js.Function0[java.lang.String],
    GetLabelId: js.Function0[scala.Double],
    GetLocation: js.Function0[java.lang.String],
    GetRecurrenceInfo: js.Function0[ASPxClientRecurrenceInfo],
    GetRecurrencePattern: js.Function0[ASPxClientAppointment],
    GetResource: js.Function1[scala.Double, java.lang.String],
    GetStart: js.Function0[stdLib.Date],
    GetStatusId: js.Function0[scala.Double],
    GetSubject: js.Function0[java.lang.String],
    SetAllDay: js.Function1[scala.Boolean, scala.Unit],
    SetAppointmentType: js.Function1[ASPxAppointmentType, scala.Unit],
    SetDescription: js.Function1[java.lang.String, scala.Unit],
    SetDuration: js.Function1[js.Any, scala.Unit],
    SetEnd: js.Function1[stdLib.Date, scala.Unit],
    SetId: js.Function1[java.lang.String, scala.Unit],
    SetLabelId: js.Function1[scala.Double, scala.Unit],
    SetLocation: js.Function1[java.lang.String, scala.Unit],
    SetRecurrenceInfo: js.Function1[ASPxClientRecurrenceInfo, scala.Unit],
    SetStart: js.Function1[stdLib.Date, scala.Unit],
    SetStatusId: js.Function1[scala.Double, scala.Unit],
    SetSubject: js.Function1[java.lang.String, scala.Unit],
    appointmentId: java.lang.String,
    appointmentType: ASPxAppointmentType,
    interval: ASPxClientTimeInterval,
    labelIndex: scala.Double,
    resources: js.Array[java.lang.String],
    statusIndex: scala.Double
  ): ASPxClientAppointment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AddResource")(AddResource)
    __obj.updateDynamic("GetAllDay")(GetAllDay)
    __obj.updateDynamic("GetAppointmentType")(GetAppointmentType)
    __obj.updateDynamic("GetDescription")(GetDescription)
    __obj.updateDynamic("GetDuration")(GetDuration)
    __obj.updateDynamic("GetEnd")(GetEnd)
    __obj.updateDynamic("GetId")(GetId)
    __obj.updateDynamic("GetLabelId")(GetLabelId)
    __obj.updateDynamic("GetLocation")(GetLocation)
    __obj.updateDynamic("GetRecurrenceInfo")(GetRecurrenceInfo)
    __obj.updateDynamic("GetRecurrencePattern")(GetRecurrencePattern)
    __obj.updateDynamic("GetResource")(GetResource)
    __obj.updateDynamic("GetStart")(GetStart)
    __obj.updateDynamic("GetStatusId")(GetStatusId)
    __obj.updateDynamic("GetSubject")(GetSubject)
    __obj.updateDynamic("SetAllDay")(SetAllDay)
    __obj.updateDynamic("SetAppointmentType")(SetAppointmentType)
    __obj.updateDynamic("SetDescription")(SetDescription)
    __obj.updateDynamic("SetDuration")(SetDuration)
    __obj.updateDynamic("SetEnd")(SetEnd)
    __obj.updateDynamic("SetId")(SetId)
    __obj.updateDynamic("SetLabelId")(SetLabelId)
    __obj.updateDynamic("SetLocation")(SetLocation)
    __obj.updateDynamic("SetRecurrenceInfo")(SetRecurrenceInfo)
    __obj.updateDynamic("SetStart")(SetStart)
    __obj.updateDynamic("SetStatusId")(SetStatusId)
    __obj.updateDynamic("SetSubject")(SetSubject)
    __obj.updateDynamic("appointmentId")(appointmentId)
    __obj.updateDynamic("appointmentType")(appointmentType)
    __obj.updateDynamic("interval")(interval)
    __obj.updateDynamic("labelIndex")(labelIndex)
    __obj.updateDynamic("resources")(resources)
    __obj.updateDynamic("statusIndex")(statusIndex)
    __obj.asInstanceOf[ASPxClientAppointment]
  }
}

