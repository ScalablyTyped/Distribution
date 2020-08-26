package typings.fundamentalReact.anon

import typings.react.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.WeakValidationMap<fundamental-react.fundamental-react/lib/List/List.ListTextProps> */
@js.native
trait WeakValidationMapListText extends js.Object {
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var noWrap: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var secondary: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
}

object WeakValidationMapListText {
  @scala.inline
  def apply(): WeakValidationMapListText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapListText]
  }
  @scala.inline
  implicit class WeakValidationMapListTextOps[Self <: WeakValidationMapListText] (val x: Self) extends AnyVal {
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
    def setClassName(value: Validator[js.UndefOr[Null | String]]): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setNoWrap(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("noWrap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoWrap: Self = this.set("noWrap", js.undefined)
    @scala.inline
    def setSecondary(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("secondary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecondary: Self = this.set("secondary", js.undefined)
  }
  
}

