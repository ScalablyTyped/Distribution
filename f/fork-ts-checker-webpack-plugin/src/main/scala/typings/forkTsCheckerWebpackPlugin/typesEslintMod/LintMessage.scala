package typings.forkTsCheckerWebpackPlugin.typesEslintMod

import typings.forkTsCheckerWebpackPlugin.AnonRange
import typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginBooleans.`true`
import typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginNumbers.`0`
import typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginNumbers.`1`
import typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LintMessage extends js.Object {
  var column: Double
  var endColumn: js.UndefOr[Double] = js.undefined
  var endLine: js.UndefOr[Double] = js.undefined
  var fatal: js.UndefOr[`true`] = js.undefined
  var fix: js.UndefOr[AnonRange] = js.undefined
  var line: Double
  var message: String
  var nodeType: String
  var ruleId: String | Null
  var severity: `0` | `1` | `2`
  var source: String | Null
}

object LintMessage {
  @scala.inline
  def apply(
    column: Double,
    line: Double,
    message: String,
    nodeType: String,
    severity: `0` | `1` | `2`,
    endColumn: Int | Double = null,
    endLine: Int | Double = null,
    fatal: `true` = null,
    fix: AnonRange = null,
    ruleId: String = null,
    source: String = null
  ): LintMessage = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any])
    if (endColumn != null) __obj.updateDynamic("endColumn")(endColumn.asInstanceOf[js.Any])
    if (endLine != null) __obj.updateDynamic("endLine")(endLine.asInstanceOf[js.Any])
    if (fatal != null) __obj.updateDynamic("fatal")(fatal.asInstanceOf[js.Any])
    if (fix != null) __obj.updateDynamic("fix")(fix.asInstanceOf[js.Any])
    if (ruleId != null) __obj.updateDynamic("ruleId")(ruleId.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[LintMessage]
  }
}

