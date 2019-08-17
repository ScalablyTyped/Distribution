package typings.draftDashJs

import typings.draftDashJs.draftDashJsMod.DraftNs.ComponentNs.BaseNs.DraftTextAlignment
import typings.draftDashJs.draftDashJsMod.DraftNs.ComponentNs.BaseNs.DraftTextDirectionality
import typings.draftDashJs.draftDashJsMod.DraftNs.ModelNs.ConstantsNs.ComposedEntityType
import typings.draftDashJs.draftDashJsMod.DraftNs.ModelNs.ConstantsNs.CoreDraftBlockType
import typings.draftDashJs.draftDashJsMod.DraftNs.ModelNs.ConstantsNs.DraftDragType
import typings.draftDashJs.draftDashJsMod.DraftNs.ModelNs.ConstantsNs.DraftEditorCommand
import typings.draftDashJs.draftDashJsMod.DraftNs.ModelNs.ConstantsNs.DraftEntityMutability
import typings.draftDashJs.draftDashJsMod.DraftNs.ModelNs.ConstantsNs.DraftHandleValue
import typings.draftDashJs.draftDashJsMod.DraftNs.ModelNs.ConstantsNs.DraftInlineStyleType
import typings.draftDashJs.draftDashJsMod.DraftNs.ModelNs.ConstantsNs.DraftInsertionType
import typings.draftDashJs.draftDashJsMod.DraftNs.ModelNs.ConstantsNs.DraftRemovalDirection
import typings.draftDashJs.draftDashJsMod.DraftNs.ModelNs.ImmutableDataNs.EditorChangeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object draftDashJsStrings {
  @js.native
  sealed trait BOLD extends DraftInlineStyleType
  
  @js.native
  sealed trait CODE extends DraftInlineStyleType
  
  @js.native
  sealed trait IMAGE extends ComposedEntityType
  
  @js.native
  sealed trait IMMUTABLE extends DraftEntityMutability
  
  @js.native
  sealed trait ITALIC extends DraftInlineStyleType
  
  @js.native
  sealed trait LINK extends ComposedEntityType
  
  @js.native
  sealed trait LTR extends DraftTextDirectionality
  
  @js.native
  sealed trait MUTABLE extends DraftEntityMutability
  
  @js.native
  sealed trait NEUTRAL extends DraftTextDirectionality
  
  @js.native
  sealed trait PHOTO extends ComposedEntityType
  
  @js.native
  sealed trait RTL extends DraftTextDirectionality
  
  @js.native
  sealed trait SEGMENTED extends DraftEntityMutability
  
  @js.native
  sealed trait STRIKETHROUGH extends DraftInlineStyleType
  
  @js.native
  sealed trait TOKEN extends ComposedEntityType
  
  @js.native
  sealed trait UNDERLINE extends DraftInlineStyleType
  
  @js.native
  sealed trait `adjust-depth` extends EditorChangeType
  
  @js.native
  sealed trait after extends DraftInsertionType
  
  @js.native
  sealed trait `apply-entity` extends EditorChangeType
  
  @js.native
  sealed trait atomic extends CoreDraftBlockType
  
  @js.native
  sealed trait backspace extends DraftEditorCommand
  
  @js.native
  sealed trait `backspace-character` extends EditorChangeType
  
  @js.native
  sealed trait `backspace-to-start-of-line` extends DraftEditorCommand
  
  @js.native
  sealed trait `backspace-word` extends DraftEditorCommand
  
  @js.native
  sealed trait backward extends DraftRemovalDirection
  
  @js.native
  sealed trait before extends DraftInsertionType
  
  @js.native
  sealed trait blockquote extends CoreDraftBlockType
  
  @js.native
  sealed trait bold extends DraftEditorCommand
  
  @js.native
  sealed trait center extends DraftTextAlignment
  
  @js.native
  sealed trait `change-block-data` extends EditorChangeType
  
  @js.native
  sealed trait `change-block-type` extends EditorChangeType
  
  @js.native
  sealed trait `change-inline-style` extends EditorChangeType
  
  @js.native
  sealed trait code extends DraftEditorCommand
  
  @js.native
  sealed trait `code-block` extends CoreDraftBlockType
  
  @js.native
  sealed trait delete extends DraftEditorCommand
  
  @js.native
  sealed trait `delete-character` extends EditorChangeType
  
  @js.native
  sealed trait `delete-word` extends DraftEditorCommand
  
  @js.native
  sealed trait external extends DraftDragType
  
  @js.native
  sealed trait forward extends DraftRemovalDirection
  
  @js.native
  sealed trait handled extends DraftHandleValue
  
  @js.native
  sealed trait `header-five` extends CoreDraftBlockType
  
  @js.native
  sealed trait `header-four` extends CoreDraftBlockType
  
  @js.native
  sealed trait `header-one` extends CoreDraftBlockType
  
  @js.native
  sealed trait `header-six` extends CoreDraftBlockType
  
  @js.native
  sealed trait `header-three` extends CoreDraftBlockType
  
  @js.native
  sealed trait `header-two` extends CoreDraftBlockType
  
  @js.native
  sealed trait `insert-characters` extends EditorChangeType
  
  @js.native
  sealed trait `insert-fragment` extends EditorChangeType
  
  @js.native
  sealed trait internal extends DraftDragType
  
  @js.native
  sealed trait italic extends DraftEditorCommand
  
  @js.native
  sealed trait left extends DraftTextAlignment
  
  @js.native
  sealed trait `move-selection-to-end-of-block` extends DraftEditorCommand
  
  @js.native
  sealed trait `move-selection-to-start-of-block` extends DraftEditorCommand
  
  @js.native
  sealed trait `not-handled` extends DraftHandleValue
  
  @js.native
  sealed trait `ordered-list-item` extends CoreDraftBlockType
  
  @js.native
  sealed trait paragraph extends CoreDraftBlockType
  
  @js.native
  sealed trait redo
    extends DraftEditorCommand
       with EditorChangeType
  
  @js.native
  sealed trait `remove-range` extends EditorChangeType
  
  @js.native
  sealed trait replace extends DraftInsertionType
  
  @js.native
  sealed trait right extends DraftTextAlignment
  
  @js.native
  sealed trait `secondary-cut` extends DraftEditorCommand
  
  @js.native
  sealed trait `secondary-paste` extends DraftEditorCommand
  
  @js.native
  sealed trait `spellcheck-change` extends EditorChangeType
  
  @js.native
  sealed trait `split-block`
    extends DraftEditorCommand
       with EditorChangeType
  
  @js.native
  sealed trait strikethrough extends DraftEditorCommand
  
  @js.native
  sealed trait `transpose-characters` extends DraftEditorCommand
  
  @js.native
  sealed trait underline extends DraftEditorCommand
  
  @js.native
  sealed trait undo
    extends DraftEditorCommand
       with EditorChangeType
  
  @js.native
  sealed trait `unordered-list-item` extends CoreDraftBlockType
  
  @js.native
  sealed trait unstyled extends CoreDraftBlockType
  
  @scala.inline
  def BOLD: BOLD = "BOLD".asInstanceOf[BOLD]
  @scala.inline
  def CODE: CODE = "CODE".asInstanceOf[CODE]
  @scala.inline
  def IMAGE: IMAGE = "IMAGE".asInstanceOf[IMAGE]
  @scala.inline
  def IMMUTABLE: IMMUTABLE = "IMMUTABLE".asInstanceOf[IMMUTABLE]
  @scala.inline
  def ITALIC: ITALIC = "ITALIC".asInstanceOf[ITALIC]
  @scala.inline
  def LINK: LINK = "LINK".asInstanceOf[LINK]
  @scala.inline
  def LTR: LTR = "LTR".asInstanceOf[LTR]
  @scala.inline
  def MUTABLE: MUTABLE = "MUTABLE".asInstanceOf[MUTABLE]
  @scala.inline
  def NEUTRAL: NEUTRAL = "NEUTRAL".asInstanceOf[NEUTRAL]
  @scala.inline
  def PHOTO: PHOTO = "PHOTO".asInstanceOf[PHOTO]
  @scala.inline
  def RTL: RTL = "RTL".asInstanceOf[RTL]
  @scala.inline
  def SEGMENTED: SEGMENTED = "SEGMENTED".asInstanceOf[SEGMENTED]
  @scala.inline
  def STRIKETHROUGH: STRIKETHROUGH = "STRIKETHROUGH".asInstanceOf[STRIKETHROUGH]
  @scala.inline
  def TOKEN: TOKEN = "TOKEN".asInstanceOf[TOKEN]
  @scala.inline
  def UNDERLINE: UNDERLINE = "UNDERLINE".asInstanceOf[UNDERLINE]
  @scala.inline
  def `adjust-depth`: `adjust-depth` = "adjust-depth".asInstanceOf[`adjust-depth`]
  @scala.inline
  def after: after = "after".asInstanceOf[after]
  @scala.inline
  def `apply-entity`: `apply-entity` = "apply-entity".asInstanceOf[`apply-entity`]
  @scala.inline
  def atomic: atomic = "atomic".asInstanceOf[atomic]
  @scala.inline
  def backspace: backspace = "backspace".asInstanceOf[backspace]
  @scala.inline
  def `backspace-character`: `backspace-character` = "backspace-character".asInstanceOf[`backspace-character`]
  @scala.inline
  def `backspace-to-start-of-line`: `backspace-to-start-of-line` = "backspace-to-start-of-line".asInstanceOf[`backspace-to-start-of-line`]
  @scala.inline
  def `backspace-word`: `backspace-word` = "backspace-word".asInstanceOf[`backspace-word`]
  @scala.inline
  def backward: backward = "backward".asInstanceOf[backward]
  @scala.inline
  def before: before = "before".asInstanceOf[before]
  @scala.inline
  def blockquote: blockquote = "blockquote".asInstanceOf[blockquote]
  @scala.inline
  def bold: bold = "bold".asInstanceOf[bold]
  @scala.inline
  def center: center = "center".asInstanceOf[center]
  @scala.inline
  def `change-block-data`: `change-block-data` = "change-block-data".asInstanceOf[`change-block-data`]
  @scala.inline
  def `change-block-type`: `change-block-type` = "change-block-type".asInstanceOf[`change-block-type`]
  @scala.inline
  def `change-inline-style`: `change-inline-style` = "change-inline-style".asInstanceOf[`change-inline-style`]
  @scala.inline
  def code: code = "code".asInstanceOf[code]
  @scala.inline
  def `code-block`: `code-block` = "code-block".asInstanceOf[`code-block`]
  @scala.inline
  def delete: delete = "delete".asInstanceOf[delete]
  @scala.inline
  def `delete-character`: `delete-character` = "delete-character".asInstanceOf[`delete-character`]
  @scala.inline
  def `delete-word`: `delete-word` = "delete-word".asInstanceOf[`delete-word`]
  @scala.inline
  def external: external = "external".asInstanceOf[external]
  @scala.inline
  def forward: forward = "forward".asInstanceOf[forward]
  @scala.inline
  def handled: handled = "handled".asInstanceOf[handled]
  @scala.inline
  def `header-five`: `header-five` = "header-five".asInstanceOf[`header-five`]
  @scala.inline
  def `header-four`: `header-four` = "header-four".asInstanceOf[`header-four`]
  @scala.inline
  def `header-one`: `header-one` = "header-one".asInstanceOf[`header-one`]
  @scala.inline
  def `header-six`: `header-six` = "header-six".asInstanceOf[`header-six`]
  @scala.inline
  def `header-three`: `header-three` = "header-three".asInstanceOf[`header-three`]
  @scala.inline
  def `header-two`: `header-two` = "header-two".asInstanceOf[`header-two`]
  @scala.inline
  def `insert-characters`: `insert-characters` = "insert-characters".asInstanceOf[`insert-characters`]
  @scala.inline
  def `insert-fragment`: `insert-fragment` = "insert-fragment".asInstanceOf[`insert-fragment`]
  @scala.inline
  def internal: internal = "internal".asInstanceOf[internal]
  @scala.inline
  def italic: italic = "italic".asInstanceOf[italic]
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  @scala.inline
  def `move-selection-to-end-of-block`: `move-selection-to-end-of-block` = "move-selection-to-end-of-block".asInstanceOf[`move-selection-to-end-of-block`]
  @scala.inline
  def `move-selection-to-start-of-block`: `move-selection-to-start-of-block` = "move-selection-to-start-of-block".asInstanceOf[`move-selection-to-start-of-block`]
  @scala.inline
  def `not-handled`: `not-handled` = "not-handled".asInstanceOf[`not-handled`]
  @scala.inline
  def `ordered-list-item`: `ordered-list-item` = "ordered-list-item".asInstanceOf[`ordered-list-item`]
  @scala.inline
  def paragraph: paragraph = "paragraph".asInstanceOf[paragraph]
  @scala.inline
  def redo: redo = "redo".asInstanceOf[redo]
  @scala.inline
  def `remove-range`: `remove-range` = "remove-range".asInstanceOf[`remove-range`]
  @scala.inline
  def replace: replace = "replace".asInstanceOf[replace]
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  @scala.inline
  def `secondary-cut`: `secondary-cut` = "secondary-cut".asInstanceOf[`secondary-cut`]
  @scala.inline
  def `secondary-paste`: `secondary-paste` = "secondary-paste".asInstanceOf[`secondary-paste`]
  @scala.inline
  def `spellcheck-change`: `spellcheck-change` = "spellcheck-change".asInstanceOf[`spellcheck-change`]
  @scala.inline
  def `split-block`: `split-block` = "split-block".asInstanceOf[`split-block`]
  @scala.inline
  def strikethrough: strikethrough = "strikethrough".asInstanceOf[strikethrough]
  @scala.inline
  def `transpose-characters`: `transpose-characters` = "transpose-characters".asInstanceOf[`transpose-characters`]
  @scala.inline
  def underline: underline = "underline".asInstanceOf[underline]
  @scala.inline
  def undo: undo = "undo".asInstanceOf[undo]
  @scala.inline
  def `unordered-list-item`: `unordered-list-item` = "unordered-list-item".asInstanceOf[`unordered-list-item`]
  @scala.inline
  def unstyled: unstyled = "unstyled".asInstanceOf[unstyled]
}

