package typings.gapi

import typings.gapi.anon.Authuser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleApiOAuth2TokenSessionState extends js.Object {
  var extraQueryParams: Authuser = js.native
}

object GoogleApiOAuth2TokenSessionState {
  @scala.inline
  def apply(extraQueryParams: Authuser): GoogleApiOAuth2TokenSessionState = {
    val __obj = js.Dynamic.literal(extraQueryParams = extraQueryParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleApiOAuth2TokenSessionState]
  }
  @scala.inline
  implicit class GoogleApiOAuth2TokenSessionStateOps[Self <: GoogleApiOAuth2TokenSessionState] (val x: Self) extends AnyVal {
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
    def setExtraQueryParams(value: Authuser): Self = this.set("extraQueryParams", value.asInstanceOf[js.Any])
  }
  
}

