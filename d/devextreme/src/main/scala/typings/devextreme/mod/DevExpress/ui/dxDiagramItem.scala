package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.devextremeStrings.connector
import typings.devextreme.devextremeStrings.shape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxDiagramItem extends js.Object {
  /** @name dxDiagramItem.dataItem */
  var dataItem: js.UndefOr[js.Any] = js.undefined
  /** @name dxDiagramItem.id */
  var id: js.UndefOr[String] = js.undefined
  /** @name dxDiagramItem.itemType */
  var itemType: js.UndefOr[shape | connector] = js.undefined
}

object dxDiagramItem {
  @scala.inline
  def apply(dataItem: js.Any = null, id: String = null, itemType: shape | connector = null): dxDiagramItem = {
    val __obj = js.Dynamic.literal()
    if (dataItem != null) __obj.updateDynamic("dataItem")(dataItem.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (itemType != null) __obj.updateDynamic("itemType")(itemType.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxDiagramItem]
  }
}

