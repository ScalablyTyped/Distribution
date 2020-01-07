package typings.googleapis.buildSrcApisComputeV1Mod.compute_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$InstancesSetServiceAccountRequest extends js.Object {
  /**
    * Email address of the service account.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * The list of scopes to be made available for this service account.
    */
  var scopes: js.UndefOr[js.Array[String]] = js.native
}

object Schema$InstancesSetServiceAccountRequest {
  @scala.inline
  def apply(email: String = null, scopes: js.Array[String] = null): Schema$InstancesSetServiceAccountRequest = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (scopes != null) __obj.updateDynamic("scopes")(scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$InstancesSetServiceAccountRequest]
  }
}

