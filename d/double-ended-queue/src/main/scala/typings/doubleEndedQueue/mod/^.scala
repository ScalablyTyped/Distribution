package typings.doubleEndedQueue.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("double-ended-queue", JSImport.Namespace)
@js.native
object ^
  extends TopLevel[
      ( // tslint:disable-line:no-unnecessary-generics
/**
  * Creates a double-ended queue from `items`.
  */
Instantiable1[/* items */ js.Array[js.Object], Deque[js.Object]]) with (/**
  * Creates an empty double-ended queue with initial capacity of 16.
  * If you know the optimal size before-hand, use `new Deque(capacity: number)`.
  */
Instantiable0[Deque[js.Object]]) with (/**
  * Creates an empty double-ended queue with the given capacity.
  * Capacity should be the maximum amount of items the queue will hold at a given time.
  * The reason to give an initial capacity is to avoid potentially expensive resizing operations at runtime.
  */
Instantiable1[/* capacity */ Double, Deque[js.Object]])
    ]

