package typings.extjs.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAction extends IBase {
  /** [Method] Disables all components configured by this Action  */
  var disable: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /** [Method] Executes the specified function once for each Component currently tied to this Action
  		* @param fn Function The function to execute for each component
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to the Component.
  		*/
  var each: js.UndefOr[js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Enables all components configured by this Action  */
  var enable: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Executes this Action manually using the handler function specified in the original config object or the handler funct
  		* @param args Object... Variable number of arguments passed to the handler function
  		*/
  var execute: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
  /** [Method] Gets the icon CSS class currently used by all components configured by this Action  */
  var getIconCls: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Gets the text currently displayed by all components configured by this Action  */
  var getText: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Function) */
  var handler: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var hidden: js.UndefOr[Boolean] = js.undefined
  /** [Method] Hides all components configured by this Action  */
  var hide: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (String) */
  var iconCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Returns true if the components using this Action are currently disabled else returns false  */
  var isDisabled: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Returns true if the components configured by this Action are currently hidden else returns false  */
  var isHidden: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (String) */
  var itemId: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Object) */
  var scope: js.UndefOr[js.Any] = js.undefined
  /** [Method] Sets the disabled state of all components configured by this Action
  		* @param disabled Boolean True to disable the component, false to enable it
  		*/
  var setDisabled: js.UndefOr[js.Function1[/* disabled */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the function that will be called by each Component using this action when its primary event is triggered
  		* @param fn Function The function that will be invoked by the action's components. The function will be called with no arguments.
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to the Component firing the event.
  		*/
  var setHandler: js.UndefOr[js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the hidden state of all components configured by this Action
  		* @param hidden Boolean True to hide the component, false to show it.
  		*/
  var setHidden: js.UndefOr[js.Function1[/* hidden */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the icon CSS class for all components configured by this Action
  		* @param cls String The CSS class supplying the icon image
  		*/
  var setIconCls: js.UndefOr[js.Function1[/* cls */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the text to be displayed by all components configured by this Action
  		* @param text String The text to display
  		*/
  var setText: js.UndefOr[js.Function1[/* text */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Shows all components configured by this Action  */
  var show: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (String) */
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object IAction {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    config: js.Any = null,
    disable: () => Unit = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    each: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    enable: () => Unit = null,
    execute: /* repeated */ js.Any => Unit = null,
    extend: java.lang.String = null,
    getIconCls: () => Unit = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getText: () => Unit = null,
    handler: js.Any = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    hide: () => Unit = null,
    iconCls: java.lang.String = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => IAction = null,
    isDisabled: () => Unit = null,
    isHidden: () => Unit = null,
    itemId: java.lang.String = null,
    mixins: js.Any = null,
    requires: Array = null,
    scope: js.Any = null,
    self: IClass = null,
    setDisabled: /* disabled */ js.UndefOr[Boolean] => Unit = null,
    setHandler: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    setHidden: /* hidden */ js.UndefOr[Boolean] => Unit = null,
    setIconCls: /* cls */ js.UndefOr[java.lang.String] => Unit = null,
    setText: /* text */ js.UndefOr[java.lang.String] => Unit = null,
    show: () => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    text: java.lang.String = null,
    uses: Array = null
  ): IAction = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (config != null) __obj.updateDynamic("config")(config)
    if (disable != null) __obj.updateDynamic("disable")(js.Any.fromFunction0(disable))
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (each != null) __obj.updateDynamic("each")(js.Any.fromFunction2(each))
    if (enable != null) __obj.updateDynamic("enable")(js.Any.fromFunction0(enable))
    if (execute != null) __obj.updateDynamic("execute")(js.Any.fromFunction1(execute))
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getIconCls != null) __obj.updateDynamic("getIconCls")(js.Any.fromFunction0(getIconCls))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getText != null) __obj.updateDynamic("getText")(js.Any.fromFunction0(getText))
    if (handler != null) __obj.updateDynamic("handler")(handler)
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (hide != null) __obj.updateDynamic("hide")(js.Any.fromFunction0(hide))
    if (iconCls != null) __obj.updateDynamic("iconCls")(iconCls)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (isDisabled != null) __obj.updateDynamic("isDisabled")(js.Any.fromFunction0(isDisabled))
    if (isHidden != null) __obj.updateDynamic("isHidden")(js.Any.fromFunction0(isHidden))
    if (itemId != null) __obj.updateDynamic("itemId")(itemId)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setDisabled != null) __obj.updateDynamic("setDisabled")(js.Any.fromFunction1(setDisabled))
    if (setHandler != null) __obj.updateDynamic("setHandler")(js.Any.fromFunction2(setHandler))
    if (setHidden != null) __obj.updateDynamic("setHidden")(js.Any.fromFunction1(setHidden))
    if (setIconCls != null) __obj.updateDynamic("setIconCls")(js.Any.fromFunction1(setIconCls))
    if (setText != null) __obj.updateDynamic("setText")(js.Any.fromFunction1(setText))
    if (show != null) __obj.updateDynamic("show")(js.Any.fromFunction0(show))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (text != null) __obj.updateDynamic("text")(text)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IAction]
  }
}

