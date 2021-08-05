package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Reminders extends StObject {
  
  /**
    * An integer specifying the number of days after the recipient receives the envelope that reminder emails are sent to the recipient.
    */
  var reminderDelay: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, the envelope expires and is no longer available for signing after the specified number of days. When **false**,
    * the account default setting is used. If the account does not have an expiration setting, the DocuSign default value of 120 days is used.
    */
  var reminderEnabled: js.UndefOr[String] = js.undefined
  
  /**
    * An integer specifying the interval in days between reminder emails.
    */
  var reminderFrequency: js.UndefOr[String] = js.undefined
}
object Reminders {
  
  inline def apply(): Reminders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Reminders]
  }
  
  extension [Self <: Reminders](x: Self) {
    
    inline def setReminderDelay(value: String): Self = StObject.set(x, "reminderDelay", value.asInstanceOf[js.Any])
    
    inline def setReminderDelayUndefined: Self = StObject.set(x, "reminderDelay", js.undefined)
    
    inline def setReminderEnabled(value: String): Self = StObject.set(x, "reminderEnabled", value.asInstanceOf[js.Any])
    
    inline def setReminderEnabledUndefined: Self = StObject.set(x, "reminderEnabled", js.undefined)
    
    inline def setReminderFrequency(value: String): Self = StObject.set(x, "reminderFrequency", value.asInstanceOf[js.Any])
    
    inline def setReminderFrequencyUndefined: Self = StObject.set(x, "reminderFrequency", js.undefined)
  }
}
