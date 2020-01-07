package typings.googleapis.buildSrcApisServicenetworkingV1betaMod.servicenetworking_v1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Selects and configures the service controller used by the service.  The
  * service controller handles features like abuse, quota, billing, logging,
  * monitoring, etc.
  */
@js.native
trait Schema$Control extends js.Object {
  /**
    * The service control environment to use. If empty, no control plane
    * feature (like quota and billing) will be enabled.
    */
  var environment: js.UndefOr[String] = js.native
}

object Schema$Control {
  @scala.inline
  def apply(environment: String = null): Schema$Control = {
    val __obj = js.Dynamic.literal()
    if (environment != null) __obj.updateDynamic("environment")(environment.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Control]
  }
}

