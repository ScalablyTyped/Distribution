package typings.ejDotWebDotAll.ej.ProgressBar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Event triggers when the progress value changed
    */
  var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, Unit]] = js.undefined
  /** Event triggers when the process completes (at 100%)
    */
  var complete: js.UndefOr[js.Function1[/* e */ CompleteEventArgs, Unit]] = js.undefined
  /** Event triggers when the progressbar are created
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.undefined
  /** Sets the root CSS class for ProgressBar theme, which is used customize.
    * @Default {null}
    */
  var cssClass: js.UndefOr[String] = js.undefined
  /** Event triggers when the progressbar are destroyed
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.undefined
  /** Save current model value to browser cookies for state maintains. While refresh the progressBar control page retains the model value apply from browser cookies
    * @Default {false}
    */
  var enablePersistence: js.UndefOr[Boolean] = js.undefined
  /** Sets the ProgressBar direction as right to left alignment.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.undefined
  /** When this property sets to false, it disables the ProgressBar control
    * @Default {true}
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /** Defines the height of the ProgressBar.
    * @Default {null}
    */
  var height: js.UndefOr[Double | String] = js.undefined
  /** It allows to define the characteristics of the progressBar control. It will helps to extend the capability of an HTML element.
    * @Default {{}}
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.undefined
  /** Sets the maximum value of the ProgressBar.
    * @Default {100}
    */
  var maxValue: js.UndefOr[Double] = js.undefined
  /** Sets the minimum value of the ProgressBar.
    * @Default {0}
    */
  var minValue: js.UndefOr[Double] = js.undefined
  /** Sets the ProgressBar value in percentage. The value should be in between 0 to 100.
    * @Default {0}
    */
  var percentage: js.UndefOr[Double] = js.undefined
  /** Displays rounded corner borders on the progressBar control.
    * @Default {false}
    */
  var showRoundedCorner: js.UndefOr[Boolean] = js.undefined
  /** Event triggers when the process starts (from 0%)
    */
  var start: js.UndefOr[js.Function1[/* e */ StartEventArgs, Unit]] = js.undefined
  /** Sets the custom text for the ProgressBar. The text placed in the middle of the ProgressBar and it can be customizable using the class 'e-progress-text'.
    * @Default {null}
    */
  var text: js.UndefOr[String] = js.undefined
  /** Sets the ProgressBar value. The value should be in between min and max values.
    * @Default {0}
    */
  var value: js.UndefOr[Double] = js.undefined
  /** Defines the width of the ProgressBar.
    * @Default {null}
    */
  var width: js.UndefOr[Double | String] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    change: /* e */ ChangeEventArgs => Unit = null,
    complete: /* e */ CompleteEventArgs => Unit = null,
    create: /* e */ CreateEventArgs => Unit = null,
    cssClass: String = null,
    destroy: /* e */ DestroyEventArgs => Unit = null,
    enablePersistence: js.UndefOr[Boolean] = js.undefined,
    enableRTL: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    height: Double | String = null,
    htmlAttributes: js.Any = null,
    maxValue: Int | Double = null,
    minValue: Int | Double = null,
    percentage: Int | Double = null,
    showRoundedCorner: js.UndefOr[Boolean] = js.undefined,
    start: /* e */ StartEventArgs => Unit = null,
    text: String = null,
    value: Int | Double = null,
    width: Double | String = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction1(create))
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction1(destroy))
    if (!js.isUndefined(enablePersistence)) __obj.updateDynamic("enablePersistence")(enablePersistence.asInstanceOf[js.Any])
    if (!js.isUndefined(enableRTL)) __obj.updateDynamic("enableRTL")(enableRTL.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (htmlAttributes != null) __obj.updateDynamic("htmlAttributes")(htmlAttributes.asInstanceOf[js.Any])
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (percentage != null) __obj.updateDynamic("percentage")(percentage.asInstanceOf[js.Any])
    if (!js.isUndefined(showRoundedCorner)) __obj.updateDynamic("showRoundedCorner")(showRoundedCorner.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction1(start))
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

