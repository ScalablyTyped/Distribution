package typings.extjs.Ext

import typings.extjs.Ext.form.field.IField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEditor
  extends typings.extjs.Ext.container.IContainer {
  
  /** [Method] private
    * @param ct Object
    * @param position Object
    */
  @JSName("afterRender")
  var afterRender_IEditor: js.UndefOr[
    js.Function2[/* ct */ js.UndefOr[js.Any], /* position */ js.UndefOr[js.Any], Unit]
  ] = js.native
  
  /** [Config Option] (String) */
  var alignment: js.UndefOr[java.lang.String] = js.native
  
  /** [Config Option] (Boolean) */
  var allowBlur: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean/Object) */
  var autoSize: js.UndefOr[js.Any] = js.native
  
  /** [Method] Cancels the editing process and hides the editor without persisting any changes
    * @param remainVisible Boolean Override the default behavior and keep the editor visible after cancel
    */
  var cancelEdit: js.UndefOr[js.Function1[/* remainVisible */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Config Option] (Boolean) */
  var cancelOnEsc: js.UndefOr[Boolean] = js.native
  
  /** [Method] Ends the editing process persists the changed value to the underlying field and hides the editor
    * @param remainVisible Boolean Override the default behavior and keep the editor visible after edit
    */
  var completeEdit: js.UndefOr[js.Function1[/* remainVisible */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Config Option] (Boolean) */
  var completeOnEnter: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Ext.form.field.Field) */
  var field: js.UndefOr[IField] = js.native
  
  /** [Method] Gets the data value of the editor
    * @returns Object The data value
    */
  var getValue: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Config Option] (Boolean) */
  var hideEl: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean) */
  var ignoreNoChange: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Number[]) */
  var offsets: js.UndefOr[Array] = js.native
  
  /** [Method] private */
  @JSName("onHide")
  var onHide_IEditor: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] private */
  @JSName("onShow")
  var onShow_IEditor: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Config Option] (String/HTMLElement/Ext.Element) */
  var parentEl: js.UndefOr[js.Any] = js.native
  
  /** [Method] Realigns the editor to the bound field based on the current alignment config value
    * @param autoSize Boolean True to size the field to the dimensions of the bound element.
    */
  var realign: js.UndefOr[js.Function1[/* autoSize */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Config Option] (Boolean) */
  var revertInvalid: js.UndefOr[Boolean] = js.native
  
  /** [Method] Sets the data value of the editor
    * @param value Object Any valid value supported by the underlying field
    */
  var setValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Starts the editing process and shows the editor
    * @param el String/HTMLElement/Ext.Element The element to edit
    * @param value String A value to initialize the editor with. If a value is not provided, it defaults to the innerHTML of el.
    */
  var startEdit: js.UndefOr[
    js.Function2[/* el */ js.UndefOr[js.Any], /* value */ js.UndefOr[java.lang.String], Unit]
  ] = js.native
  
  /** [Config Option] (Boolean) */
  var swallowKeys: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean) */
  var updateEl: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Object) */
  var value: js.UndefOr[js.Any] = js.native
}
object IEditor {
  
  @scala.inline
  def apply(): IEditor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEditor]
  }
  
  @scala.inline
  implicit class IEditorOps[Self <: IEditor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAfterRender(value: (/* ct */ js.UndefOr[js.Any], /* position */ js.UndefOr[js.Any]) => Unit): Self = this.set("afterRender", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteAfterRender: Self = this.set("afterRender", js.undefined)
    
    @scala.inline
    def setAlignment(value: java.lang.String): Self = this.set("alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignment: Self = this.set("alignment", js.undefined)
    
    @scala.inline
    def setAllowBlur(value: Boolean): Self = this.set("allowBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowBlur: Self = this.set("allowBlur", js.undefined)
    
    @scala.inline
    def setAutoSize(value: js.Any): Self = this.set("autoSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoSize: Self = this.set("autoSize", js.undefined)
    
    @scala.inline
    def setCancelEdit(value: /* remainVisible */ js.UndefOr[Boolean] => Unit): Self = this.set("cancelEdit", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCancelEdit: Self = this.set("cancelEdit", js.undefined)
    
    @scala.inline
    def setCancelOnEsc(value: Boolean): Self = this.set("cancelOnEsc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelOnEsc: Self = this.set("cancelOnEsc", js.undefined)
    
    @scala.inline
    def setCompleteEdit(value: /* remainVisible */ js.UndefOr[Boolean] => Unit): Self = this.set("completeEdit", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCompleteEdit: Self = this.set("completeEdit", js.undefined)
    
    @scala.inline
    def setCompleteOnEnter(value: Boolean): Self = this.set("completeOnEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompleteOnEnter: Self = this.set("completeOnEnter", js.undefined)
    
    @scala.inline
    def setField(value: IField): Self = this.set("field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    
    @scala.inline
    def setGetValue(value: () => _): Self = this.set("getValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetValue: Self = this.set("getValue", js.undefined)
    
    @scala.inline
    def setHideEl(value: Boolean): Self = this.set("hideEl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideEl: Self = this.set("hideEl", js.undefined)
    
    @scala.inline
    def setIgnoreNoChange(value: Boolean): Self = this.set("ignoreNoChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreNoChange: Self = this.set("ignoreNoChange", js.undefined)
    
    @scala.inline
    def setOffsets(value: Array): Self = this.set("offsets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsets: Self = this.set("offsets", js.undefined)
    
    @scala.inline
    def setOnHide(value: () => Unit): Self = this.set("onHide", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnHide: Self = this.set("onHide", js.undefined)
    
    @scala.inline
    def setOnShow(value: () => Unit): Self = this.set("onShow", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnShow: Self = this.set("onShow", js.undefined)
    
    @scala.inline
    def setParentEl(value: js.Any): Self = this.set("parentEl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentEl: Self = this.set("parentEl", js.undefined)
    
    @scala.inline
    def setRealign(value: /* autoSize */ js.UndefOr[Boolean] => Unit): Self = this.set("realign", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRealign: Self = this.set("realign", js.undefined)
    
    @scala.inline
    def setRevertInvalid(value: Boolean): Self = this.set("revertInvalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRevertInvalid: Self = this.set("revertInvalid", js.undefined)
    
    @scala.inline
    def setSetValue(value: /* value */ js.UndefOr[js.Any] => Unit): Self = this.set("setValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetValue: Self = this.set("setValue", js.undefined)
    
    @scala.inline
    def setStartEdit(value: (/* el */ js.UndefOr[js.Any], /* value */ js.UndefOr[java.lang.String]) => Unit): Self = this.set("startEdit", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteStartEdit: Self = this.set("startEdit", js.undefined)
    
    @scala.inline
    def setSwallowKeys(value: Boolean): Self = this.set("swallowKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwallowKeys: Self = this.set("swallowKeys", js.undefined)
    
    @scala.inline
    def setUpdateEl(value: Boolean): Self = this.set("updateEl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateEl: Self = this.set("updateEl", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
