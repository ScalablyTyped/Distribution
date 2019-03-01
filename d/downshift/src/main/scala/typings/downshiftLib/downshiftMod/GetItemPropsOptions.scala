package typings
package downshiftLib.downshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetItemPropsOptions[Item]
  extends reactLib.reactMod.ReactNs.HTMLProps[reactLib.HTMLElement] {
  var index: js.UndefOr[scala.Double] = js.undefined
  var isSelected: js.UndefOr[scala.Boolean] = js.undefined
  var item: Item
}

object GetItemPropsOptions {
  @scala.inline
  def apply[Item](
    item: Item,
    HTMLProps: reactLib.reactMod.ReactNs.HTMLProps[reactLib.HTMLElement] = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    index: scala.Int | scala.Double = null,
    isSelected: js.UndefOr[scala.Boolean] = js.undefined
  ): GetItemPropsOptions[Item] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(isSelected)) __obj.updateDynamic("isSelected")(isSelected)
    __obj.asInstanceOf[GetItemPropsOptions[Item]]
  }
}

