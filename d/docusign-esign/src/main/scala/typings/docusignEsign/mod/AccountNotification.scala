package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountNotification extends js.Object {
  
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
  implicit class AccountNotificationOps[Self <: AccountNotification] (val x: Self) extends AnyVal {
    
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
    def setExpirations(
      value: /* A complex element that specifies the expiration settings for the envelope. */ Expirations
    ): Self = this.set("expirations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpirations: Self = this.set("expirations", js.undefined)
    
    @scala.inline
    def setReminders(value: /* A complex element that specifies reminder settings for the envelope. */ Reminders): Self = this.set("reminders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReminders: Self = this.set("reminders", js.undefined)
    
    @scala.inline
    def setUserOverrideEnabled(value: String): Self = this.set("userOverrideEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserOverrideEnabled: Self = this.set("userOverrideEnabled", js.undefined)
  }
}
