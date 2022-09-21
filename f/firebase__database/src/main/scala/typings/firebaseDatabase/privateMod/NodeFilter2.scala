package typings.firebaseDatabase.privateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NodeFilter is used to update nodes and complete children of nodes while applying queries on the fly and keeping
  * track of any child changes. This class does not track value changes as value changes depend on more
  * than just the node itself. Different kind of queries require different kind of implementations of this interface.
  * @interface
  */
@js.native
trait NodeFilter2 extends StObject {
  
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
  def getIndexedFilter(): NodeFilter2 = js.native
  
  /**
    * Update a single complete child in the snap. If the child equals the old child in the snap, this is a no-op.
    * The method expects an indexed snap.
    */
  def updateChild(snap: Node2, key: String, newChild: Node2, affectedPath: Path, source: CompleteChildSource): Node2 = js.native
  def updateChild(
    snap: Node2,
    key: String,
    newChild: Node2,
    affectedPath: Path,
    source: CompleteChildSource,
    optChangeAccumulator: ChildChangeAccumulator
  ): Node2 = js.native
  
  /**
    * Update a node in full and output any resulting change from this complete update.
    */
  def updateFullNode(oldSnap: Node2, newSnap: Node2): Node2 = js.native
  def updateFullNode(oldSnap: Node2, newSnap: Node2, optChangeAccumulator: ChildChangeAccumulator): Node2 = js.native
  
  /**
    * Update the priority of the root node
    */
  def updatePriority(oldSnap: Node2, newPriority: Node2): Node2 = js.native
}
