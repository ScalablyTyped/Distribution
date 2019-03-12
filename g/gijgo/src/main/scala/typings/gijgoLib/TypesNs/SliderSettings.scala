package typings
package gijgoLib.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Slider
trait SliderSettings extends js.Object {
  //Events
  var change: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  var min: js.UndefOr[scala.Double] = js.undefined
  var slide: js.UndefOr[js.Function2[/* e */ js.Any, /* value */ scala.Double, _]] = js.undefined
  var uiLibrary: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object SliderSettings {
  @scala.inline
  def apply(
    change: /* e */ js.Any => _ = null,
    max: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null,
    slide: (/* e */ js.Any, /* value */ scala.Double) => _ = null,
    uiLibrary: java.lang.String = null,
    value: java.lang.String = null,
    width: scala.Int | scala.Double = null
  ): SliderSettings = {
    val __obj = js.Dynamic.literal()
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (slide != null) __obj.updateDynamic("slide")(js.Any.fromFunction2(slide))
    if (uiLibrary != null) __obj.updateDynamic("uiLibrary")(uiLibrary)
    if (value != null) __obj.updateDynamic("value")(value)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderSettings]
  }
}

