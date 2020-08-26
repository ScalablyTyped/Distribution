package typings.expressValidator.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsEmailOptions extends js.Object {
  var allow_display_name: js.UndefOr[Boolean] = js.native
  var allow_utf8_local_part: js.UndefOr[Boolean] = js.native
  var require_tld: js.UndefOr[Boolean] = js.native
}

object IsEmailOptions {
  @scala.inline
  def apply(): IsEmailOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsEmailOptions]
  }
  @scala.inline
  implicit class IsEmailOptionsOps[Self <: IsEmailOptions] (val x: Self) extends AnyVal {
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
    def setAllow_display_name(value: Boolean): Self = this.set("allow_display_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllow_display_name: Self = this.set("allow_display_name", js.undefined)
    @scala.inline
    def setAllow_utf8_local_part(value: Boolean): Self = this.set("allow_utf8_local_part", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllow_utf8_local_part: Self = this.set("allow_utf8_local_part", js.undefined)
    @scala.inline
    def setRequire_tld(value: Boolean): Self = this.set("require_tld", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequire_tld: Self = this.set("require_tld", js.undefined)
  }
  
}

