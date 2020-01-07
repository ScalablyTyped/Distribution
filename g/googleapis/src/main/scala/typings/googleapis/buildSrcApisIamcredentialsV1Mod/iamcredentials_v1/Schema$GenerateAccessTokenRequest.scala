package typings.googleapis.buildSrcApisIamcredentialsV1Mod.iamcredentials_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$GenerateAccessTokenRequest extends js.Object {
  /**
    * The sequence of service accounts in a delegation chain. Each service
    * account must be granted the `roles/iam.serviceAccountTokenCreator` role
    * on its next service account in the chain. The last service account in the
    * chain must be granted the `roles/iam.serviceAccountTokenCreator` role on
    * the service account that is specified in the `name` field of the request.
    * The delegates must have the following format:
    * `projects/-/serviceAccounts/{ACCOUNT_EMAIL_OR_UNIQUEID}`. The `-`
    * wildcard character is required; replacing it with a project ID is
    * invalid.
    */
  var delegates: js.UndefOr[js.Array[String]] = js.native
  /**
    * The desired lifetime duration of the access token in seconds. Must be set
    * to a value less than or equal to 3600 (1 hour). If a value is not
    * specified, the token&#39;s lifetime will be set to a default value of one
    * hour.
    */
  var lifetime: js.UndefOr[String] = js.native
  /**
    * Code to identify the scopes to be included in the OAuth 2.0 access token.
    * See https://developers.google.com/identity/protocols/googlescopes for
    * more information. At least one value required.
    */
  var scope: js.UndefOr[js.Array[String]] = js.native
}

object Schema$GenerateAccessTokenRequest {
  @scala.inline
  def apply(delegates: js.Array[String] = null, lifetime: String = null, scope: js.Array[String] = null): Schema$GenerateAccessTokenRequest = {
    val __obj = js.Dynamic.literal()
    if (delegates != null) __obj.updateDynamic("delegates")(delegates.asInstanceOf[js.Any])
    if (lifetime != null) __obj.updateDynamic("lifetime")(lifetime.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GenerateAccessTokenRequest]
  }
}

