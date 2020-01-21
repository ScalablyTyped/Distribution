package typings.gapiClientDfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonActiveAdvertiserIdAlt extends js.Object {
  /** Select only active creatives. Leave blank to select active and inactive creatives. */
  var active: js.UndefOr[Boolean] = js.undefined
  /** Select only creatives with this advertiser ID. */
  var advertiserId: js.UndefOr[String] = js.undefined
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.undefined
  /** Select only archived creatives. Leave blank to select archived and unarchived creatives. */
  var archived: js.UndefOr[Boolean] = js.undefined
  /** Select only creatives with this campaign ID. */
  var campaignId: js.UndefOr[String] = js.undefined
  /** Select only in-stream video creatives with these companion IDs. */
  var companionCreativeIds: js.UndefOr[String] = js.undefined
  /** Select only creatives with these creative field IDs. */
  var creativeFieldIds: js.UndefOr[String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  /** Select only creatives with these IDs. */
  var ids: js.UndefOr[String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  /** Maximum number of results to return. */
  var maxResults: js.UndefOr[Double] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  /** Value of the nextPageToken from the previous result page. */
  var pageToken: js.UndefOr[String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  /** User profile ID associated with this request. */
  var profileId: String
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[String] = js.undefined
  /** Select only creatives with these rendering IDs. */
  var renderingIds: js.UndefOr[String] = js.undefined
  /**
    * Allows searching for objects by name or ID. Wildcards (&#42;) are allowed. For example, "creative&#42;2015" will return objects with names like "creative June
    * 2015", "creative April 2015", or simply "creative 2015". Most of the searches also add wildcards implicitly at the start and the end of the search
    * string. For example, a search string of "creative" will match objects with name "my creative", "creative 2015", or simply "creative".
    */
  var searchString: js.UndefOr[String] = js.undefined
  /** Select only creatives with these size IDs. */
  var sizeIds: js.UndefOr[String] = js.undefined
  /** Field by which to sort the list. */
  var sortField: js.UndefOr[String] = js.undefined
  /** Order of sorted results. */
  var sortOrder: js.UndefOr[String] = js.undefined
  /** Select only creatives corresponding to this Studio creative ID. */
  var studioCreativeId: js.UndefOr[String] = js.undefined
  /** Select only creatives with these creative types. */
  var types: js.UndefOr[String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.undefined
}

object AnonActiveAdvertiserIdAlt {
  @scala.inline
  def apply(
    profileId: String,
    active: js.UndefOr[Boolean] = js.undefined,
    advertiserId: String = null,
    alt: String = null,
    archived: js.UndefOr[Boolean] = js.undefined,
    campaignId: String = null,
    companionCreativeIds: String = null,
    creativeFieldIds: String = null,
    fields: String = null,
    ids: String = null,
    key: String = null,
    maxResults: Int | Double = null,
    oauth_token: String = null,
    pageToken: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    renderingIds: String = null,
    searchString: String = null,
    sizeIds: String = null,
    sortField: String = null,
    sortOrder: String = null,
    studioCreativeId: String = null,
    types: String = null,
    userIp: String = null
  ): AnonActiveAdvertiserIdAlt = {
    val __obj = js.Dynamic.literal(profileId = profileId.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (advertiserId != null) __obj.updateDynamic("advertiserId")(advertiserId.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (!js.isUndefined(archived)) __obj.updateDynamic("archived")(archived.asInstanceOf[js.Any])
    if (campaignId != null) __obj.updateDynamic("campaignId")(campaignId.asInstanceOf[js.Any])
    if (companionCreativeIds != null) __obj.updateDynamic("companionCreativeIds")(companionCreativeIds.asInstanceOf[js.Any])
    if (creativeFieldIds != null) __obj.updateDynamic("creativeFieldIds")(creativeFieldIds.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (ids != null) __obj.updateDynamic("ids")(ids.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (renderingIds != null) __obj.updateDynamic("renderingIds")(renderingIds.asInstanceOf[js.Any])
    if (searchString != null) __obj.updateDynamic("searchString")(searchString.asInstanceOf[js.Any])
    if (sizeIds != null) __obj.updateDynamic("sizeIds")(sizeIds.asInstanceOf[js.Any])
    if (sortField != null) __obj.updateDynamic("sortField")(sortField.asInstanceOf[js.Any])
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    if (studioCreativeId != null) __obj.updateDynamic("studioCreativeId")(studioCreativeId.asInstanceOf[js.Any])
    if (types != null) __obj.updateDynamic("types")(types.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonActiveAdvertiserIdAlt]
  }
}

