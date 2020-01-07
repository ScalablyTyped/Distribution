package typings.googleapis.buildSrcApisDialogflowV2beta1Mod.dialogflow_v2beta1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarProjectsDollarAgentDollarSessionsDollarDetectintent extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[Schema$GoogleCloudDialogflowV2beta1DetectIntentRequest] = js.native
  /**
    * Required. The name of the session this query is sent to. Format:
    * `projects/<Project ID>/agent/sessions/<Session ID>`, or
    * `projects/<Project ID>/agent/environments/<Environment ID>/users/<User
    * ID>/sessions/<Session ID>`. If `Environment ID` is not specified, we
    * assume default 'draft' environment. If `User ID` is not specified, we are
    * using "-". It’s up to the API caller to choose an appropriate `Session
    * ID` and `User Id`. They can be a random numbers or some type of user and
    * session identifiers (preferably hashed). The length of the `Session ID`
    * and `User ID` must not exceed 36 characters.
    */
  var session: js.UndefOr[String] = js.native
}

