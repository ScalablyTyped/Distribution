package typings.googleapis.clouddebuggerV2Mod.clouddebuggerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a contextual status message. The message can indicate an error
  * or informational status, and refer to specific parts of the containing
  * object. For example, the `Breakpoint.status` field can indicate an error
  * referring to the `BREAKPOINT_SOURCE_LOCATION` with the message `Location
  * not found`.
  */
@js.native
trait SchemaStatusMessage extends js.Object {
  /**
    * Status message text.
    */
  var description: js.UndefOr[SchemaFormatMessage] = js.native
  /**
    * Distinguishes errors from informational messages.
    */
  var isError: js.UndefOr[Boolean] = js.native
  /**
    * Reference to which the message applies.
    */
  var refersTo: js.UndefOr[String] = js.native
}

object SchemaStatusMessage {
  @scala.inline
  def apply(
    description: SchemaFormatMessage = null,
    isError: js.UndefOr[Boolean] = js.undefined,
    refersTo: String = null
  ): SchemaStatusMessage = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(isError)) __obj.updateDynamic("isError")(isError.asInstanceOf[js.Any])
    if (refersTo != null) __obj.updateDynamic("refersTo")(refersTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaStatusMessage]
  }
}

