package typings.googleapis.buildSrcApisGmailV1Mod.gmail_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Settings for a delegate. Delegates can read, send, and delete messages, as
  * well as view and add contacts, for the delegator&#39;s account. See
  * &quot;Set up mail delegation&quot; for more information about delegates.
  */
@js.native
trait Schema$Delegate extends js.Object {
  /**
    * The email address of the delegate.
    */
  var delegateEmail: js.UndefOr[String] = js.native
  /**
    * Indicates whether this address has been verified and can act as a
    * delegate for the account. Read-only.
    */
  var verificationStatus: js.UndefOr[String] = js.native
}

object Schema$Delegate {
  @scala.inline
  def apply(delegateEmail: String = null, verificationStatus: String = null): Schema$Delegate = {
    val __obj = js.Dynamic.literal()
    if (delegateEmail != null) __obj.updateDynamic("delegateEmail")(delegateEmail.asInstanceOf[js.Any])
    if (verificationStatus != null) __obj.updateDynamic("verificationStatus")(verificationStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Delegate]
  }
}

