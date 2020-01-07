package typings.googleapis.buildSrcApisServiceusageV1beta1Mod.serviceusage_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for the `BatchEnableServices` method. This response
  * message is assigned to the `response` field of the returned Operation when
  * that operation is done.
  */
@js.native
trait Schema$BatchEnableServicesResponse extends js.Object {
  /**
    * If allow_partial_success is true, and one or more services could not be
    * enabled, this field contains the details about each failure.
    */
  var failures: js.UndefOr[js.Array[Schema$EnableFailure]] = js.native
  /**
    * The new state of the services after enabling.
    */
  var services: js.UndefOr[js.Array[Schema$GoogleApiServiceusageV1Service]] = js.native
}

object Schema$BatchEnableServicesResponse {
  @scala.inline
  def apply(
    failures: js.Array[Schema$EnableFailure] = null,
    services: js.Array[Schema$GoogleApiServiceusageV1Service] = null
  ): Schema$BatchEnableServicesResponse = {
    val __obj = js.Dynamic.literal()
    if (failures != null) __obj.updateDynamic("failures")(failures.asInstanceOf[js.Any])
    if (services != null) __obj.updateDynamic("services")(services.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BatchEnableServicesResponse]
  }
}

