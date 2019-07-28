package typings.downshift.downshiftMod

import typings.react.reactMod.HTMLProps
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetItemPropsOptions[Item] extends HTMLProps[HTMLElement] {
  var index: js.UndefOr[Double] = js.undefined
  var isSelected: js.UndefOr[Boolean] = js.undefined
  var item: Item
}

object GetItemPropsOptions {
  @scala.inline
  def apply[Item](
    item: Item,
    HTMLProps: HTMLProps[HTMLElement] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    index: Int | Double = null,
    isSelected: js.UndefOr[Boolean] = js.undefined
  ): GetItemPropsOptions[Item] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(isSelected)) __obj.updateDynamic("isSelected")(isSelected)
    __obj.asInstanceOf[GetItemPropsOptions[Item]]
  }
}

