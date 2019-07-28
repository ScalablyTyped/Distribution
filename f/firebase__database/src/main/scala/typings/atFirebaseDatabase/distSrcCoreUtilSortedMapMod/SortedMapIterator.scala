package typings.atFirebaseDatabase.distSrcCoreUtilSortedMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/util/SortedMap", "SortedMapIterator")
@js.native
class SortedMapIterator[K, V, T] protected () extends js.Object {
  def this(node: LLRBEmptyNode[K, V], startKey: K, comparator: Comparator[K], isReverse_ : Boolean) = this()
  def this(node: LLRBEmptyNode[K, V], startKey: Null, comparator: Comparator[K], isReverse_ : Boolean) = this()
  /**
    * @template K, V, T
    * @param {LLRBNode|LLRBEmptyNode} node Node to iterate.
    * @param {?K} startKey
    * @param {function(K, K): number} comparator
    * @param {boolean} isReverse_ Whether or not to iterate in reverse
    * @param {(function(K, V):T)=} resultGenerator_
    */
  def this(node: LLRBNode[K, V], startKey: K, comparator: Comparator[K], isReverse_ : Boolean) = this()
  def this(node: LLRBNode[K, V], startKey: Null, comparator: Comparator[K], isReverse_ : Boolean) = this()
  def this(
    node: LLRBEmptyNode[K, V],
    startKey: K,
    comparator: Comparator[K],
    isReverse_ : Boolean,
    resultGenerator_ : js.Function2[/* k */ K, /* v */ V, T]
  ) = this()
  def this(
    node: LLRBEmptyNode[K, V],
    startKey: Null,
    comparator: Comparator[K],
    isReverse_ : Boolean,
    resultGenerator_ : js.Function2[/* k */ K, /* v */ V, T]
  ) = this()
  def this(
    node: LLRBNode[K, V],
    startKey: K,
    comparator: Comparator[K],
    isReverse_ : Boolean,
    resultGenerator_ : js.Function2[/* k */ K, /* v */ V, T]
  ) = this()
  def this(
    node: LLRBNode[K, V],
    startKey: Null,
    comparator: Comparator[K],
    isReverse_ : Boolean,
    resultGenerator_ : js.Function2[/* k */ K, /* v */ V, T]
  ) = this()
  var isReverse_ : js.Any = js.native
  /** @private
    * @type {Array.<!LLRBNode>}
    */
  var nodeStack_ : js.Any = js.native
  var resultGenerator_ : js.Any = js.native
  def getNext(): T = js.native
  def hasNext(): Boolean = js.native
  def peek(): T = js.native
}

