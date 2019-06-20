package typings
package focusDashTrapDashReactLib.focusDashTrapDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props
  extends reactLib.reactMod.AllHTMLAttributes[js.Any] {
  var active: js.UndefOr[scala.Boolean] = js.undefined
  @JSName("children")
  var children_Props: reactLib.reactMod.ReactElement
  var focusTrapOptions: js.UndefOr[focusDashTrapLib.focusDashTrapMod.Options] = js.undefined
  var paused: js.UndefOr[scala.Boolean] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactElement,
    AllHTMLAttributes: reactLib.reactMod.AllHTMLAttributes[js.Any] = null,
    active: js.UndefOr[scala.Boolean] = js.undefined,
    focusTrapOptions: focusDashTrapLib.focusDashTrapMod.Options = null,
    paused: js.UndefOr[scala.Boolean] = js.undefined
  ): Props = {
    val __obj = js.Dynamic.literal(children = children)
    js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (focusTrapOptions != null) __obj.updateDynamic("focusTrapOptions")(focusTrapOptions)
    if (!js.isUndefined(paused)) __obj.updateDynamic("paused")(paused)
    __obj.asInstanceOf[Props]
  }
}

