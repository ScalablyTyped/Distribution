package typings.firebaseFirestore

import typings.firebaseFirestore.utilSortedMapMod.SortedMap
import typings.firebaseFirestore.utilSortedMapMod.SortedMapIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/util/sorted_set", JSImport.Namespace)
@js.native
object utilSortedSetMod extends js.Object {
  @js.native
  class SortedSet[T] protected () extends js.Object {
    def this(comparator: js.Function2[/* left */ T, /* right */ T, Double]) = this()
    var comparator: js.Any = js.native
    var copy: js.Any = js.native
    var data: js.Any = js.native
    /** Inserts or updates an element */
    def add(elem: T): SortedSet[T] = js.native
    /** Deletes an element */
    def delete(elem: T): SortedSet[T] = js.native
    def first(): T | Null = js.native
    /** Finds the least element greater than or equal to `elem`. */
    def firstAfterOrEqual(elem: T): T | Null = js.native
    /** Iterates elements in order defined by "comparator" */
    def forEach(cb: js.Function1[/* elem */ T, Unit]): Unit = js.native
    /** Iterates over `elem`s such that: range[0] <= elem < range[1]. */
    def forEachInRange(range: js.Tuple2[T, T], cb: js.Function1[/* elem */ T, Unit]): Unit = js.native
    /**
      * Iterates over `elem`s such that: start <= elem until false is returned.
      */
    def forEachWhile(cb: js.Function1[/* elem */ T, Boolean]): Unit = js.native
    def forEachWhile(cb: js.Function1[/* elem */ T, Boolean], start: T): Unit = js.native
    def getIterator(): SortedSetIterator[T] = js.native
    def getIteratorFrom(key: T): SortedSetIterator[T] = js.native
    def has(elem: T): Boolean = js.native
    def indexOf(elem: T): Double = js.native
    def isEmpty(): Boolean = js.native
    def isEqual(other: SortedSet[T]): Boolean = js.native
    def last(): T | Null = js.native
    def size(): Double = js.native
    def toArray(): js.Array[T] = js.native
    def unionWith(other: SortedSet[T]): SortedSet[T] = js.native
  }
  
  @js.native
  class SortedSetIterator[T] protected () extends js.Object {
    def this(iter: SortedMapIterator[T, Boolean]) = this()
    var iter: js.Any = js.native
    def getNext(): T = js.native
    def hasNext(): Boolean = js.native
  }
  
  /* static members */
  @js.native
  object SortedSet extends js.Object {
    /**
      * Creates a SortedSet from the keys of the map.
      * This is currently implemented as an O(n) copy.
      */
    def fromMapKeys[K, V](map: SortedMap[K, V]): SortedSet[K] = js.native
  }
  
}

