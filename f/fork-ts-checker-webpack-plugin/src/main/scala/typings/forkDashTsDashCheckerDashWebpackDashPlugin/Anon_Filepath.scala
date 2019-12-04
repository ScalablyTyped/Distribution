package typings.forkDashTsDashCheckerDashWebpackDashPlugin

import typings.eslint.eslintMod.CLIEngine.LintReport
import typings.forkDashTsDashCheckerDashWebpackDashPlugin.libNormalizedMessageMod.NormalizedMessage
import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Filepath extends js.Object {
  def getFormattedLints(lintReports: js.Array[LintReport]): js.Array[NormalizedMessage] = js.native
  def getFormattedLints(lintReports: IterableIterator[LintReport]): js.Array[NormalizedMessage] = js.native
  def getLints(filepath: String): js.UndefOr[LintReport] = js.native
}

