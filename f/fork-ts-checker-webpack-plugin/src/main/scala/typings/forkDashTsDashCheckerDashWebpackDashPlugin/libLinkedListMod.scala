package typings.forkDashTsDashCheckerDashWebpackDashPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fork-ts-checker-webpack-plugin/lib/LinkedList", JSImport.Namespace)
@js.native
object libLinkedListMod extends js.Object {
  @js.native
  class HeadNode[T] () extends js.Object {
    var next: LinkedListNode[T] | TailNode[T] = js.native
  }
  
  @js.native
  class LinkedList[T] () extends js.Object {
    var head: HeadNode[T] = js.native
    var tail: TailNode[T] = js.native
    def add(item: T): LinkedListNode[T] = js.native
    def forEach(callback: js.Function2[/* item */ T, /* node */ LinkedListNode[T], Unit]): Unit = js.native
    def getItems(): js.Array[T] = js.native
    def getLastItem(): LinkedListNode[T] = js.native
    def hasItems(): Boolean = js.native
  }
  
  @js.native
  class LinkedListNode[T] protected () extends js.Object {
    def this(item: T) = this()
    val item: T = js.native
    var next: LinkedListNode[T] | TailNode[T] | Null = js.native
    var previous: LinkedListNode[T] | HeadNode[T] | Null = js.native
    def attachAfter(node: HeadNode[T]): Unit = js.native
    def attachAfter(node: LinkedListNode[T]): Unit = js.native
    def attachBefore(node: LinkedListNode[T]): Unit = js.native
    def attachBefore(node: TailNode[T]): Unit = js.native
    def detachSelf(): Unit = js.native
  }
  
  @js.native
  class TailNode[T] protected () extends js.Object {
    def this(head: HeadNode[T]) = this()
    var previous: LinkedListNode[T] | HeadNode[T] = js.native
  }
  
}

