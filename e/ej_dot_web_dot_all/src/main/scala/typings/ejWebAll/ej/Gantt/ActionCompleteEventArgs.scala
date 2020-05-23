package typings.ejWebAll.ej.Gantt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionCompleteEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the current grouped column field name.
    */
  var columnName: js.UndefOr[String] = js.undefined
  /** Returns the direction of sorting ascending or descending
    */
  var columnSortDirection: js.UndefOr[String] = js.undefined
  /** Returns the data of deleted element.
    */
  var data: js.UndefOr[String] = js.undefined
  /** Returns the value of searched element.
    */
  var keyValue: js.UndefOr[String] = js.undefined
  /** Returns the grid model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns selected record index
    */
  var recordIndex: js.UndefOr[Double] = js.undefined
  /** Returns request type.
    */
  var requestType: js.UndefOr[String] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object ActionCompleteEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    columnName: String = null,
    columnSortDirection: String = null,
    data: String = null,
    keyValue: String = null,
    model: js.Any = null,
    recordIndex: js.UndefOr[Double] = js.undefined,
    requestType: String = null,
    `type`: String = null
  ): ActionCompleteEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.get.asInstanceOf[js.Any])
    if (columnName != null) __obj.updateDynamic("columnName")(columnName.asInstanceOf[js.Any])
    if (columnSortDirection != null) __obj.updateDynamic("columnSortDirection")(columnSortDirection.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (keyValue != null) __obj.updateDynamic("keyValue")(keyValue.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (!js.isUndefined(recordIndex)) __obj.updateDynamic("recordIndex")(recordIndex.get.asInstanceOf[js.Any])
    if (requestType != null) __obj.updateDynamic("requestType")(requestType.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionCompleteEventArgs]
  }
}

