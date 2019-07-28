package typings.gapiDotClientDotCompute.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstancesSetServiceAccountRequest extends js.Object {
  /** Email address of the service account. */
  var email: js.UndefOr[String] = js.undefined
  /** The list of scopes to be made available for this service account. */
  var scopes: js.UndefOr[js.Array[String]] = js.undefined
}

object InstancesSetServiceAccountRequest {
  @scala.inline
  def apply(email: String = null, scopes: js.Array[String] = null): InstancesSetServiceAccountRequest = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email)
    if (scopes != null) __obj.updateDynamic("scopes")(scopes)
    __obj.asInstanceOf[InstancesSetServiceAccountRequest]
  }
}

