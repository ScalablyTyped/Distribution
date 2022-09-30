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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object draftJsStrings {
  
  @js.native
  sealed trait BOLD
    extends StObject
       with DraftInlineStyleType
  inline def BOLD: BOLD = "BOLD".asInstanceOf[BOLD]
  
  @js.native
  sealed trait CODE
    extends StObject
       with DraftInlineStyleType
  inline def CODE: CODE = "CODE".asInstanceOf[CODE]
  
  @js.native
  sealed trait IMAGE
    extends StObject
       with ComposedEntityType
  inline def IMAGE: IMAGE = "IMAGE".asInstanceOf[IMAGE]
  
  @js.native
  sealed trait IMMUTABLE
    extends StObject
       with DraftEntityMutability
  inline def IMMUTABLE: IMMUTABLE = "IMMUTABLE".asInstanceOf[IMMUTABLE]
  
  @js.native
  sealed trait ITALIC
    extends StObject
       with DraftInlineStyleType
  inline def ITALIC: ITALIC = "ITALIC".asInstanceOf[ITALIC]
  
  @js.native
  sealed trait LINK
    extends StObject
       with ComposedEntityType
  inline def LINK: LINK = "LINK".asInstanceOf[LINK]
  
  @js.native
  sealed trait LTR
    extends StObject
       with DraftTextDirectionality
  inline def LTR: LTR = "LTR".asInstanceOf[LTR]
  
  @js.native
  sealed trait MUTABLE
    extends StObject
       with DraftEntityMutability
  inline def MUTABLE: MUTABLE = "MUTABLE".asInstanceOf[MUTABLE]
  
  @js.native
  sealed trait NEUTRAL
    extends StObject
       with DraftTextDirectionality
  inline def NEUTRAL: NEUTRAL = "NEUTRAL".asInstanceOf[NEUTRAL]
  
  @js.native
  sealed trait PHOTO
    extends StObject
       with ComposedEntityType
  inline def PHOTO: PHOTO = "PHOTO".asInstanceOf[PHOTO]
  
  @js.native
  sealed trait RTL
    extends StObject
       with DraftTextDirectionality
  inline def RTL: RTL = "RTL".asInstanceOf[RTL]
  
  @js.native
  sealed trait SEGMENTED
    extends StObject
       with DraftEntityMutability
  inline def SEGMENTED: SEGMENTED = "SEGMENTED".asInstanceOf[SEGMENTED]
  
  @js.native
  sealed trait STRIKETHROUGH
    extends StObject
       with DraftInlineStyleType
  inline def STRIKETHROUGH: STRIKETHROUGH = "STRIKETHROUGH".asInstanceOf[STRIKETHROUGH]
  
  @js.native
  sealed trait TOKEN
    extends StObject
       with ComposedEntityType
  inline def TOKEN: TOKEN = "TOKEN".asInstanceOf[TOKEN]
  
  @js.native
  sealed trait UNDERLINE
    extends StObject
       with DraftInlineStyleType
  inline def UNDERLINE: UNDERLINE = "UNDERLINE".asInstanceOf[UNDERLINE]
  
  @js.native
  sealed trait `adjust-depth`
    extends StObject
       with EditorChangeType
  inline def `adjust-depth`: `adjust-depth` = "adjust-depth".asInstanceOf[`adjust-depth`]
  
  @js.native
  sealed trait after
    extends StObject
       with DraftInsertionType
  inline def after: after = "after".asInstanceOf[after]
  
  @js.native
  sealed trait anchorKey extends StObject
  inline def anchorKey: anchorKey = "anchorKey".asInstanceOf[anchorKey]
  
  @js.native
  sealed trait anchorOffset extends StObject
  inline def anchorOffset: anchorOffset = "anchorOffset".asInstanceOf[anchorOffset]
  
  @js.native
  sealed trait `apply-entity`
    extends StObject
       with EditorChangeType
  inline def `apply-entity`: `apply-entity` = "apply-entity".asInstanceOf[`apply-entity`]
  
  @js.native
  sealed trait atomic
    extends StObject
       with CoreDraftBlockType
  inline def atomic: atomic = "atomic".asInstanceOf[atomic]
  
  @js.native
  sealed trait backspace
    extends StObject
       with DraftEditorCommand
  inline def backspace: backspace = "backspace".asInstanceOf[backspace]
  
  @js.native
  sealed trait `backspace-character`
    extends StObject
       with EditorChangeType
  inline def `backspace-character`: `backspace-character` = "backspace-character".asInstanceOf[`backspace-character`]
  
  @js.native
  sealed trait `backspace-to-start-of-line`
    extends StObject
       with DraftEditorCommand
  inline def `backspace-to-start-of-line`: `backspace-to-start-of-line` = "backspace-to-start-of-line".asInstanceOf[`backspace-to-start-of-line`]
  
  @js.native
  sealed trait `backspace-word`
    extends StObject
       with DraftEditorCommand
  inline def `backspace-word`: `backspace-word` = "backspace-word".asInstanceOf[`backspace-word`]
  
  @js.native
  sealed trait backward
    extends StObject
       with DraftRemovalDirection
  inline def backward: backward = "backward".asInstanceOf[backward]
  
  @js.native
  sealed trait before
    extends StObject
       with DraftInsertionType
  inline def before: before = "before".asInstanceOf[before]
  
  @js.native
  sealed trait blockquote
    extends StObject
       with CoreDraftBlockType
  inline def blockquote: blockquote = "blockquote".asInstanceOf[blockquote]
  
  @js.native
  sealed trait bold_
    extends StObject
       with DraftEditorCommand
  inline def bold_ : bold_ = "bold".asInstanceOf[bold_]
  
  @js.native
  sealed trait center
    extends StObject
       with DraftTextAlignment
  inline def center: center = "center".asInstanceOf[center]
  
  @js.native
  sealed trait `change-block-data`
    extends StObject
       with EditorChangeType
  inline def `change-block-data`: `change-block-data` = "change-block-data".asInstanceOf[`change-block-data`]
  
  @js.native
  sealed trait `change-block-type`
    extends StObject
       with EditorChangeType
  inline def `change-block-type`: `change-block-type` = "change-block-type".asInstanceOf[`change-block-type`]
  
  @js.native
  sealed trait `change-inline-style`
    extends StObject
       with EditorChangeType
  inline def `change-inline-style`: `change-inline-style` = "change-inline-style".asInstanceOf[`change-inline-style`]
  
  @js.native
  sealed trait `code-block`
    extends StObject
       with CoreDraftBlockType
  inline def `code-block`: `code-block` = "code-block".asInstanceOf[`code-block`]
  
  @js.native
  sealed trait code_
    extends StObject
       with DraftEditorCommand
  inline def code_ : code_ = "code".asInstanceOf[code_]
  
  @js.native
  sealed trait delete
    extends StObject
       with DraftEditorCommand
  inline def delete: delete = "delete".asInstanceOf[delete]
  
  @js.native
  sealed trait `delete-character`
    extends StObject
       with EditorChangeType
  inline def `delete-character`: `delete-character` = "delete-character".asInstanceOf[`delete-character`]
  
  @js.native
  sealed trait `delete-word`
    extends StObject
       with DraftEditorCommand
  inline def `delete-word`: `delete-word` = "delete-word".asInstanceOf[`delete-word`]
  
  @js.native
  sealed trait external
    extends StObject
       with DraftDragType
  inline def external: external = "external".asInstanceOf[external]
  
  @js.native
  sealed trait focusKey extends StObject
  inline def focusKey: focusKey = "focusKey".asInstanceOf[focusKey]
  
  @js.native
  sealed trait focusOffset extends StObject
  inline def focusOffset: focusOffset = "focusOffset".asInstanceOf[focusOffset]
  
  @js.native
  sealed trait forward
    extends StObject
       with DraftRemovalDirection
  inline def forward: forward = "forward".asInstanceOf[forward]
  
  @js.native
  sealed trait handled
    extends StObject
       with DraftHandleValue
  inline def handled: handled = "handled".asInstanceOf[handled]
  
  @js.native
  sealed trait hasFocus extends StObject
  inline def hasFocus: hasFocus = "hasFocus".asInstanceOf[hasFocus]
  
  @js.native
  sealed trait `header-five`
    extends StObject
       with CoreDraftBlockType
  inline def `header-five`: `header-five` = "header-five".asInstanceOf[`header-five`]
  
  @js.native
  sealed trait `header-four`
    extends StObject
       with CoreDraftBlockType
  inline def `header-four`: `header-four` = "header-four".asInstanceOf[`header-four`]
  
  @js.native
  sealed trait `header-one`
    extends StObject
       with CoreDraftBlockType
  inline def `header-one`: `header-one` = "header-one".asInstanceOf[`header-one`]
  
  @js.native
  sealed trait `header-six`
    extends StObject
       with CoreDraftBlockType
  inline def `header-six`: `header-six` = "header-six".asInstanceOf[`header-six`]
  
  @js.native
  sealed trait `header-three`
    extends StObject
       with CoreDraftBlockType
  inline def `header-three`: `header-three` = "header-three".asInstanceOf[`header-three`]
  
  @js.native
  sealed trait `header-two`
    extends StObject
       with CoreDraftBlockType
  inline def `header-two`: `header-two` = "header-two".asInstanceOf[`header-two`]
  
  @js.native
  sealed trait `insert-characters`
    extends StObject
       with EditorChangeType
  inline def `insert-characters`: `insert-characters` = "insert-characters".asInstanceOf[`insert-characters`]
  
  @js.native
  sealed trait `insert-fragment`
    extends StObject
       with EditorChangeType
  inline def `insert-fragment`: `insert-fragment` = "insert-fragment".asInstanceOf[`insert-fragment`]
  
  @js.native
  sealed trait internal
    extends StObject
       with DraftDragType
  inline def internal: internal = "internal".asInstanceOf[internal]
  
  @js.native
  sealed trait isBackward extends StObject
  inline def isBackward: isBackward = "isBackward".asInstanceOf[isBackward]
  
  @js.native
  sealed trait italic_
    extends StObject
       with DraftEditorCommand
  inline def italic_ : italic_ = "italic".asInstanceOf[italic_]
  
  @js.native
  sealed trait left
    extends StObject
       with DraftTextAlignment
  inline def left: left = "left".asInstanceOf[left]
  
  @js.native
  sealed trait `move-block`
    extends StObject
       with EditorChangeType
  inline def `move-block`: `move-block` = "move-block".asInstanceOf[`move-block`]
  
  @js.native
  sealed trait `move-selection-to-end-of-block`
    extends StObject
       with DraftEditorCommand
  inline def `move-selection-to-end-of-block`: `move-selection-to-end-of-block` = "move-selection-to-end-of-block".asInstanceOf[`move-selection-to-end-of-block`]
  
  @js.native
  sealed trait `move-selection-to-start-of-block`
    extends StObject
       with DraftEditorCommand
  inline def `move-selection-to-start-of-block`: `move-selection-to-start-of-block` = "move-selection-to-start-of-block".asInstanceOf[`move-selection-to-start-of-block`]
  
  @js.native
  sealed trait `not-handled`
    extends StObject
       with DraftHandleValue
  inline def `not-handled`: `not-handled` = "not-handled".asInstanceOf[`not-handled`]
  
  @js.native
  sealed trait `ordered-list-item`
    extends StObject
       with CoreDraftBlockType
  inline def `ordered-list-item`: `ordered-list-item` = "ordered-list-item".asInstanceOf[`ordered-list-item`]
  
  @js.native
  sealed trait paragraph
    extends StObject
       with CoreDraftBlockType
  inline def paragraph: paragraph = "paragraph".asInstanceOf[paragraph]
  
  @js.native
  sealed trait redo
    extends StObject
       with DraftEditorCommand
       with EditorChangeType
  inline def redo: redo = "redo".asInstanceOf[redo]
  
  @js.native
  sealed trait `remove-range`
    extends StObject
       with EditorChangeType
  inline def `remove-range`: `remove-range` = "remove-range".asInstanceOf[`remove-range`]
  
  @js.native
  sealed trait replace
    extends StObject
       with DraftInsertionType
  inline def replace: replace = "replace".asInstanceOf[replace]
  
  @js.native
  sealed trait right
    extends StObject
       with DraftTextAlignment
  inline def right: right = "right".asInstanceOf[right]
  
  @js.native
  sealed trait `secondary-cut`
    extends StObject
       with DraftEditorCommand
  inline def `secondary-cut`: `secondary-cut` = "secondary-cut".asInstanceOf[`secondary-cut`]
  
  @js.native
  sealed trait `secondary-paste`
    extends StObject
       with DraftEditorCommand
  inline def `secondary-paste`: `secondary-paste` = "secondary-paste".asInstanceOf[`secondary-paste`]
  
  @js.native
  sealed trait `spellcheck-change`
    extends StObject
       with EditorChangeType
  inline def `spellcheck-change`: `spellcheck-change` = "spellcheck-change".asInstanceOf[`spellcheck-change`]
  
  @js.native
  sealed trait `split-block`
    extends StObject
       with DraftEditorCommand
       with EditorChangeType
  inline def `split-block`: `split-block` = "split-block".asInstanceOf[`split-block`]
  
  @js.native
  sealed trait strikethrough_
    extends StObject
       with DraftEditorCommand
  inline def strikethrough_ : strikethrough_ = "strikethrough".asInstanceOf[strikethrough_]
  
  @js.native
  sealed trait `transpose-characters`
    extends StObject
       with DraftEditorCommand
  inline def `transpose-characters`: `transpose-characters` = "transpose-characters".asInstanceOf[`transpose-characters`]
  
  @js.native
  sealed trait underline_
    extends StObject
       with DraftEditorCommand
  inline def underline_ : underline_ = "underline".asInstanceOf[underline_]
  
  @js.native
  sealed trait undo
    extends StObject
       with DraftEditorCommand
       with EditorChangeType
  inline def undo: undo = "undo".asInstanceOf[undo]
  
  @js.native
  sealed trait `unordered-list-item`
    extends StObject
       with CoreDraftBlockType
  inline def `unordered-list-item`: `unordered-list-item` = "unordered-list-item".asInstanceOf[`unordered-list-item`]
  
  @js.native
  sealed trait unstyled
    extends StObject
       with CoreDraftBlockType
  inline def unstyled: unstyled = "unstyled".asInstanceOf[unstyled]
}
