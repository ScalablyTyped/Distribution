package typings
package gapiDotClientDotFirestoreLib.gapiNs.clientNs.firestoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndexOperationMetadata extends js.Object {
  /**
    * True if the [google.longrunning.Operation] was cancelled. If the
    * cancellation is in progress, cancelled will be true but
    * google.longrunning.Operation.done will be false.
    */
  var cancelled: js.UndefOr[scala.Boolean] = js.undefined
  /** Progress of the existing operation, measured in number of documents. */
  var documentProgress: js.UndefOr[Progress] = js.undefined
  /**
    * The time the operation ended, either successfully or otherwise. Unset if
    * the operation is still active.
    */
  var endTime: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The index resource that this operation is acting on. For example:
    * `projects/{project_id}/databases/{database_id}/indexes/{index_id}`
    */
  var index: js.UndefOr[java.lang.String] = js.undefined
  /** The type of index operation. */
  var operationType: js.UndefOr[java.lang.String] = js.undefined
  /** The time that work began on the operation. */
  var startTime: js.UndefOr[java.lang.String] = js.undefined
}

object IndexOperationMetadata {
  @scala.inline
  def apply(
    cancelled: js.UndefOr[scala.Boolean] = js.undefined,
    documentProgress: Progress = null,
    endTime: java.lang.String = null,
    index: java.lang.String = null,
    operationType: java.lang.String = null,
    startTime: java.lang.String = null
  ): IndexOperationMetadata = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancelled)) __obj.updateDynamic("cancelled")(cancelled)
    if (documentProgress != null) __obj.updateDynamic("documentProgress")(documentProgress)
    if (endTime != null) __obj.updateDynamic("endTime")(endTime)
    if (index != null) __obj.updateDynamic("index")(index)
    if (operationType != null) __obj.updateDynamic("operationType")(operationType)
    if (startTime != null) __obj.updateDynamic("startTime")(startTime)
    __obj.asInstanceOf[IndexOperationMetadata]
  }
}

