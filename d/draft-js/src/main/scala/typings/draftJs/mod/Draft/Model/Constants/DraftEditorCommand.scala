package typings.draftJs.mod.Draft.Model.Constants

import typings.draftJs.draftJsStrings.bold_
import typings.draftJs.draftJsStrings.code_
import typings.draftJs.draftJsStrings.italic_
import typings.draftJs.draftJsStrings.strikethrough_
import typings.draftJs.draftJsStrings.underline_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A set of editor commands that may be invoked by keyboard commands or UI
  * controls. These commands should map to operations that modify content or
  * selection state and update the editor state accordingly.
  */
/* Rewritten from type alias, can be one of: 
  - typings.draftJs.draftJsStrings.undo
  - typings.draftJs.draftJsStrings.redo
  - typings.draftJs.draftJsStrings.delete
  - typings.draftJs.draftJsStrings.`delete-word`
  - typings.draftJs.draftJsStrings.backspace
  - typings.draftJs.draftJsStrings.`backspace-word`
  - typings.draftJs.draftJsStrings.`backspace-to-start-of-line`
  - typings.draftJs.draftJsStrings.bold_
  - typings.draftJs.draftJsStrings.code_
  - typings.draftJs.draftJsStrings.italic_
  - typings.draftJs.draftJsStrings.strikethrough_
  - typings.draftJs.draftJsStrings.underline_
  - typings.draftJs.draftJsStrings.`split-block`
  - typings.draftJs.draftJsStrings.`transpose-characters`
  - typings.draftJs.draftJsStrings.`move-selection-to-start-of-block`
  - typings.draftJs.draftJsStrings.`move-selection-to-end-of-block`
  - typings.draftJs.draftJsStrings.`secondary-cut`
  - typings.draftJs.draftJsStrings.`secondary-paste`
*/
trait DraftEditorCommand extends js.Object

object DraftEditorCommand {
  @scala.inline
  def backspace: typings.draftJs.draftJsStrings.backspace = "backspace".asInstanceOf[typings.draftJs.draftJsStrings.backspace]
  @scala.inline
  def `backspace-to-start-of-line`: typings.draftJs.draftJsStrings.`backspace-to-start-of-line` = "backspace-to-start-of-line".asInstanceOf[typings.draftJs.draftJsStrings.`backspace-to-start-of-line`]
  @scala.inline
  def `backspace-word`: typings.draftJs.draftJsStrings.`backspace-word` = "backspace-word".asInstanceOf[typings.draftJs.draftJsStrings.`backspace-word`]
  @scala.inline
  def bold: bold_ = "bold".asInstanceOf[bold_]
  @scala.inline
  def code: code_ = "code".asInstanceOf[code_]
  @scala.inline
  def delete: typings.draftJs.draftJsStrings.delete = "delete".asInstanceOf[typings.draftJs.draftJsStrings.delete]
  @scala.inline
  def `delete-word`: typings.draftJs.draftJsStrings.`delete-word` = "delete-word".asInstanceOf[typings.draftJs.draftJsStrings.`delete-word`]
  @scala.inline
  def italic: italic_ = "italic".asInstanceOf[italic_]
  @scala.inline
  def `move-selection-to-end-of-block`: typings.draftJs.draftJsStrings.`move-selection-to-end-of-block` = "move-selection-to-end-of-block".asInstanceOf[typings.draftJs.draftJsStrings.`move-selection-to-end-of-block`]
  @scala.inline
  def `move-selection-to-start-of-block`: typings.draftJs.draftJsStrings.`move-selection-to-start-of-block` = "move-selection-to-start-of-block".asInstanceOf[typings.draftJs.draftJsStrings.`move-selection-to-start-of-block`]
  @scala.inline
  def redo: typings.draftJs.draftJsStrings.redo = "redo".asInstanceOf[typings.draftJs.draftJsStrings.redo]
  @scala.inline
  def `secondary-cut`: typings.draftJs.draftJsStrings.`secondary-cut` = "secondary-cut".asInstanceOf[typings.draftJs.draftJsStrings.`secondary-cut`]
  @scala.inline
  def `secondary-paste`: typings.draftJs.draftJsStrings.`secondary-paste` = "secondary-paste".asInstanceOf[typings.draftJs.draftJsStrings.`secondary-paste`]
  @scala.inline
  def `split-block`: typings.draftJs.draftJsStrings.`split-block` = "split-block".asInstanceOf[typings.draftJs.draftJsStrings.`split-block`]
  @scala.inline
  def strikethrough: strikethrough_ = "strikethrough".asInstanceOf[strikethrough_]
  @scala.inline
  def `transpose-characters`: typings.draftJs.draftJsStrings.`transpose-characters` = "transpose-characters".asInstanceOf[typings.draftJs.draftJsStrings.`transpose-characters`]
  @scala.inline
  def underline: underline_ = "underline".asInstanceOf[underline_]
  @scala.inline
  def undo: typings.draftJs.draftJsStrings.undo = "undo".asInstanceOf[typings.draftJs.draftJsStrings.undo]
}

