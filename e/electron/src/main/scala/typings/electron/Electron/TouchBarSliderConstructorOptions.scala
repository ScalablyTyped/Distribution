package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TouchBarSliderConstructorOptions extends js.Object {
  /**
    * Function to call when the slider is changed.
    */
  var change: js.UndefOr[js.Function1[/* newValue */ Double, Unit]] = js.undefined
  /**
    * Label text.
    */
  var label: js.UndefOr[String] = js.undefined
  /**
    * Maximum value.
    */
  var maxValue: js.UndefOr[Double] = js.undefined
  /**
    * Minimum value.
    */
  var minValue: js.UndefOr[Double] = js.undefined
  /**
    * Selected value.
    */
  var value: js.UndefOr[Double] = js.undefined
}

object TouchBarSliderConstructorOptions {
  @scala.inline
  def apply(
    change: /* newValue */ Double => Unit = null,
    label: String = null,
    maxValue: Int | Double = null,
    minValue: Int | Double = null,
    value: Int | Double = null
  ): TouchBarSliderConstructorOptions = {
    val __obj = js.Dynamic.literal()
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchBarSliderConstructorOptions]
  }
}

