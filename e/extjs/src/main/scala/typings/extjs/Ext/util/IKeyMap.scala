package typings.extjs.Ext.util

import typings.extjs.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IKeyMap
  extends StObject
     with IBase {
  
  /** [Method] Add a new binding to this KeyMap
    * @param binding Object/Object[] A single KeyMap config or an array of configs. The following config object properties are supported:
    */
  var addBinding: js.UndefOr[js.Function1[/* binding */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Config Option] (Object/Object[][]) */
  var binding: js.UndefOr[Any] = js.undefined
  
  /** [Method] Destroys the KeyMap instance and removes all handlers
    * @param removeTarget Boolean True to also remove the target
    */
  var destroy: js.UndefOr[js.Function1[/* removeTarget */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Disable this KeyMap */
  var disable: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Enables this KeyMap */
  var enable: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Config Option] (String) */
  var eventName: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Boolean) */
  var ignoreInputFields: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Returns true if this KeyMap is enabled
    * @returns Boolean
    */
  var isEnabled: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Shorthand for adding a single key listener
    * @param key Number/Number[]/Object Either the numeric key code, array of key codes or an object with the following options: {key: (number or array), shift: (true/false), ctrl: (true/false), alt: (true/false)}
    * @param fn Function The function to call
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to the browser window.
    */
  var on: js.UndefOr[
    js.Function3[/* key */ js.UndefOr[Any], /* fn */ js.UndefOr[Any], /* scope */ js.UndefOr[Any], Unit]
  ] = js.undefined
  
  /** [Config Option] (Function) */
  var processEvent: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Object) */
  var processEventScope: js.UndefOr[Any] = js.undefined
  
  /** [Method] Remove a binding from this KeyMap
    * @param binding Object See for options
    */
  var removeBinding: js.UndefOr[js.Function1[/* binding */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Convenience function for setting disabled enabled by boolean
    * @param disabled Boolean
    */
  var setDisabled: js.UndefOr[js.Function1[/* disabled */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Config Option] (Ext.Component/Ext.Element/HTMLElement/String) */
  var target: js.UndefOr[Any] = js.undefined
  
  /** [Method] Shorthand for removing a single key listener
    * @param key Number/Number[]/Object Either the numeric key code, array of key codes or an object with the following options: {key: (number or array), shift: (true/false), ctrl: (true/false), alt: (true/false)}
    * @param fn Function The function to call
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to the browser window.
    */
  var un: js.UndefOr[
    js.Function3[/* key */ js.UndefOr[Any], /* fn */ js.UndefOr[Any], /* scope */ js.UndefOr[Any], Unit]
  ] = js.undefined
}
object IKeyMap {
  
  inline def apply(): IKeyMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IKeyMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IKeyMap] (val x: Self) extends AnyVal {
    
    inline def setAddBinding(value: /* binding */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "addBinding", js.Any.fromFunction1(value))
    
    inline def setAddBindingUndefined: Self = StObject.set(x, "addBinding", js.undefined)
    
    inline def setBinding(value: Any): Self = StObject.set(x, "binding", value.asInstanceOf[js.Any])
    
    inline def setBindingUndefined: Self = StObject.set(x, "binding", js.undefined)
    
    inline def setDestroy(value: /* removeTarget */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
    
    inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
    
    inline def setDisable(value: () => Unit): Self = StObject.set(x, "disable", js.Any.fromFunction0(value))
    
    inline def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
    
    inline def setEnable(value: () => Unit): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
    
    inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
    
    inline def setEventName(value: String): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
    
    inline def setEventNameUndefined: Self = StObject.set(x, "eventName", js.undefined)
    
    inline def setIgnoreInputFields(value: Boolean): Self = StObject.set(x, "ignoreInputFields", value.asInstanceOf[js.Any])
    
    inline def setIgnoreInputFieldsUndefined: Self = StObject.set(x, "ignoreInputFields", js.undefined)
    
    inline def setIsEnabled(value: () => Boolean): Self = StObject.set(x, "isEnabled", js.Any.fromFunction0(value))
    
    inline def setIsEnabledUndefined: Self = StObject.set(x, "isEnabled", js.undefined)
    
    inline def setOn(value: (/* key */ js.UndefOr[Any], /* fn */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction3(value))
    
    inline def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
    
    inline def setProcessEvent(value: Any): Self = StObject.set(x, "processEvent", value.asInstanceOf[js.Any])
    
    inline def setProcessEventScope(value: Any): Self = StObject.set(x, "processEventScope", value.asInstanceOf[js.Any])
    
    inline def setProcessEventScopeUndefined: Self = StObject.set(x, "processEventScope", js.undefined)
    
    inline def setProcessEventUndefined: Self = StObject.set(x, "processEvent", js.undefined)
    
    inline def setRemoveBinding(value: /* binding */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "removeBinding", js.Any.fromFunction1(value))
    
    inline def setRemoveBindingUndefined: Self = StObject.set(x, "removeBinding", js.undefined)
    
    inline def setSetDisabled(value: /* disabled */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setDisabled", js.Any.fromFunction1(value))
    
    inline def setSetDisabledUndefined: Self = StObject.set(x, "setDisabled", js.undefined)
    
    inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setUn(value: (/* key */ js.UndefOr[Any], /* fn */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => Unit): Self = StObject.set(x, "un", js.Any.fromFunction3(value))
    
    inline def setUnUndefined: Self = StObject.set(x, "un", js.undefined)
  }
}
