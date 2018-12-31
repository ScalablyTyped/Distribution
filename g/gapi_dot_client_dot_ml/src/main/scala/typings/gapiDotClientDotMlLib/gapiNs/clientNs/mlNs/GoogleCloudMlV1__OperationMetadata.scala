package typings
package gapiDotClientDotMlLib.gapiNs.clientNs.mlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudMlV1__OperationMetadata extends js.Object {
  /** The time the operation was submitted. */
  var createTime: js.UndefOr[java.lang.String] = js.undefined
  /** The time operation processing completed. */
  var endTime: js.UndefOr[java.lang.String] = js.undefined
  /** Indicates whether a request to cancel this operation has been made. */
  var isCancellationRequested: js.UndefOr[scala.Boolean] = js.undefined
  /** Contains the name of the model associated with the operation. */
  var modelName: js.UndefOr[java.lang.String] = js.undefined
  /** The operation type. */
  var operationType: js.UndefOr[java.lang.String] = js.undefined
  /** The time operation processing started. */
  var startTime: js.UndefOr[java.lang.String] = js.undefined
  /** Contains the version associated with the operation. */
  var version: js.UndefOr[GoogleCloudMlV1__Version] = js.undefined
}

