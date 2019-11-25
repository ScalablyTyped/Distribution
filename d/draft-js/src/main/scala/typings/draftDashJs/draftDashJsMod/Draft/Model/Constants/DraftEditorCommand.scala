package typings.draftDashJs.draftDashJsMod.Draft.Model.Constants

import typings.draftDashJs.draftDashJsStrings.bold_
import typings.draftDashJs.draftDashJsStrings.code_
import typings.draftDashJs.draftDashJsStrings.italic_
import typings.draftDashJs.draftDashJsStrings.strikethrough_
import typings.draftDashJs.draftDashJsStrings.underline_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A set of editor commands that may be invoked by keyboard commands or UI
  * controls. These commands should map to operations that modify content or
  * selection state and update the editor state accordingly.
  */
/* Rewritten from type alias, can be one of: 
  - typings.draftDashJs.draftDashJsStrings.undo
  - typings.draftDashJs.draftDashJsStrings.redo
  - typings.draftDashJs.draftDashJsStrings.delete
  - typings.draftDashJs.draftDashJsStrings.`delete-word`
  - typings.draftDashJs.draftDashJsStrings.backspace
  - typings.draftDashJs.draftDashJsStrings.`backspace-word`
  - typings.draftDashJs.draftDashJsStrings.`backspace-to-start-of-line`
  - typings.draftDashJs.draftDashJsStrings.bold_
  - typings.draftDashJs.draftDashJsStrings.code_
  - typings.draftDashJs.draftDashJsStrings.italic_
  - typings.draftDashJs.draftDashJsStrings.strikethrough_
  - typings.draftDashJs.draftDashJsStrings.underline_
  - typings.draftDashJs.draftDashJsStrings.`split-block`
  - typings.draftDashJs.draftDashJsStrings.`transpose-characters`
  - typings.draftDashJs.draftDashJsStrings.`move-selection-to-start-of-block`
  - typings.draftDashJs.draftDashJsStrings.`move-selection-to-end-of-block`
  - typings.draftDashJs.draftDashJsStrings.`secondary-cut`
  - typings.draftDashJs.draftDashJsStrings.`secondary-paste`
*/
trait DraftEditorCommand extends js.Object

object DraftEditorCommand {
  @scala.inline
  def backspace: typings.draftDashJs.draftDashJsStrings.backspace = this.cast("backspace")
  @scala.inline
  def `backspace-to-start-of-line`: typings.draftDashJs.draftDashJsStrings.`backspace-to-start-of-line` = this.cast("backspace-to-start-of-line")
  @scala.inline
  def `backspace-word`: typings.draftDashJs.draftDashJsStrings.`backspace-word` = this.cast("backspace-word")
  @scala.inline
  def bold: bold_ = this.cast("bold")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def code: code_ = this.cast("code")
  @scala.inline
  def delete: typings.draftDashJs.draftDashJsStrings.delete = this.cast("delete")
  @scala.inline
  def `delete-word`: typings.draftDashJs.draftDashJsStrings.`delete-word` = this.cast("delete-word")
  @scala.inline
  def italic: italic_ = this.cast("italic")
  @scala.inline
  def `move-selection-to-end-of-block`: typings.draftDashJs.draftDashJsStrings.`move-selection-to-end-of-block` = this.cast("move-selection-to-end-of-block")
  @scala.inline
  def `move-selection-to-start-of-block`: typings.draftDashJs.draftDashJsStrings.`move-selection-to-start-of-block` = this.cast("move-selection-to-start-of-block")
  @scala.inline
  def redo: typings.draftDashJs.draftDashJsStrings.redo = this.cast("redo")
  @scala.inline
  def `secondary-cut`: typings.draftDashJs.draftDashJsStrings.`secondary-cut` = this.cast("secondary-cut")
  @scala.inline
  def `secondary-paste`: typings.draftDashJs.draftDashJsStrings.`secondary-paste` = this.cast("secondary-paste")
  @scala.inline
  def `split-block`: typings.draftDashJs.draftDashJsStrings.`split-block` = this.cast("split-block")
  @scala.inline
  def strikethrough: strikethrough_ = this.cast("strikethrough")
  @scala.inline
  def `transpose-characters`: typings.draftDashJs.draftDashJsStrings.`transpose-characters` = this.cast("transpose-characters")
  @scala.inline
  def underline: underline_ = this.cast("underline")
  @scala.inline
  def undo: typings.draftDashJs.draftDashJsStrings.undo = this.cast("undo")
}

