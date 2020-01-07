package typings.googleapis.buildSrcApisFirestoreV1beta1Mod.firestore_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata for ExportDocuments operations.
  */
@js.native
trait Schema$GoogleFirestoreAdminV1beta1ExportDocumentsMetadata extends js.Object {
  /**
    * Which collection ids are being exported.
    */
  var collectionIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * The time the operation ended, either successfully or otherwise. Unset if
    * the operation is still active.
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * The state of the export operation.
    */
  var operationState: js.UndefOr[String] = js.native
  /**
    * Where the entities are being exported to.
    */
  var outputUriPrefix: js.UndefOr[String] = js.native
  /**
    * An estimate of the number of bytes processed.
    */
  var progressBytes: js.UndefOr[Schema$GoogleFirestoreAdminV1beta1Progress] = js.native
  /**
    * An estimate of the number of documents processed.
    */
  var progressDocuments: js.UndefOr[Schema$GoogleFirestoreAdminV1beta1Progress] = js.native
  /**
    * The time that work began on the operation.
    */
  var startTime: js.UndefOr[String] = js.native
}

object Schema$GoogleFirestoreAdminV1beta1ExportDocumentsMetadata {
  @scala.inline
  def apply(
    collectionIds: js.Array[String] = null,
    endTime: String = null,
    operationState: String = null,
    outputUriPrefix: String = null,
    progressBytes: Schema$GoogleFirestoreAdminV1beta1Progress = null,
    progressDocuments: Schema$GoogleFirestoreAdminV1beta1Progress = null,
    startTime: String = null
  ): Schema$GoogleFirestoreAdminV1beta1ExportDocumentsMetadata = {
    val __obj = js.Dynamic.literal()
    if (collectionIds != null) __obj.updateDynamic("collectionIds")(collectionIds.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (operationState != null) __obj.updateDynamic("operationState")(operationState.asInstanceOf[js.Any])
    if (outputUriPrefix != null) __obj.updateDynamic("outputUriPrefix")(outputUriPrefix.asInstanceOf[js.Any])
    if (progressBytes != null) __obj.updateDynamic("progressBytes")(progressBytes.asInstanceOf[js.Any])
    if (progressDocuments != null) __obj.updateDynamic("progressDocuments")(progressDocuments.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleFirestoreAdminV1beta1ExportDocumentsMetadata]
  }
}

