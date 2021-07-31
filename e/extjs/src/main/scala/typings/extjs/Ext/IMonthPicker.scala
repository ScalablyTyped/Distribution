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
  var setValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], IMonth]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var showButtons: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Date/Number[]) */
  var value: js.UndefOr[js.Any] = js.undefined
}
object IMonthPicker {
  
  @scala.inline
  def apply(): IMonthPicker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMonthPicker]
  }
  
  @scala.inline
  implicit class IMonthPickerMutableBuilder[Self <: IMonthPicker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdjustYear(value: /* offset */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "adjustYear", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAdjustYearUndefined: Self = StObject.set(x, "adjustYear", js.undefined)
    
    @scala.inline
    def setCancelText(value: java.lang.String): Self = StObject.set(x, "cancelText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelTextUndefined: Self = StObject.set(x, "cancelText", js.undefined)
    
    @scala.inline
    def setGetValue(value: () => Array): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetValueUndefined: Self = StObject.set(x, "getValue", js.undefined)
    
    @scala.inline
    def setHasSelection(value: () => Boolean): Self = StObject.set(x, "hasSelection", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasSelectionUndefined: Self = StObject.set(x, "hasSelection", js.undefined)
    
    @scala.inline
    def setOkText(value: java.lang.String): Self = StObject.set(x, "okText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOkTextUndefined: Self = StObject.set(x, "okText", js.undefined)
    
    @scala.inline
    def setSelectedCls(value: java.lang.String): Self = StObject.set(x, "selectedCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedClsUndefined: Self = StObject.set(x, "selectedCls", js.undefined)
    
    @scala.inline
    def setSetValue(value: /* value */ js.UndefOr[js.Any] => IMonth): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetValueUndefined: Self = StObject.set(x, "setValue", js.undefined)
    
    @scala.inline
    def setShowButtons(value: Boolean): Self = StObject.set(x, "showButtons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowButtonsUndefined: Self = StObject.set(x, "showButtons", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
