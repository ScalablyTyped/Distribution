package typings.googleCloudPubsub.pubsubMod.google.pubsub.v1.PushConfig

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an OidcToken. */
trait IOidcToken extends js.Object {
  /** OidcToken audience */
  var audience: js.UndefOr[String | Null] = js.undefined
  /** OidcToken serviceAccountEmail */
  var serviceAccountEmail: js.UndefOr[String | Null] = js.undefined
}

object IOidcToken {
  @scala.inline
  def apply(audience: String = null, serviceAccountEmail: String = null): IOidcToken = {
    val __obj = js.Dynamic.literal()
    if (audience != null) __obj.updateDynamic("audience")(audience.asInstanceOf[js.Any])
    if (serviceAccountEmail != null) __obj.updateDynamic("serviceAccountEmail")(serviceAccountEmail.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOidcToken]
  }
}

