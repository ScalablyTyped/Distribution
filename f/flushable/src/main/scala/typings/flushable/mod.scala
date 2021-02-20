package typings.flushable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("flushable", JSImport.Namespace)
  @js.native
  def apply(onComplete: FlushableOnCompleteHandler, delay: Double): FlushableOperation = js.native
  
  type FlushableOnCompleteHandler = js.Function1[/* flushed */ Boolean, js.Any]
  
  @js.native
  trait FlushableOperation extends StObject {
    
    /** Stops the callback from being executed */
    def cancel(): Unit = js.native
    
    /** Immediately executes the callback */
    def flush(): Unit = js.native
    
    /** Returns whether or not the callback has been executed */
    def pending(): Boolean = js.native
  }
  object FlushableOperation {
    
    @scala.inline
    def apply(cancel: () => Unit, flush: () => Unit, pending: () => Boolean): FlushableOperation = {
      val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), flush = js.Any.fromFunction0(flush), pending = js.Any.fromFunction0(pending))
      __obj.asInstanceOf[FlushableOperation]
    }
    
    @scala.inline
    implicit class FlushableOperationMutableBuilder[Self <: FlushableOperation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFlush(value: () => Unit): Self = StObject.set(x, "flush", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPending(value: () => Boolean): Self = StObject.set(x, "pending", js.Any.fromFunction0(value))
    }
  }
}
