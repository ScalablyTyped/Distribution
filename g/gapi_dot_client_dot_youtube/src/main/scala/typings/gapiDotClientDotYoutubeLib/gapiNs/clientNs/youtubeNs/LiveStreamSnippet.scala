package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait LiveStreamSnippet extends js.Object {
  /** The ID that YouTube uses to uniquely identify the channel that is transmitting the stream. */
  var channelId: js.UndefOr[java.lang.String] = js.undefined
  /** The stream's description. The value cannot be longer than 10000 characters. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  var isDefaultStream: js.UndefOr[scala.Boolean] = js.undefined
  /** The date and time that the stream was created. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format. */
  var publishedAt: js.UndefOr[java.lang.String] = js.undefined
  /** The stream's title. The value must be between 1 and 128 characters long. */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

