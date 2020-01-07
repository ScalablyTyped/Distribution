package typings.googleapis.buildSrcApisBigtableadminV1Mod.bigtableadmin_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The metadata for the Operation returned by UpdateInstance.
  */
@js.native
trait Schema$UpdateInstanceMetadata extends js.Object {
  /**
    * The time at which the operation failed or was completed successfully.
    */
  var finishTime: js.UndefOr[String] = js.native
  /**
    * The request that prompted the initiation of this UpdateInstance
    * operation.
    */
  var originalRequest: js.UndefOr[Schema$PartialUpdateInstanceRequest] = js.native
  /**
    * The time at which the original request was received.
    */
  var requestTime: js.UndefOr[String] = js.native
}

object Schema$UpdateInstanceMetadata {
  @scala.inline
  def apply(
    finishTime: String = null,
    originalRequest: Schema$PartialUpdateInstanceRequest = null,
    requestTime: String = null
  ): Schema$UpdateInstanceMetadata = {
    val __obj = js.Dynamic.literal()
    if (finishTime != null) __obj.updateDynamic("finishTime")(finishTime.asInstanceOf[js.Any])
    if (originalRequest != null) __obj.updateDynamic("originalRequest")(originalRequest.asInstanceOf[js.Any])
    if (requestTime != null) __obj.updateDynamic("requestTime")(requestTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UpdateInstanceMetadata]
  }
}

