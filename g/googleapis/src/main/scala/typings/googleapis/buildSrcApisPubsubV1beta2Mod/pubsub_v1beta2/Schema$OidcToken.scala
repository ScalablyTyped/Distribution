package typings.googleapis.buildSrcApisPubsubV1beta2Mod.pubsub_v1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains information needed for generating an [OpenID Connect
  * token](https://developers.google.com/identity/protocols/OpenIDConnect).
  */
@js.native
trait Schema$OidcToken extends js.Object {
  /**
    * Audience to be used when generating OIDC token. The audience claim
    * identifies the recipients that the JWT is intended for. The audience
    * value is a single case-sensitive string. Having multiple values (array)
    * for the audience field is not supported. More info about the OIDC JWT
    * token audience here: https://tools.ietf.org/html/rfc7519#section-4.1.3
    * Note: if not specified, the Push endpoint URL will be used.
    */
  var audience: js.UndefOr[String] = js.native
  /**
    * [Service account
    * email](https://cloud.google.com/iam/docs/service-accounts) to be used for
    * generating the OIDC token. The caller (for CreateSubscription,
    * UpdateSubscription, and ModifyPushConfig RPCs) must have the
    * iam.serviceAccounts.actAs permission for the service account.
    */
  var serviceAccountEmail: js.UndefOr[String] = js.native
}

object Schema$OidcToken {
  @scala.inline
  def apply(audience: String = null, serviceAccountEmail: String = null): Schema$OidcToken = {
    val __obj = js.Dynamic.literal()
    if (audience != null) __obj.updateDynamic("audience")(audience.asInstanceOf[js.Any])
    if (serviceAccountEmail != null) __obj.updateDynamic("serviceAccountEmail")(serviceAccountEmail.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$OidcToken]
  }
}

