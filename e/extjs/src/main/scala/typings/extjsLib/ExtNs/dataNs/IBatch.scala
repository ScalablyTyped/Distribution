package typings
package extjsLib.ExtNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBatch
  extends extjsLib.ExtNs.utilNs.IObservable {
  /** [Method] Adds a new operation to this batch at the end of the operations array
  		* @param operation Object The Operation object
  		* @returns Ext.data.Batch this
  		*/
  var add: js.UndefOr[js.Function1[/* operation */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Config Option] (Boolean) */
  var autoStart: js.UndefOr[scala.Boolean] = js.undefined
  /** [Property] (Number) */
  var current: js.UndefOr[scala.Double] = js.undefined
  /** [Property] (Ext.data.Operation[]) */
  var exceptions: js.UndefOr[extjsLib.ExtNs.Array] = js.undefined
  /** [Property] (Boolean) */
  var hasException: js.UndefOr[scala.Boolean] = js.undefined
  /** [Property] (Boolean) */
  var isComplete: js.UndefOr[scala.Boolean] = js.undefined
  /** [Property] (Boolean) */
  var isRunning: js.UndefOr[scala.Boolean] = js.undefined
  /** [Property] (Ext.data.Operation[]) */
  var operations: js.UndefOr[extjsLib.ExtNs.Array] = js.undefined
  /** [Method] Pauses execution of the batch but does not cancel the current operation
  		* @returns Ext.data.Batch this
  		*/
  var pause: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Config Option] (Boolean) */
  var pauseOnException: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Kicks off execution of the batch continuing from the current operation
  		* @returns Ext.data.Batch this
  		*/
  var retry: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Executes an operation by its numeric index in the operations array
  		* @param index Number The operation index to run
  		* @returns Ext.data.Batch this
  		*/
  var runOperation: js.UndefOr[js.Function1[/* index */ js.UndefOr[scala.Double], this.type]] = js.undefined
  /** [Method] Kicks off execution of the batch continuing from the next operation if the previous operation encountered an excepti
  		* @param index Object
  		* @returns Ext.data.Batch this
  		*/
  var start: js.UndefOr[js.Function1[/* index */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Property] (Number) */
  var total: js.UndefOr[scala.Double] = js.undefined
}

object IBatch {
  @scala.inline
  def apply(
    add: js.Function1[/* operation */ js.UndefOr[js.Any], IBatch] = null,
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
    autoStart: js.UndefOr[scala.Boolean] = js.undefined,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    clearListeners: js.Function0[scala.Unit] = null,
    clearManagedListeners: js.Function0[scala.Unit] = null,
    config: js.Any = null,
    current: scala.Int | scala.Double = null,
    enableBubble: js.Function1[/* eventNames */ js.UndefOr[js.Any], scala.Unit] = null,
    exceptions: extjsLib.ExtNs.Array = null,
    extend: java.lang.String = null,
    fireEvent: js.Function2[/* eventName */ java.lang.String, /* repeated */ js.Any, scala.Boolean] = null,
    fireEventArgs: js.Function2[
      /* eventName */ js.UndefOr[java.lang.String], 
      /* args */ js.UndefOr[extjsLib.ExtNs.Array], 
      scala.Boolean
    ] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    hasException: js.UndefOr[scala.Boolean] = js.undefined,
    hasListener: js.Function1[/* eventName */ js.UndefOr[java.lang.String], scala.Boolean] = null,
    hasListeners: js.Any = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* config */ js.UndefOr[js.Any], IBatch] = null,
    isComplete: js.UndefOr[scala.Boolean] = js.undefined,
    isObservable: js.UndefOr[scala.Boolean] = js.undefined,
    isRunning: js.UndefOr[scala.Boolean] = js.undefined,
    listeners: js.Any = null,
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
    on: js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      _
    ] = null,
    operations: extjsLib.ExtNs.Array = null,
    pause: js.Function0[IBatch] = null,
    pauseOnException: js.UndefOr[scala.Boolean] = js.undefined,
    relayEvents: js.Function3[
      /* origin */ js.UndefOr[js.Any], 
      /* events */ js.UndefOr[extjsLib.ExtNs.Array], 
      /* prefix */ js.UndefOr[java.lang.String], 
      _
    ] = null,
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
    retry: js.Function0[IBatch] = null,
    runOperation: js.Function1[/* index */ js.UndefOr[scala.Double], IBatch] = null,
    self: extjsLib.ExtNs.IClass = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    start: js.Function1[/* index */ js.UndefOr[js.Any], IBatch] = null,
    statics: js.Any = null,
    suspendEvent: js.Function1[/* repeated */ js.Any, scala.Unit] = null,
    suspendEvents: js.Function1[/* queueSuspended */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    total: scala.Int | scala.Double = null,
    un: js.Function3[
      /* eventName */ js.UndefOr[java.lang.String], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    uses: extjsLib.ExtNs.Array = null
  ): IBatch = {
    val __obj = js.Dynamic.literal()
    if (add != null) __obj.updateDynamic("add")(add)
    if (addEvents != null) __obj.updateDynamic("addEvents")(addEvents)
    if (addListener != null) __obj.updateDynamic("addListener")(addListener)
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(addManagedListener)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (!js.isUndefined(autoStart)) __obj.updateDynamic("autoStart")(autoStart)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(clearListeners)
    if (clearManagedListeners != null) __obj.updateDynamic("clearManagedListeners")(clearManagedListeners)
    if (config != null) __obj.updateDynamic("config")(config)
    if (current != null) __obj.updateDynamic("current")(current.asInstanceOf[js.Any])
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(enableBubble)
    if (exceptions != null) __obj.updateDynamic("exceptions")(exceptions)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(fireEvent)
    if (fireEventArgs != null) __obj.updateDynamic("fireEventArgs")(fireEventArgs)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (!js.isUndefined(hasException)) __obj.updateDynamic("hasException")(hasException)
    if (hasListener != null) __obj.updateDynamic("hasListener")(hasListener)
    if (hasListeners != null) __obj.updateDynamic("hasListeners")(hasListeners)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (!js.isUndefined(isComplete)) __obj.updateDynamic("isComplete")(isComplete)
    if (!js.isUndefined(isObservable)) __obj.updateDynamic("isObservable")(isObservable)
    if (!js.isUndefined(isRunning)) __obj.updateDynamic("isRunning")(isRunning)
    if (listeners != null) __obj.updateDynamic("listeners")(listeners)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (mon != null) __obj.updateDynamic("mon")(mon)
    if (mun != null) __obj.updateDynamic("mun")(mun)
    if (on != null) __obj.updateDynamic("on")(on)
    if (operations != null) __obj.updateDynamic("operations")(operations)
    if (pause != null) __obj.updateDynamic("pause")(pause)
    if (!js.isUndefined(pauseOnException)) __obj.updateDynamic("pauseOnException")(pauseOnException)
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(relayEvents)
    if (removeListener != null) __obj.updateDynamic("removeListener")(removeListener)
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(removeManagedListener)
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (resumeEvent != null) __obj.updateDynamic("resumeEvent")(resumeEvent)
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(resumeEvents)
    if (retry != null) __obj.updateDynamic("retry")(retry)
    if (runOperation != null) __obj.updateDynamic("runOperation")(runOperation)
    if (self != null) __obj.updateDynamic("self")(self)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (start != null) __obj.updateDynamic("start")(start)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (suspendEvent != null) __obj.updateDynamic("suspendEvent")(suspendEvent)
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(suspendEvents)
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    if (un != null) __obj.updateDynamic("un")(un)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IBatch]
  }
}

