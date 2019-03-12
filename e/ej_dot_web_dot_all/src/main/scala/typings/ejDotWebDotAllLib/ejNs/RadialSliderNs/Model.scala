package typings
package ejDotWebDotAllLib.ejNs.RadialSliderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** To show the RadialSlider in initial render.
    * @Default {false}
    */
  var autoOpen: js.UndefOr[scala.Boolean] = js.undefined
  /** Event triggers when the change occurs.
    */
  var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, scala.Unit]] = js.undefined
  /** Event triggers when the radial slider is created.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, scala.Unit]] = js.undefined
  /** Sets the root class for RadialSlider theme. This cssClass API helps to use custom skinning option for RadialSlider control. By defining the root class using this API, we need to
    * include this root class in CSS.
    */
  var cssClass: js.UndefOr[java.lang.String] = js.undefined
  /** To enable Animation for Radial Slider.
    * @Default {true}
    */
  var enableAnimation: js.UndefOr[scala.Boolean] = js.undefined
  /** Enable/Disable the Roundoff property of RadialSlider
    * @Default {true}
    */
  var enableRoundOff: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the endAngle value for radial slider circle.
    * @Default {360}
    */
  var endAngle: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the inline for label show or not on given radius.
    * @Default {false}
    */
  var `inline`: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies innerCircleImageClass, using this property we can give images for center radial circle through CSS classes.
    * @Default {null}
    */
  var innerCircleImageClass: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the file name of center circle icon
    * @Default {null}
    */
  var innerCircleImageUrl: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the Space between the radial slider element and the label.
    * @Default {30}
    */
  var labelSpace: js.UndefOr[scala.Double] = js.undefined
  /** Change the Radial Slider ticks value based on the given culture.
    * @Default {en-US}
    */
  var locale: js.UndefOr[java.lang.String] = js.undefined
  /** Event triggers when the mouse pointer is dragged over the radial slider.
    */
  var mouseover: js.UndefOr[js.Function1[/* e */ MouseoverEventArgs, scala.Unit]] = js.undefined
  /** Specifies the radius of radial slider
    * @Default {200}
    */
  var radius: js.UndefOr[scala.Double] = js.undefined
  /** To show the RadialSlider inner circle.
    * @Default {true}
    */
  var showInnerCircle: js.UndefOr[scala.Boolean] = js.undefined
  /** Event triggers when the Radial slider slides.
    */
  var slide: js.UndefOr[js.Function1[/* e */ SlideEventArgs, scala.Unit]] = js.undefined
  /** Event triggers when the radial slider starts.
    */
  var start: js.UndefOr[js.Function1[/* e */ StartEventArgs, scala.Unit]] = js.undefined
  /** Specifies the endAngle value for radial slider circle.
    * @Default {0}
    */
  var startAngle: js.UndefOr[scala.Double] = js.undefined
  /** Event triggers when the radial slider stops.
    */
  var stop: js.UndefOr[js.Function1[/* e */ StopEventArgs, scala.Unit]] = js.undefined
  /** Specifies the  strokeWidth for customize the needle, outer circle and inner circle.
    * @Default {2}
    */
  var strokeWidth: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the ticks value of radial slider
    */
  var ticks: js.UndefOr[js.Array[_]] = js.undefined
  /** Specifies the value of radial slider
    * @Default {10}
    */
  var value: js.UndefOr[scala.Double] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    autoOpen: js.UndefOr[scala.Boolean] = js.undefined,
    change: /* e */ ChangeEventArgs => scala.Unit = null,
    create: /* e */ CreateEventArgs => scala.Unit = null,
    cssClass: java.lang.String = null,
    enableAnimation: js.UndefOr[scala.Boolean] = js.undefined,
    enableRoundOff: js.UndefOr[scala.Boolean] = js.undefined,
    endAngle: scala.Int | scala.Double = null,
    `inline`: js.UndefOr[scala.Boolean] = js.undefined,
    innerCircleImageClass: java.lang.String = null,
    innerCircleImageUrl: java.lang.String = null,
    labelSpace: scala.Int | scala.Double = null,
    locale: java.lang.String = null,
    mouseover: /* e */ MouseoverEventArgs => scala.Unit = null,
    radius: scala.Int | scala.Double = null,
    showInnerCircle: js.UndefOr[scala.Boolean] = js.undefined,
    slide: /* e */ SlideEventArgs => scala.Unit = null,
    start: /* e */ StartEventArgs => scala.Unit = null,
    startAngle: scala.Int | scala.Double = null,
    stop: /* e */ StopEventArgs => scala.Unit = null,
    strokeWidth: scala.Int | scala.Double = null,
    ticks: js.Array[_] = null,
    value: scala.Int | scala.Double = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoOpen)) __obj.updateDynamic("autoOpen")(autoOpen)
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction1(create))
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass)
    if (!js.isUndefined(enableAnimation)) __obj.updateDynamic("enableAnimation")(enableAnimation)
    if (!js.isUndefined(enableRoundOff)) __obj.updateDynamic("enableRoundOff")(enableRoundOff)
    if (endAngle != null) __obj.updateDynamic("endAngle")(endAngle.asInstanceOf[js.Any])
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`)
    if (innerCircleImageClass != null) __obj.updateDynamic("innerCircleImageClass")(innerCircleImageClass)
    if (innerCircleImageUrl != null) __obj.updateDynamic("innerCircleImageUrl")(innerCircleImageUrl)
    if (labelSpace != null) __obj.updateDynamic("labelSpace")(labelSpace.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (mouseover != null) __obj.updateDynamic("mouseover")(js.Any.fromFunction1(mouseover))
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (!js.isUndefined(showInnerCircle)) __obj.updateDynamic("showInnerCircle")(showInnerCircle)
    if (slide != null) __obj.updateDynamic("slide")(js.Any.fromFunction1(slide))
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction1(start))
    if (startAngle != null) __obj.updateDynamic("startAngle")(startAngle.asInstanceOf[js.Any])
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction1(stop))
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (ticks != null) __obj.updateDynamic("ticks")(ticks)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

