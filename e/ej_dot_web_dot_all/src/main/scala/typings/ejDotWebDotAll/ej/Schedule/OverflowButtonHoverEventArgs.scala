package typings.ejDotWebDotAll.ej.Schedule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverflowButtonHoverEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the icon rendered cell information.
    */
  var datas: js.UndefOr[js.Any] = js.undefined
  /** Returns the object of menu item event.
    */
  var event: js.UndefOr[js.Any] = js.undefined
  /** Returns the Schedule model.
    */
  var model: js.UndefOr[typings.ejDotWebDotAll.ej.Schedule.Model] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object OverflowButtonHoverEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    datas: js.Any = null,
    event: js.Any = null,
    model: typings.ejDotWebDotAll.ej.Schedule.Model = null,
    `type`: String = null
  ): OverflowButtonHoverEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (datas != null) __obj.updateDynamic("datas")(datas)
    if (event != null) __obj.updateDynamic("event")(event)
    if (model != null) __obj.updateDynamic("model")(model)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[OverflowButtonHoverEventArgs]
  }
}

