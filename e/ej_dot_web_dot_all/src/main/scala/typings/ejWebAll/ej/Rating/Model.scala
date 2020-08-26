package typings.ejWebAll.ej.Rating

import typings.ejWebAll.ej.Orientation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Enables the rating control with reset button.It can be used to reset the rating control value.
    * @Default {true}
    */
  var allowReset: js.UndefOr[Boolean] = js.native
  /** Fires when Rating value changes.
    */
  var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, Unit]] = js.native
  /** Fires when Rating control is clicked successfully.
    */
  var click: js.UndefOr[js.Function1[/* e */ ClickEventArgs, Unit]] = js.native
  /** Fires when Rating control is created.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.native
  /** Specify the CSS class to achieve custom theme.
    */
  var cssClass: js.UndefOr[String] = js.native
  /** Fires when Rating control is destroyed successfully.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.native
  /** Save current model value to browser cookies for state maintenance. While refresh the page Rating control values are retained.
    * @Default {false}
    */
  var enablePersistence: js.UndefOr[Boolean] = js.native
  /** When this property is set to false, it disables the rating control.
    * @Default {true}
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /** Specifies the height of the Rating control wrapper.
    * @Default {null}
    */
  var height: js.UndefOr[String] = js.native
  /** Specifies the list of HTML attributes to be added to rating control.
    * @Default {{}}
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.native
  /** Specifies the value to be increased while navigating between shapes(stars) in Rating control.
    * @Default {1}
    */
  var incrementStep: js.UndefOr[Double] = js.native
  /** Allow to render the maximum number of Rating shape(star).
    * @Default {5}
    */
  var maxValue: js.UndefOr[Double] = js.native
  /** Allow to render the minimum number of Rating shape(star).
    * @Default {0}
    */
  var minValue: js.UndefOr[Double] = js.native
  /** Fires when mouse move is moving the Rating control.
    */
  var mousemove: js.UndefOr[js.Function1[/* e */ MousemoveEventArgs, Unit]] = js.native
  /** Fires when mouse hover is removed from Rating control.
    */
  var mouseout: js.UndefOr[js.Function1[/* e */ MouseoutEventArgs, Unit]] = js.native
  /** Fires when mouse hovered over the Rating control.
    */
  var mouseover: js.UndefOr[js.Function1[/* e */ MouseoverEventArgs, Unit]] = js.native
  /** Specifies the orientation of Rating control. See Orientation
    * @Default {ej.Rating.Orientation.Horizontal}
    */
  var orientation: js.UndefOr[Orientation | String] = js.native
  /** Helps to provide more precise ratings.Rating control supports three precision modes - full, half, and exact. See Precision
    * @Default {full}
    */
  var precision: js.UndefOr[Precision | String] = js.native
  /** Interaction with Rating control can be prevented by enabling this API.
    * @Default {false}
    */
  var readOnly: js.UndefOr[Boolean] = js.native
  /** To specify the height of each shape in Rating control.
    * @Default {23}
    */
  var shapeHeight: js.UndefOr[Double] = js.native
  /** To specify the width of each shape in Rating control.
    * @Default {23}
    */
  var shapeWidth: js.UndefOr[Double] = js.native
  /** Enables the tooltip option.Currently selected value will be displayed in tooltip.
    * @Default {true}
    */
  var showTooltip: js.UndefOr[Boolean] = js.native
  /** To specify the number of stars to be selected while rendering.
    * @Default {1}
    */
  var value: js.UndefOr[Double] = js.native
  /** Specifies the width of the Rating control wrapper.
    * @Default {null}
    */
  var width: js.UndefOr[String] = js.native
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
    def setAllowReset(value: Boolean): Self = this.set("allowReset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowReset: Self = this.set("allowReset", js.undefined)
    @scala.inline
    def setChange(value: /* e */ ChangeEventArgs => Unit): Self = this.set("change", js.Any.fromFunction1(value))
    @scala.inline
    def deleteChange: Self = this.set("change", js.undefined)
    @scala.inline
    def setClick(value: /* e */ ClickEventArgs => Unit): Self = this.set("click", js.Any.fromFunction1(value))
    @scala.inline
    def deleteClick: Self = this.set("click", js.undefined)
    @scala.inline
    def setCreate(value: /* e */ CreateEventArgs => Unit): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    @scala.inline
    def setCssClass(value: String): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    @scala.inline
    def setDestroy(value: /* e */ DestroyEventArgs => Unit): Self = this.set("destroy", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    @scala.inline
    def setEnablePersistence(value: Boolean): Self = this.set("enablePersistence", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnablePersistence: Self = this.set("enablePersistence", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setHeight(value: String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setHtmlAttributes(value: js.Any): Self = this.set("htmlAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtmlAttributes: Self = this.set("htmlAttributes", js.undefined)
    @scala.inline
    def setIncrementStep(value: Double): Self = this.set("incrementStep", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncrementStep: Self = this.set("incrementStep", js.undefined)
    @scala.inline
    def setMaxValue(value: Double): Self = this.set("maxValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxValue: Self = this.set("maxValue", js.undefined)
    @scala.inline
    def setMinValue(value: Double): Self = this.set("minValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinValue: Self = this.set("minValue", js.undefined)
    @scala.inline
    def setMousemove(value: /* e */ MousemoveEventArgs => Unit): Self = this.set("mousemove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMousemove: Self = this.set("mousemove", js.undefined)
    @scala.inline
    def setMouseout(value: /* e */ MouseoutEventArgs => Unit): Self = this.set("mouseout", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMouseout: Self = this.set("mouseout", js.undefined)
    @scala.inline
    def setMouseover(value: /* e */ MouseoverEventArgs => Unit): Self = this.set("mouseover", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMouseover: Self = this.set("mouseover", js.undefined)
    @scala.inline
    def setOrientation(value: Orientation | String): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    @scala.inline
    def setPrecision(value: Precision | String): Self = this.set("precision", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrecision: Self = this.set("precision", js.undefined)
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    @scala.inline
    def setShapeHeight(value: Double): Self = this.set("shapeHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShapeHeight: Self = this.set("shapeHeight", js.undefined)
    @scala.inline
    def setShapeWidth(value: Double): Self = this.set("shapeWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShapeWidth: Self = this.set("shapeWidth", js.undefined)
    @scala.inline
    def setShowTooltip(value: Boolean): Self = this.set("showTooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowTooltip: Self = this.set("showTooltip", js.undefined)
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

