package typings.extjs.Ext.form.field

import typings.extjs.Ext.Array
import typings.extjs.Ext.IComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPicker
  extends StObject
     with ITrigger {
  
  /** [Method] Aligns the picker to the input element */
  var alignPicker: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Collapses this field s picker dropdown  */
  var collapse: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Creates and returns the component to be used as this field s picker  */
  var createPicker: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Expands this field s picker dropdown  */
  var expand: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Returns a reference to the picker component for this field creating it if necessary by calling createPicker
    * @returns Ext.Component The picker component
    */
  var getPicker: js.UndefOr[js.Function0[IComponent]] = js.undefined
  
  /** [Property] (Boolean) */
  var isExpanded: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Boolean) */
  var matchFieldWidth: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Handles the trigger click by default toggles between expanding and collapsing the picker component  */
  @JSName("onTriggerClick")
  var onTriggerClick_IPicker: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Config Option] (String) */
  var openCls: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var pickerAlign: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Number[]) */
  var pickerOffset: js.UndefOr[Array] = js.undefined
}
object IPicker {
  
  inline def apply(): IPicker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPicker]
  }
  
  extension [Self <: IPicker](x: Self) {
    
    inline def setAlignPicker(value: () => Unit): Self = StObject.set(x, "alignPicker", js.Any.fromFunction0(value))
    
    inline def setAlignPickerUndefined: Self = StObject.set(x, "alignPicker", js.undefined)
    
    inline def setCollapse(value: () => Unit): Self = StObject.set(x, "collapse", js.Any.fromFunction0(value))
    
    inline def setCollapseUndefined: Self = StObject.set(x, "collapse", js.undefined)
    
    inline def setCreatePicker(value: () => Unit): Self = StObject.set(x, "createPicker", js.Any.fromFunction0(value))
    
    inline def setCreatePickerUndefined: Self = StObject.set(x, "createPicker", js.undefined)
    
    inline def setExpand(value: () => Unit): Self = StObject.set(x, "expand", js.Any.fromFunction0(value))
    
    inline def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
    
    inline def setGetPicker(value: () => IComponent): Self = StObject.set(x, "getPicker", js.Any.fromFunction0(value))
    
    inline def setGetPickerUndefined: Self = StObject.set(x, "getPicker", js.undefined)
    
    inline def setIsExpanded(value: Boolean): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
    
    inline def setIsExpandedUndefined: Self = StObject.set(x, "isExpanded", js.undefined)
    
    inline def setMatchFieldWidth(value: Boolean): Self = StObject.set(x, "matchFieldWidth", value.asInstanceOf[js.Any])
    
    inline def setMatchFieldWidthUndefined: Self = StObject.set(x, "matchFieldWidth", js.undefined)
    
    inline def setOnTriggerClick(value: () => Unit): Self = StObject.set(x, "onTriggerClick", js.Any.fromFunction0(value))
    
    inline def setOnTriggerClickUndefined: Self = StObject.set(x, "onTriggerClick", js.undefined)
    
    inline def setOpenCls(value: String): Self = StObject.set(x, "openCls", value.asInstanceOf[js.Any])
    
    inline def setOpenClsUndefined: Self = StObject.set(x, "openCls", js.undefined)
    
    inline def setPickerAlign(value: String): Self = StObject.set(x, "pickerAlign", value.asInstanceOf[js.Any])
    
    inline def setPickerAlignUndefined: Self = StObject.set(x, "pickerAlign", js.undefined)
    
    inline def setPickerOffset(value: Array): Self = StObject.set(x, "pickerOffset", value.asInstanceOf[js.Any])
    
    inline def setPickerOffsetUndefined: Self = StObject.set(x, "pickerOffset", js.undefined)
  }
}
