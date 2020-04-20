package typings.downshift.mod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseMultipleSelectionGetSelectedItemPropsOptions[Item]
  extends AllHTMLAttributes[HTMLElement]
     with ClassAttributes[HTMLElement]
     with GetPropsWithRefKey {
  var index: js.UndefOr[Double] = js.undefined
  var selectedItem: Item
}

object UseMultipleSelectionGetSelectedItemPropsOptions {
  @scala.inline
  def apply[Item](
    selectedItem: Item,
    AllHTMLAttributes: AllHTMLAttributes[HTMLElement] = null,
    ClassAttributes: ClassAttributes[HTMLElement] = null,
    GetPropsWithRefKey: GetPropsWithRefKey = null,
    index: Int | Double = null
  ): UseMultipleSelectionGetSelectedItemPropsOptions[Item] = {
    val __obj = js.Dynamic.literal(selectedItem = selectedItem.asInstanceOf[js.Any])
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (GetPropsWithRefKey != null) js.Dynamic.global.Object.assign(__obj, GetPropsWithRefKey)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseMultipleSelectionGetSelectedItemPropsOptions[Item]]
  }
}

