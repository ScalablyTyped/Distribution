package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountNotification extends StObject {
  
  /**
    * A complex element that specifies the expiration settings for the envelope.
    */
  var expirations: js.UndefOr[
    /* A complex element that specifies the expiration settings for the envelope. */ Expirations
  ] = js.undefined
  
  /**
    * A complex element that specifies reminder settings for the envelope
    */
  var reminders: js.UndefOr[
    /* A complex element that specifies reminder settings for the envelope. */ Reminders
  ] = js.undefined
  
  /**
    * When **true**, the user can override envelope expirations.
    */
  var userOverrideEnabled: js.UndefOr[String] = js.undefined
}
object AccountNotification {
  
  inline def apply(): AccountNotification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountNotification]
  }
  
  extension [Self <: AccountNotification](x: Self) {
    
    inline def setExpirations(
      value: /* A complex element that specifies the expiration settings for the envelope. */ Expirations
    ): Self = StObject.set(x, "expirations", value.asInstanceOf[js.Any])
    
    inline def setExpirationsUndefined: Self = StObject.set(x, "expirations", js.undefined)
    
    inline def setReminders(value: /* A complex element that specifies reminder settings for the envelope. */ Reminders): Self = StObject.set(x, "reminders", value.asInstanceOf[js.Any])
    
    inline def setRemindersUndefined: Self = StObject.set(x, "reminders", js.undefined)
    
    inline def setUserOverrideEnabled(value: String): Self = StObject.set(x, "userOverrideEnabled", value.asInstanceOf[js.Any])
    
    inline def setUserOverrideEnabledUndefined: Self = StObject.set(x, "userOverrideEnabled", js.undefined)
  }
}
