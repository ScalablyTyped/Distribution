package typings
package gapiDotClientDotDfareportingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AcceptsInStreamVideoPlacementsAcceptsInterstitialPlacements extends js.Object {
  /** This search filter is no longer supported and will have no effect on the results returned. */
  var acceptsInStreamVideoPlacements: js.UndefOr[scala.Boolean] = js.undefined
  /** This search filter is no longer supported and will have no effect on the results returned. */
  var acceptsInterstitialPlacements: js.UndefOr[scala.Boolean] = js.undefined
  /** Select only sites that accept publisher paid placements. */
  var acceptsPublisherPaidPlacements: js.UndefOr[scala.Boolean] = js.undefined
  /** Select only AdWords sites. */
  var adWordsSite: js.UndefOr[scala.Boolean] = js.undefined
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** Select only approved sites. */
  var approved: js.UndefOr[scala.Boolean] = js.undefined
  /** Select only sites with these campaign IDs. */
  var campaignIds: js.UndefOr[java.lang.String] = js.undefined
  /** Select only sites with these directory site IDs. */
  var directorySiteIds: js.UndefOr[java.lang.String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** Select only sites with these IDs. */
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
  /**
    * Allows searching for objects by name, ID or keyName. Wildcards (&#42;) are allowed. For example, "site&#42;2015" will return objects with names like "site June
    * 2015", "site April 2015", or simply "site 2015". Most of the searches also add wildcards implicitly at the start and the end of the search string. For
    * example, a search string of "site" will match objects with name "my site", "site 2015", or simply "site".
    */
  var searchString: js.UndefOr[java.lang.String] = js.undefined
  /** Field by which to sort the list. */
  var sortField: js.UndefOr[java.lang.String] = js.undefined
  /** Order of sorted results. */
  var sortOrder: js.UndefOr[java.lang.String] = js.undefined
  /** Select only sites with this subaccount ID. */
  var subaccountId: js.UndefOr[java.lang.String] = js.undefined
  /** Select only sites that have not been mapped to a directory site. */
  var unmappedSite: js.UndefOr[scala.Boolean] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AcceptsInStreamVideoPlacementsAcceptsInterstitialPlacements {
  @scala.inline
  def apply(
    profileId: java.lang.String,
    acceptsInStreamVideoPlacements: js.UndefOr[scala.Boolean] = js.undefined,
    acceptsInterstitialPlacements: js.UndefOr[scala.Boolean] = js.undefined,
    acceptsPublisherPaidPlacements: js.UndefOr[scala.Boolean] = js.undefined,
    adWordsSite: js.UndefOr[scala.Boolean] = js.undefined,
    alt: java.lang.String = null,
    approved: js.UndefOr[scala.Boolean] = js.undefined,
    campaignIds: java.lang.String = null,
    directorySiteIds: java.lang.String = null,
    fields: java.lang.String = null,
    ids: java.lang.String = null,
    key: java.lang.String = null,
    maxResults: scala.Int | scala.Double = null,
    oauth_token: java.lang.String = null,
    pageToken: java.lang.String = null,
    prettyPrint: js.UndefOr[scala.Boolean] = js.undefined,
    quotaUser: java.lang.String = null,
    searchString: java.lang.String = null,
    sortField: java.lang.String = null,
    sortOrder: java.lang.String = null,
    subaccountId: java.lang.String = null,
    unmappedSite: js.UndefOr[scala.Boolean] = js.undefined,
    userIp: java.lang.String = null
  ): Anon_AcceptsInStreamVideoPlacementsAcceptsInterstitialPlacements = {
    val __obj = js.Dynamic.literal(profileId = profileId)
    if (!js.isUndefined(acceptsInStreamVideoPlacements)) __obj.updateDynamic("acceptsInStreamVideoPlacements")(acceptsInStreamVideoPlacements)
    if (!js.isUndefined(acceptsInterstitialPlacements)) __obj.updateDynamic("acceptsInterstitialPlacements")(acceptsInterstitialPlacements)
    if (!js.isUndefined(acceptsPublisherPaidPlacements)) __obj.updateDynamic("acceptsPublisherPaidPlacements")(acceptsPublisherPaidPlacements)
    if (!js.isUndefined(adWordsSite)) __obj.updateDynamic("adWordsSite")(adWordsSite)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (!js.isUndefined(approved)) __obj.updateDynamic("approved")(approved)
    if (campaignIds != null) __obj.updateDynamic("campaignIds")(campaignIds)
    if (directorySiteIds != null) __obj.updateDynamic("directorySiteIds")(directorySiteIds)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (ids != null) __obj.updateDynamic("ids")(ids)
    if (key != null) __obj.updateDynamic("key")(key)
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (searchString != null) __obj.updateDynamic("searchString")(searchString)
    if (sortField != null) __obj.updateDynamic("sortField")(sortField)
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder)
    if (subaccountId != null) __obj.updateDynamic("subaccountId")(subaccountId)
    if (!js.isUndefined(unmappedSite)) __obj.updateDynamic("unmappedSite")(unmappedSite)
    if (userIp != null) __obj.updateDynamic("userIp")(userIp)
    __obj.asInstanceOf[Anon_AcceptsInStreamVideoPlacementsAcceptsInterstitialPlacements]
  }
}

