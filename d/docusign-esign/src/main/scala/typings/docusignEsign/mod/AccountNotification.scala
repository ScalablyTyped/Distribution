package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountNotification extends StObject {
  
  /**
    * A complex element that specifies the expiration settings for the envelope.
    */
  var expirations: js.UndefOr[
    /* A complex element that specifies the expiration settings for the envelope. */ Expirations
  ] = js.native
  
  /**
    * A complex element that specifies reminder settings for the envelope
    */
  var reminders: js.UndefOr[
    /* A complex element that specifies reminder settings for the envelope. */ Reminders
  ] = js.native
  
  /**
    * When **true**, the user can override envelope expirations.
    */
  var userOverrideEnabled: js.UndefOr[String] = js.native
}
object AccountNotification {
  
  @scala.inline
  def apply(): AccountNotification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountNotification]
  }
  
  @scala.inline
  implicit class AccountNotificationMutableBuilder[Self <: AccountNotification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpirations(
      value: /* A complex element that specifies the expiration settings for the envelope. */ Expirations
    ): Self = StObject.set(x, "expirations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationsUndefined: Self = StObject.set(x, "expirations", js.undefined)
    
    @scala.inline
    def setReminders(value: /* A complex element that specifies reminder settings for the envelope. */ Reminders): Self = StObject.set(x, "reminders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemindersUndefined: Self = StObject.set(x, "reminders", js.undefined)
    
    @scala.inline
    def setUserOverrideEnabled(value: String): Self = StObject.set(x, "userOverrideEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserOverrideEnabledUndefined: Self = StObject.set(x, "userOverrideEnabled", js.undefined)
  }
}
