package typings.extjs.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAction extends IBase {
  
  /** [Method] Disables all components configured by this Action  */
  var disable: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Config Option] (Boolean) */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /** [Method] Executes the specified function once for each Component currently tied to this Action
    * @param fn Function The function to execute for each component
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to the Component.
    */
  var each: js.UndefOr[js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Enables all components configured by this Action  */
  var enable: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Executes this Action manually using the handler function specified in the original config object or the handler funct
    * @param args Object... Variable number of arguments passed to the handler function
    */
  var execute: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  
  /** [Method] Gets the icon CSS class currently used by all components configured by this Action  */
  var getIconCls: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Gets the text currently displayed by all components configured by this Action  */
  var getText: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Config Option] (Function) */
  var handler: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Boolean) */
  var hidden: js.UndefOr[Boolean] = js.native
  
  /** [Method] Hides all components configured by this Action  */
  var hide: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Config Option] (String) */
  var iconCls: js.UndefOr[java.lang.String] = js.native
  
  /** [Method] Returns true if the components using this Action are currently disabled else returns false  */
  var isDisabled: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Returns true if the components configured by this Action are currently hidden else returns false  */
  var isHidden: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Config Option] (String) */
  var itemId: js.UndefOr[java.lang.String] = js.native
  
  /** [Config Option] (Object) */
  var scope: js.UndefOr[js.Any] = js.native
  
  /** [Method] Sets the disabled state of all components configured by this Action
    * @param disabled Boolean True to disable the component, false to enable it
    */
  var setDisabled: js.UndefOr[js.Function1[/* disabled */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the function that will be called by each Component using this action when its primary event is triggered
    * @param fn Function The function that will be invoked by the action's components. The function will be called with no arguments.
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to the Component firing the event.
    */
  var setHandler: js.UndefOr[js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the hidden state of all components configured by this Action
    * @param hidden Boolean True to hide the component, false to show it.
    */
  var setHidden: js.UndefOr[js.Function1[/* hidden */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the icon CSS class for all components configured by this Action
    * @param cls String The CSS class supplying the icon image
    */
  var setIconCls: js.UndefOr[js.Function1[/* cls */ js.UndefOr[java.lang.String], Unit]] = js.native
  
  /** [Method] Sets the text to be displayed by all components configured by this Action
    * @param text String The text to display
    */
  var setText: js.UndefOr[js.Function1[/* text */ js.UndefOr[java.lang.String], Unit]] = js.native
  
  /** [Method] Shows all components configured by this Action  */
  var show: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Config Option] (String) */
  var text: js.UndefOr[java.lang.String] = js.native
}
object IAction {
  
  @scala.inline
  def apply(): IAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAction]
  }
  
  @scala.inline
  implicit class IActionOps[Self <: IAction] (val x: Self) extends AnyVal {
    
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
    def setDisable(value: () => Unit): Self = this.set("disable", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteDisable: Self = this.set("disable", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setEach(value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit): Self = this.set("each", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteEach: Self = this.set("each", js.undefined)
    
    @scala.inline
    def setEnable(value: () => Unit): Self = this.set("enable", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteEnable: Self = this.set("enable", js.undefined)
    
    @scala.inline
    def setExecute(value: /* repeated */ js.Any => Unit): Self = this.set("execute", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteExecute: Self = this.set("execute", js.undefined)
    
    @scala.inline
    def setGetIconCls(value: () => Unit): Self = this.set("getIconCls", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetIconCls: Self = this.set("getIconCls", js.undefined)
    
    @scala.inline
    def setGetText(value: () => Unit): Self = this.set("getText", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetText: Self = this.set("getText", js.undefined)
    
    @scala.inline
    def setHandler(value: js.Any): Self = this.set("handler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandler: Self = this.set("handler", js.undefined)
    
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    
    @scala.inline
    def setHide(value: () => Unit): Self = this.set("hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteHide: Self = this.set("hide", js.undefined)
    
    @scala.inline
    def setIconCls(value: java.lang.String): Self = this.set("iconCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconCls: Self = this.set("iconCls", js.undefined)
    
    @scala.inline
    def setIsDisabled(value: () => Unit): Self = this.set("isDisabled", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteIsDisabled: Self = this.set("isDisabled", js.undefined)
    
    @scala.inline
    def setIsHidden(value: () => Unit): Self = this.set("isHidden", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteIsHidden: Self = this.set("isHidden", js.undefined)
    
    @scala.inline
    def setItemId(value: java.lang.String): Self = this.set("itemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemId: Self = this.set("itemId", js.undefined)
    
    @scala.inline
    def setScope(value: js.Any): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    
    @scala.inline
    def setSetDisabled(value: /* disabled */ js.UndefOr[Boolean] => Unit): Self = this.set("setDisabled", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetDisabled: Self = this.set("setDisabled", js.undefined)
    
    @scala.inline
    def setSetHandler(value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit): Self = this.set("setHandler", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSetHandler: Self = this.set("setHandler", js.undefined)
    
    @scala.inline
    def setSetHidden(value: /* hidden */ js.UndefOr[Boolean] => Unit): Self = this.set("setHidden", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetHidden: Self = this.set("setHidden", js.undefined)
    
    @scala.inline
    def setSetIconCls(value: /* cls */ js.UndefOr[java.lang.String] => Unit): Self = this.set("setIconCls", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetIconCls: Self = this.set("setIconCls", js.undefined)
    
    @scala.inline
    def setSetText(value: /* text */ js.UndefOr[java.lang.String] => Unit): Self = this.set("setText", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetText: Self = this.set("setText", js.undefined)
    
    @scala.inline
    def setShow(value: () => Unit): Self = this.set("show", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    
    @scala.inline
    def setText(value: java.lang.String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}
