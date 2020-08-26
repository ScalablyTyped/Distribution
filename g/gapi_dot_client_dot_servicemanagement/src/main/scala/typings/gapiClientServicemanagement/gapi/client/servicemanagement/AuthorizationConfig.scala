package typings.gapiClientServicemanagement.gapi.client.servicemanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthorizationConfig extends js.Object {
  /**
    * The name of the authorization provider, such as
    * firebaserules.googleapis.com.
    */
  var provider: js.UndefOr[String] = js.native
}

object AuthorizationConfig {
  @scala.inline
  def apply(): AuthorizationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizationConfig]
  }
  @scala.inline
  implicit class AuthorizationConfigOps[Self <: AuthorizationConfig] (val x: Self) extends AnyVal {
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
    def setProvider(value: String): Self = this.set("provider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvider: Self = this.set("provider", js.undefined)
  }
  
}

