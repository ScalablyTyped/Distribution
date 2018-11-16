package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ListJobMessagesResponse extends js.Object {
  /** Autoscaling events in ascending timestamp order. */
  var autoscalingEvents: js.UndefOr[js.Array[AutoscalingEvent]] = js.undefined
  /** Messages in ascending timestamp order. */
  var jobMessages: js.UndefOr[js.Array[JobMessage]] = js.undefined
  /** The token to obtain the next page of results if there are more. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

