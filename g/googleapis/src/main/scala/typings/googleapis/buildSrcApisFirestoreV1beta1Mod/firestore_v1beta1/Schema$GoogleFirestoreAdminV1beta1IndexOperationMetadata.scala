package typings.googleapis.buildSrcApisFirestoreV1beta1Mod.firestore_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata for index operations. This metadata populates the metadata field
  * of google.longrunning.Operation.
  */
@js.native
trait Schema$GoogleFirestoreAdminV1beta1IndexOperationMetadata extends js.Object {
  /**
    * True if the [google.longrunning.Operation] was cancelled. If the
    * cancellation is in progress, cancelled will be true but
    * google.longrunning.Operation.done will be false.
    */
  var cancelled: js.UndefOr[Boolean] = js.native
  /**
    * Progress of the existing operation, measured in number of documents.
    */
  var documentProgress: js.UndefOr[Schema$GoogleFirestoreAdminV1beta1Progress] = js.native
  /**
    * The time the operation ended, either successfully or otherwise. Unset if
    * the operation is still active.
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * The index resource that this operation is acting on. For example:
    * `projects/{project_id}/databases/{database_id}/indexes/{index_id}`
    */
  var index: js.UndefOr[String] = js.native
  /**
    * The type of index operation.
    */
  var operationType: js.UndefOr[String] = js.native
  /**
    * The time that work began on the operation.
    */
  var startTime: js.UndefOr[String] = js.native
}

object Schema$GoogleFirestoreAdminV1beta1IndexOperationMetadata {
  @scala.inline
  def apply(
    cancelled: js.UndefOr[Boolean] = js.undefined,
    documentProgress: Schema$GoogleFirestoreAdminV1beta1Progress = null,
    endTime: String = null,
    index: String = null,
    operationType: String = null,
    startTime: String = null
  ): Schema$GoogleFirestoreAdminV1beta1IndexOperationMetadata = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancelled)) __obj.updateDynamic("cancelled")(cancelled.asInstanceOf[js.Any])
    if (documentProgress != null) __obj.updateDynamic("documentProgress")(documentProgress.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (operationType != null) __obj.updateDynamic("operationType")(operationType.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleFirestoreAdminV1beta1IndexOperationMetadata]
  }
}

