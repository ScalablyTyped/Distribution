package typings.gapiDotYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdMaxResults extends js.Object {
  /**
    * The id parameter specifies a comma-separated list of one or more unique playlist item IDs.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * The maxResults parameter specifies the maximum number of items that should be returned in the result set.
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  /**
    * The pageToken parameter identifies a specific page in the result set that should be returned. In an API response, the nextPageToken and prevPageToken properties identify other pages that could be retrieved.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  /**
    * The part parameter specifies a comma-separated list of one or more playlistItem resource properties that the API response will include. The part names that you can include in the parameter value are id, snippet, and contentDetails. If the parameter identifies a property that contains child properties, the child properties will be included in the response. For example, in a playlistItem resource, the snippet property contains numerous fields, including the title, description, position, and resourceId properties. As such, if you set part=snippet, the API response will contain all of those properties.
    */
  var part: String
  /**
    * The playlistId parameter specifies the unique ID of the playlist for which you want to retrieve playlist items. Note that even though this is an optional parameter, every request to retrieve playlist items must specify a value for either the id parameter or the playlistId parameter.
    */
  var playlistId: js.UndefOr[String] = js.undefined
  /**
    * The videoId parameter specifies that the request should return only the playlist items that contain the specified video.
    */
  var videoId: js.UndefOr[String] = js.undefined
}

object Anon_IdMaxResults {
  @scala.inline
  def apply(
    part: String,
    id: String = null,
    maxResults: Int | Double = null,
    pageToken: String = null,
    playlistId: String = null,
    videoId: String = null
  ): Anon_IdMaxResults = {
    val __obj = js.Dynamic.literal(part = part.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (playlistId != null) __obj.updateDynamic("playlistId")(playlistId.asInstanceOf[js.Any])
    if (videoId != null) __obj.updateDynamic("videoId")(videoId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IdMaxResults]
  }
}

