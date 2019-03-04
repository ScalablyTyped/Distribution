package typings
package draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof any ]: any} */ trait SelectionState extends js.Object {
  def getAnchorKey(): java.lang.String
  def getAnchorOffset(): scala.Double
  def getEndKey(): java.lang.String
  def getEndOffset(): scala.Double
  def getFocusKey(): java.lang.String
  def getFocusOffset(): scala.Double
  def getHasFocus(): scala.Boolean
  def getIsBackward(): scala.Boolean
  def getStartKey(): java.lang.String
  def getStartOffset(): scala.Double
  /**
    * Return whether the specified range overlaps with an edge of the
    * SelectionState.
    */
  def hasEdgeWithin(blockKey: java.lang.String, start: scala.Double, end: scala.Double): scala.Boolean
  def isCollapsed(): scala.Boolean
  def serialize(): java.lang.String
}

object SelectionState {
  @scala.inline
  def apply(
    getAnchorKey: js.Function0[java.lang.String],
    getAnchorOffset: js.Function0[scala.Double],
    getEndKey: js.Function0[java.lang.String],
    getEndOffset: js.Function0[scala.Double],
    getFocusKey: js.Function0[java.lang.String],
    getFocusOffset: js.Function0[scala.Double],
    getHasFocus: js.Function0[scala.Boolean],
    getIsBackward: js.Function0[scala.Boolean],
    getStartKey: js.Function0[java.lang.String],
    getStartOffset: js.Function0[scala.Double],
    hasEdgeWithin: js.Function3[java.lang.String, scala.Double, scala.Double, scala.Boolean],
    isCollapsed: js.Function0[scala.Boolean],
    serialize: js.Function0[java.lang.String]
  ): SelectionState = {
    val __obj = js.Dynamic.literal(getAnchorKey = getAnchorKey, getAnchorOffset = getAnchorOffset, getEndKey = getEndKey, getEndOffset = getEndOffset, getFocusKey = getFocusKey, getFocusOffset = getFocusOffset, getHasFocus = getHasFocus, getIsBackward = getIsBackward, getStartKey = getStartKey, getStartOffset = getStartOffset, hasEdgeWithin = hasEdgeWithin, isCollapsed = isCollapsed, serialize = serialize)
  
    __obj.asInstanceOf[SelectionState]
  }
}

