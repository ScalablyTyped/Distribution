package typings.googleapis.buildSrcApisFirestoreV1Mod.firestore_v1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarProjectsDollarDatabasesDollarDocumentsDollarList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The collection ID, relative to `parent`, to list. For example:
    * `chatrooms` or `messages`.
    */
  var collectionId: js.UndefOr[String] = js.native
  /**
    * The list of field paths in the mask. See Document.fields for a field path
    * syntax reference.
    */
  @JSName("mask.fieldPaths")
  var maskDotfieldPaths: js.UndefOr[js.Array[String]] = js.native
  /**
    * The order to sort results by. For example: `priority desc, name`.
    */
  var orderBy: js.UndefOr[String] = js.native
  /**
    * The maximum number of documents to return.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * The `next_page_token` value returned from a previous List request, if
    * any.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * The parent resource name. In the format:
    * `projects/{project_id}/databases/{database_id}/documents` or
    * `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
    * For example: `projects/my-project/databases/my-database/documents` or
    * `projects/my-project/databases/my-database/documents/chatrooms/my-chatroom`
    */
  var parent: js.UndefOr[String] = js.native
  /**
    * Reads documents as they were at the given time. This may not be older
    * than 60 seconds.
    */
  var readTime: js.UndefOr[String] = js.native
  /**
    * If the list should show missing documents. A missing document is a
    * document that does not exist but has sub-documents. These documents will
    * be returned with a key but will not have fields, Document.create_time, or
    * Document.update_time set.  Requests with `show_missing` may not specify
    * `where` or `order_by`.
    */
  var showMissing: js.UndefOr[Boolean] = js.native
  /**
    * Reads documents in a transaction.
    */
  var transaction: js.UndefOr[String] = js.native
}

