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

