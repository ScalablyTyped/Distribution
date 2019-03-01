package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDebugConfigRequest extends js.Object {
  /**
    * The internal component id for which debug configuration is
    * requested.
    */
  var componentId: js.UndefOr[java.lang.String] = js.undefined
  /** The location which contains the job specified by job_id. */
  var location: js.UndefOr[java.lang.String] = js.undefined
  /** The worker id, i.e., VM hostname. */
  var workerId: js.UndefOr[java.lang.String] = js.undefined
}

object GetDebugConfigRequest {
  @scala.inline
  def apply(
    componentId: java.lang.String = null,
    location: java.lang.String = null,
    workerId: java.lang.String = null
  ): GetDebugConfigRequest = {
    val __obj = js.Dynamic.literal()
    if (componentId != null) __obj.updateDynamic("componentId")(componentId)
    if (location != null) __obj.updateDynamic("location")(location)
    if (workerId != null) __obj.updateDynamic("workerId")(workerId)
    __obj.asInstanceOf[GetDebugConfigRequest]
  }
}

