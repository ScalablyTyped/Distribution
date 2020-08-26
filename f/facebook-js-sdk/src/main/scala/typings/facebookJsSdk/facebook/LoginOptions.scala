package typings.facebookJsSdk.facebook

import typings.facebookJsSdk.facebookJsSdkStrings.reauthenticate
import typings.facebookJsSdk.facebookJsSdkStrings.reauthorize
import typings.facebookJsSdk.facebookJsSdkStrings.rerequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoginOptions extends js.Object {
  var auth_type: js.UndefOr[reauthenticate | reauthorize | rerequest] = js.native
  var enable_profile_selector: js.UndefOr[Boolean] = js.native
  var profile_selector_ids: js.UndefOr[String] = js.native
  var return_scopes: js.UndefOr[Boolean] = js.native
  var scope: js.UndefOr[String] = js.native
}

object LoginOptions {
  @scala.inline
  def apply(): LoginOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoginOptions]
  }
  @scala.inline
  implicit class LoginOptionsOps[Self <: LoginOptions] (val x: Self) extends AnyVal {
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
    def setAuth_type(value: reauthenticate | reauthorize | rerequest): Self = this.set("auth_type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth_type: Self = this.set("auth_type", js.undefined)
    @scala.inline
    def setEnable_profile_selector(value: Boolean): Self = this.set("enable_profile_selector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnable_profile_selector: Self = this.set("enable_profile_selector", js.undefined)
    @scala.inline
    def setProfile_selector_ids(value: String): Self = this.set("profile_selector_ids", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfile_selector_ids: Self = this.set("profile_selector_ids", js.undefined)
    @scala.inline
    def setReturn_scopes(value: Boolean): Self = this.set("return_scopes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturn_scopes: Self = this.set("return_scopes", js.undefined)
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
  }
  
}

