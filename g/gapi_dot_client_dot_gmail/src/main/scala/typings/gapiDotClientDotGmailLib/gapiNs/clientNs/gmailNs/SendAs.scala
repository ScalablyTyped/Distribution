package typings
package gapiDotClientDotGmailLib.gapiNs.clientNs.gmailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SendAs extends js.Object {
  /**
               * A name that appears in the "From:" header for mail sent using this alias. For custom "from" addresses, when this is empty, Gmail will populate the
               * "From:" header with the name that is used for the primary address associated with the account.
               */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Whether this address is selected as the default "From:" address in situations such as composing a new message or sending a vacation auto-reply. Every
               * Gmail account has exactly one default send-as address, so the only legal value that clients may write to this field is true. Changing this from false
               * to true for an address will result in this field becoming false for the other previous default address.
               */
  var isDefault: js.UndefOr[scala.Boolean] = js.undefined
  /**
               * Whether this address is the primary address used to login to the account. Every Gmail account has exactly one primary address, and it cannot be deleted
               * from the collection of send-as aliases. This field is read-only.
               */
  var isPrimary: js.UndefOr[scala.Boolean] = js.undefined
  /**
               * An optional email address that is included in a "Reply-To:" header for mail sent using this alias. If this is empty, Gmail will not generate a
               * "Reply-To:" header.
               */
  var replyToAddress: js.UndefOr[java.lang.String] = js.undefined
  /** The email address that appears in the "From:" header for mail sent using this alias. This is read-only for all operations except create. */
  var sendAsEmail: js.UndefOr[java.lang.String] = js.undefined
  /** An optional HTML signature that is included in messages composed with this alias in the Gmail web UI. */
  var signature: js.UndefOr[java.lang.String] = js.undefined
  /**
               * An optional SMTP service that will be used as an outbound relay for mail sent using this alias. If this is empty, outbound mail will be sent directly
               * from Gmail's servers to the destination SMTP service. This setting only applies to custom "from" aliases.
               */
  var smtpMsa: js.UndefOr[SmtpMsa] = js.undefined
  /** Whether Gmail should  treat this address as an alias for the user's primary email address. This setting only applies to custom "from" aliases. */
  var treatAsAlias: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether this address has been verified for use as a send-as alias. Read-only. This setting only applies to custom "from" aliases. */
  var verificationStatus: js.UndefOr[java.lang.String] = js.undefined
}

