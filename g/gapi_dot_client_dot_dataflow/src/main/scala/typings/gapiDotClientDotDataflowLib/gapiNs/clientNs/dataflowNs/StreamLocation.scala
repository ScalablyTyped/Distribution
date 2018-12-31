package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

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

