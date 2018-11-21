package typings
package draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Lifted 1 members from Set(std.Record) */ 
trait SelectionState extends js.Object {
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

