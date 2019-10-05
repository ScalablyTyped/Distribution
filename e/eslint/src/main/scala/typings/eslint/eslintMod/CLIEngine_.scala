package typings.eslint.eslintMod

import typings.eslint.eslintMod.CLIEngine.Formatter
import typings.eslint.eslintMod.CLIEngine.LintReport
import typings.eslint.eslintMod.CLIEngine.Options
import typings.eslint.eslintMod.Linter.Config
import typings.eslint.eslintMod.Rule.RuleModule
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("eslint", "CLIEngine")
@js.native
class CLIEngine_ protected () extends js.Object {
  def this(options: Options) = this()
  var version: String = js.native
  def addPlugin(name: String, pluginObject: js.Any): Unit = js.native
  def executeOnFiles(patterns: js.Array[String]): LintReport = js.native
  def executeOnText(text: String): LintReport = js.native
  def executeOnText(text: String, filename: String): LintReport = js.native
  def getConfigForFile(filePath: String): Config = js.native
  def getFormatter(): Formatter = js.native
  def getFormatter(format: String): Formatter = js.native
  def getRules(): Map[String, RuleModule] = js.native
  def isPathIgnored(filePath: String): Boolean = js.native
  def resolveFileGlobPatterns(patterns: js.Array[String]): js.Array[String] = js.native
}

