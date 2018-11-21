package typings
package draftDashJsLib.draftDashJsMod.DraftNs.ModelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ConstantsNs {
  /**
               * Default entity types.
               */
  type ComposedEntityType = draftDashJsLib.draftDashJsLibStrings.LINK | draftDashJsLib.draftDashJsLibStrings.TOKEN | draftDashJsLib.draftDashJsLibStrings.PHOTO | draftDashJsLib.draftDashJsLibStrings.IMAGE
  /**
               * The list of default valid block types.
               */
  type DraftBlockType = draftDashJsLib.draftDashJsLibStrings.unstyled | draftDashJsLib.draftDashJsLibStrings.paragraph | draftDashJsLib.draftDashJsLibStrings.`header-one` | draftDashJsLib.draftDashJsLibStrings.`header-two` | draftDashJsLib.draftDashJsLibStrings.`header-three` | draftDashJsLib.draftDashJsLibStrings.`header-four` | draftDashJsLib.draftDashJsLibStrings.`header-five` | draftDashJsLib.draftDashJsLibStrings.`header-six` | draftDashJsLib.draftDashJsLibStrings.`unordered-list-item` | draftDashJsLib.draftDashJsLibStrings.`ordered-list-item` | draftDashJsLib.draftDashJsLibStrings.blockquote | draftDashJsLib.draftDashJsLibStrings.`code-block` | draftDashJsLib.draftDashJsLibStrings.atomic
  /**
               * A type that allows us to avoid passing boolean arguments
               * around to indicate whether a drag type is internal or external.
               */
  type DraftDragType = draftDashJsLib.draftDashJsLibStrings.internal | draftDashJsLib.draftDashJsLibStrings.external
  /**
               * A set of editor commands that may be invoked by keyboard commands or UI
               * controls. These commands should map to operations that modify content or
               * selection state and update the editor state accordingly.
               */
  type DraftEditorCommand = draftDashJsLib.draftDashJsLibStrings.undo | draftDashJsLib.draftDashJsLibStrings.redo | draftDashJsLib.draftDashJsLibStrings.delete | draftDashJsLib.draftDashJsLibStrings.`delete-word` | draftDashJsLib.draftDashJsLibStrings.backspace | draftDashJsLib.draftDashJsLibStrings.`backspace-word` | draftDashJsLib.draftDashJsLibStrings.`backspace-to-start-of-line` | draftDashJsLib.draftDashJsLibStrings.bold | draftDashJsLib.draftDashJsLibStrings.code | draftDashJsLib.draftDashJsLibStrings.italic | draftDashJsLib.draftDashJsLibStrings.strikethrough | draftDashJsLib.draftDashJsLibStrings.underline | draftDashJsLib.draftDashJsLibStrings.`split-block` | draftDashJsLib.draftDashJsLibStrings.`transpose-characters` | draftDashJsLib.draftDashJsLibStrings.`move-selection-to-start-of-block` | draftDashJsLib.draftDashJsLibStrings.`move-selection-to-end-of-block` | draftDashJsLib.draftDashJsLibStrings.`secondary-cut` | draftDashJsLib.draftDashJsLibStrings.`secondary-paste`
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
  type DraftEntityMutability = draftDashJsLib.draftDashJsLibStrings.MUTABLE | draftDashJsLib.draftDashJsLibStrings.IMMUTABLE | draftDashJsLib.draftDashJsLibStrings.SEGMENTED
  /**
               * Possible entity types.
               */
  type DraftEntityType = java.lang.String | ComposedEntityType
  /**
               * A type that allows us to avoid returning boolean values
               * to indicate whether an event was handled or not.
               */
  type DraftHandleValue = draftDashJsLib.draftDashJsLibStrings.handled | draftDashJsLib.draftDashJsLibStrings.`not-handled`
  /**
               * Valid inline styles.
               */
  type DraftInlineStyleType = draftDashJsLib.draftDashJsLibStrings.BOLD | draftDashJsLib.draftDashJsLibStrings.CODE | draftDashJsLib.draftDashJsLibStrings.ITALIC | draftDashJsLib.draftDashJsLibStrings.STRIKETHROUGH | draftDashJsLib.draftDashJsLibStrings.UNDERLINE
  /**
               * A type that defines if an fragment shall be inserted before or after
               * another fragment or if the selected fragment shall be replaced
               */
  type DraftInsertionType = draftDashJsLib.draftDashJsLibStrings.replace | draftDashJsLib.draftDashJsLibStrings.before | draftDashJsLib.draftDashJsLibStrings.after
  /**
               * A type that allows us to avoid passing boolean arguments
               * around to indicate whether a deletion is forward or backward.
               */
  type DraftRemovalDirection = draftDashJsLib.draftDashJsLibStrings.backward | draftDashJsLib.draftDashJsLibStrings.forward
}
