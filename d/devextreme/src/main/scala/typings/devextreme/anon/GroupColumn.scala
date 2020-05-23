package typings.devextreme.anon

import typings.devextreme.devextremeStrings.asc
import typings.devextreme.devextremeStrings.desc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupColumn extends js.Object {
  var groupColumn: js.UndefOr[String] = js.undefined
  var sortOrder: js.UndefOr[asc | desc] = js.undefined
  var summaryItem: js.UndefOr[String | Double] = js.undefined
}

object GroupColumn {
  @scala.inline
  def apply(groupColumn: String = null, sortOrder: asc | desc = null, summaryItem: String | Double = null): GroupColumn = {
    val __obj = js.Dynamic.literal()
    if (groupColumn != null) __obj.updateDynamic("groupColumn")(groupColumn.asInstanceOf[js.Any])
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    if (summaryItem != null) __obj.updateDynamic("summaryItem")(summaryItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupColumn]
  }
}

