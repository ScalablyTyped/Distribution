package typings.googleapis.buildSrcApisFirestoreV1Mod.firestore_v1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarProjectsDollarDatabasesDollarDocumentsDollarDelete extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * When set to `true`, the target document must exist. When set to `false`,
    * the target document must not exist.
    */
  @JSName("currentDocument.exists")
  var currentDocumentDotexists: js.UndefOr[Boolean] = js.native
  /**
    * When set, the target document must exist and have been last updated at
    * that time.
    */
  @JSName("currentDocument.updateTime")
  var currentDocumentDotupdateTime: js.UndefOr[String] = js.native
  /**
    * The resource name of the Document to delete. In the format:
    * `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
    */
  var name: js.UndefOr[String] = js.native
}

