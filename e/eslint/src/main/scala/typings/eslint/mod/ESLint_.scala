package typings.eslint.mod

import typings.eslint.anon.FilePath
import typings.eslint.mod.ESLint.Formatter
import typings.eslint.mod.ESLint.LintResult
import typings.eslint.mod.ESLint.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("eslint", "ESLint")
@js.native
class ESLint_ protected () extends js.Object {
  def this(options: Options) = this()
  def calculateConfigForFile(filePath: String): js.Promise[_] = js.native
  def isPathIgnored(filePath: String): js.Promise[Boolean] = js.native
  def lintFiles(patterns: String): js.Promise[js.Array[LintResult]] = js.native
  def lintFiles(patterns: js.Array[String]): js.Promise[js.Array[LintResult]] = js.native
  def lintText(code: String): js.Promise[js.Array[LintResult]] = js.native
  def lintText(code: String, options: FilePath): js.Promise[js.Array[LintResult]] = js.native
  def loadFormatter(): js.Promise[Formatter] = js.native
  def loadFormatter(nameOrPath: String): js.Promise[Formatter] = js.native
}

