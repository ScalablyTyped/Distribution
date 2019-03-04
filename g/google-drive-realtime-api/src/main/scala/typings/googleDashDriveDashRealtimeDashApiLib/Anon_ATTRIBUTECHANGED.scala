package typings
package googleDashDriveDashRealtimeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ATTRIBUTECHANGED extends js.Object {
  // A metadata attribute of the document changed. This is fired on changes to:
  // gapi.drive.realtime.Attribute.IS_READ_ONLY
  // Listen on the gapi.drive.realtime.Document for these changes.
  // attribute_changed
  var ATTRIBUTE_CHANGED: googleDashDriveDashRealtimeDashApiLib.googleDashDriveDashRealtimeDashApiLibStrings.attribute_changed
  // A new collaborator joined the document. Listen on the gapi.drive.realtime.Document for these changes.
  // collaborator_joined
  var COLLABORATOR_JOINED: googleDashDriveDashRealtimeDashApiLib.googleDashDriveDashRealtimeDashApiLibStrings.collaborator_joined
  // A collaborator left the document. Listen on the gapi.drive.realtime.Document for these changes.
  // collaborator_left
  var COLLABORATOR_LEFT: googleDashDriveDashRealtimeDashApiLib.googleDashDriveDashRealtimeDashApiLibStrings.collaborator_left
  // The document save state changed. Listen on the gapi.drive.realtime.Document for these changes.
  // document_save_state_changed
  var DOCUMENT_SAVE_STATE_CHANGED: googleDashDriveDashRealtimeDashApiLib.googleDashDriveDashRealtimeDashApiLibStrings.document_save_state_changed
  // A collaborative object has changed. This event wraps a specific event, and bubbles to ancestors.
  // Defaults to object_changed.
  var OBJECT_CHANGED: googleDashDriveDashRealtimeDashApiLib.googleDashDriveDashRealtimeDashApiLibStrings.object_changed
  // An index reference changed.
  // reference_shifted
  var REFERENCE_SHIFTED: googleDashDriveDashRealtimeDashApiLib.googleDashDriveDashRealtimeDashApiLibStrings.reference_shifted
  // Text has been removed from a string.
  // text_deleted
  var TEXT_DELETED: googleDashDriveDashRealtimeDashApiLib.googleDashDriveDashRealtimeDashApiLibStrings.text_deleted
  // Text has been inserted into a string.
  // text_inserted
  var TEXT_INSERTED: googleDashDriveDashRealtimeDashApiLib.googleDashDriveDashRealtimeDashApiLibStrings.text_inserted
  // The model canUndo/canRedo state changed. Listen on the gapi.drive.realtime.Model for these changes.
  // undo_redo_state_changed
  var UNDO_REDO_STATE_CHANGED: googleDashDriveDashRealtimeDashApiLib.googleDashDriveDashRealtimeDashApiLibStrings.undo_redo_state_changed
  // New values have been added to the list.
  // values_added
  var VALUES_ADDED: googleDashDriveDashRealtimeDashApiLib.googleDashDriveDashRealtimeDashApiLibStrings.values_added
  // Values have been removed from the list.
  // values_removed
  var VALUES_REMOVED: googleDashDriveDashRealtimeDashApiLib.googleDashDriveDashRealtimeDashApiLibStrings.values_removed
  // Values in a list are changed in place.
  // Defaults to values_set.
  var VALUES_SET: googleDashDriveDashRealtimeDashApiLib.googleDashDriveDashRealtimeDashApiLibStrings.values_set
  // A map or custom object value has changed. Note this could be a new value or deleted value.
  // value_changed
  var VALUE_CHANGED: googleDashDriveDashRealtimeDashApiLib.googleDashDriveDashRealtimeDashApiLibStrings.value_changed
}

object Anon_ATTRIBUTECHANGED {
  @scala.inline
  def apply(
    ATTRIBUTE_CHANGED: googleDashDriveDashRealtimeDashApiLib.googleDashDriveDashRealtimeDashApiLibStrings.attribute_changed,
    COLLABORATOR_JOINED: googleDashDriveDashRealtimeDashApiLib.googleDashDriveDashRealtimeDashApiLibStrings.collaborator_joined,
    COLLABORATOR_LEFT: googleDashDriveDashRealtimeDashApiLib.googleDashDriveDashRealtimeDashApiLibStrings.collaborator_left,
    DOCUMENT_SAVE_STATE_CHANGED: googleDashDriveDashRealtimeDashApiLib.googleDashDriveDashRealtimeDashApiLibStrings.document_save_state_changed,
    OBJECT_CHANGED: googleDashDriveDashRealtimeDashApiLib.googleDashDriveDashRealtimeDashApiLibStrings.object_changed,
    REFERENCE_SHIFTED: googleDashDriveDashRealtimeDashApiLib.googleDashDriveDashRealtimeDashApiLibStrings.reference_shifted,
    TEXT_DELETED: googleDashDriveDashRealtimeDashApiLib.googleDashDriveDashRealtimeDashApiLibStrings.text_deleted,
    TEXT_INSERTED: googleDashDriveDashRealtimeDashApiLib.googleDashDriveDashRealtimeDashApiLibStrings.text_inserted,
    UNDO_REDO_STATE_CHANGED: googleDashDriveDashRealtimeDashApiLib.googleDashDriveDashRealtimeDashApiLibStrings.undo_redo_state_changed,
    VALUES_ADDED: googleDashDriveDashRealtimeDashApiLib.googleDashDriveDashRealtimeDashApiLibStrings.values_added,
    VALUES_REMOVED: googleDashDriveDashRealtimeDashApiLib.googleDashDriveDashRealtimeDashApiLibStrings.values_removed,
    VALUES_SET: googleDashDriveDashRealtimeDashApiLib.googleDashDriveDashRealtimeDashApiLibStrings.values_set,
    VALUE_CHANGED: googleDashDriveDashRealtimeDashApiLib.googleDashDriveDashRealtimeDashApiLibStrings.value_changed
  ): Anon_ATTRIBUTECHANGED = {
    val __obj = js.Dynamic.literal(ATTRIBUTE_CHANGED = ATTRIBUTE_CHANGED, COLLABORATOR_JOINED = COLLABORATOR_JOINED, COLLABORATOR_LEFT = COLLABORATOR_LEFT, DOCUMENT_SAVE_STATE_CHANGED = DOCUMENT_SAVE_STATE_CHANGED, OBJECT_CHANGED = OBJECT_CHANGED, REFERENCE_SHIFTED = REFERENCE_SHIFTED, TEXT_DELETED = TEXT_DELETED, TEXT_INSERTED = TEXT_INSERTED, UNDO_REDO_STATE_CHANGED = UNDO_REDO_STATE_CHANGED, VALUES_ADDED = VALUES_ADDED, VALUES_REMOVED = VALUES_REMOVED, VALUES_SET = VALUES_SET, VALUE_CHANGED = VALUE_CHANGED)
  
    __obj.asInstanceOf[Anon_ATTRIBUTECHANGED]
  }
}

