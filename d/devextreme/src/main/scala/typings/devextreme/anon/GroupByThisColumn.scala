package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupByThisColumn extends js.Object {
  var groupByThisColumn: js.UndefOr[String] = js.undefined
  var groupContinuedMessage: js.UndefOr[String] = js.undefined
  var groupContinuesMessage: js.UndefOr[String] = js.undefined
  var ungroup: js.UndefOr[String] = js.undefined
  var ungroupAll: js.UndefOr[String] = js.undefined
}

object GroupByThisColumn {
  @scala.inline
  def apply(
    groupByThisColumn: String = null,
    groupContinuedMessage: String = null,
    groupContinuesMessage: String = null,
    ungroup: String = null,
    ungroupAll: String = null
  ): GroupByThisColumn = {
    val __obj = js.Dynamic.literal()
    if (groupByThisColumn != null) __obj.updateDynamic("groupByThisColumn")(groupByThisColumn.asInstanceOf[js.Any])
    if (groupContinuedMessage != null) __obj.updateDynamic("groupContinuedMessage")(groupContinuedMessage.asInstanceOf[js.Any])
    if (groupContinuesMessage != null) __obj.updateDynamic("groupContinuesMessage")(groupContinuesMessage.asInstanceOf[js.Any])
    if (ungroup != null) __obj.updateDynamic("ungroup")(ungroup.asInstanceOf[js.Any])
    if (ungroupAll != null) __obj.updateDynamic("ungroupAll")(ungroupAll.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupByThisColumn]
  }
}

