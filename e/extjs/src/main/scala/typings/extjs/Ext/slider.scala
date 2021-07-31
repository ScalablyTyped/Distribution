package typings.extjs.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object slider {
  
  trait IMulti
    extends StObject
       with typings.extjs.Ext.form.field.IBase {
    
    /** [Method] Creates a new thumb and adds it to the slider
      * @param value Number The initial value to set on the thumb.
      * @returns any The thumb
      */
    var addThumb: js.UndefOr[js.Function1[/* value */ js.UndefOr[Double], js.Any]] = js.undefined
    
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
    var getValue_IMulti: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], js.Any]] = js.undefined
    
    /** [Method] Returns an array of values  one for the location of each thumb
      * @returns any The set of thumb values
      */
    var getValues: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
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
    def apply(): IMulti = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IMulti]
    }
    
    @scala.inline
    implicit class IMultiMutableBuilder[Self <: IMulti] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddThumb(value: /* value */ js.UndefOr[Double] => js.Any): Self = StObject.set(x, "addThumb", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddThumbUndefined: Self = StObject.set(x, "addThumb", js.undefined)
      
      @scala.inline
      def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      @scala.inline
      def setClickToChange(value: Boolean): Self = StObject.set(x, "clickToChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClickToChangeUndefined: Self = StObject.set(x, "clickToChange", js.undefined)
      
      @scala.inline
      def setConstrainThumbs(value: Boolean): Self = StObject.set(x, "constrainThumbs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConstrainThumbsUndefined: Self = StObject.set(x, "constrainThumbs", js.undefined)
      
      @scala.inline
      def setDecimalPrecision(value: js.Any): Self = StObject.set(x, "decimalPrecision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecimalPrecisionUndefined: Self = StObject.set(x, "decimalPrecision", js.undefined)
      
      @scala.inline
      def setDragging(value: Boolean): Self = StObject.set(x, "dragging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggingUndefined: Self = StObject.set(x, "dragging", js.undefined)
      
      @scala.inline
      def setGetValue(value: /* index */ js.UndefOr[Double] => js.Any): Self = StObject.set(x, "getValue", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetValueUndefined: Self = StObject.set(x, "getValue", js.undefined)
      
      @scala.inline
      def setGetValues(value: () => js.Any): Self = StObject.set(x, "getValues", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetValuesUndefined: Self = StObject.set(x, "getValues", js.undefined)
      
      @scala.inline
      def setIncrement(value: Double): Self = StObject.set(x, "increment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncrementUndefined: Self = StObject.set(x, "increment", js.undefined)
      
      @scala.inline
      def setInitValue(value: () => Unit): Self = StObject.set(x, "initValue", js.Any.fromFunction0(value))
      
      @scala.inline
      def setInitValueUndefined: Self = StObject.set(x, "initValue", js.undefined)
      
      @scala.inline
      def setKeyIncrement(value: Double): Self = StObject.set(x, "keyIncrement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyIncrementUndefined: Self = StObject.set(x, "keyIncrement", js.undefined)
      
      @scala.inline
      def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
      
      @scala.inline
      def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
      
      @scala.inline
      def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      @scala.inline
      def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
      
      @scala.inline
      def setSetMaxValue(value: /* val */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setMaxValue", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetMaxValueUndefined: Self = StObject.set(x, "setMaxValue", js.undefined)
      
      @scala.inline
      def setSetMinValue(value: /* val */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setMinValue", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetMinValueUndefined: Self = StObject.set(x, "setMinValue", js.undefined)
      
      @scala.inline
      def setSetReadOnly(value: /* readOnly */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setReadOnly", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetReadOnlyUndefined: Self = StObject.set(x, "setReadOnly", js.undefined)
      
      @scala.inline
      def setSyncThumbs(value: () => Unit): Self = StObject.set(x, "syncThumbs", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSyncThumbsUndefined: Self = StObject.set(x, "syncThumbs", js.undefined)
      
      @scala.inline
      def setThumbs(value: Array): Self = StObject.set(x, "thumbs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbsUndefined: Self = StObject.set(x, "thumbs", js.undefined)
      
      @scala.inline
      def setTipText(value: js.Any): Self = StObject.set(x, "tipText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTipTextUndefined: Self = StObject.set(x, "tipText", js.undefined)
      
      @scala.inline
      def setUseTips(value: js.Any): Self = StObject.set(x, "useTips", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseTipsUndefined: Self = StObject.set(x, "useTips", js.undefined)
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setValues(value: Array): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      @scala.inline
      def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
      
      @scala.inline
      def setZeroBasedSnapping(value: Boolean): Self = StObject.set(x, "zeroBasedSnapping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZeroBasedSnappingUndefined: Self = StObject.set(x, "zeroBasedSnapping", js.undefined)
    }
  }
  
  trait IMultiSlider
    extends StObject
       with typings.extjs.Ext.form.field.IBase {
    
    /** [Method] Creates a new thumb and adds it to the slider
      * @param value Number The initial value to set on the thumb.
      * @returns any The thumb
      */
    var addThumb: js.UndefOr[js.Function1[/* value */ js.UndefOr[Double], js.Any]] = js.undefined
    
    /** [Config Option] (Boolean) */
    @JSName("animate")
    var animate_IMultiSlider: js.UndefOr[Boolean] = js.undefined
    
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
    var getValue_IMultiSlider: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], js.Any]] = js.undefined
    
    /** [Method] Returns an array of values  one for the location of each thumb
      * @returns any The set of thumb values
      */
    var getValues: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    /** [Config Option] (Number) */
    var increment: js.UndefOr[Double] = js.undefined
    
    /** [Method] private override */
    @JSName("initValue")
    var initValue_IMultiSlider: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Config Option] (Number) */
    var keyIncrement: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (Number) */
    var maxValue: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (Number) */
    var minValue: js.UndefOr[Double] = js.undefined
    
    /** [Method] Resets the current field value to the originally loaded value and clears any validation messages  */
    @JSName("reset")
    var reset_IMultiSlider: js.UndefOr[js.Function0[Unit]] = js.undefined
    
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
    var setReadOnly_IMultiSlider: js.UndefOr[js.Function1[/* readOnly */ js.UndefOr[js.Any], Unit]] = js.undefined
    
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
    var value_IMultiSlider: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (Number[]) */
    var values: js.UndefOr[Array] = js.undefined
    
    /** [Config Option] (Boolean) */
    var vertical: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (Boolean) */
    var zeroBasedSnapping: js.UndefOr[Boolean] = js.undefined
  }
  object IMultiSlider {
    
    @scala.inline
    def apply(): IMultiSlider = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IMultiSlider]
    }
    
    @scala.inline
    implicit class IMultiSliderMutableBuilder[Self <: IMultiSlider] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddThumb(value: /* value */ js.UndefOr[Double] => js.Any): Self = StObject.set(x, "addThumb", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddThumbUndefined: Self = StObject.set(x, "addThumb", js.undefined)
      
      @scala.inline
      def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      @scala.inline
      def setClickToChange(value: Boolean): Self = StObject.set(x, "clickToChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClickToChangeUndefined: Self = StObject.set(x, "clickToChange", js.undefined)
      
      @scala.inline
      def setConstrainThumbs(value: Boolean): Self = StObject.set(x, "constrainThumbs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConstrainThumbsUndefined: Self = StObject.set(x, "constrainThumbs", js.undefined)
      
      @scala.inline
      def setDecimalPrecision(value: js.Any): Self = StObject.set(x, "decimalPrecision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecimalPrecisionUndefined: Self = StObject.set(x, "decimalPrecision", js.undefined)
      
      @scala.inline
      def setDragging(value: Boolean): Self = StObject.set(x, "dragging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggingUndefined: Self = StObject.set(x, "dragging", js.undefined)
      
      @scala.inline
      def setGetValue(value: /* index */ js.UndefOr[Double] => js.Any): Self = StObject.set(x, "getValue", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetValueUndefined: Self = StObject.set(x, "getValue", js.undefined)
      
      @scala.inline
      def setGetValues(value: () => js.Any): Self = StObject.set(x, "getValues", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetValuesUndefined: Self = StObject.set(x, "getValues", js.undefined)
      
      @scala.inline
      def setIncrement(value: Double): Self = StObject.set(x, "increment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncrementUndefined: Self = StObject.set(x, "increment", js.undefined)
      
      @scala.inline
      def setInitValue(value: () => Unit): Self = StObject.set(x, "initValue", js.Any.fromFunction0(value))
      
      @scala.inline
      def setInitValueUndefined: Self = StObject.set(x, "initValue", js.undefined)
      
      @scala.inline
      def setKeyIncrement(value: Double): Self = StObject.set(x, "keyIncrement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyIncrementUndefined: Self = StObject.set(x, "keyIncrement", js.undefined)
      
      @scala.inline
      def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
      
      @scala.inline
      def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
      
      @scala.inline
      def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      @scala.inline
      def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
      
      @scala.inline
      def setSetMaxValue(value: /* val */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setMaxValue", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetMaxValueUndefined: Self = StObject.set(x, "setMaxValue", js.undefined)
      
      @scala.inline
      def setSetMinValue(value: /* val */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setMinValue", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetMinValueUndefined: Self = StObject.set(x, "setMinValue", js.undefined)
      
      @scala.inline
      def setSetReadOnly(value: /* readOnly */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setReadOnly", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetReadOnlyUndefined: Self = StObject.set(x, "setReadOnly", js.undefined)
      
      @scala.inline
      def setSyncThumbs(value: () => Unit): Self = StObject.set(x, "syncThumbs", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSyncThumbsUndefined: Self = StObject.set(x, "syncThumbs", js.undefined)
      
      @scala.inline
      def setThumbs(value: Array): Self = StObject.set(x, "thumbs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbsUndefined: Self = StObject.set(x, "thumbs", js.undefined)
      
      @scala.inline
      def setTipText(value: js.Any): Self = StObject.set(x, "tipText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTipTextUndefined: Self = StObject.set(x, "tipText", js.undefined)
      
      @scala.inline
      def setUseTips(value: js.Any): Self = StObject.set(x, "useTips", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseTipsUndefined: Self = StObject.set(x, "useTips", js.undefined)
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setValues(value: Array): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      @scala.inline
      def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
      
      @scala.inline
      def setZeroBasedSnapping(value: Boolean): Self = StObject.set(x, "zeroBasedSnapping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZeroBasedSnappingUndefined: Self = StObject.set(x, "zeroBasedSnapping", js.undefined)
    }
  }
  
  trait ISingle
    extends StObject
       with IMulti {
    
    /** [Method] Returns the current value of the slider
      * @returns any The current value of the slider
      */
    @JSName("getValue")
    var getValue_ISingle: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    /** [Method] Programmatically sets the value of the Slider
      * @param value Number The value to set the slider to. (This will be constrained within minValue and maxValue)
      * @param animate Boolean Turn on or off animation
      */
    @JSName("setValue")
    var setValue_ISingle: js.UndefOr[
        js.Function2[/* value */ js.UndefOr[Double], /* animate */ js.UndefOr[Boolean], Unit]
      ] = js.undefined
  }
  object ISingle {
    
    @scala.inline
    def apply(): ISingle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISingle]
    }
    
    @scala.inline
    implicit class ISingleMutableBuilder[Self <: ISingle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetValue(value: () => js.Any): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetValueUndefined: Self = StObject.set(x, "getValue", js.undefined)
      
      @scala.inline
      def setSetValue(value: (/* value */ js.UndefOr[Double], /* animate */ js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "setValue", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetValueUndefined: Self = StObject.set(x, "setValue", js.undefined)
    }
  }
  
  trait ISingleSlider
    extends StObject
       with IMulti {
    
    /** [Method] Returns the current value of the slider
      * @returns any The current value of the slider
      */
    @JSName("getValue")
    var getValue_ISingleSlider: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    /** [Method] Programmatically sets the value of the Slider
      * @param value Number The value to set the slider to. (This will be constrained within minValue and maxValue)
      * @param animate Boolean Turn on or off animation
      */
    @JSName("setValue")
    var setValue_ISingleSlider: js.UndefOr[
        js.Function2[/* value */ js.UndefOr[Double], /* animate */ js.UndefOr[Boolean], Unit]
      ] = js.undefined
  }
  object ISingleSlider {
    
    @scala.inline
    def apply(): ISingleSlider = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISingleSlider]
    }
    
    @scala.inline
    implicit class ISingleSliderMutableBuilder[Self <: ISingleSlider] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetValue(value: () => js.Any): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetValueUndefined: Self = StObject.set(x, "getValue", js.undefined)
      
      @scala.inline
      def setSetValue(value: (/* value */ js.UndefOr[Double], /* animate */ js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "setValue", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetValueUndefined: Self = StObject.set(x, "setValue", js.undefined)
    }
  }
  
  trait ISlider
    extends StObject
       with IMulti {
    
    /** [Method] Returns the current value of the slider
      * @returns any The current value of the slider
      */
    @JSName("getValue")
    var getValue_ISlider: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    /** [Method] Programmatically sets the value of the Slider
      * @param value Number The value to set the slider to. (This will be constrained within minValue and maxValue)
      * @param animate Boolean Turn on or off animation
      */
    @JSName("setValue")
    var setValue_ISlider: js.UndefOr[
        js.Function2[/* value */ js.UndefOr[Double], /* animate */ js.UndefOr[Boolean], Unit]
      ] = js.undefined
  }
  object ISlider {
    
    @scala.inline
    def apply(): typings.extjs.Ext.slider.ISlider = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.extjs.Ext.slider.ISlider]
    }
    
    @scala.inline
    implicit class ISliderMutableBuilder[Self <: typings.extjs.Ext.slider.ISlider] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetValue(value: () => js.Any): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetValueUndefined: Self = StObject.set(x, "getValue", js.undefined)
      
      @scala.inline
      def setSetValue(value: (/* value */ js.UndefOr[Double], /* animate */ js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "setValue", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetValueUndefined: Self = StObject.set(x, "setValue", js.undefined)
    }
  }
  
  trait IThumb
    extends StObject
       with IBase {
    
    /** [Config Option] (Boolean) */
    var constrain: js.UndefOr[Boolean] = js.undefined
    
    /** [Method] Disables the thumb if it is currently enabled */
    var disable: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Method] Enables the thumb if it is currently disabled */
    var enable: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Method] Sets up an Ext dd DragTracker for this thumb */
    var initEvents: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Method] Renders the thumb into a slider */
    var render: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Config Option] (Ext.slider.MultiSlider) */
    var slider: js.UndefOr[IMultiSlider] = js.undefined
  }
  object IThumb {
    
    @scala.inline
    def apply(): IThumb = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IThumb]
    }
    
    @scala.inline
    implicit class IThumbMutableBuilder[Self <: IThumb] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConstrain(value: Boolean): Self = StObject.set(x, "constrain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConstrainUndefined: Self = StObject.set(x, "constrain", js.undefined)
      
      @scala.inline
      def setDisable(value: () => Unit): Self = StObject.set(x, "disable", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
      
      @scala.inline
      def setEnable(value: () => Unit): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
      
      @scala.inline
      def setInitEvents(value: () => Unit): Self = StObject.set(x, "initEvents", js.Any.fromFunction0(value))
      
      @scala.inline
      def setInitEventsUndefined: Self = StObject.set(x, "initEvents", js.undefined)
      
      @scala.inline
      def setRender(value: () => Unit): Self = StObject.set(x, "render", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      @scala.inline
      def setSlider(value: IMultiSlider): Self = StObject.set(x, "slider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSliderUndefined: Self = StObject.set(x, "slider", js.undefined)
    }
  }
  
  trait ITip
    extends StObject
       with typings.extjs.Ext.tip.ITip {
    
    /** [Config Option] (String) */
    var align: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Method] Used to create the text that appears in the Tip s body
      * @param thumb Ext.slider.Thumb The Thumb that the Tip is attached to
      * @returns String The text to display in the tip
      */
    var getText: js.UndefOr[js.Function1[/* thumb */ js.UndefOr[IThumb], java.lang.String]] = js.undefined
    
    /** [Config Option] (Array) */
    var offsets: js.UndefOr[Array] = js.undefined
    
    /** [Config Option] (String) */
    var position: js.UndefOr[java.lang.String] = js.undefined
  }
  object ITip {
    
    @scala.inline
    def apply(): typings.extjs.Ext.slider.ITip = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.extjs.Ext.slider.ITip]
    }
    
    @scala.inline
    implicit class ITipMutableBuilder[Self <: typings.extjs.Ext.slider.ITip] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlign(value: java.lang.String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setGetText(value: /* thumb */ js.UndefOr[IThumb] => java.lang.String): Self = StObject.set(x, "getText", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetTextUndefined: Self = StObject.set(x, "getText", js.undefined)
      
      @scala.inline
      def setOffsets(value: Array): Self = StObject.set(x, "offsets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetsUndefined: Self = StObject.set(x, "offsets", js.undefined)
      
      @scala.inline
      def setPosition(value: java.lang.String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    }
  }
}
