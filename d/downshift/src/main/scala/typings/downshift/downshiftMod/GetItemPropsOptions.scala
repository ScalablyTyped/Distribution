package typings.downshift.downshiftMod

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetItemPropsOptions[Item]
  extends AllHTMLAttributes[HTMLElement]
     with ClassAttributes[HTMLElement] {
  var index: js.UndefOr[Double] = js.undefined
  var isSelected: js.UndefOr[Boolean] = js.undefined
  var item: Item
}

object GetItemPropsOptions {
  @scala.inline
  def apply[Item](
    item: Item,
    AllHTMLAttributes: AllHTMLAttributes[HTMLElement] = null,
    ClassAttributes: ClassAttributes[HTMLElement] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    index: Int | Double = null,
    isSelected: js.UndefOr[Boolean] = js.undefined
  ): GetItemPropsOptions[Item] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(isSelected)) __obj.updateDynamic("isSelected")(isSelected)
    __obj.asInstanceOf[GetItemPropsOptions[Item]]
  }
}

