package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationDefaults extends js.Object {
  
  /**
    * The default notification settings for envelopes sent by using the console.
    */
  var apiEmailNotifications: js.UndefOr[
    /* Contains details about the default notification settings for the envelope notifications that senders and signers receive. */ NotificationDefaultSettings
  ] = js.native
  
  /**
    * The default notification settings for envelopes sent by using the API.
    */
  var emailNotifications: js.UndefOr[
    /* Contains details about the default notification settings for the envelope notifications that senders and signers receive. */ NotificationDefaultSettings
  ] = js.native
}
object NotificationDefaults {
  
  @scala.inline
  def apply(): NotificationDefaults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationDefaults]
  }
  
  @scala.inline
  implicit class NotificationDefaultsOps[Self <: NotificationDefaults] (val x: Self) extends AnyVal {
    
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
    def setApiEmailNotifications(
      value: /* Contains details about the default notification settings for the envelope notifications that senders and signers receive. */ NotificationDefaultSettings
    ): Self = this.set("apiEmailNotifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiEmailNotifications: Self = this.set("apiEmailNotifications", js.undefined)
    
    @scala.inline
    def setEmailNotifications(
      value: /* Contains details about the default notification settings for the envelope notifications that senders and signers receive. */ NotificationDefaultSettings
    ): Self = this.set("emailNotifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmailNotifications: Self = this.set("emailNotifications", js.undefined)
  }
}
