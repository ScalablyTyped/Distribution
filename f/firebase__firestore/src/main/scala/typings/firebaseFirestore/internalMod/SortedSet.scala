package typings.firebaseFirestore.internalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SortedSet is an immutable (copy-on-write) collection that holds elements
  * in order specified by the provided comparator.
  *
  * NOTE: if provided comparator returns 0 for two elements, we consider them to
  * be equal!
  */
@js.native
trait SortedSet[T] extends StObject {
  
  /** Inserts or updates an element */
  def add(elem: T): SortedSet[T] = js.native
  
  /* private */ var comparator: Any = js.native
  
  /* private */ var copy: Any = js.native
  
  /* private */ var data: Any = js.native
  
  /** Deletes an element */
  def delete(elem: T): SortedSet[T] = js.native
  
  def first(): T | Null = js.native
  
  /** Finds the least element greater than or equal to `elem`. */
  def firstAfterOrEqual(elem: T): T | Null = js.native
  
  /** Iterates elements in order defined by "comparator" */
  def forEach(cb: js.Function1[/* elem */ T, Unit]): Unit = js.native
  
  /** Iterates over `elem`s such that: range[0] &lt;= elem &lt; range[1]. */
  def forEachInRange(range: js.Tuple2[T, T], cb: js.Function1[/* elem */ T, Unit]): Unit = js.native
  
  /**
    * Iterates over `elem`s such that: start &lt;= elem until false is returned.
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
  
  def size: Double = js.native
  
  def toArray(): js.Array[T] = js.native
  
  def unionWith(other: SortedSet[T]): SortedSet[T] = js.native
}
