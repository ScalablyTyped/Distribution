package typings
package extjsLib.ExtNs.sliderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IMulti
  extends extjsLib.ExtNs.formNs.fieldNs.IBase {
  /** [Method] Creates a new thumb and adds it to the slider
  		* @param value Number The initial value to set on the thumb.
  		* @returns any The thumb
  		*/
  var addThumb: js.UndefOr[js.Function1[/* value */ js.UndefOr[scala.Double], _]] = js.undefined
  /** [Config Option] (Boolean) */
  @JSName("animate")
  var animate_IMulti: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var clickToChange: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var constrainThumbs: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Number/Boolean) */
  var decimalPrecision: js.UndefOr[js.Any] = js.undefined
  /** [Property] (Boolean) */
  var dragging: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Returns the current value of the slider
  		* @param index Number The index of the thumb to return a value for
  		* @returns any The current value of the slider at the given index, or an array of all thumb values if no index is given.
  		*/
  @JSName("getValue")
  var getValue_IMulti: js.UndefOr[js.Function1[/* index */ js.UndefOr[scala.Double], _]] = js.undefined
  /** [Method] Returns an array of values  one for the location of each thumb
  		* @returns any The set of thumb values
  		*/
  var getValues: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Config Option] (Number) */
  var increment: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var keyIncrement: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var maxValue: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var minValue: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Sets the maximum value for the slider instance
  		* @param val Number The new maximum value
  		*/
  var setMaxValue: js.UndefOr[js.Function1[/* val */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the minimum value for the slider instance
  		* @param val Number The new minimum value
  		*/
  var setMinValue: js.UndefOr[js.Function1[/* val */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the read only state of this field
  		* @param readOnly Object
  		*/
  @JSName("setReadOnly")
  var setReadOnly_IMulti: js.UndefOr[js.Function1[/* readOnly */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Synchronizes thumbs position to the proper proportion of the total component width based on the current slider value  */
  var syncThumbs: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Property] (Array) */
  var thumbs: js.UndefOr[extjsLib.ExtNs.Array] = js.undefined
  /** [Config Option] (Function) */
  var tipText: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object/Boolean) */
  var useTips: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Number) */
  var value: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number[]) */
  var values: js.UndefOr[extjsLib.ExtNs.Array] = js.undefined
  /** [Config Option] (Boolean) */
  var vertical: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var zeroBasedSnapping: js.UndefOr[scala.Boolean] = js.undefined
}

