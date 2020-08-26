package typings.extjs.Ext.util

import typings.extjs.Ext.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDelayedTask extends js.Object {
  /** [Method] Cancel the last queued timeout */
  var cancel: js.UndefOr[js.Function0[Unit]] = js.native
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
  ] = js.native
  /** [Property] (Number) */
  var id: js.UndefOr[Double] = js.native
}

object IDelayedTask {
  @scala.inline
  def apply(): IDelayedTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDelayedTask]
  }
  @scala.inline
  implicit class IDelayedTaskOps[Self <: IDelayedTask] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCancel(value: () => Unit): Self = this.set("cancel", js.Any.fromFunction0(value))
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    @scala.inline
    def setDelay(
      value: (/* newDelay */ js.UndefOr[Double], /* newFn */ js.UndefOr[js.Any], /* newScope */ js.UndefOr[js.Any], /* newArgs */ js.UndefOr[Array]) => Unit
    ): Self = this.set("delay", js.Any.fromFunction4(value))
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
  }
  
}

