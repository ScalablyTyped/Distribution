package typings.extjs.Ext.util

import typings.extjs.Ext.IBase
import org.scalablytyped.runtime.StObject
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
  implicit class ITaskRunnerMutableBuilder[Self <: ITaskRunner] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
    
    @scala.inline
    def setFireIdleEvent(value: Boolean): Self = StObject.set(x, "fireIdleEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFireIdleEventUndefined: Self = StObject.set(x, "fireIdleEvent", js.undefined)
    
    @scala.inline
    def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    @scala.inline
    def setNewTask(value: /* config */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "newTask", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNewTaskUndefined: Self = StObject.set(x, "newTask", js.undefined)
    
    @scala.inline
    def setStart(value: /* task */ js.UndefOr[js.Any] => _): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    @scala.inline
    def setStop(value: /* task */ js.UndefOr[js.Any] => _): Self = StObject.set(x, "stop", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStopAll(value: () => Unit): Self = StObject.set(x, "stopAll", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStopAllUndefined: Self = StObject.set(x, "stopAll", js.undefined)
    
    @scala.inline
    def setStopUndefined: Self = StObject.set(x, "stop", js.undefined)
  }
}
