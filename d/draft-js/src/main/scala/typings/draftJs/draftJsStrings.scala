package typings.draftJs

import typings.draftJs.mod.Draft.Component.Base.DraftTextAlignment
import typings.draftJs.mod.Draft.Component.Base.DraftTextDirectionality
import typings.draftJs.mod.Draft.Model.Constants.ComposedEntityType
import typings.draftJs.mod.Draft.Model.Constants.CoreDraftBlockType
import typings.draftJs.mod.Draft.Model.Constants.DraftDragType
import typings.draftJs.mod.Draft.Model.Constants.DraftEditorCommand
import typings.draftJs.mod.Draft.Model.Constants.DraftEntityMutability
import typings.draftJs.mod.Draft.Model.Constants.DraftHandleValue
import typings.draftJs.mod.Draft.Model.Constants.DraftInlineStyleType
import typings.draftJs.mod.Draft.Model.Constants.DraftInsertionType
import typings.draftJs.mod.Draft.Model.Constants.DraftRemovalDirection
import typings.draftJs.mod.Draft.Model.ImmutableData.EditorChangeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object draftJsStrings {
  
  @js.native
  sealed trait BOLD extends DraftInlineStyleType
  @scala.inline
  def BOLD: BOLD = "BOLD".asInstanceOf[BOLD]
  
  @js.native
  sealed trait CODE extends DraftInlineStyleType
  @scala.inline
  def CODE: CODE = "CODE".asInstanceOf[CODE]
  
  @js.native
  sealed trait IMAGE extends ComposedEntityType
  @scala.inline
  def IMAGE: IMAGE = "IMAGE".asInstanceOf[IMAGE]
  
  @js.native
  sealed trait IMMUTABLE extends DraftEntityMutability
  @scala.inline
  def IMMUTABLE: IMMUTABLE = "IMMUTABLE".asInstanceOf[IMMUTABLE]
  
  @js.native
  sealed trait ITALIC extends DraftInlineStyleType
  @scala.inline
  def ITALIC: ITALIC = "ITALIC".asInstanceOf[ITALIC]
  
  @js.native
  sealed trait LINK extends ComposedEntityType
  @scala.inline
  def LINK: LINK = "LINK".asInstanceOf[LINK]
  
  @js.native
  sealed trait LTR extends DraftTextDirectionality
  @scala.inline
  def LTR: LTR = "LTR".asInstanceOf[LTR]
  
  @js.native
  sealed trait MUTABLE extends DraftEntityMutability
  @scala.inline
  def MUTABLE: MUTABLE = "MUTABLE".asInstanceOf[MUTABLE]
  
  @js.native
  sealed trait NEUTRAL extends DraftTextDirectionality
  @scala.inline
  def NEUTRAL: NEUTRAL = "NEUTRAL".asInstanceOf[NEUTRAL]
  
  @js.native
  sealed trait PHOTO extends ComposedEntityType
  @scala.inline
  def PHOTO: PHOTO = "PHOTO".asInstanceOf[PHOTO]
  
  @js.native
  sealed trait RTL extends DraftTextDirectionality
  @scala.inline
  def RTL: RTL = "RTL".asInstanceOf[RTL]
  
  @js.native
  sealed trait SEGMENTED extends DraftEntityMutability
  @scala.inline
  def SEGMENTED: SEGMENTED = "SEGMENTED".asInstanceOf[SEGMENTED]
  
  @js.native
  sealed trait STRIKETHROUGH extends DraftInlineStyleType
  @scala.inline
  def STRIKETHROUGH: STRIKETHROUGH = "STRIKETHROUGH".asInstanceOf[STRIKETHROUGH]
  
  @js.native
  sealed trait TOKEN extends ComposedEntityType
  @scala.inline
  def TOKEN: TOKEN = "TOKEN".asInstanceOf[TOKEN]
  
  @js.native
  sealed trait UNDERLINE extends DraftInlineStyleType
  @scala.inline
  def UNDERLINE: UNDERLINE = "UNDERLINE".asInstanceOf[UNDERLINE]
  
  @js.native
  sealed trait `adjust-depth` extends EditorChangeType
  @scala.inline
  def `adjust-depth`: `adjust-depth` = "adjust-depth".asInstanceOf[`adjust-depth`]
  
  @js.native
  sealed trait after extends DraftInsertionType
  @scala.inline
  def after: after = "after".asInstanceOf[after]
  
  @js.native
  sealed trait anchorKey extends StObject
  @scala.inline
  def anchorKey: anchorKey = "anchorKey".asInstanceOf[anchorKey]
  
  @js.native
  sealed trait anchorOffset extends StObject
  @scala.inline
  def anchorOffset: anchorOffset = "anchorOffset".asInstanceOf[anchorOffset]
  
  @js.native
  sealed trait `apply-entity` extends EditorChangeType
  @scala.inline
  def `apply-entity`: `apply-entity` = "apply-entity".asInstanceOf[`apply-entity`]
  
  @js.native
  sealed trait atomic extends CoreDraftBlockType
  @scala.inline
  def atomic: atomic = "atomic".asInstanceOf[atomic]
  
  @js.native
  sealed trait backspace extends DraftEditorCommand
  @scala.inline
  def backspace: backspace = "backspace".asInstanceOf[backspace]
  
  @js.native
  sealed trait `backspace-character` extends EditorChangeType
  @scala.inline
  def `backspace-character`: `backspace-character` = "backspace-character".asInstanceOf[`backspace-character`]
  
  @js.native
  sealed trait `backspace-to-start-of-line` extends DraftEditorCommand
  @scala.inline
  def `backspace-to-start-of-line`: `backspace-to-start-of-line` = "backspace-to-start-of-line".asInstanceOf[`backspace-to-start-of-line`]
  
  @js.native
  sealed trait `backspace-word` extends DraftEditorCommand
  @scala.inline
  def `backspace-word`: `backspace-word` = "backspace-word".asInstanceOf[`backspace-word`]
  
  @js.native
  sealed trait backward extends DraftRemovalDirection
  @scala.inline
  def backward: backward = "backward".asInstanceOf[backward]
  
  @js.native
  sealed trait before extends DraftInsertionType
  @scala.inline
  def before: before = "before".asInstanceOf[before]
  
  @js.native
  sealed trait blockquote extends CoreDraftBlockType
  @scala.inline
  def blockquote: blockquote = "blockquote".asInstanceOf[blockquote]
  
  @js.native
  sealed trait bold_ extends DraftEditorCommand
  @scala.inline
  def bold_ : bold_ = "bold".asInstanceOf[bold_]
  
  @js.native
  sealed trait center extends DraftTextAlignment
  @scala.inline
  def center: center = "center".asInstanceOf[center]
  
  @js.native
  sealed trait `change-block-data` extends EditorChangeType
  @scala.inline
  def `change-block-data`: `change-block-data` = "change-block-data".asInstanceOf[`change-block-data`]
  
  @js.native
  sealed trait `change-block-type` extends EditorChangeType
  @scala.inline
  def `change-block-type`: `change-block-type` = "change-block-type".asInstanceOf[`change-block-type`]
  
  @js.native
  sealed trait `change-inline-style` extends EditorChangeType
  @scala.inline
  def `change-inline-style`: `change-inline-style` = "change-inline-style".asInstanceOf[`change-inline-style`]
  
  @js.native
  sealed trait `code-block` extends CoreDraftBlockType
  @scala.inline
  def `code-block`: `code-block` = "code-block".asInstanceOf[`code-block`]
  
  @js.native
  sealed trait code_ extends DraftEditorCommand
  @scala.inline
  def code_ : code_ = "code".asInstanceOf[code_]
  
  @js.native
  sealed trait delete extends DraftEditorCommand
  @scala.inline
  def delete: delete = "delete".asInstanceOf[delete]
  
  @js.native
  sealed trait `delete-character` extends EditorChangeType
  @scala.inline
  def `delete-character`: `delete-character` = "delete-character".asInstanceOf[`delete-character`]
  
  @js.native
  sealed trait `delete-word` extends DraftEditorCommand
  @scala.inline
  def `delete-word`: `delete-word` = "delete-word".asInstanceOf[`delete-word`]
  
  @js.native
  sealed trait external extends DraftDragType
  @scala.inline
  def external: external = "external".asInstanceOf[external]
  
  @js.native
  sealed trait focusKey extends StObject
  @scala.inline
  def focusKey: focusKey = "focusKey".asInstanceOf[focusKey]
  
  @js.native
  sealed trait focusOffset extends StObject
  @scala.inline
  def focusOffset: focusOffset = "focusOffset".asInstanceOf[focusOffset]
  
  @js.native
  sealed trait forward extends DraftRemovalDirection
  @scala.inline
  def forward: forward = "forward".asInstanceOf[forward]
  
  @js.native
  sealed trait handled extends DraftHandleValue
  @scala.inline
  def handled: handled = "handled".asInstanceOf[handled]
  
  @js.native
  sealed trait hasFocus extends StObject
  @scala.inline
  def hasFocus: hasFocus = "hasFocus".asInstanceOf[hasFocus]
  
  @js.native
  sealed trait `header-five` extends CoreDraftBlockType
  @scala.inline
  def `header-five`: `header-five` = "header-five".asInstanceOf[`header-five`]
  
  @js.native
  sealed trait `header-four` extends CoreDraftBlockType
  @scala.inline
  def `header-four`: `header-four` = "header-four".asInstanceOf[`header-four`]
  
  @js.native
  sealed trait `header-one` extends CoreDraftBlockType
  @scala.inline
  def `header-one`: `header-one` = "header-one".asInstanceOf[`header-one`]
  
  @js.native
  sealed trait `header-six` extends CoreDraftBlockType
  @scala.inline
  def `header-six`: `header-six` = "header-six".asInstanceOf[`header-six`]
  
  @js.native
  sealed trait `header-three` extends CoreDraftBlockType
  @scala.inline
  def `header-three`: `header-three` = "header-three".asInstanceOf[`header-three`]
  
  @js.native
  sealed trait `header-two` extends CoreDraftBlockType
  @scala.inline
  def `header-two`: `header-two` = "header-two".asInstanceOf[`header-two`]
  
  @js.native
  sealed trait `insert-characters` extends EditorChangeType
  @scala.inline
  def `insert-characters`: `insert-characters` = "insert-characters".asInstanceOf[`insert-characters`]
  
  @js.native
  sealed trait `insert-fragment` extends EditorChangeType
  @scala.inline
  def `insert-fragment`: `insert-fragment` = "insert-fragment".asInstanceOf[`insert-fragment`]
  
  @js.native
  sealed trait internal extends DraftDragType
  @scala.inline
  def internal: internal = "internal".asInstanceOf[internal]
  
  @js.native
  sealed trait isBackward extends StObject
  @scala.inline
  def isBackward: isBackward = "isBackward".asInstanceOf[isBackward]
  
  @js.native
  sealed trait italic_ extends DraftEditorCommand
  @scala.inline
  def italic_ : italic_ = "italic".asInstanceOf[italic_]
  
  @js.native
  sealed trait left extends DraftTextAlignment
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  
  @js.native
  sealed trait `move-selection-to-end-of-block` extends DraftEditorCommand
  @scala.inline
  def `move-selection-to-end-of-block`: `move-selection-to-end-of-block` = "move-selection-to-end-of-block".asInstanceOf[`move-selection-to-end-of-block`]
  
  @js.native
  sealed trait `move-selection-to-start-of-block` extends DraftEditorCommand
  @scala.inline
  def `move-selection-to-start-of-block`: `move-selection-to-start-of-block` = "move-selection-to-start-of-block".asInstanceOf[`move-selection-to-start-of-block`]
  
  @js.native
  sealed trait `not-handled` extends DraftHandleValue
  @scala.inline
  def `not-handled`: `not-handled` = "not-handled".asInstanceOf[`not-handled`]
  
  @js.native
  sealed trait `ordered-list-item` extends CoreDraftBlockType
  @scala.inline
  def `ordered-list-item`: `ordered-list-item` = "ordered-list-item".asInstanceOf[`ordered-list-item`]
  
  @js.native
  sealed trait paragraph extends CoreDraftBlockType
  @scala.inline
  def paragraph: paragraph = "paragraph".asInstanceOf[paragraph]
  
  @js.native
  sealed trait redo
    extends DraftEditorCommand
       with EditorChangeType
  @scala.inline
  def redo: redo = "redo".asInstanceOf[redo]
  
  @js.native
  sealed trait `remove-range` extends EditorChangeType
  @scala.inline
  def `remove-range`: `remove-range` = "remove-range".asInstanceOf[`remove-range`]
  
  @js.native
  sealed trait replace extends DraftInsertionType
  @scala.inline
  def replace: replace = "replace".asInstanceOf[replace]
  
  @js.native
  sealed trait right extends DraftTextAlignment
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  
  @js.native
  sealed trait `secondary-cut` extends DraftEditorCommand
  @scala.inline
  def `secondary-cut`: `secondary-cut` = "secondary-cut".asInstanceOf[`secondary-cut`]
  
  @js.native
  sealed trait `secondary-paste` extends DraftEditorCommand
  @scala.inline
  def `secondary-paste`: `secondary-paste` = "secondary-paste".asInstanceOf[`secondary-paste`]
  
  @js.native
  sealed trait `spellcheck-change` extends EditorChangeType
  @scala.inline
  def `spellcheck-change`: `spellcheck-change` = "spellcheck-change".asInstanceOf[`spellcheck-change`]
  
  @js.native
  sealed trait `split-block`
    extends DraftEditorCommand
       with EditorChangeType
  @scala.inline
  def `split-block`: `split-block` = "split-block".asInstanceOf[`split-block`]
  
  @js.native
  sealed trait strikethrough_ extends DraftEditorCommand
  @scala.inline
  def strikethrough_ : strikethrough_ = "strikethrough".asInstanceOf[strikethrough_]
  
  @js.native
  sealed trait `transpose-characters` extends DraftEditorCommand
  @scala.inline
  def `transpose-characters`: `transpose-characters` = "transpose-characters".asInstanceOf[`transpose-characters`]
  
  @js.native
  sealed trait underline_ extends DraftEditorCommand
  @scala.inline
  def underline_ : underline_ = "underline".asInstanceOf[underline_]
  
  @js.native
  sealed trait undo
    extends DraftEditorCommand
       with EditorChangeType
  @scala.inline
  def undo: undo = "undo".asInstanceOf[undo]
  
  @js.native
  sealed trait `unordered-list-item` extends CoreDraftBlockType
  @scala.inline
  def `unordered-list-item`: `unordered-list-item` = "unordered-list-item".asInstanceOf[`unordered-list-item`]
  
  @js.native
  sealed trait unstyled extends CoreDraftBlockType
  @scala.inline
  def unstyled: unstyled = "unstyled".asInstanceOf[unstyled]
}
