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
    getAnchorKey: () => java.lang.String,
    getAnchorOffset: () => scala.Double,
    getEndKey: () => java.lang.String,
    getEndOffset: () => scala.Double,
    getFocusKey: () => java.lang.String,
    getFocusOffset: () => scala.Double,
    getHasFocus: () => scala.Boolean,
    getIsBackward: () => scala.Boolean,
    getStartKey: () => java.lang.String,
    getStartOffset: () => scala.Double,
    hasEdgeWithin: (java.lang.String, scala.Double, scala.Double) => scala.Boolean,
    isCollapsed: () => scala.Boolean,
    serialize: () => java.lang.String
  ): SelectionState = {
    val __obj = js.Dynamic.literal(getAnchorKey = js.Any.fromFunction0(getAnchorKey), getAnchorOffset = js.Any.fromFunction0(getAnchorOffset), getEndKey = js.Any.fromFunction0(getEndKey), getEndOffset = js.Any.fromFunction0(getEndOffset), getFocusKey = js.Any.fromFunction0(getFocusKey), getFocusOffset = js.Any.fromFunction0(getFocusOffset), getHasFocus = js.Any.fromFunction0(getHasFocus), getIsBackward = js.Any.fromFunction0(getIsBackward), getStartKey = js.Any.fromFunction0(getStartKey), getStartOffset = js.Any.fromFunction0(getStartOffset), hasEdgeWithin = js.Any.fromFunction3(hasEdgeWithin), isCollapsed = js.Any.fromFunction0(isCollapsed), serialize = js.Any.fromFunction0(serialize))
  
    __obj.asInstanceOf[SelectionState]
  }
}

