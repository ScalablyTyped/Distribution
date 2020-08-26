package typings.forkTsCheckerWebpackPlugin.eslintMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CLIEngine extends js.Object {
  var version: String = js.native
  def executeOnFiles(filesPatterns: js.Array[String]): LintReport = js.native
  def isPathIgnored(filePath: String): Boolean = js.native
  def resolveFileGlobPatterns(filesPatterns: js.Array[String]): js.Array[String] = js.native
}

object CLIEngine {
  @scala.inline
  def apply(
    executeOnFiles: js.Array[String] => LintReport,
    isPathIgnored: String => Boolean,
    resolveFileGlobPatterns: js.Array[String] => js.Array[String],
    version: String
  ): CLIEngine = {
    val __obj = js.Dynamic.literal(executeOnFiles = js.Any.fromFunction1(executeOnFiles), isPathIgnored = js.Any.fromFunction1(isPathIgnored), resolveFileGlobPatterns = js.Any.fromFunction1(resolveFileGlobPatterns), version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[CLIEngine]
  }
  @scala.inline
  implicit class CLIEngineOps[Self <: CLIEngine] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setExecuteOnFiles(value: js.Array[String] => LintReport): Self = this.set("executeOnFiles", js.Any.fromFunction1(value))
    @scala.inline
    def setIsPathIgnored(value: String => Boolean): Self = this.set("isPathIgnored", js.Any.fromFunction1(value))
    @scala.inline
    def setResolveFileGlobPatterns(value: js.Array[String] => js.Array[String]): Self = this.set("resolveFileGlobPatterns", js.Any.fromFunction1(value))
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}

