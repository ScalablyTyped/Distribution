package typings.atFirebaseDatabase.distSrcCoreSnapChildrenNodeMod

import typings.atFirebaseDatabase.distSrcCoreSnapChildrenNodeMod.distSrcCoreSnapNodeMod.NamedNode
import typings.atFirebaseDatabase.distSrcCoreSnapIndexMapMod.IndexMap
import typings.atFirebaseDatabase.distSrcCoreSnapIndexesIndexMod.Index
import typings.atFirebaseDatabase.distSrcCoreSnapNodeMod.Node
import typings.atFirebaseDatabase.distSrcCoreUtilSortedMapMod.SortedMap
import typings.atFirebaseDatabase.distSrcCoreUtilSortedMapMod.SortedMapIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/snap/ChildrenNode", "ChildrenNode")
@js.native
class ChildrenNode protected () extends Node {
  def this(children_ : SortedMap[String, Node], priorityNode_ : Null, indexMap_ : IndexMap) = this()
  /**
    *
    * @param {!SortedMap.<string, !Node>} children_ List of children
    * of this node..
    * @param {?Node} priorityNode_ The priority of this node (as a snapshot node).
    * @param {!IndexMap} indexMap_
    */
  def this(children_ : SortedMap[String, Node], priorityNode_ : Node, indexMap_ : IndexMap) = this()
  val children_ : js.Any = js.native
  var indexMap_ : js.Any = js.native
  var lazyHash_ : js.Any = js.native
  val priorityNode_ : js.Any = js.native
  /**
    * Returns a SortedMap ordered by index, or null if the default (by-key) ordering can be used
    * instead.
    *
    * @private
    * @param {!Index} indexDefinition
    * @return {?SortedMap.<NamedNode, Node>}
    */
  var resolveIndex_ : js.Any = js.native
  /**
    * @inheritDoc
    */
  def compareTo(other: ChildrenNode): Double = js.native
  /**
    * @param {!Index} indexDefinition
    * @return {?NamedNode}
    */
  def getFirstChild(indexDefinition: Index): NamedNode | Null = js.native
  /**
    * @param {!Index} indexDefinition
    * @return {?string}
    */
  def getFirstChildName(indexDefinition: Index): String | Null = js.native
  /**
    * @param {!Index} indexDefinition
    * @return {SortedMapIterator}
    */
  def getIterator(indexDefinition: Index): SortedMapIterator[String | NamedNode, Node, NamedNode] = js.native
  /**
    *
    * @param {!NamedNode} startPost
    * @param {!Index} indexDefinition
    * @return {!SortedMapIterator}
    */
  def getIteratorFrom(startPost: NamedNode, indexDefinition: Index): SortedMapIterator[String | NamedNode, Node, NamedNode] = js.native
  /**
    * @param {!Index} indexDefinition
    * @return {?NamedNode}
    */
  def getLastChild(indexDefinition: Index): NamedNode | Null = js.native
  /**
    * Given an index, return the key name of the largest value we have, according to that index
    * @param {!Index} indexDefinition
    * @return {?string}
    */
  def getLastChildName(indexDefinition: Index): String | Null = js.native
  /**
    * @param {!Index} indexDefinition
    * @return {!SortedMapIterator}
    */
  def getReverseIterator(indexDefinition: Index): SortedMapIterator[String | NamedNode, Node, NamedNode] = js.native
  /**
    * @param {!NamedNode} endPost
    * @param {!Index} indexDefinition
    * @return {!SortedMapIterator}
    */
  def getReverseIteratorFrom(endPost: NamedNode, indexDefinition: Index): SortedMapIterator[String | NamedNode, Node, NamedNode] = js.native
}

/* static members */
@JSImport("@firebase/database/dist/src/core/snap/ChildrenNode", "ChildrenNode")
@js.native
object ChildrenNode extends js.Object {
  val EMPTY_NODE: ChildrenNode = js.native
  /**
    * @private
    * @type {RegExp}
    */
  var INTEGER_REGEXP_ : js.Any = js.native
}

