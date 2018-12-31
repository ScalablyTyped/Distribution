package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamingConfigTask extends js.Object {
  /** Set of computation configuration information. */
  var streamingComputationConfigs: js.UndefOr[js.Array[StreamingComputationConfig]] = js.undefined
  /** Map from user step names to state families. */
  var userStepToStateFamilyNameMap: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
  /**
    * If present, the worker must use this endpoint to communicate with Windmill
    * Service dispatchers, otherwise the worker must continue to use whatever
    * endpoint it had been using.
    */
  var windmillServiceEndpoint: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If present, the worker must use this port to communicate with Windmill
    * Service dispatchers. Only applicable when windmill_service_endpoint is
    * specified.
    */
  var windmillServicePort: js.UndefOr[java.lang.String] = js.undefined
}

