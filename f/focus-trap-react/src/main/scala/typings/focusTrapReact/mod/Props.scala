package typings.focusTrapReact.mod

import typings.focusTrap.mod.Options
import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props
  extends AllHTMLAttributes[js.Any] {
  var active: js.UndefOr[Boolean] = js.undefined
  @JSName("children")
  var children_Props: ReactElement
  var focusTrapOptions: js.UndefOr[Options] = js.undefined
  var paused: js.UndefOr[Boolean] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    children: ReactElement,
    AllHTMLAttributes: AllHTMLAttributes[js.Any] = null,
    active: js.UndefOr[Boolean] = js.undefined,
    focusTrapOptions: Options = null,
    paused: js.UndefOr[Boolean] = js.undefined
  ): Props = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.get.asInstanceOf[js.Any])
    if (focusTrapOptions != null) __obj.updateDynamic("focusTrapOptions")(focusTrapOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(paused)) __obj.updateDynamic("paused")(paused.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

