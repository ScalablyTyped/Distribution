package typings.forkTsCheckerWebpackPlugin

import typings.eslint.mod.CLIEngine.LintReport
import typings.forkTsCheckerWebpackPlugin.normalizedMessageMod.NormalizedMessage
import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFilepath extends js.Object {
  def getFormattedLints(lintReports: js.Array[LintReport]): js.Array[NormalizedMessage] = js.native
  def getFormattedLints(lintReports: IterableIterator[LintReport]): js.Array[NormalizedMessage] = js.native
  def getLints(filepath: String): js.UndefOr[LintReport] = js.native
}

