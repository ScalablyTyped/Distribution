package typings.gapiClientClouderrorreporting.gapi.client.clouderrorreporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrackingIssue extends js.Object {
  /**
    * A URL pointing to a related entry in an issue tracking system.
    * Example: https://github.com/user/project/issues/4
    */
  var url: js.UndefOr[String] = js.native
}

object TrackingIssue {
  @scala.inline
  def apply(): TrackingIssue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrackingIssue]
  }
  @scala.inline
  implicit class TrackingIssueOps[Self <: TrackingIssue] (val x: Self) extends AnyVal {
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

