package typings.ejDotWebDotAll.ejNs.GridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchDeleteEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the grid model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the primary key.
    */
  var primaryKey: js.UndefOr[js.Any] = js.undefined
  /** Returns deleted data.
    */
  var rowData: js.UndefOr[js.Any] = js.undefined
  /** Returns the row Index.
    */
  var rowIndex: js.UndefOr[Double] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object BatchDeleteEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    model: js.Any = null,
    primaryKey: js.Any = null,
    rowData: js.Any = null,
    rowIndex: Int | Double = null,
    `type`: String = null
  ): BatchDeleteEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (model != null) __obj.updateDynamic("model")(model)
    if (primaryKey != null) __obj.updateDynamic("primaryKey")(primaryKey)
    if (rowData != null) __obj.updateDynamic("rowData")(rowData)
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BatchDeleteEventArgs]
  }
}

