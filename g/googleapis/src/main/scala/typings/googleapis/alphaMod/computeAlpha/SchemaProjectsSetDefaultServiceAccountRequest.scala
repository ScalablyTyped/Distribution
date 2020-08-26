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
  def apply(): SchemaProjectsSetDefaultServiceAccountRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProjectsSetDefaultServiceAccountRequest]
  }
  @scala.inline
  implicit class SchemaProjectsSetDefaultServiceAccountRequestOps[Self <: SchemaProjectsSetDefaultServiceAccountRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
  }
  
}

