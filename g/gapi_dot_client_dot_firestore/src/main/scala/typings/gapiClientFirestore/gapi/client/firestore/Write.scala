package typings.gapiClientFirestore.gapi.client.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Write extends js.Object {
  /**
    * An optional precondition on the document.
    *
    * The write will fail if this is set and not met by the target document.
    */
  var currentDocument: js.UndefOr[Precondition] = js.undefined
  /**
    * A document name to delete. In the format:
    * `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
    */
  var delete: js.UndefOr[String] = js.undefined
  /**
    * Applies a tranformation to a document.
    * At most one `transform` per document is allowed in a given request.
    * An `update` cannot follow a `transform` on the same document in a given
    * request.
    */
  var transform: js.UndefOr[DocumentTransform] = js.undefined
  /** A document to write. */
  var update: js.UndefOr[Document] = js.undefined
  /**
    * The fields to update in this write.
    *
    * This field can be set only when the operation is `update`.
    * None of the field paths in the mask may contain a reserved name.
    * If the document exists on the server and has fields not referenced in the
    * mask, they are left unchanged.
    * Fields referenced in the mask, but not present in the input document, are
    * deleted from the document on the server.
    * The field paths in this mask must not contain a reserved field name.
    */
  var updateMask: js.UndefOr[DocumentMask] = js.undefined
}

object Write {
  @scala.inline
  def apply(
    currentDocument: Precondition = null,
    delete: String = null,
    transform: DocumentTransform = null,
    update: Document = null,
    updateMask: DocumentMask = null
  ): Write = {
    val __obj = js.Dynamic.literal()
    if (currentDocument != null) __obj.updateDynamic("currentDocument")(currentDocument.asInstanceOf[js.Any])
    if (delete != null) __obj.updateDynamic("delete")(delete.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(update.asInstanceOf[js.Any])
    if (updateMask != null) __obj.updateDynamic("updateMask")(updateMask.asInstanceOf[js.Any])
    __obj.asInstanceOf[Write]
  }
}

