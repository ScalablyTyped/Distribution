package typings.extjs.Ext

import typings.extjs.Ext.form.field.IField
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEditor
  extends StObject
     with typings.extjs.Ext.container.IContainer {
  
  /** [Method] private
    * @param ct Object
    * @param position Object
    */
  @JSName("afterRender")
  var afterRender_IEditor: js.UndefOr[js.Function2[/* ct */ js.UndefOr[Any], /* position */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Config Option] (String) */
  var alignment: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Config Option] (Boolean) */
  var allowBlur: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Boolean/Object) */
  var autoSize: js.UndefOr[Any] = js.undefined
  
  /** [Method] Cancels the editing process and hides the editor without persisting any changes
    * @param remainVisible Boolean Override the default behavior and keep the editor visible after cancel
    */
  var cancelEdit: js.UndefOr[js.Function1[/* remainVisible */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var cancelOnEsc: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Ends the editing process persists the changed value to the underlying field and hides the editor
    * @param remainVisible Boolean Override the default behavior and keep the editor visible after edit
    */
  var completeEdit: js.UndefOr[js.Function1[/* remainVisible */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var completeOnEnter: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Ext.form.field.Field) */
  var field: js.UndefOr[IField] = js.undefined
  
  /** [Method] Gets the data value of the editor
    * @returns Object The data value
    */
  var getValue: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var hideEl: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Boolean) */
  var ignoreNoChange: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Number[]) */
  var offsets: js.UndefOr[Array] = js.undefined
  
  /** [Method] private */
  @JSName("onHide")
  var onHide_IEditor: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] private */
  @JSName("onShow")
  var onShow_IEditor: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Config Option] (String/HTMLElement/Ext.Element) */
  var parentEl: js.UndefOr[Any] = js.undefined
  
  /** [Method] Realigns the editor to the bound field based on the current alignment config value
    * @param autoSize Boolean True to size the field to the dimensions of the bound element.
    */
  var realign: js.UndefOr[js.Function1[/* autoSize */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var revertInvalid: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Sets the data value of the editor
    * @param value Object Any valid value supported by the underlying field
    */
  var setValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Starts the editing process and shows the editor
    * @param el String/HTMLElement/Ext.Element The element to edit
    * @param value String A value to initialize the editor with. If a value is not provided, it defaults to the innerHTML of el.
    */
  var startEdit: js.UndefOr[
    js.Function2[/* el */ js.UndefOr[Any], /* value */ js.UndefOr[java.lang.String], Unit]
  ] = js.undefined
  
  /** [Config Option] (Boolean) */
  var swallowKeys: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Boolean) */
  var updateEl: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Object) */
  var value: js.UndefOr[Any] = js.undefined
}
object IEditor {
  
  inline def apply(): IEditor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEditor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IEditor] (val x: Self) extends AnyVal {
    
    inline def setAfterRender(value: (/* ct */ js.UndefOr[Any], /* position */ js.UndefOr[Any]) => Unit): Self = StObject.set(x, "afterRender", js.Any.fromFunction2(value))
    
    inline def setAfterRenderUndefined: Self = StObject.set(x, "afterRender", js.undefined)
    
    inline def setAlignment(value: java.lang.String): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
    
    inline def setAllowBlur(value: Boolean): Self = StObject.set(x, "allowBlur", value.asInstanceOf[js.Any])
    
    inline def setAllowBlurUndefined: Self = StObject.set(x, "allowBlur", js.undefined)
    
    inline def setAutoSize(value: Any): Self = StObject.set(x, "autoSize", value.asInstanceOf[js.Any])
    
    inline def setAutoSizeUndefined: Self = StObject.set(x, "autoSize", js.undefined)
    
    inline def setCancelEdit(value: /* remainVisible */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "cancelEdit", js.Any.fromFunction1(value))
    
    inline def setCancelEditUndefined: Self = StObject.set(x, "cancelEdit", js.undefined)
    
    inline def setCancelOnEsc(value: Boolean): Self = StObject.set(x, "cancelOnEsc", value.asInstanceOf[js.Any])
    
    inline def setCancelOnEscUndefined: Self = StObject.set(x, "cancelOnEsc", js.undefined)
    
    inline def setCompleteEdit(value: /* remainVisible */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "completeEdit", js.Any.fromFunction1(value))
    
    inline def setCompleteEditUndefined: Self = StObject.set(x, "completeEdit", js.undefined)
    
    inline def setCompleteOnEnter(value: Boolean): Self = StObject.set(x, "completeOnEnter", value.asInstanceOf[js.Any])
    
    inline def setCompleteOnEnterUndefined: Self = StObject.set(x, "completeOnEnter", js.undefined)
    
    inline def setField(value: IField): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setGetValue(value: () => Any): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
    
    inline def setGetValueUndefined: Self = StObject.set(x, "getValue", js.undefined)
    
    inline def setHideEl(value: Boolean): Self = StObject.set(x, "hideEl", value.asInstanceOf[js.Any])
    
    inline def setHideElUndefined: Self = StObject.set(x, "hideEl", js.undefined)
    
    inline def setIgnoreNoChange(value: Boolean): Self = StObject.set(x, "ignoreNoChange", value.asInstanceOf[js.Any])
    
    inline def setIgnoreNoChangeUndefined: Self = StObject.set(x, "ignoreNoChange", js.undefined)
    
    inline def setOffsets(value: Array): Self = StObject.set(x, "offsets", value.asInstanceOf[js.Any])
    
    inline def setOffsetsUndefined: Self = StObject.set(x, "offsets", js.undefined)
    
    inline def setOnHide(value: () => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction0(value))
    
    inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
    
    inline def setOnShow(value: () => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction0(value))
    
    inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
    
    inline def setParentEl(value: Any): Self = StObject.set(x, "parentEl", value.asInstanceOf[js.Any])
    
    inline def setParentElUndefined: Self = StObject.set(x, "parentEl", js.undefined)
    
    inline def setRealign(value: /* autoSize */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "realign", js.Any.fromFunction1(value))
    
    inline def setRealignUndefined: Self = StObject.set(x, "realign", js.undefined)
    
    inline def setRevertInvalid(value: Boolean): Self = StObject.set(x, "revertInvalid", value.asInstanceOf[js.Any])
    
    inline def setRevertInvalidUndefined: Self = StObject.set(x, "revertInvalid", js.undefined)
    
    inline def setSetValue(value: /* value */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
    
    inline def setSetValueUndefined: Self = StObject.set(x, "setValue", js.undefined)
    
    inline def setStartEdit(value: (/* el */ js.UndefOr[Any], /* value */ js.UndefOr[java.lang.String]) => Unit): Self = StObject.set(x, "startEdit", js.Any.fromFunction2(value))
    
    inline def setStartEditUndefined: Self = StObject.set(x, "startEdit", js.undefined)
    
    inline def setSwallowKeys(value: Boolean): Self = StObject.set(x, "swallowKeys", value.asInstanceOf[js.Any])
    
    inline def setSwallowKeysUndefined: Self = StObject.set(x, "swallowKeys", js.undefined)
    
    inline def setUpdateEl(value: Boolean): Self = StObject.set(x, "updateEl", value.asInstanceOf[js.Any])
    
    inline def setUpdateElUndefined: Self = StObject.set(x, "updateEl", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
