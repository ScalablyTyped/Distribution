package typings.googleapisCommon.apiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleConfigurable extends js.Object {
  var _options: GlobalOptions = js.native
}

object GoogleConfigurable {
  @scala.inline
  def apply(_options: GlobalOptions): GoogleConfigurable = {
    val __obj = js.Dynamic.literal(_options = _options.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleConfigurable]
  }
  @scala.inline
  implicit class GoogleConfigurableOps[Self <: GoogleConfigurable] (val x: Self) extends AnyVal {
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
    def set_options(value: GlobalOptions): Self = this.set("_options", value.asInstanceOf[js.Any])
  }
  
}

