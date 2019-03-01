package typings
package gapiDotClientDotDfareportingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActiveAdvertiserIdAlt extends js.Object {
  /** Select only active creatives. Leave blank to select active and inactive creatives. */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /** Select only creatives with this advertiser ID. */
  var advertiserId: js.UndefOr[java.lang.String] = js.undefined
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** Select only archived creatives. Leave blank to select archived and unarchived creatives. */
  var archived: js.UndefOr[scala.Boolean] = js.undefined
  /** Select only creatives with this campaign ID. */
  var campaignId: js.UndefOr[java.lang.String] = js.undefined
  /** Select only in-stream video creatives with these companion IDs. */
  var companionCreativeIds: js.UndefOr[java.lang.String] = js.undefined
  /** Select only creatives with these creative field IDs. */
  var creativeFieldIds: js.UndefOr[java.lang.String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** Select only creatives with these IDs. */
  var ids: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** Maximum number of results to return. */
  var maxResults: js.UndefOr[scala.Double] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /** Value of the nextPageToken from the previous result page. */
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /** User profile ID associated with this request. */
  var profileId: java.lang.String
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /** Select only creatives with these rendering IDs. */
  var renderingIds: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Allows searching for objects by name or ID. Wildcards (&#42;) are allowed. For example, "creative&#42;2015" will return objects with names like "creative June
    * 2015", "creative April 2015", or simply "creative 2015". Most of the searches also add wildcards implicitly at the start and the end of the search
    * string. For example, a search string of "creative" will match objects with name "my creative", "creative 2015", or simply "creative".
    */
  var searchString: js.UndefOr[java.lang.String] = js.undefined
  /** Select only creatives with these size IDs. */
  var sizeIds: js.UndefOr[java.lang.String] = js.undefined
  /** Field by which to sort the list. */
  var sortField: js.UndefOr[java.lang.String] = js.undefined
  /** Order of sorted results. */
  var sortOrder: js.UndefOr[java.lang.String] = js.undefined
  /** Select only creatives corresponding to this Studio creative ID. */
  var studioCreativeId: js.UndefOr[java.lang.String] = js.undefined
  /** Select only creatives with these creative types. */
  var types: js.UndefOr[java.lang.String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ActiveAdvertiserIdAlt {
  @scala.inline
  def apply(
    profileId: java.lang.String,
    active: js.UndefOr[scala.Boolean] = js.undefined,
    advertiserId: java.lang.String = null,
    alt: java.lang.String = null,
    archived: js.UndefOr[scala.Boolean] = js.undefined,
    campaignId: java.lang.String = null,
    companionCreativeIds: java.lang.String = null,
    creativeFieldIds: java.lang.String = null,
    fields: java.lang.String = null,
    ids: java.lang.String = null,
    key: java.lang.String = null,
    maxResults: scala.Int | scala.Double = null,
    oauth_token: java.lang.String = null,
    pageToken: java.lang.String = null,
    prettyPrint: js.UndefOr[scala.Boolean] = js.undefined,
    quotaUser: java.lang.String = null,
    renderingIds: java.lang.String = null,
    searchString: java.lang.String = null,
    sizeIds: java.lang.String = null,
    sortField: java.lang.String = null,
    sortOrder: java.lang.String = null,
    studioCreativeId: java.lang.String = null,
    types: java.lang.String = null,
    userIp: java.lang.String = null
  ): Anon_ActiveAdvertiserIdAlt = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("profileId")(profileId)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (advertiserId != null) __obj.updateDynamic("advertiserId")(advertiserId)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (!js.isUndefined(archived)) __obj.updateDynamic("archived")(archived)
    if (campaignId != null) __obj.updateDynamic("campaignId")(campaignId)
    if (companionCreativeIds != null) __obj.updateDynamic("companionCreativeIds")(companionCreativeIds)
    if (creativeFieldIds != null) __obj.updateDynamic("creativeFieldIds")(creativeFieldIds)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (ids != null) __obj.updateDynamic("ids")(ids)
    if (key != null) __obj.updateDynamic("key")(key)
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (renderingIds != null) __obj.updateDynamic("renderingIds")(renderingIds)
    if (searchString != null) __obj.updateDynamic("searchString")(searchString)
    if (sizeIds != null) __obj.updateDynamic("sizeIds")(sizeIds)
    if (sortField != null) __obj.updateDynamic("sortField")(sortField)
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder)
    if (studioCreativeId != null) __obj.updateDynamic("studioCreativeId")(studioCreativeId)
    if (types != null) __obj.updateDynamic("types")(types)
    if (userIp != null) __obj.updateDynamic("userIp")(userIp)
    __obj.asInstanceOf[Anon_ActiveAdvertiserIdAlt]
  }
}

