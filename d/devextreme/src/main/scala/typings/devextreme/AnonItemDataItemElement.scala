package typings.devextreme

import typings.devextreme.mod.DevExpress.core.dxElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItemDataItemElement extends js.Object {
  var itemData: js.UndefOr[js.Any] = js.undefined
  var itemElement: js.UndefOr[dxElement] = js.undefined
}

object AnonItemDataItemElement {
  @scala.inline
  def apply(itemData: js.Any = null, itemElement: dxElement = null): AnonItemDataItemElement = {
    val __obj = js.Dynamic.literal()
    if (itemData != null) __obj.updateDynamic("itemData")(itemData.asInstanceOf[js.Any])
    if (itemElement != null) __obj.updateDynamic("itemElement")(itemElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItemDataItemElement]
  }
}

