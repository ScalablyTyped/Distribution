package typings.extjs.Ext.form.field

import typings.extjs.Ext.IElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICheckbox
  extends StObject
     with IBase {
  
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var afterBoxLabelTextTpl: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var afterBoxLabelTpl: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var beforeBoxLabelTextTpl: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var beforeBoxLabelTpl: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (String) */
  var boxLabel: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var boxLabelAlign: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var boxLabelAttrTpl: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (String) */
  var boxLabelCls: js.UndefOr[String] = js.undefined
  
  /** [Property] (Ext.Element) */
  var boxLabelEl: js.UndefOr[IElement] = js.undefined
  
  /** [Config Option] (Boolean) */
  var checked: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (String) */
  var checkedCls: js.UndefOr[String] = js.undefined
  
  /** [Method] Returns the checked state of the checkbox
    * @returns Boolean True if checked, else false
    */
  @JSName("getRawValue")
  var getRawValue_ICheckbox: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the checked state of the checkbox
    * @returns Boolean True if checked, else false
    */
  @JSName("getValue")
  var getValue_ICheckbox: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Config Option] (Function) */
  var handler: js.UndefOr[Any] = js.undefined
  
  /** [Method] Initializes the field s value based on the initial config  */
  @JSName("initValue")
  var initValue_ICheckbox: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Config Option] (String) */
  var inputValue: js.UndefOr[String] = js.undefined
  
  /** [Method] Resets the field s originalValue property so it matches the current value
    * @param fromBoxInGroup Object
    */
  @JSName("resetOriginalValue")
  var resetOriginalValue_ICheckbox: js.UndefOr[js.Function1[/* fromBoxInGroup */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Config Option] (Object) */
  var scope: js.UndefOr[Any] = js.undefined
  
  /** [Method] Sets the boxLabel for this checkbox
    * @param boxLabel String The new label
    */
  var setBoxLabel: js.UndefOr[js.Function1[/* boxLabel */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the checked state of the checkbox
    * @param value Boolean/String/Number The following values will check the checkbox: true, 'true', '1', 1, or 'on', as well as a String that matches the inputValue. Any other value will uncheck the checkbox.
    * @returns Boolean the new checked state of the checkbox
    */
  @JSName("setRawValue")
  var setRawValue_ICheckbox: js.UndefOr[js.Function1[/* value */ js.UndefOr[Any], Boolean]] = js.undefined
  
  /** [Method] Sets the read only state of this field
    * @param readOnly Object
    */
  @JSName("setReadOnly")
  var setReadOnly_ICheckbox: js.UndefOr[js.Function1[/* readOnly */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the checked state of the checkbox and invokes change detection
    * @param checked Boolean/String The following values will check the checkbox: true, 'true', '1', or 'on', as well as a String that matches the inputValue. Any other value will uncheck the checkbox.
    * @returns Ext.form.field.Checkbox this
    */
  @JSName("setValue")
  var setValue_ICheckbox: js.UndefOr[js.Function1[/* checked */ js.UndefOr[Any], this.type]] = js.undefined
  
  /** [Config Option] (String) */
  var uncheckedValue: js.UndefOr[String] = js.undefined
}
object ICheckbox {
  
  inline def apply(): ICheckbox = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICheckbox]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ICheckbox] (val x: Self) extends AnyVal {
    
    inline def setAfterBoxLabelTextTpl(value: Any): Self = StObject.set(x, "afterBoxLabelTextTpl", value.asInstanceOf[js.Any])
    
    inline def setAfterBoxLabelTextTplUndefined: Self = StObject.set(x, "afterBoxLabelTextTpl", js.undefined)
    
    inline def setAfterBoxLabelTpl(value: Any): Self = StObject.set(x, "afterBoxLabelTpl", value.asInstanceOf[js.Any])
    
    inline def setAfterBoxLabelTplUndefined: Self = StObject.set(x, "afterBoxLabelTpl", js.undefined)
    
    inline def setBeforeBoxLabelTextTpl(value: Any): Self = StObject.set(x, "beforeBoxLabelTextTpl", value.asInstanceOf[js.Any])
    
    inline def setBeforeBoxLabelTextTplUndefined: Self = StObject.set(x, "beforeBoxLabelTextTpl", js.undefined)
    
    inline def setBeforeBoxLabelTpl(value: Any): Self = StObject.set(x, "beforeBoxLabelTpl", value.asInstanceOf[js.Any])
    
    inline def setBeforeBoxLabelTplUndefined: Self = StObject.set(x, "beforeBoxLabelTpl", js.undefined)
    
    inline def setBoxLabel(value: String): Self = StObject.set(x, "boxLabel", value.asInstanceOf[js.Any])
    
    inline def setBoxLabelAlign(value: String): Self = StObject.set(x, "boxLabelAlign", value.asInstanceOf[js.Any])
    
    inline def setBoxLabelAlignUndefined: Self = StObject.set(x, "boxLabelAlign", js.undefined)
    
    inline def setBoxLabelAttrTpl(value: Any): Self = StObject.set(x, "boxLabelAttrTpl", value.asInstanceOf[js.Any])
    
    inline def setBoxLabelAttrTplUndefined: Self = StObject.set(x, "boxLabelAttrTpl", js.undefined)
    
    inline def setBoxLabelCls(value: String): Self = StObject.set(x, "boxLabelCls", value.asInstanceOf[js.Any])
    
    inline def setBoxLabelClsUndefined: Self = StObject.set(x, "boxLabelCls", js.undefined)
    
    inline def setBoxLabelEl(value: IElement): Self = StObject.set(x, "boxLabelEl", value.asInstanceOf[js.Any])
    
    inline def setBoxLabelElUndefined: Self = StObject.set(x, "boxLabelEl", js.undefined)
    
    inline def setBoxLabelUndefined: Self = StObject.set(x, "boxLabel", js.undefined)
    
    inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    inline def setCheckedCls(value: String): Self = StObject.set(x, "checkedCls", value.asInstanceOf[js.Any])
    
    inline def setCheckedClsUndefined: Self = StObject.set(x, "checkedCls", js.undefined)
    
    inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
    
    inline def setGetRawValue(value: () => Boolean): Self = StObject.set(x, "getRawValue", js.Any.fromFunction0(value))
    
    inline def setGetRawValueUndefined: Self = StObject.set(x, "getRawValue", js.undefined)
    
    inline def setGetValue(value: () => Boolean): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
    
    inline def setGetValueUndefined: Self = StObject.set(x, "getValue", js.undefined)
    
    inline def setHandler(value: Any): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
    
    inline def setHandlerUndefined: Self = StObject.set(x, "handler", js.undefined)
    
    inline def setInitValue(value: () => Unit): Self = StObject.set(x, "initValue", js.Any.fromFunction0(value))
    
    inline def setInitValueUndefined: Self = StObject.set(x, "initValue", js.undefined)
    
    inline def setInputValue(value: String): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
    
    inline def setInputValueUndefined: Self = StObject.set(x, "inputValue", js.undefined)
    
    inline def setResetOriginalValue(value: /* fromBoxInGroup */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "resetOriginalValue", js.Any.fromFunction1(value))
    
    inline def setResetOriginalValueUndefined: Self = StObject.set(x, "resetOriginalValue", js.undefined)
    
    inline def setScope(value: Any): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setSetBoxLabel(value: /* boxLabel */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setBoxLabel", js.Any.fromFunction1(value))
    
    inline def setSetBoxLabelUndefined: Self = StObject.set(x, "setBoxLabel", js.undefined)
    
    inline def setSetRawValue(value: /* value */ js.UndefOr[Any] => Boolean): Self = StObject.set(x, "setRawValue", js.Any.fromFunction1(value))
    
    inline def setSetRawValueUndefined: Self = StObject.set(x, "setRawValue", js.undefined)
    
    inline def setSetReadOnly(value: /* readOnly */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setReadOnly", js.Any.fromFunction1(value))
    
    inline def setSetReadOnlyUndefined: Self = StObject.set(x, "setReadOnly", js.undefined)
    
    inline def setSetValue(value: /* checked */ js.UndefOr[Any] => ICheckbox): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
    
    inline def setSetValueUndefined: Self = StObject.set(x, "setValue", js.undefined)
    
    inline def setUncheckedValue(value: String): Self = StObject.set(x, "uncheckedValue", value.asInstanceOf[js.Any])
    
    inline def setUncheckedValueUndefined: Self = StObject.set(x, "uncheckedValue", js.undefined)
  }
}
