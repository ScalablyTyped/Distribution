package typings.extjs.Ext.util

import typings.extjs.Ext.Array
import typings.extjs.Ext.IBase
import typings.extjs.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITaskRunner extends IBase {
  /** [Method] Destroys this instance stopping all tasks that are currently running  */
  var destroy: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var fireIdleEvent: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Number) */
  var interval: js.UndefOr[Double] = js.undefined
  /** [Method] Creates a new Task instance
  		* @param config Object The config object. For details on the supported properties, see start.
  		*/
  var newTask: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Starts a new task
  		* @param task Object A config object that supports the following properties:
  		* @returns Object The task
  		*/
  var start: js.UndefOr[js.Function1[/* task */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Stops an existing running task
  		* @param task Object The task to stop
  		* @returns Object The task
  		*/
  var stop: js.UndefOr[js.Function1[/* task */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Stops all tasks that are currently running  */
  var stopAll: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object ITaskRunner {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    config: js.Any = null,
    destroy: () => Unit = null,
    extend: java.lang.String = null,
    fireIdleEvent: js.UndefOr[Boolean] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => ITaskRunner = null,
    interval: Int | Double = null,
    mixins: js.Any = null,
    newTask: /* config */ js.UndefOr[js.Any] => Unit = null,
    requires: Array = null,
    self: IClass = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    start: /* task */ js.UndefOr[js.Any] => _ = null,
    statics: js.Any = null,
    stop: /* task */ js.UndefOr[js.Any] => _ = null,
    stopAll: () => Unit = null,
    uses: Array = null
  ): ITaskRunner = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (!js.isUndefined(fireIdleEvent)) __obj.updateDynamic("fireIdleEvent")(fireIdleEvent.asInstanceOf[js.Any])
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (newTask != null) __obj.updateDynamic("newTask")(js.Any.fromFunction1(newTask))
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction1(start))
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction1(stop))
    if (stopAll != null) __obj.updateDynamic("stopAll")(js.Any.fromFunction0(stopAll))
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITaskRunner]
  }
}

