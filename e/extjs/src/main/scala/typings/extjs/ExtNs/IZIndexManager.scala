package typings.extjs.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IZIndexManager extends IBase {
  /** [Method] Brings the specified Component to the front of any other active Components in this ZIndexManager
  		* @param comp String/Object The id of the Component or a Ext.Component instance
  		* @returns Boolean True if the dialog was brought to the front, else false if it was already in front
  		*/
  var bringToFront: js.UndefOr[js.Function1[/* comp */ js.UndefOr[js.Any], Boolean]] = js.undefined
  /** [Method] Executes the specified function once for every Component in this ZIndexManager passing each Component as the only pa
  		* @param fn Function The function to execute for each item
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to the current Component in the iteration.
  		*/
  var each: js.UndefOr[js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Executes the specified function once for every Component in this ZIndexManager passing each Component as the only pa
  		* @param fn Function The function to execute for each item
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to the current Component in the iteration.
  		*/
  var eachBottomUp: js.UndefOr[js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Executes the specified function once for every Component in this ZIndexManager passing each Component as the only pa
  		* @param fn Function The function to execute for each item
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to the current Component in the iteration.
  		*/
  var eachTopDown: js.UndefOr[js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Gets a registered Component by id
  		* @param id String/Object The id of the Component or a Ext.Component instance
  		* @returns Ext.Component
  		*/
  var get: js.UndefOr[js.Function1[/* id */ js.UndefOr[js.Any], IComponent]] = js.undefined
  /** [Method] Gets the currently active Component in this ZIndexManager
  		* @returns Ext.Component The active Component
  		*/
  var getActive: js.UndefOr[js.Function0[IComponent]] = js.undefined
  /** [Method] Returns zero or more Components in this ZIndexManager using the custom search function passed to this method
  		* @param fn Function The search function
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to the Component being tested. That gets passed to the function if not specified.
  		* @returns Array An array of zero or more matching windows
  		*/
  var getBy: js.UndefOr[js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Array]] = js.undefined
  /** [Method] Hides all Components managed by this ZIndexManager  */
  var hideAll: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Registers a floating Ext Component with this ZIndexManager
  		* @param comp Ext.Component The Component to register.
  		*/
  var register: js.UndefOr[js.Function1[/* comp */ js.UndefOr[IComponent], Unit]] = js.undefined
  /** [Method] Sends the specified Component to the back of other active Components in this ZIndexManager
  		* @param comp String/Object The id of the Component or a Ext.Component instance
  		* @returns Ext.Component The Component
  		*/
  var sendToBack: js.UndefOr[js.Function1[/* comp */ js.UndefOr[js.Any], IComponent]] = js.undefined
  /** [Method] Unregisters a Ext Component from this ZIndexManager
  		* @param comp Ext.Component The Component to unregister.
  		*/
  var unregister: js.UndefOr[js.Function1[/* comp */ js.UndefOr[IComponent], Unit]] = js.undefined
}

object IZIndexManager {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    bringToFront: /* comp */ js.UndefOr[js.Any] => Boolean = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    config: js.Any = null,
    each: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    eachBottomUp: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    eachTopDown: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    extend: java.lang.String = null,
    get: /* id */ js.UndefOr[js.Any] => IComponent = null,
    getActive: () => IComponent = null,
    getBy: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Array = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    hideAll: () => Unit = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => IZIndexManager = null,
    mixins: js.Any = null,
    register: /* comp */ js.UndefOr[IComponent] => Unit = null,
    requires: Array = null,
    self: IClass = null,
    sendToBack: /* comp */ js.UndefOr[js.Any] => IComponent = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    unregister: /* comp */ js.UndefOr[IComponent] => Unit = null,
    uses: Array = null
  ): IZIndexManager = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (bringToFront != null) __obj.updateDynamic("bringToFront")(js.Any.fromFunction1(bringToFront))
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (config != null) __obj.updateDynamic("config")(config)
    if (each != null) __obj.updateDynamic("each")(js.Any.fromFunction2(each))
    if (eachBottomUp != null) __obj.updateDynamic("eachBottomUp")(js.Any.fromFunction2(eachBottomUp))
    if (eachTopDown != null) __obj.updateDynamic("eachTopDown")(js.Any.fromFunction2(eachTopDown))
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (get != null) __obj.updateDynamic("get")(js.Any.fromFunction1(get))
    if (getActive != null) __obj.updateDynamic("getActive")(js.Any.fromFunction0(getActive))
    if (getBy != null) __obj.updateDynamic("getBy")(js.Any.fromFunction2(getBy))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (hideAll != null) __obj.updateDynamic("hideAll")(js.Any.fromFunction0(hideAll))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (register != null) __obj.updateDynamic("register")(js.Any.fromFunction1(register))
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (self != null) __obj.updateDynamic("self")(self)
    if (sendToBack != null) __obj.updateDynamic("sendToBack")(js.Any.fromFunction1(sendToBack))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (unregister != null) __obj.updateDynamic("unregister")(js.Any.fromFunction1(unregister))
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IZIndexManager]
  }
}

