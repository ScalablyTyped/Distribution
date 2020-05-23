package typings.forkTsCheckerWebpackPlugin.anon

import typings.forkTsCheckerWebpackPlugin.typesEslintMod.LintReport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetReport extends js.Object {
  def getReport(filepath: String): js.UndefOr[LintReport]
}

object GetReport {
  @scala.inline
  def apply(getReport: String => js.UndefOr[LintReport]): GetReport = {
    val __obj = js.Dynamic.literal(getReport = js.Any.fromFunction1(getReport))
    __obj.asInstanceOf[GetReport]
  }
}

