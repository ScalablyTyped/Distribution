package typings.ejWebAll.ej.RadialSlider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** To show the RadialSlider in initial render.
    * @Default {false}
    */
  var autoOpen: js.UndefOr[Boolean] = js.native
  /** Event triggers when the change occurs.
    */
  var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, Unit]] = js.native
  /** Event triggers when the radial slider is created.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.native
  /** Sets the root class for RadialSlider theme. This cssClass API helps to use custom skinning option for RadialSlider control. By defining the root class using this API, we need to
    * include this root class in CSS.
    */
  var cssClass: js.UndefOr[String] = js.native
  /** To enable Animation for Radial Slider.
    * @Default {true}
    */
  var enableAnimation: js.UndefOr[Boolean] = js.native
  /** Enable/Disable the Roundoff property of RadialSlider
    * @Default {true}
    */
  var enableRoundOff: js.UndefOr[Boolean] = js.native
  /** Specifies the endAngle value for radial slider circle.
    * @Default {360}
    */
  var endAngle: js.UndefOr[Double] = js.native
  /** Specifies the inline for label show or not on given radius.
    * @Default {false}
    */
  var `inline`: js.UndefOr[Boolean] = js.native
  /** Specifies innerCircleImageClass, using this property we can give images for center radial circle through CSS classes.
    * @Default {null}
    */
  var innerCircleImageClass: js.UndefOr[String] = js.native
  /** Specifies the file name of center circle icon
    * @Default {null}
    */
  var innerCircleImageUrl: js.UndefOr[String] = js.native
  /** Specifies the Space between the radial slider element and the label.
    * @Default {30}
    */
  var labelSpace: js.UndefOr[Double] = js.native
  /** Change the Radial Slider ticks value based on the given culture.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.native
  /** Event triggers when the mouse pointer is dragged over the radial slider.
    */
  var mouseover: js.UndefOr[js.Function1[/* e */ MouseoverEventArgs, Unit]] = js.native
  /** Specifies the radius of radial slider
    * @Default {200}
    */
  var radius: js.UndefOr[Double] = js.native
  /** To show the RadialSlider inner circle.
    * @Default {true}
    */
  var showInnerCircle: js.UndefOr[Boolean] = js.native
  /** Event triggers when the Radial slider slides.
    */
  var slide: js.UndefOr[js.Function1[/* e */ SlideEventArgs, Unit]] = js.native
  /** Event triggers when the radial slider starts.
    */
  var start: js.UndefOr[js.Function1[/* e */ StartEventArgs, Unit]] = js.native
  /** Specifies the endAngle value for radial slider circle.
    * @Default {0}
    */
  var startAngle: js.UndefOr[Double] = js.native
  /** Event triggers when the radial slider stops.
    */
  var stop: js.UndefOr[js.Function1[/* e */ StopEventArgs, Unit]] = js.native
  /** Specifies the  strokeWidth for customize the needle, outer circle and inner circle.
    * @Default {2}
    */
  var strokeWidth: js.UndefOr[Double] = js.native
  /** Specifies the ticks value of radial slider
    */
  var ticks: js.UndefOr[js.Array[_]] = js.native
  /** Specifies the value of radial slider
    * @Default {10}
    */
  var value: js.UndefOr[Double] = js.native
}

object Model {
  @scala.inline
  def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAutoOpen(value: Boolean): Self = this.set("autoOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoOpen: Self = this.set("autoOpen", js.undefined)
    @scala.inline
    def setChange(value: /* e */ ChangeEventArgs => Unit): Self = this.set("change", js.Any.fromFunction1(value))
    @scala.inline
    def deleteChange: Self = this.set("change", js.undefined)
    @scala.inline
    def setCreate(value: /* e */ CreateEventArgs => Unit): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    @scala.inline
    def setCssClass(value: String): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    @scala.inline
    def setEnableAnimation(value: Boolean): Self = this.set("enableAnimation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableAnimation: Self = this.set("enableAnimation", js.undefined)
    @scala.inline
    def setEnableRoundOff(value: Boolean): Self = this.set("enableRoundOff", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableRoundOff: Self = this.set("enableRoundOff", js.undefined)
    @scala.inline
    def setEndAngle(value: Double): Self = this.set("endAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndAngle: Self = this.set("endAngle", js.undefined)
    @scala.inline
    def setInline(value: Boolean): Self = this.set("inline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInline: Self = this.set("inline", js.undefined)
    @scala.inline
    def setInnerCircleImageClass(value: String): Self = this.set("innerCircleImageClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInnerCircleImageClass: Self = this.set("innerCircleImageClass", js.undefined)
    @scala.inline
    def setInnerCircleImageUrl(value: String): Self = this.set("innerCircleImageUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInnerCircleImageUrl: Self = this.set("innerCircleImageUrl", js.undefined)
    @scala.inline
    def setLabelSpace(value: Double): Self = this.set("labelSpace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelSpace: Self = this.set("labelSpace", js.undefined)
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setMouseover(value: /* e */ MouseoverEventArgs => Unit): Self = this.set("mouseover", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMouseover: Self = this.set("mouseover", js.undefined)
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
    @scala.inline
    def setShowInnerCircle(value: Boolean): Self = this.set("showInnerCircle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowInnerCircle: Self = this.set("showInnerCircle", js.undefined)
    @scala.inline
    def setSlide(value: /* e */ SlideEventArgs => Unit): Self = this.set("slide", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSlide: Self = this.set("slide", js.undefined)
    @scala.inline
    def setStart(value: /* e */ StartEventArgs => Unit): Self = this.set("start", js.Any.fromFunction1(value))
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    @scala.inline
    def setStartAngle(value: Double): Self = this.set("startAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartAngle: Self = this.set("startAngle", js.undefined)
    @scala.inline
    def setStop(value: /* e */ StopEventArgs => Unit): Self = this.set("stop", js.Any.fromFunction1(value))
    @scala.inline
    def deleteStop: Self = this.set("stop", js.undefined)
    @scala.inline
    def setStrokeWidth(value: Double): Self = this.set("strokeWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeWidth: Self = this.set("strokeWidth", js.undefined)
    @scala.inline
    def setTicksVarargs(value: js.Any*): Self = this.set("ticks", js.Array(value :_*))
    @scala.inline
    def setTicks(value: js.Array[_]): Self = this.set("ticks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTicks: Self = this.set("ticks", js.undefined)
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

