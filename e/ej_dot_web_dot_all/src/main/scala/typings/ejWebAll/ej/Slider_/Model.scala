package typings.ejWebAll.ej.Slider_

import typings.ejWebAll.ej.Orientation
import typings.ejWebAll.ej.slider.sliderType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Specifies the allowMouseWheel of the slider.
    * @Default {false}
    */
  var allowMouseWheel: js.UndefOr[Boolean] = js.undefined
  /** Specifies the animationSpeed of the slider.
    * @Default {500}
    */
  var animationSpeed: js.UndefOr[Double] = js.undefined
  /** Fires once Slider control value is changed successfully.
    */
  var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, Unit]] = js.undefined
  /** Fires once Slider control has been created successfully.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.undefined
  /** Specify the CSS class to slider to achieve custom theme.
    */
  var cssClass: js.UndefOr[String] = js.undefined
  /** Fires when Slider control has been destroyed successfully.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.undefined
  /** Specifies the animation behavior of the slider.
    * @Default {true}
    */
  var enableAnimation: js.UndefOr[Boolean] = js.undefined
  /** Specify the enablePersistence to slider to save current model value to browser cookies for state maintains
    * @Default {false}
    */
  var enablePersistence: js.UndefOr[Boolean] = js.undefined
  /** Specifies the Right to Left Direction of the slider.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.undefined
  /** Specifies the state of the slider.
    * @Default {true}
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /** Specifies the height of the slider.
    * @Default {14}
    */
  var height: js.UndefOr[String] = js.undefined
  /** Specifies the HTML Attributes of the ejSlider.
    * @Default {{}}
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.undefined
  /** Specifies the incremental step value of the slider.
    * @Default {1}
    */
  var incrementStep: js.UndefOr[Double] = js.undefined
  /** Specifies the distance between two major (large) ticks from the scale of the slider.
    * @Default {10}
    */
  var largeStep: js.UndefOr[Double] = js.undefined
  /** Specifies the ending value of the slider.
    * @Default {100}
    */
  var maxValue: js.UndefOr[Double] = js.undefined
  /** Specifies the starting value of the slider.
    * @Default {0}
    */
  var minValue: js.UndefOr[Double] = js.undefined
  /** Specifies the orientation of the slider.
    * @Default {ej.orientation.Horizontal}
    */
  var orientation: js.UndefOr[Orientation | String] = js.undefined
  /** Specifies the readOnly of the slider.
    * @Default {false}
    */
  var readOnly: js.UndefOr[Boolean] = js.undefined
  /** Fires before creating each slider scale tick. You can use this event to add custom text in tick values.
    */
  var renderingTicks: js.UndefOr[js.Function1[/* e */ RenderingTicksEventArgs, Unit]] = js.undefined
  /** Shows/Hides the increment and decrement buttons of the slider.
    * @Default {false}
    */
  var showButtons: js.UndefOr[Boolean] = js.undefined
  /** Specifies the rounded corner behavior for slider.
    * @Default {false}
    */
  var showRoundedCorner: js.UndefOr[Boolean] = js.undefined
  /** Shows/Hide the major (large) and minor (small) ticks in the scale of the slider.
    * @Default {false}
    */
  var showScale: js.UndefOr[Boolean] = js.undefined
  /** Specifies the small ticks from the scale of the slider.
    * @Default {true}
    */
  var showSmallTicks: js.UndefOr[Boolean] = js.undefined
  /** Specifies the showTooltip to shows the current Slider value, while moving the Slider handle or clicking on the slider handle of the slider.
    * @Default {true}
    */
  var showTooltip: js.UndefOr[Boolean] = js.undefined
  /** Fires once Slider control is sliding successfully.
    */
  var slide: js.UndefOr[js.Function1[/* e */ SlideEventArgs, Unit]] = js.undefined
  /** Specifies the sliderType of the slider.
    * @Default {ej.SliderType.Default}
    */
  var sliderType: js.UndefOr[typings.ejWebAll.ej.slider.sliderType | String] = js.undefined
  /** Specifies the distance between two minor (small) ticks from the scale of the slider.
    * @Default {1}
    */
  var smallStep: js.UndefOr[Double] = js.undefined
  /** Fires once Slider control is started successfully.
    */
  var start: js.UndefOr[js.Function1[/* e */ StartEventArgs, Unit]] = js.undefined
  /** Fires when Slider control is stopped successfully.
    */
  var stop: js.UndefOr[js.Function1[/* e */ StopEventArgs, Unit]] = js.undefined
  /** Fires when display the custom tooltip.
    */
  var tooltipChange: js.UndefOr[js.Function1[/* e */ TooltipChangeEventArgs, Unit]] = js.undefined
  /** Specifies the value of the slider. But it's not applicable for range slider. To range slider we can use values property.
    * @Default {0}
    */
  var value: js.UndefOr[Double] = js.undefined
  /** Specifies the values of the range slider. But it's not applicable for default and minRange sliders. we can use value property for default and minRange sliders.
    * @Default {[minValue,maxValue]}
    */
  var values: js.UndefOr[js.Array[_]] = js.undefined
  /** Specifies the width of the slider.
    * @Default {100%}
    */
  var width: js.UndefOr[String] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    allowMouseWheel: js.UndefOr[Boolean] = js.undefined,
    animationSpeed: js.UndefOr[Double] = js.undefined,
    change: /* e */ ChangeEventArgs => Unit = null,
    create: /* e */ CreateEventArgs => Unit = null,
    cssClass: String = null,
    destroy: /* e */ DestroyEventArgs => Unit = null,
    enableAnimation: js.UndefOr[Boolean] = js.undefined,
    enablePersistence: js.UndefOr[Boolean] = js.undefined,
    enableRTL: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    height: String = null,
    htmlAttributes: js.Any = null,
    incrementStep: js.UndefOr[Double] = js.undefined,
    largeStep: js.UndefOr[Double] = js.undefined,
    maxValue: js.UndefOr[Double] = js.undefined,
    minValue: js.UndefOr[Double] = js.undefined,
    orientation: Orientation | String = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    renderingTicks: /* e */ RenderingTicksEventArgs => Unit = null,
    showButtons: js.UndefOr[Boolean] = js.undefined,
    showRoundedCorner: js.UndefOr[Boolean] = js.undefined,
    showScale: js.UndefOr[Boolean] = js.undefined,
    showSmallTicks: js.UndefOr[Boolean] = js.undefined,
    showTooltip: js.UndefOr[Boolean] = js.undefined,
    slide: /* e */ SlideEventArgs => Unit = null,
    sliderType: sliderType | String = null,
    smallStep: js.UndefOr[Double] = js.undefined,
    start: /* e */ StartEventArgs => Unit = null,
    stop: /* e */ StopEventArgs => Unit = null,
    tooltipChange: /* e */ TooltipChangeEventArgs => Unit = null,
    value: js.UndefOr[Double] = js.undefined,
    values: js.Array[_] = null,
    width: String = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowMouseWheel)) __obj.updateDynamic("allowMouseWheel")(allowMouseWheel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(animationSpeed)) __obj.updateDynamic("animationSpeed")(animationSpeed.get.asInstanceOf[js.Any])
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction1(create))
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction1(destroy))
    if (!js.isUndefined(enableAnimation)) __obj.updateDynamic("enableAnimation")(enableAnimation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enablePersistence)) __obj.updateDynamic("enablePersistence")(enablePersistence.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableRTL)) __obj.updateDynamic("enableRTL")(enableRTL.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (htmlAttributes != null) __obj.updateDynamic("htmlAttributes")(htmlAttributes.asInstanceOf[js.Any])
    if (!js.isUndefined(incrementStep)) __obj.updateDynamic("incrementStep")(incrementStep.get.asInstanceOf[js.Any])
    if (!js.isUndefined(largeStep)) __obj.updateDynamic("largeStep")(largeStep.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxValue)) __obj.updateDynamic("maxValue")(maxValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minValue)) __obj.updateDynamic("minValue")(minValue.get.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.get.asInstanceOf[js.Any])
    if (renderingTicks != null) __obj.updateDynamic("renderingTicks")(js.Any.fromFunction1(renderingTicks))
    if (!js.isUndefined(showButtons)) __obj.updateDynamic("showButtons")(showButtons.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showRoundedCorner)) __obj.updateDynamic("showRoundedCorner")(showRoundedCorner.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showScale)) __obj.updateDynamic("showScale")(showScale.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showSmallTicks)) __obj.updateDynamic("showSmallTicks")(showSmallTicks.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showTooltip)) __obj.updateDynamic("showTooltip")(showTooltip.get.asInstanceOf[js.Any])
    if (slide != null) __obj.updateDynamic("slide")(js.Any.fromFunction1(slide))
    if (sliderType != null) __obj.updateDynamic("sliderType")(sliderType.asInstanceOf[js.Any])
    if (!js.isUndefined(smallStep)) __obj.updateDynamic("smallStep")(smallStep.get.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction1(start))
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction1(stop))
    if (tooltipChange != null) __obj.updateDynamic("tooltipChange")(js.Any.fromFunction1(tooltipChange))
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

