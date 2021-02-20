package typings.extjs.Ext.util

import typings.extjs.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IKeyMap extends IBase {
  
  /** [Method] Add a new binding to this KeyMap
    * @param binding Object/Object[] A single KeyMap config or an array of configs. The following config object properties are supported:
    */
  var addBinding: js.UndefOr[js.Function1[/* binding */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Config Option] (Object/Object[][]) */
  var binding: js.UndefOr[js.Any] = js.native
  
  /** [Method] Destroys the KeyMap instance and removes all handlers
    * @param removeTarget Boolean True to also remove the target
    */
  var destroy: js.UndefOr[js.Function1[/* removeTarget */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Disable this KeyMap */
  var disable: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Enables this KeyMap */
  var enable: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Config Option] (String) */
  var eventName: js.UndefOr[String] = js.native
  
  /** [Config Option] (Boolean) */
  var ignoreInputFields: js.UndefOr[Boolean] = js.native
  
  /** [Method] Returns true if this KeyMap is enabled
    * @returns Boolean
    */
  var isEnabled: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Shorthand for adding a single key listener
    * @param key Number/Number[]/Object Either the numeric key code, array of key codes or an object with the following options: {key: (number or array), shift: (true/false), ctrl: (true/false), alt: (true/false)}
    * @param fn Function The function to call
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to the browser window.
    */
  var on: js.UndefOr[
    js.Function3[
      /* key */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  
  /** [Config Option] (Function) */
  var processEvent: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Object) */
  var processEventScope: js.UndefOr[js.Any] = js.native
  
  /** [Method] Remove a binding from this KeyMap
    * @param binding Object See for options
    */
  var removeBinding: js.UndefOr[js.Function1[/* binding */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Convenience function for setting disabled enabled by boolean
    * @param disabled Boolean
    */
  var setDisabled: js.UndefOr[js.Function1[/* disabled */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Config Option] (Ext.Component/Ext.Element/HTMLElement/String) */
  var target: js.UndefOr[js.Any] = js.native
  
  /** [Method] Shorthand for removing a single key listener
    * @param key Number/Number[]/Object Either the numeric key code, array of key codes or an object with the following options: {key: (number or array), shift: (true/false), ctrl: (true/false), alt: (true/false)}
    * @param fn Function The function to call
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to the browser window.
    */
  var un: js.UndefOr[
    js.Function3[
      /* key */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
}
object IKeyMap {
  
  @scala.inline
  def apply(): IKeyMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IKeyMap]
  }
  
  @scala.inline
  implicit class IKeyMapMutableBuilder[Self <: IKeyMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddBinding(value: /* binding */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "addBinding", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddBindingUndefined: Self = StObject.set(x, "addBinding", js.undefined)
    
    @scala.inline
    def setBinding(value: js.Any): Self = StObject.set(x, "binding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindingUndefined: Self = StObject.set(x, "binding", js.undefined)
    
    @scala.inline
    def setDestroy(value: /* removeTarget */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
    
    @scala.inline
    def setDisable(value: () => Unit): Self = StObject.set(x, "disable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
    
    @scala.inline
    def setEnable(value: () => Unit): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
    
    @scala.inline
    def setEventName(value: String): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventNameUndefined: Self = StObject.set(x, "eventName", js.undefined)
    
    @scala.inline
    def setIgnoreInputFields(value: Boolean): Self = StObject.set(x, "ignoreInputFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreInputFieldsUndefined: Self = StObject.set(x, "ignoreInputFields", js.undefined)
    
    @scala.inline
    def setIsEnabled(value: () => Boolean): Self = StObject.set(x, "isEnabled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsEnabledUndefined: Self = StObject.set(x, "isEnabled", js.undefined)
    
    @scala.inline
    def setOn(
      value: (/* key */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "on", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
    
    @scala.inline
    def setProcessEvent(value: js.Any): Self = StObject.set(x, "processEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessEventScope(value: js.Any): Self = StObject.set(x, "processEventScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessEventScopeUndefined: Self = StObject.set(x, "processEventScope", js.undefined)
    
    @scala.inline
    def setProcessEventUndefined: Self = StObject.set(x, "processEvent", js.undefined)
    
    @scala.inline
    def setRemoveBinding(value: /* binding */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "removeBinding", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveBindingUndefined: Self = StObject.set(x, "removeBinding", js.undefined)
    
    @scala.inline
    def setSetDisabled(value: /* disabled */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setDisabled", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDisabledUndefined: Self = StObject.set(x, "setDisabled", js.undefined)
    
    @scala.inline
    def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setUn(
      value: (/* key */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "un", js.Any.fromFunction3(value))
    
    @scala.inline
    def setUnUndefined: Self = StObject.set(x, "un", js.undefined)
  }
}
