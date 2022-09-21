package typings.fastFifo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fast-fifo", JSImport.Namespace)
  @js.native
  open class ^[T] ()
    extends StObject
       with FastFIFO[T] {
    def this(hwm: Double) = this()
    
    /* CompleteClass */
    var head: typings.fastFifo.fixedSizeMod.^[T] = js.native
    
    /* CompleteClass */
    var hwm: Double = js.native
    
    /* CompleteClass */
    override def isEmpty(): Boolean = js.native
    
    /* CompleteClass */
    override def push(`val`: T): Unit = js.native
    
    /* CompleteClass */
    override def shift(): js.UndefOr[T] = js.native
    
    /* CompleteClass */
    var tail: typings.fastFifo.fixedSizeMod.^[T] = js.native
  }
  
  trait FastFIFO[T] extends StObject {
    
    var head: typings.fastFifo.fixedSizeMod.^[T]
    
    var hwm: Double
    
    def isEmpty(): Boolean
    
    def push(`val`: T): Unit
    
    def shift(): js.UndefOr[T]
    
    var tail: typings.fastFifo.fixedSizeMod.^[T]
  }
  object FastFIFO {
    
    inline def apply[T](
      head: typings.fastFifo.fixedSizeMod.^[T],
      hwm: Double,
      isEmpty: () => Boolean,
      push: T => Unit,
      shift: () => js.UndefOr[T],
      tail: typings.fastFifo.fixedSizeMod.^[T]
    ): FastFIFO[T] = {
      val __obj = js.Dynamic.literal(head = head.asInstanceOf[js.Any], hwm = hwm.asInstanceOf[js.Any], isEmpty = js.Any.fromFunction0(isEmpty), push = js.Any.fromFunction1(push), shift = js.Any.fromFunction0(shift), tail = tail.asInstanceOf[js.Any])
      __obj.asInstanceOf[FastFIFO[T]]
    }
    
    extension [Self <: FastFIFO[?], T](x: Self & FastFIFO[T]) {
      
      inline def setHead(value: typings.fastFifo.fixedSizeMod.^[T]): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
      
      inline def setHwm(value: Double): Self = StObject.set(x, "hwm", value.asInstanceOf[js.Any])
      
      inline def setIsEmpty(value: () => Boolean): Self = StObject.set(x, "isEmpty", js.Any.fromFunction0(value))
      
      inline def setPush(value: T => Unit): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
      
      inline def setShift(value: () => js.UndefOr[T]): Self = StObject.set(x, "shift", js.Any.fromFunction0(value))
      
      inline def setTail(value: typings.fastFifo.fixedSizeMod.^[T]): Self = StObject.set(x, "tail", value.asInstanceOf[js.Any])
    }
  }
}
