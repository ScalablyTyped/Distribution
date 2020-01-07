package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A task that carries configuration information for streaming computations.
  */
@js.native
trait Schema$StreamingConfigTask extends js.Object {
  /**
    * Maximum size for work item commit supported windmill storage layer.
    */
  var maxWorkItemCommitBytes: js.UndefOr[String] = js.native
  /**
    * Set of computation configuration information.
    */
  var streamingComputationConfigs: js.UndefOr[js.Array[Schema$StreamingComputationConfig]] = js.native
  /**
    * Map from user step names to state families.
    */
  var userStepToStateFamilyNameMap: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * If present, the worker must use this endpoint to communicate with
    * Windmill Service dispatchers, otherwise the worker must continue to use
    * whatever endpoint it had been using.
    */
  var windmillServiceEndpoint: js.UndefOr[String] = js.native
  /**
    * If present, the worker must use this port to communicate with Windmill
    * Service dispatchers. Only applicable when windmill_service_endpoint is
    * specified.
    */
  var windmillServicePort: js.UndefOr[String] = js.native
}

object Schema$StreamingConfigTask {
  @scala.inline
  def apply(
    maxWorkItemCommitBytes: String = null,
    streamingComputationConfigs: js.Array[Schema$StreamingComputationConfig] = null,
    userStepToStateFamilyNameMap: StringDictionary[String] = null,
    windmillServiceEndpoint: String = null,
    windmillServicePort: String = null
  ): Schema$StreamingConfigTask = {
    val __obj = js.Dynamic.literal()
    if (maxWorkItemCommitBytes != null) __obj.updateDynamic("maxWorkItemCommitBytes")(maxWorkItemCommitBytes.asInstanceOf[js.Any])
    if (streamingComputationConfigs != null) __obj.updateDynamic("streamingComputationConfigs")(streamingComputationConfigs.asInstanceOf[js.Any])
    if (userStepToStateFamilyNameMap != null) __obj.updateDynamic("userStepToStateFamilyNameMap")(userStepToStateFamilyNameMap.asInstanceOf[js.Any])
    if (windmillServiceEndpoint != null) __obj.updateDynamic("windmillServiceEndpoint")(windmillServiceEndpoint.asInstanceOf[js.Any])
    if (windmillServicePort != null) __obj.updateDynamic("windmillServicePort")(windmillServicePort.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$StreamingConfigTask]
  }
}

