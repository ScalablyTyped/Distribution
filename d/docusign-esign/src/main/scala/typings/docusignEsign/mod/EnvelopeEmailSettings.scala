package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvelopeEmailSettings extends js.Object {
  
  /**
    * An array containing the email address that should receive a copy of all email communications related to an envelope for archiving purposes. Maximum Length: 100 characters.
    *
    * While this property is an array, note that it takes only a single email address.
    *
    * **Note**: Only users with the `canManageAccount` setting set to **true** can use this option.
    *
    * DocuSign verifies that the email format is correct, but does not verify that the email address is active. You can use this for archiving purposes.
    * However, using this property overrides the BCC for Email Archive information setting for this envelope.
    *
    * **Example**: if your account has BCC for Email Archive set up for the email address archive@mycompany.com and you send an envelope using the BCC Email
    * Override to send a BCC email to salesarchive@mycompany.com, then a copy of the envelope is only sent to the salesarchive@mycompany.com email address.
    */
  var bccEmailAddresses: js.UndefOr[
    js.Array[/* Contains information about the BCC email address. */ BccEmailAddress]
  ] = js.native
  
  /**
    * The Reply To email address to use for email replies, instead of the one that is configured at the account level. DocuSign verifies that the email address
    * is in a correct format, but does not verify that it is active. Maximum Length: 100 characters.
    */
  var replyEmailAddressOverride: js.UndefOr[String] = js.native
  
  /**
    * The name to associate with the Reply To email address, instead of the name that is configured at the account level. Maximum Length: 100 characters.
    */
  var replyEmailNameOverride: js.UndefOr[String] = js.native
}
object EnvelopeEmailSettings {
  
  @scala.inline
  def apply(): EnvelopeEmailSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvelopeEmailSettings]
  }
  
  @scala.inline
  implicit class EnvelopeEmailSettingsOps[Self <: EnvelopeEmailSettings] (val x: Self) extends AnyVal {
    
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
    def setBccEmailAddressesVarargs(value: (/* Contains information about the BCC email address. */ BccEmailAddress)*): Self = this.set("bccEmailAddresses", js.Array(value :_*))
    
    @scala.inline
    def setBccEmailAddresses(value: js.Array[/* Contains information about the BCC email address. */ BccEmailAddress]): Self = this.set("bccEmailAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBccEmailAddresses: Self = this.set("bccEmailAddresses", js.undefined)
    
    @scala.inline
    def setReplyEmailAddressOverride(value: String): Self = this.set("replyEmailAddressOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplyEmailAddressOverride: Self = this.set("replyEmailAddressOverride", js.undefined)
    
    @scala.inline
    def setReplyEmailNameOverride(value: String): Self = this.set("replyEmailNameOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplyEmailNameOverride: Self = this.set("replyEmailNameOverride", js.undefined)
  }
}
