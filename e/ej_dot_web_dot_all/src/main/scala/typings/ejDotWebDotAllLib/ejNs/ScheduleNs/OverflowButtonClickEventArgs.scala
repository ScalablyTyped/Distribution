package typings
package ejDotWebDotAllLib.ejNs.ScheduleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverflowButtonClickEventArgs extends js.Object {
  /** Returns the icon rendered cell information.
    */
  var Datas: js.UndefOr[js.Any] = js.undefined
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the object of menu item event.
    */
  var events: js.UndefOr[js.Any] = js.undefined
  /** Returns the Schedule model.
    */
  var model: js.UndefOr[Model] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object OverflowButtonClickEventArgs {
  @scala.inline
  def apply(
    Datas: js.Any = null,
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    events: js.Any = null,
    model: Model = null,
    `type`: java.lang.String = null
  ): OverflowButtonClickEventArgs = {
    val __obj = js.Dynamic.literal()
    if (Datas != null) __obj.updateDynamic("Datas")(Datas)
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (events != null) __obj.updateDynamic("events")(events)
    if (model != null) __obj.updateDynamic("model")(model)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[OverflowButtonClickEventArgs]
  }
}

