package typings.doubleEndedQueue.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Deque[Item] extends js.Object {
  /**
    * Amount of items currently in the queue.
    */
  val length: Double = js.native
  /**
    * Remove all items from this queue. Does not change the queue's capacity.
    */
  def clear(): Unit = js.native
  /** @see Deque#shift */
  def dequeue(): js.UndefOr[Item] = js.native
  /** @see Deque#push */
  def enqueue(items: Item*): Double = js.native
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
  def get(index: Double): js.UndefOr[Item] = js.native
  /** @see Deque#push */
  def insertBack(items: Item*): Double = js.native
  /** @see Deque#unshift */
  def insertFront(items: Item*): Double = js.native
  /**
    * Return `true` if this queue is empty, `false` otherwise.
    */
  def isEmpty(): Boolean = js.native
  /**
    * Returns the item that is at the back of this queue without removing it.
    * If the queue is empty, `undefined` is returned.
    */
  def peekBack(): js.UndefOr[Item] = js.native
  /**
    * Returns the item that is at the front of this queue without removing it.
    * If the queue is empty, `undefined` is returned.
    */
  def peekFront(): js.UndefOr[Item] = js.native
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
  def pop(): js.UndefOr[Item] = js.native
  /**
    * Push items to the back of this queue.
    * Returns the amount of items currently in the queue after the operation.
    *
    * **Aliases**: `enqueue`, `insertBack`
    */
  def push(items: Item*): Double = js.native
  /** @see Deque#pop */
  def removeBack(): js.UndefOr[Item] = js.native
  /** @see Deque#shift */
  def removeFront(): js.UndefOr[Item] = js.native
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
  def shift(): js.UndefOr[Item] = js.native
  /**
    * Returns the items in the queue as an array.
    * Starting from the item in the front of the queue and ending to the item at the back of the queue.
    *
    * **Aliases**: `toJSON`
    */
  def toArray(): js.Array[Item] = js.native
  /** @see Deque#toArray */
  def toJSON(): js.Array[Item] = js.native
  /**
    * Unshift items to the front of this queue.
    * Returns the amount of items currently in the queue after the operation.
    *
    * **Ailases**: `insertFront`
    */
  def unshift(items: Item*): Double = js.native
}

object Deque {
  @scala.inline
  def apply[Item](
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
  implicit class DequeOps[Self <: Deque[_], Item] (val x: Self with Deque[Item]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    @scala.inline
    def setDequeue(value: () => js.UndefOr[Item]): Self = this.set("dequeue", js.Any.fromFunction0(value))
    @scala.inline
    def setEnqueue(value: /* repeated */ Item => Double): Self = this.set("enqueue", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Double => js.UndefOr[Item]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setInsertBack(value: /* repeated */ Item => Double): Self = this.set("insertBack", js.Any.fromFunction1(value))
    @scala.inline
    def setInsertFront(value: /* repeated */ Item => Double): Self = this.set("insertFront", js.Any.fromFunction1(value))
    @scala.inline
    def setIsEmpty(value: () => Boolean): Self = this.set("isEmpty", js.Any.fromFunction0(value))
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def setPeekBack(value: () => js.UndefOr[Item]): Self = this.set("peekBack", js.Any.fromFunction0(value))
    @scala.inline
    def setPeekFront(value: () => js.UndefOr[Item]): Self = this.set("peekFront", js.Any.fromFunction0(value))
    @scala.inline
    def setPop(value: () => js.UndefOr[Item]): Self = this.set("pop", js.Any.fromFunction0(value))
    @scala.inline
    def setPush(value: /* repeated */ Item => Double): Self = this.set("push", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveBack(value: () => js.UndefOr[Item]): Self = this.set("removeBack", js.Any.fromFunction0(value))
    @scala.inline
    def setRemoveFront(value: () => js.UndefOr[Item]): Self = this.set("removeFront", js.Any.fromFunction0(value))
    @scala.inline
    def setShift(value: () => js.UndefOr[Item]): Self = this.set("shift", js.Any.fromFunction0(value))
    @scala.inline
    def setToArray(value: () => js.Array[Item]): Self = this.set("toArray", js.Any.fromFunction0(value))
    @scala.inline
    def setToJSON(value: () => js.Array[Item]): Self = this.set("toJSON", js.Any.fromFunction0(value))
    @scala.inline
    def setUnshift(value: /* repeated */ Item => Double): Self = this.set("unshift", js.Any.fromFunction1(value))
  }
  
}

