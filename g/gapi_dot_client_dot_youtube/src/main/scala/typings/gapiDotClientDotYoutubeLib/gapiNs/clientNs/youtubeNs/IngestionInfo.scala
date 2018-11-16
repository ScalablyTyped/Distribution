package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IngestionInfo extends js.Object {
  /**
               * The backup ingestion URL that you should use to stream video to YouTube. You have the option of simultaneously streaming the content that you are
               * sending to the ingestionAddress to this URL.
               */
  var backupIngestionAddress: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The primary ingestion URL that you should use to stream video to YouTube. You must stream video to this URL.
               *
               * Depending on which application or tool you use to encode your video stream, you may need to enter the stream URL and stream name separately or you may
               * need to concatenate them in the following format:
               *
               * STREAM_URL/STREAM_NAME
               */
  var ingestionAddress: js.UndefOr[java.lang.String] = js.undefined
  /** The HTTP or RTMP stream name that YouTube assigns to the video stream. */
  var streamName: js.UndefOr[java.lang.String] = js.undefined
}

