package typings.eggCookies.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CookieGetOptions extends js.Object {
  /**
    * Encrypt the cookie's value or not (The default value is false).
    */
  var encrypt: js.UndefOr[Boolean] = js.native
  /**
    * Whether to sign or not (The default value is true).
    */
  var signed: js.UndefOr[Boolean] = js.native
}

object CookieGetOptions {
  @scala.inline
  def apply(): CookieGetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CookieGetOptions]
  }
  @scala.inline
  implicit class CookieGetOptionsOps[Self <: CookieGetOptions] (val x: Self) extends AnyVal {
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
    def setEncrypt(value: Boolean): Self = this.set("encrypt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncrypt: Self = this.set("encrypt", js.undefined)
    @scala.inline
    def setSigned(value: Boolean): Self = this.set("signed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSigned: Self = this.set("signed", js.undefined)
  }
  
}

