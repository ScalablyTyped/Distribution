package typings.googleapis.buildSrcApisFirestoreV1beta1Mod.firestore_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A write on a document.
  */
@js.native
trait Schema$Write extends js.Object {
  /**
    * An optional precondition on the document.  The write will fail if this is
    * set and not met by the target document.
    */
  var currentDocument: js.UndefOr[Schema$Precondition] = js.native
  /**
    * A document name to delete. In the format:
    * `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
    */
  var delete: js.UndefOr[String] = js.native
  /**
    * Applies a tranformation to a document. At most one `transform` per
    * document is allowed in a given request. An `update` cannot follow a
    * `transform` on the same document in a given request.
    */
  var transform: js.UndefOr[Schema$DocumentTransform] = js.native
  /**
    * A document to write.
    */
  var update: js.UndefOr[Schema$Document] = js.native
  /**
    * The fields to update in this write.  This field can be set only when the
    * operation is `update`. If the mask is not set for an `update` and the
    * document exists, any existing data will be overwritten. If the mask is
    * set and the document on the server has fields not covered by the mask,
    * they are left unchanged. Fields referenced in the mask, but not present
    * in the input document, are deleted from the document on the server. The
    * field paths in this mask must not contain a reserved field name.
    */
  var updateMask: js.UndefOr[Schema$DocumentMask] = js.native
}

object Schema$Write {
  @scala.inline
  def apply(
    currentDocument: Schema$Precondition = null,
    delete: String = null,
    transform: Schema$DocumentTransform = null,
    update: Schema$Document = null,
    updateMask: Schema$DocumentMask = null
  ): Schema$Write = {
    val __obj = js.Dynamic.literal()
    if (currentDocument != null) __obj.updateDynamic("currentDocument")(currentDocument.asInstanceOf[js.Any])
    if (delete != null) __obj.updateDynamic("delete")(delete.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(update.asInstanceOf[js.Any])
    if (updateMask != null) __obj.updateDynamic("updateMask")(updateMask.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Write]
  }
}

