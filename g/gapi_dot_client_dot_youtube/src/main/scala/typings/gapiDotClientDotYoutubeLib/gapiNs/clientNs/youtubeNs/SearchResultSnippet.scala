package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SearchResultSnippet extends js.Object {
  /** The value that YouTube uses to uniquely identify the channel that published the resource that the search result identifies. */
  var channelId: js.UndefOr[java.lang.String] = js.undefined
  /** The title of the channel that published the resource that the search result identifies. */
  var channelTitle: js.UndefOr[java.lang.String] = js.undefined
  /** A description of the search result. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
               * It indicates if the resource (video or channel) has upcoming/active live broadcast content. Or it's "none" if there is not any upcoming/active live
               * broadcasts.
               */
  var liveBroadcastContent: js.UndefOr[java.lang.String] = js.undefined
  /** The creation date and time of the resource that the search result identifies. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format. */
  var publishedAt: js.UndefOr[java.lang.String] = js.undefined
  /**
               * A map of thumbnail images associated with the search result. For each object in the map, the key is the name of the thumbnail image, and the value is
               * an object that contains other information about the thumbnail.
               */
  var thumbnails: js.UndefOr[ThumbnailDetails] = js.undefined
  /** The title of the search result. */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

