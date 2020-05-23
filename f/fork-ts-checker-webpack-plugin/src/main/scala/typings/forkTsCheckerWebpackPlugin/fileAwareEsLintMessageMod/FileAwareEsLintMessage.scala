package typings.forkTsCheckerWebpackPlugin.fileAwareEsLintMessageMod

import typings.forkTsCheckerWebpackPlugin.anon.Range
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
    endColumn: js.UndefOr[Double] = js.undefined,
    endLine: js.UndefOr[Double] = js.undefined,
    fatal: `true` = null,
    filePath: String = null,
    fix: Range = null,
    ruleId: String = null,
    source: String = null
  ): FileAwareEsLintMessage = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any], ruleId = ruleId.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    if (!js.isUndefined(endColumn)) __obj.updateDynamic("endColumn")(endColumn.get.asInstanceOf[js.Any])
    if (!js.isUndefined(endLine)) __obj.updateDynamic("endLine")(endLine.get.asInstanceOf[js.Any])
    if (fatal != null) __obj.updateDynamic("fatal")(fatal.asInstanceOf[js.Any])
    if (filePath != null) __obj.updateDynamic("filePath")(filePath.asInstanceOf[js.Any])
    if (fix != null) __obj.updateDynamic("fix")(fix.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileAwareEsLintMessage]
  }
}

