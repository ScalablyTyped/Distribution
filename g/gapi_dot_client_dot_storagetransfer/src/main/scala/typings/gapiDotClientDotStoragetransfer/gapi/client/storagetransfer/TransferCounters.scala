package typings.gapiDotClientDotStoragetransfer.gapi.client.storagetransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferCounters extends js.Object {
  /** Bytes that are copied to the data sink. */
  var bytesCopiedToSink: js.UndefOr[String] = js.undefined
  /** Bytes that are deleted from the data sink. */
  var bytesDeletedFromSink: js.UndefOr[String] = js.undefined
  /** Bytes that are deleted from the data source. */
  var bytesDeletedFromSource: js.UndefOr[String] = js.undefined
  /** Bytes that failed to be deleted from the data sink. */
  var bytesFailedToDeleteFromSink: js.UndefOr[String] = js.undefined
  /**
    * Bytes found in the data source that are scheduled to be transferred,
    * which will be copied, excluded based on conditions, or skipped due to
    * failures.
    */
  var bytesFoundFromSource: js.UndefOr[String] = js.undefined
  /** Bytes found only in the data sink that are scheduled to be deleted. */
  var bytesFoundOnlyFromSink: js.UndefOr[String] = js.undefined
  /** Bytes in the data source that failed during the transfer. */
  var bytesFromSourceFailed: js.UndefOr[String] = js.undefined
  /**
    * Bytes in the data source that are not transferred because they already
    * exist in the data sink.
    */
  var bytesFromSourceSkippedBySync: js.UndefOr[String] = js.undefined
  /** Objects that are copied to the data sink. */
  var objectsCopiedToSink: js.UndefOr[String] = js.undefined
  /** Objects that are deleted from the data sink. */
  var objectsDeletedFromSink: js.UndefOr[String] = js.undefined
  /** Objects that are deleted from the data source. */
  var objectsDeletedFromSource: js.UndefOr[String] = js.undefined
  /** Objects that failed to be deleted from the data sink. */
  var objectsFailedToDeleteFromSink: js.UndefOr[String] = js.undefined
  /**
    * Objects found in the data source that are scheduled to be transferred,
    * which will be copied, excluded based on conditions, or skipped due to
    * failures.
    */
  var objectsFoundFromSource: js.UndefOr[String] = js.undefined
  /** Objects found only in the data sink that are scheduled to be deleted. */
  var objectsFoundOnlyFromSink: js.UndefOr[String] = js.undefined
  /** Objects in the data source that failed during the transfer. */
  var objectsFromSourceFailed: js.UndefOr[String] = js.undefined
  /**
    * Objects in the data source that are not transferred because they already
    * exist in the data sink.
    */
  var objectsFromSourceSkippedBySync: js.UndefOr[String] = js.undefined
}

object TransferCounters {
  @scala.inline
  def apply(
    bytesCopiedToSink: String = null,
    bytesDeletedFromSink: String = null,
    bytesDeletedFromSource: String = null,
    bytesFailedToDeleteFromSink: String = null,
    bytesFoundFromSource: String = null,
    bytesFoundOnlyFromSink: String = null,
    bytesFromSourceFailed: String = null,
    bytesFromSourceSkippedBySync: String = null,
    objectsCopiedToSink: String = null,
    objectsDeletedFromSink: String = null,
    objectsDeletedFromSource: String = null,
    objectsFailedToDeleteFromSink: String = null,
    objectsFoundFromSource: String = null,
    objectsFoundOnlyFromSink: String = null,
    objectsFromSourceFailed: String = null,
    objectsFromSourceSkippedBySync: String = null
  ): TransferCounters = {
    val __obj = js.Dynamic.literal()
    if (bytesCopiedToSink != null) __obj.updateDynamic("bytesCopiedToSink")(bytesCopiedToSink.asInstanceOf[js.Any])
    if (bytesDeletedFromSink != null) __obj.updateDynamic("bytesDeletedFromSink")(bytesDeletedFromSink.asInstanceOf[js.Any])
    if (bytesDeletedFromSource != null) __obj.updateDynamic("bytesDeletedFromSource")(bytesDeletedFromSource.asInstanceOf[js.Any])
    if (bytesFailedToDeleteFromSink != null) __obj.updateDynamic("bytesFailedToDeleteFromSink")(bytesFailedToDeleteFromSink.asInstanceOf[js.Any])
    if (bytesFoundFromSource != null) __obj.updateDynamic("bytesFoundFromSource")(bytesFoundFromSource.asInstanceOf[js.Any])
    if (bytesFoundOnlyFromSink != null) __obj.updateDynamic("bytesFoundOnlyFromSink")(bytesFoundOnlyFromSink.asInstanceOf[js.Any])
    if (bytesFromSourceFailed != null) __obj.updateDynamic("bytesFromSourceFailed")(bytesFromSourceFailed.asInstanceOf[js.Any])
    if (bytesFromSourceSkippedBySync != null) __obj.updateDynamic("bytesFromSourceSkippedBySync")(bytesFromSourceSkippedBySync.asInstanceOf[js.Any])
    if (objectsCopiedToSink != null) __obj.updateDynamic("objectsCopiedToSink")(objectsCopiedToSink.asInstanceOf[js.Any])
    if (objectsDeletedFromSink != null) __obj.updateDynamic("objectsDeletedFromSink")(objectsDeletedFromSink.asInstanceOf[js.Any])
    if (objectsDeletedFromSource != null) __obj.updateDynamic("objectsDeletedFromSource")(objectsDeletedFromSource.asInstanceOf[js.Any])
    if (objectsFailedToDeleteFromSink != null) __obj.updateDynamic("objectsFailedToDeleteFromSink")(objectsFailedToDeleteFromSink.asInstanceOf[js.Any])
    if (objectsFoundFromSource != null) __obj.updateDynamic("objectsFoundFromSource")(objectsFoundFromSource.asInstanceOf[js.Any])
    if (objectsFoundOnlyFromSink != null) __obj.updateDynamic("objectsFoundOnlyFromSink")(objectsFoundOnlyFromSink.asInstanceOf[js.Any])
    if (objectsFromSourceFailed != null) __obj.updateDynamic("objectsFromSourceFailed")(objectsFromSourceFailed.asInstanceOf[js.Any])
    if (objectsFromSourceSkippedBySync != null) __obj.updateDynamic("objectsFromSourceSkippedBySync")(objectsFromSourceSkippedBySync.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferCounters]
  }
}

