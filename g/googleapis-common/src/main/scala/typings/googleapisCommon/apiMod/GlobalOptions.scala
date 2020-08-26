package typings.googleapisCommon.apiMod

import typings.googleAuthLibrary.mod.OAuth2Client
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalOptions extends MethodOptions {
  var auth: js.UndefOr[OAuth2Client | String] = js.native
}

object GlobalOptions {
  @scala.inline
  def apply(): GlobalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalOptions]
  }
  @scala.inline
  implicit class GlobalOptionsOps[Self <: GlobalOptions] (val x: Self) extends AnyVal {
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
    def setAuth(value: OAuth2Client | String): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
  }
  
}

