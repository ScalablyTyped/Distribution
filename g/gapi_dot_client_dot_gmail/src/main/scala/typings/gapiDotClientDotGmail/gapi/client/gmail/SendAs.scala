package typings.gapiDotClientDotGmail.gapi.client.gmail

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendAs extends js.Object {
  /**
    * A name that appears in the "From:" header for mail sent using this alias. For custom "from" addresses, when this is empty, Gmail will populate the
    * "From:" header with the name that is used for the primary address associated with the account.
    */
  var displayName: js.UndefOr[String] = js.undefined
  /**
    * Whether this address is selected as the default "From:" address in situations such as composing a new message or sending a vacation auto-reply. Every
    * Gmail account has exactly one default send-as address, so the only legal value that clients may write to this field is true. Changing this from false
    * to true for an address will result in this field becoming false for the other previous default address.
    */
  var isDefault: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether this address is the primary address used to login to the account. Every Gmail account has exactly one primary address, and it cannot be deleted
    * from the collection of send-as aliases. This field is read-only.
    */
  var isPrimary: js.UndefOr[Boolean] = js.undefined
  /**
    * An optional email address that is included in a "Reply-To:" header for mail sent using this alias. If this is empty, Gmail will not generate a
    * "Reply-To:" header.
    */
  var replyToAddress: js.UndefOr[String] = js.undefined
  /** The email address that appears in the "From:" header for mail sent using this alias. This is read-only for all operations except create. */
  var sendAsEmail: js.UndefOr[String] = js.undefined
  /** An optional HTML signature that is included in messages composed with this alias in the Gmail web UI. */
  var signature: js.UndefOr[String] = js.undefined
  /**
    * An optional SMTP service that will be used as an outbound relay for mail sent using this alias. If this is empty, outbound mail will be sent directly
    * from Gmail's servers to the destination SMTP service. This setting only applies to custom "from" aliases.
    */
  var smtpMsa: js.UndefOr[SmtpMsa] = js.undefined
  /** Whether Gmail should  treat this address as an alias for the user's primary email address. This setting only applies to custom "from" aliases. */
  var treatAsAlias: js.UndefOr[Boolean] = js.undefined
  /** Indicates whether this address has been verified for use as a send-as alias. Read-only. This setting only applies to custom "from" aliases. */
  var verificationStatus: js.UndefOr[String] = js.undefined
}

object SendAs {
  @scala.inline
  def apply(
    displayName: String = null,
    isDefault: js.UndefOr[Boolean] = js.undefined,
    isPrimary: js.UndefOr[Boolean] = js.undefined,
    replyToAddress: String = null,
    sendAsEmail: String = null,
    signature: String = null,
    smtpMsa: SmtpMsa = null,
    treatAsAlias: js.UndefOr[Boolean] = js.undefined,
    verificationStatus: String = null
  ): SendAs = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (!js.isUndefined(isDefault)) __obj.updateDynamic("isDefault")(isDefault)
    if (!js.isUndefined(isPrimary)) __obj.updateDynamic("isPrimary")(isPrimary)
    if (replyToAddress != null) __obj.updateDynamic("replyToAddress")(replyToAddress)
    if (sendAsEmail != null) __obj.updateDynamic("sendAsEmail")(sendAsEmail)
    if (signature != null) __obj.updateDynamic("signature")(signature)
    if (smtpMsa != null) __obj.updateDynamic("smtpMsa")(smtpMsa)
    if (!js.isUndefined(treatAsAlias)) __obj.updateDynamic("treatAsAlias")(treatAsAlias)
    if (verificationStatus != null) __obj.updateDynamic("verificationStatus")(verificationStatus)
    __obj.asInstanceOf[SendAs]
  }
}

