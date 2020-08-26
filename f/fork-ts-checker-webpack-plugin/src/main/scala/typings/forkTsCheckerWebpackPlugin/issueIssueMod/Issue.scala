package typings.forkTsCheckerWebpackPlugin.issueIssueMod

import typings.forkTsCheckerWebpackPlugin.issueLocationMod.IssueLocation
import typings.forkTsCheckerWebpackPlugin.issueSeverityMod.IssueSeverity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Issue extends js.Object {
  var code: String = js.native
  var file: js.UndefOr[String] = js.native
  var location: js.UndefOr[IssueLocation] = js.native
  var message: String = js.native
  var origin: String = js.native
  var severity: IssueSeverity = js.native
}

object Issue {
  @scala.inline
  def apply(code: String, message: String, origin: String, severity: IssueSeverity): Issue = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Issue]
  }
  @scala.inline
  implicit class IssueOps[Self <: Issue] (val x: Self) extends AnyVal {
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
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrigin(value: String): Self = this.set("origin", value.asInstanceOf[js.Any])
    @scala.inline
    def setSeverity(value: IssueSeverity): Self = this.set("severity", value.asInstanceOf[js.Any])
    @scala.inline
    def setFile(value: String): Self = this.set("file", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFile: Self = this.set("file", js.undefined)
    @scala.inline
    def setLocation(value: IssueLocation): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
  }
  
}

