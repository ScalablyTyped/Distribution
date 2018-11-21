package typings
package draftDashJsLib.draftDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("draft-js", "SelectionState")
@js.native
class SelectionState ()
  extends draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.SelectionState {
  /* CompleteClass */
  override def getAnchorKey(): java.lang.String = js.native
  /* CompleteClass */
  override def getAnchorOffset(): scala.Double = js.native
  /* CompleteClass */
  override def getEndKey(): java.lang.String = js.native
  /* CompleteClass */
  override def getEndOffset(): scala.Double = js.native
  /* CompleteClass */
  override def getFocusKey(): java.lang.String = js.native
  /* CompleteClass */
  override def getFocusOffset(): scala.Double = js.native
  /* CompleteClass */
  override def getHasFocus(): scala.Boolean = js.native
  /* CompleteClass */
  override def getIsBackward(): scala.Boolean = js.native
  /* CompleteClass */
  override def getStartKey(): java.lang.String = js.native
  /* CompleteClass */
  override def getStartOffset(): scala.Double = js.native
  /**
                   * Return whether the specified range overlaps with an edge of the
                   * SelectionState.
                   */
  /* CompleteClass */
  override def hasEdgeWithin(blockKey: java.lang.String, start: scala.Double, end: scala.Double): scala.Boolean = js.native
  /* CompleteClass */
  override def isCollapsed(): scala.Boolean = js.native
  /* CompleteClass */
  override def serialize(): java.lang.String = js.native
}

@JSImport("draft-js", "SelectionState")
@js.native
object SelectionState extends js.Object {
  def createEmpty(key: java.lang.String): draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.SelectionState = js.native
}

