package typings.doubleEndedQueue

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable:unified-signatures
object mod {
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("double-ended-queue", JSImport.Namespace)
  @js.native
  /**
    * Creates an empty double-ended queue with initial capacity of 16.
    * If you know the optimal size before-hand, use `new Deque(capacity: number)`.
    */
  open class Class[Item] ()
    extends StObject
       with Deque[Item] {
    /**
      * Creates an empty double-ended queue with the given capacity.
      * Capacity should be the maximum amount of items the queue will hold at a given time.
      * The reason to give an initial capacity is to avoid potentially expensive resizing operations at runtime.
      */
    def this(capacity: Double) = this()
    // eslint-disable-line no-unnecessary-generics
    /**
      * Creates a double-ended queue from `items`.
      */
    def this(items: js.Array[Item]) = this()
    
    /**
      * Remove all items from this queue. Does not change the queue's capacity.
      */
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /** @see Deque#shift */
    /* CompleteClass */
    override def dequeue(): js.UndefOr[Item] = js.native
    
    /** @see Deque#push */
    /* CompleteClass */
    override def enqueue(items: Item*): Double = js.native
    
    /**
      * Returns the item that is at the given `index` of this queue without removing it.
      *
      * The index is zero-based, so `.get(0)` will return the item that is at the front, `.get(1)` will return the item that comes after and so on.
      *
      * The index can be negative to read items at the back of the queue.
      * `.get(-1)` returns the item that is at the back of the queue, `.get(-2)` will return the item that comes before and so on.
      *
      * Returns `undefined` if `index` is not a valid index into the queue.
      *
      * **Note**: Even though indexed accessor (e.g. `queue[0]`) could *appear* to return a correct value *sometimes*, this is completely unreliable.
      * The numeric slots of the deque object are internally used as an optimization and have no meaningful order or meaning to outside.
      * Always use `.get()`.
      *
      * **Note**: The implementation has O(1) random access using `.get()`.
      */
    /* CompleteClass */
    override def get(index: Double): js.UndefOr[Item] = js.native
    
    /** @see Deque#push */
    /* CompleteClass */
    override def insertBack(items: Item*): Double = js.native
    
    /** @see Deque#unshift */
    /* CompleteClass */
    override def insertFront(items: Item*): Double = js.native
    
    /**
      * Return `true` if this queue is empty, `false` otherwise.
      */
    /* CompleteClass */
    override def isEmpty(): Boolean = js.native
    
    /**
      * Amount of items currently in the queue.
      */
    /* CompleteClass */
    override val length: Double = js.native
    
    /**
      * Returns the item that is at the back of this queue without removing it.
      * If the queue is empty, `undefined` is returned.
      */
    /* CompleteClass */
    override def peekBack(): js.UndefOr[Item] = js.native
    
    /**
      * Returns the item that is at the front of this queue without removing it.
      * If the queue is empty, `undefined` is returned.
      */
    /* CompleteClass */
    override def peekFront(): js.UndefOr[Item] = js.native
    
    /**
      * Pop off the item at the back of this queue.
      *
      * Note: The item will be removed from the queue.
      * If you simply want to see what's at the back of the queue use `peekBack()` or `.get(-1)`.
      *
      * If the queue is empty, `undefined` is returned.
      * If you need to differentiate between `undefined` values in the queue and `pop()` return value - check the queue `.length` before popping.
      *
      * **Aliases**: `removeBack`
      */
    /* CompleteClass */
    override def pop(): js.UndefOr[Item] = js.native
    
    /**
      * Push items to the back of this queue.
      * Returns the amount of items currently in the queue after the operation.
      *
      * **Aliases**: `enqueue`, `insertBack`
      */
    /* CompleteClass */
    override def push(items: Item*): Double = js.native
    
    /** @see Deque#pop */
    /* CompleteClass */
    override def removeBack(): js.UndefOr[Item] = js.native
    
    /** @see Deque#shift */
    /* CompleteClass */
    override def removeFront(): js.UndefOr[Item] = js.native
    
    /**
      * Shifts off the item at the front of this queue.
      *
      * Note: The item will be removed from the queue.
      * If you simply want to see what's at the front of the queue use `peekFront()` or `.get(0)`.
      *
      * If the queue is empty, `undefined` is returned.
      * If you need to differentiate between `undefined` values in the queue and `shift()` return value - check the queue `.length` before shifting.
      *
      * **Aliases**: `removeFront`, `dequeue`
      */
    /* CompleteClass */
    override def shift(): js.UndefOr[Item] = js.native
    
    /**
      * Returns the items in the queue as an array.
      * Starting from the item in the front of the queue and ending to the item at the back of the queue.
      *
      * **Aliases**: `toJSON`
      */
    /* CompleteClass */
    override def toArray(): js.Array[Item] = js.native
    
    /** @see Deque#toArray */
    /* CompleteClass */
    override def toJSON(): js.Array[Item] = js.native
    
    /**
      * Unshift items to the front of this queue.
      * Returns the amount of items currently in the queue after the operation.
      *
      * **Ailases**: `insertFront`
      */
    /* CompleteClass */
    override def unshift(items: Item*): Double = js.native
  }
  
