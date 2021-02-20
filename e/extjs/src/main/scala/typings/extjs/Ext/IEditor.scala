package typings.extjs.Ext

import typings.extjs.Ext.form.field.IField
import org.scalablytyped.runtime.StObject
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
  implicit class IEditorMutableBuilder[Self <: IEditor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfterRender(value: (/* ct */ js.UndefOr[js.Any], /* position */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "afterRender", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAfterRenderUndefined: Self = StObject.set(x, "afterRender", js.undefined)
    
    @scala.inline
    def setAlignment(value: java.lang.String): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
    
    @scala.inline
    def setAllowBlur(value: Boolean): Self = StObject.set(x, "allowBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowBlurUndefined: Self = StObject.set(x, "allowBlur", js.undefined)
    
    @scala.inline
    def setAutoSize(value: js.Any): Self = StObject.set(x, "autoSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoSizeUndefined: Self = StObject.set(x, "autoSize", js.undefined)
    
    @scala.inline
    def setCancelEdit(value: /* remainVisible */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "cancelEdit", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCancelEditUndefined: Self = StObject.set(x, "cancelEdit", js.undefined)
    
    @scala.inline
    def setCancelOnEsc(value: Boolean): Self = StObject.set(x, "cancelOnEsc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelOnEscUndefined: Self = StObject.set(x, "cancelOnEsc", js.undefined)
    
    @scala.inline
    def setCompleteEdit(value: /* remainVisible */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "completeEdit", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteEditUndefined: Self = StObject.set(x, "completeEdit", js.undefined)
    
    @scala.inline
    def setCompleteOnEnter(value: Boolean): Self = StObject.set(x, "completeOnEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompleteOnEnterUndefined: Self = StObject.set(x, "completeOnEnter", js.undefined)
    
    @scala.inline
    def setField(value: IField): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setGetValue(value: () => _): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetValueUndefined: Self = StObject.set(x, "getValue", js.undefined)
    
    @scala.inline
    def setHideEl(value: Boolean): Self = StObject.set(x, "hideEl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideElUndefined: Self = StObject.set(x, "hideEl", js.undefined)
    
    @scala.inline
    def setIgnoreNoChange(value: Boolean): Self = StObject.set(x, "ignoreNoChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreNoChangeUndefined: Self = StObject.set(x, "ignoreNoChange", js.undefined)
    
    @scala.inline
    def setOffsets(value: Array): Self = StObject.set(x, "offsets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetsUndefined: Self = StObject.set(x, "offsets", js.undefined)
    
    @scala.inline
    def setOnHide(value: () => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
    
    @scala.inline
    def setOnShow(value: () => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
    
    @scala.inline
    def setParentEl(value: js.Any): Self = StObject.set(x, "parentEl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentElUndefined: Self = StObject.set(x, "parentEl", js.undefined)
    
    @scala.inline
    def setRealign(value: /* autoSize */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "realign", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRealignUndefined: Self = StObject.set(x, "realign", js.undefined)
    
    @scala.inline
    def setRevertInvalid(value: Boolean): Self = StObject.set(x, "revertInvalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevertInvalidUndefined: Self = StObject.set(x, "revertInvalid", js.undefined)
    
    @scala.inline
    def setSetValue(value: /* value */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetValueUndefined: Self = StObject.set(x, "setValue", js.undefined)
    
    @scala.inline
    def setStartEdit(value: (/* el */ js.UndefOr[js.Any], /* value */ js.UndefOr[java.lang.String]) => Unit): Self = StObject.set(x, "startEdit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStartEditUndefined: Self = StObject.set(x, "startEdit", js.undefined)
    
    @scala.inline
    def setSwallowKeys(value: Boolean): Self = StObject.set(x, "swallowKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwallowKeysUndefined: Self = StObject.set(x, "swallowKeys", js.undefined)
    
    @scala.inline
    def setUpdateEl(value: Boolean): Self = StObject.set(x, "updateEl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateElUndefined: Self = StObject.set(x, "updateEl", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
