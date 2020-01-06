package typings.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof any ]: / * import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T * / any} */ trait SelectionState extends js.Object {
  def getAnchorKey(): String
  def getAnchorOffset(): Double
  def getEndKey(): String
  def getEndOffset(): Double
  def getFocusKey(): String
  def getFocusOffset(): Double
  def getHasFocus(): Boolean
  def getIsBackward(): Boolean
  def getStartKey(): String
  def getStartOffset(): Double
  /**
    * Return whether the specified range overlaps with an edge of the
    * SelectionState.
    */
  def hasEdgeWithin(blockKey: String, start: Double, end: Double): Boolean
  def isCollapsed(): Boolean
  def serialize(): String
}

object SelectionState {
  @scala.inline
  def apply(
    getAnchorKey: () => String,
    getAnchorOffset: () => Double,
    getEndKey: () => String,
    getEndOffset: () => Double,
    getFocusKey: () => String,
    getFocusOffset: () => Double,
    getHasFocus: () => Boolean,
    getIsBackward: () => Boolean,
    getStartKey: () => String,
    getStartOffset: () => Double,
    hasEdgeWithin: (String, Double, Double) => Boolean,
    isCollapsed: () => Boolean,
    serialize: () => String
  ): SelectionState = {
    val __obj = js.Dynamic.literal(getAnchorKey = js.Any.fromFunction0(getAnchorKey), getAnchorOffset = js.Any.fromFunction0(getAnchorOffset), getEndKey = js.Any.fromFunction0(getEndKey), getEndOffset = js.Any.fromFunction0(getEndOffset), getFocusKey = js.Any.fromFunction0(getFocusKey), getFocusOffset = js.Any.fromFunction0(getFocusOffset), getHasFocus = js.Any.fromFunction0(getHasFocus), getIsBackward = js.Any.fromFunction0(getIsBackward), getStartKey = js.Any.fromFunction0(getStartKey), getStartOffset = js.Any.fromFunction0(getStartOffset), hasEdgeWithin = js.Any.fromFunction3(hasEdgeWithin), isCollapsed = js.Any.fromFunction0(isCollapsed), serialize = js.Any.fromFunction0(serialize))
  
    __obj.asInstanceOf[SelectionState]
  }
}

