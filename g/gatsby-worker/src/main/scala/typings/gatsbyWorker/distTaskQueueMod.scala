package typings.gatsbyWorker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTaskQueueMod {
  
  @JSImport("gatsby-worker/dist/task-queue", "TaskQueue")
  @js.native
  open class TaskQueue[ValueType] () extends StObject {
    
    /**
      * Puts new task at the end of the list
      * @param task Task to add to the queue
      */
    def enqueue(task: ValueType): Unit = js.native
    
    /* private */ var head: Any = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[js.Iterator[ITaskQueueNode[ValueType]]] = js.native
    
    /**
      * Remove a task node from the queue
      * @param taskNode Queue's node to remove
      */
    def remove(taskNode: ITaskQueueNode[ValueType]): Unit = js.native
    
    /* private */ var tail: Any = js.native
  }
  
  trait ITaskQueueNode[ValueType] extends StObject {
    
    var next: js.UndefOr[ITaskQueueNode[ValueType]] = js.undefined
    
    var prev: js.UndefOr[ITaskQueueNode[ValueType]] = js.undefined
    
    var value: ValueType
  }
  object ITaskQueueNode {
    
    inline def apply[ValueType](value: ValueType): ITaskQueueNode[ValueType] = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITaskQueueNode[ValueType]]
    }
    
    extension [Self <: ITaskQueueNode[?], ValueType](x: Self & ITaskQueueNode[ValueType]) {
      
      inline def setNext(value: ITaskQueueNode[ValueType]): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
      
      inline def setPrev(value: ITaskQueueNode[ValueType]): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
      
      inline def setPrevUndefined: Self = StObject.set(x, "prev", js.undefined)
      
      inline def setValue(value: ValueType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
