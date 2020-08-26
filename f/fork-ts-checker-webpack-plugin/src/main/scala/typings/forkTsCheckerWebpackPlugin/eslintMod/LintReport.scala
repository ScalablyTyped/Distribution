package typings.forkTsCheckerWebpackPlugin.eslintMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LintReport
  extends /* key */ StringDictionary[js.Any] {
  var results: js.Array[LintResult] = js.native
}

object LintReport {
  @scala.inline
  def apply(results: js.Array[LintResult]): LintReport = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[LintReport]
  }
  @scala.inline
  implicit class LintReportOps[Self <: LintReport] (val x: Self) extends AnyVal {
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
    def setResultsVarargs(value: LintResult*): Self = this.set("results", js.Array(value :_*))
    @scala.inline
    def setResults(value: js.Array[LintResult]): Self = this.set("results", value.asInstanceOf[js.Any])
  }
  
}

