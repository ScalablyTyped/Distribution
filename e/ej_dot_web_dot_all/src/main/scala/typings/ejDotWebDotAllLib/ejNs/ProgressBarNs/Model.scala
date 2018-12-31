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

