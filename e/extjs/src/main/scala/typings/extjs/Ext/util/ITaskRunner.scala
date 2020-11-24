package typings.extjs.Ext.util

import typings.extjs.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITaskRunner extends IBase {
  
  /** [Method] Destroys this instance stopping all tasks that are currently running  */
  var destroy: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Config Option] (Boolean) */
  var fireIdleEvent: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Number) */
  var interval: js.UndefOr[Double] = js.native
  
  /** [Method] Creates a new Task instance
    * @param config Object The config object. For details on the supported properties, see start.
    */
  var newTask: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Starts a new task
    * @param task Object A config object that supports the following properties:
    * @returns Object The task
    */
  var start: js.UndefOr[js.Function1[/* task */ js.UndefOr[js.Any], _]] = js.native
  
  /** [Method] Stops an existing running task
    * @param task Object The task to stop
    * @returns Object The task
    */
  var stop: js.UndefOr[js.Function1[/* task */ js.UndefOr[js.Any], _]] = js.native
  
  /** [Method] Stops all tasks that are currently running  */
  var stopAll: js.UndefOr[js.Function0[Unit]] = js.native
}
object ITaskRunner {
  
  @scala.inline
  def apply(): ITaskRunner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITaskRunner]
  }
  
  @scala.inline
  implicit class ITaskRunnerOps[Self <: ITaskRunner] (val x: Self) extends AnyVal {
    
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
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    
    @scala.inline
    def setFireIdleEvent(value: Boolean): Self = this.set("fireIdleEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFireIdleEvent: Self = this.set("fireIdleEvent", js.undefined)
    
    @scala.inline
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    
    @scala.inline
    def setNewTask(value: /* config */ js.UndefOr[js.Any] => Unit): Self = this.set("newTask", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteNewTask: Self = this.set("newTask", js.undefined)
    
    @scala.inline
    def setStart(value: /* task */ js.UndefOr[js.Any] => _): Self = this.set("start", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    
    @scala.inline
    def setStop(value: /* task */ js.UndefOr[js.Any] => _): Self = this.set("stop", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteStop: Self = this.set("stop", js.undefined)
    
    @scala.inline
    def setStopAll(value: () => Unit): Self = this.set("stopAll", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteStopAll: Self = this.set("stopAll", js.undefined)
  }
}
