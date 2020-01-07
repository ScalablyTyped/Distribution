package typings.googleapis.buildSrcApisServicemanagementV1Mod.servicemanagement_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The metadata associated with a long running operation resource.
  */
@js.native
trait Schema$OperationMetadata extends js.Object {
  /**
    * Percentage of completion of this operation, ranging from 0 to 100.
    */
  var progressPercentage: js.UndefOr[Double] = js.native
  /**
    * The full name of the resources that this operation is directly associated
    * with.
    */
  var resourceNames: js.UndefOr[js.Array[String]] = js.native
  /**
    * The start time of the operation.
    */
  var startTime: js.UndefOr[String] = js.native
  /**
    * Detailed status information for each step. The order is undetermined.
    */
  var steps: js.UndefOr[js.Array[Schema$Step]] = js.native
}

object Schema$OperationMetadata {
  @scala.inline
  def apply(
    progressPercentage: Int | Double = null,
    resourceNames: js.Array[String] = null,
    startTime: String = null,
    steps: js.Array[Schema$Step] = null
  ): Schema$OperationMetadata = {
    val __obj = js.Dynamic.literal()
    if (progressPercentage != null) __obj.updateDynamic("progressPercentage")(progressPercentage.asInstanceOf[js.Any])
    if (resourceNames != null) __obj.updateDynamic("resourceNames")(resourceNames.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (steps != null) __obj.updateDynamic("steps")(steps.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$OperationMetadata]
  }
}

