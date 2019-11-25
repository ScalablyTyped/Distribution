package typings.extjs.Ext.slider

import typings.extjs.Ext.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMulti
  extends typings.extjs.Ext.form.field.IBase {
  /** [Method] Creates a new thumb and adds it to the slider
  		* @param value Number The initial value to set on the thumb.
  		* @returns any The thumb
  		*/
  var addThumb: js.UndefOr[js.Function1[/* value */ js.UndefOr[Double], _]] = js.undefined
  /** [Config Option] (Boolean) */
  @JSName("animate")
  var animate_IMulti: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var clickToChange: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var constrainThumbs: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Number/Boolean) */
  var decimalPrecision: js.UndefOr[js.Any] = js.undefined
  /** [Property] (Boolean) */
  var dragging: js.UndefOr[Boolean] = js.undefined
  /** [Method] Returns the current value of the slider
  		* @param index Number The index of the thumb to return a value for
  		* @returns any The current value of the slider at the given index, or an array of all thumb values if no index is given.
  		*/
  @JSName("getValue")
  var getValue_IMulti: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], _]] = js.undefined
  /** [Method] Returns an array of values  one for the location of each thumb
  		* @returns any The set of thumb values
  		*/
  var getValues: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Config Option] (Number) */
  var increment: js.UndefOr[Double] = js.undefined
  /** [Method] private override */
  @JSName("initValue")
  var initValue_IMulti: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Number) */
  var keyIncrement: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Number) */
  var maxValue: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Number) */
  var minValue: js.UndefOr[Double] = js.undefined
  /** [Method] Resets the current field value to the originally loaded value and clears any validation messages  */
  @JSName("reset")
  var reset_IMulti: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Sets the maximum value for the slider instance
  		* @param val Number The new maximum value
  		*/
  var setMaxValue: js.UndefOr[js.Function1[/* val */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the minimum value for the slider instance
  		* @param val Number The new minimum value
  		*/
  var setMinValue: js.UndefOr[js.Function1[/* val */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the read only state of this field
  		* @param readOnly Object
  		*/
  @JSName("setReadOnly")
  var setReadOnly_IMulti: js.UndefOr[js.Function1[/* readOnly */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Synchronizes thumbs position to the proper proportion of the total component width based on the current slider value  */
  var syncThumbs: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Property] (Array) */
  var thumbs: js.UndefOr[Array] = js.undefined
  /** [Config Option] (Function) */
  var tipText: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object/Boolean) */
  var useTips: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Number) */
  @JSName("value")
  var value_IMulti: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Number[]) */
  var values: js.UndefOr[Array] = js.undefined
  /** [Config Option] (Boolean) */
  var vertical: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var zeroBasedSnapping: js.UndefOr[Boolean] = js.undefined
}

object IMulti {
  @scala.inline
  def apply(
    IBase: typings.extjs.Ext.form.field.IBase = null,
    addThumb: /* value */ js.UndefOr[Double] => _ = null,
    animate: js.UndefOr[Boolean] = js.undefined,
    clickToChange: js.UndefOr[Boolean] = js.undefined,
    constrainThumbs: js.UndefOr[Boolean] = js.undefined,
    decimalPrecision: js.Any = null,
    dragging: js.UndefOr[Boolean] = js.undefined,
    getValue: /* index */ js.UndefOr[Double] => _ = null,
    getValues: () => _ = null,
    increment: Int | Double = null,
    initValue: () => Unit = null,
    keyIncrement: Int | Double = null,
    maxValue: Int | Double = null,
    minValue: Int | Double = null,
    reset: () => Unit = null,
    setMaxValue: /* val */ js.UndefOr[Double] => Unit = null,
    setMinValue: /* val */ js.UndefOr[Double] => Unit = null,
    setReadOnly: /* readOnly */ js.UndefOr[js.Any] => Unit = null,
    syncThumbs: () => Unit = null,
    thumbs: Array = null,
    tipText: js.Any = null,
    useTips: js.Any = null,
    value: Int | Double = null,
    values: Array = null,
    vertical: js.UndefOr[Boolean] = js.undefined,
    zeroBasedSnapping: js.UndefOr[Boolean] = js.undefined
  ): IMulti = {
    val __obj = js.Dynamic.literal()
    if (IBase != null) js.Dynamic.global.Object.assign(__obj, IBase)
    if (addThumb != null) __obj.updateDynamic("addThumb")(js.Any.fromFunction1(addThumb))
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (!js.isUndefined(clickToChange)) __obj.updateDynamic("clickToChange")(clickToChange.asInstanceOf[js.Any])
    if (!js.isUndefined(constrainThumbs)) __obj.updateDynamic("constrainThumbs")(constrainThumbs.asInstanceOf[js.Any])
    if (decimalPrecision != null) __obj.updateDynamic("decimalPrecision")(decimalPrecision.asInstanceOf[js.Any])
    if (!js.isUndefined(dragging)) __obj.updateDynamic("dragging")(dragging.asInstanceOf[js.Any])
    if (getValue != null) __obj.updateDynamic("getValue")(js.Any.fromFunction1(getValue))
    if (getValues != null) __obj.updateDynamic("getValues")(js.Any.fromFunction0(getValues))
    if (increment != null) __obj.updateDynamic("increment")(increment.asInstanceOf[js.Any])
    if (initValue != null) __obj.updateDynamic("initValue")(js.Any.fromFunction0(initValue))
    if (keyIncrement != null) __obj.updateDynamic("keyIncrement")(keyIncrement.asInstanceOf[js.Any])
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (reset != null) __obj.updateDynamic("reset")(js.Any.fromFunction0(reset))
    if (setMaxValue != null) __obj.updateDynamic("setMaxValue")(js.Any.fromFunction1(setMaxValue))
    if (setMinValue != null) __obj.updateDynamic("setMinValue")(js.Any.fromFunction1(setMinValue))
    if (setReadOnly != null) __obj.updateDynamic("setReadOnly")(js.Any.fromFunction1(setReadOnly))
    if (syncThumbs != null) __obj.updateDynamic("syncThumbs")(js.Any.fromFunction0(syncThumbs))
    if (thumbs != null) __obj.updateDynamic("thumbs")(thumbs.asInstanceOf[js.Any])
    if (tipText != null) __obj.updateDynamic("tipText")(tipText.asInstanceOf[js.Any])
    if (useTips != null) __obj.updateDynamic("useTips")(useTips.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    if (!js.isUndefined(zeroBasedSnapping)) __obj.updateDynamic("zeroBasedSnapping")(zeroBasedSnapping.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMulti]
  }
}

