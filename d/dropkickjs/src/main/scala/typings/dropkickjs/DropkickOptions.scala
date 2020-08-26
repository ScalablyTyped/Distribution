package typings.dropkickjs

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropkickOptions extends js.Object {
  var change: js.UndefOr[js.Function0[Unit]] = js.native
  var close: js.UndefOr[js.Function0[Unit]] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var form: js.UndefOr[Node] = js.native
  var initialize: js.UndefOr[js.Function0[Unit]] = js.native
  var length: js.UndefOr[Double] = js.native
  var mobile: js.UndefOr[Boolean] = js.native
  var multiple: js.UndefOr[Boolean] = js.native
  var open: js.UndefOr[js.Function0[Unit]] = js.native
  var options: js.UndefOr[js.Array[String]] = js.native
  var selectedIndex: js.UndefOr[Double] = js.native
  var selectedOptions: js.UndefOr[js.Array[String]] = js.native
  var value: js.UndefOr[String] = js.native
}

object DropkickOptions {
  @scala.inline
  def apply(): DropkickOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropkickOptions]
  }
  @scala.inline
  implicit class DropkickOptionsOps[Self <: DropkickOptions] (val x: Self) extends AnyVal {
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
    def setChange(value: () => Unit): Self = this.set("change", js.Any.fromFunction0(value))
    @scala.inline
    def deleteChange: Self = this.set("change", js.undefined)
    @scala.inline
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    @scala.inline
    def deleteClose: Self = this.set("close", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setForm(value: Node): Self = this.set("form", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForm: Self = this.set("form", js.undefined)
    @scala.inline
    def setInitialize(value: () => Unit): Self = this.set("initialize", js.Any.fromFunction0(value))
    @scala.inline
    def deleteInitialize: Self = this.set("initialize", js.undefined)
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    @scala.inline
    def setMobile(value: Boolean): Self = this.set("mobile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMobile: Self = this.set("mobile", js.undefined)
    @scala.inline
    def setMultiple(value: Boolean): Self = this.set("multiple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiple: Self = this.set("multiple", js.undefined)
    @scala.inline
    def setOpen(value: () => Unit): Self = this.set("open", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    @scala.inline
    def setOptionsVarargs(value: String*): Self = this.set("options", js.Array(value :_*))
    @scala.inline
    def setOptions(value: js.Array[String]): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setSelectedIndex(value: Double): Self = this.set("selectedIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedIndex: Self = this.set("selectedIndex", js.undefined)
    @scala.inline
    def setSelectedOptionsVarargs(value: String*): Self = this.set("selectedOptions", js.Array(value :_*))
    @scala.inline
    def setSelectedOptions(value: js.Array[String]): Self = this.set("selectedOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedOptions: Self = this.set("selectedOptions", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

