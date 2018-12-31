package typings
package gapiDotClientDotDfareportingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SizeIdsCreativeIds extends js.Object {
  /** Select only active ads. */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /** Select only ads with this advertiser ID. */
  var advertiserId: js.UndefOr[java.lang.String] = js.undefined
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** Select only archived ads. */
  var archived: js.UndefOr[scala.Boolean] = js.undefined
  /** Select only ads with these audience segment IDs. */
  var audienceSegmentIds: js.UndefOr[java.lang.String] = js.undefined
  /** Select only ads with these campaign IDs. */
  var campaignIds: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Select default ads with the specified compatibility. Applicable when type is AD_SERVING_DEFAULT_AD. DISPLAY and DISPLAY_INTERSTITIAL refer to rendering
    * either on desktop or on mobile devices for regular or interstitial ads, respectively. APP and APP_INTERSTITIAL are for rendering in mobile apps.
    * IN_STREAM_VIDEO refers to rendering an in-stream video ads developed with the VAST standard.
    */
  var compatibility: js.UndefOr[java.lang.String] = js.undefined
  /** Select only ads with these creative IDs assigned. */
  var creativeIds: js.UndefOr[java.lang.String] = js.undefined
  /** Select only ads with these creative optimization configuration IDs. */
  var creativeOptimizationConfigurationIds: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Select only dynamic click trackers. Applicable when type is AD_SERVING_CLICK_TRACKER. If true, select dynamic click trackers. If false, select static
    * click trackers. Leave unset to select both.
    */
  var dynamicClickTracker: js.UndefOr[scala.Boolean] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** Select only ads with these IDs. */
  var ids: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** Select only ads with these landing page IDs. */
  var landingPageIds: js.UndefOr[java.lang.String] = js.undefined
  /** Maximum number of results to return. */
  var maxResults: js.UndefOr[scala.Double] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /** Select only ads with this event tag override ID. */
  var overriddenEventTagId: js.UndefOr[java.lang.String] = js.undefined
  /** Value of the nextPageToken from the previous result page. */
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
  /** Select only ads with these placement IDs assigned. */
  var placementIds: js.UndefOr[java.lang.String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /** User profile ID associated with this request. */
  var profileId: java.lang.String
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /** Select only ads whose list targeting expression use these remarketing list IDs. */
  var remarketingListIds: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Allows searching for objects by name or ID. Wildcards (&#42;) are allowed. For example, "ad&#42;2015" will return objects with names like "ad June 2015", "ad
    * April 2015", or simply "ad 2015". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a
    * search string of "ad" will match objects with name "my ad", "ad 2015", or simply "ad".
    */
  var searchString: js.UndefOr[java.lang.String] = js.undefined
  /** Select only ads with these size IDs. */
  var sizeIds: js.UndefOr[java.lang.String] = js.undefined
  /** Field by which to sort the list. */
  var sortField: js.UndefOr[java.lang.String] = js.undefined
  /** Order of sorted results. */
  var sortOrder: js.UndefOr[java.lang.String] = js.undefined
  /** Select only ads that are SSL-compliant. */
  var sslCompliant: js.UndefOr[scala.Boolean] = js.undefined
  /** Select only ads that require SSL. */
  var sslRequired: js.UndefOr[scala.Boolean] = js.undefined
  /** Select only ads with these types. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[java.lang.String] = js.undefined
}

