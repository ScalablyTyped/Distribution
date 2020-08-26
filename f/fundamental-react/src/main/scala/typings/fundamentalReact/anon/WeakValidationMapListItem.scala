package typings.fundamentalReact.anon

import typings.react.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.WeakValidationMap<fundamental-react.fundamental-react/lib/List/List.ListItemProps> */
@js.native
trait WeakValidationMapListItem extends js.Object {
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var onClick: js.UndefOr[Validator[js.UndefOr[(js.Function1[/* repeated */ _, _]) | Null]]] = js.native
  var selected: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
}

object WeakValidationMapListItem {
  @scala.inline
  def apply(): WeakValidationMapListItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapListItem]
  }
  @scala.inline
  implicit class WeakValidationMapListItemOps[Self <: WeakValidationMapListItem] (val x: Self) extends AnyVal {
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
    def setOnClick(value: Validator[js.UndefOr[(js.Function1[/* repeated */ _, _]) | Null]]): Self = this.set("onClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setSelected(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
  }
  
}

