package typings
package ejDotWebDotAllLib.ejNs.KanbanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionBeginEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns current filtering object field name.
    */
  var currentFilteringobject: js.UndefOr[js.Any] = js.undefined
  /** Returns the card object (JSON).
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Returns filter details.
    */
  var filterCollection: js.UndefOr[js.Any] = js.undefined
  /** Returns the Kanban model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the current action event type.
    */
  var originalEventType: js.UndefOr[java.lang.String] = js.undefined
  /** Returns primary key value.
    */
  var primaryKeyValue: js.UndefOr[java.lang.String] = js.undefined
  /** Returns request type.
    */
  var requestType: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the edited row index.
    */
  var rowIndex: js.UndefOr[scala.Double] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object ActionBeginEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    currentFilteringobject: js.Any = null,
    data: js.Any = null,
    filterCollection: js.Any = null,
    model: js.Any = null,
    originalEventType: java.lang.String = null,
    primaryKeyValue: java.lang.String = null,
    requestType: java.lang.String = null,
    rowIndex: scala.Int | scala.Double = null,
    `type`: java.lang.String = null
  ): ActionBeginEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (currentFilteringobject != null) __obj.updateDynamic("currentFilteringobject")(currentFilteringobject)
    if (data != null) __obj.updateDynamic("data")(data)
    if (filterCollection != null) __obj.updateDynamic("filterCollection")(filterCollection)
    if (model != null) __obj.updateDynamic("model")(model)
    if (originalEventType != null) __obj.updateDynamic("originalEventType")(originalEventType)
    if (primaryKeyValue != null) __obj.updateDynamic("primaryKeyValue")(primaryKeyValue)
    if (requestType != null) __obj.updateDynamic("requestType")(requestType)
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ActionBeginEventArgs]
  }
}

