package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait LiveStream extends js.Object {
  /**
               * The cdn object defines the live stream's content delivery network (CDN) settings. These settings provide details about the manner in which you stream
               * your content to YouTube.
               */
  var cdn: js.UndefOr[CdnSettings] = js.undefined
  /** The content_details object contains information about the stream, including the closed captions ingestion URL. */
  var contentDetails: js.UndefOr[LiveStreamContentDetails] = js.undefined
  /** Etag of this resource. */
  var etag: js.UndefOr[java.lang.String] = js.undefined
  /** The ID that YouTube assigns to uniquely identify the stream. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "youtube#liveStream". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The snippet object contains basic details about the stream, including its channel, title, and description. */
  var snippet: js.UndefOr[LiveStreamSnippet] = js.undefined
  /** The status object contains information about live stream's status. */
  var status: js.UndefOr[LiveStreamStatus] = js.undefined
}

