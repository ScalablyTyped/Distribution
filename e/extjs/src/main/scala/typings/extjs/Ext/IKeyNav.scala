package typings.extjs.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IKeyNav
  extends StObject
     with IBase {
  
  /** [Config Option] (String) */
  var defaultEventAction: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Method] Destroy this KeyNav
    * @param removeEl Boolean Pass true to remove the element associated with this KeyNav.
    */
  var destroy: js.UndefOr[js.Function1[/* removeEl */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Disables this KeyNav  */
  var disable: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Enables this KeyNav  */
  var enable: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Config Option] (String) */
  var eventName: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Config Option] (Boolean) */
  var forceKeyDown: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Boolean) */
  var ignoreInputFields: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Ext.util.KeyMap) */
  var keyMap: js.UndefOr[typings.extjs.Ext.util.IKeyMap] = js.undefined
  
  /** [Config Option] (Function) */
  var processEvent: js.UndefOr[js.Any] = js.undefined
  
  /** [Config Option] (Object) */
  var processEventScope: js.UndefOr[js.Any] = js.undefined
  
  /** [Method] Convenience function for setting disabled enabled by boolean
    * @param disabled Boolean
    */
  var setDisabled: js.UndefOr[js.Function1[/* disabled */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Config Option] (Ext.Component/Ext.Element/HTMLElement/String) */
  var target: js.UndefOr[js.Any] = js.undefined
}
object IKeyNav {
  
  @scala.inline
  def apply(): IKeyNav = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IKeyNav]
  }
  
  @scala.inline
  implicit class IKeyNavMutableBuilder[Self <: IKeyNav] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultEventAction(value: java.lang.String): Self = StObject.set(x, "defaultEventAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultEventActionUndefined: Self = StObject.set(x, "defaultEventAction", js.undefined)
    
    @scala.inline
    def setDestroy(value: /* removeEl */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
    
    @scala.inline
    def setDisable(value: () => Unit): Self = StObject.set(x, "disable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setEnable(value: () => Unit): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
    
    @scala.inline
    def setEventName(value: java.lang.String): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventNameUndefined: Self = StObject.set(x, "eventName", js.undefined)
    
    @scala.inline
    def setForceKeyDown(value: Boolean): Self = StObject.set(x, "forceKeyDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceKeyDownUndefined: Self = StObject.set(x, "forceKeyDown", js.undefined)
    
    @scala.inline
    def setIgnoreInputFields(value: Boolean): Self = StObject.set(x, "ignoreInputFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreInputFieldsUndefined: Self = StObject.set(x, "ignoreInputFields", js.undefined)
    
    @scala.inline
    def setKeyMap(value: typings.extjs.Ext.util.IKeyMap): Self = StObject.set(x, "keyMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyMapUndefined: Self = StObject.set(x, "keyMap", js.undefined)
    
    @scala.inline
    def setProcessEvent(value: js.Any): Self = StObject.set(x, "processEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessEventScope(value: js.Any): Self = StObject.set(x, "processEventScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessEventScopeUndefined: Self = StObject.set(x, "processEventScope", js.undefined)
    
    @scala.inline
    def setProcessEventUndefined: Self = StObject.set(x, "processEvent", js.undefined)
    
    @scala.inline
    def setSetDisabled(value: /* disabled */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setDisabled", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDisabledUndefined: Self = StObject.set(x, "setDisabled", js.undefined)
    
    @scala.inline
    def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
