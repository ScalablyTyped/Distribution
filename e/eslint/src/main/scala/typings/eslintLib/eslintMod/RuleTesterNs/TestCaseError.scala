package typings
package eslintLib.eslintMod.RuleTesterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestCaseError extends js.Object {
  var column: js.UndefOr[scala.Double] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var endColumn: js.UndefOr[scala.Double] = js.undefined
  var endLine: js.UndefOr[scala.Double] = js.undefined
  var line: js.UndefOr[scala.Double] = js.undefined
  var message: js.UndefOr[java.lang.String | stdLib.RegExp] = js.undefined
  var messageId: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object TestCaseError {
  @scala.inline
  def apply(
    column: scala.Int | scala.Double = null,
    data: js.Any = null,
    endColumn: scala.Int | scala.Double = null,
    endLine: scala.Int | scala.Double = null,
    line: scala.Int | scala.Double = null,
    message: java.lang.String | stdLib.RegExp = null,
    messageId: java.lang.String = null,
    `type`: java.lang.String = null
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

