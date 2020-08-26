package typings.ejWebAll.ej.TreeGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnsCommand extends js.Object {
  /** Gets or sets an object to customize command button with available ejButton properties.
    */
  var buttonOptions: js.UndefOr[js.Any] = js.native
  /** Gets or sets a value that define the command column buttons to be displayed.
    */
  var `type`: js.UndefOr[UnboundType | String] = js.native
}

object ColumnsCommand {
  @scala.inline
  def apply(): ColumnsCommand = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnsCommand]
  }
  @scala.inline
  implicit class ColumnsCommandOps[Self <: ColumnsCommand] (val x: Self) extends AnyVal {
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
    def setButtonOptions(value: js.Any): Self = this.set("buttonOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonOptions: Self = this.set("buttonOptions", js.undefined)
    @scala.inline
    def setType(value: UnboundType | String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

