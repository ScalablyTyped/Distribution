package typings.fbjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object heapMod {
  
  @JSImport("fbjs/lib/Heap", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Heap {
    def this(items: js.Array[Any]) = this()
    def this(items: js.Array[Any], comparator: js.Function2[/* a */ Any, /* b */ Any, Boolean]) = this()
    def this(items: Unit, comparator: js.Function2[/* a */ Any, /* b */ Any, Boolean]) = this()
    
    /* CompleteClass */
    override def _bubbleUp(index: Double): Unit = js.native
    
    /* CompleteClass */
    override def _heapify(): Unit = js.native
    
    /* CompleteClass */
    override def _sinkDown(index: Double): Unit = js.native
    
    /* CompleteClass */
    override def empty(): Boolean = js.native
    
    /* CompleteClass */
    override def peek(): Any = js.native
    
    /* CompleteClass */
    override def pop(): Any = js.native
    
    /* CompleteClass */
    override def push(item: Any): Unit = js.native
    
    /* CompleteClass */
    override def size(): Double = js.native
  }
  
  trait Heap extends StObject {
    
    def _bubbleUp(index: Double): Unit
    
    def _heapify(): Unit
    
    def _sinkDown(index: Double): Unit
    
    def empty(): Boolean
    
    def peek(): Any
    
    def pop(): Any
    
    def push(item: Any): Unit
    
    def size(): Double
  }
  object Heap {
    
    inline def apply(
      _bubbleUp: Double => Unit,
      _heapify: () => Unit,
      _sinkDown: Double => Unit,
      empty: () => Boolean,
      peek: () => Any,
      pop: () => Any,
      push: Any => Unit,
      size: () => Double
    ): Heap = {
      val __obj = js.Dynamic.literal(_bubbleUp = js.Any.fromFunction1(_bubbleUp), _heapify = js.Any.fromFunction0(_heapify), _sinkDown = js.Any.fromFunction1(_sinkDown), empty = js.Any.fromFunction0(empty), peek = js.Any.fromFunction0(peek), pop = js.Any.fromFunction0(pop), push = js.Any.fromFunction1(push), size = js.Any.fromFunction0(size))
      __obj.asInstanceOf[Heap]
    }
    
    extension [Self <: Heap](x: Self) {
      
      inline def setEmpty(value: () => Boolean): Self = StObject.set(x, "empty", js.Any.fromFunction0(value))
      
      inline def setPeek(value: () => Any): Self = StObject.set(x, "peek", js.Any.fromFunction0(value))
      
      inline def setPop(value: () => Any): Self = StObject.set(x, "pop", js.Any.fromFunction0(value))
      
      inline def setPush(value: Any => Unit): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
      
      inline def setSize(value: () => Double): Self = StObject.set(x, "size", js.Any.fromFunction0(value))
      
      inline def set_bubbleUp(value: Double => Unit): Self = StObject.set(x, "_bubbleUp", js.Any.fromFunction1(value))
      
      inline def set_heapify(value: () => Unit): Self = StObject.set(x, "_heapify", js.Any.fromFunction0(value))
      
      inline def set_sinkDown(value: Double => Unit): Self = StObject.set(x, "_sinkDown", js.Any.fromFunction1(value))
    }
  }
}
