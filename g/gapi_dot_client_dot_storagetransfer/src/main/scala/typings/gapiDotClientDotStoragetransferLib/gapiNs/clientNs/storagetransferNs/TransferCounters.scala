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

