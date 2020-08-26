package typings.eslint.mod.RuleTester

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuggestionOutput extends js.Object {
  var data: js.UndefOr[Record[String, _]] = js.native
  var desc: js.UndefOr[String] = js.native
  var messageId: js.UndefOr[String] = js.native
  var output: String = js.native
}

object SuggestionOutput {
  @scala.inline
  def apply(output: String): SuggestionOutput = {
    val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuggestionOutput]
  }
  @scala.inline
  implicit class SuggestionOutputOps[Self <: SuggestionOutput] (val x: Self) extends AnyVal {
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
    def setOutput(value: String): Self = this.set("output", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: Record[String, _]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDesc(value: String): Self = this.set("desc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDesc: Self = this.set("desc", js.undefined)
    @scala.inline
    def setMessageId(value: String): Self = this.set("messageId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessageId: Self = this.set("messageId", js.undefined)
  }
  
}

