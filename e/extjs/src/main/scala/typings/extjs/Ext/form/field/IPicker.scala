package typings.extjs.Ext.form.field

import typings.extjs.Ext.Array
import typings.extjs.Ext.IComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPicker extends ITrigger {
  
  /** [Method] Aligns the picker to the input element */
  var alignPicker: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Collapses this field s picker dropdown  */
  var collapse: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Creates and returns the component to be used as this field s picker  */
  var createPicker: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Expands this field s picker dropdown  */
  var expand: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Returns a reference to the picker component for this field creating it if necessary by calling createPicker
    * @returns Ext.Component The picker component
    */
  var getPicker: js.UndefOr[js.Function0[IComponent]] = js.native
  
  /** [Property] (Boolean) */
  var isExpanded: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean) */
  var matchFieldWidth: js.UndefOr[Boolean] = js.native
  
  /** [Method] Handles the trigger click by default toggles between expanding and collapsing the picker component  */
  @JSName("onTriggerClick")
  var onTriggerClick_IPicker: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Config Option] (String) */
  var openCls: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var pickerAlign: js.UndefOr[String] = js.native
  
  /** [Config Option] (Number[]) */
  var pickerOffset: js.UndefOr[Array] = js.native
}
object IPicker {
  
  @scala.inline
  def apply(): IPicker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPicker]
  }
  
  @scala.inline
  implicit class IPickerMutableBuilder[Self <: IPicker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignPicker(value: () => Unit): Self = StObject.set(x, "alignPicker", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAlignPickerUndefined: Self = StObject.set(x, "alignPicker", js.undefined)
    
    @scala.inline
    def setCollapse(value: () => Unit): Self = StObject.set(x, "collapse", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCollapseUndefined: Self = StObject.set(x, "collapse", js.undefined)
    
    @scala.inline
    def setCreatePicker(value: () => Unit): Self = StObject.set(x, "createPicker", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreatePickerUndefined: Self = StObject.set(x, "createPicker", js.undefined)
    
    @scala.inline
    def setExpand(value: () => Unit): Self = StObject.set(x, "expand", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
    
    @scala.inline
    def setGetPicker(value: () => IComponent): Self = StObject.set(x, "getPicker", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPickerUndefined: Self = StObject.set(x, "getPicker", js.undefined)
    
    @scala.inline
    def setIsExpanded(value: Boolean): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsExpandedUndefined: Self = StObject.set(x, "isExpanded", js.undefined)
    
    @scala.inline
    def setMatchFieldWidth(value: Boolean): Self = StObject.set(x, "matchFieldWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchFieldWidthUndefined: Self = StObject.set(x, "matchFieldWidth", js.undefined)
    
    @scala.inline
    def setOnTriggerClick(value: () => Unit): Self = StObject.set(x, "onTriggerClick", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnTriggerClickUndefined: Self = StObject.set(x, "onTriggerClick", js.undefined)
    
    @scala.inline
    def setOpenCls(value: String): Self = StObject.set(x, "openCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenClsUndefined: Self = StObject.set(x, "openCls", js.undefined)
    
    @scala.inline
    def setPickerAlign(value: String): Self = StObject.set(x, "pickerAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPickerAlignUndefined: Self = StObject.set(x, "pickerAlign", js.undefined)
    
    @scala.inline
    def setPickerOffset(value: Array): Self = StObject.set(x, "pickerOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPickerOffsetUndefined: Self = StObject.set(x, "pickerOffset", js.undefined)
  }
}
