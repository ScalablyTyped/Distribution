package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SubscriptionSnippet extends js.Object {
  /** The ID that YouTube uses to uniquely identify the subscriber's channel. */
  var channelId: js.UndefOr[java.lang.String] = js.undefined
  /** Channel title for the channel that the subscription belongs to. */
  var channelTitle: js.UndefOr[java.lang.String] = js.undefined
  /** The subscription's details. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** The date and time that the subscription was created. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format. */
  var publishedAt: js.UndefOr[java.lang.String] = js.undefined
  /** The id object contains information about the channel that the user subscribed to. */
  var resourceId: js.UndefOr[ResourceId] = js.undefined
  /**
               * A map of thumbnail images associated with the video. For each object in the map, the key is the name of the thumbnail image, and the value is an object
               * that contains other information about the thumbnail.
               */
  var thumbnails: js.UndefOr[ThumbnailDetails] = js.undefined
  /** The subscription's title. */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

