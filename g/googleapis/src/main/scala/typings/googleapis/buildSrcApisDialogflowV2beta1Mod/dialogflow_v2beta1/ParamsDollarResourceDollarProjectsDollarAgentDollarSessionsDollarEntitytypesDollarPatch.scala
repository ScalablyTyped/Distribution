package typings.googleapis.buildSrcApisDialogflowV2beta1Mod.dialogflow_v2beta1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarProjectsDollarAgentDollarSessionsDollarEntitytypesDollarPatch extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Required. The unique identifier of this session entity type. Format:
    * `projects/<Project ID>/agent/sessions/<Session ID>/entityTypes/<Entity
    * Type Display Name>`, or `projects/<Project
    * ID>/agent/environments/<Environment ID>/users/<User ID>/sessions/<Session
    * ID>/entityTypes/<Entity Type Display Name>`. If `Environment ID` is not
    * specified, we assume default 'draft' environment. If `User ID` is not
    * specified, we assume default '-' user.  `<Entity Type Display Name>` must
    * be the display name of an existing entity type in the same agent that
    * will be overridden or supplemented.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[Schema$GoogleCloudDialogflowV2beta1SessionEntityType] = js.native
  /**
    * Optional. The mask to control which fields get updated.
    */
  var updateMask: js.UndefOr[String] = js.native
}

