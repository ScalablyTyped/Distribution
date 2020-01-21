package typings.firebaseAdmin

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIdentities
  extends /* key */ StringDictionary[js.Any] {
  /**
    * Provider-specific identity details corresponding
    * to the provider used to sign in the user.
    */
  var identities: StringDictionary[js.Any]
  /**
    * The ID of the provider used to sign in the user.
    * One of `"anonymous"`, `"password"`, `"facebook.com"`, `"github.com"`,
    * `"google.com"`, `"twitter.com"`, or `"custom"`.
    */
  var sign_in_provider: String
  /**
    * The ID of the tenant the user belongs to, if available.
    */
  var tenant: js.UndefOr[String] = js.undefined
}

object AnonIdentities {
  @scala.inline
  def apply(
    identities: StringDictionary[js.Any],
    sign_in_provider: String,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    tenant: String = null
  ): AnonIdentities = {
    val __obj = js.Dynamic.literal(identities = identities.asInstanceOf[js.Any], sign_in_provider = sign_in_provider.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (tenant != null) __obj.updateDynamic("tenant")(tenant.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIdentities]
  }
}

