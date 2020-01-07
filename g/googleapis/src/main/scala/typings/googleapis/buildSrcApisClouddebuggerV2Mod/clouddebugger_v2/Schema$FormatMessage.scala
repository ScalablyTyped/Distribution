package typings.googleapis.buildSrcApisClouddebuggerV2Mod.clouddebugger_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a message with parameters.
  */
@js.native
trait Schema$FormatMessage extends js.Object {
  /**
    * Format template for the message. The `format` uses placeholders `$0`,
    * `$1`, etc. to reference parameters. `$$` can be used to denote the `$`
    * character.  Examples:  *   `Failed to load &#39;$0&#39; which helps debug
    * $1 the first time it     is loaded.  Again, $0 is very important.` *
    * `Please pay $$10 to use $0 instead of $1.`
    */
  var format: js.UndefOr[String] = js.native
  /**
    * Optional parameters to be embedded into the message.
    */
  var parameters: js.UndefOr[js.Array[String]] = js.native
}

object Schema$FormatMessage {
  @scala.inline
  def apply(format: String = null, parameters: js.Array[String] = null): Schema$FormatMessage = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$FormatMessage]
  }
}

