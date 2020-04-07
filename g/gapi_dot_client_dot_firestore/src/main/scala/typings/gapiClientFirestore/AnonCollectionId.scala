package typings.gapiClientFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCollectionId extends js.Object {
  /** V1 error format. */
  @JSName("$.xgafv")
  var $Dotxgafv: js.UndefOr[String] = js.undefined
  /** OAuth access token. */
  var access_token: js.UndefOr[String] = js.undefined
  /** Data format for response. */
  var alt: js.UndefOr[String] = js.undefined
  /** OAuth bearer token. */
  var bearer_token: js.UndefOr[String] = js.undefined
  /** JSONP */
  var callback: js.UndefOr[String] = js.undefined
  /**
    * The collection ID, relative to `parent`, to list. For example: `chatrooms`
    * or `messages`.
    */
  var collectionId: String
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  /**
    * The list of field paths in the mask. See Document.fields for a field
    * path syntax reference.
    */
  @JSName("mask.fieldPaths")
  var maskDotfieldPaths: js.UndefOr[String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  /** The order to sort results by. For example: `priority desc, name`. */
  var orderBy: js.UndefOr[String] = js.undefined
  /** The maximum number of documents to return. */
  var pageSize: js.UndefOr[Double] = js.undefined
  /** The `next_page_token` value returned from a previous List request, if any. */
  var pageToken: js.UndefOr[String] = js.undefined
  /**
    * The parent resource name. In the format:
    * `projects/{project_id}/databases/{database_id}/documents` or
    * `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
    * For example:
    * `projects/my-project/databases/my-database/documents` or
    * `projects/my-project/databases/my-database/documents/chatrooms/my-chatroom`
    */
  var parent: String
  /** Pretty-print response. */
  var pp: js.UndefOr[Boolean] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.undefined
  /**
    * Reads documents as they were at the given time.
    * This may not be older than 60 seconds.
    */
  var readTime: js.UndefOr[String] = js.undefined
  /**
    * If the list should show missing documents. A missing document is a
    * document that does not exist but has sub-documents. These documents will
    * be returned with a key but will not have fields, Document.create_time,
    * or Document.update_time set.
    *
    * Requests with `show_missing` may not specify `where` or
    * `order_by`.
    */
  var showMissing: js.UndefOr[Boolean] = js.undefined
  /** Reads documents in a transaction. */
  var transaction: js.UndefOr[String] = js.undefined
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[String] = js.undefined
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[String] = js.undefined
}

object AnonCollectionId {
  @scala.inline
  def apply(
    collectionId: String,
    parent: String,
    $Dotxgafv: String = null,
    access_token: String = null,
    alt: String = null,
    bearer_token: String = null,
    callback: String = null,
    fields: String = null,
    key: String = null,
    maskDotfieldPaths: String = null,
    oauth_token: String = null,
    orderBy: String = null,
    pageSize: Int | Double = null,
    pageToken: String = null,
    pp: js.UndefOr[Boolean] = js.undefined,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    readTime: String = null,
    showMissing: js.UndefOr[Boolean] = js.undefined,
    transaction: String = null,
    uploadType: String = null,
    upload_protocol: String = null
  ): AnonCollectionId = {
    val __obj = js.Dynamic.literal(collectionId = collectionId.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    if ($Dotxgafv != null) __obj.updateDynamic("$.xgafv")($Dotxgafv.asInstanceOf[js.Any])
    if (access_token != null) __obj.updateDynamic("access_token")(access_token.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (bearer_token != null) __obj.updateDynamic("bearer_token")(bearer_token.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(callback.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (maskDotfieldPaths != null) __obj.updateDynamic("mask.fieldPaths")(maskDotfieldPaths.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (orderBy != null) __obj.updateDynamic("orderBy")(orderBy.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(pp)) __obj.updateDynamic("pp")(pp.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (readTime != null) __obj.updateDynamic("readTime")(readTime.asInstanceOf[js.Any])
    if (!js.isUndefined(showMissing)) __obj.updateDynamic("showMissing")(showMissing.asInstanceOf[js.Any])
    if (transaction != null) __obj.updateDynamic("transaction")(transaction.asInstanceOf[js.Any])
    if (uploadType != null) __obj.updateDynamic("uploadType")(uploadType.asInstanceOf[js.Any])
    if (upload_protocol != null) __obj.updateDynamic("upload_protocol")(upload_protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCollectionId]
  }
}

