package typings.esfxCollectionsLinkedlist

import typings.esfxCollectionCore.mod.Collection
import typings.esfxEquatable.mod.Equaler
import typings.esfxEquatable.mod.EqualityComparison
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@esfx/collections-linkedlist", "LinkedList")
  @js.native
  open class LinkedList[T] ()
    extends StObject
       with Collection[T] {
    def this(equaler: Equaler[T]) = this()
    def this(equaler: EqualityComparison[T]) = this()
    def this(iterable: js.Iterable[T]) = this()
    def this(iterable: js.Iterable[T], equaler: Equaler[T]) = this()
    def this(iterable: js.Iterable[T], equaler: EqualityComparison[T]) = this()
    def this(iterable: Unit, equaler: Equaler[T]) = this()
    def this(iterable: Unit, equaler: EqualityComparison[T]) = this()
    
    /* private */ var _deleteNode: Any = js.native
    
    /* private */ var _equaler: Any = js.native
    
    /* private */ var _head: Any = js.native
    
    /* private */ var _insertNode: Any = js.native
    
    /* private */ var _size: Any = js.native
    
    /**
      * Removes all nodes from the list.
      */
    def clear(): Unit = js.native
    
    /**
      * Finds the first node in the list containing `value`, removes it from the list, and returns it. If a node
      * containing `value` could not be found, `undefined` is returned instead.
      */
    def delete(value: T): js.UndefOr[LinkedListNode[T]] = js.native
    
    /**
      * Removes all nodes from the list matching the supplied `predicate`.
      * @param predicate A callback function used to test each value and node in the list.
      * @param thisArg The `this` value to use when executing `predicate`.
      */
    def deleteAll(
      predicate: js.Function3[/* value */ T, /* node */ LinkedListNode[T], /* list */ LinkedList[T], Boolean]
    ): Double = js.native
    def deleteAll(
      predicate: js.Function3[/* value */ T, /* node */ LinkedListNode[T], /* list */ LinkedList[T], Boolean],
      thisArg: Any
    ): Double = js.native
    
    /**
      * Removes the provided node from the list.
      * @returns `true` if the node was successfully removed from the list; otherwise, `false`.
      */
    def deleteNode(): Boolean = js.native
    def deleteNode(node: LinkedListNode[T]): Boolean = js.native
    
    /**
      * Returns an iterator that removes each node from the list before yielding the node's value.
      */
    def drain(): IterableIterator[T] = js.native
    
    /**
      * Gets the {@link Equaler} used for equality comparisons in this list.
      */
    def equaler: Equaler[T] = js.native
    
    def every(
      callback: js.Function3[/* value */ T, /* node */ LinkedListNode[T], /* list */ LinkedList[T], Boolean]
    ): Boolean = js.native
    def every(
      callback: js.Function3[/* value */ T, /* node */ LinkedListNode[T], /* list */ LinkedList[T], Boolean],
      thisArg: Any
    ): Boolean = js.native
    
    /**
      * Returns the elements of a the list that meet the condition specified in the provided `callback` function.
      * @param callback The `callback` to call for each value and node.
      * @param thisArg The `this` value to use when executing `callback`.
      */
    def filter(
      callback: js.Function3[/* value */ T, /* node */ LinkedListNode[T], /* list */ LinkedList[T], Boolean]
    ): LinkedList[T] = js.native
    def filter(
      callback: js.Function3[/* value */ T, /* node */ LinkedListNode[T], /* list */ LinkedList[T], Boolean],
      thisArg: Any
    ): LinkedList[T] = js.native
    /**
      * Returns the elements of a the list that meet the condition specified in the provided `callback` function.
      * @param callback The `callback` to call for each value and node.
      * @param thisArg The `this` value to use when executing `callback`.
      */
    @JSName("filter")
    def filter_S[S /* <: T */](
      callback: js.Function3[
          /* value */ T, 
          /* node */ LinkedListNode[T], 
          /* list */ LinkedList[T], 
          /* is S */ Boolean
        ]
    ): LinkedList[S] = js.native
    @JSName("filter")
    def filter_S[S /* <: T */](
      callback: js.Function3[
          /* value */ T, 
          /* node */ LinkedListNode[T], 
          /* list */ LinkedList[T], 
          /* is S */ Boolean
        ],
      thisArg: Any
    ): LinkedList[S] = js.native
    
    /**
      * Finds the first value in the list that matches the provided callback.
      * @param callback The callback used to test each value and node.
      * @param thisArg The `this` value to use when executing `callback`.
      */
    def find(
      callback: js.Function3[/* value */ T, /* node */ LinkedListNode[T], /* list */ LinkedList[T], Boolean]
    ): js.UndefOr[T] = js.native
    def find(
      callback: js.Function3[/* value */ T, /* node */ LinkedListNode[T], /* list */ LinkedList[T], Boolean],
      thisArg: Any
    ): js.UndefOr[T] = js.native
    
    /**
      * Finds the last value in the list that matches the provided callback, starting from the end of the list.
      * @param callback The callback used to test each value and node.
      * @param thisArg The `this` value to use when executing `callback`.
      */
    def findLast(
      callback: js.Function3[/* value */ T, /* node */ LinkedListNode[T], /* list */ LinkedList[T], Boolean]
    ): js.UndefOr[T] = js.native
    def findLast(
      callback: js.Function3[/* value */ T, /* node */ LinkedListNode[T], /* list */ LinkedList[T], Boolean],
      thisArg: Any
    ): js.UndefOr[T] = js.native
    
    /**
      * Finds the last {@link LinkedListNode} in the list that matches the provided callback, starting from the end of the list.
      * @param callback The callback used to test each value and node.
      * @param thisArg The `this` value to use when executing `callback`.
      */
    def findLastNode(
      callback: js.Function3[/* value */ T, /* node */ LinkedListNode[T], /* list */ LinkedList[T], Boolean]
    ): js.UndefOr[LinkedListNode[T]] = js.native
    def findLastNode(
      callback: js.Function3[/* value */ T, /* node */ LinkedListNode[T], /* list */ LinkedList[T], Boolean],
      thisArg: Any
    ): js.UndefOr[LinkedListNode[T]] = js.native
    /**
      * Finds the last {@link LinkedListNode} in the list that matches the provided callback, starting from the end of the list.
      * @param callback The callback used to test each value and node.
      * @param thisArg The `this` value to use when executing `callback`.
      */
    @JSName("findLastNode")
    def findLastNode_S[S /* <: T */](
      callback: js.Function3[
          /* value */ T, 
          /* node */ LinkedListNode[T], 
          /* list */ LinkedList[T], 
          /* is S */ Boolean
        ]
    ): js.UndefOr[LinkedListNode[S]] = js.native
    @JSName("findLastNode")
    def findLastNode_S[S /* <: T */](
      callback: js.Function3[
          /* value */ T, 
          /* node */ LinkedListNode[T], 
          /* list */ LinkedList[T], 
          /* is S */ Boolean
        ],
      thisArg: Any
    ): js.UndefOr[LinkedListNode[S]] = js.native
    
    /**
      * Finds the last value in the list that matches the provided callback, starting from the end of the list.
      * @param callback The callback used to test each value and node.
      * @param thisArg The `this` value to use when executing `callback`.
      */
    @JSName("findLast")
    def findLast_S[S /* <: T */](
      callback: js.Function3[
          /* value */ T, 
          /* node */ LinkedListNode[T], 
          /* list */ LinkedList[T], 
          /* is S */ Boolean
        ]
    ): js.UndefOr[S] = js.native
    @JSName("findLast")
    def findLast_S[S /* <: T */](
      callback: js.Function3[
          /* value */ T, 
          /* node */ LinkedListNode[T], 
          /* list */ LinkedList[T], 
          /* is S */ Boolean
        ],
      thisArg: Any
    ): js.UndefOr[S] = js.native
    
    /**
      * Finds the first {@link LinkedListNode} in the list that matches the provided callback.
      * @param callback The callback used to test each value and node.
      * @param thisArg The `this` value to use when executing `callback`.
      */
    def findNode(
      callback: js.Function3[/* value */ T, /* node */ LinkedListNode[T], /* list */ LinkedList[T], Boolean]
    ): js.UndefOr[LinkedListNode[T]] = js.native
    def findNode(
      callback: js.Function3[/* value */ T, /* node */ LinkedListNode[T], /* list */ LinkedList[T], Boolean],
      thisArg: Any
    ): js.UndefOr[LinkedListNode[T]] = js.native
    /**
      * Finds the first {@link LinkedListNode} in the list that matches the provided callback.
      * @param callback The callback used to test each value and node.
      * @param thisArg The `this` value to use when executing `callback`.
      */
    @JSName("findNode")
    def findNode_S[S /* <: T */](
      callback: js.Function3[
          /* value */ T, 
          /* node */ LinkedListNode[T], 
          /* list */ LinkedList[T], 
          /* is S */ Boolean
        ]
    ): js.UndefOr[LinkedListNode[S]] = js.native
    @JSName("findNode")
    def findNode_S[S /* <: T */](
      callback: js.Function3[
          /* value */ T, 
          /* node */ LinkedListNode[T], 
          /* list */ LinkedList[T], 
          /* is S */ Boolean
        ],
      thisArg: Any
    ): js.UndefOr[LinkedListNode[S]] = js.native
    
    /**
      * Finds the first value in the list that matches the provided callback.
      * @param callback The callback used to test each value and node.
      * @param thisArg The `this` value to use when executing `callback`.
      */
    @JSName("find")
    def find_S[S /* <: T */](
      callback: js.Function3[
          /* value */ T, 
          /* node */ LinkedListNode[T], 
          /* list */ LinkedList[T], 
          /* is S */ Boolean
        ]
    ): js.UndefOr[S] = js.native
    @JSName("find")
    def find_S[S /* <: T */](
      callback: js.Function3[
          /* value */ T, 
          /* node */ LinkedListNode[T], 
          /* list */ LinkedList[T], 
          /* is S */ Boolean
        ],
      thisArg: Any
    ): js.UndefOr[S] = js.native
    
    /**
      * Gets the first node in the list. If the list is empty, this returns `undefined`.
      */
    def first: js.UndefOr[LinkedListNode[T]] = js.native
    
    def forEach(
      callback: js.Function3[/* value */ T, /* node */ LinkedListNode[T], /* list */ LinkedList[T], Unit]
    ): Unit = js.native
    def forEach(
      callback: js.Function3[/* value */ T, /* node */ LinkedListNode[T], /* list */ LinkedList[T], Unit],
      thisArg: Any
    ): Unit = js.native
    
    var get: Any = js.native
    
    /**
      * Returns a value indicating whether `value` exists within the list.
      */
    def has(value: T): Boolean = js.native
    
    def insertAfter(node: Null, value: T): LinkedListNode[T] = js.native
    def insertAfter(node: Unit, value: T): LinkedListNode[T] = js.native
    /**
      * Inserts a new {@link LinkedListNode} containing `value` into the list after the provided `node`.
      * If `node` is either `null` or `undefined`, the new node is inserted at the end of the list.
      * @param node The node after which `value` will be inserted.
      * @param value The value to insert.
      * @returns The new {@link LinkedListNode} for `value`.
      */
    def insertAfter(node: LinkedListNode[T], value: T): LinkedListNode[T] = js.native
    
    def insertBefore(node: Null, value: T): LinkedListNode[T] = js.native
    def insertBefore(node: Unit, value: T): LinkedListNode[T] = js.native
    /**
      * Inserts a new {@link LinkedListNode} containing `value` into the list before the provided `node`.
      * If `node` is either `null` or `undefined`, the new node is inserted at the beginning of the list.
      * @param node The node before which `value` will be inserted.
      * @param value The value to insert.
      * @returns The new {@link LinkedListNode} for `value`.
      */
    def insertBefore(node: LinkedListNode[T], value: T): LinkedListNode[T] = js.native
    
    def insertNodeAfter(node: Null, newNode: LinkedListNode[T]): Unit = js.native
    def insertNodeAfter(node: Unit, newNode: LinkedListNode[T]): Unit = js.native
    /**
      * Inserts `newNode` into the list after the provided `node`. If `node` is either `null` or `undefined`, `newNode`
      * is inserted at the end of the list.
      * @param node The node after which `newNode` will be inserted.
      * @param newNode The new node to insert.
      */
    def insertNodeAfter(node: LinkedListNode[T], newNode: LinkedListNode[T]): Unit = js.native
    
    def insertNodeBefore(node: Null, newNode: LinkedListNode[T]): Unit = js.native
    def insertNodeBefore(node: Unit, newNode: LinkedListNode[T]): Unit = js.native
    /**
      * Inserts `newNode` into the list before the provided `node`. If `node` is either `null` or `undefined`, `newNode`
      * is inserted at the beginning of the list.
      * @param node The node before which `newNode` will be inserted.
      * @param newNode The new node to insert.
      */
    def insertNodeBefore(node: LinkedListNode[T], newNode: LinkedListNode[T]): Unit = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator_LinkedList: js.Function0[IterableIterator[T]] = js.native
    
    /**
      * Gets the last node in the list. If the list is empty, this returns `undefined`.
      */
    def last: js.UndefOr[LinkedListNode[T]] = js.native
    
    /**
      * Finds the last node in the list with the provided value, starting from the end of the list.
      * @param value The value to find.
      * @param fromNode When provided, starts looking for `value` starting at this node and working backwards towards the front of the list.
      */
    def lastNodeOf(value: T): js.UndefOr[LinkedListNode[T]] = js.native
    def lastNodeOf(value: T, fromNode: LinkedListNode[T]): js.UndefOr[LinkedListNode[T]] = js.native
    
    /**
      * Calls the provided `callback` function on each element of the list, and returns a new {@link LinkedList} that contains the results.
      * @param callback The callback to call for each value and node.
      * @param thisArg The `this` value to use when executing `callback`.
      */
    def map[U](callback: js.Function3[/* value */ T, /* node */ LinkedListNode[T], /* list */ LinkedList[T], U]): LinkedList[U] = js.native
    def map[U](
      callback: js.Function3[/* value */ T, /* node */ LinkedListNode[T], /* list */ LinkedList[T], U],
      thisArg: Any
    ): LinkedList[U] = js.native
    
    /**
      * Finds the first node in the list with the provided value.
      * @param value The value to find.
      * @param fromNode When provided, starts looking for `value` starting at this node.
      */
    def nodeOf(value: T): js.UndefOr[LinkedListNode[T]] = js.native
    def nodeOf(value: T, fromNode: LinkedListNode[T]): js.UndefOr[LinkedListNode[T]] = js.native
    
    def nodes(): IterableIterator[LinkedListNode[T]] = js.native
    
    /**
      * Removes the last node from the list and returns its value. If the list is empty, `undefined` is returned instead.
      */
    def pop(): js.UndefOr[T] = js.native
    
    /**
      * Removes the last node from the list and returns it. If the lsit is empty, `undefined` is returned instead.
      */
    def popNode(): js.UndefOr[LinkedListNode[T]] = js.native
    
    /**
      * Inserts a new {@link LinkedListNode} containing `value` at the end of the list.
      * @param value The value to insert.
      * @returns The new {@link LinkedListNode} for `value`.
      */
    def push(value: T): LinkedListNode[T] = js.native
    
    /**
      * Inserts `newNode` at the end of the list.
      * @param newNode The node to insert.
      */
    def pushNode(newNode: LinkedListNode[T]): Unit = js.native
    
    /**
      * Calls the specified `callback` function for all the nodes in the list. The return value of the callback function is the accumulated result,
      * and is provided as an argument in the next call to the callback function.
      * @param callback A function that accepts up to four arguments. The reduce method calls the callback function one time for each element in the list.
      */
    def reduce(
      callback: js.Function4[
          /* previousValue */ T, 
          /* value */ T, 
          /* node */ LinkedListNode[T], 
          /* list */ LinkedList[T], 
          T
        ]
    ): T = js.native
    /**
      * Calls the specified `callback` function for all the nodes in the list. The return value of the callback function is the accumulated result,
      * and is provided as an argument in the next call to the callback function.
      * @param callback A function that accepts up to four arguments. The reduce method calls the callback function one time for each element in the list.
      * @param initialValue  If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the `callback` function provides this value as an argument instead of a list value.
      */
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
    
    /**
      * Calls the specified `callback` function for all the nodes in the list, in reverse. The return value of the callback function is the accumulated result,
      * and is provided as an argument in the next call to the callback function.
      * @param callback A function that accepts up to four arguments. The reduce method calls the callback function one time for each element in the list.
      */
    def reduceRight(
      callback: js.Function4[
          /* previousValue */ T, 
          /* value */ T, 
          /* node */ LinkedListNode[T], 
          /* list */ LinkedList[T], 
          T
        ]
    ): T = js.native
    /**
      * Calls the specified `callback` function for all the nodes in the list, in reverse. The return value of the callback function is the accumulated result,
      * and is provided as an argument in the next call to the callback function.
      * @param callback A function that accepts up to four arguments. The reduce method calls the callback function one time for each element in the list.
      * @param initialValue  If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the `callback` function provides this value as an argument instead of a list value.
      */
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
    /**
      * Calls the specified `callback` function for all the nodes in the list, in reverse. The return value of the callback function is the accumulated result,
      * and is provided as an argument in the next call to the callback function.
      * @param callback A function that accepts up to four arguments. The reduce method calls the callback function one time for each element in the list.
      * @param initialValue  If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the `callback` function provides this value as an argument instead of a list value.
      */
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
    
    /**
      * Calls the specified `callback` function for all the nodes in the list. The return value of the callback function is the accumulated result,
      * and is provided as an argument in the next call to the callback function.
      * @param callback A function that accepts up to four arguments. The reduce method calls the callback function one time for each element in the list.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the `callback` function provides this value as an argument instead of a list value.
      */
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
    
    /**
      * Removes the first node from the list and returns its value. If the list is empty, `undefined` is returned instead.
      */
    def shift(): js.UndefOr[T] = js.native
    
    /**
      * Removes the first node from the list and returns it. If the list is empty, `undefined` is returned instead.
      */
    def shiftNode(): js.UndefOr[LinkedListNode[T]] = js.native
    
    /**
      * Gets the number of elements in the list.
      */
    def size: Double = js.native
    
    def some(): Boolean = js.native
    def some(
      callback: js.Function3[/* value */ T, /* node */ LinkedListNode[T], /* list */ LinkedList[T], Boolean]
    ): Boolean = js.native
    def some(
      callback: js.Function3[/* value */ T, /* node */ LinkedListNode[T], /* list */ LinkedList[T], Boolean],
      thisArg: Any
    ): Boolean = js.native
    def some(callback: Unit, thisArg: Any): Boolean = js.native
    
    @JSName(js.Symbol.toStringTag)
    var toStringTag: String = js.native
    
    /**
      * Inserts a new {@link LinkedListNode} containing `value` at the beginning of the list.
      * @param value The value to insert.
      * @returns The new {@link LinkedListNode} for `value`.
      */
    def unshift(value: T): LinkedListNode[T] = js.native
    
    /**
      * Inserts `newNode` at the beginning of the list.
      * @param newNode The node to insert.
      */
    def unshiftNode(newNode: LinkedListNode[T]): Unit = js.native
    
    def values(): IterableIterator[T] = js.native
  }
  
  @JSImport("@esfx/collections-linkedlist", "LinkedListNode")
  @js.native
  open class LinkedListNode[T] protected () extends StObject {
    def this(value: T) = this()
    
    /**
      * Removes this node from its associated list.
      * @returns `true` if the node was successfully removed from the list; otherwise, `false`.
      */
    def detachSelf(): Boolean = js.native
    
    /**
      * Gets the list associated with this node. If the node is not attached to a {@link LinkedList}, then this returns
      * `undefined`.
      */
    def list: js.UndefOr[LinkedList[T]] = js.native
    
    /**
      * Gets the {@link LinkedListNode} following this node in the list. If this is the last node in the list, or the
      * node is not attached to a {@link LinkedList}, then this returns `undefined`.
      */
    def next: js.UndefOr[LinkedListNode[T]] = js.native
    
    /**
      * Gets the {@link LinkedListNode} preceding this node in the list. If this is the first node in the list, or the
      * node is not attached to a {@link LinkedList}, then this returns `undefined`.
      */
    def previous: js.UndefOr[LinkedListNode[T]] = js.native
    
    @JSName(js.Symbol.toStringTag)
    var toStringTag: String = js.native
    
    /**
      * The value for the node.
      */
    var value: T = js.native
  }
}
