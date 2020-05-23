package typings.ecmarkup.algorithmErrorReporterTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LintingError extends js.Object {
  var column: Double
  var line: Double
  var message: String
  var nodeType: String
  var ruleId: String
}

object LintingError {
  @scala.inline
  def apply(column: Double, line: Double, message: String, nodeType: String, ruleId: String): LintingError = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], ruleId = ruleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LintingError]
  }
}

