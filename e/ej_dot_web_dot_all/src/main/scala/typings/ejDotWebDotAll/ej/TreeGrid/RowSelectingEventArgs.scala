package typings.ejDotWebDotAll.ej.TreeGrid

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
  /** Returns the previous selected data.
    */
  var previousData: js.UndefOr[js.Any] = js.undefined
  /** Returns the previous selected row index.
    */
  var previousIndex: js.UndefOr[String] = js.undefined
  /** Returns the previous selected row element.
    */
  var previousTreeGridRow: js.UndefOr[js.Any] = js.undefined
  /** Returns the index of selecting row record.
    */
  var recordIndex: js.UndefOr[String] = js.undefined
  /** Returns the selecting row element.
    */
  var targetRow: js.UndefOr[js.Any] = js.undefined
}

object RowSelectingEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    data: js.Any = null,
    previousData: js.Any = null,
    previousIndex: String = null,
    previousTreeGridRow: js.Any = null,
    recordIndex: String = null,
    targetRow: js.Any = null
  ): RowSelectingEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (previousData != null) __obj.updateDynamic("previousData")(previousData.asInstanceOf[js.Any])
    if (previousIndex != null) __obj.updateDynamic("previousIndex")(previousIndex.asInstanceOf[js.Any])
    if (previousTreeGridRow != null) __obj.updateDynamic("previousTreeGridRow")(previousTreeGridRow.asInstanceOf[js.Any])
    if (recordIndex != null) __obj.updateDynamic("recordIndex")(recordIndex.asInstanceOf[js.Any])
    if (targetRow != null) __obj.updateDynamic("targetRow")(targetRow.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowSelectingEventArgs]
  }
}

