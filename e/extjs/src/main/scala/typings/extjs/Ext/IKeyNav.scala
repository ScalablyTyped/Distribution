package typings.extjs.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IKeyNav extends IBase {
  
  /** [Config Option] (String) */
  var defaultEventAction: js.UndefOr[java.lang.String] = js.native
  
  /** [Method] Destroy this KeyNav
    * @param removeEl Boolean Pass true to remove the element associated with this KeyNav.
    */
  var destroy: js.UndefOr[js.Function1[/* removeEl */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Disables this KeyNav  */
  var disable: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Config Option] (Boolean) */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /** [Method] Enables this KeyNav  */
  var enable: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Config Option] (String) */
  var eventName: js.UndefOr[java.lang.String] = js.native
  
  /** [Config Option] (Boolean) */
  var forceKeyDown: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean) */
  var ignoreInputFields: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Ext.util.KeyMap) */
  var keyMap: js.UndefOr[typings.extjs.Ext.util.IKeyMap] = js.native
  
  /** [Config Option] (Function) */
  var processEvent: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Object) */
  var processEventScope: js.UndefOr[js.Any] = js.native
  
  /** [Method] Convenience function for setting disabled enabled by boolean
    * @param disabled Boolean
    */
  var setDisabled: js.UndefOr[js.Function1[/* disabled */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Config Option] (Ext.Component/Ext.Element/HTMLElement/String) */
  var target: js.UndefOr[js.Any] = js.native
}
object IKeyNav {
  
  @scala.inline
  def apply(): IKeyNav = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IKeyNav]
  }
  
  @scala.inline
  implicit class IKeyNavOps[Self <: IKeyNav] (val x: Self) extends AnyVal {
    
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
    def setDefaultEventAction(value: java.lang.String): Self = this.set("defaultEventAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultEventAction: Self = this.set("defaultEventAction", js.undefined)
    
    @scala.inline
    def setDestroy(value: /* removeEl */ js.UndefOr[Boolean] => Unit): Self = this.set("destroy", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    
    @scala.inline
    def setDisable(value: () => Unit): Self = this.set("disable", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteDisable: Self = this.set("disable", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setEnable(value: () => Unit): Self = this.set("enable", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteEnable: Self = this.set("enable", js.undefined)
    
    @scala.inline
    def setEventName(value: java.lang.String): Self = this.set("eventName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventName: Self = this.set("eventName", js.undefined)
    
    @scala.inline
    def setForceKeyDown(value: Boolean): Self = this.set("forceKeyDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceKeyDown: Self = this.set("forceKeyDown", js.undefined)
    
    @scala.inline
    def setIgnoreInputFields(value: Boolean): Self = this.set("ignoreInputFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreInputFields: Self = this.set("ignoreInputFields", js.undefined)
    
    @scala.inline
    def setKeyMap(value: typings.extjs.Ext.util.IKeyMap): Self = this.set("keyMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyMap: Self = this.set("keyMap", js.undefined)
    
    @scala.inline
    def setProcessEvent(value: js.Any): Self = this.set("processEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessEvent: Self = this.set("processEvent", js.undefined)
    
    @scala.inline
    def setProcessEventScope(value: js.Any): Self = this.set("processEventScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessEventScope: Self = this.set("processEventScope", js.undefined)
    
    @scala.inline
    def setSetDisabled(value: /* disabled */ js.UndefOr[Boolean] => Unit): Self = this.set("setDisabled", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetDisabled: Self = this.set("setDisabled", js.undefined)
    
    @scala.inline
    def setTarget(value: js.Any): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
}
