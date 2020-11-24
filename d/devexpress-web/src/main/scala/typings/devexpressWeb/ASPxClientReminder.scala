package typings.devexpressWeb

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client-side equivalent of the Reminder class.
  */
@js.native
trait ASPxClientReminder extends js.Object {
  
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
  
  @scala.inline
  implicit class ASPxClientReminderOps[Self <: ASPxClientReminder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDismiss(value: () => Unit): Self = this.set("Dismiss", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAlertTime(value: () => Date): Self = this.set("GetAlertTime", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCustomField(value: String => js.Any): Self = this.set("GetCustomField", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetId(value: () => String): Self = this.set("GetId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTimeBeforeStart(value: () => Date): Self = this.set("GetTimeBeforeStart", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSnooze(value: Double => Unit): Self = this.set("Snooze", js.Any.fromFunction1(value))
  }
}
