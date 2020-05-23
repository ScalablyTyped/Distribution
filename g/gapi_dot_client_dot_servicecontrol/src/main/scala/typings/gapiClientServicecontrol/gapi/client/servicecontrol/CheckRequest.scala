package typings.gapiClientServicecontrol.gapi.client.servicecontrol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckRequest extends js.Object {
  /** The operation to be checked. */
  var operation: js.UndefOr[Operation] = js.undefined
  /** Requests the project settings to be returned as part of the check response. */
  var requestProjectSettings: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies which version of service configuration should be used to process
    * the request.
    *
    * If unspecified or no matching version can be found, the
    * latest one will be used.
    */
  var serviceConfigId: js.UndefOr[String] = js.undefined
  /**
    * Indicates if service activation check should be skipped for this request.
    * Default behavior is to perform the check and apply relevant quota.
    */
  var skipActivationCheck: js.UndefOr[Boolean] = js.undefined
}

object CheckRequest {
  @scala.inline
  def apply(
    operation: Operation = null,
    requestProjectSettings: js.UndefOr[Boolean] = js.undefined,
    serviceConfigId: String = null,
    skipActivationCheck: js.UndefOr[Boolean] = js.undefined
  ): CheckRequest = {
    val __obj = js.Dynamic.literal()
    if (operation != null) __obj.updateDynamic("operation")(operation.asInstanceOf[js.Any])
    if (!js.isUndefined(requestProjectSettings)) __obj.updateDynamic("requestProjectSettings")(requestProjectSettings.get.asInstanceOf[js.Any])
    if (serviceConfigId != null) __obj.updateDynamic("serviceConfigId")(serviceConfigId.asInstanceOf[js.Any])
    if (!js.isUndefined(skipActivationCheck)) __obj.updateDynamic("skipActivationCheck")(skipActivationCheck.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckRequest]
  }
}

