package typings.gapiDotClientDotServicecontrol.gapi.client.servicecontrol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckResponse extends js.Object {
  /**
    * Indicate the decision of the check.
    *
    * If no check errors are present, the service should process the operation.
    * Otherwise the service should use the list of errors to determine the
    * appropriate action.
    */
  var checkErrors: js.UndefOr[js.Array[CheckError]] = js.undefined
  /** Feedback data returned from the server during processing a Check request. */
  var checkInfo: js.UndefOr[CheckInfo] = js.undefined
  /**
    * The same operation_id value used in the CheckRequest.
    * Used for logging and diagnostics purposes.
    */
  var operationId: js.UndefOr[String] = js.undefined
  /** Quota information for the check request associated with this response. */
  var quotaInfo: js.UndefOr[QuotaInfo] = js.undefined
  /** The actual config id used to process the request. */
  var serviceConfigId: js.UndefOr[String] = js.undefined
}

object CheckResponse {
  @scala.inline
  def apply(
    checkErrors: js.Array[CheckError] = null,
    checkInfo: CheckInfo = null,
    operationId: String = null,
    quotaInfo: QuotaInfo = null,
    serviceConfigId: String = null
  ): CheckResponse = {
    val __obj = js.Dynamic.literal()
    if (checkErrors != null) __obj.updateDynamic("checkErrors")(checkErrors.asInstanceOf[js.Any])
    if (checkInfo != null) __obj.updateDynamic("checkInfo")(checkInfo.asInstanceOf[js.Any])
    if (operationId != null) __obj.updateDynamic("operationId")(operationId.asInstanceOf[js.Any])
    if (quotaInfo != null) __obj.updateDynamic("quotaInfo")(quotaInfo.asInstanceOf[js.Any])
    if (serviceConfigId != null) __obj.updateDynamic("serviceConfigId")(serviceConfigId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckResponse]
  }
}

