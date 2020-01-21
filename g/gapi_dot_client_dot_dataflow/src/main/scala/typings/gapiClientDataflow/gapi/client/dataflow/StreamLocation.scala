package typings.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamLocation extends js.Object {
  /** The stream is a custom source. */
  var customSourceLocation: js.UndefOr[CustomSourceLocation] = js.undefined
  /** The stream is a pubsub stream. */
  var pubsubLocation: js.UndefOr[PubsubLocation] = js.undefined
  /** The stream is a streaming side input. */
  var sideInputLocation: js.UndefOr[StreamingSideInputLocation] = js.undefined
  /**
    * The stream is part of another computation within the current
    * streaming Dataflow job.
    */
  var streamingStageLocation: js.UndefOr[StreamingStageLocation] = js.undefined
}

object StreamLocation {
  @scala.inline
  def apply(
    customSourceLocation: CustomSourceLocation = null,
    pubsubLocation: PubsubLocation = null,
    sideInputLocation: StreamingSideInputLocation = null,
    streamingStageLocation: StreamingStageLocation = null
  ): StreamLocation = {
    val __obj = js.Dynamic.literal()
    if (customSourceLocation != null) __obj.updateDynamic("customSourceLocation")(customSourceLocation.asInstanceOf[js.Any])
    if (pubsubLocation != null) __obj.updateDynamic("pubsubLocation")(pubsubLocation.asInstanceOf[js.Any])
    if (sideInputLocation != null) __obj.updateDynamic("sideInputLocation")(sideInputLocation.asInstanceOf[js.Any])
    if (streamingStageLocation != null) __obj.updateDynamic("streamingStageLocation")(streamingStageLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamLocation]
  }
}

