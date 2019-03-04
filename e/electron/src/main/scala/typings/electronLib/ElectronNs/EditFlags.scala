package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditFlags extends js.Object {
  /**
    * Whether the renderer believes it can copy
    */
  var canCopy: scala.Boolean
  /**
    * Whether the renderer believes it can cut.
    */
  var canCut: scala.Boolean
  /**
    * Whether the renderer believes it can delete.
    */
  var canDelete: scala.Boolean
  /**
    * Whether the renderer believes it can paste.
    */
  var canPaste: scala.Boolean
  /**
    * Whether the renderer believes it can redo.
    */
  var canRedo: scala.Boolean
  /**
    * Whether the renderer believes it can select all.
    */
  var canSelectAll: scala.Boolean
  /**
    * Whether the renderer believes it can undo.
    */
  var canUndo: scala.Boolean
}

object EditFlags {
  @scala.inline
  def apply(
    canCopy: scala.Boolean,
    canCut: scala.Boolean,
    canDelete: scala.Boolean,
    canPaste: scala.Boolean,
    canRedo: scala.Boolean,
    canSelectAll: scala.Boolean,
    canUndo: scala.Boolean
  ): EditFlags = {
    val __obj = js.Dynamic.literal(canCopy = canCopy, canCut = canCut, canDelete = canDelete, canPaste = canPaste, canRedo = canRedo, canSelectAll = canSelectAll, canUndo = canUndo)
  
    __obj.asInstanceOf[EditFlags]
  }
}

