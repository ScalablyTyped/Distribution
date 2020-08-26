package typings.expressFormData.mod

import typings.multiparty.mod.FormOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormDataOptions extends FormOptions {
  var autoClean: js.UndefOr[Boolean] = js.native
}

object FormDataOptions {
  @scala.inline
  def apply(): FormDataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormDataOptions]
  }
  @scala.inline
  implicit class FormDataOptionsOps[Self <: FormDataOptions] (val x: Self) extends AnyVal {
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
    def setAutoClean(value: Boolean): Self = this.set("autoClean", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoClean: Self = this.set("autoClean", js.undefined)
  }
  
}

