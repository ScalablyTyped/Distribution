package typings.gapiDotClientDotScript.gapiNs.clientNs.scriptNs

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Operation extends js.Object {
  /**
    * This field is only used with asynchronous executions and indicates whether or not the script execution has completed. A completed execution has a
    * populated response field containing the `ExecutionResponse` from function that was executed.
    */
  var done: js.UndefOr[Boolean] = js.undefined
  /**
    * If a `run` call succeeds but the script function (or Apps Script itself) throws an exception, this field will contain a `Status` object. The `Status`
    * object's `details` field will contain an array with a single `ExecutionError` object that provides information about the nature of the error.
    */
  var error: js.UndefOr[Status] = js.undefined
  /** This field is not used. */
  var metadata: js.UndefOr[Record[String, _]] = js.undefined
  /**
    * If the script function returns successfully, this field will contain an `ExecutionResponse` object with the function's return value as the object's
    * `result` field.
    */
  var response: js.UndefOr[Record[String, _]] = js.undefined
}

object Operation {
  @scala.inline
  def apply(
    done: js.UndefOr[Boolean] = js.undefined,
    error: Status = null,
    metadata: Record[String, _] = null,
    response: Record[String, _] = null
  ): Operation = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(done)) __obj.updateDynamic("done")(done)
    if (error != null) __obj.updateDynamic("error")(error)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (response != null) __obj.updateDynamic("response")(response)
    __obj.asInstanceOf[Operation]
  }
}

