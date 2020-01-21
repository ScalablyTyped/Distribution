package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaProjectsSetDefaultServiceAccountRequest extends js.Object {
  /**
    * Email address of the service account.
    */
  var email: js.UndefOr[String] = js.native
}

object SchemaProjectsSetDefaultServiceAccountRequest {
  @scala.inline
  def apply(email: String = null): SchemaProjectsSetDefaultServiceAccountRequest = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaProjectsSetDefaultServiceAccountRequest]
  }
}

