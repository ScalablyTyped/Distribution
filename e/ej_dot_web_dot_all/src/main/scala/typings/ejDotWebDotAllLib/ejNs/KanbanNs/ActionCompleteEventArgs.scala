package typings
package ejDotWebDotAllLib.ejNs.KanbanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionCompleteEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns current filtering column field name.
    */
  var currentFilteringColumn: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the card object (JSON).
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Returns filter details.
    */
  var filterCollection: js.UndefOr[js.Any] = js.undefined
  /** Returns the Kanban model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns current action event type.
    */
  var originalEventType: js.UndefOr[java.lang.String] = js.undefined
  /** Returns primary key.
    */
  var primaryKey: js.UndefOr[java.lang.String] = js.undefined
  /** Returns primary key value.
    */
  var primaryKeyValue: js.UndefOr[java.lang.String] = js.undefined
  /** Returns request type.
    */
  var requestType: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the selectedRow index.
    */
  var selectedRow: js.UndefOr[scala.Double] = js.undefined
  /** Returns Kanban element.
    */
  var target: js.UndefOr[js.Any] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object ActionCompleteEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    currentFilteringColumn: java.lang.String = null,
    data: js.Any = null,
    filterCollection: js.Any = null,
    model: js.Any = null,
    originalEventType: java.lang.String = null,
    primaryKey: java.lang.String = null,
    primaryKeyValue: java.lang.String = null,
    requestType: java.lang.String = null,
    selectedRow: scala.Int | scala.Double = null,
    target: js.Any = null,
    `type`: java.lang.String = null
  ): ActionCompleteEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (currentFilteringColumn != null) __obj.updateDynamic("currentFilteringColumn")(currentFilteringColumn)
    if (data != null) __obj.updateDynamic("data")(data)
    if (filterCollection != null) __obj.updateDynamic("filterCollection")(filterCollection)
    if (model != null) __obj.updateDynamic("model")(model)
    if (originalEventType != null) __obj.updateDynamic("originalEventType")(originalEventType)
    if (primaryKey != null) __obj.updateDynamic("primaryKey")(primaryKey)
    if (primaryKeyValue != null) __obj.updateDynamic("primaryKeyValue")(primaryKeyValue)
    if (requestType != null) __obj.updateDynamic("requestType")(requestType)
    if (selectedRow != null) __obj.updateDynamic("selectedRow")(selectedRow.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ActionCompleteEventArgs]
  }
}

