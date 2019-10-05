package typings.ejDotWebDotAll.ej.Schedule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the current date object.
    */
  var currentDate: js.UndefOr[js.Any] = js.undefined
  /** Returns the current view value.
    */
  var currentView: js.UndefOr[String] = js.undefined
  /** Returns the Schedule model.
    */
  var model: js.UndefOr[typings.ejDotWebDotAll.ej.Schedule.Model] = js.undefined
  /** Returns the previous date of the Schedule.
    */
  var previousDate: js.UndefOr[js.Any] = js.undefined
  /** Returns the previous view value.
    */
  var previousView: js.UndefOr[String] = js.undefined
  /** Returns the name of the Scheduler event.
    */
  var requestType: js.UndefOr[String] = js.undefined
  /** Returns the target of the action.
    */
  var target: js.UndefOr[js.Any] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object NavigationEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    currentDate: js.Any = null,
    currentView: String = null,
    model: typings.ejDotWebDotAll.ej.Schedule.Model = null,
    previousDate: js.Any = null,
    previousView: String = null,
    requestType: String = null,
    target: js.Any = null,
    `type`: String = null
  ): NavigationEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (currentDate != null) __obj.updateDynamic("currentDate")(currentDate)
    if (currentView != null) __obj.updateDynamic("currentView")(currentView)
    if (model != null) __obj.updateDynamic("model")(model)
    if (previousDate != null) __obj.updateDynamic("previousDate")(previousDate)
    if (previousView != null) __obj.updateDynamic("previousView")(previousView)
    if (requestType != null) __obj.updateDynamic("requestType")(requestType)
    if (target != null) __obj.updateDynamic("target")(target)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[NavigationEventArgs]
  }
}

