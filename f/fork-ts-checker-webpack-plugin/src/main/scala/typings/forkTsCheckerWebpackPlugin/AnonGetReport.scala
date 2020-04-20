package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.typesEslintMod.LintReport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGetReport extends js.Object {
  def getReport(filepath: String): js.UndefOr[LintReport]
}

object AnonGetReport {
  @scala.inline
  def apply(getReport: String => js.UndefOr[LintReport]): AnonGetReport = {
    val __obj = js.Dynamic.literal(getReport = js.Any.fromFunction1(getReport))
    __obj.asInstanceOf[AnonGetReport]
  }
}

