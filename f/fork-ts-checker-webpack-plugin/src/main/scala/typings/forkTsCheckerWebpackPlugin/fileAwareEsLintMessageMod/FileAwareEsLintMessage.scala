package typings.forkTsCheckerWebpackPlugin.fileAwareEsLintMessageMod

import typings.forkTsCheckerWebpackPlugin.AnonRange
import typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginBooleans.`true`
import typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginNumbers.`0`
import typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginNumbers.`1`
import typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginNumbers.`2`
import typings.forkTsCheckerWebpackPlugin.typesEslintMod.LintMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * We need to define custom interface because of eslint architecture which
  * groups lint messages per file
  */
trait FileAwareEsLintMessage extends LintMessage {
  var filePath: js.UndefOr[String] = js.undefined
}

object FileAwareEsLintMessage {
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
    filePath: String = null,
    fix: AnonRange = null,
    ruleId: String = null,
    source: String = null
  ): FileAwareEsLintMessage = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any])
    if (endColumn != null) __obj.updateDynamic("endColumn")(endColumn.asInstanceOf[js.Any])
    if (endLine != null) __obj.updateDynamic("endLine")(endLine.asInstanceOf[js.Any])
    if (fatal != null) __obj.updateDynamic("fatal")(fatal.asInstanceOf[js.Any])
    if (filePath != null) __obj.updateDynamic("filePath")(filePath.asInstanceOf[js.Any])
    if (fix != null) __obj.updateDynamic("fix")(fix.asInstanceOf[js.Any])
    if (ruleId != null) __obj.updateDynamic("ruleId")(ruleId.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileAwareEsLintMessage]
  }
}

