package typings.draftDashJs.draftDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("draft-js", "SelectionState")
@js.native
class SelectionState ()
  extends typings.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.SelectionState {
  /* CompleteClass */
  override def getAnchorKey(): String = js.native
  /* CompleteClass */
  override def getAnchorOffset(): Double = js.native
  /* CompleteClass */
  override def getEndKey(): String = js.native
  /* CompleteClass */
  override def getEndOffset(): Double = js.native
  /* CompleteClass */
  override def getFocusKey(): String = js.native
  /* CompleteClass */
  override def getFocusOffset(): Double = js.native
  /* CompleteClass */
  override def getHasFocus(): Boolean = js.native
  /* CompleteClass */
  override def getIsBackward(): Boolean = js.native
  /* CompleteClass */
  override def getStartKey(): String = js.native
  /* CompleteClass */
  override def getStartOffset(): Double = js.native
  /**
    * Return whether the specified range overlaps with an edge of the
    * SelectionState.
    */
  /* CompleteClass */
  override def hasEdgeWithin(blockKey: String, start: Double, end: Double): Boolean = js.native
  /* CompleteClass */
  override def isCollapsed(): Boolean = js.native
  /* CompleteClass */
  override def serialize(): String = js.native
}

/* static members */
@JSImport("draft-js", "SelectionState")
@js.native
object SelectionState extends js.Object {
  def createEmpty(key: String): typings.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.SelectionState = js.native
}

