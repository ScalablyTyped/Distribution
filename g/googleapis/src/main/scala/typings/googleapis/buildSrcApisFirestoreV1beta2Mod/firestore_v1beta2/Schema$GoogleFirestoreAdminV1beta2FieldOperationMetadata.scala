package typings.googleapis.buildSrcApisFirestoreV1beta2Mod.firestore_v1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata for google.longrunning.Operation results from
  * FirestoreAdmin.UpdateField.
  */
@js.native
trait Schema$GoogleFirestoreAdminV1beta2FieldOperationMetadata extends js.Object {
  /**
    * The progress, in bytes, of this operation.
    */
  var bytesProgress: js.UndefOr[Schema$GoogleFirestoreAdminV1beta2Progress] = js.native
  /**
    * The progress, in documents, of this operation.
    */
  var documentProgress: js.UndefOr[Schema$GoogleFirestoreAdminV1beta2Progress] = js.native
  /**
    * The time this operation completed. Will be unset if operation still in
    * progress.
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * The field resource that this operation is acting on. For example:
    * `projects/{project_id}/databases/{database_id}/collectionGroups/{collection_id}/fields/{field_path}`
    */
  var field: js.UndefOr[String] = js.native
  /**
    * A list of IndexConfigDelta, which describe the intent of this operation.
    */
  var indexConfigDeltas: js.UndefOr[js.Array[Schema$GoogleFirestoreAdminV1beta2IndexConfigDelta]] = js.native
  /**
    * The time this operation started.
    */
  var startTime: js.UndefOr[String] = js.native
  /**
    * The state of the operation.
    */
  var state: js.UndefOr[String] = js.native
}

object Schema$GoogleFirestoreAdminV1beta2FieldOperationMetadata {
  @scala.inline
  def apply(
    bytesProgress: Schema$GoogleFirestoreAdminV1beta2Progress = null,
    documentProgress: Schema$GoogleFirestoreAdminV1beta2Progress = null,
    endTime: String = null,
    field: String = null,
    indexConfigDeltas: js.Array[Schema$GoogleFirestoreAdminV1beta2IndexConfigDelta] = null,
    startTime: String = null,
    state: String = null
  ): Schema$GoogleFirestoreAdminV1beta2FieldOperationMetadata = {
    val __obj = js.Dynamic.literal()
    if (bytesProgress != null) __obj.updateDynamic("bytesProgress")(bytesProgress.asInstanceOf[js.Any])
    if (documentProgress != null) __obj.updateDynamic("documentProgress")(documentProgress.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (indexConfigDeltas != null) __obj.updateDynamic("indexConfigDeltas")(indexConfigDeltas.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleFirestoreAdminV1beta2FieldOperationMetadata]
  }
}

