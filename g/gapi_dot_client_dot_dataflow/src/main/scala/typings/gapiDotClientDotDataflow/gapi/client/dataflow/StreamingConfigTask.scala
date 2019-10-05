package typings.gapiDotClientDotDataflow.gapi.client.dataflow

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamingConfigTask extends js.Object {
  /** Set of computation configuration information. */
  var streamingComputationConfigs: js.UndefOr[js.Array[StreamingComputationConfig]] = js.undefined
  /** Map from user step names to state families. */
  var userStepToStateFamilyNameMap: js.UndefOr[Record[String, String]] = js.undefined
  /**
    * If present, the worker must use this endpoint to communicate with Windmill
    * Service dispatchers, otherwise the worker must continue to use whatever
    * endpoint it had been using.
    */
  var windmillServiceEndpoint: js.UndefOr[String] = js.undefined
  /**
    * If present, the worker must use this port to communicate with Windmill
    * Service dispatchers. Only applicable when windmill_service_endpoint is
    * specified.
    */
  var windmillServicePort: js.UndefOr[String] = js.undefined
}

object StreamingConfigTask {
  @scala.inline
  def apply(
    streamingComputationConfigs: js.Array[StreamingComputationConfig] = null,
    userStepToStateFamilyNameMap: Record[String, String] = null,
    windmillServiceEndpoint: String = null,
    windmillServicePort: String = null
  ): StreamingConfigTask = {
    val __obj = js.Dynamic.literal()
    if (streamingComputationConfigs != null) __obj.updateDynamic("streamingComputationConfigs")(streamingComputationConfigs)
    if (userStepToStateFamilyNameMap != null) __obj.updateDynamic("userStepToStateFamilyNameMap")(userStepToStateFamilyNameMap)
    if (windmillServiceEndpoint != null) __obj.updateDynamic("windmillServiceEndpoint")(windmillServiceEndpoint)
    if (windmillServicePort != null) __obj.updateDynamic("windmillServicePort")(windmillServicePort)
    __obj.asInstanceOf[StreamingConfigTask]
  }
}

