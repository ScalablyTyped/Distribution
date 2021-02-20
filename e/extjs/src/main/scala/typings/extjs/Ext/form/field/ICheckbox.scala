package typings.extjs.Ext.form.field

import typings.extjs.Ext.IElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICheckbox extends IBase {
  
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var afterBoxLabelTextTpl: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var afterBoxLabelTpl: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var beforeBoxLabelTextTpl: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var beforeBoxLabelTpl: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (String) */
  var boxLabel: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var boxLabelAlign: js.UndefOr[String] = js.native
  
  /** [Config Option] (String/Array/Ext.XTemplate) */
  var boxLabelAttrTpl: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (String) */
  var boxLabelCls: js.UndefOr[String] = js.native
  
  /** [Property] (Ext.Element) */
  var boxLabelEl: js.UndefOr[IElement] = js.native
  
  /** [Config Option] (Boolean) */
  var checked: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (String) */
  var checkedCls: js.UndefOr[String] = js.native
  
  /** [Method] Returns the checked state of the checkbox
    * @returns Boolean True if checked, else false
    */
  @JSName("getRawValue")
  var getRawValue_ICheckbox: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the checked state of the checkbox
    * @returns Boolean True if checked, else false
    */
  @JSName("getValue")
  var getValue_ICheckbox: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Config Option] (Function) */
  var handler: js.UndefOr[js.Any] = js.native
  
  /** [Method] Initializes the field s value based on the initial config  */
  @JSName("initValue")
  var initValue_ICheckbox: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Config Option] (String) */
  var inputValue: js.UndefOr[String] = js.native
  
  /** [Method] Resets the field s originalValue property so it matches the current value
    * @param fromBoxInGroup Object
    */
  @JSName("resetOriginalValue")
  var resetOriginalValue_ICheckbox: js.UndefOr[js.Function1[/* fromBoxInGroup */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Config Option] (Object) */
  var scope: js.UndefOr[js.Any] = js.native
  
  /** [Method] Sets the boxLabel for this checkbox
    * @param boxLabel String The new label
    */
  var setBoxLabel: js.UndefOr[js.Function1[/* boxLabel */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the checked state of the checkbox
    * @param value Boolean/String/Number The following values will check the checkbox: true, 'true', '1', 1, or 'on', as well as a String that matches the inputValue. Any other value will uncheck the checkbox.
    * @returns Boolean the new checked state of the checkbox
    */
  @JSName("setRawValue")
  var setRawValue_ICheckbox: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Boolean]] = js.native
  
  /** [Method] Sets the read only state of this field
    * @param readOnly Object
    */
  @JSName("setReadOnly")
  var setReadOnly_ICheckbox: js.UndefOr[js.Function1[/* readOnly */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the checked state of the checkbox and invokes change detection
    * @param checked Boolean/String The following values will check the checkbox: true, 'true', '1', or 'on', as well as a String that matches the inputValue. Any other value will uncheck the checkbox.
    * @returns Ext.form.field.Checkbox this
    */
  @JSName("setValue")
  var setValue_ICheckbox: js.UndefOr[js.Function1[/* checked */ js.UndefOr[js.Any], this.type]] = js.native
  
  /** [Config Option] (String) */
  var uncheckedValue: js.UndefOr[String] = js.native
}
object ICheckbox {
  
  @scala.inline
  def apply(): ICheckbox = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICheckbox]
  }
  
  @scala.inline
  implicit class ICheckboxMutableBuilder[Self <: ICheckbox] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfterBoxLabelTextTpl(value: js.Any): Self = StObject.set(x, "afterBoxLabelTextTpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterBoxLabelTextTplUndefined: Self = StObject.set(x, "afterBoxLabelTextTpl", js.undefined)
    
    @scala.inline
    def setAfterBoxLabelTpl(value: js.Any): Self = StObject.set(x, "afterBoxLabelTpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterBoxLabelTplUndefined: Self = StObject.set(x, "afterBoxLabelTpl", js.undefined)
    
    @scala.inline
    def setBeforeBoxLabelTextTpl(value: js.Any): Self = StObject.set(x, "beforeBoxLabelTextTpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeBoxLabelTextTplUndefined: Self = StObject.set(x, "beforeBoxLabelTextTpl", js.undefined)
    
    @scala.inline
    def setBeforeBoxLabelTpl(value: js.Any): Self = StObject.set(x, "beforeBoxLabelTpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeBoxLabelTplUndefined: Self = StObject.set(x, "beforeBoxLabelTpl", js.undefined)
    
    @scala.inline
    def setBoxLabel(value: String): Self = StObject.set(x, "boxLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoxLabelAlign(value: String): Self = StObject.set(x, "boxLabelAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoxLabelAlignUndefined: Self = StObject.set(x, "boxLabelAlign", js.undefined)
    
    @scala.inline
    def setBoxLabelAttrTpl(value: js.Any): Self = StObject.set(x, "boxLabelAttrTpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoxLabelAttrTplUndefined: Self = StObject.set(x, "boxLabelAttrTpl", js.undefined)
    
    @scala.inline
    def setBoxLabelCls(value: String): Self = StObject.set(x, "boxLabelCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoxLabelClsUndefined: Self = StObject.set(x, "boxLabelCls", js.undefined)
    
    @scala.inline
    def setBoxLabelEl(value: IElement): Self = StObject.set(x, "boxLabelEl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoxLabelElUndefined: Self = StObject.set(x, "boxLabelEl", js.undefined)
    
    @scala.inline
    def setBoxLabelUndefined: Self = StObject.set(x, "boxLabel", js.undefined)
    
    @scala.inline
    def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckedCls(value: String): Self = StObject.set(x, "checkedCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckedClsUndefined: Self = StObject.set(x, "checkedCls", js.undefined)
    
    @scala.inline
    def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
    
    @scala.inline
    def setGetRawValue(value: () => Boolean): Self = StObject.set(x, "getRawValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRawValueUndefined: Self = StObject.set(x, "getRawValue", js.undefined)
    
    @scala.inline
    def setGetValue(value: () => Boolean): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetValueUndefined: Self = StObject.set(x, "getValue", js.undefined)
    
    @scala.inline
    def setHandler(value: js.Any): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandlerUndefined: Self = StObject.set(x, "handler", js.undefined)
    
    @scala.inline
    def setInitValue(value: () => Unit): Self = StObject.set(x, "initValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInitValueUndefined: Self = StObject.set(x, "initValue", js.undefined)
    
    @scala.inline
    def setInputValue(value: String): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputValueUndefined: Self = StObject.set(x, "inputValue", js.undefined)
    
    @scala.inline
    def setResetOriginalValue(value: /* fromBoxInGroup */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "resetOriginalValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResetOriginalValueUndefined: Self = StObject.set(x, "resetOriginalValue", js.undefined)
    
    @scala.inline
    def setScope(value: js.Any): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    @scala.inline
    def setSetBoxLabel(value: /* boxLabel */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setBoxLabel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetBoxLabelUndefined: Self = StObject.set(x, "setBoxLabel", js.undefined)
    
    @scala.inline
    def setSetRawValue(value: /* value */ js.UndefOr[js.Any] => Boolean): Self = StObject.set(x, "setRawValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetRawValueUndefined: Self = StObject.set(x, "setRawValue", js.undefined)
    
    @scala.inline
    def setSetReadOnly(value: /* readOnly */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setReadOnly", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetReadOnlyUndefined: Self = StObject.set(x, "setReadOnly", js.undefined)
    
    @scala.inline
    def setSetValue(value: /* checked */ js.UndefOr[js.Any] => ICheckbox): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetValueUndefined: Self = StObject.set(x, "setValue", js.undefined)
    
    @scala.inline
    def setUncheckedValue(value: String): Self = StObject.set(x, "uncheckedValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUncheckedValueUndefined: Self = StObject.set(x, "uncheckedValue", js.undefined)
  }
}
