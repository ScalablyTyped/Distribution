package typings.extjs.Ext.form

import typings.extjs.Ext.Array
import typings.extjs.Ext.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPicker
  extends typings.extjs.Ext.form.field.ITrigger {
  
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
  implicit class IPickerOps[Self <: IPicker] (val x: Self) extends AnyVal {
    
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
    def setAlignPicker(value: () => Unit): Self = this.set("alignPicker", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteAlignPicker: Self = this.set("alignPicker", js.undefined)
    
    @scala.inline
    def setCollapse(value: () => Unit): Self = this.set("collapse", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteCollapse: Self = this.set("collapse", js.undefined)
    
    @scala.inline
    def setCreatePicker(value: () => Unit): Self = this.set("createPicker", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteCreatePicker: Self = this.set("createPicker", js.undefined)
    
    @scala.inline
    def setExpand(value: () => Unit): Self = this.set("expand", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteExpand: Self = this.set("expand", js.undefined)
    
    @scala.inline
    def setGetPicker(value: () => IComponent): Self = this.set("getPicker", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetPicker: Self = this.set("getPicker", js.undefined)
    
    @scala.inline
    def setIsExpanded(value: Boolean): Self = this.set("isExpanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsExpanded: Self = this.set("isExpanded", js.undefined)
    
    @scala.inline
    def setMatchFieldWidth(value: Boolean): Self = this.set("matchFieldWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchFieldWidth: Self = this.set("matchFieldWidth", js.undefined)
    
    @scala.inline
    def setOnTriggerClick(value: () => Unit): Self = this.set("onTriggerClick", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnTriggerClick: Self = this.set("onTriggerClick", js.undefined)
    
    @scala.inline
    def setOpenCls(value: String): Self = this.set("openCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenCls: Self = this.set("openCls", js.undefined)
    
    @scala.inline
    def setPickerAlign(value: String): Self = this.set("pickerAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePickerAlign: Self = this.set("pickerAlign", js.undefined)
    
    @scala.inline
    def setPickerOffset(value: Array): Self = this.set("pickerOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePickerOffset: Self = this.set("pickerOffset", js.undefined)
  }
}
