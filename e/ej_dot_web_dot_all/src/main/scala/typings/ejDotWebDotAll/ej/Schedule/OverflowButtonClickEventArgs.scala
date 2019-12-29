package typings.ejDotWebDotAll.ej.Schedule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverflowButtonClickEventArgs extends js.Object {
  /** Returns the icon rendered cell information.
    */
  var Datas: js.UndefOr[js.Any] = js.undefined
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the object of menu item event.
    */
  var events: js.UndefOr[js.Any] = js.undefined
  /** Returns the Schedule model.
    */
  var model: js.UndefOr[Model] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object OverflowButtonClickEventArgs {
  @scala.inline
  def apply(
    Datas: js.Any = null,
    cancel: js.UndefOr[Boolean] = js.undefined,
    events: js.Any = null,
    model: Model = null,
    `type`: String = null
  ): OverflowButtonClickEventArgs = {
    val __obj = js.Dynamic.literal()
    if (Datas != null) __obj.updateDynamic("Datas")(Datas.asInstanceOf[js.Any])
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverflowButtonClickEventArgs]
  }
}

