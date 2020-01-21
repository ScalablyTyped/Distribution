package typings.gapiClientDlp.gapi.client.dlp

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleLongrunningOperation extends js.Object {
  /**
    * If the value is `false`, it means the operation is still in progress.
    * If `true`, the operation is completed, and either `error` or `response` is
    * available.
    */
  var done: js.UndefOr[Boolean] = js.undefined
  /** The error result of the operation in case of failure or cancellation. */
  var error: js.UndefOr[GoogleRpcStatus] = js.undefined
  /**
    * This field will contain an InspectOperationMetadata object for `inspect.operations.create` or a RiskAnalysisOperationMetadata object for
    * `dataSource.analyze`.  This will always be returned with the Operation.
    */
  var metadata: js.UndefOr[Record[String, _]] = js.undefined
  /** The server-assigned name. The `name` should have the format of `inspect/operations/<identifier>`. */
  var name: js.UndefOr[String] = js.undefined
  /**
    * This field will contain an InspectOperationResult object for `inspect.operations.create` or a RiskAnalysisOperationResult object for
    * `dataSource.analyze`.
    */
  var response: js.UndefOr[Record[String, _]] = js.undefined
}

object GoogleLongrunningOperation {
  @scala.inline
  def apply(
    done: js.UndefOr[Boolean] = js.undefined,
    error: GoogleRpcStatus = null,
    metadata: Record[String, _] = null,
    name: String = null,
    response: Record[String, _] = null
  ): GoogleLongrunningOperation = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(done)) __obj.updateDynamic("done")(done.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (response != null) __obj.updateDynamic("response")(response.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleLongrunningOperation]
  }
}

