package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TouchBarSliderConstructorOptions extends js.Object {
  /**
    * Function to call when the slider is changed.
    */
  var change: js.UndefOr[js.Function1[/* newValue */ scala.Double, scala.Unit]] = js.undefined
  /**
    * Label text.
    */
  var label: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Maximum value.
    */
  var maxValue: js.UndefOr[scala.Double] = js.undefined
  /**
    * Minimum value.
    */
  var minValue: js.UndefOr[scala.Double] = js.undefined
  /**
    * Selected value.
    */
  var value: js.UndefOr[scala.Double] = js.undefined
}

object TouchBarSliderConstructorOptions {
  @scala.inline
  def apply(
    change: js.Function1[/* newValue */ scala.Double, scala.Unit] = null,
    label: java.lang.String = null,
    maxValue: scala.Int | scala.Double = null,
    minValue: scala.Int | scala.Double = null,
    value: scala.Int | scala.Double = null
  ): TouchBarSliderConstructorOptions = {
    val __obj = js.Dynamic.literal()
    if (change != null) __obj.updateDynamic("change")(change)
    if (label != null) __obj.updateDynamic("label")(label)
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchBarSliderConstructorOptions]
  }
}

