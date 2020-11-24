package typings.extjs.Ext

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
  var eventName: js.UndefOr[java.lang.String] = js.native
  
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
  implicit class IKeyMapOps[Self <: IKeyMap] (val x: Self) extends AnyVal {
    
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
    def setAddBinding(value: /* binding */ js.UndefOr[js.Any] => Unit): Self = this.set("addBinding", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAddBinding: Self = this.set("addBinding", js.undefined)
    
    @scala.inline
    def setBinding(value: js.Any): Self = this.set("binding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBinding: Self = this.set("binding", js.undefined)
    
    @scala.inline
    def setDestroy(value: /* removeTarget */ js.UndefOr[Boolean] => Unit): Self = this.set("destroy", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    
    @scala.inline
    def setDisable(value: () => Unit): Self = this.set("disable", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteDisable: Self = this.set("disable", js.undefined)
    
    @scala.inline
    def setEnable(value: () => Unit): Self = this.set("enable", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteEnable: Self = this.set("enable", js.undefined)
    
    @scala.inline
    def setEventName(value: java.lang.String): Self = this.set("eventName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventName: Self = this.set("eventName", js.undefined)
    
    @scala.inline
    def setIgnoreInputFields(value: Boolean): Self = this.set("ignoreInputFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreInputFields: Self = this.set("ignoreInputFields", js.undefined)
    
    @scala.inline
    def setIsEnabled(value: () => Boolean): Self = this.set("isEnabled", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteIsEnabled: Self = this.set("isEnabled", js.undefined)
    
    @scala.inline
    def setOn(
      value: (/* key */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("on", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOn: Self = this.set("on", js.undefined)
    
    @scala.inline
    def setProcessEvent(value: js.Any): Self = this.set("processEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessEvent: Self = this.set("processEvent", js.undefined)
    
    @scala.inline
    def setProcessEventScope(value: js.Any): Self = this.set("processEventScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessEventScope: Self = this.set("processEventScope", js.undefined)
    
    @scala.inline
    def setRemoveBinding(value: /* binding */ js.UndefOr[js.Any] => Unit): Self = this.set("removeBinding", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRemoveBinding: Self = this.set("removeBinding", js.undefined)
    
    @scala.inline
    def setSetDisabled(value: /* disabled */ js.UndefOr[Boolean] => Unit): Self = this.set("setDisabled", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetDisabled: Self = this.set("setDisabled", js.undefined)
    
    @scala.inline
    def setTarget(value: js.Any): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setUn(
      value: (/* key */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("un", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteUn: Self = this.set("un", js.undefined)
  }
}
