package typings.extjs.Ext.state

import typings.extjs.Ext.Array
import typings.extjs.Ext.IClass
import typings.extjs.Ext.util.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStateful extends IObservable {
  /** [Method] Add events that will trigger the state to be saved
  		* @param events String/String[] The event name or an array of event names.
  		*/
  var addStateEvents: js.UndefOr[js.Function1[/* events */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Applies the state to the object
  		* @param state Object The state
  		*/
  var applyState: js.UndefOr[js.Function1[/* state */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Destroys this stateful object  */
  var destroy: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Gets the current state of the object
  		* @returns Object The current state
  		*/
  var getState: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Config Option] (Number) */
  var saveDelay: js.UndefOr[Double] = js.undefined
  /** [Method] Conditionally saves a single property from this object to the given state object
  		* @param propName String The name of the property to save.
  		* @param state Object The state object in to which to save the property.
  		* @param stateName String The name to use for the property in state.
  		* @returns Boolean True if the property was saved, false if not.
  		*/
  var savePropToState: js.UndefOr[
    js.Function3[
      /* propName */ js.UndefOr[java.lang.String], 
      /* state */ js.UndefOr[js.Any], 
      /* stateName */ js.UndefOr[java.lang.String], 
      Boolean
    ]
  ] = js.undefined
  /** [Method] Gathers additional named properties of the instance and adds their current values to the passed state object
  		* @param propNames String/String[] The name (or array of names) of the property to save.
  		* @param state Object The state object in to which to save the property values.
  		* @returns Object state
  		*/
  var savePropsToState: js.UndefOr[
    js.Function2[/* propNames */ js.UndefOr[js.Any], /* state */ js.UndefOr[js.Any], _]
  ] = js.undefined
  /** [Method] Saves the state of the object to the persistence store  */
  var saveState: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (String[]) */
  var stateEvents: js.UndefOr[Array] = js.undefined
  /** [Config Option] (String) */
  var stateId: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var stateful: js.UndefOr[Boolean] = js.undefined
}

object IStateful {
  @scala.inline
  def apply(
    addEvents: /* eventNames */ js.UndefOr[js.Any] => Unit = null,
    addListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    addManagedListener: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    addStateEvents: /* events */ js.UndefOr[js.Any] => Unit = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    applyState: /* state */ js.UndefOr[js.Any] => Unit = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    clearListeners: () => Unit = null,
    clearManagedListeners: () => Unit = null,
    config: js.Any = null,
    destroy: () => Unit = null,
    enableBubble: /* eventNames */ js.UndefOr[js.Any] => Unit = null,
    extend: java.lang.String = null,
    fireEvent: (/* eventName */ java.lang.String, /* repeated */ js.Any) => Boolean = null,
    fireEventArgs: (/* eventName */ js.UndefOr[java.lang.String], /* args */ js.UndefOr[Array]) => Boolean = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getState: () => _ = null,
    hasListener: /* eventName */ js.UndefOr[java.lang.String] => Boolean = null,
    hasListeners: js.Any = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => IStateful = null,
    isObservable: js.UndefOr[Boolean] = js.undefined,
    listeners: js.Any = null,
    mixins: js.Any = null,
    mon: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    mun: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    on: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    relayEvents: (/* origin */ js.UndefOr[js.Any], /* events */ js.UndefOr[Array], /* prefix */ js.UndefOr[java.lang.String]) => _ = null,
    removeListener: (/* eventName */ js.UndefOr[java.lang.String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    removeManagedListener: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    requires: Array = null,
    resumeEvent: /* repeated */ js.Any => Unit = null,
    resumeEvents: () => Unit = null,
    saveDelay: Int | Double = null,
    savePropToState: (/* propName */ js.UndefOr[java.lang.String], /* state */ js.UndefOr[js.Any], /* stateName */ js.UndefOr[java.lang.String]) => Boolean = null,
    savePropsToState: (/* propNames */ js.UndefOr[js.Any], /* state */ js.UndefOr[js.Any]) => _ = null,
    saveState: () => Unit = null,
    self: IClass = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    stateEvents: Array = null,
    stateId: java.lang.String = null,
    stateful: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    suspendEvent: /* repeated */ js.Any => Unit = null,
    suspendEvents: /* queueSuspended */ js.UndefOr[Boolean] => Unit = null,
    un: (/* eventName */ js.UndefOr[java.lang.String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    uses: Array = null
  ): IStateful = {
    val __obj = js.Dynamic.literal()
    if (addEvents != null) __obj.updateDynamic("addEvents")(js.Any.fromFunction1(addEvents))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction4(addListener))
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(js.Any.fromFunction5(addManagedListener))
    if (addStateEvents != null) __obj.updateDynamic("addStateEvents")(js.Any.fromFunction1(addStateEvents))
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (applyState != null) __obj.updateDynamic("applyState")(js.Any.fromFunction1(applyState))
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(js.Any.fromFunction0(clearListeners))
    if (clearManagedListeners != null) __obj.updateDynamic("clearManagedListeners")(js.Any.fromFunction0(clearManagedListeners))
    if (config != null) __obj.updateDynamic("config")(config)
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1(enableBubble))
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction2(fireEvent))
    if (fireEventArgs != null) __obj.updateDynamic("fireEventArgs")(js.Any.fromFunction2(fireEventArgs))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getState != null) __obj.updateDynamic("getState")(js.Any.fromFunction0(getState))
    if (hasListener != null) __obj.updateDynamic("hasListener")(js.Any.fromFunction1(hasListener))
    if (hasListeners != null) __obj.updateDynamic("hasListeners")(hasListeners)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (!js.isUndefined(isObservable)) __obj.updateDynamic("isObservable")(isObservable)
    if (listeners != null) __obj.updateDynamic("listeners")(listeners)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (mon != null) __obj.updateDynamic("mon")(js.Any.fromFunction5(mon))
    if (mun != null) __obj.updateDynamic("mun")(js.Any.fromFunction4(mun))
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction4(on))
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(js.Any.fromFunction3(relayEvents))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction3(removeListener))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4(removeManagedListener))
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (resumeEvent != null) __obj.updateDynamic("resumeEvent")(js.Any.fromFunction1(resumeEvent))
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(js.Any.fromFunction0(resumeEvents))
    if (saveDelay != null) __obj.updateDynamic("saveDelay")(saveDelay.asInstanceOf[js.Any])
    if (savePropToState != null) __obj.updateDynamic("savePropToState")(js.Any.fromFunction3(savePropToState))
    if (savePropsToState != null) __obj.updateDynamic("savePropsToState")(js.Any.fromFunction2(savePropsToState))
    if (saveState != null) __obj.updateDynamic("saveState")(js.Any.fromFunction0(saveState))
    if (self != null) __obj.updateDynamic("self")(self)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (stateEvents != null) __obj.updateDynamic("stateEvents")(stateEvents)
    if (stateId != null) __obj.updateDynamic("stateId")(stateId)
    if (!js.isUndefined(stateful)) __obj.updateDynamic("stateful")(stateful)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (suspendEvent != null) __obj.updateDynamic("suspendEvent")(js.Any.fromFunction1(suspendEvent))
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(js.Any.fromFunction1(suspendEvents))
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction3(un))
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IStateful]
  }
}

