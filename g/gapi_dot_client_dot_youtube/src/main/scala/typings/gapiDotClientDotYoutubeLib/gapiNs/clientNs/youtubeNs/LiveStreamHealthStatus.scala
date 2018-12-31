package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveStreamHealthStatus extends js.Object {
  /** The configurations issues on this stream */
  var configurationIssues: js.UndefOr[js.Array[LiveStreamConfigurationIssue]] = js.undefined
  /** The last time this status was updated (in seconds) */
  var lastUpdateTimeSeconds: js.UndefOr[java.lang.String] = js.undefined
  /** The status code of this stream */
  var status: js.UndefOr[java.lang.String] = js.undefined
}

