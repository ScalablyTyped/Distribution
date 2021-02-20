package typings.draftJs.mod.Draft.Model

import typings.draftJs.draftJsStrings.bold_
import typings.draftJs.draftJsStrings.code_
import typings.draftJs.draftJsStrings.italic_
import typings.draftJs.draftJsStrings.strikethrough_
import typings.draftJs.draftJsStrings.underline_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Constants {
  
  /**
    * Default entity types.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.draftJs.draftJsStrings.LINK
    - typings.draftJs.draftJsStrings.TOKEN
    - typings.draftJs.draftJsStrings.PHOTO
    - typings.draftJs.draftJsStrings.IMAGE
  */
  trait ComposedEntityType extends StObject
  object ComposedEntityType {
    
    @scala.inline
    def IMAGE: typings.draftJs.draftJsStrings.IMAGE = "IMAGE".asInstanceOf[typings.draftJs.draftJsStrings.IMAGE]
    
    @scala.inline
    def LINK: typings.draftJs.draftJsStrings.LINK = "LINK".asInstanceOf[typings.draftJs.draftJsStrings.LINK]
    
    @scala.inline
    def PHOTO: typings.draftJs.draftJsStrings.PHOTO = "PHOTO".asInstanceOf[typings.draftJs.draftJsStrings.PHOTO]
    
    @scala.inline
    def TOKEN: typings.draftJs.draftJsStrings.TOKEN = "TOKEN".asInstanceOf[typings.draftJs.draftJsStrings.TOKEN]
  }
  
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
  trait CoreDraftBlockType extends StObject
  object CoreDraftBlockType {
    
    @scala.inline
    def atomic: typings.draftJs.draftJsStrings.atomic = "atomic".asInstanceOf[typings.draftJs.draftJsStrings.atomic]
    
    @scala.inline
    def blockquote: typings.draftJs.draftJsStrings.blockquote = "blockquote".asInstanceOf[typings.draftJs.draftJsStrings.blockquote]
    
    @scala.inline
    def `code-block`: typings.draftJs.draftJsStrings.`code-block` = "code-block".asInstanceOf[typings.draftJs.draftJsStrings.`code-block`]
    
    @scala.inline
    def `header-five`: typings.draftJs.draftJsStrings.`header-five` = "header-five".asInstanceOf[typings.draftJs.draftJsStrings.`header-five`]
    
    @scala.inline
    def `header-four`: typings.draftJs.draftJsStrings.`header-four` = "header-four".asInstanceOf[typings.draftJs.draftJsStrings.`header-four`]
    
    @scala.inline
    def `header-one`: typings.draftJs.draftJsStrings.`header-one` = "header-one".asInstanceOf[typings.draftJs.draftJsStrings.`header-one`]
    
    @scala.inline
    def `header-six`: typings.draftJs.draftJsStrings.`header-six` = "header-six".asInstanceOf[typings.draftJs.draftJsStrings.`header-six`]
    
    @scala.inline
    def `header-three`: typings.draftJs.draftJsStrings.`header-three` = "header-three".asInstanceOf[typings.draftJs.draftJsStrings.`header-three`]
    
    @scala.inline
    def `header-two`: typings.draftJs.draftJsStrings.`header-two` = "header-two".asInstanceOf[typings.draftJs.draftJsStrings.`header-two`]
    
    @scala.inline
    def `ordered-list-item`: typings.draftJs.draftJsStrings.`ordered-list-item` = "ordered-list-item".asInstanceOf[typings.draftJs.draftJsStrings.`ordered-list-item`]
    
    @scala.inline
    def paragraph: typings.draftJs.draftJsStrings.paragraph = "paragraph".asInstanceOf[typings.draftJs.draftJsStrings.paragraph]
    
    @scala.inline
    def `unordered-list-item`: typings.draftJs.draftJsStrings.`unordered-list-item` = "unordered-list-item".asInstanceOf[typings.draftJs.draftJsStrings.`unordered-list-item`]
    
    @scala.inline
    def unstyled: typings.draftJs.draftJsStrings.unstyled = "unstyled".asInstanceOf[typings.draftJs.draftJsStrings.unstyled]
  }
  
  type CustomBlockType = String
  
  type DraftBlockType = CoreDraftBlockType | CustomBlockType
  
  /**
    * A type that allows us to avoid passing boolean arguments
    * around to indicate whether a drag type is internal or external.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.draftJs.draftJsStrings.internal
    - typings.draftJs.draftJsStrings.external
  */
  trait DraftDragType extends StObject
  object DraftDragType {
    
    @scala.inline
    def external: typings.draftJs.draftJsStrings.external = "external".asInstanceOf[typings.draftJs.draftJsStrings.external]
    
    @scala.inline
    def internal: typings.draftJs.draftJsStrings.internal = "internal".asInstanceOf[typings.draftJs.draftJsStrings.internal]
  }
  
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
  trait DraftEditorCommand extends StObject
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
  
  /**
    * Possible "mutability" options for an entity. This refers to the behavior
    * that should occur when inserting or removing characters in a text range
    * with an entity applied to it.
    *
    * `MUTABLE`:
    *   The text range can be modified freely. Generally used in cases where
    *   the text content and the entity do not necessarily have a direct
    *   relationship. For instance, the text and URI for a link may be completely
    *   different. The user is allowed to edit the text as needed, and the entity
    *   is preserved and applied to any characters added within the range.
    *
    * `IMMUTABLE`:
    *   Not to be confused with immutable data structures used to represent the
    *   state of the editor. Immutable entity ranges cannot be modified in any
    *   way. Adding characters within the range will remove the entity from the
    *   entire range. Deleting characters will delete the entire range. Example:
    *   Facebook Page mentions.
    *
    * `SEGMENTED`:
    *   Segmented entities allow the removal of partial ranges of text, as
    *   separated by a delimiter. Adding characters wihin the range will remove
    *   the entity from the entire range. Deleting characters within a segmented
    *   entity will delete only the segments affected by the deletion. Example:
    *   Facebook User mentions.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.draftJs.draftJsStrings.MUTABLE
    - typings.draftJs.draftJsStrings.IMMUTABLE
    - typings.draftJs.draftJsStrings.SEGMENTED
  */
  trait DraftEntityMutability extends StObject
  object DraftEntityMutability {
    
    @scala.inline
    def IMMUTABLE: typings.draftJs.draftJsStrings.IMMUTABLE = "IMMUTABLE".asInstanceOf[typings.draftJs.draftJsStrings.IMMUTABLE]
    
    @scala.inline
    def MUTABLE: typings.draftJs.draftJsStrings.MUTABLE = "MUTABLE".asInstanceOf[typings.draftJs.draftJsStrings.MUTABLE]
    
    @scala.inline
    def SEGMENTED: typings.draftJs.draftJsStrings.SEGMENTED = "SEGMENTED".asInstanceOf[typings.draftJs.draftJsStrings.SEGMENTED]
  }
  
  /**
    * Possible entity types.
    */
  type DraftEntityType = String | ComposedEntityType
  
  /**
    * A type that allows us to avoid returning boolean values
    * to indicate whether an event was handled or not.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.draftJs.draftJsStrings.handled
    - typings.draftJs.draftJsStrings.`not-handled`
  */
  trait DraftHandleValue extends StObject
  object DraftHandleValue {
    
    @scala.inline
    def handled: typings.draftJs.draftJsStrings.handled = "handled".asInstanceOf[typings.draftJs.draftJsStrings.handled]
    
    @scala.inline
    def `not-handled`: typings.draftJs.draftJsStrings.`not-handled` = "not-handled".asInstanceOf[typings.draftJs.draftJsStrings.`not-handled`]
  }
  
  /**
    * Valid inline styles.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.draftJs.draftJsStrings.BOLD
    - typings.draftJs.draftJsStrings.CODE
    - typings.draftJs.draftJsStrings.ITALIC
    - typings.draftJs.draftJsStrings.STRIKETHROUGH
    - typings.draftJs.draftJsStrings.UNDERLINE
  */
  trait DraftInlineStyleType extends StObject
  object DraftInlineStyleType {
    
    @scala.inline
    def BOLD: typings.draftJs.draftJsStrings.BOLD = "BOLD".asInstanceOf[typings.draftJs.draftJsStrings.BOLD]
    
    @scala.inline
    def CODE: typings.draftJs.draftJsStrings.CODE = "CODE".asInstanceOf[typings.draftJs.draftJsStrings.CODE]
    
    @scala.inline
    def ITALIC: typings.draftJs.draftJsStrings.ITALIC = "ITALIC".asInstanceOf[typings.draftJs.draftJsStrings.ITALIC]
    
    @scala.inline
    def STRIKETHROUGH: typings.draftJs.draftJsStrings.STRIKETHROUGH = "STRIKETHROUGH".asInstanceOf[typings.draftJs.draftJsStrings.STRIKETHROUGH]
    
    @scala.inline
    def UNDERLINE: typings.draftJs.draftJsStrings.UNDERLINE = "UNDERLINE".asInstanceOf[typings.draftJs.draftJsStrings.UNDERLINE]
  }
  
  /**
    * A type that defines if an fragment shall be inserted before or after
    * another fragment or if the selected fragment shall be replaced
    */
  /* Rewritten from type alias, can be one of: 
    - typings.draftJs.draftJsStrings.replace
    - typings.draftJs.draftJsStrings.before
    - typings.draftJs.draftJsStrings.after
  */
  trait DraftInsertionType extends StObject
  object DraftInsertionType {
    
    @scala.inline
    def after: typings.draftJs.draftJsStrings.after = "after".asInstanceOf[typings.draftJs.draftJsStrings.after]
    
    @scala.inline
    def before: typings.draftJs.draftJsStrings.before = "before".asInstanceOf[typings.draftJs.draftJsStrings.before]
    
    @scala.inline
    def replace: typings.draftJs.draftJsStrings.replace = "replace".asInstanceOf[typings.draftJs.draftJsStrings.replace]
  }
  
  /**
    * A type that allows us to avoid passing boolean arguments
    * around to indicate whether a deletion is forward or backward.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.draftJs.draftJsStrings.backward
    - typings.draftJs.draftJsStrings.forward
  */
  trait DraftRemovalDirection extends StObject
  object DraftRemovalDirection {
    
    @scala.inline
    def backward: typings.draftJs.draftJsStrings.backward = "backward".asInstanceOf[typings.draftJs.draftJsStrings.backward]
    
    @scala.inline
    def forward: typings.draftJs.draftJsStrings.forward = "forward".asInstanceOf[typings.draftJs.draftJsStrings.forward]
  }
}
