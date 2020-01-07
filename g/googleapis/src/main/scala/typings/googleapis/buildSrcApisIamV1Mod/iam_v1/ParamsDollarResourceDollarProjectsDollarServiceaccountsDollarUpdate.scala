package typings.googleapis.buildSrcApisIamV1Mod.iam_v1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarProjectsDollarServiceaccountsDollarUpdate extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The resource name of the service account in the following format:
    * `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}`.  Requests using `-` as
    * a wildcard for the `PROJECT_ID` will infer the project from the `account`
    * and the `ACCOUNT` value can be the `email` address or the `unique_id` of
    * the service account.  In responses the resource name will always be in
    * the format `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[Schema$ServiceAccount] = js.native
}

