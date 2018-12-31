package typings
package atFirebaseDatabaseLib.distSrcCoreViewFilterNodeFilterMod

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
  def filtersNodes(): scala.Boolean = js.native
  /**
    * Returns the index that this filter uses
    * @return {!Index}
    */
  def getIndex(): atFirebaseDatabaseLib.distSrcCoreSnapIndexesIndexMod.Index = js.native
  /**
    * Returns the index filter that this filter uses to get a NodeFilter that doesn't filter any children.
    * @return {!NodeFilter}
    */
  def getIndexedFilter(): NodeFilter = js.native
  def updateChild(
    snap: atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node,
    key: java.lang.String,
    newChild: atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node,
    affectedPath: atFirebaseDatabaseLib.distSrcCoreUtilPathMod.Path,
    source: atFirebaseDatabaseLib.distSrcCoreViewCompleteChildSourceMod.CompleteChildSource
  ): atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node = js.native
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
    snap: atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node,
    key: java.lang.String,
    newChild: atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node,
    affectedPath: atFirebaseDatabaseLib.distSrcCoreUtilPathMod.Path,
    source: atFirebaseDatabaseLib.distSrcCoreViewCompleteChildSourceMod.CompleteChildSource,
    optChangeAccumulator: atFirebaseDatabaseLib.distSrcCoreViewChildChangeAccumulatorMod.ChildChangeAccumulator
  ): atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node = js.native
  def updateFullNode(
    oldSnap: atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node,
    newSnap: atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node
  ): atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node = js.native
  /**
    * Update a node in full and output any resulting change from this complete update.
    *
    * @param {!Node} oldSnap
    * @param {!Node} newSnap
    * @param {?ChildChangeAccumulator} optChangeAccumulator
    * @return {!Node}
    */
  def updateFullNode(
    oldSnap: atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node,
    newSnap: atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node,
    optChangeAccumulator: atFirebaseDatabaseLib.distSrcCoreViewChildChangeAccumulatorMod.ChildChangeAccumulator
  ): atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node = js.native
  /**
    * Update the priority of the root node
    *
    * @param {!Node} oldSnap
    * @param {!Node} newPriority
    * @return {!Node}
    */
  def updatePriority(
    oldSnap: atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node,
    newPriority: atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node
  ): atFirebaseDatabaseLib.distSrcCoreSnapNodeMod.Node = js.native
}

