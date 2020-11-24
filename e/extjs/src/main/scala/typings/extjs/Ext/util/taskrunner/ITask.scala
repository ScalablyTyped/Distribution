package typings.extjs.Ext.util.taskrunner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITask extends js.Object {
  
  /** [Method] Destroys this instance stopping this task s execution  */
  var destroy: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Property] (Boolean) */
  var fireOnStart: js.UndefOr[Boolean] = js.native
  
  /** [Method] Restarts this task clearing it duration expiration and run count
    * @param interval Number Optionally reset this task's interval.
    */
  var restart: js.UndefOr[js.Function1[/* interval */ js.UndefOr[Double], Unit]] = js.native
  
  /** [Method] Starts this task if it is not already started
    * @param interval Number Optionally reset this task's interval.
    */
  var start: js.UndefOr[js.Function1[/* interval */ js.UndefOr[Double], Unit]] = js.native
  
  /** [Method] Stops this task  */
  var stop: js.UndefOr[js.Function0[Unit]] = js.native
}
object ITask {
  
  @scala.inline
  def apply(): ITask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITask]
  }
  
  @scala.inline
  implicit class ITaskOps[Self <: ITask] (val x: Self) extends AnyVal {
    
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
    def setFireOnStart(value: Boolean): Self = this.set("fireOnStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFireOnStart: Self = this.set("fireOnStart", js.undefined)
    
    @scala.inline
    def setRestart(value: /* interval */ js.UndefOr[Double] => Unit): Self = this.set("restart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRestart: Self = this.set("restart", js.undefined)
    
    @scala.inline
    def setStart(value: /* interval */ js.UndefOr[Double] => Unit): Self = this.set("start", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    
    @scala.inline
    def setStop(value: () => Unit): Self = this.set("stop", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteStop: Self = this.set("stop", js.undefined)
  }
}
