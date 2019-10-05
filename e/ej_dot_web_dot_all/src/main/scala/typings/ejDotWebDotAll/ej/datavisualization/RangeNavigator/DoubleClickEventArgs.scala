package typings.ejDotWebDotAll.ej.datavisualization.RangeNavigator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DoubleClickEventArgs extends js.Object {
  /** parameters from range navigator
    */
  var Data: js.UndefOr[js.Any] = js.undefined
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** returns the range navigator model
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object DoubleClickEventArgs {
  @scala.inline
  def apply(
    Data: js.Any = null,
    cancel: js.UndefOr[Boolean] = js.undefined,
    model: js.Any = null,
    `type`: String = null
  ): DoubleClickEventArgs = {
    val __obj = js.Dynamic.literal()
    if (Data != null) __obj.updateDynamic("Data")(Data)
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (model != null) __obj.updateDynamic("model")(model)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DoubleClickEventArgs]
  }
}

