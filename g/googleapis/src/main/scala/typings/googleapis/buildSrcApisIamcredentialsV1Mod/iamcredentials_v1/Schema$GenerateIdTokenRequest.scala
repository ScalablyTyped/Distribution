package typings.googleapis.buildSrcApisIamcredentialsV1Mod.iamcredentials_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$GenerateIdTokenRequest extends js.Object {
  /**
    * The audience for the token, such as the API or account that this token
    * grants access to.
    */
  var audience: js.UndefOr[String] = js.native
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
    * Include the service account email in the token. If set to `true`, the
    * token will contain `email` and `email_verified` claims.
    */
  var includeEmail: js.UndefOr[Boolean] = js.native
}

object Schema$GenerateIdTokenRequest {
  @scala.inline
  def apply(
    audience: String = null,
    delegates: js.Array[String] = null,
    includeEmail: js.UndefOr[Boolean] = js.undefined
  ): Schema$GenerateIdTokenRequest = {
    val __obj = js.Dynamic.literal()
    if (audience != null) __obj.updateDynamic("audience")(audience.asInstanceOf[js.Any])
    if (delegates != null) __obj.updateDynamic("delegates")(delegates.asInstanceOf[js.Any])
    if (!js.isUndefined(includeEmail)) __obj.updateDynamic("includeEmail")(includeEmail.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GenerateIdTokenRequest]
  }
}

