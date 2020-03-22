package typings.devextreme

import typings.devextreme.mod.DevExpress.core.dxElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFromIndexItemData extends js.Object {
  var fromIndex: js.UndefOr[Double] = js.undefined
  var itemData: js.UndefOr[js.Any] = js.undefined
  var itemElement: js.UndefOr[dxElement] = js.undefined
}

object AnonFromIndexItemData {
  @scala.inline
  def apply(fromIndex: Int | Double = null, itemData: js.Any = null, itemElement: dxElement = null): AnonFromIndexItemData = {
    val __obj = js.Dynamic.literal()
    if (fromIndex != null) __obj.updateDynamic("fromIndex")(fromIndex.asInstanceOf[js.Any])
    if (itemData != null) __obj.updateDynamic("itemData")(itemData.asInstanceOf[js.Any])
    if (itemElement != null) __obj.updateDynamic("itemElement")(itemElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFromIndexItemData]
  }
}

