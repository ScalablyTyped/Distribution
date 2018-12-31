package typings
package gapiDotClientDotDlpLib.gapiNs.clientNs.dlpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleLongrunningOperation extends js.Object {
  /**
    * If the value is `false`, it means the operation is still in progress.
    * If `true`, the operation is completed, and either `error` or `response` is
    * available.
    */
  var done: js.UndefOr[scala.Boolean] = js.undefined
  /** The error result of the operation in case of failure or cancellation. */
  var error: js.UndefOr[GoogleRpcStatus] = js.undefined
  /**
    * This field will contain an InspectOperationMetadata object for `inspect.operations.create` or a RiskAnalysisOperationMetadata object for
    * `dataSource.analyze`.  This will always be returned with the Operation.
    */
  var metadata: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
  /** The server-assigned name. The `name` should have the format of `inspect/operations/<identifier>`. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * This field will contain an InspectOperationResult object for `inspect.operations.create` or a RiskAnalysisOperationResult object for
    * `dataSource.analyze`.
    */
  var response: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
}

