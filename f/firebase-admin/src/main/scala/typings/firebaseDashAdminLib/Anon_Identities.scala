package typings
package firebaseDashAdminLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Identities
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
    * Provider-specific identity details corresponding
    * to the provider used to sign in the user.
    */
  var identities: org.scalablytyped.runtime.StringDictionary[js.Any]
  /**
    * The ID of the provider used to sign in the user.
    * One of `"anonymous"`, `"password"`, `"facebook.com"`, `"github.com"`,
    * `"google.com"`, `"twitter.com"`, or `"custom"`.
    */
  var sign_in_provider: java.lang.String
}

object Anon_Identities {
  @scala.inline
  def apply(
    identities: org.scalablytyped.runtime.StringDictionary[js.Any],
    sign_in_provider: java.lang.String,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Anon_Identities = {
    val __obj = js.Dynamic.literal(identities = identities, sign_in_provider = sign_in_provider)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_Identities]
  }
}

