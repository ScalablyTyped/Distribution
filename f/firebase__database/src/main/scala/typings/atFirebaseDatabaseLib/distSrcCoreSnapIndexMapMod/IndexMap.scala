package typings
package atFirebaseDatabaseLib.distSrcCoreSnapIndexMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/snap/IndexMap", "IndexMap")
@js.native
class IndexMap protected () extends js.Object {
  def this(`indexes_`: org.scalablytyped.runtime.StringDictionary[
      (atFirebaseDatabaseLib.distSrcCoreUtilSortedMapMod.SortedMap[
        atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.NamedNode, 
        atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node
      ]) | js.Object
    ], `indexSet_`: org.scalablytyped.runtime.StringDictionary[atFirebaseDatabaseLib.distSrcCoreSnapIndexesIndexMod.Index]) = this()
  var `indexSet_`: js.Any = js.native
  var `indexes_`: js.Any = js.native
  /**
    * @param {!Index} indexDefinition
    * @param {!SortedMap.<string, !Node>} existingChildren
    * @return {!IndexMap}
    */
  def addIndex(
    indexDefinition: atFirebaseDatabaseLib.distSrcCoreSnapIndexesIndexMod.Index,
    existingChildren: atFirebaseDatabaseLib.distSrcCoreUtilSortedMapMod.SortedMap[java.lang.String, atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node]
  ): IndexMap = js.native
  /**
    * Ensure that this node is properly tracked in any indexes that we're maintaining
    * @param {!NamedNode} namedNode
    * @param {!SortedMap.<string, !Node>} existingChildren
    * @return {!IndexMap}
    */
  def addToIndexes(
    namedNode: atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.NamedNode,
    existingChildren: atFirebaseDatabaseLib.distSrcCoreUtilSortedMapMod.SortedMap[java.lang.String, atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node]
  ): IndexMap = js.native
  /**
    *
    * @param {!string} indexKey
    * @return {?SortedMap.<NamedNode, Node>}
    */
  def get(indexKey: java.lang.String): (atFirebaseDatabaseLib.distSrcCoreUtilSortedMapMod.SortedMap[
    atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.NamedNode, 
    atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node
  ]) | scala.Null = js.native
  /**
    * @param {!Index} indexDefinition
    * @return {boolean}
    */
  def hasIndex(indexDefinition: atFirebaseDatabaseLib.distSrcCoreSnapIndexesIndexMod.Index): scala.Boolean = js.native
  /**
    * Create a new IndexMap instance with the given value removed
    * @param {!NamedNode} namedNode
    * @param {!SortedMap.<string, !Node>} existingChildren
    * @return {!IndexMap}
    */
  def removeFromIndexes(
    namedNode: atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.NamedNode,
    existingChildren: atFirebaseDatabaseLib.distSrcCoreUtilSortedMapMod.SortedMap[java.lang.String, atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node]
  ): IndexMap = js.native
}

/* static members */
@JSImport("@firebase/database/dist/src/core/snap/IndexMap", "IndexMap")
@js.native
object IndexMap extends js.Object {
  /**
    * The default IndexMap for nodes without a priority
    * @type {!IndexMap}
    * @const
    */
  val Default: atFirebaseDatabaseLib.distSrcCoreSnapIndexMapMod.IndexMap = js.native
}

