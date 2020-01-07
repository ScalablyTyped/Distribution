package typings.googleapis.buildSrcApisIamV1Mod.iam_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The service account create request.
  */
@js.native
trait Schema$CreateServiceAccountRequest extends js.Object {
  /**
    * Required. The account id that is used to generate the service account
    * email address and a stable unique id. It is unique within a project, must
    * be 6-30 characters long, and match the regular expression
    * `[a-z]([-a-z0-9]*[a-z0-9])` to comply with RFC1035.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * The ServiceAccount resource to create. Currently, only the following
    * values are user assignable: `display_name` .
    */
  var serviceAccount: js.UndefOr[Schema$ServiceAccount] = js.native
}

object Schema$CreateServiceAccountRequest {
  @scala.inline
  def apply(accountId: String = null, serviceAccount: Schema$ServiceAccount = null): Schema$CreateServiceAccountRequest = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (serviceAccount != null) __obj.updateDynamic("serviceAccount")(serviceAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CreateServiceAccountRequest]
  }
}

