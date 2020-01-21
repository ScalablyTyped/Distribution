package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This resource represents a long-running operation that is the result of a
  * network API call.
  */
@js.native
trait SchemaOperation extends js.Object {
  /**
    * If the value is `false`, it means the operation is still in progress. If
    * `true`, the operation is completed, and either `error` or `response` is
    * available.
    */
  var done: js.UndefOr[Boolean] = js.native
  /**
    * This field will always be not set if the operation is created by
    * `claimAsync`, `unclaimAsync`, or `updateMetadataAsync`. In this case,
    * error information for each device is set in
    * `response.perDeviceStatus.result.status`.
    */
  var error: js.UndefOr[SchemaStatus] = js.native
  /**
    * This field will contain a `DevicesLongRunningOperationMetadata` object if
    * the operation is created by `claimAsync`, `unclaimAsync`, or
    * `updateMetadataAsync`.
    */
  var metadata: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * The server-assigned name, which is only unique within the same service
    * that originally returns it. If you use the default HTTP mapping, the
    * `name` should have the format of `operations/some/unique/name`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * This field will contain a `DevicesLongRunningOperationResponse` object if
    * the operation is created by `claimAsync`, `unclaimAsync`, or
    * `updateMetadataAsync`.
    */
  var response: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object SchemaOperation {
  @scala.inline
  def apply(
    done: js.UndefOr[Boolean] = js.undefined,
    error: SchemaStatus = null,
    metadata: StringDictionary[js.Any] = null,
    name: String = null,
    response: StringDictionary[js.Any] = null
  ): SchemaOperation = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(done)) __obj.updateDynamic("done")(done.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (response != null) __obj.updateDynamic("response")(response.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOperation]
  }
}

