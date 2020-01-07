package typings.googleapis.buildSrcApisFirestoreV1Mod.firestore_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata for google.longrunning.Operation results from
  * FirestoreAdmin.CreateIndex.
  */
@js.native
trait Schema$GoogleFirestoreAdminV1IndexOperationMetadata extends js.Object {
  /**
    * The time this operation completed. Will be unset if operation still in
    * progress.
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * The index resource that this operation is acting on. For example:
    * `projects/{project_id}/databases/{database_id}/collectionGroups/{collection_id}/indexes/{index_id}`
    */
  var index: js.UndefOr[String] = js.native
  /**
    * The progress, in bytes, of this operation.
    */
  var progressBytes: js.UndefOr[Schema$GoogleFirestoreAdminV1Progress] = js.native
  /**
    * The progress, in documents, of this operation.
    */
  var progressDocuments: js.UndefOr[Schema$GoogleFirestoreAdminV1Progress] = js.native
  /**
    * The time this operation started.
    */
  var startTime: js.UndefOr[String] = js.native
  /**
    * The state of the operation.
    */
  var state: js.UndefOr[String] = js.native
}

object Schema$GoogleFirestoreAdminV1IndexOperationMetadata {
  @scala.inline
  def apply(
    endTime: String = null,
    index: String = null,
    progressBytes: Schema$GoogleFirestoreAdminV1Progress = null,
    progressDocuments: Schema$GoogleFirestoreAdminV1Progress = null,
    startTime: String = null,
    state: String = null
  ): Schema$GoogleFirestoreAdminV1IndexOperationMetadata = {
    val __obj = js.Dynamic.literal()
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (progressBytes != null) __obj.updateDynamic("progressBytes")(progressBytes.asInstanceOf[js.Any])
    if (progressDocuments != null) __obj.updateDynamic("progressDocuments")(progressDocuments.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleFirestoreAdminV1IndexOperationMetadata]
  }
}

