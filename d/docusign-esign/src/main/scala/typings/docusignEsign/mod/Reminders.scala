package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Reminders extends js.Object {
  
  /**
    * An integer specifying the number of days after the recipient receives the envelope that reminder emails are sent to the recipient.
    */
  var reminderDelay: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the envelope expires and is no longer available for signing after the specified number of days. When **false**,
    * the account default setting is used. If the account does not have an expiration setting, the DocuSign default value of 120 days is used.
    */
  var reminderEnabled: js.UndefOr[String] = js.native
  
  /**
    * An integer specifying the interval in days between reminder emails.
    */
  var reminderFrequency: js.UndefOr[String] = js.native
}
object Reminders {
  
  @scala.inline
  def apply(): Reminders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Reminders]
  }
  
  @scala.inline
  implicit class RemindersOps[Self <: Reminders] (val x: Self) extends AnyVal {
    
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
    def setReminderDelay(value: String): Self = this.set("reminderDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReminderDelay: Self = this.set("reminderDelay", js.undefined)
    
    @scala.inline
    def setReminderEnabled(value: String): Self = this.set("reminderEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReminderEnabled: Self = this.set("reminderEnabled", js.undefined)
    
    @scala.inline
    def setReminderFrequency(value: String): Self = this.set("reminderFrequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReminderFrequency: Self = this.set("reminderFrequency", js.undefined)
  }
}
