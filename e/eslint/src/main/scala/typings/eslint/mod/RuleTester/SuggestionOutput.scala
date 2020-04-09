package typings.eslint.mod.RuleTester

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuggestionOutput extends js.Object {
  var data: js.UndefOr[Record[String, _]] = js.undefined
  var desc: js.UndefOr[String] = js.undefined
  var messageId: js.UndefOr[String] = js.undefined
  var output: String
}

object SuggestionOutput {
  @scala.inline
  def apply(output: String, data: Record[String, _] = null, desc: String = null, messageId: String = null): SuggestionOutput = {
    val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (desc != null) __obj.updateDynamic("desc")(desc.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuggestionOutput]
  }
}

