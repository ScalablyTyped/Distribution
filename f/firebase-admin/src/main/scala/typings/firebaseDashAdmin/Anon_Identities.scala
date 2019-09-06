package typings.firebaseDashAdmin

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Identities
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

object Anon_Identities {
  @scala.inline
  def apply(
    identities: StringDictionary[js.Any],
    sign_in_provider: String,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    tenant: String = null
  ): Anon_Identities = {
    val __obj = js.Dynamic.literal(identities = identities, sign_in_provider = sign_in_provider)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (tenant != null) __obj.updateDynamic("tenant")(tenant)
    __obj.asInstanceOf[Anon_Identities]
  }
}

