package typings.gapiDotClientDotFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AccesstokenAltBearertokenCallbackCollectionId extends js.Object {
  /** V1 error format. */
  @JSName("$.xgafv")
  var `$.xgafv`: js.UndefOr[String] = js.native
  /** OAuth access token. */
  var access_token: js.UndefOr[String] = js.native
  /** Data format for response. */
  var alt: js.UndefOr[String] = js.native
  /** OAuth bearer token. */
  var bearer_token: js.UndefOr[String] = js.native
  /** JSONP */
  var callback: js.UndefOr[String] = js.native
  /**
    * The collection ID, relative to `parent`, to list. For example: `chatrooms`
    * or `messages`.
    */
  var collectionId: String = js.native
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  /**
    * The list of field paths in the mask. See Document.fields for a field
    * path syntax reference.
    */
  var `mask.fieldPaths`: js.UndefOr[String] = js.native
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  /** The order to sort results by. For example: `priority desc, name`. */
  var orderBy: js.UndefOr[String] = js.native
  /** The maximum number of documents to return. */
  var pageSize: js.UndefOr[Double] = js.native
  /** The `next_page_token` value returned from a previous List request, if any. */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * The parent resource name. In the format:
    * `projects/{project_id}/databases/{database_id}/documents` or
    * `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
    * For example:
    * `projects/my-project/databases/my-database/documents` or
    * `projects/my-project/databases/my-database/documents/chatrooms/my-chatroom`
    */
  var parent: String = js.native
  /** Pretty-print response. */
  var pp: js.UndefOr[Boolean] = js.native
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.native
  /**
    * Reads documents as they were at the given time.
    * This may not be older than 60 seconds.
    */
  var readTime: js.UndefOr[String] = js.native
  /**
    * If the list should show missing documents. A missing document is a
    * document that does not exist but has sub-documents. These documents will
    * be returned with a key but will not have fields, Document.create_time,
    * or Document.update_time set.
    *
    * Requests with `show_missing` may not specify `where` or
    * `order_by`.
    */
  var showMissing: js.UndefOr[Boolean] = js.native
  /** Reads documents in a transaction. */
  var transaction: js.UndefOr[String] = js.native
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[String] = js.native
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[String] = js.native
}

