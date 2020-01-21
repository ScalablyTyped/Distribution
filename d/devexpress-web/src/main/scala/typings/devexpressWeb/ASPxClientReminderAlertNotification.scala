package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains information related to the reminder alert.
  */
@JSGlobal("ASPxClientReminderAlertNotification")
@js.native
class ASPxClientReminderAlertNotification () extends js.Object {
  /**
    * Gets the appointment associated with the triggered reminder.
    */
  var appointment: ASPxClientAppointment = js.native
  /**
    * Gets or sets whether the reminder is handled and therefore no default processing is required.
    */
  var handled: Boolean = js.native
  /**
    * Gets or sets whether an alert is invoked for a particular reminder.
    */
  var ignore: Boolean = js.native
  /**
    * Returns the triggered reminder.
    */
  var reminder: ASPxClientReminder = js.native
  /**
    * Gets the appointment associated with the reminder.
    */
  def GetAppointment(): ASPxClientAppointment = js.native
  /**
    * Gets the triggered reminder.
    */
  def GetReminder(): ASPxClientReminder = js.native
  /**
    * Gets the triggered reminder's ID.
    */
  def GetReminderId(): String = js.native
}

