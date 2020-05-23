package typings.ejWebAll.ej.Rating

import typings.ejWebAll.ej.Orientation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Enables the rating control with reset button.It can be used to reset the rating control value.
    * @Default {true}
    */
  var allowReset: js.UndefOr[Boolean] = js.undefined
  /** Fires when Rating value changes.
    */
  var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, Unit]] = js.undefined
  /** Fires when Rating control is clicked successfully.
    */
  var click: js.UndefOr[js.Function1[/* e */ ClickEventArgs, Unit]] = js.undefined
  /** Fires when Rating control is created.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.undefined
  /** Specify the CSS class to achieve custom theme.
    */
  var cssClass: js.UndefOr[String] = js.undefined
  /** Fires when Rating control is destroyed successfully.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.undefined
  /** Save current model value to browser cookies for state maintenance. While refresh the page Rating control values are retained.
    * @Default {false}
    */
  var enablePersistence: js.UndefOr[Boolean] = js.undefined
  /** When this property is set to false, it disables the rating control.
    * @Default {true}
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /** Specifies the height of the Rating control wrapper.
    * @Default {null}
    */
  var height: js.UndefOr[String] = js.undefined
  /** Specifies the list of HTML attributes to be added to rating control.
    * @Default {{}}
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.undefined
  /** Specifies the value to be increased while navigating between shapes(stars) in Rating control.
    * @Default {1}
    */
  var incrementStep: js.UndefOr[Double] = js.undefined
  /** Allow to render the maximum number of Rating shape(star).
    * @Default {5}
    */
  var maxValue: js.UndefOr[Double] = js.undefined
  /** Allow to render the minimum number of Rating shape(star).
    * @Default {0}
    */
  var minValue: js.UndefOr[Double] = js.undefined
  /** Fires when mouse move is moving the Rating control.
    */
  var mousemove: js.UndefOr[js.Function1[/* e */ MousemoveEventArgs, Unit]] = js.undefined
  /** Fires when mouse hover is removed from Rating control.
    */
  var mouseout: js.UndefOr[js.Function1[/* e */ MouseoutEventArgs, Unit]] = js.undefined
  /** Fires when mouse hovered over the Rating control.
    */
  var mouseover: js.UndefOr[js.Function1[/* e */ MouseoverEventArgs, Unit]] = js.undefined
  /** Specifies the orientation of Rating control. See Orientation
    * @Default {ej.Rating.Orientation.Horizontal}
    */
  var orientation: js.UndefOr[Orientation | String] = js.undefined
  /** Helps to provide more precise ratings.Rating control supports three precision modes - full, half, and exact. See Precision
    * @Default {full}
    */
  var precision: js.UndefOr[Precision | String] = js.undefined
  /** Interaction with Rating control can be prevented by enabling this API.
    * @Default {false}
    */
  var readOnly: js.UndefOr[Boolean] = js.undefined
  /** To specify the height of each shape in Rating control.
    * @Default {23}
    */
  var shapeHeight: js.UndefOr[Double] = js.undefined
  /** To specify the width of each shape in Rating control.
    * @Default {23}
    */
  var shapeWidth: js.UndefOr[Double] = js.undefined
  /** Enables the tooltip option.Currently selected value will be displayed in tooltip.
    * @Default {true}
    */
  var showTooltip: js.UndefOr[Boolean] = js.undefined
  /** To specify the number of stars to be selected while rendering.
    * @Default {1}
    */
  var value: js.UndefOr[Double] = js.undefined
  /** Specifies the width of the Rating control wrapper.
    * @Default {null}
    */
  var width: js.UndefOr[String] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    allowReset: js.UndefOr[Boolean] = js.undefined,
    change: /* e */ ChangeEventArgs => Unit = null,
    click: /* e */ ClickEventArgs => Unit = null,
    create: /* e */ CreateEventArgs => Unit = null,
    cssClass: String = null,
    destroy: /* e */ DestroyEventArgs => Unit = null,
    enablePersistence: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    height: String = null,
    htmlAttributes: js.Any = null,
    incrementStep: js.UndefOr[Double] = js.undefined,
    maxValue: js.UndefOr[Double] = js.undefined,
    minValue: js.UndefOr[Double] = js.undefined,
    mousemove: /* e */ MousemoveEventArgs => Unit = null,
    mouseout: /* e */ MouseoutEventArgs => Unit = null,
    mouseover: /* e */ MouseoverEventArgs => Unit = null,
    orientation: Orientation | String = null,
    precision: Precision | String = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    shapeHeight: js.UndefOr[Double] = js.undefined,
    shapeWidth: js.UndefOr[Double] = js.undefined,
    showTooltip: js.UndefOr[Boolean] = js.undefined,
    value: js.UndefOr[Double] = js.undefined,
    width: String = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowReset)) __obj.updateDynamic("allowReset")(allowReset.get.asInstanceOf[js.Any])
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (click != null) __obj.updateDynamic("click")(js.Any.fromFunction1(click))
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction1(create))
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction1(destroy))
    if (!js.isUndefined(enablePersistence)) __obj.updateDynamic("enablePersistence")(enablePersistence.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (htmlAttributes != null) __obj.updateDynamic("htmlAttributes")(htmlAttributes.asInstanceOf[js.Any])
    if (!js.isUndefined(incrementStep)) __obj.updateDynamic("incrementStep")(incrementStep.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxValue)) __obj.updateDynamic("maxValue")(maxValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minValue)) __obj.updateDynamic("minValue")(minValue.get.asInstanceOf[js.Any])
    if (mousemove != null) __obj.updateDynamic("mousemove")(js.Any.fromFunction1(mousemove))
    if (mouseout != null) __obj.updateDynamic("mouseout")(js.Any.fromFunction1(mouseout))
    if (mouseover != null) __obj.updateDynamic("mouseover")(js.Any.fromFunction1(mouseover))
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shapeHeight)) __obj.updateDynamic("shapeHeight")(shapeHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shapeWidth)) __obj.updateDynamic("shapeWidth")(shapeWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showTooltip)) __obj.updateDynamic("showTooltip")(showTooltip.get.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

