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
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (currentDate != null) __obj.updateDynamic("currentDate")(currentDate.asInstanceOf[js.Any])
    if (currentView != null) __obj.updateDynamic("currentView")(currentView.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (previousDate != null) __obj.updateDynamic("previousDate")(previousDate.asInstanceOf[js.Any])
    if (previousView != null) __obj.updateDynamic("previousView")(previousView.asInstanceOf[js.Any])
    if (requestType != null) __obj.updateDynamic("requestType")(requestType.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationEventArgs]
  }
}

