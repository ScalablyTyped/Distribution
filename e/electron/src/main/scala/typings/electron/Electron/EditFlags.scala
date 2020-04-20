package typings.electron.Electron

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
    val __obj = js.Dynamic.literal(canCopy = canCopy.asInstanceOf[js.Any], canCut = canCut.asInstanceOf[js.Any], canDelete = canDelete.asInstanceOf[js.Any], canPaste = canPaste.asInstanceOf[js.Any], canRedo = canRedo.asInstanceOf[js.Any], canSelectAll = canSelectAll.asInstanceOf[js.Any], canUndo = canUndo.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditFlags]
  }
}

