package typings.emberRunloop

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object privateBackburnerMod {
  
  @js.native
  trait Backburner extends StObject {
    
    var DEBUG: Boolean = js.native
    
    def ensureInstance(): Unit = js.native
    
    def getDebugInfo(): DebugInfo = js.native
    
    def join(args: Any*): Unit = js.native
    
    def on(args: Any*): Unit = js.native
    
    def schedule(queueName: String, target: js.Object, method: js.Function0[Unit | String]): Unit = js.native
    def schedule(queueName: String, target: Null, method: js.Function0[Unit | String]): Unit = js.native
    
    def scheduleOnce(args: Any*): Unit = js.native
  }
  
  trait DebugInfo extends StObject {
    
    var autorun: js.UndefOr[js.Error | Null] = js.undefined
    
    var counters: js.Object
    
    var instanceStack: js.Array[DeferredActionQueues]
    
    var timers: js.Array[QueueItem]
  }
  object DebugInfo {
    
    inline def apply(counters: js.Object, instanceStack: js.Array[DeferredActionQueues], timers: js.Array[QueueItem]): DebugInfo = {
      val __obj = js.Dynamic.literal(counters = counters.asInstanceOf[js.Any], instanceStack = instanceStack.asInstanceOf[js.Any], timers = timers.asInstanceOf[js.Any])
      __obj.asInstanceOf[DebugInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DebugInfo] (val x: Self) extends AnyVal {
      
      inline def setAutorun(value: js.Error): Self = StObject.set(x, "autorun", value.asInstanceOf[js.Any])
      
      inline def setAutorunNull: Self = StObject.set(x, "autorun", null)
      
      inline def setAutorunUndefined: Self = StObject.set(x, "autorun", js.undefined)
      
      inline def setCounters(value: js.Object): Self = StObject.set(x, "counters", value.asInstanceOf[js.Any])
      
      inline def setInstanceStack(value: js.Array[DeferredActionQueues]): Self = StObject.set(x, "instanceStack", value.asInstanceOf[js.Any])
      
      inline def setInstanceStackVarargs(value: DeferredActionQueues*): Self = StObject.set(x, "instanceStack", js.Array(value*))
      
      inline def setTimers(value: js.Array[QueueItem]): Self = StObject.set(x, "timers", value.asInstanceOf[js.Any])
      
      inline def setTimersVarargs(value: QueueItem*): Self = StObject.set(x, "timers", js.Array(value*))
    }
  }
  
  trait DeferredActionQueues
    extends StObject
       with /* index */ StringDictionary[Any] {
    
    def flush(fromAutorun: Boolean): Any
    
    var queues: js.Object
    
    def schedule[T, M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EmberMethod<T> */ Any */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [queueName: string, target: T, method: M, methodArgs: ...EmberMethodParams<T, M>, onceFlag: boolean, stack: unknown] is not an array type */ args: /* import warning: importer.ImportType#apply c repeated non-array type: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EmberMethodParams<T, M> * / any */ /* methodArgs */ js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EmberMethodParams<T, M> */ Any
        ]
    ): Any
  }
  object DeferredActionQueues {
    
    inline def apply(
      flush: Boolean => Any,
      queues: js.Object,
      schedule: /* import warning: importer.ImportType#apply c repeated non-array type: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EmberMethodParams<T, M> * / any */ /* methodArgs */ js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EmberMethodParams<T, M> */ Any
        ] => Any
    ): DeferredActionQueues = {
      val __obj = js.Dynamic.literal(flush = js.Any.fromFunction1(flush), queues = queues.asInstanceOf[js.Any], schedule = js.Any.fromFunction1(schedule))
      __obj.asInstanceOf[DeferredActionQueues]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DeferredActionQueues] (val x: Self) extends AnyVal {
      
      inline def setFlush(value: Boolean => Any): Self = StObject.set(x, "flush", js.Any.fromFunction1(value))
      
      inline def setQueues(value: js.Object): Self = StObject.set(x, "queues", value.asInstanceOf[js.Any])
      
      inline def setSchedule(
        value: /* import warning: importer.ImportType#apply c repeated non-array type: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EmberMethodParams<T, M> * / any */ /* methodArgs */ js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EmberMethodParams<T, M> */ Any
            ] => Any
      ): Self = StObject.set(x, "schedule", js.Any.fromFunction1(value))
    }
  }
  
  trait QueueItem extends StObject {
    
    var args: js.Array[js.Object]
    
    var method: String
    
    var stack: js.UndefOr[String] = js.undefined
    
    var target: js.Object
  }
  object QueueItem {
    
    inline def apply(args: js.Array[js.Object], method: String, target: js.Object): QueueItem = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueueItem]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QueueItem] (val x: Self) extends AnyVal {
      
      inline def setArgs(value: js.Array[js.Object]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsVarargs(value: js.Object*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
      
      inline def setTarget(value: js.Object): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
