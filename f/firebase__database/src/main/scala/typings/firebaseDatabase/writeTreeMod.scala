package typings.firebaseDatabase

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseDatabase.cacheNodeMod.CacheNode
import typings.firebaseDatabase.childrenNodeMod.ChildrenNode
import typings.firebaseDatabase.indexMod.Index
import typings.firebaseDatabase.nodeMod.NamedNode
import typings.firebaseDatabase.nodeMod.Node
import typings.firebaseDatabase.pathMod.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object writeTreeMod {
  
  @JSImport("@firebase/database/dist/src/core/WriteTree", "WriteTree")
  @js.native
  class WriteTree () extends StObject {
    
    /**
      * Record a new merge from user code.
      *
      * @param {!Path} path
      * @param {!Object.<string, !Node>} changedChildren
      * @param {!number} writeId
      */
    def addMerge(path: Path, changedChildren: StringDictionary[Node], writeId: Double): Unit = js.native
    
    /**
      * Record a new overwrite from user code.
      *
      * @param {!Path} path
      * @param {!Node} snap
      * @param {!number} writeId
      * @param {boolean=} visible This is set to false by some transactions. It should be excluded from event caches
      */
    def addOverwrite(path: Path, snap: Node, writeId: Double): Unit = js.native
    def addOverwrite(path: Path, snap: Node, writeId: Double, visible: Boolean): Unit = js.native
    
    /**
      * A list of all pending writes, regardless of visibility and shadowed-ness.  Used to calculate arbitrary
      * sets of the changed data, such as hidden writes (from transactions) or changes with certain writes excluded (also
      * used by transactions).
      *
      * @type {!Array.<!WriteRecord>}
      * @private
      */
    var allWrites_ : js.Any = js.native
    
    /**
      * Returns a complete child for a given server snap after applying all user writes or null if there is no
      * complete child for this ChildKey.
      *
      * @param {!Path} treePath
      * @param {!string} childKey
      * @param {!CacheNode} existingServerSnap
      * @return {?Node}
      */
    def calcCompleteChild(treePath: Path, childKey: String, existingServerSnap: CacheNode): Node | Null = js.native
    
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
    def calcCompleteEventCache(treePath: Path): Node | Null = js.native
    def calcCompleteEventCache(
      treePath: Path,
      completeServerCache: Null,
      writeIdsToExclude: js.UndefOr[scala.Nothing],
      includeHiddenWrites: Boolean
    ): Node | Null = js.native
    def calcCompleteEventCache(treePath: Path, completeServerCache: Null, writeIdsToExclude: js.Array[Double]): Node | Null = js.native
    def calcCompleteEventCache(
      treePath: Path,
      completeServerCache: Null,
      writeIdsToExclude: js.Array[Double],
      includeHiddenWrites: Boolean
    ): Node | Null = js.native
    def calcCompleteEventCache(treePath: Path, completeServerCache: Node): Node | Null = js.native
    def calcCompleteEventCache(
      treePath: Path,
      completeServerCache: Node,
      writeIdsToExclude: js.UndefOr[scala.Nothing],
      includeHiddenWrites: Boolean
    ): Node | Null = js.native
    def calcCompleteEventCache(treePath: Path, completeServerCache: Node, writeIdsToExclude: js.Array[Double]): Node | Null = js.native
    def calcCompleteEventCache(
      treePath: Path,
      completeServerCache: Node,
      writeIdsToExclude: js.Array[Double],
      includeHiddenWrites: Boolean
    ): Node | Null = js.native
    
    /**
      * With optional, underlying server data, attempt to return a children node of children that we have complete data for.
      * Used when creating new views, to pre-fill their complete event children snapshot.
      *
      * @param {!Path} treePath
      * @param {?ChildrenNode} completeServerChildren
      * @return {!ChildrenNode}
      */
    def calcCompleteEventChildren(treePath: Path): Node = js.native
    def calcCompleteEventChildren(treePath: Path, completeServerChildren: ChildrenNode): Node = js.native
    
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
    def calcEventCacheAfterServerOverwrite(treePath: Path, childPath: Path): Node | Null = js.native
    def calcEventCacheAfterServerOverwrite(treePath: Path, childPath: Path, existingEventSnap: Null, existingServerSnap: Node): Node | Null = js.native
    def calcEventCacheAfterServerOverwrite(treePath: Path, childPath: Path, existingEventSnap: Node): Node | Null = js.native
    def calcEventCacheAfterServerOverwrite(treePath: Path, childPath: Path, existingEventSnap: Node, existingServerSnap: Node): Node | Null = js.native
    
    def calcIndexedSlice(
      treePath: Path,
      completeServerData: Null,
      startPost: NamedNode,
      count: Double,
      reverse: Boolean,
      index: Index
    ): js.Array[NamedNode] = js.native
    /**
      * This method is used when processing child remove events on a query. If we can, we pull in children that were outside
      * the window, but may now be in the window.
      */
    def calcIndexedSlice(
      treePath: Path,
      completeServerData: Node,
      startPost: NamedNode,
      count: Double,
      reverse: Boolean,
      index: Index
    ): js.Array[NamedNode] = js.native
    
    /**
      * Create a new WriteTreeRef for the given path. For use with a new sync point at the given path.
      *
      * @param {!Path} path
      * @return {!WriteTreeRef}
      */
    def childWrites(path: Path): WriteTreeRef = js.native
    
    /**
      * Return a complete snapshot for the given path if there's visible write data at that path, else null.
      * No server data is considered.
      *
      * @param {!Path} path
      * @return {?Node}
      */
    def getCompleteWriteData(path: Path): Node | Null = js.native
    
    /**
      * @param {!number} writeId
      * @return {?WriteRecord}
      */
    def getWrite(writeId: Double): WriteRecord | Null = js.native
    
    var lastWriteId_ : js.Any = js.native
    
    var recordContainsPath_ : js.Any = js.native
    
    /**
      * Remove a write (either an overwrite or merge) that has been successfully acknowledge by the server. Recalculates
      * the tree if necessary.  We return true if it may have been visible, meaning views need to reevaluate.
      *
      * @param {!number} writeId
      * @return {boolean} true if the write may have been visible (meaning we'll need to reevaluate / raise
      * events as a result).
      */
    def removeWrite(writeId: Double): Boolean = js.native
    
    /**
      * Re-layer the writes and merges into a tree so we can efficiently calculate event snapshots
      */
    var resetTree_ : js.Any = js.native
    
    /**
      * Returns a node if there is a complete overwrite for this path. More specifically, if there is a write at
      * a higher path, this will return the child of that write relative to the write and this path.
      * Returns null if there is no write at this path.
      */
    def shadowingWrite(path: Path): Node | Null = js.native
    
    /**
      * A tree tracking the result of applying all visible writes.  This does not include transactions with
      * applyLocally=false or writes that are completely shadowed by other writes.
      *
      * @type {!CompoundWrite}
      * @private
      */
    var visibleWrites_ : js.Any = js.native
  }
  /* static members */
  object WriteTree {
    
    @JSImport("@firebase/database/dist/src/core/WriteTree", "WriteTree")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The default filter used when constructing the tree. Keep everything that's visible.
      */
    @JSImport("@firebase/database/dist/src/core/WriteTree", "WriteTree.DefaultFilter_")
    @js.native
    def DefaultFilter_ : js.Any = js.native
    @scala.inline
    def DefaultFilter__=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultFilter_")(x.asInstanceOf[js.Any])
    
    /**
      * Static method. Given an array of WriteRecords, a filter for which ones to include, and a path, construct the tree of
      * event data at that path.
      */
    @JSImport("@firebase/database/dist/src/core/WriteTree", "WriteTree.layerTree_")
    @js.native
    def layerTree_ : js.Any = js.native
    @scala.inline
    def layerTree__=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("layerTree_")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@firebase/database/dist/src/core/WriteTree", "WriteTreeRef")
  @js.native
  class WriteTreeRef protected () extends StObject {
    /**
      * @param {!Path} path
      * @param {!WriteTree} writeTree
      */
    def this(path: Path, writeTree: WriteTree) = this()
    
    /**
      * Returns a complete child for a given server snap after applying all user writes or null if there is no
      * complete child for this ChildKey.
      *
      * @param {!string} childKey
      * @param {!CacheNode} existingServerCache
      * @return {?Node}
      */
    def calcCompleteChild(childKey: String, existingServerCache: CacheNode): Node | Null = js.native
    
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
    def calcCompleteEventCache(): Node | Null = js.native
    def calcCompleteEventCache(
      completeServerCache: Null,
      writeIdsToExclude: js.UndefOr[scala.Nothing],
      includeHiddenWrites: Boolean
    ): Node | Null = js.native
    def calcCompleteEventCache(completeServerCache: Null, writeIdsToExclude: js.Array[Double]): Node | Null = js.native
    def calcCompleteEventCache(completeServerCache: Null, writeIdsToExclude: js.Array[Double], includeHiddenWrites: Boolean): Node | Null = js.native
    def calcCompleteEventCache(completeServerCache: Node): Node | Null = js.native
    def calcCompleteEventCache(
      completeServerCache: Node,
      writeIdsToExclude: js.UndefOr[scala.Nothing],
      includeHiddenWrites: Boolean
    ): Node | Null = js.native
    def calcCompleteEventCache(completeServerCache: Node, writeIdsToExclude: js.Array[Double]): Node | Null = js.native
    def calcCompleteEventCache(completeServerCache: Node, writeIdsToExclude: js.Array[Double], includeHiddenWrites: Boolean): Node | Null = js.native
    
    /**
      * If possible, returns a children node containing all of the complete children we have data for. The returned data is a
      * mix of the given server data and write data.
      *
      * @param {?ChildrenNode} completeServerChildren
      * @return {!ChildrenNode}
      */
    def calcCompleteEventChildren(): ChildrenNode = js.native
    def calcCompleteEventChildren(completeServerChildren: ChildrenNode): ChildrenNode = js.native
    
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
    def calcEventCacheAfterServerOverwrite(path: Path): Node | Null = js.native
    def calcEventCacheAfterServerOverwrite(path: Path, existingEventSnap: Null, existingServerSnap: Node): Node | Null = js.native
    def calcEventCacheAfterServerOverwrite(path: Path, existingEventSnap: Node): Node | Null = js.native
    def calcEventCacheAfterServerOverwrite(path: Path, existingEventSnap: Node, existingServerSnap: Node): Node | Null = js.native
    
    def calcIndexedSlice(completeServerData: Null, startPost: NamedNode, count: Double, reverse: Boolean, index: Index): js.Array[NamedNode] = js.native
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
    def calcIndexedSlice(completeServerData: Node, startPost: NamedNode, count: Double, reverse: Boolean, index: Index): js.Array[NamedNode] = js.native
    
    /**
      * Return a WriteTreeRef for a child.
      *
      * @param {string} childName
      * @return {!WriteTreeRef}
      */
    def child(childName: String): WriteTreeRef = js.native
    
    /**
      * Returns a node if there is a complete overwrite for this path. More specifically, if there is a write at
      * a higher path, this will return the child of that write relative to the write and this path.
      * Returns null if there is no write at this path.
      *
      * @param {!Path} path
      * @return {?Node}
      */
    def shadowingWrite(path: Path): Node | Null = js.native
    
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
  }
  
  @js.native
  trait WriteRecord extends StObject {
    
    var children: js.UndefOr[StringDictionary[Node] | Null] = js.native
    
    var path: Path = js.native
    
    var snap: js.UndefOr[Node | Null] = js.native
    
    var visible: Boolean = js.native
    
    var writeId: Double = js.native
  }
  object WriteRecord {
    
    @scala.inline
    def apply(path: Path, visible: Boolean, writeId: Double): WriteRecord = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], writeId = writeId.asInstanceOf[js.Any])
      __obj.asInstanceOf[WriteRecord]
    }
    
    @scala.inline
    implicit class WriteRecordMutableBuilder[Self <: WriteRecord] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: StringDictionary[Node]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenNull: Self = StObject.set(x, "children", null)
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setPath(value: Path): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnap(value: Node): Self = StObject.set(x, "snap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapNull: Self = StObject.set(x, "snap", null)
      
      @scala.inline
      def setSnapUndefined: Self = StObject.set(x, "snap", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWriteId(value: Double): Self = StObject.set(x, "writeId", value.asInstanceOf[js.Any])
    }
  }
}
