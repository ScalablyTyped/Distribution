package typings.extjs.Ext.util

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object taskrunner {
  
  @js.native
  trait ITask extends StObject {
    
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
    implicit class ITaskMutableBuilder[Self <: ITask] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      @scala.inline
      def setFireOnStart(value: Boolean): Self = StObject.set(x, "fireOnStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFireOnStartUndefined: Self = StObject.set(x, "fireOnStart", js.undefined)
      
      @scala.inline
      def setRestart(value: /* interval */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "restart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRestartUndefined: Self = StObject.set(x, "restart", js.undefined)
      
      @scala.inline
      def setStart(value: /* interval */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      @scala.inline
      def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStopUndefined: Self = StObject.set(x, "stop", js.undefined)
    }
  }
}
