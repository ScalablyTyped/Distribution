package typings
package extjsLib.ExtNs.directNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRemotingProvider extends IJsonProvider {
  /** [Config Option] (Object) */
  var actions: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var disableNestedActions: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Number/Boolean) */
  var enableBuffer: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var enableUrlEncode: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Number) */
  var maxRetries: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (String/Object) */
  var namespace: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Number) */
  var timeout: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (String) */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object IRemotingProvider {
  @scala.inline
  def apply(
    actions: js.Any = null,
    addEvents: js.Function1[/* eventNames */ js.UndefOr[js.Any], scala.Unit] = null,
    addListener: js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      _
    ] = null,
    addManagedListener: js.Function5[
      /* item */ js.UndefOr[js.Any], 
      /* ename */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      _
    ] = null,
    alias: extjsLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    clearListeners: js.Function0[scala.Unit] = null,
    clearManagedListeners: js.Function0[scala.Unit] = null,
    config: js.Any = null,
    connect: js.Function0[scala.Unit] = null,
    createEvent: js.Function1[/* response */ js.UndefOr[js.Any], IEvent] = null,
    createEvents: js.Function1[/* response */ js.UndefOr[js.Any], extjsLib.ExtNs.Array] = null,
    disableNestedActions: js.UndefOr[scala.Boolean] = js.undefined,
    disconnect: js.Function0[scala.Unit] = null,
    enableBubble: js.Function1[/* eventNames */ js.UndefOr[js.Any], scala.Unit] = null,
    enableBuffer: js.Any = null,
    enableUrlEncode: java.lang.String = null,
    extend: java.lang.String = null,
    fireEvent: js.Function2[/* eventName */ java.lang.String, /* repeated */ js.Any, scala.Boolean] = null,
    fireEventArgs: js.Function2[
      /* eventName */ js.UndefOr[java.lang.String], 
      /* args */ js.UndefOr[extjsLib.ExtNs.Array], 
      scala.Boolean
    ] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    hasListener: js.Function1[/* eventName */ js.UndefOr[java.lang.String], scala.Boolean] = null,
    hasListeners: js.Any = null,
    id: java.lang.String = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* config */ js.UndefOr[js.Any], IRemotingProvider] = null,
    isConnected: js.Function0[scala.Unit] = null,
    isObservable: js.UndefOr[scala.Boolean] = js.undefined,
    listeners: js.Any = null,
    maxRetries: scala.Int | scala.Double = null,
    mixins: js.Any = null,
    mon: js.Function5[
      /* item */ js.UndefOr[js.Any], 
      /* ename */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      _
    ] = null,
    mun: js.Function4[
      /* item */ js.UndefOr[js.Any], 
      /* ename */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    namespace: js.Any = null,
    on: js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      _
    ] = null,
    relayEvents: js.Function3[
      /* origin */ js.UndefOr[js.Any], 
      /* events */ js.UndefOr[extjsLib.ExtNs.Array], 
      /* prefix */ js.UndefOr[java.lang.String], 
      _
    ] = null,
    relayedEvents: extjsLib.ExtNs.Array = null,
    removeListener: js.Function3[
      /* eventName */ js.UndefOr[java.lang.String], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    removeManagedListener: js.Function4[
      /* item */ js.UndefOr[js.Any], 
      /* ename */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    requires: extjsLib.ExtNs.Array = null,
    resumeEvent: js.Function1[/* repeated */ js.Any, scala.Unit] = null,
    resumeEvents: js.Function0[scala.Unit] = null,
    self: extjsLib.ExtNs.IClass = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    suspendEvent: js.Function1[/* repeated */ js.Any, scala.Unit] = null,
    suspendEvents: js.Function1[/* queueSuspended */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    timeout: scala.Int | scala.Double = null,
    un: js.Function3[
      /* eventName */ js.UndefOr[java.lang.String], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    url: java.lang.String = null,
    uses: extjsLib.ExtNs.Array = null
  ): IRemotingProvider = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions)
    if (addEvents != null) __obj.updateDynamic("addEvents")(addEvents)
    if (addListener != null) __obj.updateDynamic("addListener")(addListener)
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(addManagedListener)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(clearListeners)
    if (clearManagedListeners != null) __obj.updateDynamic("clearManagedListeners")(clearManagedListeners)
    if (config != null) __obj.updateDynamic("config")(config)
    if (connect != null) __obj.updateDynamic("connect")(connect)
    if (createEvent != null) __obj.updateDynamic("createEvent")(createEvent)
    if (createEvents != null) __obj.updateDynamic("createEvents")(createEvents)
    if (!js.isUndefined(disableNestedActions)) __obj.updateDynamic("disableNestedActions")(disableNestedActions)
    if (disconnect != null) __obj.updateDynamic("disconnect")(disconnect)
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(enableBubble)
    if (enableBuffer != null) __obj.updateDynamic("enableBuffer")(enableBuffer)
    if (enableUrlEncode != null) __obj.updateDynamic("enableUrlEncode")(enableUrlEncode)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(fireEvent)
    if (fireEventArgs != null) __obj.updateDynamic("fireEventArgs")(fireEventArgs)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (hasListener != null) __obj.updateDynamic("hasListener")(hasListener)
    if (hasListeners != null) __obj.updateDynamic("hasListeners")(hasListeners)
    if (id != null) __obj.updateDynamic("id")(id)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (isConnected != null) __obj.updateDynamic("isConnected")(isConnected)
    if (!js.isUndefined(isObservable)) __obj.updateDynamic("isObservable")(isObservable)
    if (listeners != null) __obj.updateDynamic("listeners")(listeners)
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (mon != null) __obj.updateDynamic("mon")(mon)
    if (mun != null) __obj.updateDynamic("mun")(mun)
    if (namespace != null) __obj.updateDynamic("namespace")(namespace)
    if (on != null) __obj.updateDynamic("on")(on)
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(relayEvents)
    if (relayedEvents != null) __obj.updateDynamic("relayedEvents")(relayedEvents)
    if (removeListener != null) __obj.updateDynamic("removeListener")(removeListener)
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(removeManagedListener)
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (resumeEvent != null) __obj.updateDynamic("resumeEvent")(resumeEvent)
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(resumeEvents)
    if (self != null) __obj.updateDynamic("self")(self)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (suspendEvent != null) __obj.updateDynamic("suspendEvent")(suspendEvent)
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(suspendEvents)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (un != null) __obj.updateDynamic("un")(un)
    if (url != null) __obj.updateDynamic("url")(url)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IRemotingProvider]
  }
}

