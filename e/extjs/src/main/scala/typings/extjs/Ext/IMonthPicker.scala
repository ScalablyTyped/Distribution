package typings.extjs.Ext

import typings.extjs.Ext.picker.IMonth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMonthPicker
  extends StObject
     with IComponent {
  
  /** [Method] Modify the year display by passing an offset
    * @param offset Number The offset to move by.
    */
  var adjustYear: js.UndefOr[js.Function1[/* offset */ js.UndefOr[Double], Unit]] = js.undefined
  
  /** [Config Option] (String) */
  var cancelText: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Method] Gets the selected value
    * @returns Number[] The selected value
    */
  var getValue: js.UndefOr[js.Function0[Array]] = js.undefined
  
  /** [Method] Checks whether the picker has a selection
    * @returns Boolean Returns true if both a month and year have been selected
    */
  var hasSelection: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Config Option] (String) */
  var okText: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Config Option] (String) */
  var selectedCls: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Method] Set the value for the picker
    * @param value Date/Number[] The value to set. It can be a Date object, where the month/year will be extracted, or it can be an array, with the month as the first index and the year as the second.
    * @returns Ext.picker.Month this
    */
  var setValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[Any], IMonth]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var showButtons: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Date/Number[]) */
  var value: js.UndefOr[Any] = js.undefined
}
object IMonthPicker {
  
  inline def apply(): IMonthPicker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMonthPicker]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IMonthPicker] (val x: Self) extends AnyVal {
    
    inline def setAdjustYear(value: /* offset */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "adjustYear", js.Any.fromFunction1(value))
    
    inline def setAdjustYearUndefined: Self = StObject.set(x, "adjustYear", js.undefined)
    
    inline def setCancelText(value: java.lang.String): Self = StObject.set(x, "cancelText", value.asInstanceOf[js.Any])
    
    inline def setCancelTextUndefined: Self = StObject.set(x, "cancelText", js.undefined)
    
    inline def setGetValue(value: () => Array): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
    
    inline def setGetValueUndefined: Self = StObject.set(x, "getValue", js.undefined)
    
    inline def setHasSelection(value: () => Boolean): Self = StObject.set(x, "hasSelection", js.Any.fromFunction0(value))
    
    inline def setHasSelectionUndefined: Self = StObject.set(x, "hasSelection", js.undefined)
    
    inline def setOkText(value: java.lang.String): Self = StObject.set(x, "okText", value.asInstanceOf[js.Any])
    
    inline def setOkTextUndefined: Self = StObject.set(x, "okText", js.undefined)
    
    inline def setSelectedCls(value: java.lang.String): Self = StObject.set(x, "selectedCls", value.asInstanceOf[js.Any])
    
    inline def setSelectedClsUndefined: Self = StObject.set(x, "selectedCls", js.undefined)
    
    inline def setSetValue(value: /* value */ js.UndefOr[Any] => IMonth): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
    
    inline def setSetValueUndefined: Self = StObject.set(x, "setValue", js.undefined)
    
    inline def setShowButtons(value: Boolean): Self = StObject.set(x, "showButtons", value.asInstanceOf[js.Any])
    
    inline def setShowButtonsUndefined: Self = StObject.set(x, "showButtons", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
