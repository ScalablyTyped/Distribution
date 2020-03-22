package typings.devextreme

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFromData extends js.Object {
  var cancel: js.UndefOr[Boolean] = js.undefined
  var event: js.UndefOr[typings.devextreme.mod.DevExpress.event] = js.undefined
  var fromData: js.UndefOr[js.Any] = js.undefined
  var fromIndex: js.UndefOr[Double] = js.undefined
  var itemData: js.UndefOr[js.Any] = js.undefined
  var itemElement: js.UndefOr[dxElement] = js.undefined
}

object AnonFromData {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    event: event = null,
    fromData: js.Any = null,
    fromIndex: Int | Double = null,
    itemData: js.Any = null,
    itemElement: dxElement = null
  ): AnonFromData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (fromData != null) __obj.updateDynamic("fromData")(fromData.asInstanceOf[js.Any])
    if (fromIndex != null) __obj.updateDynamic("fromIndex")(fromIndex.asInstanceOf[js.Any])
    if (itemData != null) __obj.updateDynamic("itemData")(itemData.asInstanceOf[js.Any])
    if (itemElement != null) __obj.updateDynamic("itemElement")(itemElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFromData]
  }
}

