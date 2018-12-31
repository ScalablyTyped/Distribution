package typings
package gapiDotClientDotFirestoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ParentAccesstokenPageSize extends js.Object {
  /** V1 error format. */
  @JSName("$.xgafv")
  var `$.xgafv`: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth access token. */
  var access_token: js.UndefOr[java.lang.String] = js.undefined
  /** Data format for response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth bearer token. */
  var bearer_token: js.UndefOr[java.lang.String] = js.undefined
  /** JSONP */
  var callback: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The collection ID, relative to `parent`, to list. For example: `chatrooms`
    * or `messages`.
    */
  var collectionId: java.lang.String
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The list of field paths in the mask. See Document.fields for a field
    * path syntax reference.
    */
  var `mask.fieldPaths`: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /** The order to sort results by. For example: `priority desc, name`. */
  var orderBy: js.UndefOr[java.lang.String] = js.undefined
  /** The maximum number of documents to return. */
  var pageSize: js.UndefOr[scala.Double] = js.undefined
  /** The `next_page_token` value returned from a previous List request, if any. */
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The parent resource name. In the format:
    * `projects/{project_id}/databases/{database_id}/documents` or
    * `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
    * For example:
    * `projects/my-project/databases/my-database/documents` or
    * `projects/my-project/databases/my-database/documents/chatrooms/my-chatroom`
    */
  var parent: java.lang.String
  /** Pretty-print response. */
  var pp: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Reads documents as they were at the given time.
    * This may not be older than 60 seconds.
    */
  var readTime: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If the list should show missing documents. A missing document is a
    * document that does not exist but has sub-documents. These documents will
    * be returned with a key but will not have fields, Document.create_time,
    * or Document.update_time set.
    *
    * Requests with `show_missing` may not specify `where` or
    * `order_by`.
    */
  var showMissing: js.UndefOr[scala.Boolean] = js.undefined
  /** Reads documents in a transaction. */
  var transaction: js.UndefOr[java.lang.String] = js.undefined
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[java.lang.String] = js.undefined
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[java.lang.String] = js.undefined
}

