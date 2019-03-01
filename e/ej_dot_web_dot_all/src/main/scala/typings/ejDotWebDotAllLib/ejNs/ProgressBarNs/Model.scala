package typings
package ejDotWebDotAllLib.ejNs.ProgressBarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Event triggers when the progress value changed
    */
  var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, scala.Unit]] = js.undefined
  /** Event triggers when the process completes (at 100%)
    */
  var complete: js.UndefOr[js.Function1[/* e */ CompleteEventArgs, scala.Unit]] = js.undefined
  /** Event triggers when the progressbar are created
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, scala.Unit]] = js.undefined
  /** Sets the root CSS class for ProgressBar theme, which is used customize.
    * @Default {null}
    */
  var cssClass: js.UndefOr[java.lang.String] = js.undefined
  /** Event triggers when the progressbar are destroyed
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, scala.Unit]] = js.undefined
  /** Save current model value to browser cookies for state maintains. While refresh the progressBar control page retains the model value apply from browser cookies
    * @Default {false}
    */
  var enablePersistence: js.UndefOr[scala.Boolean] = js.undefined
  /** Sets the ProgressBar direction as right to left alignment.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[scala.Boolean] = js.undefined
  /** When this property sets to false, it disables the ProgressBar control
    * @Default {true}
    */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /** Defines the height of the ProgressBar.
    * @Default {null}
    */
  var height: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /** It allows to define the characteristics of the progressBar control. It will helps to extend the capability of an HTML element.
    * @Default {{}}
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.undefined
  /** Sets the maximum value of the ProgressBar.
    * @Default {100}
    */
  var maxValue: js.UndefOr[scala.Double] = js.undefined
  /** Sets the minimum value of the ProgressBar.
    * @Default {0}
    */
  var minValue: js.UndefOr[scala.Double] = js.undefined
  /** Sets the ProgressBar value in percentage. The value should be in between 0 to 100.
    * @Default {0}
    */
  var percentage: js.UndefOr[scala.Double] = js.undefined
  /** Displays rounded corner borders on the progressBar control.
    * @Default {false}
    */
  var showRoundedCorner: js.UndefOr[scala.Boolean] = js.undefined
  /** Event triggers when the process starts (from 0%)
    */
  var start: js.UndefOr[js.Function1[/* e */ StartEventArgs, scala.Unit]] = js.undefined
  /** Sets the custom text for the ProgressBar. The text placed in the middle of the ProgressBar and it can be customizable using the class 'e-progress-text'.
    * @Default {null}
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /** Sets the ProgressBar value. The value should be in between min and max values.
    * @Default {0}
    */
  var value: js.UndefOr[scala.Double] = js.undefined
  /** Defines the width of the ProgressBar.
    * @Default {null}
    */
  var width: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    change: js.Function1[/* e */ ChangeEventArgs, scala.Unit] = null,
    complete: js.Function1[/* e */ CompleteEventArgs, scala.Unit] = null,
    create: js.Function1[/* e */ CreateEventArgs, scala.Unit] = null,
    cssClass: java.lang.String = null,
    destroy: js.Function1[/* e */ DestroyEventArgs, scala.Unit] = null,
    enablePersistence: js.UndefOr[scala.Boolean] = js.undefined,
    enableRTL: js.UndefOr[scala.Boolean] = js.undefined,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    height: scala.Double | java.lang.String = null,
    htmlAttributes: js.Any = null,
    maxValue: scala.Int | scala.Double = null,
    minValue: scala.Int | scala.Double = null,
    percentage: scala.Int | scala.Double = null,
    showRoundedCorner: js.UndefOr[scala.Boolean] = js.undefined,
    start: js.Function1[/* e */ StartEventArgs, scala.Unit] = null,
    text: java.lang.String = null,
    value: scala.Int | scala.Double = null,
    width: scala.Double | java.lang.String = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (change != null) __obj.updateDynamic("change")(change)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (create != null) __obj.updateDynamic("create")(create)
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (!js.isUndefined(enablePersistence)) __obj.updateDynamic("enablePersistence")(enablePersistence)
    if (!js.isUndefined(enableRTL)) __obj.updateDynamic("enableRTL")(enableRTL)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (htmlAttributes != null) __obj.updateDynamic("htmlAttributes")(htmlAttributes)
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (percentage != null) __obj.updateDynamic("percentage")(percentage.asInstanceOf[js.Any])
    if (!js.isUndefined(showRoundedCorner)) __obj.updateDynamic("showRoundedCorner")(showRoundedCorner)
    if (start != null) __obj.updateDynamic("start")(start)
    if (text != null) __obj.updateDynamic("text")(text)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

