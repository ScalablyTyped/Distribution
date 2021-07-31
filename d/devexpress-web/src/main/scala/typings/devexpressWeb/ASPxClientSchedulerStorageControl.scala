package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the ASPxSchedulerStorageControl control.
  */
@js.native
trait ASPxClientSchedulerStorageControl
  extends StObject
     with ASPxClientControl {
  
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  var BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientSchedulerStorageControl]] = js.native
  
  /**
    * Fires on the client if any server error occurs during server-side processing of a callback sent by the ASPxClientSchedulerStorageControl.
    */
  var CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientSchedulerStorageControl]] = js.native
  
  /**
    * Client-side scripting  method to delete the specified appointment.
    * @param appointment An ASPxClientAppointment object representing the client-side appointment.
    */
  def DeleteAppointment(appointment: ASPxClientAppointment): Unit = js.native
  
  /**
    * Dismisses all reminders.
    */
  def DismissAllReminders(): Unit = js.native
  
  /**
    * Occurs on the client side after a callback's server-side processing has been completed.
    */
  var EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientSchedulerStorageControl]] = js.native
  
  /**
    * Client-side function that returns an appointment with the specified ID.
    * @param onSuccess A handler of a function which will receive and process the appointments.
    * @param appointmentId An appointment's identifier.
    */
  def GetAppointmentById(onSuccess: js.Function1[/* arg */ String, Unit], appointmentId: String): Unit = js.native
  
  /**
    * Retrieves the collection of appointments that are in the specified time interval and are assigned to the specified resources.
    * @param onSuccess A client action to perform if the server round-trip completed successfully.
    * @param interval An ASPxClientTimeInterval object specifying the required time interval.
    * @param resources An array of string values representing the resources' IDs.
    */
  def GetAppointments(onSuccess: js.Function1[/* arg */ String, Unit], interval: ASPxClientTimeInterval): Unit = js.native
  def GetAppointments(
    onSuccess: js.Function1[/* arg */ String, Unit],
    interval: ASPxClientTimeInterval,
    resources: js.Array[String]
  ): Unit = js.native
  
  /**
    * Returns the resource by its ID.
    * @param onSuccess A handler of a function which will receive and process the properties' values.
    * @param resourceId A string value specifying the resource ID.
    */
  def GetResourceById(onSuccess: js.Function1[/* arg */ String, Unit], resourceId: String): Unit = js.native
  
  /**
    * Retrieves the collection of resources.
    * @param onSuccess A client action to perform if the server round-trip has completed successfully.
    */
  def GetResources(onSuccess: js.Function1[/* arg */ String, Unit]): Unit = js.native
  
  /**
    * Client-side scripting method to insert the specified appointment.
    * @param appointment An ASPxClientAppointment object representing the client-side appointment.
    */
  def InsertAppointment(appointment: ASPxClientAppointment): Unit = js.native
  
  /**
    * Client-side scripting method which initiates a round trip to the server, so that the control will be reloaded.
    */
  def Refresh(): Unit = js.native
  
  /**
    * Occurs when a reminder is invoked.
    */
  var ReminderAlert: ASPxClientEvent[ReminderAlertEventHandler[ASPxClientSchedulerStorageControl]] = js.native
  
  /**
    * Snoozes all reminders.
    */
  def SnoozeAllReminders(): Unit = js.native
  
  /**
    * Client-side scripting method to update the specified appointment.
    * @param appointment An ASPxClientAppointment object representing the client-side appointment.
    */
  def UpdateAppointment(appointment: ASPxClientAppointment): Unit = js.native
}
