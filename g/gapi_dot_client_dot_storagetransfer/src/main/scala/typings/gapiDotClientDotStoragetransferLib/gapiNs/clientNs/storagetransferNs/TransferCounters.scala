package typings
package gapiDotClientDotStoragetransferLib.gapiNs.clientNs.storagetransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferCounters extends js.Object {
  /** Bytes that are copied to the data sink. */
  var bytesCopiedToSink: js.UndefOr[java.lang.String] = js.undefined
  /** Bytes that are deleted from the data sink. */
  var bytesDeletedFromSink: js.UndefOr[java.lang.String] = js.undefined
  /** Bytes that are deleted from the data source. */
  var bytesDeletedFromSource: js.UndefOr[java.lang.String] = js.undefined
  /** Bytes that failed to be deleted from the data sink. */
  var bytesFailedToDeleteFromSink: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Bytes found in the data source that are scheduled to be transferred,
    * which will be copied, excluded based on conditions, or skipped due to
    * failures.
    */
  var bytesFoundFromSource: js.UndefOr[java.lang.String] = js.undefined
  /** Bytes found only in the data sink that are scheduled to be deleted. */
  var bytesFoundOnlyFromSink: js.UndefOr[java.lang.String] = js.undefined
  /** Bytes in the data source that failed during the transfer. */
  var bytesFromSourceFailed: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Bytes in the data source that are not transferred because they already
    * exist in the data sink.
    */
  var bytesFromSourceSkippedBySync: js.UndefOr[java.lang.String] = js.undefined
  /** Objects that are copied to the data sink. */
  var objectsCopiedToSink: js.UndefOr[java.lang.String] = js.undefined
  /** Objects that are deleted from the data sink. */
  var objectsDeletedFromSink: js.UndefOr[java.lang.String] = js.undefined
  /** Objects that are deleted from the data source. */
  var objectsDeletedFromSource: js.UndefOr[java.lang.String] = js.undefined
  /** Objects that failed to be deleted from the data sink. */
  var objectsFailedToDeleteFromSink: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Objects found in the data source that are scheduled to be transferred,
    * which will be copied, excluded based on conditions, or skipped due to
    * failures.
    */
  var objectsFoundFromSource: js.UndefOr[java.lang.String] = js.undefined
  /** Objects found only in the data sink that are scheduled to be deleted. */
  var objectsFoundOnlyFromSink: js.UndefOr[java.lang.String] = js.undefined
  /** Objects in the data source that failed during the transfer. */
  var objectsFromSourceFailed: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Objects in the data source that are not transferred because they already
    * exist in the data sink.
    */
  var objectsFromSourceSkippedBySync: js.UndefOr[java.lang.String] = js.undefined
}

object TransferCounters {
  @scala.inline
  def apply(
    bytesCopiedToSink: java.lang.String = null,
    bytesDeletedFromSink: java.lang.String = null,
    bytesDeletedFromSource: java.lang.String = null,
    bytesFailedToDeleteFromSink: java.lang.String = null,
    bytesFoundFromSource: java.lang.String = null,
    bytesFoundOnlyFromSink: java.lang.String = null,
    bytesFromSourceFailed: java.lang.String = null,
    bytesFromSourceSkippedBySync: java.lang.String = null,
    objectsCopiedToSink: java.lang.String = null,
    objectsDeletedFromSink: java.lang.String = null,
    objectsDeletedFromSource: java.lang.String = null,
    objectsFailedToDeleteFromSink: java.lang.String = null,
    objectsFoundFromSource: java.lang.String = null,
    objectsFoundOnlyFromSink: java.lang.String = null,
    objectsFromSourceFailed: java.lang.String = null,
    objectsFromSourceSkippedBySync: java.lang.String = null
  ): TransferCounters = {
    val __obj = js.Dynamic.literal()
    if (bytesCopiedToSink != null) __obj.updateDynamic("bytesCopiedToSink")(bytesCopiedToSink)
    if (bytesDeletedFromSink != null) __obj.updateDynamic("bytesDeletedFromSink")(bytesDeletedFromSink)
    if (bytesDeletedFromSource != null) __obj.updateDynamic("bytesDeletedFromSource")(bytesDeletedFromSource)
    if (bytesFailedToDeleteFromSink != null) __obj.updateDynamic("bytesFailedToDeleteFromSink")(bytesFailedToDeleteFromSink)
    if (bytesFoundFromSource != null) __obj.updateDynamic("bytesFoundFromSource")(bytesFoundFromSource)
    if (bytesFoundOnlyFromSink != null) __obj.updateDynamic("bytesFoundOnlyFromSink")(bytesFoundOnlyFromSink)
    if (bytesFromSourceFailed != null) __obj.updateDynamic("bytesFromSourceFailed")(bytesFromSourceFailed)
    if (bytesFromSourceSkippedBySync != null) __obj.updateDynamic("bytesFromSourceSkippedBySync")(bytesFromSourceSkippedBySync)
    if (objectsCopiedToSink != null) __obj.updateDynamic("objectsCopiedToSink")(objectsCopiedToSink)
    if (objectsDeletedFromSink != null) __obj.updateDynamic("objectsDeletedFromSink")(objectsDeletedFromSink)
    if (objectsDeletedFromSource != null) __obj.updateDynamic("objectsDeletedFromSource")(objectsDeletedFromSource)
    if (objectsFailedToDeleteFromSink != null) __obj.updateDynamic("objectsFailedToDeleteFromSink")(objectsFailedToDeleteFromSink)
    if (objectsFoundFromSource != null) __obj.updateDynamic("objectsFoundFromSource")(objectsFoundFromSource)
    if (objectsFoundOnlyFromSink != null) __obj.updateDynamic("objectsFoundOnlyFromSink")(objectsFoundOnlyFromSink)
    if (objectsFromSourceFailed != null) __obj.updateDynamic("objectsFromSourceFailed")(objectsFromSourceFailed)
    if (objectsFromSourceSkippedBySync != null) __obj.updateDynamic("objectsFromSourceSkippedBySync")(objectsFromSourceSkippedBySync)
    __obj.asInstanceOf[TransferCounters]
  }
}

