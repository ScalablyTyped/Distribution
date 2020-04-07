package typings.gapiClientKgsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAccesstoken extends js.Object {
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
  /**
    * The list of entity id to be used for search instead of query string.
    * To specify multiple ids in the HTTP request, repeat the parameter in the
    * URL as in ...?ids=A&ids=B
    */
  var ids: js.UndefOr[String] = js.undefined
  /** Enables indenting of json results. */
  var indent: js.UndefOr[Boolean] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  /**
    * The list of language codes (defined in ISO 693) to run the query with,
    * e.g. 'en'.
    */
  var languages: js.UndefOr[String] = js.undefined
  /** Limits the number of entities to be returned. */
  var limit: js.UndefOr[Double] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  /** Pretty-print response. */
  var pp: js.UndefOr[Boolean] = js.undefined
  /** Enables prefix match against names and aliases of entities */
  var prefix: js.UndefOr[Boolean] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  /** The literal query string for search. */
  var query: js.UndefOr[String] = js.undefined
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.undefined
  /**
    * Restricts returned entities with these types, e.g. Person
    * (as defined in http://schema.org/Person). If multiple types are specified,
    * returned entities will contain one or more of these types.
    */
  var types: js.UndefOr[String] = js.undefined
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[String] = js.undefined
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[String] = js.undefined
}

object AnonAccesstoken {
  @scala.inline
  def apply(
    $Dotxgafv: String = null,
    access_token: String = null,
    alt: String = null,
    bearer_token: String = null,
    callback: String = null,
    fields: String = null,
    ids: String = null,
    indent: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    languages: String = null,
    limit: Int | Double = null,
    oauth_token: String = null,
    pp: js.UndefOr[Boolean] = js.undefined,
    prefix: js.UndefOr[Boolean] = js.undefined,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    query: String = null,
    quotaUser: String = null,
    types: String = null,
    uploadType: String = null,
    upload_protocol: String = null
  ): AnonAccesstoken = {
    val __obj = js.Dynamic.literal()
    if ($Dotxgafv != null) __obj.updateDynamic("$.xgafv")($Dotxgafv.asInstanceOf[js.Any])
    if (access_token != null) __obj.updateDynamic("access_token")(access_token.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (bearer_token != null) __obj.updateDynamic("bearer_token")(bearer_token.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(callback.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (ids != null) __obj.updateDynamic("ids")(ids.asInstanceOf[js.Any])
    if (!js.isUndefined(indent)) __obj.updateDynamic("indent")(indent.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (languages != null) __obj.updateDynamic("languages")(languages.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (!js.isUndefined(pp)) __obj.updateDynamic("pp")(pp.asInstanceOf[js.Any])
    if (!js.isUndefined(prefix)) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (types != null) __obj.updateDynamic("types")(types.asInstanceOf[js.Any])
    if (uploadType != null) __obj.updateDynamic("uploadType")(uploadType.asInstanceOf[js.Any])
    if (upload_protocol != null) __obj.updateDynamic("upload_protocol")(upload_protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAccesstoken]
  }
}

