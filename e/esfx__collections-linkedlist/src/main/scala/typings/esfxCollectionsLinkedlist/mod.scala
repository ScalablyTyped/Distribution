package typings.esfxCollectionsLinkedlist

import typings.esfxEquatable.distMod.Equaler
import typings.esfxEquatable.distMod.EqualityComparison
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@esfx/collections-linkedlist", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class LinkedList[T] ()
    extends typings.esfxCollectionsLinkedlist.distMod.LinkedList[T] {
    def this(equaler: Equaler[T]) = this()
    def this(equaler: EqualityComparison[T]) = this()
    def this(iterable: Iterable[T]) = this()
    def this(iterable: js.UndefOr[scala.Nothing], equaler: Equaler[T]) = this()
    def this(iterable: js.UndefOr[scala.Nothing], equaler: EqualityComparison[T]) = this()
    def this(iterable: Iterable[T], equaler: Equaler[T]) = this()
    def this(iterable: Iterable[T], equaler: EqualityComparison[T]) = this()
  }
  
  @js.native
  class LinkedListNode[T] protected ()
    extends typings.esfxCollectionsLinkedlist.distMod.LinkedListNode[T] {
    def this(value: T) = this()
  }
  
}

