package typings.atFirebaseDatabase.distSrcCoreViewFilterNodeFilterMod

import typings.atFirebaseDatabase.distSrcCoreSnapIndexesIndexMod.Index
import typings.atFirebaseDatabase.distSrcCoreSnapNodeMod.Node
import typings.atFirebaseDatabase.distSrcCoreUtilPathMod.Path
import typings.atFirebaseDatabase.distSrcCoreViewChildChangeAccumulatorMod.ChildChangeAccumulator
import typings.atFirebaseDatabase.distSrcCoreViewCompleteChildSourceMod.CompleteChildSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeFilter extends js.Object {
  /**
    * Returns true if children might be filtered due to query criteria
    *
    * @return {boolean}
    */
  def filtersNodes(): Boolean = js.native
  /**
    * Returns the index that this filter uses
    * @return {!Index}
    */
  def getIndex(): Index = js.native
  /**
    * Returns the index filter that this filter uses to get a NodeFilter that doesn't filter any children.
    * @return {!NodeFilter}
    */
  def getIndexedFilter(): NodeFilter = js.native
  def updateChild(snap: Node, key: String, newChild: Node, affectedPath: Path, source: CompleteChildSource): Node = js.native
  /**
    * Update a single complete child in the snap. If the child equals the old child in the snap, this is a no-op.
    * The method expects an indexed snap.
    *
    * @param {!Node} snap
    * @param {string} key
    * @param {!Node} newChild
    * @param {!Path} affectedPath
    * @param {!CompleteChildSource} source
    * @param {?ChildChangeAccumulator} optChangeAccumulator
    * @return {!Node}
    */
  def updateChild(
    snap: Node,
    key: String,
    newChild: Node,
    affectedPath: Path,
    source: CompleteChildSource,
    optChangeAccumulator: ChildChangeAccumulator
  ): Node = js.native
  def updateFullNode(oldSnap: Node, newSnap: Node): Node = js.native
  /**
    * Update a node in full and output any resulting change from this complete update.
    *
    * @param {!Node} oldSnap
    * @param {!Node} newSnap
    * @param {?ChildChangeAccumulator} optChangeAccumulator
    * @return {!Node}
    */
  def updateFullNode(oldSnap: Node, newSnap: Node, optChangeAccumulator: ChildChangeAccumulator): Node = js.native
  /**
    * Update the priority of the root node
    *
    * @param {!Node} oldSnap
    * @param {!Node} newPriority
    * @return {!Node}
    */
  def updatePriority(oldSnap: Node, newPriority: Node): Node = js.native
}

