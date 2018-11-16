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

