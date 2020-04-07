package typings.gapiClientPeople

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOauthtoken extends js.Object {
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
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  /**
    * The number of connections to include in the response. Valid values are
    * between 1 and 2000, inclusive. Defaults to 100.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  /** The token of the page to be returned. */
  var pageToken: js.UndefOr[String] = js.undefined
  /**
    * &#42;&#42;Required.&#42;&#42; A field mask to restrict which fields on each person are
    * returned. Valid values are:
    *
    * &#42; addresses
    * &#42; ageRanges
    * &#42; biographies
    * &#42; birthdays
    * &#42; braggingRights
    * &#42; coverPhotos
    * &#42; emailAddresses
    * &#42; events
    * &#42; genders
    * &#42; imClients
    * &#42; interests
    * &#42; locales
    * &#42; memberships
    * &#42; metadata
    * &#42; names
    * &#42; nicknames
    * &#42; occupations
    * &#42; organizations
    * &#42; phoneNumbers
    * &#42; photos
    * &#42; relations
    * &#42; relationshipInterests
    * &#42; relationshipStatuses
    * &#42; residences
    * &#42; skills
    * &#42; taglines
    * &#42; urls
    */
  var personFields: js.UndefOr[String] = js.undefined
  /** Pretty-print response. */
  var pp: js.UndefOr[Boolean] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.undefined
  /**
    * &#42;&#42;Required.&#42;&#42; Comma-separated list of person fields to be included in the
    * response. Each path should start with `person.`: for example,
    * `person.names` or `person.photos`.
    */
  @JSName("requestMask.includeField")
  var requestMaskDotincludeField: js.UndefOr[String] = js.undefined
  /**
    * Whether the response should include a sync token, which can be used to get
    * all changes since the last request.
    */
  var requestSyncToken: js.UndefOr[Boolean] = js.undefined
  /** The resource name to return connections for. Only `people/me` is valid. */
  var resourceName: String
  /**
    * The order in which the connections should be sorted. Defaults to
    * `LAST_MODIFIED_ASCENDING`.
    */
  var sortOrder: js.UndefOr[String] = js.undefined
  /**
    * A sync token, returned by a previous call to `people.connections.list`.
    * Only resources changed since the sync token was created will be returned.
    */
  var syncToken: js.UndefOr[String] = js.undefined
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[String] = js.undefined
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[String] = js.undefined
}

object AnonOauthtoken {
  @scala.inline
  def apply(
    resourceName: String,
    $Dotxgafv: String = null,
    access_token: String = null,
    alt: String = null,
    bearer_token: String = null,
    callback: String = null,
    fields: String = null,
    key: String = null,
    oauth_token: String = null,
    pageSize: Int | Double = null,
    pageToken: String = null,
    personFields: String = null,
    pp: js.UndefOr[Boolean] = js.undefined,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    requestMaskDotincludeField: String = null,
    requestSyncToken: js.UndefOr[Boolean] = js.undefined,
    sortOrder: String = null,
    syncToken: String = null,
    uploadType: String = null,
    upload_protocol: String = null
  ): AnonOauthtoken = {
    val __obj = js.Dynamic.literal(resourceName = resourceName.asInstanceOf[js.Any])
    if ($Dotxgafv != null) __obj.updateDynamic("$.xgafv")($Dotxgafv.asInstanceOf[js.Any])
    if (access_token != null) __obj.updateDynamic("access_token")(access_token.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (bearer_token != null) __obj.updateDynamic("bearer_token")(bearer_token.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(callback.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (personFields != null) __obj.updateDynamic("personFields")(personFields.asInstanceOf[js.Any])
    if (!js.isUndefined(pp)) __obj.updateDynamic("pp")(pp.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (requestMaskDotincludeField != null) __obj.updateDynamic("requestMask.includeField")(requestMaskDotincludeField.asInstanceOf[js.Any])
    if (!js.isUndefined(requestSyncToken)) __obj.updateDynamic("requestSyncToken")(requestSyncToken.asInstanceOf[js.Any])
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    if (syncToken != null) __obj.updateDynamic("syncToken")(syncToken.asInstanceOf[js.Any])
    if (uploadType != null) __obj.updateDynamic("uploadType")(uploadType.asInstanceOf[js.Any])
    if (upload_protocol != null) __obj.updateDynamic("upload_protocol")(upload_protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOauthtoken]
  }
}

