package typings.gapiDotClientDotDfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AdId extends js.Object {
  /** Select only event tags that belong to this ad. */
  var adId: js.UndefOr[String] = js.undefined
  /** Select only event tags that belong to this advertiser. */
  var advertiserId: js.UndefOr[String] = js.undefined
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.undefined
  /** Select only event tags that belong to this campaign. */
  var campaignId: js.UndefOr[String] = js.undefined
  /**
    * Examine only the specified campaign or advertiser's event tags for matching selector criteria. When set to false, the parent advertiser and parent
    * campaign of the specified ad or campaign is examined as well. In addition, when set to false, the status field is examined as well, along with the
    * enabledByDefault field. This parameter can not be set to true when adId is specified as ads do not define their own even tags.
    */
  var definitionsOnly: js.UndefOr[Boolean] = js.undefined
  /**
    * Select only enabled event tags. What is considered enabled or disabled depends on the definitionsOnly parameter. When definitionsOnly is set to true,
    * only the specified advertiser or campaign's event tags' enabledByDefault field is examined. When definitionsOnly is set to false, the specified ad or
    * specified campaign's parent advertiser's or parent campaign's event tags' enabledByDefault and status fields are examined as well.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Select only event tags with the specified event tag types. Event tag types can be used to specify whether to use a third-party pixel, a third-party
    * JavaScript URL, or a third-party click-through URL for either impression or click tracking.
    */
  var eventTagTypes: js.UndefOr[String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  /** Select only event tags with these IDs. */
  var ids: js.UndefOr[String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  /** User profile ID associated with this request. */
  var profileId: String
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[String] = js.undefined
  /**
    * Allows searching for objects by name or ID. Wildcards (&#42;) are allowed. For example, "eventtag&#42;2015" will return objects with names like "eventtag June
    * 2015", "eventtag April 2015", or simply "eventtag 2015". Most of the searches also add wildcards implicitly at the start and the end of the search
    * string. For example, a search string of "eventtag" will match objects with name "my eventtag", "eventtag 2015", or simply "eventtag".
    */
  var searchString: js.UndefOr[String] = js.undefined
  /** Field by which to sort the list. */
  var sortField: js.UndefOr[String] = js.undefined
  /** Order of sorted results. */
  var sortOrder: js.UndefOr[String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.undefined
}

object Anon_AdId {
  @scala.inline
  def apply(
    profileId: String,
    adId: String = null,
    advertiserId: String = null,
    alt: String = null,
    campaignId: String = null,
    definitionsOnly: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    eventTagTypes: String = null,
    fields: String = null,
    ids: String = null,
    key: String = null,
    oauth_token: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    searchString: String = null,
    sortField: String = null,
    sortOrder: String = null,
    userIp: String = null
  ): Anon_AdId = {
    val __obj = js.Dynamic.literal(profileId = profileId)
    if (adId != null) __obj.updateDynamic("adId")(adId)
    if (advertiserId != null) __obj.updateDynamic("advertiserId")(advertiserId)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (campaignId != null) __obj.updateDynamic("campaignId")(campaignId)
    if (!js.isUndefined(definitionsOnly)) __obj.updateDynamic("definitionsOnly")(definitionsOnly)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (eventTagTypes != null) __obj.updateDynamic("eventTagTypes")(eventTagTypes)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (ids != null) __obj.updateDynamic("ids")(ids)
    if (key != null) __obj.updateDynamic("key")(key)
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (searchString != null) __obj.updateDynamic("searchString")(searchString)
    if (sortField != null) __obj.updateDynamic("sortField")(sortField)
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder)
    if (userIp != null) __obj.updateDynamic("userIp")(userIp)
    __obj.asInstanceOf[Anon_AdId]
  }
}

