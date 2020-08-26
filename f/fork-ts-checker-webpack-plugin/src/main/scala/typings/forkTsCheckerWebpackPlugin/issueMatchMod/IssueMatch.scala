package typings.forkTsCheckerWebpackPlugin.issueMatchMod

import typings.forkTsCheckerWebpackPlugin.issueSeverityMod.IssueSeverity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<fork-ts-checker-webpack-plugin.fork-ts-checker-webpack-plugin/lib/issue.Issue, 'origin' | 'severity' | 'code' | 'file'>> */
@js.native
trait IssueMatch extends js.Object {
  var code: js.UndefOr[String] = js.native
  var file: js.UndefOr[String] = js.native
  var origin: js.UndefOr[String] = js.native
  var severity: js.UndefOr[IssueSeverity] = js.native
}

object IssueMatch {
  @scala.inline
  def apply(): IssueMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IssueMatch]
  }
  @scala.inline
  implicit class IssueMatchOps[Self <: IssueMatch] (val x: Self) extends AnyVal {
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
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    @scala.inline
    def setFile(value: String): Self = this.set("file", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFile: Self = this.set("file", js.undefined)
    @scala.inline
    def setOrigin(value: String): Self = this.set("origin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
    @scala.inline
    def setSeverity(value: IssueSeverity): Self = this.set("severity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeverity: Self = this.set("severity", js.undefined)
  }
  
}

