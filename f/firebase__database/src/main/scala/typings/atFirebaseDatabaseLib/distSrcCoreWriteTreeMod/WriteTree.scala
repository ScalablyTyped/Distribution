package typings
package atFirebaseDatabaseLib.distSrcCoreWriteTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/WriteTree", "WriteTree")
@js.native
class WriteTree () extends js.Object {
  /**
    * A list of all pending writes, regardless of visibility and shadowed-ness.  Used to calculate arbitrary
    * sets of the changed data, such as hidden writes (from transactions) or changes with certain writes excluded (also
    * used by transactions).
    *
    * @type {!Array.<!WriteRecord>}
    * @private
    */
  var `allWrites_`: js.Any = js.native
  var `lastWriteId_`: js.Any = js.native
  /**
    * A tree tracking the result of applying all visible writes.  This does not include transactions with
    * applyLocally=false or writes that are completely shadowed by other writes.
    *
    * @type {!CompoundWrite}
    * @private
    */
  var `visibleWrites_`: js.Any = js.native
  /**
    * Record a new merge from user code.
    *
    * @param {!Path} path
    * @param {!Object.<string, !Node>} changedChildren
    * @param {!number} writeId
    */
  def addMerge(
    path: atFirebaseDatabaseLib.distSrcCoreUtilPathMod.Path,
    changedChildren: org.scalablytyped.runtime.StringDictionary[atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node],
    writeId: scala.Double
  ): scala.Unit = js.native
  /**
    * Record a new overwrite from user code.
    *
    * @param {!Path} path
    * @param {!Node} snap
    * @param {!number} writeId
    * @param {boolean=} visible This is set to false by some transactions. It should be excluded from event caches
    */
  def addOverwrite(
    path: atFirebaseDatabaseLib.distSrcCoreUtilPathMod.Path,
    snap: atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node,
    writeId: scala.Double
  ): scala.Unit = js.native
  def addOverwrite(
    path: atFirebaseDatabaseLib.distSrcCoreUtilPathMod.Path,
    snap: atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node,
    writeId: scala.Double,
    visible: scala.Boolean
  ): scala.Unit = js.native
  /**
    * Returns a complete child for a given server snap after applying all user writes or null if there is no
    * complete child for this ChildKey.
    *
    * @param {!Path} treePath
    * @param {!string} childKey
    * @param {!CacheNode} existingServerSnap
    * @return {?Node}
    */
  def calcCompleteChild(
    treePath: atFirebaseDatabaseLib.distSrcCoreUtilPathMod.Path,
    childKey: java.lang.String,
    existingServerSnap: atFirebaseDatabaseLib.distSrcCoreViewCacheNodeMod.CacheNode
  ): atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node | scala.Null = js.native
  def calcCompleteEventCache(treePath: atFirebaseDatabaseLib.distSrcCoreUtilPathMod.Path): atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node | scala.Null = js.native
  /**
    * Given optional, underlying server data, and an optional set of constraints (exclude some sets, include hidden
    * writes), attempt to calculate a complete snapshot for the given path
    *
    * @param {!Path} treePath
    * @param {?Node} completeServerCache
    * @param {Array.<number>=} writeIdsToExclude An optional set to be excluded
    * @param {boolean=} includeHiddenWrites Defaults to false, whether or not to layer on writes with visible set to false
    * @return {?Node}
    */
  def calcCompleteEventCache(
    treePath: atFirebaseDatabaseLib.distSrcCoreUtilPathMod.Path,
    completeServerCache: atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node
  ): atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node | scala.Null = js.native
  def calcCompleteEventCache(
    treePath: atFirebaseDatabaseLib.distSrcCoreUtilPathMod.Path,
    completeServerCache: atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node,
    writeIdsToExclude: js.Array[scala.Double]
  ): atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node | scala.Null = js.native
  def calcCompleteEventCache(
    treePath: atFirebaseDatabaseLib.distSrcCoreUtilPathMod.Path,
    completeServerCache: atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node,
    writeIdsToExclude: js.Array[scala.Double],
    includeHiddenWrites: scala.Boolean
  ): atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node | scala.Null = js.native
  def calcCompleteEventCache(
    treePath: atFirebaseDatabaseLib.distSrcCoreUtilPathMod.Path,
    completeServerCache: scala.Null,
    writeIdsToExclude: js.Array[scala.Double]
  ): atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node | scala.Null = js.native
  def calcCompleteEventCache(
    treePath: atFirebaseDatabaseLib.distSrcCoreUtilPathMod.Path,
    completeServerCache: scala.Null,
    writeIdsToExclude: js.Array[scala.Double],
    includeHiddenWrites: scala.Boolean
  ): atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node | scala.Null = js.native
  def calcCompleteEventChildren(treePath: atFirebaseDatabaseLib.distSrcCoreUtilPathMod.Path): atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node = js.native
  /**
    * With optional, underlying server data, attempt to return a children node of children that we have complete data for.
    * Used when creating new views, to pre-fill their complete event children snapshot.
    *
    * @param {!Path} treePath
    * @param {?ChildrenNode} completeServerChildren
    * @return {!ChildrenNode}
    */
  def calcCompleteEventChildren(
    treePath: atFirebaseDatabaseLib.distSrcCoreUtilPathMod.Path,
    completeServerChildren: atFirebaseDatabaseLib.distSrcCoreSnapChildrenNodeMod.ChildrenNode
  ): atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node = js.native
  def calcEventCacheAfterServerOverwrite(
    treePath: atFirebaseDatabaseLib.distSrcCoreUtilPathMod.Path,
    childPath: atFirebaseDatabaseLib.distSrcCoreUtilPathMod.Path
  ): atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node | scala.Null = js.native
  def calcEventCacheAfterServerOverwrite(
    treePath: atFirebaseDatabaseLib.distSrcCoreUtilPathMod.Path,
    childPath: atFirebaseDatabaseLib.distSrcCoreUtilPathMod.Path,
    existingEventSnap: atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node
  ): atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node | scala.Null = js.native
  /**
    * Given that the underlying server data has updated, determine what, if anything, needs to be
    * applied to the event cache.
    *
    * Possibilities:
    *
    * 1. No writes are shadowing. Events should be raised, the snap to be applied comes from the server data
    *
    * 2. Some write is completely shadowing. No events to be raised
    *
    * 3. Is partially shadowed. Events
    *
    * Either existingEventSnap or existingServerSnap must exist
    *
    * @param {!Path} treePath
    * @param {!Path} childPath
    * @param {?Node} existingEventSnap
    * @param {?Node} existingServerSnap
    * @return {?Node}
    */
  def calcEventCacheAfterServerOverwrite(
    treePath: atFirebaseDatabaseLib.distSrcCoreUtilPathMod.Path,
    childPath: atFirebaseDatabaseLib.distSrcCoreUtilPathMod.Path,
    existingEventSnap: atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node,
    existingServerSnap: atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node
  ): atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node | scala.Null = js.native
  def calcEventCacheAfterServerOverwrite(
    treePath: atFirebaseDatabaseLib.distSrcCoreUtilPathMod.Path,
    childPath: atFirebaseDatabaseLib.distSrcCoreUtilPathMod.Path,
    existingEventSnap: scala.Null,
    existingServerSnap: atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node
  ): atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node | scala.Null = js.native
  /**
    * This method is used when processing child remove events on a query. If we can, we pull in children that were outside
    * the window, but may now be in the window.
    *
    * @param {!Path} treePath
    * @param {?Node} completeServerData
    * @param {!NamedNode} startPost
    * @param {!number} count
    * @param {boolean} reverse
    * @param {!Index} index
    * @return {!Array.<!NamedNode>}
    */
  def calcIndexedSlice(
    treePath: atFirebaseDatabaseLib.distSrcCoreUtilPathMod.Path,
    completeServerData: atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node,
    startPost: atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.NamedNode,
    count: scala.Double,
    reverse: scala.Boolean,
    index: atFirebaseDatabaseLib.distSrcCoreSnapIndexesIndexMod.Index
  ): js.Array[atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.NamedNode] = js.native
  def calcIndexedSlice(
    treePath: atFirebaseDatabaseLib.distSrcCoreUtilPathMod.Path,
    completeServerData: scala.Null,
    startPost: atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.NamedNode,
    count: scala.Double,
    reverse: scala.Boolean,
    index: atFirebaseDatabaseLib.distSrcCoreSnapIndexesIndexMod.Index
  ): js.Array[atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.NamedNode] = js.native
  /**
    * Create a new WriteTreeRef for the given path. For use with a new sync point at the given path.
    *
    * @param {!Path} path
    * @return {!WriteTreeRef}
    */
  def childWrites(path: atFirebaseDatabaseLib.distSrcCoreUtilPathMod.Path): WriteTreeRef = js.native
  /**
    * Return a complete snapshot for the given path if there's visible write data at that path, else null.
    * No server data is considered.
    *
    * @param {!Path} path
    * @return {?Node}
    */
  def getCompleteWriteData(path: atFirebaseDatabaseLib.distSrcCoreUtilPathMod.Path): atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node | scala.Null = js.native
  /**
    * @param {!number} writeId
    * @return {?WriteRecord}
    */
  def getWrite(writeId: scala.Double): WriteRecord | scala.Null = js.native
  /**
    * @param {!WriteRecord} writeRecord
    * @param {!Path} path
    * @return {boolean}
    * @private
    */
  /* private */ def `recordContainsPath_`(writeRecord: js.Any, path: js.Any): js.Any = js.native
  /**
    * Remove a write (either an overwrite or merge) that has been successfully acknowledge by the server. Recalculates
    * the tree if necessary.  We return true if it may have been visible, meaning views need to reevaluate.
    *
    * @param {!number} writeId
    * @return {boolean} true if the write may have been visible (meaning we'll need to reevaluate / raise
    * events as a result).
    */
  def removeWrite(writeId: scala.Double): scala.Boolean = js.native
  /**
    * Re-layer the writes and merges into a tree so we can efficiently calculate event snapshots
    * @private
    */
  /* private */ def `resetTree_`(): js.Any = js.native
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

/* static members */
@JSImport("@firebase/database/dist/src/core/WriteTree", "WriteTree")
@js.native
object WriteTree extends js.Object {
  /**
    * The default filter used when constructing the tree. Keep everything that's visible.
    *
    * @param {!WriteRecord} write
    * @return {boolean}
    * @private
    */
  /* private */ def `DefaultFilter_`(write: js.Any): js.Any = js.native
  /**
    * Static method. Given an array of WriteRecords, a filter for which ones to include, and a path, construct the tree of
    * event data at that path.
    *
    * @param {!Array.<!WriteRecord>} writes
    * @param {!function(!WriteRecord):boolean} filter
    * @param {!Path} treeRoot
    * @return {!CompoundWrite}
    * @private
    */
  /* private */ def `layerTree_`(writes: js.Any, filter: js.Any, treeRoot: js.Any): js.Any = js.native
}

