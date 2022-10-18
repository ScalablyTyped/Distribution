package typings.firebaseFirestore

import typings.firebaseFirestore.distLitePackagesFirestoreSrcUtilSortedMapMod.SortedMapIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLitePackagesFirestoreSrcUtilSortedSetMod {
  
  @JSImport("@firebase/firestore/dist/lite/packages/firestore/src/util/sorted_set", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/firestore/dist/lite/packages/firestore/src/util/sorted_set", "SortedSet")
  @js.native
  open class SortedSet[T] protected () extends StObject {
    def this(comparator: js.Function2[/* left */ T, /* right */ T, Double]) = this()
    
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
  
  @JSImport("@firebase/firestore/dist/lite/packages/firestore/src/util/sorted_set", "SortedSetIterator")
  @js.native
  open class SortedSetIterator[T] protected () extends StObject {
    def this(iter: SortedMapIterator[T, Boolean]) = this()
    
    def getNext(): T = js.native
    
    def hasNext(): Boolean = js.native
    
    /* private */ var iter: Any = js.native
  }
  
  inline def diffSortedSets[T](
    before: SortedSet[T],
    after: SortedSet[T],
    comparator: js.Function2[/* l */ T, /* r */ T, Double],
    onAdd: js.Function1[/* entry */ T, Unit],
    onRemove: js.Function1[/* entry */ T, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("diffSortedSets")(before.asInstanceOf[js.Any], after.asInstanceOf[js.Any], comparator.asInstanceOf[js.Any], onAdd.asInstanceOf[js.Any], onRemove.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
