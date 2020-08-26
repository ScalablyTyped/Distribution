package typings.extjs.Ext.form

import typings.extjs.Ext.ICompositeElement
import typings.extjs.Ext.IElement
import typings.extjs.Ext.IEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITrigger
  extends typings.extjs.Ext.form.field.IText {
  /** [Config Option] (Boolean) */
  var editable: js.UndefOr[Boolean] = js.native
  /** [Method] Generates the arguments for the field decorations rendering template
    * @returns Object The template arguments
    */
  @JSName("getLabelableRenderData")
  var getLabelableRenderData_ITrigger: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Get the total width of the trigger button area
    * @returns Number The total trigger width
    */
  var getTriggerWidth: js.UndefOr[js.Function0[Double]] = js.native
  /** [Config Option] (Boolean) */
  var hideTrigger: js.UndefOr[Boolean] = js.native
  /** [Property] (Ext.Element) */
  var inputCell: js.UndefOr[IElement] = js.native
  /** [Method] The function that should handle the trigger s click event
    * @param e Ext.EventObject
    */
  var onTriggerClick: js.UndefOr[js.Function1[/* e */ js.UndefOr[IEventObject], Unit]] = js.native
  /** [Config Option] (Boolean) */
  var repeatTriggerClick: js.UndefOr[Boolean] = js.native
  /** [Method] Sets the editable state of this field
    * @param editable Boolean True to allow the user to directly edit the field text. If false is passed, the user will only be able to modify the field using the trigger. Will also add a click event to the text field which will call the trigger.
    */
  var setEditable: js.UndefOr[js.Function1[/* editable */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Config Option] (String) */
  var triggerBaseCls: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var triggerCls: js.UndefOr[String] = js.native
  /** [Property] (Ext.CompositeElement) */
  var triggerEl: js.UndefOr[ICompositeElement] = js.native
  /** [Config Option] (String) */
  var triggerNoEditCls: js.UndefOr[String] = js.native
  /** [Property] (Ext.Element) */
  var triggerWrap: js.UndefOr[IElement] = js.native
  /** [Config Option] (String) */
  var triggerWrapCls: js.UndefOr[String] = js.native
}

object ITrigger {
  @scala.inline
  def apply(): ITrigger = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITrigger]
  }
  @scala.inline
  implicit class ITriggerOps[Self <: ITrigger] (val x: Self) extends AnyVal {
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
    def setEditable(value: Boolean): Self = this.set("editable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditable: Self = this.set("editable", js.undefined)
    @scala.inline
    def setGetLabelableRenderData(value: () => _): Self = this.set("getLabelableRenderData", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetLabelableRenderData: Self = this.set("getLabelableRenderData", js.undefined)
    @scala.inline
    def setGetTriggerWidth(value: () => Double): Self = this.set("getTriggerWidth", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetTriggerWidth: Self = this.set("getTriggerWidth", js.undefined)
    @scala.inline
    def setHideTrigger(value: Boolean): Self = this.set("hideTrigger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideTrigger: Self = this.set("hideTrigger", js.undefined)
    @scala.inline
    def setInputCell(value: IElement): Self = this.set("inputCell", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputCell: Self = this.set("inputCell", js.undefined)
    @scala.inline
    def setOnTriggerClick(value: /* e */ js.UndefOr[IEventObject] => Unit): Self = this.set("onTriggerClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTriggerClick: Self = this.set("onTriggerClick", js.undefined)
    @scala.inline
    def setRepeatTriggerClick(value: Boolean): Self = this.set("repeatTriggerClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepeatTriggerClick: Self = this.set("repeatTriggerClick", js.undefined)
    @scala.inline
    def setSetEditable(value: /* editable */ js.UndefOr[Boolean] => Unit): Self = this.set("setEditable", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetEditable: Self = this.set("setEditable", js.undefined)
    @scala.inline
    def setTriggerBaseCls(value: String): Self = this.set("triggerBaseCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTriggerBaseCls: Self = this.set("triggerBaseCls", js.undefined)
    @scala.inline
    def setTriggerCls(value: String): Self = this.set("triggerCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTriggerCls: Self = this.set("triggerCls", js.undefined)
    @scala.inline
    def setTriggerEl(value: ICompositeElement): Self = this.set("triggerEl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTriggerEl: Self = this.set("triggerEl", js.undefined)
    @scala.inline
    def setTriggerNoEditCls(value: String): Self = this.set("triggerNoEditCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTriggerNoEditCls: Self = this.set("triggerNoEditCls", js.undefined)
    @scala.inline
    def setTriggerWrap(value: IElement): Self = this.set("triggerWrap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTriggerWrap: Self = this.set("triggerWrap", js.undefined)
    @scala.inline
    def setTriggerWrapCls(value: String): Self = this.set("triggerWrapCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTriggerWrapCls: Self = this.set("triggerWrapCls", js.undefined)
  }
  
}

