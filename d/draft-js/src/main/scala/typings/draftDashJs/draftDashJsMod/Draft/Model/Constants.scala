package typings.draftDashJs.draftDashJsMod.Draft.Model

import typings.draftDashJs.draftDashJsMod.Draft.Model.Constants.ComposedEntityType
import typings.draftDashJs.draftDashJsMod.Draft.Model.Constants.CoreDraftBlockType
import typings.draftDashJs.draftDashJsMod.Draft.Model.Constants.CustomBlockType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("draft-js", "Draft.Model.Constants")
@js.native
object Constants extends js.Object {
  /**
    * Default entity types.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.draftDashJs.draftDashJsStrings.LINK
    - typings.draftDashJs.draftDashJsStrings.TOKEN
    - typings.draftDashJs.draftDashJsStrings.PHOTO
    - typings.draftDashJs.draftDashJsStrings.IMAGE
  */
  trait ComposedEntityType extends js.Object
  
  /**
    * The list of default valid block types.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.draftDashJs.draftDashJsStrings.unstyled
    - typings.draftDashJs.draftDashJsStrings.paragraph
    - typings.draftDashJs.draftDashJsStrings.`header-one`
    - typings.draftDashJs.draftDashJsStrings.`header-two`
    - typings.draftDashJs.draftDashJsStrings.`header-three`
    - typings.draftDashJs.draftDashJsStrings.`header-four`
    - typings.draftDashJs.draftDashJsStrings.`header-five`
    - typings.draftDashJs.draftDashJsStrings.`header-six`
    - typings.draftDashJs.draftDashJsStrings.`unordered-list-item`
    - typings.draftDashJs.draftDashJsStrings.`ordered-list-item`
    - typings.draftDashJs.draftDashJsStrings.blockquote
    - typings.draftDashJs.draftDashJsStrings.`code-block`
    - typings.draftDashJs.draftDashJsStrings.atomic
  */
  trait CoreDraftBlockType extends js.Object
  
  /**
    * A type that allows us to avoid passing boolean arguments
    * around to indicate whether a drag type is internal or external.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.draftDashJs.draftDashJsStrings.internal
    - typings.draftDashJs.draftDashJsStrings.external
  */
  trait DraftDragType extends js.Object
  
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
    - typings.draftDashJs.draftDashJsStrings.bold
    - typings.draftDashJs.draftDashJsStrings.code
    - typings.draftDashJs.draftDashJsStrings.italic
    - typings.draftDashJs.draftDashJsStrings.strikethrough
    - typings.draftDashJs.draftDashJsStrings.underline
    - typings.draftDashJs.draftDashJsStrings.`split-block`
    - typings.draftDashJs.draftDashJsStrings.`transpose-characters`
    - typings.draftDashJs.draftDashJsStrings.`move-selection-to-start-of-block`
    - typings.draftDashJs.draftDashJsStrings.`move-selection-to-end-of-block`
    - typings.draftDashJs.draftDashJsStrings.`secondary-cut`
    - typings.draftDashJs.draftDashJsStrings.`secondary-paste`
  */
  trait DraftEditorCommand extends js.Object
  
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
    - typings.draftDashJs.draftDashJsStrings.MUTABLE
    - typings.draftDashJs.draftDashJsStrings.IMMUTABLE
    - typings.draftDashJs.draftDashJsStrings.SEGMENTED
  */
  trait DraftEntityMutability extends js.Object
  
  /**
    * A type that allows us to avoid returning boolean values
    * to indicate whether an event was handled or not.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.draftDashJs.draftDashJsStrings.handled
    - typings.draftDashJs.draftDashJsStrings.`not-handled`
  */
  trait DraftHandleValue extends js.Object
  
  /**
    * Valid inline styles.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.draftDashJs.draftDashJsStrings.BOLD
    - typings.draftDashJs.draftDashJsStrings.CODE
    - typings.draftDashJs.draftDashJsStrings.ITALIC
    - typings.draftDashJs.draftDashJsStrings.STRIKETHROUGH
    - typings.draftDashJs.draftDashJsStrings.UNDERLINE
  */
  trait DraftInlineStyleType extends js.Object
  
  /**
    * A type that defines if an fragment shall be inserted before or after
    * another fragment or if the selected fragment shall be replaced
    */
  /* Rewritten from type alias, can be one of: 
    - typings.draftDashJs.draftDashJsStrings.replace
    - typings.draftDashJs.draftDashJsStrings.before
    - typings.draftDashJs.draftDashJsStrings.after
  */
  trait DraftInsertionType extends js.Object
  
  /**
    * A type that allows us to avoid passing boolean arguments
    * around to indicate whether a deletion is forward or backward.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.draftDashJs.draftDashJsStrings.backward
    - typings.draftDashJs.draftDashJsStrings.forward
  */
  trait DraftRemovalDirection extends js.Object
  
  type CustomBlockType = String
  type DraftBlockType = CoreDraftBlockType | CustomBlockType
  /**
    * Possible entity types.
    */
  type DraftEntityType = String | ComposedEntityType
}

