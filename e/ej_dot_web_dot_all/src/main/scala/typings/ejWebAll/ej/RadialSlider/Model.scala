package typings.ejWebAll.ej.RadialSlider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** To show the RadialSlider in initial render.
    * @Default {false}
    */
  var autoOpen: js.UndefOr[Boolean] = js.undefined
  /** Event triggers when the change occurs.
    */
  var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, Unit]] = js.undefined
  /** Event triggers when the radial slider is created.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.undefined
  /** Sets the root class for RadialSlider theme. This cssClass API helps to use custom skinning option for RadialSlider control. By defining the root class using this API, we need to
    * include this root class in CSS.
    */
  var cssClass: js.UndefOr[String] = js.undefined
  /** To enable Animation for Radial Slider.
    * @Default {true}
    */
  var enableAnimation: js.UndefOr[Boolean] = js.undefined
  /** Enable/Disable the Roundoff property of RadialSlider
    * @Default {true}
    */
  var enableRoundOff: js.UndefOr[Boolean] = js.undefined
  /** Specifies the endAngle value for radial slider circle.
    * @Default {360}
    */
  var endAngle: js.UndefOr[Double] = js.undefined
  /** Specifies the inline for label show or not on given radius.
    * @Default {false}
    */
  var `inline`: js.UndefOr[Boolean] = js.undefined
  /** Specifies innerCircleImageClass, using this property we can give images for center radial circle through CSS classes.
    * @Default {null}
    */
  var innerCircleImageClass: js.UndefOr[String] = js.undefined
  /** Specifies the file name of center circle icon
    * @Default {null}
    */
  var innerCircleImageUrl: js.UndefOr[String] = js.undefined
  /** Specifies the Space between the radial slider element and the label.
    * @Default {30}
    */
  var labelSpace: js.UndefOr[Double] = js.undefined
  /** Change the Radial Slider ticks value based on the given culture.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.undefined
  /** Event triggers when the mouse pointer is dragged over the radial slider.
    */
  var mouseover: js.UndefOr[js.Function1[/* e */ MouseoverEventArgs, Unit]] = js.undefined
  /** Specifies the radius of radial slider
    * @Default {200}
    */
  var radius: js.UndefOr[Double] = js.undefined
  /** To show the RadialSlider inner circle.
    * @Default {true}
    */
  var showInnerCircle: js.UndefOr[Boolean] = js.undefined
  /** Event triggers when the Radial slider slides.
    */
  var slide: js.UndefOr[js.Function1[/* e */ SlideEventArgs, Unit]] = js.undefined
  /** Event triggers when the radial slider starts.
    */
  var start: js.UndefOr[js.Function1[/* e */ StartEventArgs, Unit]] = js.undefined
  /** Specifies the endAngle value for radial slider circle.
    * @Default {0}
    */
  var startAngle: js.UndefOr[Double] = js.undefined
  /** Event triggers when the radial slider stops.
    */
  var stop: js.UndefOr[js.Function1[/* e */ StopEventArgs, Unit]] = js.undefined
  /** Specifies the  strokeWidth for customize the needle, outer circle and inner circle.
    * @Default {2}
    */
  var strokeWidth: js.UndefOr[Double] = js.undefined
  /** Specifies the ticks value of radial slider
    */
  var ticks: js.UndefOr[js.Array[_]] = js.undefined
  /** Specifies the value of radial slider
    * @Default {10}
    */
  var value: js.UndefOr[Double] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    autoOpen: js.UndefOr[Boolean] = js.undefined,
    change: /* e */ ChangeEventArgs => Unit = null,
    create: /* e */ CreateEventArgs => Unit = null,
    cssClass: String = null,
    enableAnimation: js.UndefOr[Boolean] = js.undefined,
    enableRoundOff: js.UndefOr[Boolean] = js.undefined,
    endAngle: js.UndefOr[Double] = js.undefined,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    innerCircleImageClass: String = null,
    innerCircleImageUrl: String = null,
    labelSpace: js.UndefOr[Double] = js.undefined,
    locale: String = null,
    mouseover: /* e */ MouseoverEventArgs => Unit = null,
    radius: js.UndefOr[Double] = js.undefined,
    showInnerCircle: js.UndefOr[Boolean] = js.undefined,
    slide: /* e */ SlideEventArgs => Unit = null,
    start: /* e */ StartEventArgs => Unit = null,
    startAngle: js.UndefOr[Double] = js.undefined,
    stop: /* e */ StopEventArgs => Unit = null,
    strokeWidth: js.UndefOr[Double] = js.undefined,
    ticks: js.Array[_] = null,
    value: js.UndefOr[Double] = js.undefined
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoOpen)) __obj.updateDynamic("autoOpen")(autoOpen.get.asInstanceOf[js.Any])
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction1(create))
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (!js.isUndefined(enableAnimation)) __obj.updateDynamic("enableAnimation")(enableAnimation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableRoundOff)) __obj.updateDynamic("enableRoundOff")(enableRoundOff.get.asInstanceOf[js.Any])
    if (!js.isUndefined(endAngle)) __obj.updateDynamic("endAngle")(endAngle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`.get.asInstanceOf[js.Any])
    if (innerCircleImageClass != null) __obj.updateDynamic("innerCircleImageClass")(innerCircleImageClass.asInstanceOf[js.Any])
    if (innerCircleImageUrl != null) __obj.updateDynamic("innerCircleImageUrl")(innerCircleImageUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(labelSpace)) __obj.updateDynamic("labelSpace")(labelSpace.get.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (mouseover != null) __obj.updateDynamic("mouseover")(js.Any.fromFunction1(mouseover))
    if (!js.isUndefined(radius)) __obj.updateDynamic("radius")(radius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showInnerCircle)) __obj.updateDynamic("showInnerCircle")(showInnerCircle.get.asInstanceOf[js.Any])
    if (slide != null) __obj.updateDynamic("slide")(js.Any.fromFunction1(slide))
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction1(start))
    if (!js.isUndefined(startAngle)) __obj.updateDynamic("startAngle")(startAngle.get.asInstanceOf[js.Any])
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction1(stop))
    if (!js.isUndefined(strokeWidth)) __obj.updateDynamic("strokeWidth")(strokeWidth.get.asInstanceOf[js.Any])
    if (ticks != null) __obj.updateDynamic("ticks")(ticks.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

