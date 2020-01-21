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
  def backspace: typings.draftJs.draftJsStrings.backspace = this.cast("backspace")
  @scala.inline
  def `backspace-to-start-of-line`: typings.draftJs.draftJsStrings.`backspace-to-start-of-line` = this.cast("backspace-to-start-of-line")
  @scala.inline
  def `backspace-word`: typings.draftJs.draftJsStrings.`backspace-word` = this.cast("backspace-word")
  @scala.inline
  def bold: bold_ = this.cast("bold")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def code: code_ = this.cast("code")
  @scala.inline
  def delete: typings.draftJs.draftJsStrings.delete = this.cast("delete")
  @scala.inline
  def `delete-word`: typings.draftJs.draftJsStrings.`delete-word` = this.cast("delete-word")
  @scala.inline
  def italic: italic_ = this.cast("italic")
  @scala.inline
  def `move-selection-to-end-of-block`: typings.draftJs.draftJsStrings.`move-selection-to-end-of-block` = this.cast("move-selection-to-end-of-block")
  @scala.inline
  def `move-selection-to-start-of-block`: typings.draftJs.draftJsStrings.`move-selection-to-start-of-block` = this.cast("move-selection-to-start-of-block")
  @scala.inline
  def redo: typings.draftJs.draftJsStrings.redo = this.cast("redo")
  @scala.inline
  def `secondary-cut`: typings.draftJs.draftJsStrings.`secondary-cut` = this.cast("secondary-cut")
  @scala.inline
  def `secondary-paste`: typings.draftJs.draftJsStrings.`secondary-paste` = this.cast("secondary-paste")
  @scala.inline
  def `split-block`: typings.draftJs.draftJsStrings.`split-block` = this.cast("split-block")
  @scala.inline
  def strikethrough: strikethrough_ = this.cast("strikethrough")
  @scala.inline
  def `transpose-characters`: typings.draftJs.draftJsStrings.`transpose-characters` = this.cast("transpose-characters")
  @scala.inline
  def underline: underline_ = this.cast("underline")
  @scala.inline
  def undo: typings.draftJs.draftJsStrings.undo = this.cast("undo")
}

