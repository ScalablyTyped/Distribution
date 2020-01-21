package typings.gapiClientIdentitytoolkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDisplayName extends js.Object {
  /** The user's display name at the IDP. */
  var displayName: js.UndefOr[String] = js.undefined
  /** User's identifier at IDP. */
  var federatedId: js.UndefOr[String] = js.undefined
  /** The user's photo url at the IDP. */
  var photoUrl: js.UndefOr[String] = js.undefined
  /**
    * The IdP ID. For whitelisted IdPs it's a short domain name, e.g., google.com, aol.com, live.net and yahoo.com. For other OpenID IdPs it's the OP
    * identifier.
    */
  var providerId: js.UndefOr[String] = js.undefined
}

object AnonDisplayName {
  @scala.inline
  def apply(
    displayName: String = null,
    federatedId: String = null,
    photoUrl: String = null,
    providerId: String = null
  ): AnonDisplayName = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (federatedId != null) __obj.updateDynamic("federatedId")(federatedId.asInstanceOf[js.Any])
    if (photoUrl != null) __obj.updateDynamic("photoUrl")(photoUrl.asInstanceOf[js.Any])
    if (providerId != null) __obj.updateDynamic("providerId")(providerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDisplayName]
  }
}

