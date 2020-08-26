package typings.googleAuthLibrary.googleauthMod

import typings.googleAuthLibrary.oauth2clientMod.OAuth2Client
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ADCResponse extends js.Object {
  var credential: OAuth2Client = js.native
  var projectId: String | Null = js.native
}

object ADCResponse {
  @scala.inline
  def apply(credential: OAuth2Client): ADCResponse = {
    val __obj = js.Dynamic.literal(credential = credential.asInstanceOf[js.Any])
    __obj.asInstanceOf[ADCResponse]
  }
  @scala.inline
  implicit class ADCResponseOps[Self <: ADCResponse] (val x: Self) extends AnyVal {
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
    def setCredential(value: OAuth2Client): Self = this.set("credential", value.asInstanceOf[js.Any])
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    @scala.inline
    def setProjectIdNull: Self = this.set("projectId", null)
  }
  
}

