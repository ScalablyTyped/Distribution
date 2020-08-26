package typings.firefoxWebextBrowser.browser.privacy.websites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The settings for cookies. */
@js.native
trait CookieConfig extends js.Object {
  /** The type of cookies to allow. */
  var behavior: js.UndefOr[CookieConfigBehavior] = js.native
  /** Whether to create all cookies as nonPersistent (i.e., session) cookies. */
  var nonPersistentCookies: js.UndefOr[Boolean] = js.native
}

object CookieConfig {
  @scala.inline
  def apply(): CookieConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CookieConfig]
  }
  @scala.inline
  implicit class CookieConfigOps[Self <: CookieConfig] (val x: Self) extends AnyVal {
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
    def setBehavior(value: CookieConfigBehavior): Self = this.set("behavior", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBehavior: Self = this.set("behavior", js.undefined)
    @scala.inline
    def setNonPersistentCookies(value: Boolean): Self = this.set("nonPersistentCookies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNonPersistentCookies: Self = this.set("nonPersistentCookies", js.undefined)
  }
  
}

