package typings
package gapiDotClientDotDeploymentmanagerLib.gapiNs.clientNs.deploymentmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationsListResponse extends js.Object {
  /** Output only. A token used to continue a truncated list request. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** Output only. Operations contained in this list response. */
  var operations: js.UndefOr[js.Array[Operation]] = js.undefined
}

object OperationsListResponse {
  @scala.inline
  def apply(nextPageToken: java.lang.String = null, operations: js.Array[Operation] = null): OperationsListResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (operations != null) __obj.updateDynamic("operations")(operations)
    __obj.asInstanceOf[OperationsListResponse]
  }
}

