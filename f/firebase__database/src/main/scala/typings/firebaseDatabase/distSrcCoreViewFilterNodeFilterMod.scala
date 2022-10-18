package typings.firebaseDatabase

import typings.firebaseDatabase.distSrcCoreSnapIndexesIndexMod.Index
import typings.firebaseDatabase.distSrcCoreSnapNodeMod.Node
import typings.firebaseDatabase.distSrcCoreUtilPathMod.Path
import typings.firebaseDatabase.distSrcCoreViewChildChangeAccumulatorMod.ChildChangeAccumulator
import typings.firebaseDatabase.distSrcCoreViewCompleteChildSourceMod.CompleteChildSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCoreViewFilterNodeFilterMod {
  
  @js.native
  trait NodeFilter extends StObject {
    
    /**
      * Returns true if children might be filtered due to query criteria
      */
    def filtersNodes(): Boolean = js.native
    
    /**
      * Returns the index that this filter uses
      */
    def getIndex(): Index = js.native
    
    /**
      * Returns the index filter that this filter uses to get a NodeFilter that doesn't filter any children.
      */
    def getIndexedFilter(): NodeFilter = js.native
    
    /**
      * Update a single complete child in the snap. If the child equals the old child in the snap, this is a no-op.
      * The method expects an indexed snap.
      */
    def updateChild(snap: Node, key: String, newChild: Node, affectedPath: Path, source: CompleteChildSource): Node = js.native
    def updateChild(
      snap: Node,
      key: String,
      newChild: Node,
      affectedPath: Path,
      source: CompleteChildSource,
      optChangeAccumulator: ChildChangeAccumulator
    ): Node = js.native
    
    /**
      * Update a node in full and output any resulting change from this complete update.
      */
    def updateFullNode(oldSnap: Node, newSnap: Node): Node = js.native
    def updateFullNode(oldSnap: Node, newSnap: Node, optChangeAccumulator: ChildChangeAccumulator): Node = js.native
    
    /**
      * Update the priority of the root node
      */
    def updatePriority(oldSnap: Node, newPriority: Node): Node = js.native
  }
}
