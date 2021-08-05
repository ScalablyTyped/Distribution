package typings.extjs.Ext.util

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object taskrunner {
  
  trait ITask extends StObject {
    
    /** [Method] Destroys this instance stopping this task s execution  */
    var destroy: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Property] (Boolean) */
    var fireOnStart: js.UndefOr[Boolean] = js.undefined
    
    /** [Method] Restarts this task clearing it duration expiration and run count
      * @param interval Number Optionally reset this task's interval.
      */
    var restart: js.UndefOr[js.Function1[/* interval */ js.UndefOr[Double], Unit]] = js.undefined
    
    /** [Method] Starts this task if it is not already started
      * @param interval Number Optionally reset this task's interval.
      */
    var start: js.UndefOr[js.Function1[/* interval */ js.UndefOr[Double], Unit]] = js.undefined
    
    /** [Method] Stops this task  */
    var stop: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object ITask {
    
    inline def apply(): ITask = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITask]
    }
    
    extension [Self <: ITask](x: Self) {
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      inline def setFireOnStart(value: Boolean): Self = StObject.set(x, "fireOnStart", value.asInstanceOf[js.Any])
      
      inline def setFireOnStartUndefined: Self = StObject.set(x, "fireOnStart", js.undefined)
      
      inline def setRestart(value: /* interval */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "restart", js.Any.fromFunction1(value))
      
      inline def setRestartUndefined: Self = StObject.set(x, "restart", js.undefined)
      
      inline def setStart(value: /* interval */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
      
      inline def setStopUndefined: Self = StObject.set(x, "stop", js.undefined)
    }
  }
}
