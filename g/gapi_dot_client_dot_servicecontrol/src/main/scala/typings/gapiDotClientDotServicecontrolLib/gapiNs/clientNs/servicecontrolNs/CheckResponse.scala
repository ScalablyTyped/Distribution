package typings
package gapiDotClientDotServicecontrolLib.gapiNs.clientNs.servicecontrolNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CheckResponse extends js.Object {
  /**
               * Indicate the decision of the check.
               *
               * If no check errors are present, the service should process the operation.
               * Otherwise the service should use the list of errors to determine the
               * appropriate action.
               */
  var checkErrors: js.UndefOr[js.Array[CheckError]] = js.undefined
  /** Feedback data returned from the server during processing a Check request. */
  var checkInfo: js.UndefOr[CheckInfo] = js.undefined
  /**
               * The same operation_id value used in the CheckRequest.
               * Used for logging and diagnostics purposes.
               */
  var operationId: js.UndefOr[java.lang.String] = js.undefined
  /** Quota information for the check request associated with this response. */
  var quotaInfo: js.UndefOr[QuotaInfo] = js.undefined
  /** The actual config id used to process the request. */
  var serviceConfigId: js.UndefOr[java.lang.String] = js.undefined
}

