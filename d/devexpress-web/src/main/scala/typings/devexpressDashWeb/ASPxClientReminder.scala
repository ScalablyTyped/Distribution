package typings.devexpressDashWeb

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the Reminder class.
  */
@JSGlobal("ASPxClientReminder")
@js.native
class ASPxClientReminder () extends js.Object {
  /**
    * Switches the reminder off for the associated appointment.
    */
  def Dismiss(): Unit = js.native
  /**
    * Returns the date and time when the reminder is alerted.
    */
  def GetAlertTime(): Date = js.native
  /**
    * Gets the custom field bound to the reminder. An object representing the custom field.
    * @param key A string object representing the custom field's ID.
    */
  def GetCustomField(key: String): js.Any = js.native
  /**
    * Gets the reminder's ID.
    */
  def GetId(): String = js.native
  /**
    * Gets the time interval before the appointment's start time.
    */
  def GetTimeBeforeStart(): Date = js.native
  /**
    * Delays the reminder's alert until the alert time has increased by the specified interval.
    * @param remindAfter An integer value that is the time interval.
    */
  def Snooze(remindAfter: Double): Unit = js.native
}

