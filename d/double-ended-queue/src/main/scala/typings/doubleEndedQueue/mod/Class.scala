package typings.doubleEndedQueue.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def this(capacity: Double) = this()
   // tslint:disable-line:no-unnecessary-generics
  /**
    * Creates a double-ended queue from `items`.
    */
  def this(items: js.Array[Item]) = this()
}
