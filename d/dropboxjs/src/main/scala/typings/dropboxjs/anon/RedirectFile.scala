package typings.dropboxjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RedirectFile extends js.Object {
  var redirectFile: String = js.native
  var redirectUrl: String = js.native
  var rememberUser: Boolean = js.native
  var scope: String = js.native
}

object RedirectFile {
  @scala.inline
  def apply(redirectFile: String, redirectUrl: String, rememberUser: Boolean, scope: String): RedirectFile = {
    val __obj = js.Dynamic.literal(redirectFile = redirectFile.asInstanceOf[js.Any], redirectUrl = redirectUrl.asInstanceOf[js.Any], rememberUser = rememberUser.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedirectFile]
  }
  @scala.inline
  implicit class RedirectFileOps[Self <: RedirectFile] (val x: Self) extends AnyVal {
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
    def setRedirectFile(value: String): Self = this.set("redirectFile", value.asInstanceOf[js.Any])
    @scala.inline
    def setRedirectUrl(value: String): Self = this.set("redirectUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setRememberUser(value: Boolean): Self = this.set("rememberUser", value.asInstanceOf[js.Any])
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
  }
  
}

