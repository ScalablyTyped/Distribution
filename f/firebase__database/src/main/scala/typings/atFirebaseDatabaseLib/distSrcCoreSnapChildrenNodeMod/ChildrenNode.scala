package typings
package atFirebaseDatabaseLib.distSrcCoreSnapChildrenNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/snap/ChildrenNode", "ChildrenNode")
@js.native
class ChildrenNode protected ()
  extends atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node {
  /**
       *
       * @param {!SortedMap.<string, !Node>} children_ List of children
       * of this node..
       * @param {?Node} priorityNode_ The priority of this node (as a snapshot node).
       * @param {!IndexMap} indexMap_
       */
  def this(`children_`: atFirebaseDatabaseLib.distSrcCoreUtilSortedMapMod.SortedMap[java.lang.String, atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node], `priorityNode_`: atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node, `indexMap_`: atFirebaseDatabaseLib.distSrcCoreSnapIndexMapMod.IndexMap) = this()
  /**
       *
       * @param {!SortedMap.<string, !Node>} children_ List of children
       * of this node..
       * @param {?Node} priorityNode_ The priority of this node (as a snapshot node).
       * @param {!IndexMap} indexMap_
       */
  def this(`children_`: atFirebaseDatabaseLib.distSrcCoreUtilSortedMapMod.SortedMap[java.lang.String, atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node], `priorityNode_`: scala.Null, `indexMap_`: atFirebaseDatabaseLib.distSrcCoreSnapIndexMapMod.IndexMap) = this()
  val `children_`: js.Any = js.native
  var `indexMap_`: js.Any = js.native
  var `lazyHash_`: js.Any = js.native
  val `priorityNode_`: js.Any = js.native
  /**
       * @inheritDoc
       */
  def compareTo(other: ChildrenNode): scala.Double = js.native
  /**
       * @param {!Index} indexDefinition
       * @return {?NamedNode}
       */
  def getFirstChild(indexDefinition: atFirebaseDatabaseLib.distSrcCoreSnapIndexesIndexMod.Index): atFirebaseDatabaseLib.distSrcCoreSnapChildrenNodeMod.distSrcCoreSnapNodeMod.NamedNode | scala.Null = js.native
  /**
       * @param {!Index} indexDefinition
       * @return {?string}
       */
  def getFirstChildName(indexDefinition: atFirebaseDatabaseLib.distSrcCoreSnapIndexesIndexMod.Index): java.lang.String | scala.Null = js.native
  /**
       * @param {!Index} indexDefinition
       * @return {SortedMapIterator}
       */
  def getIterator(indexDefinition: atFirebaseDatabaseLib.distSrcCoreSnapIndexesIndexMod.Index): atFirebaseDatabaseLib.distSrcCoreUtilSortedMapMod.SortedMapIterator[
    java.lang.String | atFirebaseDatabaseLib.distSrcCoreSnapChildrenNodeMod.distSrcCoreSnapNodeMod.NamedNode, 
    atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node, 
    atFirebaseDatabaseLib.distSrcCoreSnapChildrenNodeMod.distSrcCoreSnapNodeMod.NamedNode
  ] = js.native
  /**
       *
       * @param {!NamedNode} startPost
       * @param {!Index} indexDefinition
       * @return {!SortedMapIterator}
       */
  def getIteratorFrom(
    startPost: atFirebaseDatabaseLib.distSrcCoreSnapChildrenNodeMod.distSrcCoreSnapNodeMod.NamedNode,
    indexDefinition: atFirebaseDatabaseLib.distSrcCoreSnapIndexesIndexMod.Index
  ): atFirebaseDatabaseLib.distSrcCoreUtilSortedMapMod.SortedMapIterator[
    java.lang.String | atFirebaseDatabaseLib.distSrcCoreSnapChildrenNodeMod.distSrcCoreSnapNodeMod.NamedNode, 
    atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node, 
    atFirebaseDatabaseLib.distSrcCoreSnapChildrenNodeMod.distSrcCoreSnapNodeMod.NamedNode
  ] = js.native
  /**
       * @param {!Index} indexDefinition
       * @return {?NamedNode}
       */
  def getLastChild(indexDefinition: atFirebaseDatabaseLib.distSrcCoreSnapIndexesIndexMod.Index): atFirebaseDatabaseLib.distSrcCoreSnapChildrenNodeMod.distSrcCoreSnapNodeMod.NamedNode | scala.Null = js.native
  /**
       * Given an index, return the key name of the largest value we have, according to that index
       * @param {!Index} indexDefinition
       * @return {?string}
       */
  def getLastChildName(indexDefinition: atFirebaseDatabaseLib.distSrcCoreSnapIndexesIndexMod.Index): java.lang.String | scala.Null = js.native
  /**
       * @param {!Index} indexDefinition
       * @return {!SortedMapIterator}
       */
  def getReverseIterator(indexDefinition: atFirebaseDatabaseLib.distSrcCoreSnapIndexesIndexMod.Index): atFirebaseDatabaseLib.distSrcCoreUtilSortedMapMod.SortedMapIterator[
    java.lang.String | atFirebaseDatabaseLib.distSrcCoreSnapChildrenNodeMod.distSrcCoreSnapNodeMod.NamedNode, 
    atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node, 
    atFirebaseDatabaseLib.distSrcCoreSnapChildrenNodeMod.distSrcCoreSnapNodeMod.NamedNode
  ] = js.native
  /**
       * @param {!NamedNode} endPost
       * @param {!Index} indexDefinition
       * @return {!SortedMapIterator}
       */
  def getReverseIteratorFrom(
    endPost: atFirebaseDatabaseLib.distSrcCoreSnapChildrenNodeMod.distSrcCoreSnapNodeMod.NamedNode,
    indexDefinition: atFirebaseDatabaseLib.distSrcCoreSnapIndexesIndexMod.Index
  ): atFirebaseDatabaseLib.distSrcCoreUtilSortedMapMod.SortedMapIterator[
    java.lang.String | atFirebaseDatabaseLib.distSrcCoreSnapChildrenNodeMod.distSrcCoreSnapNodeMod.NamedNode, 
    atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node, 
    atFirebaseDatabaseLib.distSrcCoreSnapChildrenNodeMod.distSrcCoreSnapNodeMod.NamedNode
  ] = js.native
  /**
       * Returns a SortedMap ordered by index, or null if the default (by-key) ordering can be used
       * instead.
       *
       * @private
       * @param {!Index} indexDefinition
       * @return {?SortedMap.<NamedNode, Node>}
       */
  /* private */ def `resolveIndex_`(indexDefinition: js.Any): js.Any = js.native
}

@JSImport("@firebase/database/dist/src/core/snap/ChildrenNode", "ChildrenNode")
@js.native
object ChildrenNode extends js.Object {
  val EMPTY_NODE: atFirebaseDatabaseLib.distSrcCoreSnapChildrenNodeMod.ChildrenNode = js.native
  /**
       * @private
       * @type {RegExp}
       */
  var `INTEGER_REGEXP_`: js.Any = js.native
}

