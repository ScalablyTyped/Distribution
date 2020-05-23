package typings.gapiClientMl.gapi.client.ml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudMlV1OperationMetadata extends js.Object {
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
  var version: js.UndefOr[GoogleCloudMlV1Version] = js.undefined
}

object GoogleCloudMlV1OperationMetadata {
  @scala.inline
  def apply(
    createTime: String = null,
    endTime: String = null,
    isCancellationRequested: js.UndefOr[Boolean] = js.undefined,
    modelName: String = null,
    operationType: String = null,
    startTime: String = null,
    version: GoogleCloudMlV1Version = null
  ): GoogleCloudMlV1OperationMetadata = {
    val __obj = js.Dynamic.literal()
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (!js.isUndefined(isCancellationRequested)) __obj.updateDynamic("isCancellationRequested")(isCancellationRequested.get.asInstanceOf[js.Any])
    if (modelName != null) __obj.updateDynamic("modelName")(modelName.asInstanceOf[js.Any])
    if (operationType != null) __obj.updateDynamic("operationType")(operationType.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleCloudMlV1OperationMetadata]
  }
}