  trait Deque[Item] extends StObject {
    
    /**
      * Remove all items from this queue. Does not change the queue's capacity.
      */
    def clear(): Unit
    
    /** @see Deque#shift */
    def dequeue(): js.UndefOr[Item]
    
    /** @see Deque#push */
    def enqueue(items: Item*): Double
    
    /**
      * Returns the item that is at the given `index` of this queue without removing it.
      *
      * The index is zero-based, so `.get(0)` will return the item that is at the front, `.get(1)` will return the item that comes after and so on.
      *
      * The index can be negative to read items at the back of the queue.
      * `.get(-1)` returns the item that is at the back of the queue, `.get(-2)` will return the item that comes before and so on.
      *
      * Returns `undefined` if `index` is not a valid index into the queue.
      *
      * **Note**: Even though indexed accessor (e.g. `queue[0]`) could *appear* to return a correct value *sometimes*, this is completely unreliable.
      * The numeric slots of the deque object are internally used as an optimization and have no meaningful order or meaning to outside.
      * Always use `.get()`.
      *
      * **Note**: The implementation has O(1) random access using `.get()`.
      */
    def get(index: Double): js.UndefOr[Item]
    
    /** @see Deque#push */
    def insertBack(items: Item*): Double
    
    /** @see Deque#unshift */
    def insertFront(items: Item*): Double
    
    /**
      * Return `true` if this queue is empty, `false` otherwise.
      */
    def isEmpty(): Boolean
    
    /**
      * Amount of items currently in the queue.
      */
    val length: Double
    
    /**
      * Returns the item that is at the back of this queue without removing it.
      * If the queue is empty, `undefined` is returned.
      */
    def peekBack(): js.UndefOr[Item]
    
    /**
      * Returns the item that is at the front of this queue without removing it.
      * If the queue is empty, `undefined` is returned.
      */
    def peekFront(): js.UndefOr[Item]
    
    /**
      * Pop off the item at the back of this queue.
      *
      * Note: The item will be removed from the queue.
      * If you simply want to see what's at the back of the queue use `peekBack()` or `.get(-1)`.
      *
      * If the queue is empty, `undefined` is returned.
      * If you need to differentiate between `undefined` values in the queue and `pop()` return value - check the queue `.length` before popping.
      *
      * **Aliases**: `removeBack`
      */
    def pop(): js.UndefOr[Item]
    
    /**
      * Push items to the back of this queue.
      * Returns the amount of items currently in the queue after the operation.
      *
      * **Aliases**: `enqueue`, `insertBack`
      */
    def push(items: Item*): Double
    
    /** @see Deque#pop */
    def removeBack(): js.UndefOr[Item]
    
    /** @see Deque#shift */
    def removeFront(): js.UndefOr[Item]
    
    /**
      * Shifts off the item at the front of this queue.
      *
      * Note: The item will be removed from the queue.
      * If you simply want to see what's at the front of the queue use `peekFront()` or `.get(0)`.
      *
      * If the queue is empty, `undefined` is returned.
      * If you need to differentiate between `undefined` values in the queue and `shift()` return value - check the queue `.length` before shifting.
      *
      * **Aliases**: `removeFront`, `dequeue`
      */
    def shift(): js.UndefOr[Item]
    
    /**
      * Returns the items in the queue as an array.
      * Starting from the item in the front of the queue and ending to the item at the back of the queue.
      *
      * **Aliases**: `toJSON`
      */
    def toArray(): js.Array[Item]
    
