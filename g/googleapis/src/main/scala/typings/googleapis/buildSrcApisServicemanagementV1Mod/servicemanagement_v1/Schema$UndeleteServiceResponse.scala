package typings.googleapis.buildSrcApisServicemanagementV1Mod.servicemanagement_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for UndeleteService method.
  */
@js.native
trait Schema$UndeleteServiceResponse extends js.Object {
  /**
    * Revived service resource.
    */
  var service: js.UndefOr[Schema$ManagedService] = js.native
}

object Schema$UndeleteServiceResponse {
  @scala.inline
  def apply(service: Schema$ManagedService = null): Schema$UndeleteServiceResponse = {
    val __obj = js.Dynamic.literal()
    if (service != null) __obj.updateDynamic("service")(service.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UndeleteServiceResponse]
  }
}

