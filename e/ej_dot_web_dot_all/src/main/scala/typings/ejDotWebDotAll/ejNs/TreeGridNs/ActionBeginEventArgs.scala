package typings.ejDotWebDotAll.ejNs.TreeGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionBeginEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the current grouped column field name.
    */
  var columnName: js.UndefOr[String] = js.undefined
  /** Returns the direction of sorting ascending or descending.
    */
  var columnSortDirection: js.UndefOr[String] = js.undefined
  /** Returns the data or deleting element.
    */
  var data: js.UndefOr[String] = js.undefined
  /** Returns the value of expanding parent element.
    */
  var keyValue: js.UndefOr[String] = js.undefined
  /** Returns the TreeGrid model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns request type.
    */
  var requestType: js.UndefOr[String] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object ActionBeginEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    columnName: String = null,
    columnSortDirection: String = null,
    data: String = null,
    keyValue: String = null,
    model: js.Any = null,
    requestType: String = null,
    `type`: String = null
  ): ActionBeginEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (columnName != null) __obj.updateDynamic("columnName")(columnName)
    if (columnSortDirection != null) __obj.updateDynamic("columnSortDirection")(columnSortDirection)
    if (data != null) __obj.updateDynamic("data")(data)
    if (keyValue != null) __obj.updateDynamic("keyValue")(keyValue)
    if (model != null) __obj.updateDynamic("model")(model)
    if (requestType != null) __obj.updateDynamic("requestType")(requestType)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ActionBeginEventArgs]
  }
}

