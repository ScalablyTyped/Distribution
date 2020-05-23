package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains information related to the reminder alert.
  */
@JSGlobal("ASPxClientReminderAlertNotification")
@js.native
class ASPxClientReminderAlertNotification ()
  extends typings.devexpressWeb.ASPxClientReminderAlertNotification {
  /**
    * Gets the appointment associated with the triggered reminder.
    */
  /* CompleteClass */
  override var appointment: typings.devexpressWeb.ASPxClientAppointment = js.native
  /**
    * Gets or sets whether the reminder is handled and therefore no default processing is required.
    */
  /* CompleteClass */
  override var handled: Boolean = js.native
  /**
    * Gets or sets whether an alert is invoked for a particular reminder.
    */
  /* CompleteClass */
  override var ignore: Boolean = js.native
  /**
    * Returns the triggered reminder.
    */
  /* CompleteClass */
  override var reminder: typings.devexpressWeb.ASPxClientReminder = js.native
  /**
    * Gets the appointment associated with the reminder.
    */
  /* CompleteClass */
  override def GetAppointment(): typings.devexpressWeb.ASPxClientAppointment = js.native
  /**
    * Gets the triggered reminder.
    */
  /* CompleteClass */
  override def GetReminder(): typings.devexpressWeb.ASPxClientReminder = js.native
  /**
    * Gets the triggered reminder's ID.
    */
  /* CompleteClass */
  override def GetReminderId(): String = js.native
}

