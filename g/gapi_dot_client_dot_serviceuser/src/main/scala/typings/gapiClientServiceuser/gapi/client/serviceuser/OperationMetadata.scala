package typings.gapiClientServiceuser.gapi.client.serviceuser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationMetadata extends js.Object {
  /** Percentage of completion of this operation, ranging from 0 to 100. */
  var progressPercentage: js.UndefOr[Double] = js.undefined
  /**
    * The full name of the resources that this operation is directly
    * associated with.
    */
  var resourceNames: js.UndefOr[js.Array[String]] = js.undefined
  /** The start time of the operation. */
  var startTime: js.UndefOr[String] = js.undefined
  /** Detailed status information for each step. The order is undetermined. */
  var steps: js.UndefOr[js.Array[Step]] = js.undefined
}

object OperationMetadata {
  @scala.inline
  def apply(
    progressPercentage: js.UndefOr[Double] = js.undefined,
    resourceNames: js.Array[String] = null,
    startTime: String = null,
    steps: js.Array[Step] = null
  ): OperationMetadata = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(progressPercentage)) __obj.updateDynamic("progressPercentage")(progressPercentage.get.asInstanceOf[js.Any])
    if (resourceNames != null) __obj.updateDynamic("resourceNames")(resourceNames.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (steps != null) __obj.updateDynamic("steps")(steps.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationMetadata]
  }
}

