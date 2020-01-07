package typings.googleapis.buildSrcApisServiceusageV1Mod.serviceusage_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for the `DisableService` method. This response message is
  * assigned to the `response` field of the returned Operation when that
  * operation is done.
  */
@js.native
trait Schema$DisableServiceResponse extends js.Object {
  /**
    * The new state of the service after disabling.
    */
  var service: js.UndefOr[Schema$GoogleApiServiceusageV1Service] = js.native
}

object Schema$DisableServiceResponse {
  @scala.inline
  def apply(service: Schema$GoogleApiServiceusageV1Service = null): Schema$DisableServiceResponse = {
    val __obj = js.Dynamic.literal()
    if (service != null) __obj.updateDynamic("service")(service.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DisableServiceResponse]
  }
}

