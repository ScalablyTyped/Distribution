package typings.extjs.Ext.slider

import typings.extjs.Ext.Array
import typings.extjs.Ext.form.field.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMulti extends IBase {
  
  /** [Method] Creates a new thumb and adds it to the slider
    * @param value Number The initial value to set on the thumb.
    * @returns any The thumb
    */
  var addThumb: js.UndefOr[js.Function1[/* value */ js.UndefOr[Double], _]] = js.native
  
  /** [Config Option] (Boolean) */
  @JSName("animate")
  var animate_IMulti: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean) */
  var clickToChange: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean) */
  var constrainThumbs: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Number/Boolean) */
  var decimalPrecision: js.UndefOr[js.Any] = js.native
  
  /** [Property] (Boolean) */
  var dragging: js.UndefOr[Boolean] = js.native
  
  /** [Method] Returns the current value of the slider
    * @param index Number The index of the thumb to return a value for
    * @returns any The current value of the slider at the given index, or an array of all thumb values if no index is given.
    */
  @JSName("getValue")
  var getValue_IMulti: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], _]] = js.native
  
  /** [Method] Returns an array of values  one for the location of each thumb
    * @returns any The set of thumb values
    */
  var getValues: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Config Option] (Number) */
  var increment: js.UndefOr[Double] = js.native
  
  /** [Method] private override */
  @JSName("initValue")
  var initValue_IMulti: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Config Option] (Number) */
  var keyIncrement: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Number) */
  var maxValue: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Number) */
  var minValue: js.UndefOr[Double] = js.native
  
  /** [Method] Resets the current field value to the originally loaded value and clears any validation messages  */
  @JSName("reset")
  var reset_IMulti: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Sets the maximum value for the slider instance
    * @param val Number The new maximum value
    */
  var setMaxValue: js.UndefOr[js.Function1[/* val */ js.UndefOr[Double], Unit]] = js.native
  
  /** [Method] Sets the minimum value for the slider instance
    * @param val Number The new minimum value
    */
  var setMinValue: js.UndefOr[js.Function1[/* val */ js.UndefOr[Double], Unit]] = js.native
  
  /** [Method] Sets the read only state of this field
    * @param readOnly Object
    */
  @JSName("setReadOnly")
  var setReadOnly_IMulti: js.UndefOr[js.Function1[/* readOnly */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Synchronizes thumbs position to the proper proportion of the total component width based on the current slider value  */
  var syncThumbs: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Property] (Array) */
  var thumbs: js.UndefOr[Array] = js.native
  
  /** [Config Option] (Function) */
  var tipText: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Object/Boolean) */
  var useTips: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Number) */
  @JSName("value")
  var value_IMulti: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Number[]) */
  var values: js.UndefOr[Array] = js.native
  
  /** [Config Option] (Boolean) */
  var vertical: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean) */
  var zeroBasedSnapping: js.UndefOr[Boolean] = js.native
}
object IMulti {
  
  @scala.inline
  def apply(): IMulti = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMulti]
  }
  
  @scala.inline
  implicit class IMultiOps[Self <: IMulti] (val x: Self) extends AnyVal {
    
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
    def setAddThumb(value: /* value */ js.UndefOr[Double] => _): Self = this.set("addThumb", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAddThumb: Self = this.set("addThumb", js.undefined)
    
    @scala.inline
    def setAnimate(value: Boolean): Self = this.set("animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimate: Self = this.set("animate", js.undefined)
    
    @scala.inline
    def setClickToChange(value: Boolean): Self = this.set("clickToChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClickToChange: Self = this.set("clickToChange", js.undefined)
    
    @scala.inline
    def setConstrainThumbs(value: Boolean): Self = this.set("constrainThumbs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConstrainThumbs: Self = this.set("constrainThumbs", js.undefined)
    
    @scala.inline
    def setDecimalPrecision(value: js.Any): Self = this.set("decimalPrecision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecimalPrecision: Self = this.set("decimalPrecision", js.undefined)
    
    @scala.inline
    def setDragging(value: Boolean): Self = this.set("dragging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragging: Self = this.set("dragging", js.undefined)
    
    @scala.inline
    def setGetValue(value: /* index */ js.UndefOr[Double] => _): Self = this.set("getValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetValue: Self = this.set("getValue", js.undefined)
    
    @scala.inline
    def setGetValues(value: () => _): Self = this.set("getValues", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetValues: Self = this.set("getValues", js.undefined)
    
    @scala.inline
    def setIncrement(value: Double): Self = this.set("increment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncrement: Self = this.set("increment", js.undefined)
    
    @scala.inline
    def setInitValue(value: () => Unit): Self = this.set("initValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteInitValue: Self = this.set("initValue", js.undefined)
    
    @scala.inline
    def setKeyIncrement(value: Double): Self = this.set("keyIncrement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyIncrement: Self = this.set("keyIncrement", js.undefined)
    
    @scala.inline
    def setMaxValue(value: Double): Self = this.set("maxValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxValue: Self = this.set("maxValue", js.undefined)
    
    @scala.inline
    def setMinValue(value: Double): Self = this.set("minValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinValue: Self = this.set("minValue", js.undefined)
    
    @scala.inline
    def setReset(value: () => Unit): Self = this.set("reset", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteReset: Self = this.set("reset", js.undefined)
    
    @scala.inline
    def setSetMaxValue(value: /* val */ js.UndefOr[Double] => Unit): Self = this.set("setMaxValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetMaxValue: Self = this.set("setMaxValue", js.undefined)
    
    @scala.inline
    def setSetMinValue(value: /* val */ js.UndefOr[Double] => Unit): Self = this.set("setMinValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetMinValue: Self = this.set("setMinValue", js.undefined)
    
    @scala.inline
    def setSetReadOnly(value: /* readOnly */ js.UndefOr[js.Any] => Unit): Self = this.set("setReadOnly", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetReadOnly: Self = this.set("setReadOnly", js.undefined)
    
    @scala.inline
    def setSyncThumbs(value: () => Unit): Self = this.set("syncThumbs", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteSyncThumbs: Self = this.set("syncThumbs", js.undefined)
    
    @scala.inline
    def setThumbs(value: Array): Self = this.set("thumbs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbs: Self = this.set("thumbs", js.undefined)
    
    @scala.inline
    def setTipText(value: js.Any): Self = this.set("tipText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTipText: Self = this.set("tipText", js.undefined)
    
    @scala.inline
    def setUseTips(value: js.Any): Self = this.set("useTips", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseTips: Self = this.set("useTips", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setValues(value: Array): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
    
    @scala.inline
    def setVertical(value: Boolean): Self = this.set("vertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVertical: Self = this.set("vertical", js.undefined)
    
    @scala.inline
    def setZeroBasedSnapping(value: Boolean): Self = this.set("zeroBasedSnapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZeroBasedSnapping: Self = this.set("zeroBasedSnapping", js.undefined)
  }
}
