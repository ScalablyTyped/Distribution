package typings.downshift.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPropsCommonOptions extends js.Object {
  var suppressRefError: js.UndefOr[Boolean] = js.native
}

object GetPropsCommonOptions {
  @scala.inline
  def apply(): GetPropsCommonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPropsCommonOptions]
  }
  @scala.inline
  implicit class GetPropsCommonOptionsOps[Self <: GetPropsCommonOptions] (val x: Self) extends AnyVal {
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
    def setSuppressRefError(value: Boolean): Self = this.set("suppressRefError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressRefError: Self = this.set("suppressRefError", js.undefined)
  }
  
}

