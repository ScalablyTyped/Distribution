package typings.googleapis.cloudschedulerV1beta1Mod.cloudschedulerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains information needed for generating an [OAuth
  * token](https://developers.google.com/identity/protocols/OAuth2). This type
  * of authorization should be used when sending requests to a GCP endpoint.
  */
@js.native
trait SchemaOAuthToken extends js.Object {
  /**
    * OAuth scope to be used for generating OAuth access token. If not
    * specified, &quot;https://www.googleapis.com/auth/cloud-platform&quot;
    * will be used.
    */
  var scope: js.UndefOr[String] = js.native
  /**
    * [Service account
    * email](https://cloud.google.com/iam/docs/service-accounts) to be used for
    * generating OAuth token. The service account must be within the same
    * project as the job. The caller must have iam.serviceAccounts.actAs
    * permission for the service account.
    */
  var serviceAccountEmail: js.UndefOr[String] = js.native
}

object SchemaOAuthToken {
  @scala.inline
  def apply(scope: String = null, serviceAccountEmail: String = null): SchemaOAuthToken = {
    val __obj = js.Dynamic.literal()
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (serviceAccountEmail != null) __obj.updateDynamic("serviceAccountEmail")(serviceAccountEmail.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOAuthToken]
  }
}

