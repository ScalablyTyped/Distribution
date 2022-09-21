package typings.firebaseDatabase

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseDatabase.cacheNodeMod.CacheNode
import typings.firebaseDatabase.childrenNodeMod.ChildrenNode
import typings.firebaseDatabase.compoundWriteMod.CompoundWrite
import typings.firebaseDatabase.indexMod.Index
import typings.firebaseDatabase.nodeMod.NamedNode
import typings.firebaseDatabase.nodeMod.Node
import typings.firebaseDatabase.pathMod.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object writeTreeMod {
  
  @JSImport("@firebase/database/dist/node-esm/src/core/WriteTree", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def newWriteTree(): WriteTree = ^.asInstanceOf[js.Dynamic].applyDynamic("newWriteTree")().asInstanceOf[WriteTree]
  
  inline def newWriteTreeRef(path: Path, writeTree: WriteTree): WriteTreeRef = (^.asInstanceOf[js.Dynamic].applyDynamic("newWriteTreeRef")(path.asInstanceOf[js.Any], writeTree.asInstanceOf[js.Any])).asInstanceOf[WriteTreeRef]
  
  inline def writeTreeAddMerge(writeTree: WriteTree, path: Path, changedChildren: StringDictionary[Node], writeId: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeTreeAddMerge")(writeTree.asInstanceOf[js.Any], path.asInstanceOf[js.Any], changedChildren.asInstanceOf[js.Any], writeId.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeTreeAddOverwrite(writeTree: WriteTree, path: Path, snap: Node, writeId: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeTreeAddOverwrite")(writeTree.asInstanceOf[js.Any], path.asInstanceOf[js.Any], snap.asInstanceOf[js.Any], writeId.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeTreeAddOverwrite(writeTree: WriteTree, path: Path, snap: Node, writeId: Double, visible: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeTreeAddOverwrite")(writeTree.asInstanceOf[js.Any], path.asInstanceOf[js.Any], snap.asInstanceOf[js.Any], writeId.asInstanceOf[js.Any], visible.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeTreeCalcCompleteChild(writeTree: WriteTree, treePath: Path, childKey: String, existingServerSnap: CacheNode): Node | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("writeTreeCalcCompleteChild")(writeTree.asInstanceOf[js.Any], treePath.asInstanceOf[js.Any], childKey.asInstanceOf[js.Any], existingServerSnap.asInstanceOf[js.Any])).asInstanceOf[Node | Null]
  
  inline def writeTreeCalcCompleteEventCache(writeTree: WriteTree, treePath: Path): Node | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("writeTreeCalcCompleteEventCache")(writeTree.asInstanceOf[js.Any], treePath.asInstanceOf[js.Any])).asInstanceOf[Node | Null]
  inline def writeTreeCalcCompleteEventCache(
    writeTree: WriteTree,
    treePath: Path,
    completeServerCache: Null,
    writeIdsToExclude: js.Array[Double]
  ): Node | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("writeTreeCalcCompleteEventCache")(writeTree.asInstanceOf[js.Any], treePath.asInstanceOf[js.Any], completeServerCache.asInstanceOf[js.Any], writeIdsToExclude.asInstanceOf[js.Any])).asInstanceOf[Node | Null]
  inline def writeTreeCalcCompleteEventCache(
    writeTree: WriteTree,
    treePath: Path,
    completeServerCache: Null,
    writeIdsToExclude: js.Array[Double],
    includeHiddenWrites: Boolean
  ): Node | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("writeTreeCalcCompleteEventCache")(writeTree.asInstanceOf[js.Any], treePath.asInstanceOf[js.Any], completeServerCache.asInstanceOf[js.Any], writeIdsToExclude.asInstanceOf[js.Any], includeHiddenWrites.asInstanceOf[js.Any])).asInstanceOf[Node | Null]
  inline def writeTreeCalcCompleteEventCache(
    writeTree: WriteTree,
    treePath: Path,
    completeServerCache: Null,
    writeIdsToExclude: Unit,
    includeHiddenWrites: Boolean
  ): Node | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("writeTreeCalcCompleteEventCache")(writeTree.asInstanceOf[js.Any], treePath.asInstanceOf[js.Any], completeServerCache.asInstanceOf[js.Any], writeIdsToExclude.asInstanceOf[js.Any], includeHiddenWrites.asInstanceOf[js.Any])).asInstanceOf[Node | Null]
  inline def writeTreeCalcCompleteEventCache(writeTree: WriteTree, treePath: Path, completeServerCache: Node): Node | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("writeTreeCalcCompleteEventCache")(writeTree.asInstanceOf[js.Any], treePath.asInstanceOf[js.Any], completeServerCache.asInstanceOf[js.Any])).asInstanceOf[Node | Null]
  inline def writeTreeCalcCompleteEventCache(
    writeTree: WriteTree,
    treePath: Path,
    completeServerCache: Node,
    writeIdsToExclude: js.Array[Double]
  ): Node | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("writeTreeCalcCompleteEventCache")(writeTree.asInstanceOf[js.Any], treePath.asInstanceOf[js.Any], completeServerCache.asInstanceOf[js.Any], writeIdsToExclude.asInstanceOf[js.Any])).asInstanceOf[Node | Null]
  inline def writeTreeCalcCompleteEventCache(
    writeTree: WriteTree,
    treePath: Path,
    completeServerCache: Node,
    writeIdsToExclude: js.Array[Double],
    includeHiddenWrites: Boolean
  ): Node | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("writeTreeCalcCompleteEventCache")(writeTree.asInstanceOf[js.Any], treePath.asInstanceOf[js.Any], completeServerCache.asInstanceOf[js.Any], writeIdsToExclude.asInstanceOf[js.Any], includeHiddenWrites.asInstanceOf[js.Any])).asInstanceOf[Node | Null]
  inline def writeTreeCalcCompleteEventCache(
    writeTree: WriteTree,
    treePath: Path,
    completeServerCache: Node,
    writeIdsToExclude: Unit,
    includeHiddenWrites: Boolean
  ): Node | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("writeTreeCalcCompleteEventCache")(writeTree.asInstanceOf[js.Any], treePath.asInstanceOf[js.Any], completeServerCache.asInstanceOf[js.Any], writeIdsToExclude.asInstanceOf[js.Any], includeHiddenWrites.asInstanceOf[js.Any])).asInstanceOf[Node | Null]
  
  inline def writeTreeCalcCompleteEventChildren(writeTree: WriteTree, treePath: Path): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("writeTreeCalcCompleteEventChildren")(writeTree.asInstanceOf[js.Any], treePath.asInstanceOf[js.Any])).asInstanceOf[Node]
  inline def writeTreeCalcCompleteEventChildren(writeTree: WriteTree, treePath: Path, completeServerChildren: ChildrenNode): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("writeTreeCalcCompleteEventChildren")(writeTree.asInstanceOf[js.Any], treePath.asInstanceOf[js.Any], completeServerChildren.asInstanceOf[js.Any])).asInstanceOf[Node]
  
  inline def writeTreeCalcEventCacheAfterServerOverwrite(writeTree: WriteTree, treePath: Path, childPath: Path): Node | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("writeTreeCalcEventCacheAfterServerOverwrite")(writeTree.asInstanceOf[js.Any], treePath.asInstanceOf[js.Any], childPath.asInstanceOf[js.Any])).asInstanceOf[Node | Null]
  inline def writeTreeCalcEventCacheAfterServerOverwrite(
    writeTree: WriteTree,
    treePath: Path,
    childPath: Path,
    existingEventSnap: Null,
    existingServerSnap: Node
  ): Node | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("writeTreeCalcEventCacheAfterServerOverwrite")(writeTree.asInstanceOf[js.Any], treePath.asInstanceOf[js.Any], childPath.asInstanceOf[js.Any], existingEventSnap.asInstanceOf[js.Any], existingServerSnap.asInstanceOf[js.Any])).asInstanceOf[Node | Null]
  inline def writeTreeCalcEventCacheAfterServerOverwrite(writeTree: WriteTree, treePath: Path, childPath: Path, existingEventSnap: Node): Node | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("writeTreeCalcEventCacheAfterServerOverwrite")(writeTree.asInstanceOf[js.Any], treePath.asInstanceOf[js.Any], childPath.asInstanceOf[js.Any], existingEventSnap.asInstanceOf[js.Any])).asInstanceOf[Node | Null]
  inline def writeTreeCalcEventCacheAfterServerOverwrite(
    writeTree: WriteTree,
    treePath: Path,
    childPath: Path,
    existingEventSnap: Node,
    existingServerSnap: Node
  ): Node | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("writeTreeCalcEventCacheAfterServerOverwrite")(writeTree.asInstanceOf[js.Any], treePath.asInstanceOf[js.Any], childPath.asInstanceOf[js.Any], existingEventSnap.asInstanceOf[js.Any], existingServerSnap.asInstanceOf[js.Any])).asInstanceOf[Node | Null]
  
  inline def writeTreeCalcIndexedSlice(
    writeTree: WriteTree,
    treePath: Path,
    completeServerData: Null,
    startPost: NamedNode,
    count: Double,
    reverse: Boolean,
    index: Index
  ): js.Array[NamedNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeTreeCalcIndexedSlice")(writeTree.asInstanceOf[js.Any], treePath.asInstanceOf[js.Any], completeServerData.asInstanceOf[js.Any], startPost.asInstanceOf[js.Any], count.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.Array[NamedNode]]
  inline def writeTreeCalcIndexedSlice(
    writeTree: WriteTree,
    treePath: Path,
    completeServerData: Node,
    startPost: NamedNode,
    count: Double,
    reverse: Boolean,
    index: Index
  ): js.Array[NamedNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeTreeCalcIndexedSlice")(writeTree.asInstanceOf[js.Any], treePath.asInstanceOf[js.Any], completeServerData.asInstanceOf[js.Any], startPost.asInstanceOf[js.Any], count.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.Array[NamedNode]]
  
  inline def writeTreeChildWrites(writeTree: WriteTree, path: Path): WriteTreeRef = (^.asInstanceOf[js.Dynamic].applyDynamic("writeTreeChildWrites")(writeTree.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[WriteTreeRef]
  
  inline def writeTreeGetCompleteWriteData(writeTree: WriteTree, path: Path): Node | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("writeTreeGetCompleteWriteData")(writeTree.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Node | Null]
  
  inline def writeTreeGetWrite(writeTree: WriteTree, writeId: Double): WriteRecord | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("writeTreeGetWrite")(writeTree.asInstanceOf[js.Any], writeId.asInstanceOf[js.Any])).asInstanceOf[WriteRecord | Null]
  
  inline def writeTreeRefCalcCompleteChild(writeTreeRef: WriteTreeRef, childKey: String, existingServerCache: CacheNode): Node | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("writeTreeRefCalcCompleteChild")(writeTreeRef.asInstanceOf[js.Any], childKey.asInstanceOf[js.Any], existingServerCache.asInstanceOf[js.Any])).asInstanceOf[Node | Null]
  
  inline def writeTreeRefCalcCompleteEventCache(writeTreeRef: WriteTreeRef): Node | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("writeTreeRefCalcCompleteEventCache")(writeTreeRef.asInstanceOf[js.Any]).asInstanceOf[Node | Null]
  inline def writeTreeRefCalcCompleteEventCache(writeTreeRef: WriteTreeRef, completeServerCache: Null, writeIdsToExclude: js.Array[Double]): Node | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("writeTreeRefCalcCompleteEventCache")(writeTreeRef.asInstanceOf[js.Any], completeServerCache.asInstanceOf[js.Any], writeIdsToExclude.asInstanceOf[js.Any])).asInstanceOf[Node | Null]
  inline def writeTreeRefCalcCompleteEventCache(
    writeTreeRef: WriteTreeRef,
    completeServerCache: Null,
    writeIdsToExclude: js.Array[Double],
    includeHiddenWrites: Boolean
  ): Node | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("writeTreeRefCalcCompleteEventCache")(writeTreeRef.asInstanceOf[js.Any], completeServerCache.asInstanceOf[js.Any], writeIdsToExclude.asInstanceOf[js.Any], includeHiddenWrites.asInstanceOf[js.Any])).asInstanceOf[Node | Null]
  inline def writeTreeRefCalcCompleteEventCache(
    writeTreeRef: WriteTreeRef,
    completeServerCache: Null,
    writeIdsToExclude: Unit,
    includeHiddenWrites: Boolean
  ): Node | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("writeTreeRefCalcCompleteEventCache")(writeTreeRef.asInstanceOf[js.Any], completeServerCache.asInstanceOf[js.Any], writeIdsToExclude.asInstanceOf[js.Any], includeHiddenWrites.asInstanceOf[js.Any])).asInstanceOf[Node | Null]
  inline def writeTreeRefCalcCompleteEventCache(writeTreeRef: WriteTreeRef, completeServerCache: Node): Node | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("writeTreeRefCalcCompleteEventCache")(writeTreeRef.asInstanceOf[js.Any], completeServerCache.asInstanceOf[js.Any])).asInstanceOf[Node | Null]
  inline def writeTreeRefCalcCompleteEventCache(writeTreeRef: WriteTreeRef, completeServerCache: Node, writeIdsToExclude: js.Array[Double]): Node | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("writeTreeRefCalcCompleteEventCache")(writeTreeRef.asInstanceOf[js.Any], completeServerCache.asInstanceOf[js.Any], writeIdsToExclude.asInstanceOf[js.Any])).asInstanceOf[Node | Null]
  inline def writeTreeRefCalcCompleteEventCache(
    writeTreeRef: WriteTreeRef,
    completeServerCache: Node,
    writeIdsToExclude: js.Array[Double],
    includeHiddenWrites: Boolean
  ): Node | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("writeTreeRefCalcCompleteEventCache")(writeTreeRef.asInstanceOf[js.Any], completeServerCache.asInstanceOf[js.Any], writeIdsToExclude.asInstanceOf[js.Any], includeHiddenWrites.asInstanceOf[js.Any])).asInstanceOf[Node | Null]
  inline def writeTreeRefCalcCompleteEventCache(
    writeTreeRef: WriteTreeRef,
    completeServerCache: Node,
    writeIdsToExclude: Unit,
    includeHiddenWrites: Boolean
  ): Node | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("writeTreeRefCalcCompleteEventCache")(writeTreeRef.asInstanceOf[js.Any], completeServerCache.asInstanceOf[js.Any], writeIdsToExclude.asInstanceOf[js.Any], includeHiddenWrites.asInstanceOf[js.Any])).asInstanceOf[Node | Null]
  
  inline def writeTreeRefCalcCompleteEventChildren(writeTreeRef: WriteTreeRef): ChildrenNode = ^.asInstanceOf[js.Dynamic].applyDynamic("writeTreeRefCalcCompleteEventChildren")(writeTreeRef.asInstanceOf[js.Any]).asInstanceOf[ChildrenNode]
  inline def writeTreeRefCalcCompleteEventChildren(writeTreeRef: WriteTreeRef, completeServerChildren: ChildrenNode): ChildrenNode = (^.asInstanceOf[js.Dynamic].applyDynamic("writeTreeRefCalcCompleteEventChildren")(writeTreeRef.asInstanceOf[js.Any], completeServerChildren.asInstanceOf[js.Any])).asInstanceOf[ChildrenNode]
  
  inline def writeTreeRefCalcEventCacheAfterServerOverwrite(writeTreeRef: WriteTreeRef, path: Path): Node | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("writeTreeRefCalcEventCacheAfterServerOverwrite")(writeTreeRef.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Node | Null]
  inline def writeTreeRefCalcEventCacheAfterServerOverwrite(writeTreeRef: WriteTreeRef, path: Path, existingEventSnap: Null, existingServerSnap: Node): Node | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("writeTreeRefCalcEventCacheAfterServerOverwrite")(writeTreeRef.asInstanceOf[js.Any], path.asInstanceOf[js.Any], existingEventSnap.asInstanceOf[js.Any], existingServerSnap.asInstanceOf[js.Any])).asInstanceOf[Node | Null]
  inline def writeTreeRefCalcEventCacheAfterServerOverwrite(writeTreeRef: WriteTreeRef, path: Path, existingEventSnap: Node): Node | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("writeTreeRefCalcEventCacheAfterServerOverwrite")(writeTreeRef.asInstanceOf[js.Any], path.asInstanceOf[js.Any], existingEventSnap.asInstanceOf[js.Any])).asInstanceOf[Node | Null]
  inline def writeTreeRefCalcEventCacheAfterServerOverwrite(writeTreeRef: WriteTreeRef, path: Path, existingEventSnap: Node, existingServerSnap: Node): Node | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("writeTreeRefCalcEventCacheAfterServerOverwrite")(writeTreeRef.asInstanceOf[js.Any], path.asInstanceOf[js.Any], existingEventSnap.asInstanceOf[js.Any], existingServerSnap.asInstanceOf[js.Any])).asInstanceOf[Node | Null]
  
  inline def writeTreeRefCalcIndexedSlice(
    writeTreeRef: WriteTreeRef,
    completeServerData: Null,
    startPost: NamedNode,
    count: Double,
    reverse: Boolean,
    index: Index
  ): js.Array[NamedNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeTreeRefCalcIndexedSlice")(writeTreeRef.asInstanceOf[js.Any], completeServerData.asInstanceOf[js.Any], startPost.asInstanceOf[js.Any], count.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.Array[NamedNode]]
  inline def writeTreeRefCalcIndexedSlice(
    writeTreeRef: WriteTreeRef,
    completeServerData: Node,
    startPost: NamedNode,
    count: Double,
    reverse: Boolean,
    index: Index
  ): js.Array[NamedNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeTreeRefCalcIndexedSlice")(writeTreeRef.asInstanceOf[js.Any], completeServerData.asInstanceOf[js.Any], startPost.asInstanceOf[js.Any], count.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.Array[NamedNode]]
  
  inline def writeTreeRefChild(writeTreeRef: WriteTreeRef, childName: String): WriteTreeRef = (^.asInstanceOf[js.Dynamic].applyDynamic("writeTreeRefChild")(writeTreeRef.asInstanceOf[js.Any], childName.asInstanceOf[js.Any])).asInstanceOf[WriteTreeRef]
  
  inline def writeTreeRefShadowingWrite(writeTreeRef: WriteTreeRef, path: Path): Node | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("writeTreeRefShadowingWrite")(writeTreeRef.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Node | Null]
  
  inline def writeTreeRemoveWrite(writeTree: WriteTree, writeId: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("writeTreeRemoveWrite")(writeTree.asInstanceOf[js.Any], writeId.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def writeTreeShadowingWrite(writeTree: WriteTree, path: Path): Node | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("writeTreeShadowingWrite")(writeTree.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Node | Null]
  
  trait WriteRecord extends StObject {
    
    var children: js.UndefOr[StringDictionary[Node] | Null] = js.undefined
    
    var path: Path
    
    var snap: js.UndefOr[Node | Null] = js.undefined
    
    var visible: Boolean
    
    var writeId: Double
  }
  object WriteRecord {
    
    inline def apply(path: Path, visible: Boolean, writeId: Double): WriteRecord = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], writeId = writeId.asInstanceOf[js.Any])
      __obj.asInstanceOf[WriteRecord]
    }
    
    extension [Self <: WriteRecord](x: Self) {
      
      inline def setChildren(value: StringDictionary[Node]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setPath(value: Path): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setSnap(value: Node): Self = StObject.set(x, "snap", value.asInstanceOf[js.Any])
      
      inline def setSnapNull: Self = StObject.set(x, "snap", null)
      
      inline def setSnapUndefined: Self = StObject.set(x, "snap", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setWriteId(value: Double): Self = StObject.set(x, "writeId", value.asInstanceOf[js.Any])
    }
  }
  
  trait WriteTree extends StObject {
    
    /**
      * A list of all pending writes, regardless of visibility and shadowed-ness.  Used to calculate arbitrary
      * sets of the changed data, such as hidden writes (from transactions) or changes with certain writes excluded (also
      * used by transactions).
      */
    var allWrites: js.Array[WriteRecord]
    
    var lastWriteId: Double
    
    /**
      * A tree tracking the result of applying all visible writes.  This does not include transactions with
      * applyLocally=false or writes that are completely shadowed by other writes.
      */
    var visibleWrites: CompoundWrite
  }
  object WriteTree {
    
    inline def apply(allWrites: js.Array[WriteRecord], lastWriteId: Double, visibleWrites: CompoundWrite): WriteTree = {
      val __obj = js.Dynamic.literal(allWrites = allWrites.asInstanceOf[js.Any], lastWriteId = lastWriteId.asInstanceOf[js.Any], visibleWrites = visibleWrites.asInstanceOf[js.Any])
      __obj.asInstanceOf[WriteTree]
    }
    
    extension [Self <: WriteTree](x: Self) {
      
      inline def setAllWrites(value: js.Array[WriteRecord]): Self = StObject.set(x, "allWrites", value.asInstanceOf[js.Any])
      
      inline def setAllWritesVarargs(value: WriteRecord*): Self = StObject.set(x, "allWrites", js.Array(value*))
      
      inline def setLastWriteId(value: Double): Self = StObject.set(x, "lastWriteId", value.asInstanceOf[js.Any])
      
      inline def setVisibleWrites(value: CompoundWrite): Self = StObject.set(x, "visibleWrites", value.asInstanceOf[js.Any])
    }
  }
  
  trait WriteTreeRef extends StObject {
    
    /**
      * The path to this particular write tree ref. Used for calling methods on writeTree_ while exposing a simpler
      * interface to callers.
      */
    val treePath: Path
    
    /**
      * * A reference to the actual tree of write data. All methods are pass-through to the tree, but with the appropriate
      * path prefixed.
      *
      * This lets us make cheap references to points in the tree for sync points without having to copy and maintain all of
      * the data.
      */
    val writeTree: WriteTree
  }
  object WriteTreeRef {
    
    inline def apply(treePath: Path, writeTree: WriteTree): WriteTreeRef = {
      val __obj = js.Dynamic.literal(treePath = treePath.asInstanceOf[js.Any], writeTree = writeTree.asInstanceOf[js.Any])
      __obj.asInstanceOf[WriteTreeRef]
    }
    
    extension [Self <: WriteTreeRef](x: Self) {
      
      inline def setTreePath(value: Path): Self = StObject.set(x, "treePath", value.asInstanceOf[js.Any])
      
      inline def setWriteTree(value: WriteTree): Self = StObject.set(x, "writeTree", value.asInstanceOf[js.Any])
    }
  }
}
