package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThumbarButton extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/thumbar-button
  var click: js.Function = js.native
  /**
    * Control specific states and behaviors of the button. By default, it is
    * `['enabled']`.
    */
  var flags: js.UndefOr[js.Array[String]] = js.native
  /**
    * The icon showing in thumbnail toolbar.
    */
  var icon: NativeImage_ = js.native
  /**
    * The text of the button's tooltip.
    */
  var tooltip: js.UndefOr[String] = js.native
}

object ThumbarButton {
  @scala.inline
  def apply(click: js.Function, icon: NativeImage_): ThumbarButton = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThumbarButton]
  }
  @scala.inline
  implicit class ThumbarButtonOps[Self <: ThumbarButton] (val x: Self) extends AnyVal {
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
    def setClick(value: js.Function): Self = this.set("click", value.asInstanceOf[js.Any])
    @scala.inline
    def setIcon(value: NativeImage_): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlagsVarargs(value: String*): Self = this.set("flags", js.Array(value :_*))
    @scala.inline
    def setFlags(value: js.Array[String]): Self = this.set("flags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlags: Self = this.set("flags", js.undefined)
    @scala.inline
    def setTooltip(value: String): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
  }
  
}

