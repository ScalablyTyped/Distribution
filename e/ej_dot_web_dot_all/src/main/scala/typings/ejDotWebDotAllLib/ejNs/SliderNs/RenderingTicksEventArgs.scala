package typings
package ejDotWebDotAllLib.ejNs.SliderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderingTicksEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the current Li element
    */
  var tick: js.UndefOr[js.Any] = js.undefined
  /** returns slider tick value
    */
  var value: js.UndefOr[scala.Double] = js.undefined
  /** returns the value type either tooltip or label value
    */
  var valueType: js.UndefOr[java.lang.String] = js.undefined
}

object RenderingTicksEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    tick: js.Any = null,
    value: scala.Int | scala.Double = null,
    valueType: java.lang.String = null
  ): RenderingTicksEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (tick != null) __obj.updateDynamic("tick")(tick)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueType != null) __obj.updateDynamic("valueType")(valueType)
    __obj.asInstanceOf[RenderingTicksEventArgs]
  }
}

