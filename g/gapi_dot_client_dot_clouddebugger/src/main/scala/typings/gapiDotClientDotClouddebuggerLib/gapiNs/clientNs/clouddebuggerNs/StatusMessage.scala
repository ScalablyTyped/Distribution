package typings
package gapiDotClientDotClouddebuggerLib.gapiNs.clientNs.clouddebuggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatusMessage extends js.Object {
  /** Status message text. */
  var description: js.UndefOr[FormatMessage] = js.undefined
  /** Distinguishes errors from informational messages. */
  var isError: js.UndefOr[scala.Boolean] = js.undefined
  /** Reference to which the message applies. */
  var refersTo: js.UndefOr[java.lang.String] = js.undefined
}

object StatusMessage {
  @scala.inline
  def apply(
    description: FormatMessage = null,
    isError: js.UndefOr[scala.Boolean] = js.undefined,
    refersTo: java.lang.String = null
  ): StatusMessage = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(isError)) __obj.updateDynamic("isError")(isError)
    if (refersTo != null) __obj.updateDynamic("refersTo")(refersTo)
    __obj.asInstanceOf[StatusMessage]
  }
}

