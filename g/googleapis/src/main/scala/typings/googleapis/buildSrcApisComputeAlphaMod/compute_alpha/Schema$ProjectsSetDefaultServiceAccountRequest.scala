package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ProjectsSetDefaultServiceAccountRequest extends js.Object {
  /**
    * Email address of the service account.
    */
  var email: js.UndefOr[String] = js.native
}

object Schema$ProjectsSetDefaultServiceAccountRequest {
  @scala.inline
  def apply(email: String = null): Schema$ProjectsSetDefaultServiceAccountRequest = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ProjectsSetDefaultServiceAccountRequest]
  }
}

