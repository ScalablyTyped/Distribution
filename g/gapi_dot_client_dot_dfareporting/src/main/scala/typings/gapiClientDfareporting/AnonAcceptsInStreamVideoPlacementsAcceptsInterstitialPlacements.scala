package typings.gapiClientDfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAcceptsInStreamVideoPlacementsAcceptsInterstitialPlacements extends js.Object {
  /** This search filter is no longer supported and will have no effect on the results returned. */
  var acceptsInStreamVideoPlacements: js.UndefOr[Boolean] = js.undefined
  /** This search filter is no longer supported and will have no effect on the results returned. */
  var acceptsInterstitialPlacements: js.UndefOr[Boolean] = js.undefined
  /** Select only sites that accept publisher paid placements. */
  var acceptsPublisherPaidPlacements: js.UndefOr[Boolean] = js.undefined
  /** Select only AdWords sites. */
  var adWordsSite: js.UndefOr[Boolean] = js.undefined
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.undefined
  /** Select only approved sites. */
  var approved: js.UndefOr[Boolean] = js.undefined
  /** Select only sites with these campaign IDs. */
  var campaignIds: js.UndefOr[String] = js.undefined
  /** Select only sites with these directory site IDs. */
  var directorySiteIds: js.UndefOr[String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  /** Select only sites with these IDs. */
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
  /**
    * Allows searching for objects by name, ID or keyName. Wildcards (&#42;) are allowed. For example, "site&#42;2015" will return objects with names like "site June
    * 2015", "site April 2015", or simply "site 2015". Most of the searches also add wildcards implicitly at the start and the end of the search string. For
    * example, a search string of "site" will match objects with name "my site", "site 2015", or simply "site".
    */
  var searchString: js.UndefOr[String] = js.undefined
  /** Field by which to sort the list. */
  var sortField: js.UndefOr[String] = js.undefined
  /** Order of sorted results. */
  var sortOrder: js.UndefOr[String] = js.undefined
  /** Select only sites with this subaccount ID. */
  var subaccountId: js.UndefOr[String] = js.undefined
  /** Select only sites that have not been mapped to a directory site. */
  var unmappedSite: js.UndefOr[Boolean] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.undefined
}

object AnonAcceptsInStreamVideoPlacementsAcceptsInterstitialPlacements {
  @scala.inline
  def apply(
    profileId: String,
    acceptsInStreamVideoPlacements: js.UndefOr[Boolean] = js.undefined,
    acceptsInterstitialPlacements: js.UndefOr[Boolean] = js.undefined,
    acceptsPublisherPaidPlacements: js.UndefOr[Boolean] = js.undefined,
    adWordsSite: js.UndefOr[Boolean] = js.undefined,
    alt: String = null,
    approved: js.UndefOr[Boolean] = js.undefined,
    campaignIds: String = null,
    directorySiteIds: String = null,
    fields: String = null,
    ids: String = null,
    key: String = null,
    maxResults: Int | Double = null,
    oauth_token: String = null,
    pageToken: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    searchString: String = null,
    sortField: String = null,
    sortOrder: String = null,
    subaccountId: String = null,
    unmappedSite: js.UndefOr[Boolean] = js.undefined,
    userIp: String = null
  ): AnonAcceptsInStreamVideoPlacementsAcceptsInterstitialPlacements = {
    val __obj = js.Dynamic.literal(profileId = profileId.asInstanceOf[js.Any])
    if (!js.isUndefined(acceptsInStreamVideoPlacements)) __obj.updateDynamic("acceptsInStreamVideoPlacements")(acceptsInStreamVideoPlacements.asInstanceOf[js.Any])
    if (!js.isUndefined(acceptsInterstitialPlacements)) __obj.updateDynamic("acceptsInterstitialPlacements")(acceptsInterstitialPlacements.asInstanceOf[js.Any])
    if (!js.isUndefined(acceptsPublisherPaidPlacements)) __obj.updateDynamic("acceptsPublisherPaidPlacements")(acceptsPublisherPaidPlacements.asInstanceOf[js.Any])
    if (!js.isUndefined(adWordsSite)) __obj.updateDynamic("adWordsSite")(adWordsSite.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (!js.isUndefined(approved)) __obj.updateDynamic("approved")(approved.asInstanceOf[js.Any])
    if (campaignIds != null) __obj.updateDynamic("campaignIds")(campaignIds.asInstanceOf[js.Any])
    if (directorySiteIds != null) __obj.updateDynamic("directorySiteIds")(directorySiteIds.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (ids != null) __obj.updateDynamic("ids")(ids.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (searchString != null) __obj.updateDynamic("searchString")(searchString.asInstanceOf[js.Any])
    if (sortField != null) __obj.updateDynamic("sortField")(sortField.asInstanceOf[js.Any])
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    if (subaccountId != null) __obj.updateDynamic("subaccountId")(subaccountId.asInstanceOf[js.Any])
    if (!js.isUndefined(unmappedSite)) __obj.updateDynamic("unmappedSite")(unmappedSite.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAcceptsInStreamVideoPlacementsAcceptsInterstitialPlacements]
  }
}

