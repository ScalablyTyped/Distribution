package typings.ejDotWebDotAll.ejNs.GanttNs

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
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (data != null) __obj.updateDynamic("data")(data)
    if (previousChartRow != null) __obj.updateDynamic("previousChartRow")(previousChartRow)
    if (previousData != null) __obj.updateDynamic("previousData")(previousData)
    if (previousGridRow != null) __obj.updateDynamic("previousGridRow")(previousGridRow)
    if (previousIndex != null) __obj.updateDynamic("previousIndex")(previousIndex)
    if (recordIndex != null) __obj.updateDynamic("recordIndex")(recordIndex)
    if (targetChartRow != null) __obj.updateDynamic("targetChartRow")(targetChartRow)
    if (targetGridRow != null) __obj.updateDynamic("targetGridRow")(targetGridRow)
    __obj.asInstanceOf[RowSelectingEventArgs]
  }
}

