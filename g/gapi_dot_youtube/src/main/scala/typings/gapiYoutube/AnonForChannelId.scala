package typings.gapiYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonForChannelId extends js.Object {
  /**
    * The channelId parameter specifies a YouTube channel ID. The API will only return that channel's subscriptions.
    */
  var channelId: js.UndefOr[String] = js.undefined
  /**
    * The forChannelId parameter specifies a comma-separated list of channel IDs. The API response will then only contain subscriptions matching those channels.
    */
  var forChannelId: js.UndefOr[String] = js.undefined
  /**
    * The id parameter specifies a comma-separated list of the YouTube subscription ID(s) for the resource(s) that are being retrieved. In a subscription resource, the id property specifies the YouTube subscription ID.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * The maxResults parameter specifies the maximum number of items that should be returned in the result set.
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  /**
    * Set this parameter's value to true to retrieve a feed of the authenticated user's subscriptions.
    */
  var mine: js.UndefOr[Boolean] = js.undefined
  /**
    * Set this parameter's value to true to retrieve a feed of the subscribers of the authenticated user.
    */
  var mySubscripbers: js.UndefOr[Boolean] = js.undefined
  /**
    * The order parameter specifies the method that will be used to sort resources in the API response.
    */
  var order: js.UndefOr[String] = js.undefined
  /**
    * The pageToken parameter identifies a specific page in the result set that should be returned. In an API response, the nextPageToken and prevPageToken properties identify other pages that could be retrieved.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  /**
    * The part parameter specifies a comma-separated list of one or more subscription resource properties that the API response will include. The part names that you can include in the parameter value are id, snippet, and contentDetails. If the parameter identifies a property that contains child properties, the child properties will be included in the response. For example, in a subscription resource, the snippet property contains other properties, such as a display title for the subscription. If you set part=snippet, the API response will also contain all of those nested properties.
    */
  var part: String
}

object AnonForChannelId {
  @scala.inline
  def apply(
    part: String,
    channelId: String = null,
    forChannelId: String = null,
    id: String = null,
    maxResults: Int | Double = null,
    mine: js.UndefOr[Boolean] = js.undefined,
    mySubscripbers: js.UndefOr[Boolean] = js.undefined,
    order: String = null,
    pageToken: String = null
  ): AnonForChannelId = {
    val __obj = js.Dynamic.literal(part = part.asInstanceOf[js.Any])
    if (channelId != null) __obj.updateDynamic("channelId")(channelId.asInstanceOf[js.Any])
    if (forChannelId != null) __obj.updateDynamic("forChannelId")(forChannelId.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (!js.isUndefined(mine)) __obj.updateDynamic("mine")(mine.asInstanceOf[js.Any])
    if (!js.isUndefined(mySubscripbers)) __obj.updateDynamic("mySubscripbers")(mySubscripbers.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonForChannelId]
  }
}

