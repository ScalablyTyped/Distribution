package typings.devexpressWeb.global

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client-side equivalent of the Appointment class.
  */
@JSGlobal("ASPxClientAppointment")
@js.native
class ASPxClientAppointment ()
  extends StObject
     with typings.devexpressWeb.ASPxClientAppointment {
  
  /**
    * Adds a resource to the collection of resources associated with the client appointment.
    * @param resourceId An object, representing the resource id.
    */
  /* CompleteClass */
  override def AddResource(resourceId: String): Unit = js.native
  
  /**
    * Returns a value specifying whether the current appointment lasts the entire day.
    */
  /* CompleteClass */
  override def GetAllDay(): Boolean = js.native
  
  /**
    * Returns the appointment type.
    */
  /* CompleteClass */
  override def GetAppointmentType(): typings.devexpressWeb.ASPxAppointmentType = js.native
  
  /**
    * Gets the description of the appointment.
    */
  /* CompleteClass */
  override def GetDescription(): String = js.native
  
  /**
    * Returns the duration of the appointment.
    */
  /* CompleteClass */
  override def GetDuration(): Double = js.native
  
  /**
    * Gets the end date and time of the appointment.
    */
  /* CompleteClass */
  override def GetEnd(): Date = js.native
  
  /**
    * Gets the ID of the client appointment.
    */
  /* CompleteClass */
  override def GetId(): String = js.native
  
  /**
    * Gets or sets the integer identifier of the label object associated with the appointment.
    */
  /* CompleteClass */
  override def GetLabelId(): Double = js.native
  
  /**
    * Gets or sets the text that specifies a place where the appointment is scheduled.
    */
  /* CompleteClass */
  override def GetLocation(): String = js.native
  
  /**
    * Gets the property value of the client appointment corresponding to the Appointment.RecurrenceInfo appointment property.
    */
  /* CompleteClass */
  override def GetRecurrenceInfo(): typings.devexpressWeb.ASPxClientRecurrenceInfo = js.native
  
  /**
    * Gets the appointment that is the Appointment.RecurrencePattern for the current appointment.
    */
  /* CompleteClass */
  override def GetRecurrencePattern(): typings.devexpressWeb.ASPxClientAppointment = js.native
  
  /**
    * Gets the resource associated with the client-side appointment by its index. An identifier of the specified resource (IPersistentObject.Id)
    * @param index An integer, representing an index of a resource in a resource collection associated with the current appointment.
    */
  /* CompleteClass */
  override def GetResource(index: Double): String = js.native
  
  /**
    * Gets the start date and time of the appointment.
    */
  /* CompleteClass */
  override def GetStart(): Date = js.native
  
  /**
    * Gets or sets the integer identifier of the status object associated with the appointment.
    */
  /* CompleteClass */
  override def GetStatusId(): Double = js.native
  
  /**
    * Gets or sets the appointment's subject text.
    */
  /* CompleteClass */
  override def GetSubject(): String = js.native
  
  /**
    * Specifies the property value of the client appointment corresponding to the Appointment.AllDay appointment property.
    * @param allDay true to indicate the all-day appointment; otherwise, false.
    */
  /* CompleteClass */
  override def SetAllDay(allDay: Boolean): Unit = js.native
  
  /**
    * Specifies the type of the current client appointment.
    * @param type An ASPxAppointmentType enumeration value indicating the appointment type.
    */
  /* CompleteClass */
  override def SetAppointmentType(`type`: typings.devexpressWeb.ASPxAppointmentType): Unit = js.native
  
  /**
    * Sets the property value of the client appointment, corresponding to the Appointment.Description appointment property.
    * @param description A string representing the appointment description.
    */
  /* CompleteClass */
  override def SetDescription(description: String): Unit = js.native
  
  /**
    * Sets the property value of the client appointment, corresponding to the Appointment.Duration appointment property.
    * @param duration A TimeSpan object representing the appointment duration.
    */
  /* CompleteClass */
  override def SetDuration(duration: js.Any): Unit = js.native
  
  /**
    * Sets the property value of the client appointment, corresponding to the Appointment.End appointment property.
    * @param end A JavaScript Date object representing the end of the appointment.
    */
  /* CompleteClass */
  override def SetEnd(end: Date): Unit = js.native
  
  /**
    * Sets the ID of the client appointment.
    * @param id An string value representing the appointment identifier.
    */
  /* CompleteClass */
  override def SetId(id: String): Unit = js.native
  
  /**
    * Sets the property value of the client appointment, corresponding to the Appointment.LabelId appointment property.
    * @param statusId An integer representing the index of the label in the AppointmentStorage.Labels label collection.
    */
  /* CompleteClass */
  override def SetLabelId(statusId: Double): Unit = js.native
  
  /**
    * Sets the property value of the client appointment, corresponding to the Appointment.Location appointment property.
    * @param location A string representing the appointment location.
    */
  /* CompleteClass */
  override def SetLocation(location: String): Unit = js.native
  
  /**
    * Sets the property value of the client appointment, corresponding to the Appointment.RecurrenceInfo appointment property.
    * @param recurrenceInfo An ASPxClientRecurrenceInfo object representing the recurrence information.
    */
  /* CompleteClass */
  override def SetRecurrenceInfo(recurrenceInfo: typings.devexpressWeb.ASPxClientRecurrenceInfo): Unit = js.native
  
  /**
    * Sets the property value of the client appointment, corresponding to the Appointment.Start appointment property.
    * @param start A JavaScript Date object representing the appointment start.
    */
  /* CompleteClass */
  override def SetStart(start: Date): Unit = js.native
  
  /**
    * Sets the property value of the client appointment, corresponding to the Appointment.StatusId appointment property.
    * @param statusId An integer representing the index in the AppointmentStatusCollection.
    */
  /* CompleteClass */
  override def SetStatusId(statusId: Double): Unit = js.native
  
  /**
    * Sets the property value of the client appointment, corresponding to the Appointment.Subject appointment property.
    * @param subject A string containing the appointment subject.
    */
  /* CompleteClass */
  override def SetSubject(subject: String): Unit = js.native
  
  /**
    * Returns the client appointment ID.
    */
  /* CompleteClass */
  var appointmentId: String = js.native
  
  /**
    * Gets the appointment type.
    */
  /* CompleteClass */
  var appointmentType: typings.devexpressWeb.ASPxAppointmentType = js.native
  
  /**
    * Gets or sets the time interval of the time cells covered by the current appointment.
    */
  /* CompleteClass */
  var interval: typings.devexpressWeb.ASPxClientTimeInterval = js.native
  
  /**
    * Returns the label's index.
    */
  /* CompleteClass */
  var labelIndex: Double = js.native
  
  /**
    * Gets resources associated with the appointment.
    */
  /* CompleteClass */
  var resources: js.Array[String] = js.native
  
  /**
    * Gets the status index.
    */
  /* CompleteClass */
  var statusIndex: Double = js.native
}
