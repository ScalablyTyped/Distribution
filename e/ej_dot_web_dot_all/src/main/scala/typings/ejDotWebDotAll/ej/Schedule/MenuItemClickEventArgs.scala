package typings.ejDotWebDotAll.ej.Schedule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuItemClickEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the object of menu item event.
    */
  var events: js.UndefOr[js.Any] = js.undefined
  /** Returns the Schedule model.
    */
  var model: js.UndefOr[typings.ejDotWebDotAll.ej.Schedule.Model] = js.undefined
  /** Returns the right clicked cell details.
    */
  var targetInfo: js.UndefOr[js.Any] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object MenuItemClickEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    events: js.Any = null,
    model: typings.ejDotWebDotAll.ej.Schedule.Model = null,
    targetInfo: js.Any = null,
    `type`: String = null
  ): MenuItemClickEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (events != null) __obj.updateDynamic("events")(events)
    if (model != null) __obj.updateDynamic("model")(model)
    if (targetInfo != null) __obj.updateDynamic("targetInfo")(targetInfo)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MenuItemClickEventArgs]
  }
}

