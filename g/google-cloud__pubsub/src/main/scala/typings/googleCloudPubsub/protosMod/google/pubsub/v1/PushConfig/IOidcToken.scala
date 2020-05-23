package typings.googleCloudPubsub.protosMod.google.pubsub.v1.PushConfig

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
  def apply(
    audience: js.UndefOr[Null | String] = js.undefined,
    serviceAccountEmail: js.UndefOr[Null | String] = js.undefined
  ): IOidcToken = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(audience)) __obj.updateDynamic("audience")(audience.asInstanceOf[js.Any])
    if (!js.isUndefined(serviceAccountEmail)) __obj.updateDynamic("serviceAccountEmail")(serviceAccountEmail.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOidcToken]
  }
}

