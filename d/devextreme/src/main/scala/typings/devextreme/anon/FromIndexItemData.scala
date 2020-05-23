package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FromIndexItemData extends js.Object {
  var fromIndex: js.UndefOr[Double] = js.undefined
  var itemData: js.UndefOr[js.Any] = js.undefined
  var itemElement: js.UndefOr[dxElement] = js.undefined
}

object FromIndexItemData {
  @scala.inline
  def apply(
    fromIndex: js.UndefOr[Double] = js.undefined,
    itemData: js.Any = null,
    itemElement: dxElement = null
  ): FromIndexItemData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fromIndex)) __obj.updateDynamic("fromIndex")(fromIndex.get.asInstanceOf[js.Any])
    if (itemData != null) __obj.updateDynamic("itemData")(itemData.asInstanceOf[js.Any])
    if (itemElement != null) __obj.updateDynamic("itemElement")(itemElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[FromIndexItemData]
  }
}

