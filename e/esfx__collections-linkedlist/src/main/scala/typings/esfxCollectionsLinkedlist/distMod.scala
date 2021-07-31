package typings.esfxCollectionsLinkedlist

import typings.esfxCollectionCore.distMod.Collection
import typings.esfxEquatable.distMod.Equaler
import typings.esfxEquatable.distMod.EqualityComparison
import typings.std.Iterable
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMod {
  
  @JSImport("@esfx/collections-linkedlist/dist", "LinkedList")
  @js.native
  class LinkedList[T] ()
    extends StObject
       with Collection[T] {
    def this(equaler: Equaler[T]) = this()
    def this(equaler: EqualityComparison[T]) = this()
    def this(iterable: Iterable[T]) = this()
    def this(iterable: Unit, equaler: Equaler[T]) = this()
    def this(iterable: Unit, equaler: EqualityComparison[T]) = this()
    def this(iterable: Iterable[T], equaler: Equaler[T]) = this()
    def this(iterable: Iterable[T], equaler: EqualityComparison[T]) = this()
    
    var _deleteNode: js.Any = js.native
    
    var _equaler: js.Any = js.native
    
    var _head: js.Any = js.native
    
    var _insertNode: js.Any = js.native
    
    var _size: js.Any = js.native
    
    def clear(): Unit = js.native
    
    def delete(value: T): js.UndefOr[LinkedListNode[T]] = js.native
    
    def deleteAll(
      predicate: js.Function3[/* value */ T, /* node */ LinkedListNode[T], /* list */ LinkedList[T], Boolean]
    ): Double = js.native
    def deleteAll(
      predicate: js.Function3[/* value */ T, /* node */ LinkedListNode[T], /* list */ LinkedList[T], Boolean],
      thisArg: js.Any
    ): Double = js.native
    
    def deleteNode(): Boolean = js.native
    def deleteNode(node: LinkedListNode[T]): Boolean = js.native
    
    def drain(): IterableIterator[T] = js.native
    
    val equaler: Equaler[T] = js.native
    
    def every(
      callback: js.Function3[/* value */ T, /* node */ LinkedListNode[T], /* list */ LinkedList[T], Boolean]
    ): Boolean = js.native
    def every(
      callback: js.Function3[/* value */ T, /* node */ LinkedListNode[T], /* list */ LinkedList[T], Boolean],
      thisArg: js.Any
    ): Boolean = js.native
    
    def filter(
      callback: js.Function3[/* value */ T, /* node */ LinkedListNode[T], /* list */ LinkedList[T], Boolean]
    ): LinkedList[T] = js.native
    def filter(
      callback: js.Function3[/* value */ T, /* node */ LinkedListNode[T], /* list */ LinkedList[T], Boolean],
      thisArg: js.Any
    ): LinkedList[T] = js.native
    @JSName("filter")
    def filter_S_T[S /* <: T */](
      callback: js.Function3[
          /* value */ T, 
          /* node */ LinkedListNode[T], 
          /* list */ LinkedList[T], 
          /* is S */ Boolean
        ]
    ): LinkedList[S] = js.native
    @JSName("filter")
    def filter_S_T[S /* <: T */](
      callback: js.Function3[
          /* value */ T, 
          /* node */ LinkedListNode[T], 
          /* list */ LinkedList[T], 
          /* is S */ Boolean
        ],
      thisArg: js.Any
    ): LinkedList[S] = js.native
    
    def find(
      callback: js.Function3[/* value */ T, /* node */ LinkedListNode[T], /* list */ LinkedList[T], Boolean]
    ): js.UndefOr[T] = js.native
    def find(
      callback: js.Function3[/* value */ T, /* node */ LinkedListNode[T], /* list */ LinkedList[T], Boolean],
      thisArg: js.Any
    ): js.UndefOr[T] = js.native
    
    def findLast(
      callback: js.Function3[/* value */ T, /* node */ LinkedListNode[T], /* list */ LinkedList[T], Boolean]
    ): js.UndefOr[T] = js.native
    def findLast(
      callback: js.Function3[/* value */ T, /* node */ LinkedListNode[T], /* list */ LinkedList[T], Boolean],
      thisArg: js.Any
    ): js.UndefOr[T] = js.native
    
    def findLastNode(
      callback: js.Function3[/* value */ T, /* node */ LinkedListNode[T], /* list */ LinkedList[T], Boolean]
    ): js.UndefOr[LinkedListNode[T]] = js.native
    def findLastNode(
      callback: js.Function3[/* value */ T, /* node */ LinkedListNode[T], /* list */ LinkedList[T], Boolean],
      thisArg: js.Any
    ): js.UndefOr[LinkedListNode[T]] = js.native
    @JSName("findLastNode")
    def findLastNode_S_T[S /* <: T */](
      callback: js.Function3[
          /* value */ T, 
          /* node */ LinkedListNode[T], 
          /* list */ LinkedList[T], 
          /* is S */ Boolean
        ]
    ): js.UndefOr[LinkedListNode[S]] = js.native
    @JSName("findLastNode")
    def findLastNode_S_T[S /* <: T */](
      callback: js.Function3[
          /* value */ T, 
          /* node */ LinkedListNode[T], 
          /* list */ LinkedList[T], 
          /* is S */ Boolean
        ],
      thisArg: js.Any
    ): js.UndefOr[LinkedListNode[S]] = js.native
    
    @JSName("findLast")
    def findLast_S_T[S /* <: T */](
      callback: js.Function3[
          /* value */ T, 
          /* node */ LinkedListNode[T], 
          /* list */ LinkedList[T], 
          /* is S */ Boolean
        ]
    ): js.UndefOr[S] = js.native
    @JSName("findLast")
    def findLast_S_T[S /* <: T */](
      callback: js.Function3[
          /* value */ T, 
          /* node */ LinkedListNode[T], 
          /* list */ LinkedList[T], 
          /* is S */ Boolean
        ],
      thisArg: js.Any
    ): js.UndefOr[S] = js.native
    
    def findNode(
      callback: js.Function3[/* value */ T, /* node */ LinkedListNode[T], /* list */ LinkedList[T], Boolean]
    ): js.UndefOr[LinkedListNode[T]] = js.native
    def findNode(
      callback: js.Function3[/* value */ T, /* node */ LinkedListNode[T], /* list */ LinkedList[T], Boolean],
      thisArg: js.Any
    ): js.UndefOr[LinkedListNode[T]] = js.native
    @JSName("findNode")
    def findNode_S_T[S /* <: T */](
      callback: js.Function3[
          /* value */ T, 
          /* node */ LinkedListNode[T], 
          /* list */ LinkedList[T], 
          /* is S */ Boolean
        ]
    ): js.UndefOr[LinkedListNode[S]] = js.native
    @JSName("findNode")
    def findNode_S_T[S /* <: T */](
      callback: js.Function3[
          /* value */ T, 
          /* node */ LinkedListNode[T], 
          /* list */ LinkedList[T], 
          /* is S */ Boolean
        ],
      thisArg: js.Any
    ): js.UndefOr[LinkedListNode[S]] = js.native
    
    @JSName("find")
    def find_S_T[S /* <: T */](
      callback: js.Function3[
          /* value */ T, 
          /* node */ LinkedListNode[T], 
          /* list */ LinkedList[T], 
          /* is S */ Boolean
        ]
    ): js.UndefOr[S] = js.native
    @JSName("find")
    def find_S_T[S /* <: T */](
      callback: js.Function3[
          /* value */ T, 
          /* node */ LinkedListNode[T], 
          /* list */ LinkedList[T], 
          /* is S */ Boolean
        ],
      thisArg: js.Any
    ): js.UndefOr[S] = js.native
    
    val first: js.UndefOr[LinkedListNode[T]] = js.native
    
    def forEach(
      callback: js.Function3[/* value */ T, /* node */ LinkedListNode[T], /* list */ LinkedList[T], Unit]
    ): Unit = js.native
    def forEach(
      callback: js.Function3[/* value */ T, /* node */ LinkedListNode[T], /* list */ LinkedList[T], Unit],
      thisArg: js.Any
    ): Unit = js.native
    
    def has(value: T): Boolean = js.native
    
    def insertAfter(node: Null, value: T): LinkedListNode[T] = js.native
    def insertAfter(node: Unit, value: T): LinkedListNode[T] = js.native
    def insertAfter(node: LinkedListNode[T], value: T): LinkedListNode[T] = js.native
    
    def insertBefore(node: Null, value: T): LinkedListNode[T] = js.native
    def insertBefore(node: Unit, value: T): LinkedListNode[T] = js.native
    def insertBefore(node: LinkedListNode[T], value: T): LinkedListNode[T] = js.native
    
    def insertNodeAfter(node: Null, newNode: LinkedListNode[T]): Unit = js.native
    def insertNodeAfter(node: Unit, newNode: LinkedListNode[T]): Unit = js.native
    def insertNodeAfter(node: LinkedListNode[T], newNode: LinkedListNode[T]): Unit = js.native
    
    def insertNodeBefore(node: Null, newNode: LinkedListNode[T]): Unit = js.native
    def insertNodeBefore(node: Unit, newNode: LinkedListNode[T]): Unit = js.native
    def insertNodeBefore(node: LinkedListNode[T], newNode: LinkedListNode[T]): Unit = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator_LinkedList: js.Function0[IterableIterator[T]] = js.native
    
    val last: js.UndefOr[LinkedListNode[T]] = js.native
    
    def lastNodeOf(value: T): js.UndefOr[LinkedListNode[T]] = js.native
    def lastNodeOf(value: T, fromNode: LinkedListNode[T]): js.UndefOr[LinkedListNode[T]] = js.native
    
    def map[U](callback: js.Function3[/* value */ T, /* node */ LinkedListNode[T], /* list */ LinkedList[T], U]): LinkedList[U] = js.native
    def map[U](
      callback: js.Function3[/* value */ T, /* node */ LinkedListNode[T], /* list */ LinkedList[T], U],
      thisArg: js.Any
    ): LinkedList[U] = js.native
    
    def nodeOf(value: T): js.UndefOr[LinkedListNode[T]] = js.native
    def nodeOf(value: T, fromNode: LinkedListNode[T]): js.UndefOr[LinkedListNode[T]] = js.native
    
    def nodes(): IterableIterator[LinkedListNode[T]] = js.native
    
    def pop(): js.UndefOr[T] = js.native
    
    def popNode(): js.UndefOr[LinkedListNode[T]] = js.native
    
    def push(value: T): LinkedListNode[T] = js.native
    
    def pushNode(newNode: LinkedListNode[T]): Unit = js.native
    
    def reduce(
      callback: js.Function4[
          /* previousValue */ T, 
          /* value */ T, 
          /* node */ LinkedListNode[T], 
          /* list */ LinkedList[T], 
          T
        ]
    ): T = js.native
    def reduce(
      callback: js.Function4[
          /* previousValue */ T, 
          /* value */ T, 
          /* node */ LinkedListNode[T], 
          /* list */ LinkedList[T], 
          T
        ],
      initialValue: T
    ): T = js.native
    
    def reduceRight(
      callback: js.Function4[
          /* previousValue */ T, 
          /* value */ T, 
          /* node */ LinkedListNode[T], 
          /* list */ LinkedList[T], 
          T
        ]
    ): T = js.native
    def reduceRight(
      callback: js.Function4[
          /* previousValue */ T, 
          /* value */ T, 
          /* node */ LinkedListNode[T], 
          /* list */ LinkedList[T], 
          T
        ],
      initialValue: T
    ): T = js.native
    @JSName("reduceRight")
    def reduceRight_U_U[U](
      callback: js.Function4[
          /* previousValue */ U, 
          /* value */ T, 
          /* node */ LinkedListNode[T], 
          /* list */ LinkedList[T], 
          U
        ],
      initialValue: U
    ): U = js.native
    
    @JSName("reduce")
    def reduce_U_U[U](
      callback: js.Function4[
          /* previousValue */ U, 
          /* value */ T, 
          /* node */ LinkedListNode[T], 
          /* list */ LinkedList[T], 
          U
        ],
      initialValue: U
    ): U = js.native
    
    def shift(): js.UndefOr[T] = js.native
    
    def shiftNode(): js.UndefOr[LinkedListNode[T]] = js.native
    
    val size: Double = js.native
    
    def some(): Boolean = js.native
    def some(
      callback: js.Function3[/* value */ T, /* node */ LinkedListNode[T], /* list */ LinkedList[T], Boolean]
    ): Boolean = js.native
    def some(
      callback: js.Function3[/* value */ T, /* node */ LinkedListNode[T], /* list */ LinkedList[T], Boolean],
      thisArg: js.Any
    ): Boolean = js.native
    def some(callback: Unit, thisArg: js.Any): Boolean = js.native
    
    @JSName(js.Symbol.toStringTag)
    var toStringTag: String = js.native
    
    def unshift(value: T): LinkedListNode[T] = js.native
    
    def unshiftNode(newNode: LinkedListNode[T]): Unit = js.native
    
    def values(): IterableIterator[T] = js.native
  }
  
  @JSImport("@esfx/collections-linkedlist/dist", "LinkedListNode")
  @js.native
  class LinkedListNode[T] protected () extends StObject {
    def this(value: T) = this()
    
    def detachSelf(): Boolean = js.native
    
    val list: js.UndefOr[LinkedList[T]] = js.native
    
    val next: js.UndefOr[LinkedListNode[T]] = js.native
    
    val previous: js.UndefOr[LinkedListNode[T]] = js.native
    
    @JSName(js.Symbol.toStringTag)
    var toStringTag: String = js.native
    
    var value: T = js.native
  }
}
