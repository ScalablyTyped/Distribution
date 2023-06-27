package typings.flatqueue

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("flatqueue", JSImport.Default)
  @js.native
  open class default[T] ()
    extends StObject
       with FlatQueue[T] {
    
    /**
      * Removes all items from the queue.
      */
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /**
      * Number of items in the queue.
      */
    /* CompleteClass */
    override val length: Double = js.native
    
    /**
      * Returns the item from the head of this queue without removing it. If this
      * queue is empty, returns `undefined`.
      */
    /* CompleteClass */
    override def peek(): js.UndefOr[T] = js.native
    
    /**
      * Returns the priority value of the item at the head of this queue without
      * removing it. If this queue is empty, returns `undefined`.
      */
    /* CompleteClass */
    override def peekValue(): js.UndefOr[Double] = js.native
    
    /**
      * Removes and returns the item from the head of this queue, which is one of
      * the items with the lowest priority. If this queue is empty, returns
      * `undefined`.
      */
    /* CompleteClass */
    override def pop(): js.UndefOr[T] = js.native
    
    /**
      * Adds `item` to the queue with the specified `priority`.
      * 
      * `priority` must be a number. Items are sorted and returned from low to
      * high priority. Multiple items with the same priority value can be added
      * to the queue, but there is no guaranteed order between these items.
      */
    /* CompleteClass */
    override def push(item: T, priority: Double): Unit = js.native
    
    /**
      * Shrinks the internal arrays to `this.length`.
      * 
      * `pop()` and `clear()` calls don't free memory automatically to avoid
      * unnecessary resize operations. This also means that items that have been
      * added to the queue can't be garbage collected until a new item is pushed
      * in their place, or this method is called.
      */
    /* CompleteClass */
    override def shrink(): Unit = js.native
  }
  
  trait FlatQueue[T] extends StObject {
    
    /**
      * Removes all items from the queue.
      */
    def clear(): Unit
    
    /**
      * Number of items in the queue.
      */
    val length: Double
    
    /**
      * Returns the item from the head of this queue without removing it. If this
      * queue is empty, returns `undefined`.
      */
    def peek(): js.UndefOr[T]
    
    /**
      * Returns the priority value of the item at the head of this queue without
      * removing it. If this queue is empty, returns `undefined`.
      */
    def peekValue(): js.UndefOr[Double]
    
    /**
      * Removes and returns the item from the head of this queue, which is one of
      * the items with the lowest priority. If this queue is empty, returns
      * `undefined`.
      */
    def pop(): js.UndefOr[T]
    
    /**
      * Adds `item` to the queue with the specified `priority`.
      * 
      * `priority` must be a number. Items are sorted and returned from low to
      * high priority. Multiple items with the same priority value can be added
      * to the queue, but there is no guaranteed order between these items.
      */
    def push(item: T, priority: Double): Unit
    
    /**
      * Shrinks the internal arrays to `this.length`.
      * 
      * `pop()` and `clear()` calls don't free memory automatically to avoid
      * unnecessary resize operations. This also means that items that have been
      * added to the queue can't be garbage collected until a new item is pushed
      * in their place, or this method is called.
      */
    def shrink(): Unit
  }
  object FlatQueue {
    
    inline def apply[T](
      clear: () => Unit,
      length: Double,
      peek: () => js.UndefOr[T],
      peekValue: () => js.UndefOr[Double],
      pop: () => js.UndefOr[T],
      push: (T, Double) => Unit,
      shrink: () => Unit
    ): FlatQueue[T] = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), length = length.asInstanceOf[js.Any], peek = js.Any.fromFunction0(peek), peekValue = js.Any.fromFunction0(peekValue), pop = js.Any.fromFunction0(pop), push = js.Any.fromFunction2(push), shrink = js.Any.fromFunction0(shrink))
      __obj.asInstanceOf[FlatQueue[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FlatQueue[?], T] (val x: Self & FlatQueue[T]) extends AnyVal {
      
      inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setPeek(value: () => js.UndefOr[T]): Self = StObject.set(x, "peek", js.Any.fromFunction0(value))
      
      inline def setPeekValue(value: () => js.UndefOr[Double]): Self = StObject.set(x, "peekValue", js.Any.fromFunction0(value))
      
      inline def setPop(value: () => js.UndefOr[T]): Self = StObject.set(x, "pop", js.Any.fromFunction0(value))
      
      inline def setPush(value: (T, Double) => Unit): Self = StObject.set(x, "push", js.Any.fromFunction2(value))
      
      inline def setShrink(value: () => Unit): Self = StObject.set(x, "shrink", js.Any.fromFunction0(value))
    }
  }
}
