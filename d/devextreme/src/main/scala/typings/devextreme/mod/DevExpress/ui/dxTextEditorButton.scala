package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.devextremeStrings.after
import typings.devextreme.devextremeStrings.before
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxTextEditorButton extends js.Object {
  /** @name dxTextEditorButton.location */
  var location: js.UndefOr[after | before] = js.native
  /** @name dxTextEditorButton.name */
  var name: js.UndefOr[String] = js.native
  /** @name dxTextEditorButton.options */
  var options: js.UndefOr[dxButtonOptions] = js.native
}

object dxTextEditorButton {
  @scala.inline
  def apply(): dxTextEditorButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxTextEditorButton]
  }
  @scala.inline
  implicit class dxTextEditorButtonOps[Self <: dxTextEditorButton] (val x: Self) extends AnyVal {
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
    def setLocation(value: after | before): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOptions(value: dxButtonOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
  
}

