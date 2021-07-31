package typings.emberRunloop

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object backburnerMod {
  
  @js.native
  trait Backburner extends StObject {
    
    var DEBUG: Boolean = js.native
    
    def ensureInstance(): Unit = js.native
    
    def getDebugInfo(): DebugInfo = js.native
    
    def join(args: js.Any*): Unit = js.native
    
    def on(args: js.Any*): Unit = js.native
    
    def schedule(queueName: String, target: js.Object, method: js.Function0[Unit | String]): Unit = js.native
    def schedule(queueName: String, target: Null, method: js.Function0[Unit | String]): Unit = js.native
    
    def scheduleOnce(args: js.Any*): Unit = js.native
  }
  
  trait DebugInfo extends StObject {
    
    var autorun: js.UndefOr[Error | Null] = js.undefined
    
    var counters: js.Object
    
    var instanceStack: js.Array[DeferredActionQueues]
    
    var timers: js.Array[QueueItem]
  }
  object DebugInfo {
    
    @scala.inline
    def apply(counters: js.Object, instanceStack: js.Array[DeferredActionQueues], timers: js.Array[QueueItem]): DebugInfo = {
      val __obj = js.Dynamic.literal(counters = counters.asInstanceOf[js.Any], instanceStack = instanceStack.asInstanceOf[js.Any], timers = timers.asInstanceOf[js.Any])
      __obj.asInstanceOf[DebugInfo]
    }
    
    @scala.inline
    implicit class DebugInfoMutableBuilder[Self <: DebugInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutorun(value: Error): Self = StObject.set(x, "autorun", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutorunNull: Self = StObject.set(x, "autorun", null)
      
      @scala.inline
      def setAutorunUndefined: Self = StObject.set(x, "autorun", js.undefined)
      
      @scala.inline
      def setCounters(value: js.Object): Self = StObject.set(x, "counters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceStack(value: js.Array[DeferredActionQueues]): Self = StObject.set(x, "instanceStack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceStackVarargs(value: DeferredActionQueues*): Self = StObject.set(x, "instanceStack", js.Array(value :_*))
      
      @scala.inline
      def setTimers(value: js.Array[QueueItem]): Self = StObject.set(x, "timers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimersVarargs(value: QueueItem*): Self = StObject.set(x, "timers", js.Array(value :_*))
    }
  }
  
  trait DeferredActionQueues
    extends StObject
       with /* index */ StringDictionary[js.Any] {
    
    def flush(fromAutorun: Boolean): js.Any
    
    var queues: js.Object
    
    def schedule(queueName: String, target: js.Any, method: js.Any, args: js.Any, onceFlag: Boolean, stack: js.Any): js.Any
  }
  object DeferredActionQueues {
    
    @scala.inline
    def apply(
      flush: Boolean => js.Any,
      queues: js.Object,
      schedule: (String, js.Any, js.Any, js.Any, Boolean, js.Any) => js.Any
    ): DeferredActionQueues = {
      val __obj = js.Dynamic.literal(flush = js.Any.fromFunction1(flush), queues = queues.asInstanceOf[js.Any], schedule = js.Any.fromFunction6(schedule))
      __obj.asInstanceOf[DeferredActionQueues]
    }
    
    @scala.inline
    implicit class DeferredActionQueuesMutableBuilder[Self <: DeferredActionQueues] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFlush(value: Boolean => js.Any): Self = StObject.set(x, "flush", js.Any.fromFunction1(value))
      
      @scala.inline
      def setQueues(value: js.Object): Self = StObject.set(x, "queues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchedule(value: (String, js.Any, js.Any, js.Any, Boolean, js.Any) => js.Any): Self = StObject.set(x, "schedule", js.Any.fromFunction6(value))
    }
  }
  
  trait QueueItem extends StObject {
    
    var args: js.Array[js.Object]
    
    var method: String
    
    var stack: js.UndefOr[String] = js.undefined
    
    var target: js.Object
  }
  object QueueItem {
    
    @scala.inline
    def apply(args: js.Array[js.Object], method: String, target: js.Object): QueueItem = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueueItem]
    }
    
    @scala.inline
    implicit class QueueItemMutableBuilder[Self <: QueueItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: js.Array[js.Object]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsVarargs(value: js.Object*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
      
      @scala.inline
      def setTarget(value: js.Object): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
