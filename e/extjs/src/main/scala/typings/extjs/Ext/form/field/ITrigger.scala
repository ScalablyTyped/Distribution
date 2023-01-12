package typings.extjs.Ext.form.field

import typings.extjs.Ext.ICompositeElement
import typings.extjs.Ext.IElement
import typings.extjs.Ext.IEventObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITrigger
  extends StObject
     with IText {
  
  /** [Config Option] (Boolean) */
  var editable: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Generates the arguments for the field decorations rendering template
    * @returns Object The template arguments
    */
  @JSName("getLabelableRenderData")
  var getLabelableRenderData_ITrigger: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Get the total width of the trigger button area
    * @returns Number The total trigger width
    */
  var getTriggerWidth: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var hideTrigger: js.UndefOr[Boolean] = js.undefined
  
  /** [Property] (Ext.Element) */
  var inputCell: js.UndefOr[IElement] = js.undefined
  
  /** [Method] The function that should handle the trigger s click event
    * @param e Ext.EventObject
    */
  var onTriggerClick: js.UndefOr[js.Function1[/* e */ js.UndefOr[IEventObject], Unit]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var repeatTriggerClick: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Sets the editable state of this field
    * @param editable Boolean True to allow the user to directly edit the field text. If false is passed, the user will only be able to modify the field using the trigger. Will also add a click event to the text field which will call the trigger.
    */
  var setEditable: js.UndefOr[js.Function1[/* editable */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Config Option] (String) */
  var triggerBaseCls: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var triggerCls: js.UndefOr[String] = js.undefined
  
  /** [Property] (Ext.CompositeElement) */
  var triggerEl: js.UndefOr[ICompositeElement] = js.undefined
  
  /** [Config Option] (String) */
  var triggerNoEditCls: js.UndefOr[String] = js.undefined
  
  /** [Property] (Ext.Element) */
  var triggerWrap: js.UndefOr[IElement] = js.undefined
  
  /** [Config Option] (String) */
  var triggerWrapCls: js.UndefOr[String] = js.undefined
}
object ITrigger {
  
  inline def apply(): ITrigger = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITrigger]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ITrigger] (val x: Self) extends AnyVal {
    
    inline def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
    
    inline def setGetLabelableRenderData(value: () => Any): Self = StObject.set(x, "getLabelableRenderData", js.Any.fromFunction0(value))
    
    inline def setGetLabelableRenderDataUndefined: Self = StObject.set(x, "getLabelableRenderData", js.undefined)
    
    inline def setGetTriggerWidth(value: () => Double): Self = StObject.set(x, "getTriggerWidth", js.Any.fromFunction0(value))
    
    inline def setGetTriggerWidthUndefined: Self = StObject.set(x, "getTriggerWidth", js.undefined)
    
    inline def setHideTrigger(value: Boolean): Self = StObject.set(x, "hideTrigger", value.asInstanceOf[js.Any])
    
    inline def setHideTriggerUndefined: Self = StObject.set(x, "hideTrigger", js.undefined)
    
    inline def setInputCell(value: IElement): Self = StObject.set(x, "inputCell", value.asInstanceOf[js.Any])
    
    inline def setInputCellUndefined: Self = StObject.set(x, "inputCell", js.undefined)
    
    inline def setOnTriggerClick(value: /* e */ js.UndefOr[IEventObject] => Unit): Self = StObject.set(x, "onTriggerClick", js.Any.fromFunction1(value))
    
    inline def setOnTriggerClickUndefined: Self = StObject.set(x, "onTriggerClick", js.undefined)
    
    inline def setRepeatTriggerClick(value: Boolean): Self = StObject.set(x, "repeatTriggerClick", value.asInstanceOf[js.Any])
    
    inline def setRepeatTriggerClickUndefined: Self = StObject.set(x, "repeatTriggerClick", js.undefined)
    
    inline def setSetEditable(value: /* editable */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setEditable", js.Any.fromFunction1(value))
    
    inline def setSetEditableUndefined: Self = StObject.set(x, "setEditable", js.undefined)
    
    inline def setTriggerBaseCls(value: String): Self = StObject.set(x, "triggerBaseCls", value.asInstanceOf[js.Any])
    
    inline def setTriggerBaseClsUndefined: Self = StObject.set(x, "triggerBaseCls", js.undefined)
    
    inline def setTriggerCls(value: String): Self = StObject.set(x, "triggerCls", value.asInstanceOf[js.Any])
    
    inline def setTriggerClsUndefined: Self = StObject.set(x, "triggerCls", js.undefined)
    
    inline def setTriggerEl(value: ICompositeElement): Self = StObject.set(x, "triggerEl", value.asInstanceOf[js.Any])
    
    inline def setTriggerElUndefined: Self = StObject.set(x, "triggerEl", js.undefined)
    
    inline def setTriggerNoEditCls(value: String): Self = StObject.set(x, "triggerNoEditCls", value.asInstanceOf[js.Any])
    
    inline def setTriggerNoEditClsUndefined: Self = StObject.set(x, "triggerNoEditCls", js.undefined)
    
    inline def setTriggerWrap(value: IElement): Self = StObject.set(x, "triggerWrap", value.asInstanceOf[js.Any])
    
    inline def setTriggerWrapCls(value: String): Self = StObject.set(x, "triggerWrapCls", value.asInstanceOf[js.Any])
    
    inline def setTriggerWrapClsUndefined: Self = StObject.set(x, "triggerWrapCls", js.undefined)
    
    inline def setTriggerWrapUndefined: Self = StObject.set(x, "triggerWrap", js.undefined)
  }
}
