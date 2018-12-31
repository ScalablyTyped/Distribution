package typings
package gapiDotClientDotStoragetransferLib.gapiNs.clientNs.storagetransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferOperation extends js.Object {
  /** Information about the progress of the transfer operation. */
  var counters: js.UndefOr[TransferCounters] = js.undefined
  /** End time of this transfer execution. */
  var endTime: js.UndefOr[java.lang.String] = js.undefined
  /** Summarizes errors encountered with sample error log entries. */
  var errorBreakdowns: js.UndefOr[js.Array[ErrorSummary]] = js.undefined
  /** A globally unique ID assigned by the system. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The ID of the Google Cloud Platform Console project that owns the operation.
    * Required.
    */
  var projectId: js.UndefOr[java.lang.String] = js.undefined
  /** Start time of this transfer execution. */
  var startTime: js.UndefOr[java.lang.String] = js.undefined
  /** Status of the transfer operation. */
  var status: js.UndefOr[java.lang.String] = js.undefined
  /** The name of the transfer job that triggers this transfer operation. */
  var transferJobName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Transfer specification.
    * Required.
    */
  var transferSpec: js.UndefOr[TransferSpec] = js.undefined
}

