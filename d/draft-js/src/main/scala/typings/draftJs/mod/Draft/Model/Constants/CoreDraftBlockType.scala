package typings.draftJs.mod.Draft.Model.Constants

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The list of default valid block types.
  */
/* Rewritten from type alias, can be one of: 
  - typings.draftJs.draftJsStrings.unstyled
  - typings.draftJs.draftJsStrings.paragraph
  - typings.draftJs.draftJsStrings.`header-one`
  - typings.draftJs.draftJsStrings.`header-two`
  - typings.draftJs.draftJsStrings.`header-three`
  - typings.draftJs.draftJsStrings.`header-four`
  - typings.draftJs.draftJsStrings.`header-five`
  - typings.draftJs.draftJsStrings.`header-six`
  - typings.draftJs.draftJsStrings.`unordered-list-item`
  - typings.draftJs.draftJsStrings.`ordered-list-item`
  - typings.draftJs.draftJsStrings.blockquote
  - typings.draftJs.draftJsStrings.`code-block`
  - typings.draftJs.draftJsStrings.atomic
*/
trait CoreDraftBlockType extends js.Object

object CoreDraftBlockType {
  @scala.inline
  def atomic: typings.draftJs.draftJsStrings.atomic = this.cast("atomic")
  @scala.inline
  def blockquote: typings.draftJs.draftJsStrings.blockquote = this.cast("blockquote")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `code-block`: typings.draftJs.draftJsStrings.`code-block` = this.cast("code-block")
  @scala.inline
  def `header-five`: typings.draftJs.draftJsStrings.`header-five` = this.cast("header-five")
  @scala.inline
  def `header-four`: typings.draftJs.draftJsStrings.`header-four` = this.cast("header-four")
  @scala.inline
  def `header-one`: typings.draftJs.draftJsStrings.`header-one` = this.cast("header-one")
  @scala.inline
  def `header-six`: typings.draftJs.draftJsStrings.`header-six` = this.cast("header-six")
  @scala.inline
  def `header-three`: typings.draftJs.draftJsStrings.`header-three` = this.cast("header-three")
  @scala.inline
  def `header-two`: typings.draftJs.draftJsStrings.`header-two` = this.cast("header-two")
  @scala.inline
  def `ordered-list-item`: typings.draftJs.draftJsStrings.`ordered-list-item` = this.cast("ordered-list-item")
  @scala.inline
  def paragraph: typings.draftJs.draftJsStrings.paragraph = this.cast("paragraph")
  @scala.inline
  def `unordered-list-item`: typings.draftJs.draftJsStrings.`unordered-list-item` = this.cast("unordered-list-item")
  @scala.inline
  def unstyled: typings.draftJs.draftJsStrings.unstyled = this.cast("unstyled")
}

