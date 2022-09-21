package typings.fbjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object circularBufferMod {
  
  @JSImport("fbjs/lib/CircularBuffer", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with CircularBuffer {
    
    /* CompleteClass */
    override def clear(): CircularBuffer = js.native
    
    /* CompleteClass */
    override def read(): js.Array[Any] = js.native
    
    /* CompleteClass */
    override def write(entry: Any): CircularBuffer = js.native
  }
  
  trait CircularBuffer extends StObject {
    
    def clear(): CircularBuffer
    
    def read(): js.Array[Any]
    
    def write(entry: Any): CircularBuffer
  }
  object CircularBuffer {
    
    inline def apply(clear: () => CircularBuffer, read: () => js.Array[Any], write: Any => CircularBuffer): CircularBuffer = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), read = js.Any.fromFunction0(read), write = js.Any.fromFunction1(write))
      __obj.asInstanceOf[CircularBuffer]
    }
    
    extension [Self <: CircularBuffer](x: Self) {
      
      inline def setClear(value: () => CircularBuffer): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      inline def setRead(value: () => js.Array[Any]): Self = StObject.set(x, "read", js.Any.fromFunction0(value))
      
      inline def setWrite(value: Any => CircularBuffer): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
    }
  }
}
