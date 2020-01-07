package typings.googleapis.buildSrcApisDialogflowV2Mod.dialogflow_v2

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarProjectsDollarAgentDollarIntentsDollarPatch extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Optional. The resource view to apply to the returned intent.
    */
  var intentView: js.UndefOr[String] = js.native
  /**
    * Optional. The language of training phrases, parameters and rich messages
    * defined in `intent`. If not specified, the agent's default language is
    * used. [Many
    * languages](https://cloud.google.com/dialogflow-enterprise/docs/reference/language)
    * are supported. Note: languages must be enabled in the agent before they
    * can be used.
    */
  var languageCode: js.UndefOr[String] = js.native
  /**
    * The unique identifier of this intent. Required for Intents.UpdateIntent
    * and Intents.BatchUpdateIntents methods. Format: `projects/<Project
    * ID>/agent/intents/<Intent ID>`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[Schema$GoogleCloudDialogflowV2Intent] = js.native
  /**
    * Optional. The mask to control which fields get updated.
    */
  var updateMask: js.UndefOr[String] = js.native
}

