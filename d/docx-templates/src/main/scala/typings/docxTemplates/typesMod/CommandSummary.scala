package typings.docxTemplates.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandSummary extends js.Object {
  var code: String = js.native
  var raw: String = js.native
  var `type`: BuiltInCommand = js.native
}

object CommandSummary {
  @scala.inline
  def apply(code: String, raw: String, `type`: BuiltInCommand): CommandSummary = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandSummary]
  }
  @scala.inline
  implicit class CommandSummaryOps[Self <: CommandSummary] (val x: Self) extends AnyVal {
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
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setRaw(value: String): Self = this.set("raw", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: BuiltInCommand): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

