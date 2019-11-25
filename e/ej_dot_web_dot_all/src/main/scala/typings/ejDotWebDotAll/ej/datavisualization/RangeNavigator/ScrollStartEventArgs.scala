package typings.ejDotWebDotAll.ej.datavisualization.RangeNavigator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollStartEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** parameters from RangeNavigator
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /** returns the scrollbar position end range value on changing scrollbar
    */
  var dataEndRange: js.UndefOr[String] = js.undefined
  /** returns the scrollbar position starting range value on changing scrollbar
    */
  var dataStartRange: js.UndefOr[String] = js.undefined
  /** returns the RangeNavigator model
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object ScrollStartEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    data: js.Any = null,
    dataEndRange: String = null,
    dataStartRange: String = null,
    model: js.Any = null,
    `type`: String = null
  ): ScrollStartEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataEndRange != null) __obj.updateDynamic("dataEndRange")(dataEndRange.asInstanceOf[js.Any])
    if (dataStartRange != null) __obj.updateDynamic("dataStartRange")(dataStartRange.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollStartEventArgs]
  }
}

