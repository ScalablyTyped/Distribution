package typings.gapiClientClouddebugger.gapi.client.clouddebugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatusMessage extends js.Object {
  /** Status message text. */
  var description: js.UndefOr[FormatMessage] = js.undefined
  /** Distinguishes errors from informational messages. */
  var isError: js.UndefOr[Boolean] = js.undefined
  /** Reference to which the message applies. */
  var refersTo: js.UndefOr[String] = js.undefined
}

object StatusMessage {
  @scala.inline
  def apply(
    description: FormatMessage = null,
    isError: js.UndefOr[Boolean] = js.undefined,
    refersTo: String = null
  ): StatusMessage = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(isError)) __obj.updateDynamic("isError")(isError.asInstanceOf[js.Any])
    if (refersTo != null) __obj.updateDynamic("refersTo")(refersTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusMessage]
  }
}

