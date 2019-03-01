package typings
package ejDotWebDotAllLib.ejNs.SliderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Specifies the allowMouseWheel of the slider.
    * @Default {false}
    */
  var allowMouseWheel: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the animationSpeed of the slider.
    * @Default {500}
    */
  var animationSpeed: js.UndefOr[scala.Double] = js.undefined
  /** Fires once Slider control value is changed successfully.
    */
  var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, scala.Unit]] = js.undefined
  /** Fires once Slider control has been created successfully.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, scala.Unit]] = js.undefined
  /** Specify the CSS class to slider to achieve custom theme.
    */
  var cssClass: js.UndefOr[java.lang.String] = js.undefined
  /** Fires when Slider control has been destroyed successfully.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, scala.Unit]] = js.undefined
  /** Specifies the animation behavior of the slider.
    * @Default {true}
    */
  var enableAnimation: js.UndefOr[scala.Boolean] = js.undefined
  /** Specify the enablePersistence to slider to save current model value to browser cookies for state maintains
    * @Default {false}
    */
  var enablePersistence: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the Right to Left Direction of the slider.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the state of the slider.
    * @Default {true}
    */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the height of the slider.
    * @Default {14}
    */
  var height: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the HTML Attributes of the ejSlider.
    * @Default {{}}
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.undefined
  /** Specifies the incremental step value of the slider.
    * @Default {1}
    */
  var incrementStep: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the distance between two major (large) ticks from the scale of the slider.
    * @Default {10}
    */
  var largeStep: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the ending value of the slider.
    * @Default {100}
    */
  var maxValue: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the starting value of the slider.
    * @Default {0}
    */
  var minValue: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the orientation of the slider.
    * @Default {ej.orientation.Horizontal}
    */
  var orientation: js.UndefOr[ejDotWebDotAllLib.ejNs.Orientation | java.lang.String] = js.undefined
  /** Specifies the readOnly of the slider.
    * @Default {false}
    */
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
  /** Fires before creating each slider scale tick. You can use this event to add custom text in tick values.
    */
  var renderingTicks: js.UndefOr[js.Function1[/* e */ RenderingTicksEventArgs, scala.Unit]] = js.undefined
  /** Shows/Hides the increment and decrement buttons of the slider.
    * @Default {false}
    */
  var showButtons: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the rounded corner behavior for slider.
    * @Default {false}
    */
  var showRoundedCorner: js.UndefOr[scala.Boolean] = js.undefined
  /** Shows/Hide the major (large) and minor (small) ticks in the scale of the slider.
    * @Default {false}
    */
  var showScale: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the small ticks from the scale of the slider.
    * @Default {true}
    */
  var showSmallTicks: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the showTooltip to shows the current Slider value, while moving the Slider handle or clicking on the slider handle of the slider.
    * @Default {true}
    */
  var showTooltip: js.UndefOr[scala.Boolean] = js.undefined
  /** Fires once Slider control is sliding successfully.
    */
  var slide: js.UndefOr[js.Function1[/* e */ SlideEventArgs, scala.Unit]] = js.undefined
  /** Specifies the sliderType of the slider.
    * @Default {ej.SliderType.Default}
    */
  var sliderType: js.UndefOr[ejDotWebDotAllLib.ejNs.sliderNs.sliderType | java.lang.String] = js.undefined
  /** Specifies the distance between two minor (small) ticks from the scale of the slider.
    * @Default {1}
    */
  var smallStep: js.UndefOr[scala.Double] = js.undefined
  /** Fires once Slider control is started successfully.
    */
  var start: js.UndefOr[js.Function1[/* e */ StartEventArgs, scala.Unit]] = js.undefined
  /** Fires when Slider control is stopped successfully.
    */
  var stop: js.UndefOr[js.Function1[/* e */ StopEventArgs, scala.Unit]] = js.undefined
  /** Fires when display the custom tooltip.
    */
  var tooltipChange: js.UndefOr[js.Function1[/* e */ TooltipChangeEventArgs, scala.Unit]] = js.undefined
  /** Specifies the value of the slider. But it's not applicable for range slider. To range slider we can use values property.
    * @Default {0}
    */
  var value: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the values of the range slider. But it's not applicable for default and minRange sliders. we can use value property for default and minRange sliders.
    * @Default {[minValue,maxValue]}
    */
  var values: js.UndefOr[js.Array[_]] = js.undefined
  /** Specifies the width of the slider.
    * @Default {100%}
    */
  var width: js.UndefOr[java.lang.String] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    allowMouseWheel: js.UndefOr[scala.Boolean] = js.undefined,
    animationSpeed: scala.Int | scala.Double = null,
    change: js.Function1[/* e */ ChangeEventArgs, scala.Unit] = null,
    create: js.Function1[/* e */ CreateEventArgs, scala.Unit] = null,
    cssClass: java.lang.String = null,
    destroy: js.Function1[/* e */ DestroyEventArgs, scala.Unit] = null,
    enableAnimation: js.UndefOr[scala.Boolean] = js.undefined,
    enablePersistence: js.UndefOr[scala.Boolean] = js.undefined,
    enableRTL: js.UndefOr[scala.Boolean] = js.undefined,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    height: java.lang.String = null,
    htmlAttributes: js.Any = null,
    incrementStep: scala.Int | scala.Double = null,
    largeStep: scala.Int | scala.Double = null,
    maxValue: scala.Int | scala.Double = null,
    minValue: scala.Int | scala.Double = null,
    orientation: ejDotWebDotAllLib.ejNs.Orientation | java.lang.String = null,
    readOnly: js.UndefOr[scala.Boolean] = js.undefined,
    renderingTicks: js.Function1[/* e */ RenderingTicksEventArgs, scala.Unit] = null,
    showButtons: js.UndefOr[scala.Boolean] = js.undefined,
    showRoundedCorner: js.UndefOr[scala.Boolean] = js.undefined,
    showScale: js.UndefOr[scala.Boolean] = js.undefined,
    showSmallTicks: js.UndefOr[scala.Boolean] = js.undefined,
    showTooltip: js.UndefOr[scala.Boolean] = js.undefined,
    slide: js.Function1[/* e */ SlideEventArgs, scala.Unit] = null,
    sliderType: ejDotWebDotAllLib.ejNs.sliderNs.sliderType | java.lang.String = null,
    smallStep: scala.Int | scala.Double = null,
    start: js.Function1[/* e */ StartEventArgs, scala.Unit] = null,
    stop: js.Function1[/* e */ StopEventArgs, scala.Unit] = null,
    tooltipChange: js.Function1[/* e */ TooltipChangeEventArgs, scala.Unit] = null,
    value: scala.Int | scala.Double = null,
    values: js.Array[_] = null,
    width: java.lang.String = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowMouseWheel)) __obj.updateDynamic("allowMouseWheel")(allowMouseWheel)
    if (animationSpeed != null) __obj.updateDynamic("animationSpeed")(animationSpeed.asInstanceOf[js.Any])
    if (change != null) __obj.updateDynamic("change")(change)
    if (create != null) __obj.updateDynamic("create")(create)
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (!js.isUndefined(enableAnimation)) __obj.updateDynamic("enableAnimation")(enableAnimation)
    if (!js.isUndefined(enablePersistence)) __obj.updateDynamic("enablePersistence")(enablePersistence)
    if (!js.isUndefined(enableRTL)) __obj.updateDynamic("enableRTL")(enableRTL)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (height != null) __obj.updateDynamic("height")(height)
    if (htmlAttributes != null) __obj.updateDynamic("htmlAttributes")(htmlAttributes)
    if (incrementStep != null) __obj.updateDynamic("incrementStep")(incrementStep.asInstanceOf[js.Any])
    if (largeStep != null) __obj.updateDynamic("largeStep")(largeStep.asInstanceOf[js.Any])
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (renderingTicks != null) __obj.updateDynamic("renderingTicks")(renderingTicks)
    if (!js.isUndefined(showButtons)) __obj.updateDynamic("showButtons")(showButtons)
    if (!js.isUndefined(showRoundedCorner)) __obj.updateDynamic("showRoundedCorner")(showRoundedCorner)
    if (!js.isUndefined(showScale)) __obj.updateDynamic("showScale")(showScale)
    if (!js.isUndefined(showSmallTicks)) __obj.updateDynamic("showSmallTicks")(showSmallTicks)
    if (!js.isUndefined(showTooltip)) __obj.updateDynamic("showTooltip")(showTooltip)
    if (slide != null) __obj.updateDynamic("slide")(slide)
    if (sliderType != null) __obj.updateDynamic("sliderType")(sliderType.asInstanceOf[js.Any])
    if (smallStep != null) __obj.updateDynamic("smallStep")(smallStep.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start)
    if (stop != null) __obj.updateDynamic("stop")(stop)
    if (tooltipChange != null) __obj.updateDynamic("tooltipChange")(tooltipChange)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values)
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[Model]
  }
}

