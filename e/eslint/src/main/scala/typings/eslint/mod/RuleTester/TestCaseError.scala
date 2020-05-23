package typings.eslint.mod.RuleTester

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestCaseError extends js.Object {
  var column: js.UndefOr[Double] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var endColumn: js.UndefOr[Double] = js.undefined
  var endLine: js.UndefOr[Double] = js.undefined
  var line: js.UndefOr[Double] = js.undefined
  var message: js.UndefOr[String | RegExp] = js.undefined
  var messageId: js.UndefOr[String] = js.undefined
  var suggestions: js.UndefOr[js.Array[SuggestionOutput]] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object TestCaseError {
  @scala.inline
  def apply(
    column: js.UndefOr[Double] = js.undefined,
    data: js.Any = null,
    endColumn: js.UndefOr[Double] = js.undefined,
    endLine: js.UndefOr[Double] = js.undefined,
    line: js.UndefOr[Double] = js.undefined,
    message: String | RegExp = null,
    messageId: String = null,
    suggestions: js.Array[SuggestionOutput] = null,
    `type`: String = null
  ): TestCaseError = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(column)) __obj.updateDynamic("column")(column.get.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(endColumn)) __obj.updateDynamic("endColumn")(endColumn.get.asInstanceOf[js.Any])
    if (!js.isUndefined(endLine)) __obj.updateDynamic("endLine")(endLine.get.asInstanceOf[js.Any])
    if (!js.isUndefined(line)) __obj.updateDynamic("line")(line.get.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    if (suggestions != null) __obj.updateDynamic("suggestions")(suggestions.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestCaseError]
  }
}

