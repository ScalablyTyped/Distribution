package typings.eslint.mod.RuleTester

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestCaseError extends js.Object {
  var column: js.UndefOr[Double] = js.native
  var data: js.UndefOr[js.Any] = js.native
  var endColumn: js.UndefOr[Double] = js.native
  var endLine: js.UndefOr[Double] = js.native
  var line: js.UndefOr[Double] = js.native
  var message: js.UndefOr[String | RegExp] = js.native
  var messageId: js.UndefOr[String] = js.native
  var suggestions: js.UndefOr[js.Array[SuggestionOutput]] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object TestCaseError {
  @scala.inline
  def apply(): TestCaseError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestCaseError]
  }
  @scala.inline
  implicit class TestCaseErrorOps[Self <: TestCaseError] (val x: Self) extends AnyVal {
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
    def setColumn(value: Double): Self = this.set("column", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumn: Self = this.set("column", js.undefined)
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setEndColumn(value: Double): Self = this.set("endColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndColumn: Self = this.set("endColumn", js.undefined)
    @scala.inline
    def setEndLine(value: Double): Self = this.set("endLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndLine: Self = this.set("endLine", js.undefined)
    @scala.inline
    def setLine(value: Double): Self = this.set("line", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLine: Self = this.set("line", js.undefined)
    @scala.inline
    def setMessage(value: String | RegExp): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setMessageId(value: String): Self = this.set("messageId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessageId: Self = this.set("messageId", js.undefined)
    @scala.inline
    def setSuggestionsVarargs(value: SuggestionOutput*): Self = this.set("suggestions", js.Array(value :_*))
    @scala.inline
    def setSuggestions(value: js.Array[SuggestionOutput]): Self = this.set("suggestions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuggestions: Self = this.set("suggestions", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

