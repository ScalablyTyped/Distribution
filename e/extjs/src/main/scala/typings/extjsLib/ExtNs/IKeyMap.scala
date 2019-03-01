package typings
package extjsLib.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IKeyMap extends IBase {
  /** [Method] Add a new binding to this KeyMap
  		* @param binding Object/Object[] A single KeyMap config or an array of configs. The following config object properties are supported:
  		*/
  var addBinding: js.UndefOr[js.Function1[/* binding */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Config Option] (Object/Object[][]) */
  var binding: js.UndefOr[js.Any] = js.undefined
  /** [Method] Destroys the KeyMap instance and removes all handlers
  		* @param removeTarget Boolean True to also remove the target
  		*/
  var destroy: js.UndefOr[js.Function1[/* removeTarget */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Disable this KeyMap */
  var disable: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Enables this KeyMap */
  var enable: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (String) */
  var eventName: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var ignoreInputFields: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Returns true if this KeyMap is enabled
  		* @returns Boolean
  		*/
  var isEnabled: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
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
      scala.Unit
    ]
  ] = js.undefined
  /** [Config Option] (Function) */
  var processEvent: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var processEventScope: js.UndefOr[js.Any] = js.undefined
  /** [Method] Remove a binding from this KeyMap
  		* @param binding Object See for options
  		*/
  var removeBinding: js.UndefOr[js.Function1[/* binding */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Convenience function for setting disabled enabled by boolean
  		* @param disabled Boolean
  		*/
  var setDisabled: js.UndefOr[js.Function1[/* disabled */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Config Option] (Ext.Component/Ext.Element/HTMLElement/String) */
  var target: js.UndefOr[js.Any] = js.undefined
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
      scala.Unit
    ]
  ] = js.undefined
}

object IKeyMap {
  @scala.inline
  def apply(
    addBinding: js.Function1[/* binding */ js.UndefOr[js.Any], scala.Unit] = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    binding: js.Any = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    config: js.Any = null,
    destroy: js.Function1[/* removeTarget */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    disable: js.Function0[scala.Unit] = null,
    enable: js.Function0[scala.Unit] = null,
    eventName: java.lang.String = null,
    extend: java.lang.String = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    ignoreInputFields: js.UndefOr[scala.Boolean] = js.undefined,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* config */ js.UndefOr[js.Any], IKeyMap] = null,
    isEnabled: js.Function0[scala.Boolean] = null,
    mixins: js.Any = null,
    on: js.Function3[
      /* key */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    processEvent: js.Any = null,
    processEventScope: js.Any = null,
    removeBinding: js.Function1[/* binding */ js.UndefOr[js.Any], scala.Unit] = null,
    requires: Array = null,
    self: IClass = null,
    setDisabled: js.Function1[/* disabled */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    target: js.Any = null,
    un: js.Function3[
      /* key */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    uses: Array = null
  ): IKeyMap = {
    val __obj = js.Dynamic.literal()
    if (addBinding != null) __obj.updateDynamic("addBinding")(addBinding)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (binding != null) __obj.updateDynamic("binding")(binding)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (config != null) __obj.updateDynamic("config")(config)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (disable != null) __obj.updateDynamic("disable")(disable)
    if (enable != null) __obj.updateDynamic("enable")(enable)
    if (eventName != null) __obj.updateDynamic("eventName")(eventName)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (!js.isUndefined(ignoreInputFields)) __obj.updateDynamic("ignoreInputFields")(ignoreInputFields)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (isEnabled != null) __obj.updateDynamic("isEnabled")(isEnabled)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (on != null) __obj.updateDynamic("on")(on)
    if (processEvent != null) __obj.updateDynamic("processEvent")(processEvent)
    if (processEventScope != null) __obj.updateDynamic("processEventScope")(processEventScope)
    if (removeBinding != null) __obj.updateDynamic("removeBinding")(removeBinding)
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setDisabled != null) __obj.updateDynamic("setDisabled")(setDisabled)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (target != null) __obj.updateDynamic("target")(target)
    if (un != null) __obj.updateDynamic("un")(un)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IKeyMap]
  }
}

