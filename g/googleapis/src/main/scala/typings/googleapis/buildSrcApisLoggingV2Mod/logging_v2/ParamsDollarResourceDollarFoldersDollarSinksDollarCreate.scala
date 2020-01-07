package typings.googleapis.buildSrcApisLoggingV2Mod.logging_v2

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarFoldersDollarSinksDollarCreate extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Required. The resource in which to create the sink:
    * "projects/[PROJECT_ID]" "organizations/[ORGANIZATION_ID]"
    * "billingAccounts/[BILLING_ACCOUNT_ID]" "folders/[FOLDER_ID]" Examples:
    * "projects/my-logging-project", "organizations/123456789".
    */
  var parent: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[Schema$LogSink] = js.native
  /**
    * Optional. Determines the kind of IAM identity returned as writer_identity
    * in the new sink. If this value is omitted or set to false, and if the
    * sink's parent is a project, then the value returned as writer_identity is
    * the same group or service account used by Logging before the addition of
    * writer identities to this API. The sink's destination must be in the same
    * project as the sink itself.If this field is set to true, or if the sink
    * is owned by a non-project resource such as an organization, then the
    * value of writer_identity will be a unique service account used only for
    * exports from the new sink. For more information, see writer_identity in
    * LogSink.
    */
  var uniqueWriterIdentity: js.UndefOr[Boolean] = js.native
}

