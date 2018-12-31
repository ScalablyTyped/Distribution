package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TouchBarSliderConstructorOptions extends js.Object {
  /**
    * Function to call when the slider is changed.
    */
  var change: js.UndefOr[js.Function1[/* newValue */ scala.Double, scala.Unit]] = js.undefined
  /**
    * Label text.
    */
  var label: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Maximum value.
    */
  var maxValue: js.UndefOr[scala.Double] = js.undefined
  /**
    * Minimum value.
    */
  var minValue: js.UndefOr[scala.Double] = js.undefined
  /**
    * Selected value.
    */
  var value: js.UndefOr[scala.Double] = js.undefined
}

