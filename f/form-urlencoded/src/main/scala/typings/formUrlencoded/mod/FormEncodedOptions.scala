package typings.formUrlencoded.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormEncodedOptions extends js.Object {
  var ignorenull: js.UndefOr[Boolean] = js.native
  var skipIndex: js.UndefOr[Boolean] = js.native
  var sorted: js.UndefOr[Boolean] = js.native
}

object FormEncodedOptions {
  @scala.inline
  def apply(): FormEncodedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormEncodedOptions]
  }
  @scala.inline
  implicit class FormEncodedOptionsOps[Self <: FormEncodedOptions] (val x: Self) extends AnyVal {
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
    def setIgnorenull(value: Boolean): Self = this.set("ignorenull", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnorenull: Self = this.set("ignorenull", js.undefined)
    @scala.inline
    def setSkipIndex(value: Boolean): Self = this.set("skipIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipIndex: Self = this.set("skipIndex", js.undefined)
    @scala.inline
    def setSorted(value: Boolean): Self = this.set("sorted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSorted: Self = this.set("sorted", js.undefined)
  }
  
}

