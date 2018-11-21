package typings
package draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Lifted 1 members from Set(std.Record) */ 
trait EditorState extends js.Object {
  def getAllowUndo(): scala.Boolean
  def getBlockTree(blockKey: java.lang.String): immutableLib.immutableMod.List[_]
  def getCurrentContent(): ContentState
  /**
                   * Get the appropriate inline style for the editor state. If an
                   * override is in place, use it. Otherwise, the current style is
                   * based on the location of the selection state.
                   */
  def getCurrentInlineStyle(): DraftInlineStyle
  def getDecorator(): draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.DecoratorsNs.DraftDecoratorType
  def getDirectionMap(): immutableLib.immutableMod.OrderedMap[_, _]
  /**
                   * While editing, the user may apply inline style commands with a collapsed
                   * cursor, intending to type text that adopts the specified style. In this
                   * case, we track the specified style as an "override" that takes precedence
                   * over the inline style of the text adjacent to the cursor.
                   *
                   * If null, there is no override in place.
                   */
  def getInlineStyleOverride(): DraftInlineStyle
  def getLastChangeType(): EditorChangeType
  def getNativelyRenderedContent(): ContentState
  def getRedoStack(): immutableLib.immutableMod.Stack[ContentState]
  def getSelection(): SelectionState
  def getUndoStack(): immutableLib.immutableMod.Stack[ContentState]
  def isInCompositionMode(): scala.Boolean
  def isSelectionAtEndOfContent(): scala.Boolean
  def isSelectionAtStartOfContent(): scala.Boolean
  def mustForceSelection(): scala.Boolean
  def toJS(): js.Object
}

