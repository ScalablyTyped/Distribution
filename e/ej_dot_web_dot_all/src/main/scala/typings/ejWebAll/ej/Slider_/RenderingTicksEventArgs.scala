package typings.ejWebAll.ej.Slider_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderingTicksEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** returns the current Li element
    */
  var tick: js.UndefOr[js.Any] = js.undefined
  /** returns slider tick value
    */
  var value: js.UndefOr[Double] = js.undefined
  /** returns the value type either tooltip or label value
    */
  var valueType: js.UndefOr[String] = js.undefined
}

object RenderingTicksEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    tick: js.Any = null,
    value: js.UndefOr[Double] = js.undefined,
    valueType: String = null
  ): RenderingTicksEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.get.asInstanceOf[js.Any])
    if (tick != null) __obj.updateDynamic("tick")(tick.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    if (valueType != null) __obj.updateDynamic("valueType")(valueType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderingTicksEventArgs]
  }
}

