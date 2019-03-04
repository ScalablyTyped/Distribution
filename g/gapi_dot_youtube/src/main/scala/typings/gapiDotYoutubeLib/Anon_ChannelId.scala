package typings
package gapiDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChannelId extends js.Object {
  /**
    * The channelId parameter specifies a unique YouTube channel ID. The API will then return a list of that channel's activities.
    */
  var channelId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Set this parameter's value to true to retrieve the activity feed that displays on the YouTube home page for the currently authenticated user.
    */
  var home: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The maxResults parameter specifies the maximum number of items that should be returned in the result set.
    */
  var maxResults: js.UndefOr[scala.Double] = js.undefined
  /**
    * Set this parameter's value to true to retrieve a feed of the authenticated user's activities.
    */
  var mine: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The pageToken parameter identifies a specific page in the result set that should be returned. In an API response, the nextPageToken and prevPageToken properties identify other pages that could be retrieved.
    */
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The part parameter specifies a comma-separated list of one or more activity resource properties that the API response will include. The part names that you can include in the parameter value are id, snippet, and contentDetails. If the parameter identifies a property that contains child properties, the child properties will be included in the response. For example, in a activity resource, the snippet property contains other properties that identify the type of activity, a display title for the activity, and so forth. If you set part=snippet, the API response will also contain all of those nested properties.
    */
  var part: java.lang.String
  /**
    * The publishedAfter parameter specifies the earliest date and time that an activity could have occurred for that activity to be included in the API response. If the parameter value specifies a day, but not a time, then any activities that occurred that day will be included in the result set. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var publishedAfter: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The publishedBefore parameter specifies the date and time before which an activity must have occurred for that activity to be included in the API response. If the parameter value specifies a day, but not a time, then any activities that occurred that day will be excluded from the result set. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var publishedBefore: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The regionCode parameter instructs the API to return results for the specified country. The parameter value is an ISO 3166-1 alpha-2 country code.
    */
  var regionCode: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ChannelId {
  @scala.inline
  def apply(
    part: java.lang.String,
    channelId: java.lang.String = null,
    home: js.UndefOr[scala.Boolean] = js.undefined,
    maxResults: scala.Int | scala.Double = null,
    mine: js.UndefOr[scala.Boolean] = js.undefined,
    pageToken: java.lang.String = null,
    publishedAfter: java.lang.String = null,
    publishedBefore: java.lang.String = null,
    regionCode: java.lang.String = null
  ): Anon_ChannelId = {
    val __obj = js.Dynamic.literal(part = part)
    if (channelId != null) __obj.updateDynamic("channelId")(channelId)
    if (!js.isUndefined(home)) __obj.updateDynamic("home")(home)
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (!js.isUndefined(mine)) __obj.updateDynamic("mine")(mine)
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    if (publishedAfter != null) __obj.updateDynamic("publishedAfter")(publishedAfter)
    if (publishedBefore != null) __obj.updateDynamic("publishedBefore")(publishedBefore)
    if (regionCode != null) __obj.updateDynamic("regionCode")(regionCode)
    __obj.asInstanceOf[Anon_ChannelId]
  }
}

