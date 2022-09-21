package typings.firebaseFirestore

import typings.firebaseFirestore.firebaseFirestoreNumbers.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilSortedMapMod {
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/util/sorted_map", "LLRBEmptyNode")
  @js.native
  open class LLRBEmptyNode[K, V] () extends StObject {
    
    /* protected */ def check(): `0` = js.native
    
    def checkMaxDepth(): Boolean = js.native
    
    def color: scala.Nothing = js.native
    
    def copy(
      key: K | Null,
      value: V | Null,
      color: Boolean | Null,
      left: (LLRBNode[K, V]) | (LLRBEmptyNode[K, V]) | Null,
      right: (LLRBNode[K, V]) | (LLRBEmptyNode[K, V]) | Null
    ): LLRBEmptyNode[K, V] = js.native
    
    def inorderTraversal(action: js.Function2[/* k */ K, /* v */ V, Boolean]): Boolean = js.native
    
    def insert(key: K, value: V, comparator: Comparator[K]): LLRBNode[K, V] = js.native
    
    def isEmpty(): Boolean = js.native
    
    def isRed(): Boolean = js.native
    
    def key: scala.Nothing = js.native
    
    def left: scala.Nothing = js.native
    
    def maxKey(): K | Null = js.native
    
    def minKey(): K | Null = js.native
    
    def remove(key: K, comparator: Comparator[K]): LLRBEmptyNode[K, V] = js.native
    
    def reverseTraversal(action: js.Function2[/* k */ K, /* v */ V, Boolean]): Boolean = js.native
    
    def right: scala.Nothing = js.native
    
    var size: Double = js.native
    
    def value: scala.Nothing = js.native
  }
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/util/sorted_map", "LLRBNode")
  @js.native
  open class LLRBNode[K, V] protected () extends StObject {
    def this(key: K, value: V) = this()
    def this(key: K, value: V, color: Boolean) = this()
    def this(key: K, value: V, color: Boolean, left: LLRBEmptyNode[K, V]) = this()
    def this(key: K, value: V, color: Boolean, left: LLRBNode[K, V]) = this()
    def this(key: K, value: V, color: Unit, left: LLRBEmptyNode[K, V]) = this()
    def this(key: K, value: V, color: Unit, left: LLRBNode[K, V]) = this()
    def this(key: K, value: V, color: Boolean, left: Unit, right: LLRBEmptyNode[K, V]) = this()
    def this(key: K, value: V, color: Boolean, left: Unit, right: LLRBNode[K, V]) = this()
    def this(key: K, value: V, color: Boolean, left: LLRBEmptyNode[K, V], right: LLRBEmptyNode[K, V]) = this()
    def this(key: K, value: V, color: Boolean, left: LLRBEmptyNode[K, V], right: LLRBNode[K, V]) = this()
    def this(key: K, value: V, color: Boolean, left: LLRBNode[K, V], right: LLRBEmptyNode[K, V]) = this()
    def this(key: K, value: V, color: Boolean, left: LLRBNode[K, V], right: LLRBNode[K, V]) = this()
    def this(key: K, value: V, color: Unit, left: Unit, right: LLRBEmptyNode[K, V]) = this()
    def this(key: K, value: V, color: Unit, left: Unit, right: LLRBNode[K, V]) = this()
    def this(key: K, value: V, color: Unit, left: LLRBEmptyNode[K, V], right: LLRBEmptyNode[K, V]) = this()
    def this(key: K, value: V, color: Unit, left: LLRBEmptyNode[K, V], right: LLRBNode[K, V]) = this()
    def this(key: K, value: V, color: Unit, left: LLRBNode[K, V], right: LLRBEmptyNode[K, V]) = this()
    def this(key: K, value: V, color: Unit, left: LLRBNode[K, V], right: LLRBNode[K, V]) = this()
    
    /* protected */ def check(): Double = js.native
    
    def checkMaxDepth(): Boolean = js.native
    
    val color: Boolean = js.native
    
    /* private */ var colorFlip: Any = js.native
    
    def copy(
      key: K | Null,
      value: V | Null,
      color: Boolean | Null,
      left: (LLRBNode[K, V]) | (LLRBEmptyNode[K, V]) | Null,
      right: (LLRBNode[K, V]) | (LLRBEmptyNode[K, V]) | Null
    ): LLRBNode[K, V] = js.native
    
    /* private */ var fixUp: Any = js.native
    
    def inorderTraversal[T](action: js.Function2[/* k */ K, /* v */ V, T]): T = js.native
    
    def insert(key: K, value: V, comparator: Comparator[K]): LLRBNode[K, V] = js.native
    
    def isEmpty(): Boolean = js.native
    
    def isRed(): Boolean = js.native
    
    var key: K = js.native
    
    val left: (LLRBNode[K, V]) | (LLRBEmptyNode[K, V]) = js.native
    
    def maxKey(): K | Null = js.native
    
    /* private */ var min: Any = js.native
    
    def minKey(): K | Null = js.native
    
    /* private */ var moveRedLeft: Any = js.native
    
    /* private */ var moveRedRight: Any = js.native
    
    def remove(key: K, comparator: Comparator[K]): (LLRBNode[K, V]) | (LLRBEmptyNode[K, V]) = js.native
    
    /* private */ var removeMin: Any = js.native
    
    def reverseTraversal[T](action: js.Function2[/* k */ K, /* v */ V, T]): T = js.native
    
    val right: (LLRBNode[K, V]) | (LLRBEmptyNode[K, V]) = js.native
    
    /* private */ var rotateLeft: Any = js.native
    
    /* private */ var rotateRight: Any = js.native
    
    val size: Double = js.native
    
    var value: V = js.native
  }
  /* static members */
  object LLRBNode {
    
    @JSImport("@firebase/firestore/dist/lite/firestore/src/util/sorted_map", "LLRBNode")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@firebase/firestore/dist/lite/firestore/src/util/sorted_map", "LLRBNode.BLACK")
    @js.native
    def BLACK: Boolean = js.native
    inline def BLACK_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BLACK")(x.asInstanceOf[js.Any])
    
    @JSImport("@firebase/firestore/dist/lite/firestore/src/util/sorted_map", "LLRBNode.EMPTY")
    @js.native
    def EMPTY: LLRBEmptyNode[Any, Any] = js.native
    inline def EMPTY_=(x: LLRBEmptyNode[Any, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EMPTY")(x.asInstanceOf[js.Any])
    
    @JSImport("@firebase/firestore/dist/lite/firestore/src/util/sorted_map", "LLRBNode.RED")
    @js.native
    def RED: Boolean = js.native
    inline def RED_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RED")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/util/sorted_map", "SortedMap")
  @js.native
  open class SortedMap[K, V] protected () extends StObject {
    def this(comparator: Comparator[K]) = this()
    def this(comparator: Comparator[K], root: LLRBEmptyNode[K, V]) = this()
    def this(comparator: Comparator[K], root: LLRBNode[K, V]) = this()
    
    def comparator(key1: K, key2: K): Double = js.native
    @JSName("comparator")
    var comparator_Original: Comparator[K] = js.native
    
    def forEach(fn: js.Function2[/* k */ K, /* v */ V, Unit]): Unit = js.native
    
    def get(key: K): V | Null = js.native
    
    def getIterator(): SortedMapIterator[K, V] = js.native
    
    def getIteratorFrom(key: K): SortedMapIterator[K, V] = js.native
    
    def getReverseIterator(): SortedMapIterator[K, V] = js.native
    
    def getReverseIteratorFrom(key: K): SortedMapIterator[K, V] = js.native
    
    def indexOf(key: K): Double = js.native
    
    def inorderTraversal[T](action: js.Function2[/* k */ K, /* v */ V, T]): T = js.native
    
    def insert(key: K, value: V): SortedMap[K, V] = js.native
    
    def isEmpty(): Boolean = js.native
    
    def maxKey(): K | Null = js.native
    
    def minKey(): K | Null = js.native
    
    def remove(key: K): SortedMap[K, V] = js.native
    
    def reverseTraversal[T](action: js.Function2[/* k */ K, /* v */ V, T]): T = js.native
    
    var root: (LLRBNode[K, V]) | (LLRBEmptyNode[K, V]) = js.native
    
    def size: Double = js.native
  }
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/util/sorted_map", "SortedMapIterator")
  @js.native
  open class SortedMapIterator[K, V] protected () extends StObject {
    def this(node: LLRBEmptyNode[K, V], startKey: K, comparator: Comparator[K], isReverse: Boolean) = this()
    def this(node: LLRBEmptyNode[K, V], startKey: Null, comparator: Comparator[K], isReverse: Boolean) = this()
    def this(node: LLRBNode[K, V], startKey: K, comparator: Comparator[K], isReverse: Boolean) = this()
    def this(node: LLRBNode[K, V], startKey: Null, comparator: Comparator[K], isReverse: Boolean) = this()
    
    def getNext(): Entry[K, V] = js.native
    
    def hasNext(): Boolean = js.native
    
    /* private */ var isReverse: Any = js.native
    
    /* private */ var nodeStack: Any = js.native
    
    def peek(): (Entry[K, V]) | Null = js.native
  }
  
  type Comparator[K] = js.Function2[/* key1 */ K, /* key2 */ K, Double]
  
  trait Entry[K, V] extends StObject {
    
    var key: K
    
    var value: V
  }
  object Entry {
    
    inline def apply[K, V](key: K, value: V): Entry[K, V] = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Entry[K, V]]
    }
    
    extension [Self <: Entry[?, ?], K, V](x: Self & (Entry[K, V])) {
      
      inline def setKey(value: K): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValue(value: V): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
