package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemplateNotificationRequest extends js.Object {
  
  /**
    * A complex element that specifies the expiration settings for the envelope.
    */
  var expirations: js.UndefOr[
    /* A complex element that specifies the expiration settings for the envelope. */ Expirations
  ] = js.native
  
  /**
    * The user's encrypted password hash.
    */
  var password: js.UndefOr[String] = js.native
  
  /**
    * A complex element that specifies reminder settings for the envelope
    */
  var reminders: js.UndefOr[
    /* A complex element that specifies reminder settings for the envelope. */ Reminders
  ] = js.native
  
  /**
    * When set to **true**, the account default notification settings are used for the envelope, overriding the reminders and expirations settings.
    * When set to **false**, the reminders and expirations settings specified in this request are used.
    */
  var useAccountDefaults: js.UndefOr[String] = js.native
}
object TemplateNotificationRequest {
  
  @scala.inline
  def apply(): TemplateNotificationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateNotificationRequest]
  }
  
  @scala.inline
  implicit class TemplateNotificationRequestOps[Self <: TemplateNotificationRequest] (val x: Self) extends AnyVal {
    
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
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    
    @scala.inline
    def setReminders(value: /* A complex element that specifies reminder settings for the envelope. */ Reminders): Self = this.set("reminders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReminders: Self = this.set("reminders", js.undefined)
    
    @scala.inline
    def setUseAccountDefaults(value: String): Self = this.set("useAccountDefaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseAccountDefaults: Self = this.set("useAccountDefaults", js.undefined)
  }
}
