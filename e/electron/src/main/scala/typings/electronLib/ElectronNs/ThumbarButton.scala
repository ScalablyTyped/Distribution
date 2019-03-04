package typings
package electronLib.ElectronNs

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
  var flags: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The icon showing in thumbnail toolbar.
    */
  var icon: NativeImage
  /**
    * The text of the button's tooltip.
    */
  var tooltip: js.UndefOr[java.lang.String] = js.undefined
}

object ThumbarButton {
  @scala.inline
  def apply(
    click: js.Function,
    icon: NativeImage,
    flags: js.Array[java.lang.String] = null,
    tooltip: java.lang.String = null
  ): ThumbarButton = {
    val __obj = js.Dynamic.literal(click = click, icon = icon)
    if (flags != null) __obj.updateDynamic("flags")(flags)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    __obj.asInstanceOf[ThumbarButton]
  }
}

