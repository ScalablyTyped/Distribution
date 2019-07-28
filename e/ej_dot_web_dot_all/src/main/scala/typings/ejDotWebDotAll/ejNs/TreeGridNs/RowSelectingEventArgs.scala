package typings.ejDotWebDotAll.ejNs.TreeGridNs

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
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (data != null) __obj.updateDynamic("data")(data)
    if (previousData != null) __obj.updateDynamic("previousData")(previousData)
    if (previousIndex != null) __obj.updateDynamic("previousIndex")(previousIndex)
    if (previousTreeGridRow != null) __obj.updateDynamic("previousTreeGridRow")(previousTreeGridRow)
    if (recordIndex != null) __obj.updateDynamic("recordIndex")(recordIndex)
    if (targetRow != null) __obj.updateDynamic("targetRow")(targetRow)
    __obj.asInstanceOf[RowSelectingEventArgs]
  }
}

