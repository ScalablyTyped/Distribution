package typings
package extjsLib.ExtNs.utilNs.taskrunnerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITask extends js.Object {
  /** [Method] Destroys this instance stopping this task s execution  */
  var destroy: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Property] (Boolean) */
  var fireOnStart: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Restarts this task clearing it duration expiration and run count
  		* @param interval Number Optionally reset this task's interval.
  		*/
  var restart: js.UndefOr[js.Function1[/* interval */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Starts this task if it is not already started
  		* @param interval Number Optionally reset this task's interval.
  		*/
  var start: js.UndefOr[js.Function1[/* interval */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Stops this task  */
  var stop: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object ITask {
  @scala.inline
  def apply(
    destroy: js.Function0[scala.Unit] = null,
    fireOnStart: js.UndefOr[scala.Boolean] = js.undefined,
    restart: js.Function1[/* interval */ js.UndefOr[scala.Double], scala.Unit] = null,
    start: js.Function1[/* interval */ js.UndefOr[scala.Double], scala.Unit] = null,
    stop: js.Function0[scala.Unit] = null
  ): ITask = {
    val __obj = js.Dynamic.literal()
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (!js.isUndefined(fireOnStart)) __obj.updateDynamic("fireOnStart")(fireOnStart)
    if (restart != null) __obj.updateDynamic("restart")(restart)
    if (start != null) __obj.updateDynamic("start")(start)
    if (stop != null) __obj.updateDynamic("stop")(stop)
    __obj.asInstanceOf[ITask]
  }
}

