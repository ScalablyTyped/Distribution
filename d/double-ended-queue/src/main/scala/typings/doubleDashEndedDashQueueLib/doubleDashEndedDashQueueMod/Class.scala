package typings
package doubleDashEndedDashQueueLib.doubleDashEndedDashQueueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("double-ended-queue", JSImport.Namespace)
@js.native
/**
  * Creates an empty double-ended queue with initial capacity of 16.
  * If you know the optimal size before-hand, use `new Deque(capacity: number)`.
  */
class Class[Item] () extends Deque[Item] {
  /**
    * Creates an empty double-ended queue with the given capacity.
    * Capacity should be the maximum amount of items the queue will hold at a given time.
    * The reason to give an initial capacity is to avoid potentially expensive resizing operations at runtime.
    */
  def this(capacity: scala.Double) = this()
   // tslint:disable-line:no-unnecessary-generics
  /**
    * Creates a double-ended queue from `items`.
    */
  def this(items: js.Array[Item]) = this()
  /**
    * Amount of items currently in the queue.
    */
  /* CompleteClass */
  override val length: scala.Double = js.native
  /**
    * Remove all items from this queue. Does not change the queue's capacity.
    */
  /* CompleteClass */
  override def clear(): scala.Unit = js.native
  /** @see Deque#shift */
  /* CompleteClass */
  override def dequeue(): js.UndefOr[Item] = js.native
  /** @see Deque#push */
  /* CompleteClass */
  override def enqueue(items: Item*): scala.Double = js.native
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
  override def get(index: scala.Double): js.UndefOr[Item] = js.native
  /** @see Deque#push */
  /* CompleteClass */
  override def insertBack(items: Item*): scala.Double = js.native
  /** @see Deque#unshift */
  /* CompleteClass */
  override def insertFront(items: Item*): scala.Double = js.native
  /**
    * Return `true` if this queue is empty, `false` otherwise.
    */
  /* CompleteClass */
  override def isEmpty(): scala.Boolean = js.native
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
  override def push(items: Item*): scala.Double = js.native
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
  override def unshift(items: Item*): scala.Double = js.native
}

