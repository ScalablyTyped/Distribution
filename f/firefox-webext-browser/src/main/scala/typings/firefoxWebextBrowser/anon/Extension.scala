package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Extension extends js.Object {
  /** Extensions and packaged applications a user has installed (be _really_ careful!). */
  var extension: js.UndefOr[Boolean] = js.native
  /** Websites that have been installed as hosted applications (be careful!). */
  var protectedWeb: js.UndefOr[Boolean] = js.native
  /** Normal websites. */
  var unprotectedWeb: js.UndefOr[Boolean] = js.native
}

object Extension {
  @scala.inline
  def apply(): Extension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Extension]
  }
  @scala.inline
  implicit class ExtensionOps[Self <: Extension] (val x: Self) extends AnyVal {
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
    def setExtension(value: Boolean): Self = this.set("extension", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtension: Self = this.set("extension", js.undefined)
    @scala.inline
    def setProtectedWeb(value: Boolean): Self = this.set("protectedWeb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtectedWeb: Self = this.set("protectedWeb", js.undefined)
    @scala.inline
    def setUnprotectedWeb(value: Boolean): Self = this.set("unprotectedWeb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnprotectedWeb: Self = this.set("unprotectedWeb", js.undefined)
  }
  
}

