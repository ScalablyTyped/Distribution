package typings.fundamentalReact.anon

import typings.react.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.WeakValidationMap<fundamental-react.fundamental-react/lib/Forms/FormGroup.FormGroupProps> */
@js.native
trait WeakValidationMapFormGrou extends js.Object {
  var disableStyles: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
}

object WeakValidationMapFormGrou {
  @scala.inline
  def apply(): WeakValidationMapFormGrou = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapFormGrou]
  }
  @scala.inline
  implicit class WeakValidationMapFormGrouOps[Self <: WeakValidationMapFormGrou] (val x: Self) extends AnyVal {
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
    def setDisableStyles(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("disableStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableStyles: Self = this.set("disableStyles", js.undefined)
  }
  
}

