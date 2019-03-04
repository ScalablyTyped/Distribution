package typings
package atFirebaseDatabaseLib.distSrcCoreWriteTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/WriteTree", "WriteTreeRef")
@js.native
class WriteTreeRef protected () extends js.Object {
  /**
    * @param {!Path} path
    * @param {!WriteTree} writeTree
    */
  def this(path: atFirebaseDatabaseLib.distSrcCoreUtilPathMod.Path, writeTree: WriteTree) = this()
  /**
    * The path to this particular write tree ref. Used for calling methods on writeTree_ while exposing a simpler
    * interface to callers.
    *
    * @type {!Path}
    * @private
    * @const
    */
  val treePath_ : js.Any = js.native
  /**
    * * A reference to the actual tree of write data. All methods are pass-through to the tree, but with the appropriate
    * path prefixed.
    *
    * This lets us make cheap references to points in the tree for sync points without having to copy and maintain all of
    * the data.
    *
    * @type {!WriteTree}
    * @private
    * @const
    */
  val writeTree_ : js.Any = js.native
  /**
    * Returns a complete child for a given server snap after applying all user writes or null if there is no
    * complete child for this ChildKey.
    *
    * @param {!string} childKey
    * @param {!CacheNode} existingServerCache
    * @return {?Node}
    */
  def calcCompleteChild(
    childKey: java.lang.String,
    existingServerCache: atFirebaseDatabaseLib.distSrcCoreViewCacheNodeMod.CacheNode
  ): atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node | scala.Null = js.native
  def calcCompleteEventCache(): atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node | scala.Null = js.native
  /**
    * If possible, returns a complete event cache, using the underlying server data if possible. In addition, can be used
    * to get a cache that includes hidden writes, and excludes arbitrary writes. Note that customizing the returned node
    * can lead to a more expensive calculation.
    *
    * @param {?Node} completeServerCache
    * @param {Array.<number>=} writeIdsToExclude Optional writes to exclude.
    * @param {boolean=} includeHiddenWrites Defaults to false, whether or not to layer on writes with visible set to false
    * @return {?Node}
    */
  def calcCompleteEventCache(completeServerCache: atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node): atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node | scala.Null = js.native
  def calcCompleteEventCache(
    completeServerCache: atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node,
    writeIdsToExclude: js.Array[scala.Double]
  ): atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node | scala.Null = js.native
  def calcCompleteEventCache(
    completeServerCache: atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node,
    writeIdsToExclude: js.Array[scala.Double],
    includeHiddenWrites: scala.Boolean
  ): atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node | scala.Null = js.native
  def calcCompleteEventCache(completeServerCache: scala.Null, writeIdsToExclude: js.Array[scala.Double]): atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node | scala.Null = js.native
  def calcCompleteEventCache(
    completeServerCache: scala.Null,
    writeIdsToExclude: js.Array[scala.Double],
    includeHiddenWrites: scala.Boolean
  ): atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node | scala.Null = js.native
  def calcCompleteEventChildren(): atFirebaseDatabaseLib.distSrcCoreSnapChildrenNodeMod.ChildrenNode = js.native
  /**
    * If possible, returns a children node containing all of the complete children we have data for. The returned data is a
    * mix of the given server data and write data.
    *
    * @param {?ChildrenNode} completeServerChildren
    * @return {!ChildrenNode}
    */
  def calcCompleteEventChildren(completeServerChildren: atFirebaseDatabaseLib.distSrcCoreSnapChildrenNodeMod.ChildrenNode): atFirebaseDatabaseLib.distSrcCoreSnapChildrenNodeMod.ChildrenNode = js.native
  def calcEventCacheAfterServerOverwrite(path: atFirebaseDatabaseLib.distSrcCoreUtilPathMod.Path): atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node | scala.Null = js.native
  def calcEventCacheAfterServerOverwrite(
    path: atFirebaseDatabaseLib.distSrcCoreUtilPathMod.Path,
    existingEventSnap: atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node
  ): atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node | scala.Null = js.native
  /**
    * Given that either the underlying server data has updated or the outstanding writes have updated, determine what,
    * if anything, needs to be applied to the event cache.
    *
    * Possibilities:
    *
    * 1. No writes are shadowing. Events should be raised, the snap to be applied comes from the server data
    *
    * 2. Some write is completely shadowing. No events to be raised
    *
    * 3. Is partially shadowed. Events should be raised
    *
    * Either existingEventSnap or existingServerSnap must exist, this is validated via an assert
    *
    * @param {!Path} path
    * @param {?Node} existingEventSnap
    * @param {?Node} existingServerSnap
    * @return {?Node}
    */
  def calcEventCacheAfterServerOverwrite(
    path: atFirebaseDatabaseLib.distSrcCoreUtilPathMod.Path,
    existingEventSnap: atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node,
    existingServerSnap: atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node
  ): atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node | scala.Null = js.native
  def calcEventCacheAfterServerOverwrite(
    path: atFirebaseDatabaseLib.distSrcCoreUtilPathMod.Path,
    existingEventSnap: scala.Null,
    existingServerSnap: atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node
  ): atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node | scala.Null = js.native
  /**
    * This method is used when processing child remove events on a query. If we can, we pull in children that were outside
    * the window, but may now be in the window
    *
    * @param {?Node} completeServerData
    * @param {!NamedNode} startPost
    * @param {!number} count
    * @param {boolean} reverse
    * @param {!Index} index
    * @return {!Array.<!NamedNode>}
    */
  def calcIndexedSlice(
    completeServerData: atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node,
    startPost: atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.NamedNode,
    count: scala.Double,
    reverse: scala.Boolean,
    index: atFirebaseDatabaseLib.distSrcCoreSnapIndexesIndexMod.Index
  ): js.Array[atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.NamedNode] = js.native
  def calcIndexedSlice(
    completeServerData: scala.Null,
    startPost: atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.NamedNode,
    count: scala.Double,
    reverse: scala.Boolean,
    index: atFirebaseDatabaseLib.distSrcCoreSnapIndexesIndexMod.Index
  ): js.Array[atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.NamedNode] = js.native
  /**
    * Return a WriteTreeRef for a child.
    *
    * @param {string} childName
    * @return {!WriteTreeRef}
    */
  def child(childName: java.lang.String): WriteTreeRef = js.native
  /**
    * Returns a node if there is a complete overwrite for this path. More specifically, if there is a write at
    * a higher path, this will return the child of that write relative to the write and this path.
    * Returns null if there is no write at this path.
    *
    * @param {!Path} path
    * @return {?Node}
    */
  def shadowingWrite(path: atFirebaseDatabaseLib.distSrcCoreUtilPathMod.Path): atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node | scala.Null = js.native
}

