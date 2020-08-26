package typings.googleapis.clouddebuggerV2Mod.clouddebuggerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a message with parameters.
  */
@js.native
trait SchemaFormatMessage extends js.Object {
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

object SchemaFormatMessage {
  @scala.inline
  def apply(): SchemaFormatMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFormatMessage]
  }
  @scala.inline
  implicit class SchemaFormatMessageOps[Self <: SchemaFormatMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setParametersVarargs(value: String*): Self = this.set("parameters", js.Array(value :_*))
    @scala.inline
    def setParameters(value: js.Array[String]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
  }
  
}

