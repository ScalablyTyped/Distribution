package typings.gapiYoutube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Home extends js.Object {
  /**
    * The channelId parameter specifies a unique YouTube channel ID. The API will then return a list of that channel's activities.
    */
  var channelId: js.UndefOr[String] = js.undefined
  /**
    * Set this parameter's value to true to retrieve the activity feed that displays on the YouTube home page for the currently authenticated user.
    */
  var home: js.UndefOr[Boolean] = js.undefined
  /**
    * The maxResults parameter specifies the maximum number of items that should be returned in the result set.
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  /**
    * Set this parameter's value to true to retrieve a feed of the authenticated user's activities.
    */
  var mine: js.UndefOr[Boolean] = js.undefined
  /**
    * The pageToken parameter identifies a specific page in the result set that should be returned. In an API response, the nextPageToken and prevPageToken properties identify other pages that could be retrieved.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  /**
    * The part parameter specifies a comma-separated list of one or more activity resource properties that the API response will include. The part names that you can include in the parameter value are id, snippet, and contentDetails. If the parameter identifies a property that contains child properties, the child properties will be included in the response. For example, in a activity resource, the snippet property contains other properties that identify the type of activity, a display title for the activity, and so forth. If you set part=snippet, the API response will also contain all of those nested properties.
    */
  var part: String
  /**
    * The publishedAfter parameter specifies the earliest date and time that an activity could have occurred for that activity to be included in the API response. If the parameter value specifies a day, but not a time, then any activities that occurred that day will be included in the result set. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var publishedAfter: js.UndefOr[String] = js.undefined
  /**
    * The publishedBefore parameter specifies the date and time before which an activity must have occurred for that activity to be included in the API response. If the parameter value specifies a day, but not a time, then any activities that occurred that day will be excluded from the result set. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var publishedBefore: js.UndefOr[String] = js.undefined
  /**
    * The regionCode parameter instructs the API to return results for the specified country. The parameter value is an ISO 3166-1 alpha-2 country code.
    */
  var regionCode: js.UndefOr[String] = js.undefined
}

object Home {
  @scala.inline
  def apply(
    part: String,
    channelId: String = null,
    home: js.UndefOr[Boolean] = js.undefined,
    maxResults: js.UndefOr[Double] = js.undefined,
    mine: js.UndefOr[Boolean] = js.undefined,
    pageToken: String = null,
    publishedAfter: String = null,
    publishedBefore: String = null,
    regionCode: String = null
  ): Home = {
    val __obj = js.Dynamic.literal(part = part.asInstanceOf[js.Any])
    if (channelId != null) __obj.updateDynamic("channelId")(channelId.asInstanceOf[js.Any])
    if (!js.isUndefined(home)) __obj.updateDynamic("home")(home.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mine)) __obj.updateDynamic("mine")(mine.get.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (publishedAfter != null) __obj.updateDynamic("publishedAfter")(publishedAfter.asInstanceOf[js.Any])
    if (publishedBefore != null) __obj.updateDynamic("publishedBefore")(publishedBefore.asInstanceOf[js.Any])
    if (regionCode != null) __obj.updateDynamic("regionCode")(regionCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Home]
  }
}

