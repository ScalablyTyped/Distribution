package typings
package extjsLib.ExtNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITaskRunner
  extends extjsLib.ExtNs.IBase {
  /** [Method] Destroys this instance stopping all tasks that are currently running  */
  var destroy: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var fireIdleEvent: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Number) */
  var interval: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Creates a new Task instance
  		* @param config Object The config object. For details on the supported properties, see start.
  		*/
  var newTask: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
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
  var stopAll: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object ITaskRunner {
  @scala.inline
  def apply(
    alias: extjsLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    config: js.Any = null,
    destroy: js.Function0[scala.Unit] = null,
    extend: java.lang.String = null,
    fireIdleEvent: js.UndefOr[scala.Boolean] = js.undefined,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* config */ js.UndefOr[js.Any], ITaskRunner] = null,
    interval: scala.Int | scala.Double = null,
    mixins: js.Any = null,
    newTask: js.Function1[/* config */ js.UndefOr[js.Any], scala.Unit] = null,
    requires: extjsLib.ExtNs.Array = null,
    self: extjsLib.ExtNs.IClass = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    start: js.Function1[/* task */ js.UndefOr[js.Any], _] = null,
    statics: js.Any = null,
    stop: js.Function1[/* task */ js.UndefOr[js.Any], _] = null,
    stopAll: js.Function0[scala.Unit] = null,
    uses: extjsLib.ExtNs.Array = null
  ): ITaskRunner = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (config != null) __obj.updateDynamic("config")(config)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (!js.isUndefined(fireIdleEvent)) __obj.updateDynamic("fireIdleEvent")(fireIdleEvent)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (newTask != null) __obj.updateDynamic("newTask")(newTask)
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (self != null) __obj.updateDynamic("self")(self)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (start != null) __obj.updateDynamic("start")(start)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (stop != null) __obj.updateDynamic("stop")(stop)
    if (stopAll != null) __obj.updateDynamic("stopAll")(stopAll)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[ITaskRunner]
  }
}

