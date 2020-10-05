package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TouchBarPopoverConstructorOptions extends js.Object {
  /**
    * Popover button icon.
    */
  var icon: js.UndefOr[NativeImage_] = js.native
  /**
    * Items to display in the popover.
    */
  var items: TouchBar = js.native
  /**
    * Popover button text.
    */
  var label: js.UndefOr[String] = js.native
  /**
    * `true` to display a close button on the left of the popover, `false` to not show
    * it. Default is `true`.
    */
  var showCloseButton: js.UndefOr[Boolean] = js.native
}

object TouchBarPopoverConstructorOptions {
  @scala.inline
  def apply(items: TouchBar): TouchBarPopoverConstructorOptions = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchBarPopoverConstructorOptions]
  }
  @scala.inline
  implicit class TouchBarPopoverConstructorOptionsOps[Self <: TouchBarPopoverConstructorOptions] (val x: Self) extends AnyVal {
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
    def setItems(value: TouchBar): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setIcon(value: NativeImage_): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setShowCloseButton(value: Boolean): Self = this.set("showCloseButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowCloseButton: Self = this.set("showCloseButton", js.undefined)
  }
  
}

