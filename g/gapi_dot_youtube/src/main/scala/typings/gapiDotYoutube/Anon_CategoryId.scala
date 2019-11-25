package typings.gapiDotYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CategoryId extends js.Object {
  /**
    * The categoryId parameter specifies a YouTube guide category, thereby requesting YouTube channels associated with that category.
    */
  var categoryId: js.UndefOr[String] = js.undefined
  /**
    * The forUsername parameter specifies a YouTube username, thereby requesting the channel associated with that username.
    */
  var forUsername: js.UndefOr[String] = js.undefined
  /**
    * The id parameter specifies a comma-separated list of the YouTube channel ID(s) for the resource(s) that are being retrieved. In a channel resource, the id property specifies the channel's YouTube channel ID.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * Set this parameter's value to true to instruct the API to only return channels managed by the content owner that the onBehalfOfContentOwner parameter specifies. The user must be authenticated as a CMS account linked to the specified content owner and onBehalfOfContentOwner must be provided.
    */
  var managedByMe: js.UndefOr[Boolean] = js.undefined
  /**
    * The maxResults parameter specifies the maximum number of items that should be returned in the result set.
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  /**
    * Set this parameter's value to true to instruct the API to only return channels owned by the authenticated user.
    */
  var mine: js.UndefOr[Boolean] = js.undefined
  /**
    * Set this parameter's value to true to retrieve a list of channels that subscribed to the authenticated user's channel.
    */
  var mySubscribers: js.UndefOr[Boolean] = js.undefined
  /**
    * The onBehalfOfContentOwner parameter indicates that the authenticated user is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The actual CMS account that the user authenticates with needs to be linked to the specified YouTube content owner.
    */
  var onBehalfOfContentOwner: js.UndefOr[String] = js.undefined
  /**
    * The pageToken parameter identifies a specific page in the result set that should be returned. In an API response, the nextPageToken and prevPageToken properties identify other pages that could be retrieved.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  /**
    * The part parameter specifies a comma-separated list of one or more channel resource properties that the API response will include. The part names that you can include in the parameter value are id, snippet, contentDetails, statistics, topicDetails, and invideoPromotion. If the parameter identifies a property that contains child properties, the child properties will be included in the response. For example, in a channel resource, the contentDetails property contains other properties, such as the uploads properties. As such, if you set part=contentDetails, the API response will also contain all of those nested properties.
    */
  var part: String
}

object Anon_CategoryId {
  @scala.inline
  def apply(
    part: String,
    categoryId: String = null,
    forUsername: String = null,
    id: String = null,
    managedByMe: js.UndefOr[Boolean] = js.undefined,
    maxResults: Int | Double = null,
    mine: js.UndefOr[Boolean] = js.undefined,
    mySubscribers: js.UndefOr[Boolean] = js.undefined,
    onBehalfOfContentOwner: String = null,
    pageToken: String = null
  ): Anon_CategoryId = {
    val __obj = js.Dynamic.literal(part = part.asInstanceOf[js.Any])
    if (categoryId != null) __obj.updateDynamic("categoryId")(categoryId.asInstanceOf[js.Any])
    if (forUsername != null) __obj.updateDynamic("forUsername")(forUsername.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(managedByMe)) __obj.updateDynamic("managedByMe")(managedByMe.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (!js.isUndefined(mine)) __obj.updateDynamic("mine")(mine.asInstanceOf[js.Any])
    if (!js.isUndefined(mySubscribers)) __obj.updateDynamic("mySubscribers")(mySubscribers.asInstanceOf[js.Any])
    if (onBehalfOfContentOwner != null) __obj.updateDynamic("onBehalfOfContentOwner")(onBehalfOfContentOwner.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CategoryId]
  }
}

