package typings.gapiDotClientDotMl.gapiNs.clientNs.mlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudMlV1__OperationMetadata extends js.Object {
  /** The time the operation was submitted. */
  var createTime: js.UndefOr[String] = js.undefined
  /** The time operation processing completed. */
  var endTime: js.UndefOr[String] = js.undefined
  /** Indicates whether a request to cancel this operation has been made. */
  var isCancellationRequested: js.UndefOr[Boolean] = js.undefined
  /** Contains the name of the model associated with the operation. */
  var modelName: js.UndefOr[String] = js.undefined
  /** The operation type. */
  var operationType: js.UndefOr[String] = js.undefined
  /** The time operation processing started. */
  var startTime: js.UndefOr[String] = js.undefined
  /** Contains the version associated with the operation. */
  var version: js.UndefOr[GoogleCloudMlV1__Version] = js.undefined
}

object GoogleCloudMlV1__OperationMetadata {
  @scala.inline
  def apply(
    createTime: String = null,
    endTime: String = null,
    isCancellationRequested: js.UndefOr[Boolean] = js.undefined,
    modelName: String = null,
    operationType: String = null,
    startTime: String = null,
    version: GoogleCloudMlV1__Version = null
  ): GoogleCloudMlV1__OperationMetadata = {
    val __obj = js.Dynamic.literal()
    if (createTime != null) __obj.updateDynamic("createTime")(createTime)
    if (endTime != null) __obj.updateDynamic("endTime")(endTime)
    if (!js.isUndefined(isCancellationRequested)) __obj.updateDynamic("isCancellationRequested")(isCancellationRequested)
    if (modelName != null) __obj.updateDynamic("modelName")(modelName)
    if (operationType != null) __obj.updateDynamic("operationType")(operationType)
    if (startTime != null) __obj.updateDynamic("startTime")(startTime)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[GoogleCloudMlV1__OperationMetadata]
  }
}

