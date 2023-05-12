package typings.draftJs.mod.Draft.Model

import typings.draftJs.draftJsStrings.bold_
import typings.draftJs.draftJsStrings.code_
import typings.draftJs.draftJsStrings.italic_
import typings.draftJs.draftJsStrings.strikethrough_
import typings.draftJs.draftJsStrings.underline_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Constants {
  
  /**
    * The list of [default valid block types](https://draftjs.org/docs/advanced-topics-custom-block-render-map#draft-default-block-render-map),
    * according to the [`DefaultDraftBlockRenderMap`](https://github.com/facebook/draft-js/blob/main/src/model/immutable/DefaultDraftBlockRenderMap.js)
    */
  /* Rewritten from type alias, can be one of: 
    - typings.draftJs.draftJsStrings.`header-one`
    - typings.draftJs.draftJsStrings.`header-two`
    - typings.draftJs.draftJsStrings.`header-three`
    - typings.draftJs.draftJsStrings.`header-four`
    - typings.draftJs.draftJsStrings.`header-five`
    - typings.draftJs.draftJsStrings.`header-six`
    - typings.draftJs.draftJsStrings.section
    - typings.draftJs.draftJsStrings.article
    - typings.draftJs.draftJsStrings.`unordered-list-item`
    - typings.draftJs.draftJsStrings.`ordered-list-item`
    - typings.draftJs.draftJsStrings.blockquote
    - typings.draftJs.draftJsStrings.atomic
    - typings.draftJs.draftJsStrings.`code-block`
    - typings.draftJs.draftJsStrings.unstyled
  */
  trait CoreDraftBlockType extends StObject
  object CoreDraftBlockType {
    
    inline def article: typings.draftJs.draftJsStrings.article = "article".asInstanceOf[typings.draftJs.draftJsStrings.article]
    
    inline def atomic: typings.draftJs.draftJsStrings.atomic = "atomic".asInstanceOf[typings.draftJs.draftJsStrings.atomic]
    
    inline def blockquote: typings.draftJs.draftJsStrings.blockquote = "blockquote".asInstanceOf[typings.draftJs.draftJsStrings.blockquote]
    
    inline def `code-block`: typings.draftJs.draftJsStrings.`code-block` = "code-block".asInstanceOf[typings.draftJs.draftJsStrings.`code-block`]
    
    inline def `header-five`: typings.draftJs.draftJsStrings.`header-five` = "header-five".asInstanceOf[typings.draftJs.draftJsStrings.`header-five`]
    
    inline def `header-four`: typings.draftJs.draftJsStrings.`header-four` = "header-four".asInstanceOf[typings.draftJs.draftJsStrings.`header-four`]
    
    inline def `header-one`: typings.draftJs.draftJsStrings.`header-one` = "header-one".asInstanceOf[typings.draftJs.draftJsStrings.`header-one`]
    
    inline def `header-six`: typings.draftJs.draftJsStrings.`header-six` = "header-six".asInstanceOf[typings.draftJs.draftJsStrings.`header-six`]
    
    inline def `header-three`: typings.draftJs.draftJsStrings.`header-three` = "header-three".asInstanceOf[typings.draftJs.draftJsStrings.`header-three`]
    
    inline def `header-two`: typings.draftJs.draftJsStrings.`header-two` = "header-two".asInstanceOf[typings.draftJs.draftJsStrings.`header-two`]
    
    inline def `ordered-list-item`: typings.draftJs.draftJsStrings.`ordered-list-item` = "ordered-list-item".asInstanceOf[typings.draftJs.draftJsStrings.`ordered-list-item`]
    
    inline def section: typings.draftJs.draftJsStrings.section = "section".asInstanceOf[typings.draftJs.draftJsStrings.section]
    
    inline def `unordered-list-item`: typings.draftJs.draftJsStrings.`unordered-list-item` = "unordered-list-item".asInstanceOf[typings.draftJs.draftJsStrings.`unordered-list-item`]
    
    inline def unstyled: typings.draftJs.draftJsStrings.unstyled = "unstyled".asInstanceOf[typings.draftJs.draftJsStrings.unstyled]
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
    
    inline def external: typings.draftJs.draftJsStrings.external = "external".asInstanceOf[typings.draftJs.draftJsStrings.external]
    
    inline def internal: typings.draftJs.draftJsStrings.internal = "internal".asInstanceOf[typings.draftJs.draftJsStrings.internal]
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
    
    inline def backspace: typings.draftJs.draftJsStrings.backspace = "backspace".asInstanceOf[typings.draftJs.draftJsStrings.backspace]
    
    inline def `backspace-to-start-of-line`: typings.draftJs.draftJsStrings.`backspace-to-start-of-line` = "backspace-to-start-of-line".asInstanceOf[typings.draftJs.draftJsStrings.`backspace-to-start-of-line`]
    
    inline def `backspace-word`: typings.draftJs.draftJsStrings.`backspace-word` = "backspace-word".asInstanceOf[typings.draftJs.draftJsStrings.`backspace-word`]
    
    inline def bold: bold_ = "bold".asInstanceOf[bold_]
    
    inline def code: code_ = "code".asInstanceOf[code_]
    
    inline def delete: typings.draftJs.draftJsStrings.delete = "delete".asInstanceOf[typings.draftJs.draftJsStrings.delete]
    
    inline def `delete-word`: typings.draftJs.draftJsStrings.`delete-word` = "delete-word".asInstanceOf[typings.draftJs.draftJsStrings.`delete-word`]
    
    inline def italic: italic_ = "italic".asInstanceOf[italic_]
    
    inline def `move-selection-to-end-of-block`: typings.draftJs.draftJsStrings.`move-selection-to-end-of-block` = "move-selection-to-end-of-block".asInstanceOf[typings.draftJs.draftJsStrings.`move-selection-to-end-of-block`]
    
    inline def `move-selection-to-start-of-block`: typings.draftJs.draftJsStrings.`move-selection-to-start-of-block` = "move-selection-to-start-of-block".asInstanceOf[typings.draftJs.draftJsStrings.`move-selection-to-start-of-block`]
    
    inline def redo: typings.draftJs.draftJsStrings.redo = "redo".asInstanceOf[typings.draftJs.draftJsStrings.redo]
    
    inline def `secondary-cut`: typings.draftJs.draftJsStrings.`secondary-cut` = "secondary-cut".asInstanceOf[typings.draftJs.draftJsStrings.`secondary-cut`]
    
    inline def `secondary-paste`: typings.draftJs.draftJsStrings.`secondary-paste` = "secondary-paste".asInstanceOf[typings.draftJs.draftJsStrings.`secondary-paste`]
    
    inline def `split-block`: typings.draftJs.draftJsStrings.`split-block` = "split-block".asInstanceOf[typings.draftJs.draftJsStrings.`split-block`]
    
    inline def strikethrough: strikethrough_ = "strikethrough".asInstanceOf[strikethrough_]
    
    inline def `transpose-characters`: typings.draftJs.draftJsStrings.`transpose-characters` = "transpose-characters".asInstanceOf[typings.draftJs.draftJsStrings.`transpose-characters`]
    
    inline def underline: underline_ = "underline".asInstanceOf[underline_]
    
    inline def undo: typings.draftJs.draftJsStrings.undo = "undo".asInstanceOf[typings.draftJs.draftJsStrings.undo]
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
    
    inline def IMMUTABLE: typings.draftJs.draftJsStrings.IMMUTABLE = "IMMUTABLE".asInstanceOf[typings.draftJs.draftJsStrings.IMMUTABLE]
    
    inline def MUTABLE: typings.draftJs.draftJsStrings.MUTABLE = "MUTABLE".asInstanceOf[typings.draftJs.draftJsStrings.MUTABLE]
    
    inline def SEGMENTED: typings.draftJs.draftJsStrings.SEGMENTED = "SEGMENTED".asInstanceOf[typings.draftJs.draftJsStrings.SEGMENTED]
  }
  
  /**
    * Possible entity types, like 'LINK', 'IMAGE', or custom ones.
    */
  type DraftEntityType = String
  
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
    
    inline def handled: typings.draftJs.draftJsStrings.handled = "handled".asInstanceOf[typings.draftJs.draftJsStrings.handled]
    
    inline def `not-handled`: typings.draftJs.draftJsStrings.`not-handled` = "not-handled".asInstanceOf[typings.draftJs.draftJsStrings.`not-handled`]
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
    
    inline def BOLD: typings.draftJs.draftJsStrings.BOLD = "BOLD".asInstanceOf[typings.draftJs.draftJsStrings.BOLD]
    
    inline def CODE: typings.draftJs.draftJsStrings.CODE = "CODE".asInstanceOf[typings.draftJs.draftJsStrings.CODE]
    
    inline def ITALIC: typings.draftJs.draftJsStrings.ITALIC = "ITALIC".asInstanceOf[typings.draftJs.draftJsStrings.ITALIC]
    
    inline def STRIKETHROUGH: typings.draftJs.draftJsStrings.STRIKETHROUGH = "STRIKETHROUGH".asInstanceOf[typings.draftJs.draftJsStrings.STRIKETHROUGH]
    
    inline def UNDERLINE: typings.draftJs.draftJsStrings.UNDERLINE = "UNDERLINE".asInstanceOf[typings.draftJs.draftJsStrings.UNDERLINE]
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
    
    inline def after: typings.draftJs.draftJsStrings.after = "after".asInstanceOf[typings.draftJs.draftJsStrings.after]
    
    inline def before: typings.draftJs.draftJsStrings.before = "before".asInstanceOf[typings.draftJs.draftJsStrings.before]
    
    inline def replace: typings.draftJs.draftJsStrings.replace = "replace".asInstanceOf[typings.draftJs.draftJsStrings.replace]
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
    
    inline def backward: typings.draftJs.draftJsStrings.backward = "backward".asInstanceOf[typings.draftJs.draftJsStrings.backward]
    
    inline def forward: typings.draftJs.draftJsStrings.forward = "forward".asInstanceOf[typings.draftJs.draftJsStrings.forward]
  }
}
