package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes a stream of data, either as input to be processed or as output of
  * a streaming Dataflow job.
  */
@js.native
trait Schema$StreamLocation extends js.Object {
  /**
    * The stream is a custom source.
    */
  var customSourceLocation: js.UndefOr[Schema$CustomSourceLocation] = js.native
  /**
    * The stream is a pubsub stream.
    */
  var pubsubLocation: js.UndefOr[Schema$PubsubLocation] = js.native
  /**
    * The stream is a streaming side input.
    */
  var sideInputLocation: js.UndefOr[Schema$StreamingSideInputLocation] = js.native
  /**
    * The stream is part of another computation within the current streaming
    * Dataflow job.
    */
  var streamingStageLocation: js.UndefOr[Schema$StreamingStageLocation] = js.native
}

object Schema$StreamLocation {
  @scala.inline
  def apply(
    customSourceLocation: Schema$CustomSourceLocation = null,
    pubsubLocation: Schema$PubsubLocation = null,
    sideInputLocation: Schema$StreamingSideInputLocation = null,
    streamingStageLocation: Schema$StreamingStageLocation = null
  ): Schema$StreamLocation = {
    val __obj = js.Dynamic.literal()
    if (customSourceLocation != null) __obj.updateDynamic("customSourceLocation")(customSourceLocation.asInstanceOf[js.Any])
    if (pubsubLocation != null) __obj.updateDynamic("pubsubLocation")(pubsubLocation.asInstanceOf[js.Any])
    if (sideInputLocation != null) __obj.updateDynamic("sideInputLocation")(sideInputLocation.asInstanceOf[js.Any])
    if (streamingStageLocation != null) __obj.updateDynamic("streamingStageLocation")(streamingStageLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$StreamLocation]
  }
}

