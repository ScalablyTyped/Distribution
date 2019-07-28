package typings.eslint.eslintMod.RuleTesterNs

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
  var `type`: js.UndefOr[String] = js.undefined
}

object TestCaseError {
  @scala.inline
  def apply(
    column: Int | Double = null,
    data: js.Any = null,
    endColumn: Int | Double = null,
    endLine: Int | Double = null,
    line: Int | Double = null,
    message: String | RegExp = null,
    messageId: String = null,
    `type`: String = null
  ): TestCaseError = {
    val __obj = js.Dynamic.literal()
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data)
    if (endColumn != null) __obj.updateDynamic("endColumn")(endColumn.asInstanceOf[js.Any])
    if (endLine != null) __obj.updateDynamic("endLine")(endLine.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TestCaseError]
  }
}

