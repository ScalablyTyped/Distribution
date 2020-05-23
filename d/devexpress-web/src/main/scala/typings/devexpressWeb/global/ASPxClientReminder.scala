package typings.devexpressWeb.global

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the Reminder class.
  */
@JSGlobal("ASPxClientReminder")
@js.native
class ASPxClientReminder ()
  extends typings.devexpressWeb.ASPxClientReminder {
  /**
    * Switches the reminder off for the associated appointment.
    */
  /* CompleteClass */
  override def Dismiss(): Unit = js.native
  /**
    * Returns the date and time when the reminder is alerted.
    */
  /* CompleteClass */
  override def GetAlertTime(): Date = js.native
  /**
    * Gets the custom field bound to the reminder. An object representing the custom field.
    * @param key A string object representing the custom field's ID.
    */
  /* CompleteClass */
  override def GetCustomField(key: String): js.Any = js.native
  /**
    * Gets the reminder's ID.
    */
  /* CompleteClass */
  override def GetId(): String = js.native
  /**
    * Gets the time interval before the appointment's start time.
    */
  /* CompleteClass */
  override def GetTimeBeforeStart(): Date = js.native
  /**
    * Delays the reminder's alert until the alert time has increased by the specified interval.
    * @param remindAfter An integer value that is the time interval.
    */
  /* CompleteClass */
  override def Snooze(remindAfter: Double): Unit = js.native
}

