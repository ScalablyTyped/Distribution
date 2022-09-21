package typings.flushable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(onComplete: FlushableOnCompleteHandler, delay: Double): FlushableOperation = (^.asInstanceOf[js.Dynamic].apply(onComplete.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[FlushableOperation]
  
  @JSImport("flushable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type FlushableOnCompleteHandler = js.Function1[/* flushed */ Boolean, Any]
  
  trait FlushableOperation extends StObject {
    
    /** Stops the callback from being executed */
    def cancel(): Unit
    
    /** Immediately executes the callback */
    def flush(): Unit
    
    /** Returns whether or not the callback has been executed */
    def pending(): Boolean
  }
  object FlushableOperation {
    
    inline def apply(cancel: () => Unit, flush: () => Unit, pending: () => Boolean): FlushableOperation = {
      val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), flush = js.Any.fromFunction0(flush), pending = js.Any.fromFunction0(pending))
      __obj.asInstanceOf[FlushableOperation]
    }
    
    extension [Self <: FlushableOperation](x: Self) {
      
      inline def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
      
      inline def setFlush(value: () => Unit): Self = StObject.set(x, "flush", js.Any.fromFunction0(value))
      
      inline def setPending(value: () => Boolean): Self = StObject.set(x, "pending", js.Any.fromFunction0(value))
    }
  }
}
