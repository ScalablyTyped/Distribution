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

object ListJobMessagesResponse {
  @scala.inline
  def apply(
    autoscalingEvents: js.Array[AutoscalingEvent] = null,
    jobMessages: js.Array[JobMessage] = null,
    nextPageToken: java.lang.String = null
  ): ListJobMessagesResponse = {
    val __obj = js.Dynamic.literal()
    if (autoscalingEvents != null) __obj.updateDynamic("autoscalingEvents")(autoscalingEvents)
    if (jobMessages != null) __obj.updateDynamic("jobMessages")(jobMessages)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[ListJobMessagesResponse]
  }
}

