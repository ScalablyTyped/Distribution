package typings.googleapis.buildSrcApisDialogflowV2beta1Mod.dialogflow_v2beta1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarProjectsDollarAgentDollarEnvironmentsDollarUsersDollarSessionsDollarContextsDollarDelete extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Required. The name of the context to delete. Format: `projects/<Project
    * ID>/agent/sessions/<Session ID>/contexts/<Context ID>` or
    * `projects/<Project ID>/agent/environments/<Environment ID>/users/<User
    * ID>/sessions/<Session ID>/contexts/<Context ID>`. If `Environment ID` is
    * not specified, we assume default 'draft' environment. If `User ID` is not
    * specified, we assume default '-' user.
    */
  var name: js.UndefOr[String] = js.native
}

