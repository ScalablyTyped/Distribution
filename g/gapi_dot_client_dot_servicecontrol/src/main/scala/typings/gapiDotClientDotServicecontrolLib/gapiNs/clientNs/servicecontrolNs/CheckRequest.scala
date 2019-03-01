package typings
package gapiDotClientDotServicecontrolLib.gapiNs.clientNs.servicecontrolNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckRequest extends js.Object {
  /** The operation to be checked. */
  var operation: js.UndefOr[Operation] = js.undefined
  /** Requests the project settings to be returned as part of the check response. */
  var requestProjectSettings: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Specifies which version of service configuration should be used to process
    * the request.
    *
    * If unspecified or no matching version can be found, the
    * latest one will be used.
    */
  var serviceConfigId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Indicates if service activation check should be skipped for this request.
    * Default behavior is to perform the check and apply relevant quota.
    */
  var skipActivationCheck: js.UndefOr[scala.Boolean] = js.undefined
}

object CheckRequest {
  @scala.inline
  def apply(
    operation: Operation = null,
    requestProjectSettings: js.UndefOr[scala.Boolean] = js.undefined,
    serviceConfigId: java.lang.String = null,
    skipActivationCheck: js.UndefOr[scala.Boolean] = js.undefined
  ): CheckRequest = {
    val __obj = js.Dynamic.literal()
    if (operation != null) __obj.updateDynamic("operation")(operation)
    if (!js.isUndefined(requestProjectSettings)) __obj.updateDynamic("requestProjectSettings")(requestProjectSettings)
    if (serviceConfigId != null) __obj.updateDynamic("serviceConfigId")(serviceConfigId)
    if (!js.isUndefined(skipActivationCheck)) __obj.updateDynamic("skipActivationCheck")(skipActivationCheck)
    __obj.asInstanceOf[CheckRequest]
  }
}

