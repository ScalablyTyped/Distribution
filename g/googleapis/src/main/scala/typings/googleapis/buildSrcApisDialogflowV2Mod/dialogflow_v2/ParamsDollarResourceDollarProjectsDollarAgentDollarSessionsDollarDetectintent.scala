package typings.googleapis.buildSrcApisDialogflowV2Mod.dialogflow_v2

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
  var requestBody: js.UndefOr[Schema$GoogleCloudDialogflowV2DetectIntentRequest] = js.native
  /**
    * Required. The name of the session this query is sent to. Format:
    * `projects/<Project ID>/agent/sessions/<Session ID>`. It's up to the API
    * caller to choose an appropriate session ID. It can be a random number or
    * some type of user identifier (preferably hashed). The length of the
    * session ID must not exceed 36 bytes.
    */
  var session: js.UndefOr[String] = js.native
}

