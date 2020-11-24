package typings.extjs.Ext.form

import typings.extjs.Ext.IElement
import typings.extjs.Ext.form.field.IBase
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
  implicit class ICheckboxOps[Self <: ICheckbox] (val x: Self) extends AnyVal {
    
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
    def setAfterBoxLabelTextTpl(value: js.Any): Self = this.set("afterBoxLabelTextTpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAfterBoxLabelTextTpl: Self = this.set("afterBoxLabelTextTpl", js.undefined)
    
    @scala.inline
    def setAfterBoxLabelTpl(value: js.Any): Self = this.set("afterBoxLabelTpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAfterBoxLabelTpl: Self = this.set("afterBoxLabelTpl", js.undefined)
    
    @scala.inline
    def setBeforeBoxLabelTextTpl(value: js.Any): Self = this.set("beforeBoxLabelTextTpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeforeBoxLabelTextTpl: Self = this.set("beforeBoxLabelTextTpl", js.undefined)
    
    @scala.inline
    def setBeforeBoxLabelTpl(value: js.Any): Self = this.set("beforeBoxLabelTpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeforeBoxLabelTpl: Self = this.set("beforeBoxLabelTpl", js.undefined)
    
    @scala.inline
    def setBoxLabel(value: String): Self = this.set("boxLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoxLabel: Self = this.set("boxLabel", js.undefined)
    
    @scala.inline
    def setBoxLabelAlign(value: String): Self = this.set("boxLabelAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoxLabelAlign: Self = this.set("boxLabelAlign", js.undefined)
    
    @scala.inline
    def setBoxLabelAttrTpl(value: js.Any): Self = this.set("boxLabelAttrTpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoxLabelAttrTpl: Self = this.set("boxLabelAttrTpl", js.undefined)
    
    @scala.inline
    def setBoxLabelCls(value: String): Self = this.set("boxLabelCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoxLabelCls: Self = this.set("boxLabelCls", js.undefined)
    
    @scala.inline
    def setBoxLabelEl(value: IElement): Self = this.set("boxLabelEl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoxLabelEl: Self = this.set("boxLabelEl", js.undefined)
    
    @scala.inline
    def setChecked(value: Boolean): Self = this.set("checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChecked: Self = this.set("checked", js.undefined)
    
    @scala.inline
    def setCheckedCls(value: String): Self = this.set("checkedCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckedCls: Self = this.set("checkedCls", js.undefined)
    
    @scala.inline
    def setGetRawValue(value: () => Boolean): Self = this.set("getRawValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetRawValue: Self = this.set("getRawValue", js.undefined)
    
    @scala.inline
    def setGetValue(value: () => Boolean): Self = this.set("getValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetValue: Self = this.set("getValue", js.undefined)
    
    @scala.inline
    def setHandler(value: js.Any): Self = this.set("handler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandler: Self = this.set("handler", js.undefined)
    
    @scala.inline
    def setInitValue(value: () => Unit): Self = this.set("initValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteInitValue: Self = this.set("initValue", js.undefined)
    
    @scala.inline
    def setInputValue(value: String): Self = this.set("inputValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputValue: Self = this.set("inputValue", js.undefined)
    
    @scala.inline
    def setResetOriginalValue(value: /* fromBoxInGroup */ js.UndefOr[js.Any] => Unit): Self = this.set("resetOriginalValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteResetOriginalValue: Self = this.set("resetOriginalValue", js.undefined)
    
    @scala.inline
    def setScope(value: js.Any): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    
    @scala.inline
    def setSetBoxLabel(value: /* boxLabel */ js.UndefOr[String] => Unit): Self = this.set("setBoxLabel", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetBoxLabel: Self = this.set("setBoxLabel", js.undefined)
    
    @scala.inline
    def setSetRawValue(value: /* value */ js.UndefOr[js.Any] => Boolean): Self = this.set("setRawValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetRawValue: Self = this.set("setRawValue", js.undefined)
    
    @scala.inline
    def setSetReadOnly(value: /* readOnly */ js.UndefOr[js.Any] => Unit): Self = this.set("setReadOnly", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetReadOnly: Self = this.set("setReadOnly", js.undefined)
    
    @scala.inline
    def setSetValue(value: /* checked */ js.UndefOr[js.Any] => ICheckbox): Self = this.set("setValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetValue: Self = this.set("setValue", js.undefined)
    
    @scala.inline
    def setUncheckedValue(value: String): Self = this.set("uncheckedValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUncheckedValue: Self = this.set("uncheckedValue", js.undefined)
  }
}
