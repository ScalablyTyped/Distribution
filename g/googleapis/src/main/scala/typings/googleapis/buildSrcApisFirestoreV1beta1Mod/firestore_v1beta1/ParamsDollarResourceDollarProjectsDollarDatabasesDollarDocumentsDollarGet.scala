package typings.googleapis.buildSrcApisFirestoreV1beta1Mod.firestore_v1beta1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarProjectsDollarDatabasesDollarDocumentsDollarGet extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The list of field paths in the mask. See Document.fields for a field path
    * syntax reference.
    */
  @JSName("mask.fieldPaths")
  var maskDotfieldPaths: js.UndefOr[js.Array[String]] = js.native
  /**
    * The resource name of the Document to get. In the format:
    * `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Reads the version of the document at the given time. This may not be
    * older than 60 seconds.
    */
  var readTime: js.UndefOr[String] = js.native
  /**
    * Reads the document in a transaction.
    */
  var transaction: js.UndefOr[String] = js.native
}

