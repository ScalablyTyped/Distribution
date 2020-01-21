package typings.gapiClientSqladmin.gapi.client.sqladmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationError extends js.Object {
  /** Identifies the specific error that occurred. */
  var code: js.UndefOr[String] = js.undefined
  /** This is always sql#operationError. */
  var kind: js.UndefOr[String] = js.undefined
  /** Additional information about the error encountered. */
  var message: js.UndefOr[String] = js.undefined
}

object OperationError {
  @scala.inline
  def apply(code: String = null, kind: String = null, message: String = null): OperationError = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationError]
  }
}

