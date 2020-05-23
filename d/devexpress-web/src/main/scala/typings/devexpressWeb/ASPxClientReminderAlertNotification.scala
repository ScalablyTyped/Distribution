package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains information related to the reminder alert.
  */
trait ASPxClientReminderAlertNotification extends js.Object {
  /**
    * Gets the appointment associated with the triggered reminder.
    */
  var appointment: ASPxClientAppointment
  /**
    * Gets or sets whether the reminder is handled and therefore no default processing is required.
    */
  var handled: Boolean
  /**
    * Gets or sets whether an alert is invoked for a particular reminder.
    */
  var ignore: Boolean
  /**
    * Returns the triggered reminder.
    */
  var reminder: ASPxClientReminder
  /**
    * Gets the appointment associated with the reminder.
    */
  def GetAppointment(): ASPxClientAppointment
  /**
    * Gets the triggered reminder.
    */
  def GetReminder(): ASPxClientReminder
  /**
    * Gets the triggered reminder's ID.
    */
  def GetReminderId(): String
}

object ASPxClientReminderAlertNotification {
  @scala.inline
  def apply(
    GetAppointment: () => ASPxClientAppointment,
    GetReminder: () => ASPxClientReminder,
    GetReminderId: () => String,
    appointment: ASPxClientAppointment,
    handled: Boolean,
    ignore: Boolean,
    reminder: ASPxClientReminder
  ): ASPxClientReminderAlertNotification = {
    val __obj = js.Dynamic.literal(GetAppointment = js.Any.fromFunction0(GetAppointment), GetReminder = js.Any.fromFunction0(GetReminder), GetReminderId = js.Any.fromFunction0(GetReminderId), appointment = appointment.asInstanceOf[js.Any], handled = handled.asInstanceOf[js.Any], ignore = ignore.asInstanceOf[js.Any], reminder = reminder.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientReminderAlertNotification]
  }
}

