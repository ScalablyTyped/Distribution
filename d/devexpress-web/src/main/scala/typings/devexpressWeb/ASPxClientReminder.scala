package typings.devexpressWeb

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the Reminder class.
  */
trait ASPxClientReminder extends js.Object {
  /**
    * Switches the reminder off for the associated appointment.
    */
  def Dismiss(): Unit
  /**
    * Returns the date and time when the reminder is alerted.
    */
  def GetAlertTime(): Date
  /**
    * Gets the custom field bound to the reminder. An object representing the custom field.
    * @param key A string object representing the custom field's ID.
    */
  def GetCustomField(key: String): js.Any
  /**
    * Gets the reminder's ID.
    */
  def GetId(): String
  /**
    * Gets the time interval before the appointment's start time.
    */
  def GetTimeBeforeStart(): Date
  /**
    * Delays the reminder's alert until the alert time has increased by the specified interval.
    * @param remindAfter An integer value that is the time interval.
    */
  def Snooze(remindAfter: Double): Unit
}

object ASPxClientReminder {
  @scala.inline
  def apply(
    Dismiss: () => Unit,
    GetAlertTime: () => Date,
    GetCustomField: String => js.Any,
    GetId: () => String,
    GetTimeBeforeStart: () => Date,
    Snooze: Double => Unit
  ): ASPxClientReminder = {
    val __obj = js.Dynamic.literal(Dismiss = js.Any.fromFunction0(Dismiss), GetAlertTime = js.Any.fromFunction0(GetAlertTime), GetCustomField = js.Any.fromFunction1(GetCustomField), GetId = js.Any.fromFunction0(GetId), GetTimeBeforeStart = js.Any.fromFunction0(GetTimeBeforeStart), Snooze = js.Any.fromFunction1(Snooze))
    __obj.asInstanceOf[ASPxClientReminder]
  }
}

