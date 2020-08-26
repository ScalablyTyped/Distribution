package typings.googleCloudStorage.signerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCredentialsResponse extends js.Object {
  var client_email: js.UndefOr[String] = js.native
}

object GetCredentialsResponse {
  @scala.inline
  def apply(): GetCredentialsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCredentialsResponse]
  }
  @scala.inline
  implicit class GetCredentialsResponseOps[Self <: GetCredentialsResponse] (val x: Self) extends AnyVal {
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
    def setClient_email(value: String): Self = this.set("client_email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClient_email: Self = this.set("client_email", js.undefined)
  }
  
}

