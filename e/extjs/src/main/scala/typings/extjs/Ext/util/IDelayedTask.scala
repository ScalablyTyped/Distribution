package typings.extjs.Ext.util

import typings.extjs.Ext.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDelayedTask extends js.Object {
  /** [Method] Cancel the last queued timeout */
  var cancel: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] By default cancels any pending timeout and queues a new one
    * @param newDelay Number The milliseconds to delay
    * @param newFn Function Overrides function passed to constructor
    * @param newScope Object Overrides scope passed to constructor. Remember that if no scope is specified, this will refer to the browser window.
    * @param newArgs Array Overrides args passed to constructor
    */
  var delay: js.UndefOr[
    js.Function4[
      /* newDelay */ js.UndefOr[Double], 
      /* newFn */ js.UndefOr[js.Any], 
      /* newScope */ js.UndefOr[js.Any], 
      /* newArgs */ js.UndefOr[Array], 
      Unit
    ]
  ] = js.undefined
  /** [Property] (Number) */
  var id: js.UndefOr[Double] = js.undefined
}

object IDelayedTask {
  @scala.inline
  def apply(
    cancel: () => Unit = null,
    delay: (/* newDelay */ js.UndefOr[Double], /* newFn */ js.UndefOr[js.Any], /* newScope */ js.UndefOr[js.Any], /* newArgs */ js.UndefOr[Array]) => Unit = null,
    id: js.UndefOr[Double] = js.undefined
  ): IDelayedTask = {
    val __obj = js.Dynamic.literal()
    if (cancel != null) __obj.updateDynamic("cancel")(js.Any.fromFunction0(cancel))
    if (delay != null) __obj.updateDynamic("delay")(js.Any.fromFunction4(delay))
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDelayedTask]
  }
}

