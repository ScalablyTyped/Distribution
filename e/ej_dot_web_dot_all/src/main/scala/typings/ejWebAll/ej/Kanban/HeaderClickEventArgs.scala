package typings.ejWebAll.ej.Kanban

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderClickEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the select cell index value.
    */
  var cellIndex: js.UndefOr[Double] = js.undefined
  /** Returns the column object.
    */
  var columnData: js.UndefOr[js.Any] = js.undefined
  /** Returns the kanban model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object HeaderClickEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    cellIndex: js.UndefOr[Double] = js.undefined,
    columnData: js.Any = null,
    model: js.Any = null,
    `type`: String = null
  ): HeaderClickEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cellIndex)) __obj.updateDynamic("cellIndex")(cellIndex.get.asInstanceOf[js.Any])
    if (columnData != null) __obj.updateDynamic("columnData")(columnData.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderClickEventArgs]
  }
}

