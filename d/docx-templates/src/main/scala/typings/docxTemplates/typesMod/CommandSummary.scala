package typings.docxTemplates.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandSummary extends js.Object {
  var code: String
  var raw: String
  var `type`: BuiltInCommand
}

object CommandSummary {
  @scala.inline
  def apply(code: String, raw: String, `type`: BuiltInCommand): CommandSummary = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandSummary]
  }
}

