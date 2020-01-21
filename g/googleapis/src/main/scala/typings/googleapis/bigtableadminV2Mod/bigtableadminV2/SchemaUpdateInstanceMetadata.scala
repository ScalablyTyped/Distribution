package typings.googleapis.bigtableadminV2Mod.bigtableadminV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The metadata for the Operation returned by UpdateInstance.
  */
@js.native
trait SchemaUpdateInstanceMetadata extends js.Object {
  /**
    * The time at which the operation failed or was completed successfully.
    */
  var finishTime: js.UndefOr[String] = js.native
  /**
    * The request that prompted the initiation of this UpdateInstance
    * operation.
    */
  var originalRequest: js.UndefOr[SchemaPartialUpdateInstanceRequest] = js.native
  /**
    * The time at which the original request was received.
    */
  var requestTime: js.UndefOr[String] = js.native
}

object SchemaUpdateInstanceMetadata {
  @scala.inline
  def apply(
    finishTime: String = null,
    originalRequest: SchemaPartialUpdateInstanceRequest = null,
    requestTime: String = null
  ): SchemaUpdateInstanceMetadata = {
    val __obj = js.Dynamic.literal()
    if (finishTime != null) __obj.updateDynamic("finishTime")(finishTime.asInstanceOf[js.Any])
    if (originalRequest != null) __obj.updateDynamic("originalRequest")(originalRequest.asInstanceOf[js.Any])
    if (requestTime != null) __obj.updateDynamic("requestTime")(requestTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUpdateInstanceMetadata]
  }
}

