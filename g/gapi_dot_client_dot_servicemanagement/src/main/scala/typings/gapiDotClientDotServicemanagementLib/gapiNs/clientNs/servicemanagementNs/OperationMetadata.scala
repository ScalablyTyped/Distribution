package typings
package gapiDotClientDotServicemanagementLib.gapiNs.clientNs.servicemanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationMetadata extends js.Object {
  /** Percentage of completion of this operation, ranging from 0 to 100. */
  var progressPercentage: js.UndefOr[scala.Double] = js.undefined
  /**
    * The full name of the resources that this operation is directly
    * associated with.
    */
  var resourceNames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The start time of the operation. */
  var startTime: js.UndefOr[java.lang.String] = js.undefined
  /** Detailed status information for each step. The order is undetermined. */
  var steps: js.UndefOr[js.Array[Step]] = js.undefined
}

