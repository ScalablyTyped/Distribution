package typings
package ejDotWebDotAllLib.ejNs.GanttNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionCompleteEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the current grouped column field name.
    */
  var columnName: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the direction of sorting ascending or descending
    */
  var columnSortDirection: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the data of deleted element.
    */
  var data: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the value of searched element.
    */
  var keyValue: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the grid model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns selected record index
    */
  var recordIndex: js.UndefOr[scala.Double] = js.undefined
  /** Returns request type.
    */
  var requestType: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object ActionCompleteEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    columnName: java.lang.String = null,
    columnSortDirection: java.lang.String = null,
    data: java.lang.String = null,
    keyValue: java.lang.String = null,
    model: js.Any = null,
    recordIndex: scala.Int | scala.Double = null,
    requestType: java.lang.String = null,
    `type`: java.lang.String = null
  ): ActionCompleteEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (columnName != null) __obj.updateDynamic("columnName")(columnName)
    if (columnSortDirection != null) __obj.updateDynamic("columnSortDirection")(columnSortDirection)
    if (data != null) __obj.updateDynamic("data")(data)
    if (keyValue != null) __obj.updateDynamic("keyValue")(keyValue)
    if (model != null) __obj.updateDynamic("model")(model)
    if (recordIndex != null) __obj.updateDynamic("recordIndex")(recordIndex.asInstanceOf[js.Any])
    if (requestType != null) __obj.updateDynamic("requestType")(requestType)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ActionCompleteEventArgs]
  }
}

