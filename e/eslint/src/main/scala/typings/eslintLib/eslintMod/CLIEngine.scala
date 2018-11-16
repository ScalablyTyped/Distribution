package typings
package eslintLib.eslintMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("eslint", "CLIEngine")
@js.native
class CLIEngine protected () extends js.Object {
  def this(options: eslintLib.eslintMod.CLIEngineNs.Options) = this()
  var version: java.lang.String = js.native
  def addPlugin(name: java.lang.String, pluginObject: js.Any): scala.Unit = js.native
  def executeOnFiles(patterns: js.Array[java.lang.String]): eslintLib.eslintMod.CLIEngineNs.LintReport = js.native
  def executeOnText(text: java.lang.String): eslintLib.eslintMod.CLIEngineNs.LintReport = js.native
  def executeOnText(text: java.lang.String, filename: java.lang.String): eslintLib.eslintMod.CLIEngineNs.LintReport = js.native
  def getConfigForFile(filePath: java.lang.String): eslintLib.eslintMod.LinterNs.Config = js.native
  def getFormatter(format: java.lang.String): eslintLib.eslintMod.CLIEngineNs.Formatter = js.native
  def getRules(): stdLib.Map[java.lang.String, eslintLib.eslintMod.RuleNs.RuleModule] = js.native
  def isPathIgnored(filePath: java.lang.String): scala.Boolean = js.native
  def resolveFileGlobPatterns(patterns: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
}

@JSImport("eslint", "CLIEngine")
@js.native
object CLIEngine extends js.Object {
  def getErrorResults(results: js.Array[eslintLib.eslintMod.CLIEngineNs.LintResult]): js.Array[eslintLib.eslintMod.CLIEngineNs.LintResult] = js.native
  def outputFixes(report: eslintLib.eslintMod.CLIEngineNs.LintReport): scala.Unit = js.native
}

