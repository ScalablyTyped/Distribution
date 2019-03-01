package typings
package gapiDotClientDotAndroiddeviceprovisioningLib.gapiNs.clientNs.androiddeviceprovisioningNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Operation extends js.Object {
  /**
    * If the value is `false`, it means the operation is still in progress.
    * If `true`, the operation is completed, and either `error` or `response` is
    * available.
    */
  var done: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * This field will always be not set if the operation is created by `claimAsync`, `unclaimAsync`, or `updateMetadataAsync`. In this case, error
    * information for each device is set in `response.perDeviceStatus.result.status`.
    */
  var error: js.UndefOr[Status] = js.undefined
  /**
    * This field will contain a `DevicesLongRunningOperationMetadata` object if the operation is created by `claimAsync`, `unclaimAsync`, or
    * `updateMetadataAsync`.
    */
  var metadata: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
  /**
    * The server-assigned name, which is only unique within the same service that
    * originally returns it. If you use the default HTTP mapping, the
    * `name` should have the format of `operations/some/unique/name`.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * This field will contain a `DevicesLongRunningOperationResponse` object if the operation is created by `claimAsync`, `unclaimAsync`, or
    * `updateMetadataAsync`.
    */
  var response: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
}

object Operation {
  @scala.inline
  def apply(
    done: js.UndefOr[scala.Boolean] = js.undefined,
    error: Status = null,
    metadata: stdLib.Record[java.lang.String, _] = null,
    name: java.lang.String = null,
    response: stdLib.Record[java.lang.String, _] = null
  ): Operation = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(done)) __obj.updateDynamic("done")(done)
    if (error != null) __obj.updateDynamic("error")(error)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (name != null) __obj.updateDynamic("name")(name)
    if (response != null) __obj.updateDynamic("response")(response)
    __obj.asInstanceOf[Operation]
  }
}

