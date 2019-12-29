package typings.extjs.Ext.data

import typings.extjs.Ext.Array
import typings.extjs.Ext.IClass
import typings.extjs.Ext.util.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBatch extends IObservable {
  /** [Method] Adds a new operation to this batch at the end of the operations array
  		* @param operation Object The Operation object
  		* @returns Ext.data.Batch this
  		*/
  var add: js.UndefOr[js.Function1[/* operation */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Config Option] (Boolean) */
  var autoStart: js.UndefOr[Boolean] = js.undefined
  /** [Property] (Number) */
  var current: js.UndefOr[Double] = js.undefined
  /** [Property] (Ext.data.Operation[]) */
  var exceptions: js.UndefOr[Array] = js.undefined
  /** [Property] (Boolean) */
  var hasException: js.UndefOr[Boolean] = js.undefined
  /** [Property] (Boolean) */
  var isComplete: js.UndefOr[Boolean] = js.undefined
  /** [Property] (Boolean) */
  var isRunning: js.UndefOr[Boolean] = js.undefined
  /** [Property] (Ext.data.Operation[]) */
  var operations: js.UndefOr[Array] = js.undefined
  /** [Method] Pauses execution of the batch but does not cancel the current operation
  		* @returns Ext.data.Batch this
  		*/
  var pause: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Config Option] (Boolean) */
  var pauseOnException: js.UndefOr[Boolean] = js.undefined
  /** [Method] Kicks off execution of the batch continuing from the current operation
  		* @returns Ext.data.Batch this
  		*/
  var retry: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Executes an operation by its numeric index in the operations array
  		* @param index Number The operation index to run
  		* @returns Ext.data.Batch this
  		*/
  var runOperation: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], this.type]] = js.undefined
  /** [Method] Kicks off execution of the batch continuing from the next operation if the previous operation encountered an excepti
  		* @param index Object
  		* @returns Ext.data.Batch this
  		*/
  var start: js.UndefOr[js.Function1[/* index */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Property] (Number) */
  var total: js.UndefOr[Double] = js.undefined
}

object IBatch {
  @scala.inline
  def apply(
    add: /* operation */ js.UndefOr[js.Any] => IBatch = null,
    addEvents: /* eventNames */ js.UndefOr[js.Any] => Unit = null,
    addListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    addManagedListener: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    autoStart: js.UndefOr[Boolean] = js.undefined,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    clearListeners: () => Unit = null,
    clearManagedListeners: () => Unit = null,
    config: js.Any = null,
    current: Int | Double = null,
    enableBubble: /* eventNames */ js.UndefOr[js.Any] => Unit = null,
    exceptions: Array = null,
    extend: String = null,
    fireEvent: (/* eventName */ String, /* repeated */ js.Any) => Boolean = null,
    fireEventArgs: (/* eventName */ js.UndefOr[String], /* args */ js.UndefOr[Array]) => Boolean = null,
    getInitialConfig: /* name */ js.UndefOr[String] => _ = null,
    hasException: js.UndefOr[Boolean] = js.undefined,
    hasListener: /* eventName */ js.UndefOr[String] => Boolean = null,
    hasListeners: js.Any = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => IBatch = null,
    isComplete: js.UndefOr[Boolean] = js.undefined,
    isObservable: js.UndefOr[Boolean] = js.undefined,
    isRunning: js.UndefOr[Boolean] = js.undefined,
    listeners: js.Any = null,
    mixins: js.Any = null,
    mon: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    mun: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    on: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    operations: Array = null,
    pause: () => IBatch = null,
    pauseOnException: js.UndefOr[Boolean] = js.undefined,
    relayEvents: (/* origin */ js.UndefOr[js.Any], /* events */ js.UndefOr[Array], /* prefix */ js.UndefOr[String]) => _ = null,
    removeListener: (/* eventName */ js.UndefOr[String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    removeManagedListener: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    requires: Array = null,
    resumeEvent: /* repeated */ js.Any => Unit = null,
    resumeEvents: () => Unit = null,
    retry: () => IBatch = null,
    runOperation: /* index */ js.UndefOr[Double] => IBatch = null,
    self: IClass = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    start: /* index */ js.UndefOr[js.Any] => IBatch = null,
    statics: js.Any = null,
    suspendEvent: /* repeated */ js.Any => Unit = null,
    suspendEvents: /* queueSuspended */ js.UndefOr[Boolean] => Unit = null,
    total: Int | Double = null,
    un: (/* eventName */ js.UndefOr[String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    uses: Array = null
  ): IBatch = {
    val __obj = js.Dynamic.literal()
    if (add != null) __obj.updateDynamic("add")(js.Any.fromFunction1(add))
    if (addEvents != null) __obj.updateDynamic("addEvents")(js.Any.fromFunction1(addEvents))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction4(addListener))
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(js.Any.fromFunction5(addManagedListener))
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(autoStart)) __obj.updateDynamic("autoStart")(autoStart.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(js.Any.fromFunction0(clearListeners))
    if (clearManagedListeners != null) __obj.updateDynamic("clearManagedListeners")(js.Any.fromFunction0(clearManagedListeners))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (current != null) __obj.updateDynamic("current")(current.asInstanceOf[js.Any])
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1(enableBubble))
    if (exceptions != null) __obj.updateDynamic("exceptions")(exceptions.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction2(fireEvent))
    if (fireEventArgs != null) __obj.updateDynamic("fireEventArgs")(js.Any.fromFunction2(fireEventArgs))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (!js.isUndefined(hasException)) __obj.updateDynamic("hasException")(hasException.asInstanceOf[js.Any])
    if (hasListener != null) __obj.updateDynamic("hasListener")(js.Any.fromFunction1(hasListener))
    if (hasListeners != null) __obj.updateDynamic("hasListeners")(hasListeners.asInstanceOf[js.Any])
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (!js.isUndefined(isComplete)) __obj.updateDynamic("isComplete")(isComplete.asInstanceOf[js.Any])
    if (!js.isUndefined(isObservable)) __obj.updateDynamic("isObservable")(isObservable.asInstanceOf[js.Any])
    if (!js.isUndefined(isRunning)) __obj.updateDynamic("isRunning")(isRunning.asInstanceOf[js.Any])
    if (listeners != null) __obj.updateDynamic("listeners")(listeners.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (mon != null) __obj.updateDynamic("mon")(js.Any.fromFunction5(mon))
    if (mun != null) __obj.updateDynamic("mun")(js.Any.fromFunction4(mun))
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction4(on))
    if (operations != null) __obj.updateDynamic("operations")(operations.asInstanceOf[js.Any])
    if (pause != null) __obj.updateDynamic("pause")(js.Any.fromFunction0(pause))
    if (!js.isUndefined(pauseOnException)) __obj.updateDynamic("pauseOnException")(pauseOnException.asInstanceOf[js.Any])
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(js.Any.fromFunction3(relayEvents))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction3(removeListener))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4(removeManagedListener))
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    if (resumeEvent != null) __obj.updateDynamic("resumeEvent")(js.Any.fromFunction1(resumeEvent))
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(js.Any.fromFunction0(resumeEvents))
    if (retry != null) __obj.updateDynamic("retry")(js.Any.fromFunction0(retry))
    if (runOperation != null) __obj.updateDynamic("runOperation")(js.Any.fromFunction1(runOperation))
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction1(start))
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (suspendEvent != null) __obj.updateDynamic("suspendEvent")(js.Any.fromFunction1(suspendEvent))
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(js.Any.fromFunction1(suspendEvents))
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction3(un))
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBatch]
  }
}