    /** @see Deque#toArray */
    def toJSON(): js.Array[Item]
    
    /**
      * Unshift items to the front of this queue.
      * Returns the amount of items currently in the queue after the operation.
      *
      * **Ailases**: `insertFront`
      */
    def unshift(items: Item*): Double
  }
  object Deque {
    
    inline def apply[Item](
      clear: () => Unit,
      dequeue: () => js.UndefOr[Item],
      enqueue: /* repeated */ Item => Double,
      get: Double => js.UndefOr[Item],
      insertBack: /* repeated */ Item => Double,
      insertFront: /* repeated */ Item => Double,
      isEmpty: () => Boolean,
      length: Double,
      peekBack: () => js.UndefOr[Item],
      peekFront: () => js.UndefOr[Item],
      pop: () => js.UndefOr[Item],
      push: /* repeated */ Item => Double,
      removeBack: () => js.UndefOr[Item],
      removeFront: () => js.UndefOr[Item],
      shift: () => js.UndefOr[Item],
      toArray: () => js.Array[Item],
      toJSON: () => js.Array[Item],
      unshift: /* repeated */ Item => Double
    ): Deque[Item] = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), dequeue = js.Any.fromFunction0(dequeue), enqueue = js.Any.fromFunction1(enqueue), get = js.Any.fromFunction1(get), insertBack = js.Any.fromFunction1(insertBack), insertFront = js.Any.fromFunction1(insertFront), isEmpty = js.Any.fromFunction0(isEmpty), length = length.asInstanceOf[js.Any], peekBack = js.Any.fromFunction0(peekBack), peekFront = js.Any.fromFunction0(peekFront), pop = js.Any.fromFunction0(pop), push = js.Any.fromFunction1(push), removeBack = js.Any.fromFunction0(removeBack), removeFront = js.Any.fromFunction0(removeFront), shift = js.Any.fromFunction0(shift), toArray = js.Any.fromFunction0(toArray), toJSON = js.Any.fromFunction0(toJSON), unshift = js.Any.fromFunction1(unshift))
      __obj.asInstanceOf[Deque[Item]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Deque[?], Item] (val x: Self & Deque[Item]) extends AnyVal {
      
      inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      inline def setDequeue(value: () => js.UndefOr[Item]): Self = StObject.set(x, "dequeue", js.Any.fromFunction0(value))
      
      inline def setEnqueue(value: /* repeated */ Item => Double): Self = StObject.set(x, "enqueue", js.Any.fromFunction1(value))
      
      inline def setGet(value: Double => js.UndefOr[Item]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setInsertBack(value: /* repeated */ Item => Double): Self = StObject.set(x, "insertBack", js.Any.fromFunction1(value))
      
      inline def setInsertFront(value: /* repeated */ Item => Double): Self = StObject.set(x, "insertFront", js.Any.fromFunction1(value))
      
      inline def setIsEmpty(value: () => Boolean): Self = StObject.set(x, "isEmpty", js.Any.fromFunction0(value))
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setPeekBack(value: () => js.UndefOr[Item]): Self = StObject.set(x, "peekBack", js.Any.fromFunction0(value))
      
      inline def setPeekFront(value: () => js.UndefOr[Item]): Self = StObject.set(x, "peekFront", js.Any.fromFunction0(value))
      
      inline def setPop(value: () => js.UndefOr[Item]): Self = StObject.set(x, "pop", js.Any.fromFunction0(value))
      
      inline def setPush(value: /* repeated */ Item => Double): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
      
      inline def setRemoveBack(value: () => js.UndefOr[Item]): Self = StObject.set(x, "removeBack", js.Any.fromFunction0(value))
      
      inline def setRemoveFront(value: () => js.UndefOr[Item]): Self = StObject.set(x, "removeFront", js.Any.fromFunction0(value))
      
      inline def setShift(value: () => js.UndefOr[Item]): Self = StObject.set(x, "shift", js.Any.fromFunction0(value))
      
      inline def setToArray(value: () => js.Array[Item]): Self = StObject.set(x, "toArray", js.Any.fromFunction0(value))
      
      inline def setToJSON(value: () => js.Array[Item]): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      inline def setUnshift(value: /* repeated */ Item => Double): Self = StObject.set(x, "unshift", js.Any.fromFunction1(value))
    }
  }
}
