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
       * Gets the client appointment value that is equivalent in meaning to the AllDay property.
       * Value: true indicates the all-day appointment; otherwise, false.
       */
  var allDay: scala.Boolean
  /**
       * Gets the ID of an appointment for use in client-side scripts.
       * Value: A string representation of the appointment ID.
       */
  var appointmentId: java.lang.String
  /**
       * Gets the type of appointment for use in client-side scripts.
       * Value: An ASPxAppointmentType enumeration member, representing the appointment's type.
       */
  var appointmentType: ASPxAppointmentType
  /**
       * Gets the client appointment value that is equivalent in meaning to the Description property.
       * Value: A string, representing the description for an appointment.
       */
  var description: java.lang.String
  /**
       * Gets the time interval of the appointment for client-side scripting.
       * Value: An ASPxClientTimeInterval object, representing the interval assigned to an appointment.
       */
  var interval: ASPxClientTimeInterval
  /**
       * Gets  the index of the label object associated with the appointment for client-side scripting.
       * Value: An integer value that specifies the index of the corresponding Labels collection.
       */
  var labelIndex: scala.Double
  /**
       * Gets the client appointment value that is equivalent in meaning to the Location property.
       * Value: A string representing the appointment location.
       */
  var location: java.lang.String
  /**
       * Gets the identifiers of resources associated with the appointment for client-side scripting.
       * Value: An array of string representations for resource identifiers.
       */
  var resources: js.Array[java.lang.String]
  /**
       * Gets the index of the availability status object associated with the appointment.
       * Value: An integer value that specifies the index of the corresponding Statuses collection.
       */
  var statusIndex: scala.Double
  /**
       * Gets the client appointment value that is equivalent in meaning to the Subject property.
       * Value: A string representing the appointment subject.
       */
  var subject: java.lang.String
  /**
       * Adds a resource to the collection of resources associated with the client appointment.
       * @param resourceId An object, representing the resource id.
       */
  def AddResource(resourceId: js.Object): scala.Unit
  /**
       * Gets the property value of the client appointment corresponding to the AllDay appointment property.
       */
  def GetAllDay(): scala.Boolean
  /**
       * Gets the type of the client appointment.
       */
  def GetAppointmentType(): ASPxAppointmentType
  /**
       * Gets the property value of the client appointment corresponding to the Description appointment property.
       */
  def GetDescription(): java.lang.String
  /**
       * Gets the property value of the client appointment corresponding to the Duration appointment property.
       */
  def GetDuration(): scala.Double
  /**
       * Gets the property value of the client appointment corresponding to the End appointment property.
       */
  def GetEnd(): stdLib.Date
  /**
       * Gets the ID of the client appointment.
       */
  def GetId(): js.Object
  /**
       * Gets the property value of the client appointment corresponding to the LabelId appointment property.
       */
  def GetLabelId(): scala.Double
  /**
       * Gets the property value of the client appointment corresponding to the Location appointment property.
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
  def GetResource(index: scala.Double): js.Object
  /**
       * Gets the property value of the client appointment corresponding to the Start appointment property.
       */
  def GetStart(): stdLib.Date
  /**
       * Gets the property value of the client appointment corresponding to the StatusId appointment property.
       */
  def GetStatusId(): scala.Double
  /**
       * Gets the property value of the client appointment corresponding to the Subject appointment property.
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
       * @param id An object representing the appointment identifier.
       */
  def SetId(id: js.Object): scala.Unit
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

