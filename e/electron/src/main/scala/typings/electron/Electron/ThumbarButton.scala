package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThumbarButton extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/thumbar-button
  var click: js.Function
  /**
    * Control specific states and behaviors of the button. By default, it is
    * ['enabled'].
    */
  var flags: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The icon showing in thumbnail toolbar.
    */
  var icon: NativeImage_
  /**
    * The text of the button's tooltip.
    */
  var tooltip: js.UndefOr[String] = js.undefined
}

object ThumbarButton {
  @scala.inline
  def apply(click: js.Function, icon: NativeImage_, flags: js.Array[String] = null, tooltip: String = null): ThumbarButton = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any])
    if (flags != null) __obj.updateDynamic("flags")(flags.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThumbarButton]
  }
}

