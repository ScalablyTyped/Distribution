package typings.electron.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditFlags extends js.Object {
  /**
    * Whether the renderer believes it can copy
    */
  var canCopy: Boolean
  /**
    * Whether the renderer believes it can cut.
    */
  var canCut: Boolean
  /**
    * Whether the renderer believes it can delete.
    */
  var canDelete: Boolean
  /**
    * Whether the renderer believes it can paste.
    */
  var canPaste: Boolean
  /**
    * Whether the renderer believes it can redo.
    */
  var canRedo: Boolean
  /**
    * Whether the renderer believes it can select all.
    */
  var canSelectAll: Boolean
  /**
    * Whether the renderer believes it can undo.
    */
  var canUndo: Boolean
}

object EditFlags {
  @scala.inline
  def apply(
    canCopy: Boolean,
    canCut: Boolean,
    canDelete: Boolean,
    canPaste: Boolean,
    canRedo: Boolean,
    canSelectAll: Boolean,
    canUndo: Boolean
  ): EditFlags = {
    val __obj = js.Dynamic.literal(canCopy = canCopy, canCut = canCut, canDelete = canDelete, canPaste = canPaste, canRedo = canRedo, canSelectAll = canSelectAll, canUndo = canUndo)
  
    __obj.asInstanceOf[EditFlags]
  }
}

