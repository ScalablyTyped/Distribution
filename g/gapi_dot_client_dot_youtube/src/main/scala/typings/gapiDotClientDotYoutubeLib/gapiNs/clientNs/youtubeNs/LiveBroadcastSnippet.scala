package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveBroadcastSnippet extends js.Object {
  /**
    * The date and time that the broadcast actually ended. This information is only available once the broadcast's state is complete. The value is specified
    * in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var actualEndTime: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The date and time that the broadcast actually started. This information is only available once the broadcast's state is live. The value is specified in
    * ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var actualStartTime: js.UndefOr[java.lang.String] = js.undefined
  /** The ID that YouTube uses to uniquely identify the channel that is publishing the broadcast. */
  var channelId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The broadcast's description. As with the title, you can set this field by modifying the broadcast resource or by setting the description field of the
    * corresponding video resource.
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  var isDefaultBroadcast: js.UndefOr[scala.Boolean] = js.undefined
  /** The id of the live chat for this broadcast. */
  var liveChatId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The date and time that the broadcast was added to YouTube's live broadcast schedule. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ)
    * format.
    */
  var publishedAt: js.UndefOr[java.lang.String] = js.undefined
  /** The date and time that the broadcast is scheduled to end. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format. */
  var scheduledEndTime: js.UndefOr[java.lang.String] = js.undefined
  /** The date and time that the broadcast is scheduled to start. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format. */
  var scheduledStartTime: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A map of thumbnail images associated with the broadcast. For each nested object in this object, the key is the name of the thumbnail image, and the
    * value is an object that contains other information about the thumbnail.
    */
  var thumbnails: js.UndefOr[ThumbnailDetails] = js.undefined
  /**
    * The broadcast's title. Note that the broadcast represents exactly one YouTube video. You can set this field by modifying the broadcast resource or by
    * setting the title field of the corresponding video resource.
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

