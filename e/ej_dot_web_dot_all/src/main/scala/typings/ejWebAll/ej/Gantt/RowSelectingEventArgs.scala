package typings.ejWebAll.ej.Gantt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowSelectingEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the data selecting record.
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Returns the previous selected row chart element.
    */
  var previousChartRow: js.UndefOr[js.Any] = js.undefined
  /** Returns the previous selected data.
    */
  var previousData: js.UndefOr[js.Any] = js.undefined
  /** Returns the previous selected row grid element.
    */
  var previousGridRow: js.UndefOr[js.Any] = js.undefined
  /** Returns the previous selected row index.
    */
  var previousIndex: js.UndefOr[String] = js.undefined
  /** Returns the index of selecting row record.
    */
  var recordIndex: js.UndefOr[String] = js.undefined
  /** Returns the selecting row chart element.
    */
  var targetChartRow: js.UndefOr[js.Any] = js.undefined
  /** Returns the selecting row grid element.
    */
  var targetGridRow: js.UndefOr[js.Any] = js.undefined
}

object RowSelectingEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    data: js.Any = null,
    previousChartRow: js.Any = null,
    previousData: js.Any = null,
    previousGridRow: js.Any = null,
    previousIndex: String = null,
    recordIndex: String = null,
    targetChartRow: js.Any = null,
    targetGridRow: js.Any = null
  ): RowSelectingEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.get.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (previousChartRow != null) __obj.updateDynamic("previousChartRow")(previousChartRow.asInstanceOf[js.Any])
    if (previousData != null) __obj.updateDynamic("previousData")(previousData.asInstanceOf[js.Any])
    if (previousGridRow != null) __obj.updateDynamic("previousGridRow")(previousGridRow.asInstanceOf[js.Any])
    if (previousIndex != null) __obj.updateDynamic("previousIndex")(previousIndex.asInstanceOf[js.Any])
    if (recordIndex != null) __obj.updateDynamic("recordIndex")(recordIndex.asInstanceOf[js.Any])
    if (targetChartRow != null) __obj.updateDynamic("targetChartRow")(targetChartRow.asInstanceOf[js.Any])
    if (targetGridRow != null) __obj.updateDynamic("targetGridRow")(targetGridRow.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowSelectingEventArgs]
  }
}

