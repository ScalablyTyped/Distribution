package typings.fastFifo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fixedSizeMod {
  
  @JSImport("fast-fifo/fixed-size", JSImport.Namespace)
  @js.native
  open class ^[T] protected ()
    extends StObject
       with FixedFIFO[T] {
    def this(hwm: Double) = this()
    
    /* CompleteClass */
    var btm: Double = js.native
    
    /* CompleteClass */
    var buffer: js.Array[T] = js.native
    
    /* CompleteClass */
    override def isEmpty(): Boolean = js.native
    
    /* CompleteClass */
    var mask: Double = js.native
    
    /* CompleteClass */
    var next: FixedFIFO[T] | Null = js.native
    
    /* CompleteClass */
    override def push(data: T): Boolean = js.native
    
    /* CompleteClass */
    override def shift(): js.UndefOr[T] = js.native
    
    /* CompleteClass */
    var top: Double = js.native
  }
  
  trait FixedFIFO[T] extends StObject {
    
    var btm: Double
    
    var buffer: js.Array[T]
    
    def isEmpty(): Boolean
    
    var mask: Double
    
    var next: FixedFIFO[T] | Null
    
    def push(data: T): Boolean
    
    def shift(): js.UndefOr[T]
    
    var top: Double
  }
  object FixedFIFO {
    
    inline def apply[T](
      btm: Double,
      buffer: js.Array[T],
      isEmpty: () => Boolean,
      mask: Double,
      push: T => Boolean,
      shift: () => js.UndefOr[T],
      top: Double
    ): FixedFIFO[T] = {
      val __obj = js.Dynamic.literal(btm = btm.asInstanceOf[js.Any], buffer = buffer.asInstanceOf[js.Any], isEmpty = js.Any.fromFunction0(isEmpty), mask = mask.asInstanceOf[js.Any], push = js.Any.fromFunction1(push), shift = js.Any.fromFunction0(shift), top = top.asInstanceOf[js.Any], next = null)
      __obj.asInstanceOf[FixedFIFO[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FixedFIFO[?], T] (val x: Self & FixedFIFO[T]) extends AnyVal {
      
      inline def setBtm(value: Double): Self = StObject.set(x, "btm", value.asInstanceOf[js.Any])
      
      inline def setBuffer(value: js.Array[T]): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setBufferVarargs(value: T*): Self = StObject.set(x, "buffer", js.Array(value*))
      
      inline def setIsEmpty(value: () => Boolean): Self = StObject.set(x, "isEmpty", js.Any.fromFunction0(value))
      
      inline def setMask(value: Double): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      inline def setNext(value: FixedFIFO[T]): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      inline def setNextNull: Self = StObject.set(x, "next", null)
      
      inline def setPush(value: T => Boolean): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
      
      inline def setShift(value: () => js.UndefOr[T]): Self = StObject.set(x, "shift", js.Any.fromFunction0(value))
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
}
