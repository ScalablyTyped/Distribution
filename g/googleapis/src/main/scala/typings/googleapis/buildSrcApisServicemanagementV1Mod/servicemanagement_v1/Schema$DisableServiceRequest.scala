package typings.googleapis.buildSrcApisServicemanagementV1Mod.servicemanagement_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for DisableService method.
  */
@js.native
trait Schema$DisableServiceRequest extends js.Object {
  /**
    * The identity of consumer resource which service disablement will be
    * applied to.  The Google Service Management implementation accepts the
    * following forms: - &quot;project:&lt;project_id&gt;&quot;  Note: this is
    * made compatible with google.api.servicecontrol.v1.Operation.consumer_id.
    */
  var consumerId: js.UndefOr[String] = js.native
}

object Schema$DisableServiceRequest {
  @scala.inline
  def apply(consumerId: String = null): Schema$DisableServiceRequest = {
    val __obj = js.Dynamic.literal()
    if (consumerId != null) __obj.updateDynamic("consumerId")(consumerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DisableServiceRequest]
  }
}

