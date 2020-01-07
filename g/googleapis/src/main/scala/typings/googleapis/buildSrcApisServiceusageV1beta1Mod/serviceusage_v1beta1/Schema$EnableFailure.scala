package typings.googleapis.buildSrcApisServiceusageV1beta1Mod.serviceusage_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides error messages for the failing services.
  */
@js.native
trait Schema$EnableFailure extends js.Object {
  /**
    * An error message describing why the service could not be enabled.
    */
  var errorMessage: js.UndefOr[String] = js.native
  /**
    * The service id of a service that could not be enabled.
    */
  var serviceId: js.UndefOr[String] = js.native
}

object Schema$EnableFailure {
  @scala.inline
  def apply(errorMessage: String = null, serviceId: String = null): Schema$EnableFailure = {
    val __obj = js.Dynamic.literal()
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    if (serviceId != null) __obj.updateDynamic("serviceId")(serviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$EnableFailure]
  }
}

