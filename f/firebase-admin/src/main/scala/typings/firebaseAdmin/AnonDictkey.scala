package typings.firebaseAdmin

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDictkey
  extends /* key */ StringDictionary[js.Any] {
  /**
    * Provider-specific identity details corresponding
    * to the provider used to sign in the user.
    */
  var identities: StringDictionary[js.Any]
  /**
    * The `uid` of the second factor used to sign in, provided the
    * ID token was obtained from a multi-factor authenticated user.
    */
  var second_factor_identifier: js.UndefOr[String] = js.undefined
  /**
    * The ID of the provider used to sign in the user.
    * One of `"anonymous"`, `"password"`, `"facebook.com"`, `"github.com"`,
    * `"google.com"`, `"twitter.com"`, or `"custom"`.
    */
  var sign_in_provider: String
  /**
    * The type identifier or `factorId` of the second factor, provided the
    * ID token was obtained from a multi-factor authenticated user.
    * For phone, this is `"phone"`.
    */
  var sign_in_second_factor: js.UndefOr[String] = js.undefined
  /**
    * The ID of the tenant the user belongs to, if available.
    */
  var tenant: js.UndefOr[String] = js.undefined
}

object AnonDictkey {
  @scala.inline
  def apply(
    identities: StringDictionary[js.Any],
    sign_in_provider: String,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    second_factor_identifier: String = null,
    sign_in_second_factor: String = null,
    tenant: String = null
  ): AnonDictkey = {
    val __obj = js.Dynamic.literal(identities = identities.asInstanceOf[js.Any], sign_in_provider = sign_in_provider.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (second_factor_identifier != null) __obj.updateDynamic("second_factor_identifier")(second_factor_identifier.asInstanceOf[js.Any])
    if (sign_in_second_factor != null) __obj.updateDynamic("sign_in_second_factor")(sign_in_second_factor.asInstanceOf[js.Any])
    if (tenant != null) __obj.updateDynamic("tenant")(tenant.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDictkey]
  }
}

