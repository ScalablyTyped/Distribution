package typings
package ejDotWebDotAllLib.ejNs.KanbanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionFailureEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns current filtering column field name.
    */
  var currentFilteringColumn: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the card object (JSON).
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Returns the error return by server.
    */
  var error: js.UndefOr[js.Any] = js.undefined
  /** Returns filter details.
    */
  var filterCollection: js.UndefOr[js.Any] = js.undefined
  /** Returns the Kanban model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns current action event type.
    */
  var originalEventType: js.UndefOr[java.lang.String] = js.undefined
  /** Returns primary key value.
    */
  var primaryKeyValue: js.UndefOr[java.lang.String] = js.undefined
  /** Returns request type.
    */
  var requestType: js.UndefOr[java.lang.String] = js.undefined
  /** Returns Kanban element.
    */
  var target: js.UndefOr[js.Any] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object ActionFailureEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    currentFilteringColumn: java.lang.String = null,
    data: js.Any = null,
    error: js.Any = null,
    filterCollection: js.Any = null,
    model: js.Any = null,
    originalEventType: java.lang.String = null,
    primaryKeyValue: java.lang.String = null,
    requestType: java.lang.String = null,
    target: js.Any = null,
    `type`: java.lang.String = null
  ): ActionFailureEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (currentFilteringColumn != null) __obj.updateDynamic("currentFilteringColumn")(currentFilteringColumn)
    if (data != null) __obj.updateDynamic("data")(data)
    if (error != null) __obj.updateDynamic("error")(error)
    if (filterCollection != null) __obj.updateDynamic("filterCollection")(filterCollection)
    if (model != null) __obj.updateDynamic("model")(model)
    if (originalEventType != null) __obj.updateDynamic("originalEventType")(originalEventType)
    if (primaryKeyValue != null) __obj.updateDynamic("primaryKeyValue")(primaryKeyValue)
    if (requestType != null) __obj.updateDynamic("requestType")(requestType)
    if (target != null) __obj.updateDynamic("target")(target)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ActionFailureEventArgs]
  }
}

