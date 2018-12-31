package typings
package extjsLib.ExtNs.sliderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IThumb
  extends extjsLib.ExtNs.IBase {
  /** [Config Option] (Boolean) */
  var constrain: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Disables the thumb if it is currently enabled */
  var disable: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Enables the thumb if it is currently disabled */
  var enable: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Sets up an Ext dd DragTracker for this thumb */
  var initEvents: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Renders the thumb into a slider */
  var render: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (Ext.slider.MultiSlider) */
  var slider: js.UndefOr[IMultiSlider] = js.undefined
}

